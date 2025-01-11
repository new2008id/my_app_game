package com.example.my_app.domain.usecases

import com.example.my_app.domain.entity.GameSettings
import com.example.my_app.domain.entity.Level
import com.example.my_app.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}