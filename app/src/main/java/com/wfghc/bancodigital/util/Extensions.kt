package com.wfghc.bancodigital.util

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

fun Fragment.initToolbar(toolbar: Toolbar, homeAsUoEnable: Boolean = true) {
    (activity as AppCompatActivity).setSupportActionBar(toolbar)
    (activity as AppCompatActivity).title = ""
    (activity as AppCompatActivity).supportActionBar?.setDisplayShowHomeEnabled(homeAsUoEnable)
    toolbar.setOnClickListener { activity?.onBackPressed() }
}