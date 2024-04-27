package com.jjn.chapts.ui.screens.unauthenticated.login.state

import com.jjn.chapts.ui.common.state.ErrorState
import com.jodhpurtechies.composelogin.R

val emailOrMobileEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_email_mobile
)

val passwordEmptyErrorState = ErrorState(
    hasError = true,
    errorMessageStringResource = R.string.login_error_msg_empty_password
)