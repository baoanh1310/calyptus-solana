package com.example.waffle.injection

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkModule {
    @Binds
    @Singleton
    abstract fun bindsRpcConfig(rpcConfig: RpcConfig): IRpcConfig
}
