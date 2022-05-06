package com.dmi.entity

import androidx.room.Embedded
import androidx.room.Relation

data class QuestionAnswer (
    @Embedded val question: Question,
    @Relation(
        parentColumn = "id",
        entityColumn = "questionId"
    )
    val answer: Answer
    )