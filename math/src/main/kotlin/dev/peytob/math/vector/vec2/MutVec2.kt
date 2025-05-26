package dev.peytob.math.vector.vec2

interface MutVec2<T : Number> : Vec2<T> {

    override val size: Int
        get() = 2

    override var x: T

    override var y: T

    override operator fun `get`(index: Int): T {
        return when (index) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException()
        }
    }

    operator fun `set`(index: Int, value: T) {
        when (index) {
            0 -> x = value
            1 -> y = value
            else -> throw IndexOutOfBoundsException()
        }
    }
}

typealias MutVec2d = MutVec2<Double>
typealias MutVec2l = MutVec2<Long>
typealias MutVec2i = MutVec2<Int>
typealias MutVec2f = MutVec2<Float>