package me.brandonbuck.adventofcode.binarydiagnostic

import me.brandonbuck.adventofcode.common.io.readAllFromStandardIn

fun main() {
	val inputs = readAllFromStandardIn()

	println(solution1(inputs))
}

fun solution1(inputs: List<String>): Int {
	val mapping = processBinaryNumbers(inputs)
	val binLength = inputs[0].length

	var gamma = ""
	var epsilon = ""
	for (i in 0..(binLength - 1)) {
		val pair = mapping[i]!!

		if (pair.first > pair.second) {
			gamma += "0"
			epsilon += "1"
		} else {
			gamma += "1"
			epsilon += "0"
		}
	}

	val gammaN = gamma.toInt(2)
	val epsilonN = epsilon.toInt(2)

	return gammaN * epsilonN
}
