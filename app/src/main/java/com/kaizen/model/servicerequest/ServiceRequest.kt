package com.kaizen.model.servicerequest

import com.google.gson.annotations.SerializedName
import com.kaizen.model.client.Client
import com.kaizen.model.service.Service
import java.io.Serializable
import java.util.*

data class ServiceRequest(
    @SerializedName("date") val date: Date
) : Serializable {
    @SerializedName("code")
    var code: Int = 0

    @SerializedName("clientId")
    lateinit var clientId: String

    @SerializedName("serviceCodes")
    lateinit var serviceCodes: Array<String>

    @SerializedName("state")
    lateinit var state: ServiceRequestState

    @SerializedName("periodicity")
    lateinit var periodicity: PeriodicityType

    @SerializedName("client")
    lateinit var client: Client

    @SerializedName("services")
    lateinit var services: Array<Service>
}
