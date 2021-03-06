package com.kaizen.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.kaizen.model.activityschedule.Activity
import com.kaizen.network.ApiCallback
import com.kaizen.network.service.ActivityService
import java.util.*

class ActivityViewModel(context: Context) : ViewModel() {
    private val activityService = ActivityService(context)

    fun saveActivity(activity: Activity, apiCallback: ApiCallback<Activity>) {
        activityService.saveActivity(activity, apiCallback)
    }

    fun getActivities(apiCallback: ApiCallback<List<Activity>>) {
        activityService.getActivities(apiCallback)
    }

    fun getActivity(activityCode: Int, apiCallback: ApiCallback<Activity>) {
        activityService.getActivity(activityCode, apiCallback)
    }

    fun getPendingEmployeeActivities(
        employeeId: String,
        date: Date,
        apiCallback: ApiCallback<List<Activity>>
    ) {
        activityService.getPendingEmployeeActivities(employeeId, date, apiCallback)
    }

    fun getPendingClientActivities(clientId: String, apiCallback: ApiCallback<List<Activity>>) {
        activityService.getPendingClientActivities(clientId, apiCallback)
    }

    fun getAppliedClientActivities(clientId: String, apiCallback: ApiCallback<List<Activity>>) {
        activityService.getAppliedClientActivities(clientId, apiCallback)
    }

    fun updateActivity(activity: Activity, apiCallback: ApiCallback<Activity>) {
        activityService.updateActivity(activity, apiCallback)
    }
}
