package com.j4kerstudio.examcloud.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.j4kerstudio.examcloud.R
import com.j4kerstudio.examcloud.presentation.component.FacebookButton
import com.j4kerstudio.examcloud.presentation.component.GoogleButton
import com.j4kerstudio.examcloud.ui.theme.Background
import com.j4kerstudio.examcloud.untils.TermsAndPrivacyText

@Composable
fun LoginScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Background),
    ) {
        Spacer(modifier = Modifier.weight(2f))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            contentScale = ContentScale.Inside
        )
        Spacer(modifier = Modifier.weight(4.5f))
        GoogleButton()
        Spacer(modifier = Modifier.weight(0.2f))
        FacebookButton()
        Spacer(modifier = Modifier.weight(1f))
        TermsAndPrivacyText(onTermsClick = { /*TODO*/ }, onPrivacyClick = { /*TODO*/ })
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}