package game

import org.newdawn.slick.{AppGameContainer, SlickException}

object Main {
  def main(args: Array[String]) {

    try {
      val app = new AppGameContainer(new MainGame())
      app.setDisplayMode(640, 480, false)
      app.start()
    }
    catch {
      case ex: SlickException => ex.printStackTrace()
    }

  }
}