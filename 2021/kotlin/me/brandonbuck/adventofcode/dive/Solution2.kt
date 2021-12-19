// Advent of Code 2021 "Dive!"
// Day 2, Puzzle 1

package me.brandonbuck.adventofcode.dive

import me.brandonbuck.adventofcode.common.readAllFromStandardIn

fun main() {
	val inputs = readAllFromStandardIn()

	println(solution2(inputs))
}

fun solution2(inputs: List<String>): Int {
	var location = Vector3(0, 0, 0)

	for (input in inputs) {
		val parts = input.split(" ")

		when (parts[0]) {
			"forward" -> {
				val amount = parts[1].toInt()
				val modify = Vector3(amount, amount * location.z, 0)
				location = location.add(modify)
			}
			"down" -> location = location.add(0, 0, parts[1].toInt())
			"up" -> location = location.add(0, 0, -parts[1].toInt())
			else -> {
				println("Not sure what to do with '${input}'")
			}
		}
	}

	return location.x * location.y
}
