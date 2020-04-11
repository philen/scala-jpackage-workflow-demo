package example

import java.awt.{BorderLayout, Dimension}
import javax.swing.{JFrame, JScrollPane, JTextArea, WindowConstants}


object Main extends App {
  val textArea = new JTextArea
  textArea.setText(
    """Lorem ipsum dolor sit amet, consectetur adipiscing elit,
      | sed do eiusmod tempor incididunt ut labore et dolore
      | magna aliqua. Ut enim ad minim veniam, quis nostrud
      | exercitation ullamco laboris nisi ut aliquip ex ea
      | commodo consequat. Duis aute irure dolor in
      | reprehenderit in voluptate velit esse cillum dolore eu
      | fugiat nulla pariatur. Excepteur sint occaecat
      | cupidatat non proident, sunt in culpa qui officia
      | deserunt mollit anim id est laborum.""".stripMargin)
  val scrollPane = new JScrollPane(textArea)

  val frame = new JFrame("Hello, Swing")
  frame.getContentPane.add(scrollPane, BorderLayout.CENTER)
  frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
  frame.setSize(new Dimension(600, 400))
  frame.setLocationRelativeTo(null)
  frame.setVisible(true)
}