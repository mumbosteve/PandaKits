package com.example.firebasestorage.ui.theme.screens.home

import android.app.Activity
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R

import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import com.example.firebasestorage.data.AuthViewModel
import com.example.firebasestorage.navigation.ROUT_ABOUT
import com.example.firebasestorage.navigation.ROUT_HOME
import com.example.firebasestorage.navigation.ROUT_SHOP
import com.example.firebasestorage.navigation.ROUT_UPLOAD


@Composable
fun homescreen(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentAlignment = Alignment.BottomStart
        ){
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription ="" ,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Text(text = "Get A Kit That Fits",
                fontSize = 13.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 20.dp,bottom = 20.dp)

            )
            Text(text = "PandaKits",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding( start = 20.dp,top = 20.dp,bottom = 40.dp)

            )

        }

        Card (modifier = Modifier
            .width(500.dp)
            .height(300.dp)
            .padding(40.dp)
            .clickable {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
            },
            elevation = 20.dp,



            ){

            Row {
                Column {
                    Text(text = "50% off",
                        fontSize = 27.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding( start = 20.dp,top = 20.dp,bottom = 10.dp)

                    )

                    Text(text = "Get Real Madrid",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Black,
                        modifier = Modifier.padding( start = 10.dp,bottom = 3.dp)

                    )

                    Text(text = "Away Kit",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Black,
                        modifier = Modifier.padding( start = 10.dp,bottom = 10.dp)

                    )

                    Text(text = "Ksh 500",
                        fontSize = 27.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding( start = 20.dp,top = 20.dp,bottom = 10.dp)

                    )
                }

                Image(
                    painter = painterResource(id = R.drawable.img_1),
                    contentDescription ="" ,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

        }

        //Row1
        Row (modifier = Modifier.padding(start = 30.dp)){
            Column {
                Card (modifier = Modifier.size(width = 150.dp, height = 60.dp), elevation = 20.dp){
                    Box(modifier = Modifier.fillMaxSize()
                        .clickable {  navController.navigate(ROUT_SHOP)
                            Toast.makeText(mContext,"SHOP",Toast.LENGTH_SHORT).show()}
                        ,
                        contentAlignment = Alignment.Center
                    ) {
                        Row {



                            Text(text = "SHOP",
                                fontSize = 16.sp)

                        }
                    }
                }



            }
            Spacer(modifier = Modifier.width(30.dp))
            Column {
                Card (modifier = Modifier.size(width = 150.dp, height = 60.dp), elevation = 20.dp){
                    Box(modifier = Modifier.fillMaxSize()
                        .clickable {  navController.navigate(ROUT_ABOUT)
                            Toast.makeText(mContext,"ABOUT PAGE",Toast.LENGTH_SHORT).show()}
                        ,
                        contentAlignment = Alignment.Center
                    ) {
                        Row {



                            Text(text = "ABOUT",
                                fontSize = 16.sp)

                        }
                    }
                }

            }



        }

        Spacer(modifier = Modifier.height(15.dp))

        //Row1
        Row (modifier = Modifier.padding(start = 30.dp)){
            Column {
                Card (modifier = Modifier.size(width = 150.dp, height = 60.dp), elevation = 20.dp){
                    Box(modifier = Modifier.fillMaxSize()
                        .clickable { navController.navigate(ROUT_UPLOAD)
                            Toast.makeText(mContext,"MTUSH SHOP",Toast.LENGTH_SHORT).show()                                        },

                        contentAlignment = Alignment.Center
                    ) {
                        Row {


                            Text(text = "MTUSH",
                                fontSize = 16.sp)

                        }
                    }
                }



            }
            Spacer(modifier = Modifier.width(30.dp))

            val context = LocalContext.current
            val authViewModel = AuthViewModel(navController, context)

            Column {
                Card (modifier = Modifier.size(width = 150.dp, height = 60.dp), elevation = 20.dp){
                    Box(modifier = Modifier.fillMaxSize()
                        .clickable {       authViewModel.logout()
                            Toast.makeText(mContext,"LOGGED OUT",Toast.LENGTH_SHORT).show()}
                        ,
                        contentAlignment = Alignment.Center
                    ) {
                        Row {


                            Text(text = "LOG OUT",
                                fontSize = 16.sp)

                        }
                    }
                }

            }
        }


        Spacer(modifier = Modifier.height(80.dp))


        Text(text = "PandaKits",
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 30.dp)

        )
        Text(text = "Get A Kit That Fits",
            fontSize = 10.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 30.dp))

    }

    @Composable
    fun CloseAppOnClick() {
        var shouldCloseApp by remember { mutableStateOf(false) }
        val context = LocalContext.current

        if (shouldCloseApp) {
            BackHandler {
                // Close the app
                (context as? Activity)?.finish()
            }
        }

    }}

@Preview(showBackground = true)
@Composable
fun homescreenPreview(){
    homescreen(rememberNavController())
}
