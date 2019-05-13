package com.akakim.healthroadmap.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 * @author KIM
 * @version 0.0.1
 * @since 0.0.1
 * @date 2019-05-12
 *  운동 목록을 의미하는 데이터.
 *  빈도수는 카운팅
 */

@Entity(tableName = "WorkOut")
data class WorkOut(
    @ColumnInfo(name="workOutName")     @NonNull var workOutName: String,   // 운동
    @ColumnInfo(name="equipment")       @NonNull var equipment : String,    // 장비
    @ColumnInfo(name="targetMuscle")    @NonNull var targetMuscle : String, // 운동의 목적 부위
    @ColumnInfo(name="targetDetail")    @NonNull var targetDetail : String  // 사용자가 더 집중할 부위
)