package dev.peytob.math.vector.vec2

data class StructMutVec2f(
    override var x: Float,
    override var y: Float
) : MutVec2f {

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Float.SIZE_BYTES * size
}