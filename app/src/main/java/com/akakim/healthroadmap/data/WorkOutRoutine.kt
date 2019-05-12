package com.akakim.healthroadmap.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 * @author KIM
 * @version 0.0.1
 * @since 0.0.1
 * @date 2019-05-12
 */
@Entity(tableName ="WorkOutRoutine")

data class WorkOutRoutine (

    @ColumnInfo(name="FoodName") @NonNull var foodName: String,
    @ColumnInfo(name="energy") @NonNull var energy : Int?,              // 총 칼로리
    @ColumnInfo(name="fat") @NonNull var fat : Int,                      // 지방
    @ColumnInfo(name="saturates") @NonNull var saturates : Int,          // 셀룰라이트 , 포화 지방
    @ColumnInfo(name="carbohydrate") @NonNull var carbohydrate : Int,   // 탄수화물
    @ColumnInfo(name="sugar") @NonNull var sugar : Int,                 // 당
    @ColumnInfo(name="protein") @NonNull var protein : Int,             // 단백질
    @ColumnInfo(name="salt") @NonNull var salt : Int,           // 나트륨
    @ColumnInfo(name="fiber") @NonNull var dietaryfiber : Int           //식이섬위
)