package com.github.andresgcarmona.ijtestplugin.services

import com.intellij.openapi.project.Project
import com.github.andresgcarmona.ijtestplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
