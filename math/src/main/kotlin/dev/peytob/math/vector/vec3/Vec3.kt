package dev.peytob.math.vector.vec3

import dev.peytob.math.vector.Vec

interface Vec3<T : Number> : Vec<T> {

    override val size: Int
        get() = 2

    val x: T

    val y: T

    val z: T

    override val mutable: Boolean
        get() = false

    override operator fun `get`(index: Int): T {
        return when (index) {
            0 -> x
            1 -> y
            2 -> z
            else -> throw IndexOutOfBoundsException()
        }
    }
}

typealias Vec3d = Vec3<Double>
typealias Vec3l = Vec3<Long>
typealias Vec3i = Vec3<Int>
typealias Vec3f = Vec3<Float>
