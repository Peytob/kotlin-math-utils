package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.Vec2f
import dev.peytob.math.vector.vec2.immutableVec2f

fun rectF(position: Vec2f, size: Vec2f): RectF {
    return StructRectF(
        position = immutableVec2f(position),
        size = immutableVec2f(size)
    )
}

fun rectF(positionX: Float, positionY: Float, sizeX: Float, sizeY: Float): RectF {
    return StructRectF(
        position = immutableVec2f(positionX, positionY),
        size = immutableVec2f(sizeX, sizeY)
    )
}
