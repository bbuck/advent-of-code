// Advent of Code 2021 "Dive!"
// Day 2, Puzzle 1

package me.brandonbuck.adventofcode.dive

import me.brandonbuck.adventofcode.common.readAllFromStandardIn

fun main() {
	val inputs = readAllFromStandardIn()

	println(solution1(inputs))
}

fun solution1(inputs: List<String>): Int {
	return inputs.size
}
