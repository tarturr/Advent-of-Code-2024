package fr.tartur.aoc
package days

import fr.tartur.aoc.days.all.*

object Days {

  private val days = Array(
    new Day1,
    new Day2
  )

  def apply(i: Int): Day[?] = this.days(i - 1)

}
