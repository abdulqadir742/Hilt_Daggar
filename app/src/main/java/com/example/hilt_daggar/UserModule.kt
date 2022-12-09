package com.example.hilt_daggar

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    @Provides
    //Also we can use @Named("mysql") annotation
    @SqlQualifier
    fun ProvideSQLRepository(sqlRepository: SQLRepository): UserRepository {
        return SQLRepository()
    }

    @Provides
    @FirebaseQualifier
    fun ProvidesFirebaseRepository(): UserRepository {
        return FireBassRepository()
    }

//    @Binds
//    abstract fun ProvideSQLRepository(sqlRepository: SQLRepository) :UserRepository

}