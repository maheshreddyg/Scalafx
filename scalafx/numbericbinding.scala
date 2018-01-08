import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.{Label, Button, Slider, ScrollBar, TextField}
import scalafx.event.ActionEvent 

val app = new JFXApp {
   stage =  new JFXApp.PrimaryStage {
   title = " "
        scene = new Scene(600,300){
val label = new Label("Centered")
label.layoutY = 50

val button = new Button("Click me!")
button.layoutY = 100

val slider = new Slider(0, 300, 0)

val scrollbar = new ScrollBar
scrollbar.min =0
scrollbar.max = 500
scrollbar.layoutY = 270

val field = new TextField
field.text = label.text.value

content = List(label, button, slider, scrollbar, field)

button.layoutX <== slider.value
scrollbar.value <==> slider.value

label.layoutX <== (scene.width-label.width)/2
label.text <== field.text

scrollbar.layoutY <== scene.height-scrollbar.height
field.layoutX <== scene.width-field.width
}
}
}
app.main(args)
