package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by megamedia on 23/5/18.
 */


val Context.layoutInflater get() = LayoutInflater.from(this)