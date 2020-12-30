package com.example.kotlinfixturesample

object UserMapper {
    fun mapUserResponseToModel(userResponse: UserResponse) : UserModel {
        return with(userResponse) {
            UserModel(firstName, lastName, email, age ?: "", nationality ?: "")
        }
    }
}