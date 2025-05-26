package dev.peytob.math.vector.vec3

data class StructMutVec3l(
    override var x: Long,
    override var y: Long,
    override var z: Long
) : MutVec3l {

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Long.SIZE_BYTES * size

    override fun toString(): String = "mvec3l(x=$x, y=$y, z=$z)"
}