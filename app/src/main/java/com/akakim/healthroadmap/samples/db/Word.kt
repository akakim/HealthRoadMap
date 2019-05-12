package com.akakim.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.annotation.NonNull

/**
 * @author KIM
 * @version 0.0.1
 * @since 0.0.1
 * @date 2019-05-05
 */

@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name="word") @NonNull val word : String )
