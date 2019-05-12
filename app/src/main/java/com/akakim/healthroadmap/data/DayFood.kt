package com.akakim.healthroadmap.data

import androidx.room.Entity


@Entity(tableName = "DayFood")
data class DayFood(
    val morning : Food ,
    val morningDesert : Food,
    val after : Food ,
    val afterDesert : Food,
    val evening : Food,
    val eveningDesert : Food,
    val additionalDesert : Food
)