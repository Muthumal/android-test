package lk.lm.custom_toast

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast

object CustomToast {
    @SuppressLint("ShowToast")
    fun print(context: Context, str:String){
        Toast.makeText(context,str,Toast.LENGTH_LONG).show()
    }
}