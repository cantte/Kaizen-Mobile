package com.kaizen.network.api

import com.kaizen.model.servicerequest.ServiceRequest
import com.kaizen.network.ApiUrls.SERVICE_REQUESTS_API_URL
import retrofit2.Call
import retrofit2.http.*

interface ServiceRequestsAPI {
    @POST(SERVICE_REQUESTS_API_URL)
    fun saveServiceRequest(@Body serviceRequest: ServiceRequest): Call<ServiceRequest>

    @GET(SERVICE_REQUESTS_API_URL)
    fun getServiceRequests(): Call<List<ServiceRequest>>

    @GET("$SERVICE_REQUESTS_API_URL/PendingServiceRequest/{clientId}")
    fun getPendingServiceRequest(@Path("clientId") clientId: String): Call<ServiceRequest>

    @GET("$SERVICE_REQUESTS_API_URL/{serviceRequestCode}")
    fun getServiceRequest(@Path("serviceRequestCode") serviceRequestCode: Int): Call<ServiceRequest>

    @PUT("$SERVICE_REQUESTS_API_URL/{serviceRequestCode}")
    fun updateServiceRequest(
        @Path("serviceRequestCode") serviceRequestCode: Int,
        @Body serviceRequest: ServiceRequest
    ): Call<ServiceRequest>
}
