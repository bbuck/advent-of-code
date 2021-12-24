package me.brandonbuck.adventofcode.binarydiagnostic

fun processBinaryNumbers(inputs: List<String>): Map<Int, Pair<Int, Int>> {
	val mapping = mutableMapOf<Int, Pair<Int, Int>>()

	for (input in inputs) {
		for (i in 0..(input.length - 1)) {
			val n = if (input[i] == '0') 0 else 1
			var pair = mapping.getOrPut(i) { Pair(0, 0) }
			if (n == 1) {
				pair = Pair(pair.first, pair.second + 1)
			} else {
				pair = Pair(pair.first + 1, pair.second)
			}
			mapping[i] = pair
		}
	}

	return mapping
}
