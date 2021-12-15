// Copyright 2021 Brandon Buck

// Advent of Code 2021 "Sonar Sweep"
// Day 1, Puzzle 1

package me.brandonbuck.adventofcode.sonarsweep

import me.brandonbuck.adventofcode.common.readAllFromStandardIn

fun main() {
	val inputs = readAllFromStandardIn()

	println(solution1(inputs))
}

fun solution1(depths: List<String>): Int {
	val depthValues = depths.map(String::toInt)

	var count = 0
	var lastElement = depthValues[0]
	for (i in 1..(depthValues.size-1)) {
		if (depthValues[i] > lastElement) {
			++count
		}
		lastElement = depthValues[i]
	}

	return count
}
