package com.example.hilt_app

import android.app.Application
import com.example.hilt_app.di.scopes.ActivityScope
import com.example.hilt_app.network.NetworkModule
import dagger.Component
import dagger.Module
import dagger.Subcomponent
import javax.inject.Singleton

class App : Application() {
    val component = DaggerApplicationComponent.create()
    
}

@Singleton
@Component(modules = [NetworkModule::class,MainActivityModule::class])
interface  ApplicationComponent{
    fun mainActivityComponent() : MainActivityComponent.Factory
}

@ActivityScope
@Subcomponent
interface MainActivityComponent{

    @Subcomponent.Factory
    interface Factory{
        fun create() : MainActivityComponent
    }
    fun inject(mainActivity: MainActivity)
}

@Module(subcomponents = [MainActivityComponent::class])
class MainActivityModule(){

}