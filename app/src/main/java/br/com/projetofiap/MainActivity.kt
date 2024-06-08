package br.com.projetofiap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.com.projetofiap.composables.Layout
import br.com.projetofiap.ui.theme.ProjetoFIAPTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            ProjetoFIAPTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Layout()
                }
            }
        }
    }
}








