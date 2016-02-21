package game.world.layers.blocks

import org.json4s._
import org.json4s.jackson.JsonMethods._

case class Block(val name: String, val imagePath: String, val isSolid: Boolean)