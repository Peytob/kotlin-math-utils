package dev.peytob.math.vector.vec2

data class StructMutVec2d(
    override var x: Double,
    override var y: Double
) : MutVec2d {

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Double.SIZE_BYTES * size

    override fun toString(): String = "mvec2d(x=$x, y=$y)"
}