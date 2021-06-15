package com.sample.databinding

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

object BindingAdapterUtils {
    @JvmStatic
    @BindingAdapter("app:updateVisibility")
    fun updateVisibility(view: View, visible: Boolean) {
        view.visibility = if (visible) View.VISIBLE else View.GONE
    }

    @JvmStatic
    @BindingAdapter("app:setData")
    internal fun TextView.setData(data: String) {
        text = data
    }
}