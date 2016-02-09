package game.world

import game.world.layers.Layers

class GameWorld(val width: Int, val height: Int, val layers: Layers) extends Serializable {
  def uuid = java.util.UUID.randomUUID.toString
}
