package game

import game.util.math2d.FlatMatrix
import game.world.util.GameWorldSaver
import game.world.{Block, GameWorld}
import game.world.layers.Layers
import org.newdawn.slick.{AppGameContainer, SlickException}

object Main {
  def main(args: Array[String]) {

    try {
      //val app = new AppGameContainer(new MainGame())
      //app.setDisplayMode(640, 480, false)
      //app.start()

      val (width, height) = (10, 10)

      new GameWorldSaver(new GameWorld(width, height, new Layers(new FlatMatrix[Block](width, height))))
          .saveTo("saves/last-save.scalsave")

    }
    catch {
      case ex: SlickException => ex.printStackTrace()
    }

  }
}