package game.world.layers.blocks

import Blocks._

import io.Source._

import org.json4s._
import org.json4s.jackson.JsonMethods._

object Loader {
  implicit val formats = DefaultFormats

  def load(path: String): Block = {
    //def lines = io.Source.fromFile(path).getLines.mkString("\n")
    //val json = parse(lines)
    //todo: return blocks; reformat tilemap.json
    val json = parse(
      """
        |  {
        |    "name": "none",
        |    "imagePath": "sky.jpg",
        |    "isSolid": false
        |  }
      """.stripMargin)

    json.extract[Block]
  }
}