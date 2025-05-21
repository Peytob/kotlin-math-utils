package dev.peytob.math.vector.vec3

data class StructMutVec3d(
    override var x: Double,
    override var y: Double,
    override var z: Double
) : MutVec3d {

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Double.SIZE_BYTES * size
}