package com.example.contactsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment.Vertical
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contactsapp.ui.theme.ContactsAppTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DefaultPreview()
                }
            }
        }
    }
}

@Composable
fun TabPart() {
    var tabIndex by remember { mutableStateOf(0) }


    Column(modifier = Modifier.fillMaxWidth()) {
        TabRow(selectedTabIndex = tabIndex) {
            Tab(content = { Text("gmail", fontSize = 24.sp) },
                selected = tabIndex == 0,
                onClick = {tabIndex = 0})
            Tab(content = { Text("SIM card", fontSize = 24.sp) },
                selected = tabIndex == 1,
                onClick = {tabIndex = 1})
        }

    }
    when(tabIndex){
        0 -> Gmail()
        1 -> SimCard()
    }
}

@Composable
fun Gmail(){

}

@Composable
fun SimCard(){

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ContactsAppTheme() {
        TabPart();

    }
}