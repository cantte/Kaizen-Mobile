package com.kaizen.models

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("usernameOrEmail") val usernameOrEmail: String,
    @SerializedName("password") val password: String
)