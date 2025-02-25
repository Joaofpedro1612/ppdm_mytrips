package br.senai.sp.jandira.mytrips.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White,
            ),
        contentAlignment = Alignment.Center

    ){
        Card(
            colors = CardDefaults.cardColors(
                    Color(color = 0xffc1121f)
            ),
            modifier = Modifier
                .align(Alignment.TopEnd)
            .width(100.dp)
            .height(40.dp),

            shape = RoundedCornerShape(
                bottomStart = 8.dp
            )
        ) {

        }

        Card(
            colors = CardDefaults.cardColors(
                Color(color = 0xffc1121f)
            ),
            modifier = Modifier
                .align(Alignment.BottomStart)
                .width(100.dp)
                .height(40.dp),

            shape = RoundedCornerShape(
                topEnd = 8.dp,
            )

        ) {

        }
        Column (modifier = Modifier

            .fillMaxWidth()
            .height(470.dp),
            horizontalAlignment = Alignment.CenterHorizontally,


        ){


            Text(
                text = stringResource(R.string.login),
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                color = Color(color = 0xffc1121f),
                modifier = Modifier
                    .padding( end = 240.dp)

            )

            Text(
                text = stringResource(R.string.Bellow_login),
                fontSize = 13.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(bottom = 100.dp, end = 200.dp)
            )

            OutlinedTextField(
                modifier = Modifier
                    .padding(bottom = 15.dp)
                    .width(350.dp),
                shape = RoundedCornerShape(10.dp),
                value = "",
                onValueChange = { },
                label = {
                    Text(text = "Digite seu Email")
                },

            )

            OutlinedTextField(
                modifier = Modifier
                    .padding(bottom = 15.dp)
                    .width(350.dp),
                shape = RoundedCornerShape(10.dp),
                value = "",
                onValueChange = { },
                label = {
                    Text(text = "Digite sua senha")
                }
            )

                Button(onClick = {},
                    modifier = Modifier
                        .padding(start = 240.dp),
                    colors = ButtonDefaults.buttonColors(
                        Color( color =  0xffc1121f)),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = stringResource(R.string.Sign_in))
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = ""
                    )
                }
            Row (modifier = Modifier
                .align(Alignment.End)

            ){
                Text(
                    text = stringResource(R.string.Bellow_lines),
                    fontSize = 13.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 50.dp)
                )
                Text(
                    text = stringResource(R.string.Sign_up),
                    fontSize = 13.sp,
                    color = Color(color = 0xffc1121f),
                    modifier = Modifier
                        .padding(top = 50.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = false)
@Composable
private fun HomeScreenPreview() {

    HomeScreen()
}