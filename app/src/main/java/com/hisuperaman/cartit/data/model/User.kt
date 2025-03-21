package com.hisuperaman.cartit.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "users",
    indices = [Index(value = ["email"], unique = true)]
)
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    var name: String,
    var email: String,
    var password: String,
    var address: String = "",
)