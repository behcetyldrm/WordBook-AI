package com.behcet.wordbookai.core.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert
import com.behcet.wordbookai.data.model.WordModel
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {

    @Upsert
    suspend fun updateWord(word: WordModel)

    @Delete
    suspend fun deleteWord(word: WordModel)

    @Query("SELECT * FROM word_table")
    fun getAllWords(): Flow<List<WordModel>>

    @Query("SELECT * FROM word_table WHERE isFav = 1")
    fun getFavWords(): Flow<List<WordModel>>

    @Query("SELECT * FROM word_table WHERE id = :id")
    fun getWordById(id: String): Flow<WordModel?>

    @Query("UPDATE word_table SET isFav = :isFav WHERE id = :id")
    suspend fun updateWordFav(id: String, isFav: Boolean)

    @Query("UPDATE word_table SET correctCount = correctCount + 1 WHERE id = :id")
    suspend fun updateCorrectCount(id: String)

    @Query("UPDATE word_table SET wrongCount = wrongCount + 1 WHERE id = :id")
    suspend fun updateWrongCount(id: String)
}