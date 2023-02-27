package com.ryanofori.watchlist.ui.theme

import androidx.room.ColumnInfo
import java.util.Date
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "watch_table")

data class WatchItem(
    @PrimaryKey
    @ColumnInfo(name = "title")
    val title: String,
//    val webUrl: String,
//    var date: Date,
    val isSelected: Boolean
)