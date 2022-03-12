package com.github.linyongliang2018.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.linyongliang2018.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
