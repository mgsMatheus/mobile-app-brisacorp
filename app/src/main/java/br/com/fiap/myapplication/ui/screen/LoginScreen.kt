@file:OptIn(ExperimentalMaterial3Api::class)

package br.com.fiap.myapplication.ui.screen

import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.fiap.myapplication.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LoginScreen() {

    var email by remember() {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }
    Box() {
        Column(modifier = Modifier.padding(top = 80.dp)) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logotechmed),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(170.dp)
                        .padding(top = 16.dp)
                )
            }
            Spacer(modifier = Modifier.padding(16.dp))
            var erroEmail by remember {
                mutableStateOf(false)
            }

            val tamanhoMaximo = 8

            Spacer(modifier = Modifier.height(48.dp))
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(32.dp)
                ) {

                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "email")
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        isError = erroEmail
                    )
                    if (erroEmail) {
                        Text(
                            text = "O e-mail é obrigatório!",
                            modifier = Modifier.fillMaxWidth(),
                            fontSize = 14.sp,
                            color = Color.Red,
                            textAlign = TextAlign.End
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedTextField(
                        value = password,
                        onValueChange = {
                            if (it.length <= tamanhoMaximo) password = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Senha")
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        visualTransformation = PasswordVisualTransformation()
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    Button(
                        onClick = {
                            if (email.isEmpty()) {
                                erroEmail = true
                            }
                            erroEmail = false

                        }) {
                        Text(
                            text = "ENTRAR",
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

    }
}
