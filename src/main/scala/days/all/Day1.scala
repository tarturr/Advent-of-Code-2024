package fr.tartur.aoc
package days.all

import days.Day

class Day1 extends Day[Int](1) {

  private val inputs = this.intInputs("   ")
  private val left = inputs.map(_(0)).sorted
  private val right = inputs.map(_(1)).sorted

  override def run(): Int = (for i <- 0 to left.length - 1 yield Math.abs(left(i) - right(i))).sum

}
