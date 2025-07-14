package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.Vec2f
import dev.peytob.math.vector.vec2.Vec2i
import dev.peytob.math.vector.vec2.immutableVec2f
import dev.peytob.math.vector.vec2.immutableVec2i

fun rectF(position: Vec2f, size: Vec2f): dev.peytob.math.geometry.rect.RectF {
    return dev.peytob.math.geometry.rect.StructRectF(
        position = immutableVec2f(position),
        size = immutableVec2f(size)
    )
}

fun rectF(positionX: Float, positionY: Float, sizeX: Float, sizeY: Float): dev.peytob.math.geometry.rect.RectF {
    return dev.peytob.math.geometry.rect.StructRectF(
        position = immutableVec2f(positionX, positionY),
        size = immutableVec2f(sizeX, sizeY)
    )
}

fun rectI(position: Vec2i, size: Vec2i): dev.peytob.math.geometry.rect.RectI {
    return dev.peytob.math.geometry.rect.StructRectI(
        position = immutableVec2i(position),
        size = immutableVec2i(size)
    )
}

fun rectI(positionX: Int, positionY: Int, sizeX: Int, sizeY: Int): dev.peytob.math.geometry.rect.RectI {
    return dev.peytob.math.geometry.rect.StructRectI(
        position = immutableVec2i(positionX, positionY),
        size = immutableVec2i(sizeX, sizeY)
    )
}
