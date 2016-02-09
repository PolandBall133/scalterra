package game.world.util

import java.io.{FileInputStream, ObjectInputStream}

import game.world.GameWorld

object GameWorldLoader {
  def loadFrom(path: String): GameWorld = {
    val inputFileStream = new FileInputStream(path)
    val inputObjectsStream = new ObjectInputStream(inputFileStream)
    inputObjectsStream.close()

    inputObjectsStream.readObject() match {
      case gameWorld: GameWorld => gameWorld
      case _ => throw new ClassCastException
    }
  }
}
