import javax.swing._

class SimpleSwingApp extends JDialog {
  setTitle("Простой интерфейс на Scala")
  setSize(300, 200)
  setLocationRelativeTo(null)

  val label = new JLabel("Привет, мир!")
  label.setHorizontalAlignment(SwingConstants.CENTER)

  val buttonToSecondWindow = new JButton("Перейти во второе окно")
  buttonToSecondWindow.addActionListener((_) => {
    val secondWindow = new SecondSwingApp()
    secondWindow.setVisible(true)
  })

  val buttonToFirstWindow = new JButton("Вернуться в первое окно")
  buttonToFirstWindow.addActionListener((_) => {
    this.dispose()
  })

  val panel = new JPanel()
  panel.add(label)
  panel.add(buttonToSecondWindow)
  panel.add(buttonToFirstWindow)

  getContentPane.add(panel)

  setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE)
  setVisible(true)
}

class SecondSwingApp extends JDialog {
  setTitle("Второе окно")
  setSize(300, 200)
  setLocationRelativeTo(null)

  val label = new JLabel("Это второе окно")
  label.setHorizontalAlignment(SwingConstants.CENTER)

  val buttonToFirstWindow = new JButton("Вернуться в первое окно")
  buttonToFirstWindow.addActionListener((_) => {
    this.dispose()
  })

  val panel = new JPanel()
  panel.add(label)
  panel.add(buttonToFirstWindow)

  getContentPane.add(panel)

  setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE)
  setVisible(true)
}

// Запуск приложения
//object Main extends App {
//  val firstWindow = new SimpleSwingApp
//  firstWindow.setVisible(true)
//}
