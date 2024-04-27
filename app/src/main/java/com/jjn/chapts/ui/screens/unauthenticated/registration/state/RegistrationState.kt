package com.jjn.chapts.ui.screens.unauthenticated.registration.state

import com.jjn.chapts.ui.common.state.ErrorState

/**
 * 登录屏幕事件登录事件
 */
data class RegistrationState(
    val emailId: String = "",
    val mobileNumber: String = "",
    val password: String = "",
    val confirmPassword: String = "",
    val errorState: RegistrationErrorState = RegistrationErrorState(),
    val isRegistrationSuccessful: Boolean = false
)

/**
 *注册持有各自的错误状态
 *文本字段验证错误
 */
data class RegistrationErrorState(
    val emailIdErrorState: ErrorState = ErrorState(),
    val mobileNumberErrorState: ErrorState = ErrorState(),
    val passwordErrorState: ErrorState = ErrorState(),
    val confirmPasswordErrorState: ErrorState = ErrorState()
)