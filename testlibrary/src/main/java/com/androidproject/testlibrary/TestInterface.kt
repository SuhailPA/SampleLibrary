package com.androidproject.testlibrary

interface TestInterface {
    fun getDataOnMuteButtonClick () : String
    fun onMuteButtonClickEvent (data : String) {
        val check = data
        check.length
    }
}