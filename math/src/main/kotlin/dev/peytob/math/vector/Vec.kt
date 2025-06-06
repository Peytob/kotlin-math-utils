package dev.peytob.math.vector

interface Vec<T : Number> {

    val elementSizeBytes: Int

    val vectorSizeBytes: Int

    val size: Int

    val mutable: Boolean

    operator fun `get`(index: Int): T
}
