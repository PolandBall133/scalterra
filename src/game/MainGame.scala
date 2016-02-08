package game

import org.newdawn.slick.{Graphics, GameContainer, SlickException, BasicGame}

class MainGame extends BasicGame("Hello Scalterra!") {
  @throws(classOf[SlickException])
  def init(gc: GameContainer) {
  }

  @throws(classOf[SlickException])
  def update(gc: GameContainer, i: Int) {
  }

  @throws(classOf[SlickException])
  def render(gc: GameContainer, g: Graphics) {
    g.drawString("Howdy! Scala", 10, 100)
  }
}