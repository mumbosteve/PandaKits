package com.example.firebasestorage.ui.theme.screens.shop


import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
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
import com.example.firebasestorage.ui.theme.gold

@Composable
fun shop(navController: NavHostController){

    Column(modifier = Modifier.fillMaxSize()   .verticalScroll(rememberScrollState())) {
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

        Text(text = "Retro",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp,top = 20.dp,),
            fontFamily = FontFamily.SansSerif)

Row (modifier = Modifier
    .horizontalScroll(rememberScrollState())
    .padding(start = 20.dp)){

    // column 1

    Column {
        androidx.compose.material3.Card(
            modifier = Modifier
                .height(170.dp)
                .width(180.dp),
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.r1),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
        }
        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Man U",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
        )
        Spacer(modifier = Modifier.height(5.dp))

        Row {
            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Ksh 600",
            fontSize = 12.sp,
            fontFamily = FontFamily.Serif,
        )

        androidx.compose.material3.OutlinedButton(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }) {
            Text(
                text = "BUY",
                fontWeight = FontWeight.Bold
            )
        }
    }

    // column 1

    Column {
        androidx.compose.material3.Card(
            modifier = Modifier
                .height(170.dp)
                .width(180.dp),
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.r2),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
        }
        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "AC Milan",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
        )
        Spacer(modifier = Modifier.height(5.dp))

        Row {
            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Ksh 600",
            fontSize = 12.sp,
            fontFamily = FontFamily.Serif,
        )

        androidx.compose.material3.OutlinedButton(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }) {
            Text(
                text = "BUY",
                fontWeight = FontWeight.Bold
            )
        }
    }

    // column 1

    Column {
        androidx.compose.material3.Card(
            modifier = Modifier
                .height(170.dp)
                .width(180.dp),
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.r3),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
        }
        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Bayern Munich",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
        )
        Spacer(modifier = Modifier.height(5.dp))

        Row {
            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Ksh 600",
            fontSize = 12.sp,
            fontFamily = FontFamily.Serif,
        )

        androidx.compose.material3.OutlinedButton(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }) {
            Text(
                text = "BUY",
                fontWeight = FontWeight.Bold
            )
        }
    }

    // column 1

    Column {
        androidx.compose.material3.Card(
            modifier = Modifier
                .height(170.dp)
                .width(180.dp),
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.r4),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
        }
        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "AC Milan",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
        )
        Spacer(modifier = Modifier.height(5.dp))

        Row {
            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Ksh 600",
            fontSize = 12.sp,
            fontFamily = FontFamily.Serif,
        )

        androidx.compose.material3.OutlinedButton(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }) {
            Text(
                text = "BUY",
                fontWeight = FontWeight.Bold
            )
        }
    }

    // column 1

    Column {
        androidx.compose.material3.Card(
            modifier = Modifier
                .height(170.dp)
                .width(180.dp),
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.r5),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
        }
        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "The Netherlands",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
        )
        Spacer(modifier = Modifier.height(5.dp))

        Row {
            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )

            androidx.compose.material3.Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "",
                tint = gold
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Ksh 600",
            fontSize = 12.sp,
            fontFamily = FontFamily.Serif,
        )

        androidx.compose.material3.OutlinedButton(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
        }) {
            Text(
                text = "BUY",
                fontWeight = FontWeight.Bold
            )
        }
    }

}


        Text(text = "UCL",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp,top = 20.dp,),
            fontFamily = FontFamily.SansSerif)

        Row (modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 20.dp)){

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.c1),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "PSG Home",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )


                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.c2),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Bayern Third",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.c3),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Bayern Away",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.c4),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Dortmund Away",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )


                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.c5),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Man City",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {


                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }


        Text(text = "BasketBall",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp,top = 20.dp,),
            fontFamily = FontFamily.SansSerif)

        Row (modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 20.dp)){

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.b1),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Lakers Original",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.b2),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "The Bulls",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )



                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.b3),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Eagles",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.b4),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Lakers White",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {


                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.b5),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Bolton",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )



                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }


        Text(text = "Bundesliga",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp,top = 20.dp,),
            fontFamily = FontFamily.SansSerif)

        Row (modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 20.dp)){

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bl1),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Dortmund",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bl2),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "B.Munich",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bl3),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Monchengladbach",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bl4),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Bayer Never Losen",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bl5),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Wolfsburg",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )



                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }


        Text(text = "AFCON",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp,top = 20.dp,),
            fontFamily = FontFamily.SansSerif)

        Row (modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 20.dp)){

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.af1),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Nigeria",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.af2),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Ghana",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.af3),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Egypt",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )


                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.af4),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Ivory Coast",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )



                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.af5),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Ethiopia",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {


                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }


        Text(text = "Championship",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp,top = 20.dp,),
            fontFamily = FontFamily.SansSerif)

        Row (modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 20.dp)){

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ch1),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Birmingham",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ch2),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Blackburn Rovers",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {


                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ch3),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Charlton",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )


                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ch4),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "QPR",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )



                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ch5),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Leicester 3rd",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }


        Text(text = "EPL",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp,top = 20.dp,),
            fontFamily = FontFamily.SansSerif)

        Row (modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 20.dp)){

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.e1),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Kiburi F.C",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )


                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.e2),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Arsenal Home",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.e3),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Brighton Home",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )


                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.e4),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Arsenal Away",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {


                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.e5),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Crystal Palace",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )



                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }


        Text(text = "La Liga",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp,top = 20.dp,),
            fontFamily = FontFamily.SansSerif)

        Row (modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 20.dp)){

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.l1),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Atletico Home",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.l2),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Barcelona Special",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.l3),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Getafe",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )



                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.l4),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Atletico Madrid",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // column 1

            Column {
                androidx.compose.material3.Card(
                    modifier = Modifier
                        .height(170.dp)
                        .width(180.dp),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.l5),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Real Madrid Third",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Row {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )

                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = gold
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Ksh 600",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                )

                androidx.compose.material3.OutlinedButton(onClick = {
                    val simToolKitLaunchIntent =
                        mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                }) {
                    Text(
                        text = "BUY",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun shopPreview(){
    shop(rememberNavController())
}