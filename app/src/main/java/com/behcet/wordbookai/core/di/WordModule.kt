package com.behcet.wordbookai.core.di

import android.content.Context
import androidx.room.Room
import com.behcet.wordbookai.core.database.WordDao
import com.behcet.wordbookai.core.database.WordDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object WordModule {
    @Provides
    @Singleton
    fun provideWordDatabase(@ApplicationContext context: Context) : WordDatabase {
        return Room.databaseBuilder(
            context = context,
            klass = WordDatabase::class.java,
            name = "word_database"
        ).build()
    }

    @Provides
    fun provideWordDao(db: WordDatabase) : WordDao = db.wordDao()
}