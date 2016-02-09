package game.world.util

import java.io.{ObjectOutputStream, FileOutputStream}

import game.world.GameWorld

class GameWorldSaver(gameWorld: GameWorld) {
  def saveTo(path: String): Unit = {
    val outputFileStream = new FileOutputStream(path)
    val outputObjectStream = new ObjectOutputStream(outputFileStream)
    outputObjectStream.writeObject(gameWorld)
    outputObjectStream.flush()
    outputObjectStream.close()
  }
}
