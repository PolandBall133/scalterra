package game.util.math2d

import scala.reflect.ClassTag

class FlatMatrix[T: ClassTag](val width: Int, val height: Int, passedData: Option[Array[T]] = None) extends Serializable {
  def uuid = java.util.UUID.randomUUID.toString

  val data: Array[T] = passedData.getOrElse(new Array[T](width*height))

  def translateIndex(x: Int, y: Int): Int = x*height+y

  def inBounds(x: Int, y:Int): Boolean = x >= 0 && y >= 0 && x < width && y < height

  def at(x: Int, y: Int): T = data(translateIndex(x, y))

  def updateAt(x: Int, y: Int, value: T): Unit = data.update(translateIndex(x, y), value)
}