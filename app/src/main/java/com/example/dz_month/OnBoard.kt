package com.example.dz_month

import java.io.Serializable

data class OnBoard(
    val image:String,
    val title:String?=null,
    val description:String?=null,
var isLast:Boolean?=null
) :  Serializable
