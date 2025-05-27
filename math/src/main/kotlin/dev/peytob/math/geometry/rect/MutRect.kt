package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.MutVec2

interface MutRect<T : Number> : Rect<T> {
    override val position: MutVec2<T>

    override val size: MutVec2<T>

    override val mutable: Boolean
        get() = true
}

typealias MutRectF = MutRect<Float>
typealias MutRectI = MutRect<Int>
