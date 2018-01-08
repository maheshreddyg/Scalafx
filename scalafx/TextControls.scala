import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.{Label, TextField, TextArea, PasswordField}
import scalafx.event.ActionEvent
val app = new JFXApp {
 stage = new JFXApp.PrimaryStage {
  title = "Text Controls"
  scene = new Scene(400, 400) {

val label = new Label("Welcome This is Label")
	label.layoutX = 20
	label.layoutY = 20
	        
val textfield = new TextField 
	textfield.layoutX = 20
	textfield.layoutY = 50
	textfield.promptText = "A field"
val textArea = new TextArea
	textArea.layoutX = 20
	textArea.layoutY = 80
	textArea.prefHeight = 200
	textArea.prefWidth = 300
	textArea.promptText = "Area"

val passwordF = new PasswordField
	passwordF.layoutX = 20
	passwordF.layoutY = 280
	passwordF.promptText ="Password"

content = List(label, textfield, textArea,passwordF)

textfield.onAction = (e:ActionEvent) => {
label.text = "Field action: "+textfield.text.apply
}

textArea.text.onChange{
label.text = "Area changed:"+textArea.text.apply
}

passwordF.focused.onChange {
label.text = "password focus changed."+passwordF.focused.apply
}
} 
}
}
app.main(args)
