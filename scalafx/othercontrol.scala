import scalafx.Includes._
import scalafx.scene.Scene
import scalafx.scene.control.{ Button, Label,ProgressBar, ScrollBar, Separator, Slider, ToolBar}
import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.geometry.Orientation


val app = new JFXApp {
stage = new JFXApp.PrimaryStage {
title = "Other Controls"
scene = new Scene(400,400) {

val toolbar = new ToolBar
toolbar.prefWidth = 600

val advButton = new Button("Advance")
val decButton = new Button("Decrement")
toolbar.items = List(advButton ,decButton, new Button("Tool1"),new Button("Tool2"))

val progress =  new ProgressBar
progress.layoutX = 20
progress.layoutY = 70
progress.prefWidth = 200

val scrollbar = new ScrollBar
scrollbar.layoutX = 20
scrollbar.layoutY =  130
scrollbar.prefWidth = 200
scrollbar.min = 0
scrollbar.max =100

val scrolllabel = new Label(" ")
scrolllabel.layoutX = 25
scrolllabel.layoutY = 150

val separator = new Separator
separator.layoutX = 300
separator.layoutY = 30
separator.orientation = Orientation.VERTICAL
separator.prefHeight = 230


val slider = new Slider(0,10,0)
slider.layoutX =320
slider.layoutY = 70
slider.prefWidth = 200

val sliderlabel = new Label(" ")
sliderlabel.layoutX = 320
sliderlabel.layoutY =130


content = List(toolbar, progress,scrollbar, scrolllabel, sliderlabel, separator, slider)

advButton.onAction = (e:ActionEvent) => {
progress.progress = progress.progress.apply + 0.0 min 1.0 max 0.0
}
decButton.onAction = (e:ActionEvent) => {
progress.progress = progress.progress.apply - 0.0 min 1.0 max 0.0
}
scrollbar.value.onChange {
scrolllabel.text = "Scrollbar: "+scrollbar.value.apply
}
slider.value.onChange {
sliderlabel.text = "Slider: "+slider.value.apply
}
}


}
}
app.main(args)
