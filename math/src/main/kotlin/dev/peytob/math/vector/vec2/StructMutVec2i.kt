package dev.peytob.math.vector.vec2

data class StructMutVec2i(
    override var x: Int,
    override var y: Int
) : MutVec2i {

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Int.SIZE_BYTES * size
}