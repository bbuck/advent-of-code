package me.brandonbuck.adventofcode.dive

public class Vector(public val x: Int, public val y: Int) {
	public fun add(ox: Int, oy: Int): Vector = Vector(x + ox, y + oy)

	public fun add(oVec: Vector): Vector = Vector(oVec.x + x, oVec.y + y)

	override fun toString(): String = "(${x}, ${y})"
}

public class Vector3(public val x: Int, public val y: Int, public val z: Int) {
	public fun add(ox: Int, oy: Int, oz: Int): Vector3 = Vector3(x + ox, y + oy, z + oz)

	public fun add(oVec: Vector3): Vector3 = Vector3(oVec.x + x, oVec.y + y, oVec.z + z)

	override fun toString(): String = "(${x}, ${y}, ${z})"
}
