package com.example.conflictos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.conflictos.ui.theme.ConflictosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConflictosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Fondo verde fuera de la card
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF4CAF50)) // Color verde Android
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        // Card blanca (Responsive)
        Card(
            modifier = Modifier
                .fillMaxWidth(0.8f) // Ocupa el 80% del ancho de la pantalla
                .padding(16.dp), // Padding interno de la tarjeta para dejar espacio
            colors = CardDefaults.cardColors(
                containerColor = Color.White // Fondo blanco para la card
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth() // Asegura que el contenido use todo el ancho de la tarjeta
                    .padding(vertical = 20.dp), // Añade espacio vertical al contenido
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "FULANO",
                    fontSize = 36.sp, // Tamaño grande
                    fontWeight = FontWeight.Bold, // Negrita
                    color = Color.Black // Color oscuro
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ConflictosTheme {
        Greeting("Android")
    }
}
