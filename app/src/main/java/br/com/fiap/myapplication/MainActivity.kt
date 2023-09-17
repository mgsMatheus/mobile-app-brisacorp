package br.com.fiap.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.myapplication.ui.screen.CarteirinhaScreen
import br.com.fiap.myapplication.ui.screen.DashboardScreen
import br.com.fiap.myapplication.ui.screen.LoginScreen
import br.com.fiap.myapplication.ui.screen.MarcarConsultaScreen
import br.com.fiap.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "login") {
                        composable(route = "login") { LoginScreen(navController)}
                        composable(route = "dashboard") { DashboardScreen() }
                        composable(route = "marcarConsulta") { MarcarConsultaScreen()}
                        composable(route= "carteirinha") { CarteirinhaScreen()}
                    }
                }
            }
        }
    }
}

