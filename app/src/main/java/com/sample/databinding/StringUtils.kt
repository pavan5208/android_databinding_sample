package com.sample.databinding

object StringUtils {
   @JvmStatic
    fun capitalizeFirstCharacter(stringParam:String?):String{
        var captilizedString = ""
        if (!stringParam.isNullOrBlank()) {
            captilizedString = stringParam.substring(0, 1).uppercase() + stringParam.substring(1)
        }
        return captilizedString
    }
}