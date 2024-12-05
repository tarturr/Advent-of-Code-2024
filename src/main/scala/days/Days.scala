package fr.tartur.aoc
package days

import fr.tartur.aoc.days.all.*

object Days {

  private val Days = Array(
    new Day1,
    new Day2
  )

  def apply(i: Int): Day[_] = this.Days(i - 1)

}
