package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.background(color = Color(0xff003a4a))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(5.dp),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "header image",
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
            )
            
            Text(
                text = "Agus Adi Pranata",
                fontSize = 35.sp,
                color = Color.White
            )
            
            Text(
                text = "Mobile Engineer",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3ddc84)
            )
        }
        
        Column(
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {

                Icon(
                    Icons.Rounded.Phone,
                    contentDescription = "phone",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp),
                    tint = Color(0xFF3ddc84)
                )
                
                Spacer(modifier = Modifier.width(30.dp))

                Text(
                    text = "+62 11223334444",
                    color = Color.White
                )
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {

                Icon(
                    Icons.Rounded.Share,
                    contentDescription = "username",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp),
                    tint = Color(0xFF3ddc84)
                )

                Spacer(modifier = Modifier.width(30.dp))

                Text(
                    text = "@gusadiprntaa",
                    color = Color.White
                )
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {

                Icon(
                    Icons.Rounded.Email,
                    contentDescription = "Email",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp),
                    tint = Color(0xFF3ddc84)
                )

                Spacer(modifier = Modifier.width(30.dp))

                Text(
                    text = "gusadx1@gmail.com",
                    color = Color.White
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}