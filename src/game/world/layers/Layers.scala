package game.world.layers

import game.util.math2d.FlatMatrix
import game.world.Block

class Layers(val blocks: FlatMatrix[Block]) extends Serializable {
  def uuid = java.util.UUID.randomUUID.toString
}
