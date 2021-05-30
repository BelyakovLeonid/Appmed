package com.github.belyakovleonid.appmed.profile.domain

import com.github.belyakovleonid.appmed.profile.domain.model.ProfileData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProfileInteractor @Inject constructor() {

    private val profileData = MutableStateFlow<ProfileData?>(null)

    fun subscribeToProfileData(): Flow<ProfileData?> {
        return profileData
    }

    fun getCurrentProfileData(): ProfileData? {
        return profileData.value
    }

    suspend fun saveProfileData(data: ProfileData) {
        profileData.value = data
    }
}