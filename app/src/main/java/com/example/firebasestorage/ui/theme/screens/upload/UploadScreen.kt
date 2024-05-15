package com.example.firebasestorage.ui.theme.screens.upload

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.data.UploadViewModel
import com.example.firebasestorage.navigation.ROUT_ADD
import com.example.firebasestorage.navigation.ROUT_SIGNUP
import com.example.firebasestorage.navigation.ROUT_VIEW
import com.google.firebase.auth.FirebaseAuth

@Composable
fun UploadScreen(navController:NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

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
        Spacer(modifier = Modifier.height(30.dp))

        //sssssssssssssssssssssssss

        OutlinedButton(onClick = {
            navController.navigate(ROUT_VIEW)
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, end =  40.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Black)

        ) {
            androidx.compose.material3.Text(text = "SHOP",
                color = Color.Black,
                fontSize = 17.sp
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        OutlinedButton(onClick = {
            navController.navigate(ROUT_ADD)
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, end = 40.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(1.dp, Color.Black)

        ) {
            androidx.compose.material3.Text(text = "UPLOAD",
                color = Color.Black,
                fontSize = 17.sp
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun UploadScreenPreview() {
    UploadScreen(rememberNavController())
}