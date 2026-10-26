package com.behcet.wordbookai.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.behcet.wordbookai.data.model.WordModel

@Database(
    entities = [WordModel::class],
    version = 1,
    exportSchema = true
)
abstract class WordDatabase : RoomDatabase() {
    abstract fun wordDao() : WordDao
}