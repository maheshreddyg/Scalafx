import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.{Label, Button, ListView,TextArea, TextField}
import scalafx.scene.layout._
import scalafx.event.ActionEvent
val app = new JFXApp {
   stage =  new JFXApp.PrimaryStage {
   title = "Pickers"
        scene = new Scene(600,300){

val bp = new BorderPane
val hbox = new HBox (10, new Label("ontop"),new Button("top"),new TextField)
bp.autosize
bp.top = hbox
bp.bottom = new Button("ClickMe!")
bp.left = new ListView(List("java","python","scala","R","Pascal"))
bp.center = new TextArea
bp.right = new Button("right")
root = bp

}
}
}
app.main(args)
