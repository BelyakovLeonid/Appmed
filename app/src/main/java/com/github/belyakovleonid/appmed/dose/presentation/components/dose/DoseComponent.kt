package com.github.belyakovleonid.appmed.dose.presentation.components.dose

import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.base.presentation.components.BaseComponent
import com.github.belyakovleonid.appmed.dose.presentation.components.dose.model.DoseUiModel
import com.github.belyakovleonid.appmed.home.domain.ProductsInteractor
import javax.inject.Inject

class DoseComponent @Inject constructor(
    private val interactor: ProductsInteractor
) : BaseComponent() {

    override suspend fun onInitialize() {
        val product = interactor.getCurrentProduct() ?: return
        content.value = listOf(
            DoseUiModel(
                imageResId = R.drawable.ic_meds,
                title = R.string.dose,
                //todo инжект ресурсов и нормальная работа со строками:
                text = "${product.defaultPortionMg} мг",
                subText = "${product.defaultPortionMg * product.defaultCountPerDay} мг в сутки"
            ),
            DoseUiModel(
                imageResId = R.drawable.ic_alert,
                title = R.string.freq,
                text = "3 раза в день",
                subText = "утро / день / вечер"
            ),
            DoseUiModel(
                imageResId = R.drawable.ic_calendar,
                title = R.string.course,
                //todo нормальная работа с датами:
                text = "5 дней",
                subText = "с 30 мая по 4 июня "
            ),
        )
    }
}