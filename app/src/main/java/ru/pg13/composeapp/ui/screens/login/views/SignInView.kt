package ru.pg13.composeapp.ui.screens.login.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ru.pg13.composeapp.R
import ru.pg13.composeapp.ui.components.DTextView
import ru.pg13.composeapp.ui.screens.login.models.LoginViewState

@Composable
fun SignInView(
    viewState: LoginViewState,
    onTextFieldChange: (String) -> Unit
) {
    Column {
        DTextView(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            value = viewState.emailValue,
            placeholder = stringResource(id = R.string.email_hint),
            onValueChange = onTextFieldChange
        )
    }
}