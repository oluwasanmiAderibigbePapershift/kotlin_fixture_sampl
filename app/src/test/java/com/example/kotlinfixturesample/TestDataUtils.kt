package com.example.kotlinfixturesample

object TestDataUtils {

    fun provideUserResponseAndModel() : Pair<UserResponse, UserModel> {
        val userResponse = UserResponse("sanmi", "aderibigbe", "oa@ghj.com", "3445", "Nigerian")
        val userModel = UserModel("sanmi", "aderibigbe", "oa@ghj.com", "3445", "Nigerian")

        return Pair(userResponse, userModel)
    }
}