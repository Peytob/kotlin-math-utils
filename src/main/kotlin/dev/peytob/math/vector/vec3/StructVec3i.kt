package dev.peytob.math.vector.vec3

data class StructVec3i(
    override val x: Int,
    override val y: Int,
    override val z: Int
) : Vec3i {

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Int.SIZE_BYTES * size

    override fun toString(): String = "vec3i(x=$x, y=$y, z=$z)"
}