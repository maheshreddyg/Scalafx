import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.Includes._
import scalafx.scene.control._
import scalafx.scene.layout.{TilePane, StackPane, AnchorPane}

val app = new JFXApp {

stage = new JFXApp.PrimaryStage {

title = "More Panes"

scene = new Scene(600,300) {

val tilepane = new TilePane
for(i <- 1 to 9){
val button = new Button("Button: "+i)
button.minWidth =200
tilepane.children += button 
}
tilepane.children += new TextField

val label = new Label("Stack")
val slider = new Slider(0,10,0)
val anchor = new AnchorPane
anchor.children = List(label, slider)

val stackpane = new StackPane
stackpane.children = List(tilepane, anchor)
root = stackpane
}
}
}
app.main(args)
