package fr.tartur.aoc
package days

import scala.io.Source

abstract class Day[T](day: Int) {
  
  protected val input = Source.fromResource(s"day-$day.txt").getLines().toList

  protected def intInputs(separator: String) = input.map(_.split(separator).map(_.toInt))

  def run(): T
  
}
