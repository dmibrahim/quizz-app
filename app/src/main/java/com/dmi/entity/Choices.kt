package com.dmi.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity()
data class Choice (val questionId: Int, val choice: String): Serializable{
    @PrimaryKey(autoGenerate = true)
    var id: Int =0
}