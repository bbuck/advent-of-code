// Advent of Code 2021 "Dive!"
// Day 2, Puzzle 1

package me.brandonbuck.adventofcode.dive

import me.brandonbuck.adventofcode.common.io.readAllFromStandardIn

fun main() {
	val inputs = readAllFromStandardIn()

	println(solution1(inputs))
}

fun solution1(inputs: List<String>): Int {
	var location = Vector(0, 0)

	for (input in inputs) {
		val parts = input.split(" ")

		when (parts[0]) {
			"forward" -> location = location.add(parts[1].toInt(), 0)
			"down" -> location = location.add(0, parts[1].toInt())
			"up" -> location = location.add(0, -parts[1].toInt())
			else -> {
				println("Not sure what to do with '${input}'")
			}
		}
	}

	return location.x * location.y
}
