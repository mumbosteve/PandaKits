package com.example.firebasestorage.ui.theme.screens.about

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_HOME

@Composable
fun about(navController: NavHostController){

    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current


        TopAppBar(title = { Text(text = "PandaKits", color = Color.White, fontFamily = FontFamily.Cursive, fontSize = 30.sp)  },
            backgroundColor = Color.Black,            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(ROUT_HOME)
                }) {
                    Icon(
                        imageVector = Icons.Default.ExitToApp,
                        contentDescription = "",
                        tint = Color.White,
                    )
                }
            }
        )

        Text(text = "Revolutionizing Sports Merchandise: PandaKits Mobile E-commerce App",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 10.dp, start = 50.dp, end = 30.dp, bottom = 20.dp),
            fontWeight = FontWeight.Bold
        )

        Text(text = "In the age of digital transformation, e-commerce platforms have revolutionized the way we shop. With the convenience of mobile apps, consumers now have access to a myriad of products at their fingertips. One such innovative platform, Panda, has emerged as a game-changer in the realm of sports merchandise. Specializing in sports jerseys, Panda offers fans a seamless shopping experience, coupled with a diverse range of products and personalized services.",
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding( start = 25.dp, end = 25.dp, bottom = 28.dp),
        )

        Text(text = "Panda's success lies in its commitment to delivering exceptional customer experiences. Through its intuitive mobile app interface, users can effortlessly navigate through a vast catalog of sports jerseys from various leagues, teams, and players. Whether you're a die-hard football fanatic or a basketball aficionado, Panda caters to diverse sporting preferences, ensuring that every fan finds their perfect match.\n" +
                "\n",
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding( start = 25.dp, end = 25.dp, bottom = 0.dp),
        )

        Text(text = "The MTUSH feature allows the users to buy and sell jerseys form each other.It is a simple user to user interaction.You can upload the jersey that you wish to sell and you can view the jerseys that other people have uploaded.From there you can contact the user whose selling the jersey you wish to buy.And ita all simple and transparent.",
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding( start = 25.dp, end = 25.dp, bottom = 28.dp),
        )

        Text(text = "Try it yourself and get yourself a Kit that Fits.",
            fontSize = 19.sp,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding( start = 25.dp, end = 25.dp, bottom = 28.dp),
        )

        Spacer(modifier = Modifier.height(40.dp))

        Row(modifier = Modifier.padding(start = 50.dp)) {

            Image(painter = painterResource(id = R.drawable.zzz),
                contentDescription = "a cat",
                modifier = Modifier.size(60.dp)
                    .clip(shape = CircleShape)
                    .clickable {

                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("stevemumbo3@gmail.com"))//to the person being contacted
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "AIR OUT YOUR OPINIONS ")
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                        mContext.startActivity(shareIntent)

                        Toast.makeText(mContext,"EMAIL US", Toast.LENGTH_SHORT).show()},
                contentScale = ContentScale.Crop

            )
            Spacer(modifier = Modifier.width(30.dp))
            Image(painter = painterResource(id = R.drawable.sms),
                contentDescription = "a cat",
                modifier = Modifier.size(45.dp)
                    .clip(shape = CircleShape)
                    .clickable {

                        val smsIntent=Intent(Intent.ACTION_SENDTO)
                        smsIntent.data="smsto:0758382595".toUri()
                        smsIntent.putExtra("sms_body","Hello PandaKits,how was your day?")
                        mContext.startActivity(smsIntent)

                        Toast.makeText(mContext,"MESSAGE US", Toast.LENGTH_SHORT).show()},
                contentScale = ContentScale.Crop

            )
            Spacer(modifier = Modifier.width(30.dp))
            Image(painter = painterResource(id = R.drawable.phone),
                contentDescription = "a cat",
                modifier = Modifier.size(50.dp)
                    .clip(shape = CircleShape)
                    .clickable {

                        val callIntent=Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0758382595".toUri()
                        mContext.startActivity(callIntent)

                        Toast.makeText(mContext,"CALL US", Toast.LENGTH_SHORT).show()},
                contentScale = ContentScale.Crop

            )
            Spacer(modifier = Modifier.width(30.dp))
            Image(painter = painterResource(id = R.drawable.fb),
                contentDescription = "a cat",
                modifier = Modifier.size(40.dp)
                    .clip(shape = CircleShape)
                    .clickable {

                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("stevemumbo3@gmail.com"))//to the person being contacted
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "AIR OUT YOUR OPINIONS ")
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                        mContext.startActivity(shareIntent)
                        Toast.makeText(mContext,"CHECK OUR SOCIALS", Toast.LENGTH_SHORT).show()},
                contentScale = ContentScale.Crop

            )
            Spacer(modifier = Modifier.width(30.dp))



        }

        Spacer(modifier = Modifier.height(10.dp))


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
}

@Preview(showBackground = true)
@Composable
fun aboutPreview(){
    about(rememberNavController())
}