// Copyright 2021 Brandon Buck

package me.brandonbuck.adventofcode.common

fun readAllFromStandardIn(): List<String> {
	val inputs = mutableListOf<String>()

	do {
		var input = readLine()?.trim()

		if (input != null) {
			inputs.add(input)
		}
	} while (input != null && input.length > 0)

	return inputs
}
