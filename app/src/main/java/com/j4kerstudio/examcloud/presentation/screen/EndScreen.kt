package com.j4kerstudio.examcloud.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.examcloud.R
import com.j4kerstudio.examcloud.ui.theme.Primary
import com.j4kerstudio.examcloud.ui.theme.Typography

@Composable
fun EndScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF0F0F0))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(8f)
        ) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = null)
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(10.dp))
                    .width(366.dp)
                    .height(70.dp)
            ) {
                Text(
                    text = "Thank you for your answers",
                    style = Typography.bodyLarge,
                    minLines = 2,
                    modifier = Modifier.padding(20.dp)
                )
            }
        }
        Column(
            modifier = Modifier.weight(2f)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(15.dp),
                colors = ButtonColors(
                    containerColor = Primary,
                    contentColor = Color(0xFFFFFFFF),
                    disabledContentColor = Color(0xFF3A51FF),
                    disabledContainerColor = Color(0xFF3A51FF)
                ),
                modifier = Modifier
                    .width(300.dp)
                    .height(60.dp)
                    .background(Color.White, shape = RoundedCornerShape(20.dp))
            ) {
                Text(
                    text = "Continue",
                    style = Typography.bodyMedium.copy(color = Color.White)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}
@Preview
@Composable
fun EndScreenPreview() {
    EndScreen()
}
