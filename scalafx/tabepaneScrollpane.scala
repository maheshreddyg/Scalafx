import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.Includes._
import scalafx.scene.control._
import scalafx.scene.layout._

val app = new JFXApp {

stage = new JFXApp.PrimaryStage {

title = " "

scene = new Scene(600,300) {

val tabpane = new TabPane 
val tab1 = new Tab
tab1.text = "welcome to tab1"
val tab2 = new Tab
tab2.text = "scroll"
val tiles = new TilePane 
for(i <- 1 to 100) tiles.children += new Button("button:" +i)
val scroll = new ScrollPane
scroll.content = tiles
tab2.content = scroll

tabpane.tabs = List(tab1, tab2)


root = tabpane 

}
}
}
app.main(args)
