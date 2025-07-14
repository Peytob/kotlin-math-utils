package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.Vec2

data class StructRectF(
    override val position: Vec2<Float>,
    override val size: Vec2<Float>
) : dev.peytob.math.geometry.rect.RectF
