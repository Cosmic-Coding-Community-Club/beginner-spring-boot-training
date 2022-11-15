package com.cccc.beginnerspringboottraining.configuration

import com.cccc.beginnerspringboottraining.User
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SmartPhoneConfiguration {
    
    @Bean
    fun screen(){
        val user = User()
        user.toString()
    
    
    }
    
}