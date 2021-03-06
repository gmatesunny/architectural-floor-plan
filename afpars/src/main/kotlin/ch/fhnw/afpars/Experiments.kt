package ch.fhnw.afpars

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class Experiments : Application() {

    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        val root = FXMLLoader.load<Parent>(javaClass.classLoader.getResource("view/ExperimentsView.fxml"))
        primaryStage.title = "Architectural Floor Plan Analysis"
        primaryStage.scene = Scene(root)
        primaryStage.show()
        System.out.println()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Experiments::class.java)
        }
    }
}