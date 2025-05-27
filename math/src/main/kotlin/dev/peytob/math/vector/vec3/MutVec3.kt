package dev.peytob.math.vector.vec3

interface MutVec3<T : Number> : Vec3<T> {

    override val size: Int
        get() = 2

    override var x: T

    override var y: T

    override var z: T

    override val mutable: Boolean
        get() = true

    override operator fun `get`(index: Int): T {
        return when (index) {
            0 -> x
            1 -> y
            2 -> z
            else -> throw IndexOutOfBoundsException()
        }
    }

    operator fun `set`(index: Int, value: T) {
        when (index) {
            0 -> x = value
            1 -> y = value
            2 -> z = value
            else -> throw IndexOutOfBoundsException()
        }
    }
}

typealias MutVec3d = MutVec3<Double>
typealias MutVec3l = MutVec3<Long>
typealias MutVec3i = MutVec3<Int>
typealias MutVec3f = MutVec3<Float>
