import scalafx.Includes._
import scalafx.event.ActionEvent
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control._
val app = new JFXApp 
{
	stage = new JFXApp.PrimaryStage
     {
	title = "FirstGUI"
scene = new Scene(400, 300){
 val button = new Button("click me")
     button.layoutX = 100
     button.layoutY = 50
val comboBox = new ComboBox(List("Java","Python","R"))
    comboBox.layoutX = 200
    comboBox.layoutY = 50
val listview = new ListView(List("mahesh","adithya","rakesh"))
	listview.layoutX = 100
	listview.layoutY = 150
	listview.prefHeight=100


content = List(button, comboBox, listview)

button.onAction = (e:ActionEvent) => {
   val selected = listview.selectionModel.apply.getSelectedItems
listview.items = listview.items.apply.diff(selected)
}

comboBox.onAction = (e:ActionEvent) =>{
listview.items.apply += comboBox.selectionModel.apply.getSelectedItem
}

}     
}
}
app.main(args)
