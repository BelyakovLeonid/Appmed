package com.github.belyakovleonid.appmed.dose.presentation.components.profile

import android.util.Log
import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.model.DoseProfileUiModel
import com.github.belyakovleonid.appmed.dose.presentation.components.profile.model.EmptyProfileUiModel
import com.github.belyakovleonid.appmed.profile.domain.ProfileInteractor
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class DoseProfileComponent @Inject constructor(
    private val interactor: ProfileInteractor
) : BaseComponent() {

    override fun onSubscribe() {
        interactor.subscribeToProfileData()
            .onEach { profileData ->
                if (profileData == null) {
                    setContent(EmptyProfileUiModel())
                } else {
                    setContent(
                        DoseProfileUiModel(profileData.name)
                    )
                }
            }
            .launchIn(viewModelScope)
    }
}