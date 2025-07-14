package dev.peytob.math.vector.vec3

data class StructMutVec3f(
    override var x: Float,
    override var y: Float,
    override var z: Float
) : MutVec3f {

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Float.SIZE_BYTES * size

    override fun toString(): String = "mvec3f(x=$x, y=$y, z=$z)"
}