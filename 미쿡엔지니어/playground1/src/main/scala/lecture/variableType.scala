package lecture

object variableType extends App{

  // Immutable
  val constantValue: Int = 31
  println(constantValue)

  // constantValue = 20 // THis would cause a compilation error

  // Mutable
  var mutableValue = 10
  mutableValue = 20 // This is allowed
  println(mutableValue)

  // Type Inference
  val number = 42 // Scala infers that number is of type Int
  println(number.isInstanceOf[Int])

  val name = "Scala" // Scala infers that name is of type String
  println(name.isInstanceOf[String])

  // Built-in Data Types

  val byteVal: Byte = 10
  println(byteVal)
  val shortVal: Short = 100
  println(shortVal)
  val intVal: Int = 1000
  println(intVal)
  val longVal: Long = 10000L
  println(longVal)
  val floatVal: Float = 10.5f
  println(floatVal)
  val doubleVal: Double = 10.5
  println(doubleVal)
  val charVal: Char = 'A'
  println(charVal)
  val booleanVal: Boolean = true
  println(booleanVal)
  val stringVal: String = "Hello, Scala"
  println(stringVal)
}
