package com.example.my_app.domain.repository

import com.example.my_app.domain.entity.GameSettings
import com.example.my_app.domain.entity.Level
import com.example.my_app.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question
    fun getGameSettings(level: Level): GameSettings
}