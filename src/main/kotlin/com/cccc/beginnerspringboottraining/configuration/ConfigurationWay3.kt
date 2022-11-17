package com.cccc.beginnerspringboottraining.configuration

import com.cccc.beginnerspringboottraining.practice2.Training
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConfigurationWay3 {
    
    @Bean
    fun springBootTrainingWay3(trainingSettings: TrainingSettings) =
        Training("Sprig Boot training", trainingSettings.isForBeginners, trainingSettings.daysDuration)
    
}