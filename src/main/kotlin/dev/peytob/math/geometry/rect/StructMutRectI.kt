package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.MutVec2

data class StructMutRectI(
    override val position: MutVec2<Int>,
    override val size: MutVec2<Int>
) : dev.peytob.math.geometry.rect.MutRectI
