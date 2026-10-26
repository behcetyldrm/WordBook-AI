package com.behcet.wordbookai.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity (tableName = "word_table")
data class WordModel(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val english: String,
    val turkish: String,
    val note: String,
    val extraMeaning: String,
    val createdAt: Long = System.currentTimeMillis(),
    val isFav: Boolean = false,
    val correctCount: Int = 0,
    val wrongCount: Int = 0
)
