package br.com.fiap.myapplication.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.myapplication.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(modifier = Modifier.background(colorResource(id = R.color.verde_escuro))) {
            Text(text = "Tela Do Menu Principal")
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(id = R.color.cinza))
            ) {
                Scaffold(
                    bottomBar = {
                        BottomAppBar { /* Bottom app bar content */
                            Button(onClick = { /*TODO*/ },
                                shape = RectangleShape,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(60.dp)
                                    .background(Color(0xFF))
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.teste),
                                    contentDescription = "teste",
                                    modifier = Modifier.height(60.dp).width(180.dp),
                                )
                            }

                        }
                    }
                ) {


                }

                /*Row(
                    verticalAlignment = Alignment.Bottom,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color.Green)
                        .height(60.dp)
                ) {

                }*/
            }
        }

    }
}


