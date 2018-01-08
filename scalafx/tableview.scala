import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.{TableView, TableColumn}
import scalafx.event.ActionEvent
import scalafx.collections.ObservableBuffer

case class Student(name:String, test1:Int, test2:Int)

val app = new JFXApp {
stage = new JFXApp.PrimaryStage {
title = "Table View"
scene = new Scene(400,400){

val data = new ObservableBuffer[Student](
	Student("mahesh", 99, 89), 
	Student("Rakesh", 77, 58), 
	Student("adi", 88, 47)
)

val table = new TableView(data)
val col1 = new TableColumn[Student, String]("Name")

root = table
}
}
}
