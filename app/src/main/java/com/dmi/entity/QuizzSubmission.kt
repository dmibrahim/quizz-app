package com.dmi.entity

import androidx.room.Embedded
import androidx.room.Relation

class QuizzSubmission (
    @Embedded val question: Question,
    @Relation(
        parentColumn = "id",
        entityColumn = "questionId"
    )
    val submission: Submission
)
