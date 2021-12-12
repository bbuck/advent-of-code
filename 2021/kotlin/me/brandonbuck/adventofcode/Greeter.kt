// Copyright 2021 Brandon Buck

package me.brandonbuck.adventofcode

public class Greeter(val greeting: String) {
	public fun greet(name: String): String {
		return "$greeting, $name!"
	}
}
