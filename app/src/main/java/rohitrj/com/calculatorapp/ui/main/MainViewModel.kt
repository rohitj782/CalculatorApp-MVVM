package rohitrj.com.calculatorapp.ui.main

import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var myMessage:String?=null

    fun setMessage(s:String?){
        myMessage=s?:"Null Value"
    }

    fun getMessage(): String? {
        return myMessage?:"Null Value"
    }

}
