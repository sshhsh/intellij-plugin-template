package com.github.sshhsh.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.sshhsh.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
