package com.github.clausavram.mypatchlanguageintellijplugin.services

import com.github.clausavram.mypatchlanguageintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
