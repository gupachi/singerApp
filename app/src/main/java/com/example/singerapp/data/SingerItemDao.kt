package com.example.singerapp.data


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SingerDao {
    @Insert
    suspend fun insert(singer: Singer)

    @Query("SELECT * FROM singer_table")
    fun getAllSingers(): LiveData<List<Singer>>
}
