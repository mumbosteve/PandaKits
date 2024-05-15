package com.example.firebasestorage.ui.theme.screens.products

import com.example.firebasestorage.data.ProductViewModel
import android.content.Context
import android.net.Uri
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.navigation.ROUT_SIGNUP
import com.example.firebasestorage.ui.theme.screens.login.LoginScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddProductsScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Spacer(modifier = Modifier.height(10.dp))

        androidx.compose.material3.Text(
            text = "PandaKits",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )

        androidx.compose.material3.Text(
            text = "Get a Kit that Fits",
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Add Products To Shop",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )

        var productName by remember { mutableStateOf("") }
        var productQuantity by remember { mutableStateOf("") }
        var productPrice by remember { mutableStateOf("") }
        val context = LocalContext.current

        Spacer(modifier = Modifier.height(0.dp))

        OutlinedTextField(
            value = productName,
            onValueChange = { productName = it },
            label = { Text(text = "Product Name") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = productQuantity,
            onValueChange = { productQuantity = it },
            label = { Text(text = "Your Phone Number") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = productPrice,
            onValueChange = { productPrice = it },
            label = { Text(text = "Product Price") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(20.dp))



        //---------------------IMAGE PICKER START-----------------------------------//

        var modifier = Modifier
        ImagePicker(modifier,context, navController, productName.trim(), productQuantity.trim(), productPrice.trim())

        //---------------------IMAGE PICKER END-----------------------------------//



    }
}

@Composable
fun ImagePicker(modifier: Modifier = Modifier, context: Context,navController: NavHostController, name:String, quantity:String, price:String) {
    var hasImage by remember { mutableStateOf(false) }
    var imageUri by remember { mutableStateOf<Uri?>(null) }

    val imagePicker = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent(),
        onResult = { uri ->
            hasImage = uri != null
            imageUri = uri
        }
    )

    Column(modifier = modifier,) {
        if (hasImage && imageUri != null) {
            val bitmap = MediaStore.Images.Media.
            getBitmap(context.contentResolver,imageUri)
            Image(bitmap = bitmap.asImageBitmap(), contentDescription = "Selected image")
        }


        //sssssssssssssssssssssssss

        OutlinedButton(onClick = {
            imagePicker.launch("image/*")
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, end =  50.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Black)

        ) {
            Text(text = "Select Image",
                color = Color.Black,
                fontSize = 17.sp
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedButton(onClick = {

            //-----------WRITE THE UPLOAD LOGIC HERE---------------//
            var productRepository = ProductViewModel(navController,context)
            productRepository.uploadProduct(name, quantity, price,imageUri!!)

        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, end = 50.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Black)

        ) {
            Text(text = "Upload",
                color = Color.Black,
                fontSize = 17.sp
            )
        }

    }
}

@Composable
@Preview(showBackground = true)
fun AddProductsScreenPreview(){
    AddProductsScreen(rememberNavController())
}