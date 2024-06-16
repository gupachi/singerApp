package com.example.singerapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "singer_table")
data class Singer(
    @PrimaryKey(autoGenerate = true) val id: String = 0,
    val name: String,
    val example: String
)