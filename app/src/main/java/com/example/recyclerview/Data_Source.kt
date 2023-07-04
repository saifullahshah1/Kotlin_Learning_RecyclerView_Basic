package com.example.recyclerview

import android.content.Context

class Data_Source(val context: Context) {
    fun getNamesList(): Array<String> {
        return context.resources.getStringArray(R.array.names_list)
    }
}
