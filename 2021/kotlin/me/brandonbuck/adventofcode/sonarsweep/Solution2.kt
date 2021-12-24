// Advent of Code 2021 "Sonar Sweep"
// Day 1, Puzzle 2

package me.brandonbuck.adventofcode.sonarsweep

import me.brandonbuck.adventofcode.common.io.readAllFromStandardIn

fun main() {
	val inputs = readAllFromStandardIn()

	println(solution2(inputs))
}

fun solution2(inputs: List<String>): Int {
	if (inputs.size < 3) return 0

	val depths = inputs.map(String::toInt)

    // 0 1 2 3 4 5 6 7 8 9
	// a a a   e e e
	//   b b b   f f f
	//     c c c   g g g
	//       d d d   h h h

	var count = 0
	for (i in 3..(depths.size-1)) {
		val prev = depths[i-3] + depths[i-2] + depths[i-1]
		val next = depths[i-2] + depths[i-1] + depths[i]

		if (next > prev) ++count
	}

	return count
}
