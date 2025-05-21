package dev.peytob.math.vector.vec3

data class StructVec3f(
    override val x: Float,
    override val y: Float,
    override val z: Float
) : Vec3f {

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Float.SIZE_BYTES * size
}