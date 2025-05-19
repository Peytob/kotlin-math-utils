package dev.peytob.math.vector.vec2

data class StructVec2d(
    override val x: Double,
    override val y: Double
) : Vec2d {

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Double.SIZE_BYTES * size
}