import javax.swing._
import java.awt._

class number extends JDialog {
  setTitle("Задание по практике")
  setSize(300, 200)
  val panel = new JPanel()
  val butt1 = new JButton("задание1")
  val butt2 = new JButton("задание2")
  val butt3 = new JButton("задание3")
  val butt4 = new JButton("задание4")
  val butt5 = new JButton("задание5")
  val butt6 = new JButton("задание6")
  val butt7 = new JButton("задание7")
  panel.setLayout(new GridLayout(7, 1, 0, 0))
  butt1.addActionListener((_) => {
    val zadan1 = new JDialog()
    zadan1.setTitle("Задание №1")
    zadan1.setSize(300, 200)
    val number1 = new JPanel()
    number1.setLayout(new GridLayout(2, 3, 10, 10))
    val A = new JSpinner(new SpinnerNumberModel(0.0, 0.0, 100.0, 0.1))
    val R = new JSpinner(new SpinnerNumberModel(0.0, 0.0, 100.0, 0.1))
    val deg = new JSpinner(new SpinnerNumberModel(0.0, 0.0, 100.0, 0.1))
    number1.add(A)
    number1.add(R)
    number1.add(deg)
    val result = new JButton("Расчитать")
    val ans = new JTextArea()
    number1.add(result)
    number1.add(ans)
    zadan1.add(number1)
    zadan1.setVisible(true)
    result.addActionListener((_) => {
      val test = new ex1
      val A1 = A.getModel.getValue.asInstanceOf[Double]
      val R1 = R.getModel.getValue.asInstanceOf[Double]
      val deg1 = deg.getModel.getValue.asInstanceOf[Double]
      ans.setText(String.format("%.7f", test.result(A1, R1, deg1).asInstanceOf[Double]))
    })
  })
  butt2.addActionListener((_) => {
    val zadan2 = new JDialog()
    zadan2.setTitle("Задание №2")
    zadan2.setSize(300, 200)
    val number2 = new JPanel()
    number2.setLayout(new GridLayout(2, 2, 10, 10))
    val Q0 = new JSpinner(new SpinnerNumberModel(0.0, 0.0, 100.0, 0.1))
    val massiv = Array("без покрытия", "кадмиевое")
    val coating = new JComboBox[String](massiv)
    number2.add(Q0)
    number2.add(coating)
    val result = new JButton("Расчитать")
    val ans = new JTextArea()
    number2.add(result)
    number2.add(ans)
    zadan2.add(number2)
    zadan2.setVisible(true)
    result.addActionListener((_) => {
      val test = new ex2
      val Q01 = Q0.getModel.getValue.asInstanceOf[Double]
      val coating1 = coating.getModel.getSelectedItem.asInstanceOf[String]
      val t = test.result(Q01, coating1)
      ans.setText(f"Расчет момента трения для первой затяжки:${t(0)} \n " +
        f"Расчет момента трения для десятой затяжки${t(1)}")
    })
  })
  butt3.addActionListener((_) => {
    val zadan3 = new JDialog()
    zadan3.setTitle("Задание №3")
    zadan3.setSize(300, 200)
    val number3 = new JPanel()
    number3.setLayout(new GridLayout(2, 2, 10, 10))
    val axialClearance = new JSpinner(new SpinnerNumberModel(0.004, 0.004, 0.01, 0.002))
    val result = new JButton("Расчитать")
    val ans = new JTextArea()
    number3.add(axialClearance)
    number3.add(ans)
    number3.add(result)
    zadan3.add(number3)
    zadan3.setVisible(true)
    result.addActionListener((_) => {
      val test = new ex3
      val axialClearance1 = axialClearance.getModel.getValue.asInstanceOf[Double]
      ans.setText(String.format("%.7f", test.result(axialClearance1)))
    })
  })
  butt4.addActionListener((_) => {
    val zadan4 = new JDialog()
    zadan4.setTitle("Задание №4")
    zadan4.setSize(300, 200)
    val number4 = new JPanel()
    number4.setLayout(new GridLayout(2, 2, 10, 10))
    val Z = new JSpinner(new SpinnerNumberModel(0.3, 0.3, 0.5, 0.05))
    val C = new JSpinner(new SpinnerNumberModel(1.7, 1.7, 2.1, 0.1))
    val result = new JButton("Расчитать")
    val ans = new JTextArea()
    number4.add(Z)
    number4.add(C)
    number4.add(result)
    number4.add(ans)
    zadan4.add(number4)
    zadan4.setVisible(true)
    result.addActionListener((_) => {
      val test = new ex4
      val Z1 = Z.getModel.getValue.asInstanceOf[Double]
      val C1 = C.getModel.getValue.asInstanceOf[Double]
      ans.setText(String.format("%.7f", test.result(Z1, C1)))
    })
  })
  butt5.addActionListener((_) => {
    val zadan5 = new JDialog()
    zadan5.setTitle("Задание №5")
    zadan5.setSize(300, 200)
    val number5 = new JPanel()
    number5.setLayout(new GridLayout(2, 2, 10, 10))
    val n = new JSpinner(new SpinnerNumberModel(1, 1, 1000, 1))
    val result = new JButton("Расчитать")
    val ans = new JTextArea()
    number5.add(n)
    number5.add(result)
    number5.add(ans)
    zadan5.add(number5)
    zadan5.setVisible(true)
    result.addActionListener((_) => {
      val test = new ex5
      val n1 = n.getModel.getValue.asInstanceOf[Int]
      val t = test.result(n1)
      ans.setText(f"Соединения с зазором:${t(0)} \n " +
        f"Соединения с натягом:${t(1)} \n " +
        f"Соединения без зазора:${t(2)}")
    })
  })
  panel.add(butt1)
  panel.add(butt2)
  panel.add(butt3)
  panel.add(butt4)
  panel.add(butt5)
  panel.add(butt6)
  panel.add(butt7)
  getContentPane.add(panel)
  setLocationRelativeTo(null)
}
