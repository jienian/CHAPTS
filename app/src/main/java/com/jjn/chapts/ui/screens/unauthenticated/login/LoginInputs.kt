package com.jjn.chapts.ui.screens.unauthenticated.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import com.jjn.chapts.ui.common.customComposableViews.EmailTextField
import com.jjn.chapts.ui.common.customComposableViews.NormalButton
import com.jjn.chapts.ui.common.customComposableViews.PasswordTextField
import com.jjn.chapts.ui.screens.unauthenticated.login.state.LoginState
import com.jjn.chapts.ui.theme.AppTheme
import com.jodhpurtechies.composelogin.R

@Composable
fun LoginInputs(
    loginState: LoginState,
    onEmailOrMobileChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onSubmit: () -> Unit,
    onForgotPasswordClick: () -> Unit
) {

    Column(modifier = Modifier.fillMaxWidth()) {

        // Email or Mobile Number
        EmailTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = AppTheme.dimens.paddingLarge),
            value = loginState.emailOrMobile,
            onValueChange = onEmailOrMobileChange,
            label = stringResource(id = R.string.login_email_id_or_phone_label),
            isError = loginState.errorState.emailOrMobileErrorState.hasError,
            errorText = stringResource(id = loginState.errorState.emailOrMobileErrorState.errorMessageStringResource)
        )


        // Password
        PasswordTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = AppTheme.dimens.paddingLarge),
            value = loginState.password,
            onValueChange = onPasswordChange,
            label = stringResource(id = R.string.login_password_label),
            isError = loginState.errorState.passwordErrorState.hasError,
            errorText = stringResource(id = loginState.errorState.passwordErrorState.errorMessageStringResource),
            imeAction = ImeAction.Done
        )

        // Forgot Password
        Text(
            modifier = Modifier
                .padding(top = AppTheme.dimens.paddingSmall)
                .align(alignment = Alignment.End)
                .clickable {
                    onForgotPasswordClick.invoke()
                },
            text = stringResource(id = R.string.forgot_password),
            color = MaterialTheme.colorScheme.secondary,
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.bodyMedium
        )

        // Login Submit bt
        NormalButton(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(top = AppTheme.dimens.paddingLarge),
            text = stringResource(id = R.string.login_button_text),
            onClick = onSubmit
        )

    }
}