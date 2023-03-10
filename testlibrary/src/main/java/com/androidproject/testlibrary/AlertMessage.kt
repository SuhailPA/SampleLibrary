package com.androidproject.testlibrary

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.widget.Toast

object AlertMessage {

    fun showAlertDialogMessage(context : Context, title : String, message : String, onPositiveClickCallback : () -> Unit){

        AlertDialog.Builder(context)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("yes", DialogInterface.OnClickListener{
                    _, _ ->
                Toast.makeText(context,"Successfully clicked the data",Toast.LENGTH_SHORT).show()
                onPositiveClickCallback.invoke()
            })
            .show()
    }
}