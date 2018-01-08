import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.{TreeView, TreeItem}
import scalafx.event.ActionEvent

val app = new JFXApp {
	stage = new JFXApp.PrimaryStage{
	title = "Treeview"
	scene = new Scene(400,400){

val telengana = new TreeItem("Telengana")
telengana.children = List(new TreeItem("karimnagar"),new TreeItem("warangal"),new TreeItem("ramagundam"))
val Andhra = new TreeItem("Andhra Pradesh")
	Andhra.children = List(new TreeItem("guntur"),new TreeItem("vizayanagaram"),new TreeItem("krishna"),new TreeItem("kurnool"))
val India = new TreeItem("India")
	India.children = List(telengana,Andhra)


val tree = new TreeView(India)
root = tree

tree.selectionModel.apply.selectedItem.onChange{
println("Selected "+tree.selectionModel.apply.getSelectedItems)
}


}
}
}
app.main(args)
