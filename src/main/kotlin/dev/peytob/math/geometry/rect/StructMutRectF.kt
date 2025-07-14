package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.MutVec2

data class StructMutRectF(
    override val position: MutVec2<Float>,
    override val size: MutVec2<Float>
) : dev.peytob.math.geometry.rect.MutRectF
