package dev.peytob.math.vector.vec2

import dev.peytob.math.vector.Vec

interface Vec2<T : Number> : Vec<T> {

    override val size: Int
        get() = 2

    val x: T

    val y: T

    override operator fun `get`(index: Int): T {
        return when (index) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException()
        }
    }
}

typealias Vec2d = Vec2<Double>

typealias Vec2l = Vec2<Long>

typealias Vec2i = Vec2<Int>

typealias Vec2f = Vec2<Float>
