package ru.pg13.composeapp.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.pg13.composeapp.App
import ru.pg13.composeapp.ui.theme.AppTheme

@Composable
fun DTextView(
    modifier: Modifier,
    value: String,
    placeholder: String,
    onValueChange: (String) -> Unit
) {
    TextField(
        modifier = modifier,
        value = value,
        placeholder = {
          Text(
              modifier = Modifier.padding(start = 8.dp),
              text = placeholder,
              style = TextStyle(
                  color = AppTheme.colors.primaryTextColor,
                  fontSize = 12.sp
              )
          )
        },
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.textFieldColors(
            textColor = AppTheme.colors.primaryTextColor,
            backgroundColor = AppTheme.colors.secondaryBackground,
            disabledIndicatorColor = AppTheme.colors.primaryBackground,
            errorIndicatorColor = AppTheme.colors.primaryBackground,
            focusedIndicatorColor = AppTheme.colors.primaryBackground,
            unfocusedIndicatorColor = AppTheme.colors.primaryBackground,
        ),
        onValueChange = onValueChange,
    )
}

@Composable
@Preview
fun DTextFieldPreview() {
//    Surface(
//        modifier = Modifier.size(200.dp),
//        color = AppTheme.colors.primaryBackground
//    ) {
//        DTextView(
//            value = "",
//            placeholder = "First Name",
//            onValueChange = {
//
//            }
//        )
//    }
}