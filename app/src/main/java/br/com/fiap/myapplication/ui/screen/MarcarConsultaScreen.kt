package br.com.fiap.myapplication.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.myapplication.ui.theme.Green20
import br.com.fiap.myapplication.ui.theme.Grey20
import br.com.fiap.myapplication.ui.theme.Grey40

@Composable
fun MarcarConsultaScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxWidth()) {
        ReturnBar(navController)
        Spacer(modifier = Modifier.height(20.dp))
        LabelOptions("Estado", "Escolha o Estado")
        LabelOptions("Especialidade", "Escolha a Especialidade")
        LabelOptions("Região", "Escolha a Região")
        LabelOptions("Unidade", "Escolha a Unidade")
        LabelOptions("Procedimento", "Escolha o Procedimento")
        LabelOptions("Profissional", "Todos os profissionais")
        DaysOfWeek()
        Spacer(modifier = Modifier.height(20.dp))
        SearchButton()
    }
}
@Composable
fun SearchButton(){
    Button(
        onClick = { /* Ação ao clicar no botão */ },
        modifier = Modifier
            .fillMaxWidth() // Ocupa toda a largura disponível
            .height(60.dp)
            .padding(horizontal = 10.dp)
        , // Altura do botão
                    contentPadding = PaddingValues(16.dp), // Espaçamento interno
        colors = ButtonDefaults.buttonColors(contentColor = Green20), shape = RectangleShape, // Cor de fundo
        content = {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Busca",
                    color = androidx.compose.ui.graphics.Color.White
                )
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Ícone de busca",
                    tint = androidx.compose.ui.graphics.Color.White
                )
            }
        }
    )
}

@Composable
fun DaysOfWeek() {
    val contentList = listOf(
        "D", "S", "T", "Q", "Q", "S", "S"
    )
    Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)) {
        Text("Dias da semana", fontWeight = FontWeight.ExtraBold, fontSize = 18.sp)
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            repeat(7) { index ->
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .weight(1f)
                        .background(Green20)
                        .height(50.dp)
                        .border(width = .5.dp, shape = RectangleShape, color = androidx.compose.ui.graphics.Color.White),
                ) {
                    Text(
                        text = contentList[index],
                        color = androidx.compose.ui.graphics.Color.White,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}
@Composable
fun ReturnBar(navController: NavController) {
    Button(
        onClick = {navController.navigate("dashboard") },
        modifier = Modifier
            .fillMaxWidth() // Ocupa toda a largura disponível
            .height(45.dp)
        , // Altura do botão
        contentPadding = PaddingValues(8.dp), // Espaçamento interno
        colors = ButtonDefaults.buttonColors(contentColor = Green20), shape = RectangleShape, // Cor de fundo
        content = {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = "Ícone de busca",
                    tint = androidx.compose.ui.graphics.Color.White
                )
                Text(
                    text = "Marcar Consulta",
                    color = androidx.compose.ui.graphics.Color.White
                )

            }
        }
    )

//        Row(verticalAlignment = Alignment.CenterVertically,modifier = Modifier.fillMaxWidth().height(40.dp).padding(1.dp).border(width = 1.dp , shape = RectangleShape, color = Grey20)){
//            Icon(imageVector = Icons.Default.ArrowBack,
//                contentDescription = "Seta de retorno",
//                modifier = Modifier.size(20.dp))
//            Text("Marcar Consulta")
//        }
    }

@Composable
fun LabelOptions(title: String, obs: String){
    Column(modifier = Modifier.height(70.dp).fillMaxWidth().padding(horizontal = 10.dp)
    ) {
        Text(title, fontWeight = FontWeight.Bold)
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(obs, color = Grey20, fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f))
            Icon(imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Seta de retorno",
                modifier = Modifier.size(20.dp))
        }
        Divider(
            color = androidx.compose.ui.graphics.Color.Black,
            thickness = 1.dp,
            modifier = Modifier
                .fillMaxWidth()
                )

    }
}