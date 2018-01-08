import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.Includes._
import scalafx.scene.control._
import scalafx.scene.shape._
import scalafx.scene.paint._
import scalafx.scene.text._

val app = new JFXApp {
	stage = new JFXApp.PrimaryStage {
	title = " "
scene = new Scene(600,300) {

val rect = Rectangle(10, 10, 80, 80)
val circle = Circle(150, 50, 40)
val ellipse = Ellipse(250,50,30,40)
val line = Line(310, 30, 390, 90)
val text = new Text(410, 50, "some text.jpg")



content = List(rect, circle, ellipse,line,text)

}
}
}
app.main(args)
