package com.j4kerstudio.examcloud.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.examcloud.R
import com.j4kerstudio.examcloud.ui.theme.Typography

@Composable
fun GoogleButton() {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(15.dp),
        colors = ButtonColors(
            containerColor = Color(0xFFFFFFFF),
            contentColor = Color(0xFFFFFFFF),
            disabledContentColor = Color(0xFFFFFFFF),
            disabledContainerColor = Color(0xFF1B1A55)),
        modifier = Modifier
            .width(300.dp)
            .height(60.dp)
            .background(Color.White, shape = RoundedCornerShape(20.dp))
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.google),
            contentDescription = null,
            tint = Color.Unspecified
        )
        Spacer(modifier = Modifier.width(30.dp))
        Text(
            text = stringResource(id = R.string.google),
            style = Typography.bodyMedium
        )
    }
}
