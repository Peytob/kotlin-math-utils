package dev.peytob.math.vector.vec3

data class StructMutVec3i(
    override var x: Int,
    override var y: Int,
    override var z: Int
) : MutVec3i {

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Int.SIZE_BYTES * size

    override fun toString(): String = "mvec3i(x=$x, y=$y, z=$z)"
}