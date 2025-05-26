package dev.peytob.math.vector.vec3

data class StructVec3l(
    override val x: Long,
    override val y: Long,
    override val z: Long
) : Vec3l {

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Long.SIZE_BYTES * size

    override fun toString(): String = "vec3l(x=$x, y=$y, z=$z)"
}