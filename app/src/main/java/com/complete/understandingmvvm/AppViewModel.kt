package com.complete.understandingmvvm

import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {
    var number = 0;

    fun addNumber(){
        number++;
    }
}