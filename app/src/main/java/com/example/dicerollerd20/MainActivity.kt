package com.example.dicerollerd20

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dicerollerd20.ui.theme.DiceRollerD20Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerD20Theme {
                DiceRollerAppD20()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DiceRollerAppD20() {
    DiceWithButtonAndImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center))
}

@Composable
fun DiceWithButtonAndImage (modifier: Modifier = Modifier){
    var result by remember { mutableStateOf(1) }
    val imageResource = when (result){
        1 -> R.drawable._1
        2 -> R.drawable._2
        3 -> R.drawable._3
        4 -> R.drawable._4
        5 -> R.drawable._5
        6 -> R.drawable._6
        7 -> R.drawable._7
        8 -> R.drawable._8
        9 -> R.drawable._9
        10 -> R.drawable._10
        11 -> R.drawable._11
        12 -> R.drawable._12
        13 -> R.drawable._13
        14 -> R.drawable._14
        15 -> R.drawable._15
        16 -> R.drawable._16
        17 -> R.drawable._17
        18 -> R.drawable._18
        19 -> R.drawable._19
        else -> R.drawable._20
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = result.toString()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {result = (1..20).random()}) {
            Text(stringResource(R.string.roll))
        }
    }
}
}