package com.github.belyakovleonid.appmed.dose.presentation.components.controls

import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.controls.model.ControlsSaveUiModel
import com.github.belyakovleonid.appmed.dose.presentation.components.controls.model.ControlsUiModel
import com.github.belyakovleonid.appmed.profile.domain.ProfileInteractor
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class ControlsComponent @Inject constructor(
    private val interactor: ProfileInteractor
) : BaseComponent() {

    override fun onSubscribe() {
        interactor.subscribeToProfileData()
            .onEach { profileData ->
                if (profileData == null) {
                    setContent(
                        ControlsSaveUiModel()
                    )
                } else {
                    setContent(
                        ControlsUiModel()
                    )
                }
            }
            .launchIn(viewModelScope)
    }
}