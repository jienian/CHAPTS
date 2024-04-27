package com.jjn.chapts.ui.screens.unauthenticated.login.state

import com.jjn.chapts.ui.common.state.ErrorState

/**
 * 登录状态保存ui输入值
 *
 */
data class LoginState(
    val emailOrMobile: String = "",
    val password: String = "",
    val errorState: LoginErrorState = LoginErrorState(),
    val isLoginSuccessful: Boolean = false
)

/**
 * 错误状态登录持有各自
 * 文本字段验证错误
 *
 */
data class LoginErrorState(
    val emailOrMobileErrorState: ErrorState = ErrorState(),
    val passwordErrorState: ErrorState = ErrorState()
)

