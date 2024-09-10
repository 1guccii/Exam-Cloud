package com.j4kerstudio.examcloud.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.j4kerstudio.examcloud.ui.theme.Background
import com.j4kerstudio.examcloud.ui.theme.Primary
import com.j4kerstudio.examcloud.ui.theme.Typography

@Composable
fun IntroScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(8f)
                .fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = null)
            Spacer(modifier = Modifier.weight(1f))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(15.dp))
                    .width(366.dp)
                    .height(92.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.introduction),
                    style = Typography.bodyLarge,
                    minLines = 2,
                    modifier = Modifier.padding(20.dp)
                )
            }
            Spacer(modifier = Modifier.weight(3f))
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(15.dp),
                colors = ButtonColors(
                    containerColor = Primary,
                    contentColor = Color(0xFFFFFFFF),
                    disabledContentColor = Color(0x3A51FF),
                    disabledContainerColor = Color(0x3A51FF)
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
fun IntroScreenPreview() {
    IntroScreen()
}
