package fr.tartur.aoc
package days.all

import days.Day

class Day2 extends Day[Int](2) {

  case class Report(nums: Seq[Int]) {
    val isCrescent = nums(0) < nums(1)

    def isValid: Boolean = (for i <- 0 until this.nums.length - 1 yield nums(i + 1) - nums(i))
      .forall(delta => !(isCrescent && delta <= 0 || !isCrescent && delta >= 0 || Math.abs(delta) >= 4 || delta == 0))
  }

  override def run(): Int = this.intInputs(" ").map(Report(_)).count(_.isValid)

}
