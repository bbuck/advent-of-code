package me.brandonbuck.adventofcode.binarydiagnostic

import me.brandonbuck.adventofcode.common.io.readAllFromStandardIn

fun main() {
	val inputs = readAllFromStandardIn()

	println(solution2(inputs))
}

fun solution2(inputs: List<String>): Int {
	val binLength = inputs[0].length
	var o2List = inputs;
	var co2List = inputs;

	var i = 0
	while (o2List.size > 1 && i < binLength) {
		var pair = Pair(0, 0)
		o2List.forEach {
			if (it[i] == '0') {
				pair = Pair(pair.first + 1, pair.second)
			} else {
				pair = Pair(pair.first, pair.second + 1)
			}
		 }

		 val target = if (pair.first > pair.second) '0' else '1'
		 o2List = o2List.filter { it[i] == target }

		 ++i
	}

	i = 0
	while (co2List.size > 1 && i < binLength) {
		var pair = Pair(0, 0)
		co2List.forEach {
			if (it[i] == '0') {
				pair = Pair(pair.first + 1, pair.second)
			} else {
				pair = Pair(pair.first, pair.second + 1)
			}
		 }

		 val target = if (pair.second >= pair.first) '0' else '1'
		 co2List = co2List.filter { it[i] == target }

		 ++i
	}

	val o2N = o2List[0].toInt(2)
	val co2N = co2List[0].toInt(2)

	return o2N * co2N
}
