package com.akakim.healthroadmap.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import java.util.Date


@Entity(tableName = "MyBMRMap")
data class MyBMRMap (

    @ColumnInfo(name="inputEnergy") var inputEnergy : Float,
    @ColumnInfo(name="myWeight") var myWeight : Float,
    @ColumnInfo(name="day") var date : Date
)