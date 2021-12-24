package me.brandonbuck.adventofcode.common.io

fun readAllFromStandardIn(): List<String> {
	val inputs = mutableListOf<String>()

	do {
		val input = readLine()?.trim()

		if (input != null) {
			inputs.add(input)
		}
	} while (input != null && input.isNotEmpty())

	return inputs
}
