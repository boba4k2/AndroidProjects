package com.example.mobprojects

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobprojects.ui.theme.MobProjectsTheme
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobProjectsTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val context = LocalContext.current
    val textState1 = remember { mutableStateOf("") }
    val textState2 = remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFAEEFD)
    ){}
    Box(modifier = Modifier.fillMaxWidth()){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Black)
                .align(Alignment.TopStart)
        )
        Text(
            text = "MobProject",
            Modifier
                .align(Alignment.CenterStart),
            color = Color.White,
            fontSize = 20.sp
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        Text(text = "You are on Activity1")
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = textState1.value,
            onValueChange = { textState1.value = it },
            label = { Text("Login") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = textState2.value,
            onValueChange = { textState2.value = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            val inLogin = textState1.value
            val inPassword = textState2.value
            val intent = Intent(context, SecondActivity::class.java).apply {
                putExtra("input_text", inLogin)
            }
            if ((inLogin == "123") and (inPassword == "123")){
                context.startActivity(intent)
            }

        }) {
            Text(text = "Go to SecondActivity")
        }
    }
}