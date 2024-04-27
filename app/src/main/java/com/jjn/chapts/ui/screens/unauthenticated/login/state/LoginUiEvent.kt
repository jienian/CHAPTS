package com.jjn.chapts.ui.screens.unauthenticated.login.state

/**
 * 登录屏幕事件
 */
sealed class LoginUiEvent {
    data class EmailOrMobileChanged(val inputValue: String) : LoginUiEvent()
    data class PasswordChanged(val inputValue: String) : LoginUiEvent()
    object Submit : LoginUiEvent()
}