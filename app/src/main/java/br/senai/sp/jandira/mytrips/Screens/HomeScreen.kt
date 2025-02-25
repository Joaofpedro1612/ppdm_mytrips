package br.senai.sp.jandira.mytrips.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White,
            )

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
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ){Column(
            modifier = Modifier
                .padding(start = 40.dp,
                    top = 40.dp) ){

            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = {
                    Text(text = "Digite seu nome")

                }

            )

            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = {
                    Text(text = "Digite seu nome")

                }
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