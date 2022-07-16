package com.art.android.recipes.data.network

import com.art.android.recipes.data.network.api.ApiService
import com.art.android.recipes.data.network.utils.FakeDataSource
import com.art.android.recipes.data.network.utils.TestDispatcherRule
import com.google.common.truth.Truth.assertThat
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.unmockkAll
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExperimentalCoroutinesApi
@ExtendWith(MockKExtension::class)
class RemoteDataSourceImplTest {

    // Mock api service
    @MockK
    lateinit var apiService: ApiService

    private lateinit var remoteDataSourceImpl: RemoteDataSourceImpl

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    // Before test
    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
        remoteDataSourceImpl = RemoteDataSourceImpl(
            apiService = apiService,
            dispatcher = testDispatcher.dispatcher
        )
    }

    // After test
    @After
    fun tearDown() = unmockkAll()

    @Test
    fun getRecipes() = runTest(testDispatcher.dispatcher) {
        // Fake data
        val recipeResponse = FakeDataSource.recipeResponse

        // Stubbing block for coroutines
        coEvery { apiService.getRecipes() } returns recipeResponse

        val result = remoteDataSourceImpl.getRecipes().results

        // Verification block for coroutines
        coVerify { apiService.getRecipes() }

        println(result)
        println(FakeDataSource.recipesDto)

        assertThat(result).isEqualTo(FakeDataSource.recipesDto)
    }
}