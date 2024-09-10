package com.j4kerstudio.examcloud.untils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp

@Composable
fun TermsAndPrivacyText(
    onTermsClick: () -> Unit,
    onPrivacyClick: () -> Unit,
    color: Color = Color.Gray
) {
    val annotatedText = buildAnnotatedString {
        append("By signing in you accept our\n") // Xuống dòng ở đây

        pushStringAnnotation(tag = "terms", annotation = "terms")
        withStyle(style = SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)) {
            append("Terms of use")
        }
        pop()

        append(" and ")

        pushStringAnnotation(tag = "privacy", annotation = "privacy")
        withStyle(style = SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)) {
            append("Privacy policy")
        }
        pop()
    }

    // Sử dụng Column để căn chỉnh và xuống dòng
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), // Khoảng cách padding cho đẹp hơn
        horizontalAlignment = Alignment.CenterHorizontally // Căn chỉnh ở giữa
    ) {
        ClickableText(
            text = annotatedText,
            style = TextStyle(
                color = color,
                textAlign = TextAlign.Center // Căn giữa văn bản
            ),
            onClick = { offset ->
                annotatedText.getStringAnnotations(tag = "terms", start = offset, end = offset)
                    .firstOrNull()?.let {
                        onTermsClick() // Xử lý khi nhấn vào "Terms of use"
                    }

                annotatedText.getStringAnnotations(tag = "privacy", start = offset, end = offset)
                    .firstOrNull()?.let {
                        onPrivacyClick() // Xử lý khi nhấn vào "Privacy policy"
                    }
            }
        )
    }
}
