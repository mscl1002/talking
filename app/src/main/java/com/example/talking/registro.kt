package com.example.talking

import android.graphics.Outline
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Registro(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ){

        Text(text = "TALKING FOOD", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "NOMBRES")
        })
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "APELLIDOS")
        })
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "EDAD")
        })
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "FECHA DE NACIMIENTO")
        })
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "CORREO")
        })
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "CONTRASEÑA")
        })

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {  }, colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFBD931B)
        )
        ) {
            Text(text = "Registrarse")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "¿Olvidaste tu contraseña?", modifier = Modifier.clickable {

        })


    }


}