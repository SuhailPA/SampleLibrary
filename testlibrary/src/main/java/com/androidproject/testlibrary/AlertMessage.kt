package com.androidproject.testlibrary

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface

object AlertMessage {

    fun showAlertDialogMessage(context : Context, title : String, message : String, onPositiveClickCallback : () -> Unit){

        AlertDialog.Builder(context)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("yes", DialogInterface.OnClickListener{
                    _, _ ->  onPositiveClickCallback.invoke()
            })
            .show()
    }
}