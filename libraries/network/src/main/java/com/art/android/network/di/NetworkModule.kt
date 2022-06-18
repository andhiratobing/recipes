package com.art.android.network.di

import com.art.android.configuration.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import javax.inject.Singleton

/**
 * @author andhiratobing
 * @project Recipes
 */

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideKtorHttpClient(): HttpClient {
        return HttpClient(Android) {
            // Setup engine config
            engine {
                connectTimeout = 2_000
                socketTimeout = 2_000
            }
            // Install logging plugin
            install(plugin = Logging) {
                level = LogLevel.BODY
            }
            // Install json plugin
            install(plugin = ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                })
            }
            defaultRequest {
                url {
                    host = BuildConfig.BASE_URL
                    protocol = URLProtocol.HTTPS
                }
                contentType(ContentType.Application.Json)
                accept(ContentType.Application.Json)
                headers {
                    append(name = "x-api-key", value = BuildConfig.API_KEY)
                }.build()
            }
        }
    }
}