package com.akakim.healthroadmap.db

import androidx.room.Database
import androidx.room.RoomDatabase

import com.akakim.healthroadmap.data.*
/**
 * @author KIM
 * @version 0.0.1
 * @since 0.0.1
 * @date 2019-05-12
 */

@Database(entities = [Food::class , WorkOut::class , WorkOutRoutine::class ], version = 1 )
abstract class HealthRoadMapDatabase : RoomDatabase(){



}
