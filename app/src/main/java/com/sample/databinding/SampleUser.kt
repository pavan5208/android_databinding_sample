package com.sample.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class SampleUser : BaseObservable() {

    var userName: String = "Andro"
        @Bindable
        get() = field
        set(value) {
            field = value
        }
}