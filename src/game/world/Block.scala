package game.world

class Block(val id: Int) extends layers.Element{
  def uuid = java.util.UUID.randomUUID.toString
}