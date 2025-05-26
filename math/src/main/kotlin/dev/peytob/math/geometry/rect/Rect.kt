package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.Vec2

interface Rect<T : Number> {
    val position: Vec2<T>
    val size: Vec2<T>
}

typealias RectF = Rect<Float>
typealias RectI = Rect<Int>
