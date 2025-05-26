package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.Vec2

data class StructRectI(
    override val position: Vec2<Int>,
    override val size: Vec2<Int>
) : RectI
