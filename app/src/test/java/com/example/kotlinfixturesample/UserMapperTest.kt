package com.example.kotlinfixturesample

import com.appmattus.kotlinfixture.decorator.nullability.NeverNullStrategy
import com.appmattus.kotlinfixture.decorator.nullability.nullabilityStrategy
import com.appmattus.kotlinfixture.kotlinFixture
import com.google.common.truth.Truth
import org.junit.Test

import org.junit.Assert.*

class UserMapperTest {

    val fixture = kotlinFixture(){
        nullabilityStrategy(NeverNullStrategy)
    }
    val SUT = UserMapper

    @Test
    fun mapUserResponseToModel_shouldReturn_mappedUserModel() {
        //GIVEN
        val userResponse = fixture<UserResponse>()

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