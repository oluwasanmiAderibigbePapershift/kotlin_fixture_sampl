package com.example.kotlinfixturesample

import com.google.common.truth.Truth
import org.junit.Test

class ManualUserMapperTest {

    val testData = TestDataUtils.provideUserResponseAndModel()
    val SUT = UserMapper

    @Test
    fun mapUserResponseToModel_shouldReturn_mappedUserModel() {
        //GIVEN
        val userResponse = testData.first

        //WHEN
        val userModel = SUT.mapUserResponseToModel(userResponse)

        //THEN
        Truth.assertThat(userResponse.age).isEqualTo(userModel.age)
        Truth.assertThat(userResponse.email).isEqualTo(userModel.email)
        Truth.assertThat(userResponse.firstName).isEqualTo(userModel.firstName)
        Truth.assertThat(userResponse.lastName).isEqualTo(userModel.lastName)
        Truth.assertThat(userResponse.nationality).isEqualTo(userModel.nationality)


    }
}