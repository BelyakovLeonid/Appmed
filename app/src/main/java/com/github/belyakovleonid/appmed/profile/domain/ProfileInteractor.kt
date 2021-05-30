package com.github.belyakovleonid.appmed.profile.domain

import com.github.belyakovleonid.appmed.profile.domain.model.ProfileData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProfileInteractor @Inject constructor() {

    private var profileDataBeforeDummy: ProfileData? = null

    private val profileData = MutableStateFlow<ProfileData?>(null)

    fun subscribeToProfileData(): Flow<ProfileData?> {
        return profileData
    }

    fun getCurrentProfileData(): ProfileData? {
        return profileData.value
    }

    fun saveProfileData(data: ProfileData?) {
        profileData.value = data
    }

    fun setDummyData() {
        profileDataBeforeDummy = profileData.value
        saveProfileData(ProfileData("Стелла", "35", "М", false))
    }

    fun removeDummyData() {
        saveProfileData(profileDataBeforeDummy)
        profileDataBeforeDummy = null
    }
}