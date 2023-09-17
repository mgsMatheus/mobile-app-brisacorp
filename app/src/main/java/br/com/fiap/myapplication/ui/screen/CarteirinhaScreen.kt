package br.com.fiap.myapplication.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.myapplication.R
import br.com.fiap.myapplication.ui.theme.Green20

@Composable
fun CarteirinhaScreen(navController: NavController) {
    Column {
        Row(modifier = Modifier.height(70.dp).fillMaxWidth()) {
            ReturnBar(navController)
        }
        Spacer(modifier = Modifier)
        Column(modifier = Modifier.fillMaxWidth()) {
            val imageResource: Painter = painterResource(R.drawable.carteirinha)
            Image(modifier = Modifier.fillMaxWidth().fillMaxHeight(), painter = imageResource, contentDescription = "Carteirinha do usuário")
        }
    }

}