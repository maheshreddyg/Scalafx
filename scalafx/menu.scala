import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.{Menu, MenuButton, ContextMenu, SplitMenuButton, Label, MenuBar, MenuItem, SeparatorMenuItem, CheckMenuItem, RadioMenuItem, ToggleGroup}
import scalafx.event.ActionEvent
import scalafx.scene.input.{KeyCodeCombination, KeyCode, KeyCombination}
import scalafx.stage.FileChooser

val app = new JFXApp {
        stage = new JFXApp.PrimaryStage{
        title = "Menu"
        scene = new Scene(400,400){
val menubar = new MenuBar
val filemenu = new Menu("File")
val openitem = new MenuItem("open")
openitem.accelerator = new KeyCodeCombination(KeyCode.O, KeyCombination.ControlDown)
val saveitem = new MenuItem("save")
saveitem.accelerator = new KeyCodeCombination(KeyCode.S, KeyCombination.ControlDown)
val exititem = new MenuItem("Exit")
exititem.accelerator = new KeyCodeCombination(KeyCode.X, KeyCombination.ControlDown)

val Viewmenu = new Menu("View")
val showalltabs = new MenuItem("ShowAllTabs")
showalltabs.accelerator = new KeyCodeCombination(KeyCode.T, KeyCombination.ControlDown)
val editview = new MenuItem("EdithView")

val checkmenu = new Menu("CheckMenu")
val check1 = new CheckMenuItem("Check1")
val check2 = new CheckMenuItem("Check2")

val radiomenu = new Menu("Radio")
val radio1 = new RadioMenuItem("Radio 1")
val radio2 = new RadioMenuItem("Radio 2")
val radio3 = new RadioMenuItem("Radio 3")

val group = new ToggleGroup
group.toggles =  List(radio1, radio2, radio3) 

val typemenu = new Menu("Type")
typemenu.items = List(checkmenu, radiomenu)

filemenu.items = List(openitem, saveitem, exititem, new SeparatorMenuItem)
Viewmenu.items = List(showalltabs, editview,new SeparatorMenuItem)
checkmenu.items = List(check1, check2)
radiomenu.items = List(radio1, radio2, radio3)

menubar.menus = List(filemenu, Viewmenu, typemenu)
menubar.prefWidth = 600

val menubutton = new MenuButton("MenuButton")
menubutton.items = List(new MenuItem("Button1"),new MenuItem("Button2"))
menubutton.layoutX = 20
menubutton.layoutY = 50

val splitbutton = new SplitMenuButton(new MenuItem("Split1"),new MenuItem("Split2"))
splitbutton.text = "SplitMenuButton"
splitbutton.layoutX=20
splitbutton.layoutY=80

val label = new Label(" welcome")
label.layoutX = 20
label.layoutY = 150

val contextmenuval = new ContextMenu(new MenuItem("Context1"),new MenuItem("Context2"))
label.contextMenu = contextmenuval

content = List(menubar, menubutton, splitbutton, label) 

exititem.onAction = (e:ActionEvent) => {
sys.exit(0)
}
openitem.onAction = (e:ActionEvent) => {
val filechooser = new FileChooser
val selectedfile = filechooser.showOpenDialog(stage)
label.text = "open "+selectedfile

}
saveitem.onAction = (e:ActionEvent) => {
val filechooser = new FileChooser
val selectedfile = filechooser.showSaveDialog(stage)
label.text="save "+selectedfile
}
}
}
}

app.main(args)
