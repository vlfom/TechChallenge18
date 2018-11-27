package com.example.isausmanov.scriboai.database;

import com.example.isausmanov.scriboai.RecordingDataModel;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {RecordingDataModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract RecordingDao recordingDao();
}
