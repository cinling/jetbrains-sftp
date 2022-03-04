package com.github.cinling.jetbrainssftp.services

import com.intellij.openapi.project.Project
import com.github.cinling.jetbrainssftp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
