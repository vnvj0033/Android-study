package com.example.mvctutorial.di.ex4namedannotation

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class PersonModule {
    @Provides
    @Named("Student")
    fun providesStudentName() = "StudentA"
    @Provides
    @Named("Teacher")
    fun providesTeacherName() = "TeacherB"
}
