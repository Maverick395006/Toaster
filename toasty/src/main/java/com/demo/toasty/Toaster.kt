package com.demo.toasty

import android.content.Context
import android.widget.Toast

object Toaster {

    fun toasty(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

}