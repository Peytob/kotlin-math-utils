package dev.peytob.math.vector.vec2

data class StructVec2f(
    override val x: Float,
    override val y: Float
) : Vec2f {

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Float.SIZE_BYTES * size
}