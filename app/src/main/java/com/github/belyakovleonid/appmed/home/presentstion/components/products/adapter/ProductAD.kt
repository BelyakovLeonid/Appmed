package com.github.belyakovleonid.appmed.home.presentstion.components.products.adapter

import android.graphics.Paint
import androidx.core.view.isVisible
import com.github.belyakovleonid.appmed.R
import com.github.belyakovleonid.appmed.databinding.ProductItemBinding
import com.github.belyakovleonid.appmed.home.presentstion.components.products.model.ProductUiModel
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

fun productAD() = adapterDelegateViewBinding<ProductUiModel, Any, ProductItemBinding>(
    { layoutInflater, root -> ProductItemBinding.inflate(layoutInflater, root, false) }
) {
    binding.oldPrice.paintFlags = binding.oldPrice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

    bind {
        with(binding) {
            rating.rating = item.rate
            productImage.setImageResource(item.imageRes)

            productTitle.text = item.title
            productDescription.text = item.description

            isAvailable.isVisible = item.isAvailable
            isRecipe.isVisible = item.isRecipe

            oldPrice.text = itemView.resources.getString(R.string.product_currency, item.oldPrice)
            newPrice.text = itemView.resources.getString(R.string.product_currency, item.newPrice)
        }
    }
}