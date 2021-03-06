package com.kaizen.model.applicationuser

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LoginRequest(
    @SerializedName("usernameOrEmail") val usernameOrEmail: String,
    @SerializedName("password") val password: String
) : Serializable
