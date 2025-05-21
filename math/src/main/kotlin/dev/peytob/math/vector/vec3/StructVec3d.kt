package dev.peytob.math.vector.vec3

data class StructVec3d(
    override val x: Double,
    override val y: Double,
    override val z: Double
) : Vec3d {

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Double.SIZE_BYTES * size
}