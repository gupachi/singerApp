package com.example.singerapp.data

import Singer
import androidx.lifecycle.LiveData

class SingerRepository(private val singerDao: SingerDao) {

    val allSingers: LiveData<List<Singer>> = singerDao.getAllSingers()

    suspend fun insert(singer: Singer) {
        singerDao.insert(singer)
    }
}