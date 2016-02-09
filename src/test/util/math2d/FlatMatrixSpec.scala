package util.math2d

import game.util.math2d.FlatMatrix
import org.scalatest.FunSpec

class FlatMatrixSpec extends FunSpec {
  describe("An empty FlatMatrix") {
    val matrix = new FlatMatrix(0, 0)

    it("has 0 width") {
      assert(matrix.width == 0)
    }

    it("has 0 height") {
      assert(matrix.height == 0)
    }

    it("has no data") {
      assert(matrix.data.length == 0)
    }
  }

  describe("Bound checks") {
    val (width, height) = (5, 5)
    val matrix = new FlatMatrix[Int](width, height)

    it("first element is in bounds") {
      assert(matrix.inBounds(0, 0))
    }

    it("elements before the first element are not in bounds") {
      assert(!matrix.inBounds(0, -1))
      assert(!matrix.inBounds(-1, 0))
      assert(!matrix.inBounds(-1, -1))
    }

    it("last element is in bounds") {
      assert(matrix.inBounds(width-1, height-1))
    }

    it("elements after the last element are not in bounds") {
      assert(!matrix.inBounds(width-1, height))
      assert(!matrix.inBounds(width, height-1))
      assert(!matrix.inBounds(width, height))
    }
  }

  describe("Translation of 2d position to index") {
    val width = 2
    val height = 2
    val data = Array.range(0, width * height)
    val matrix = new FlatMatrix[Int](2, 2, Some(data))

    it("first element is a valid element"){
      val idx = matrix.translateIndex(0, 0)
      assert(data(idx) == idx)
    }

    it("last element is a valid element"){
      val idx = matrix.translateIndex(width-1, height-1)
      assert(data(idx) == idx)
    }
  }
}