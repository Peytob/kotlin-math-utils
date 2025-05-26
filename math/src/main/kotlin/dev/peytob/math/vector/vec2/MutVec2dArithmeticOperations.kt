package dev.peytob.math.vector.vec2

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusMutVec2d")
operator fun MutVec2d.unaryPlus(): MutVec2d {
    return this
}

@JvmName("unaryMinusMutVec2d")
operator fun MutVec2d.unaryMinus(): MutVec2d {
    this.x = -this.x
    this.y = -this.y
    return this
}

/* + + PLUS + + */

@JvmName("plusMutVec2dVec2d")
fun MutVec2d.plus(rx: Double, ry: Double): MutVec2d {
    this.x = this.x + rx
    this.y = this.y + ry
    return this
}

@JvmName("plusMutVec2dVec2d")
operator fun MutVec2d.plus(right: Vec2d): MutVec2d {
    this.x = this.x + right.x
    this.y = this.y + right.y
    return this
}

@JvmName("plusMutVec2dScalard")
operator fun MutVec2d.plus(right: Double): MutVec2d {
    this.x = this.x + right
    this.y = this.y + right
    return this
}

@JvmName("plusMutVec2dVec2l")
fun MutVec2d.plus(rx: Long, ry: Long): MutVec2d {
    this.x = this.x + rx
    this.y = this.y + ry
    return this
}

@JvmName("plusMutVec2dVec2l")
operator fun MutVec2d.plus(right: Vec2l): MutVec2d {
    this.x = this.x + right.x
    this.y = this.y + right.y
    return this
}

@JvmName("plusMutVec2dScalarl")
operator fun MutVec2d.plus(right: Long): MutVec2d {
    this.x = this.x + right
    this.y = this.y + right
    return this
}

@JvmName("plusMutVec2dVec2i")
fun MutVec2d.plus(rx: Int, ry: Int): MutVec2d {
    this.x = this.x + rx
    this.y = this.y + ry
    return this
}

@JvmName("plusMutVec2dVec2i")
operator fun MutVec2d.plus(right: Vec2i): MutVec2d {
    this.x = this.x + right.x
    this.y = this.y + right.y
    return this
}

@JvmName("plusMutVec2dScalari")
operator fun MutVec2d.plus(right: Int): MutVec2d {
    this.x = this.x + right
    this.y = this.y + right
    return this
}

@JvmName("plusMutVec2dVec2f")
fun MutVec2d.plus(rx: Float, ry: Float): MutVec2d {
    this.x = this.x + rx
    this.y = this.y + ry
    return this
}

@JvmName("plusMutVec2dVec2f")
operator fun MutVec2d.plus(right: Vec2f): MutVec2d {
    this.x = this.x + right.x
    this.y = this.y + right.y
    return this
}

@JvmName("plusMutVec2dScalarf")
operator fun MutVec2d.plus(right: Float): MutVec2d {
    this.x = this.x + right
    this.y = this.y + right
    return this
}

/* - - MINUS - - */

@JvmName("minusMutVec2dVec2d")
fun MutVec2d.minus(rx: Double, ry: Double): MutVec2d {
    this.x = this.x - rx
    this.y = this.y - ry
    return this
}

@JvmName("minusMutVec2dVec2d")
operator fun MutVec2d.minus(right: Vec2d): MutVec2d {
    this.x = this.x - right.x
    this.y = this.y - right.y
    return this
}

@JvmName("minusMutVec2dScalard")
operator fun MutVec2d.minus(right: Double): MutVec2d {
    this.x = this.x - right
    this.y = this.y - right
    return this
}

@JvmName("minusMutVec2dVec2l")
fun MutVec2d.minus(rx: Long, ry: Long): MutVec2d {
    this.x = this.x - rx
    this.y = this.y - ry
    return this
}

@JvmName("minusMutVec2dVec2l")
operator fun MutVec2d.minus(right: Vec2l): MutVec2d {
    this.x = this.x - right.x
    this.y = this.y - right.y
    return this
}

@JvmName("minusMutVec2dScalarl")
operator fun MutVec2d.minus(right: Long): MutVec2d {
    this.x = this.x - right
    this.y = this.y - right
    return this
}

@JvmName("minusMutVec2dVec2i")
fun MutVec2d.minus(rx: Int, ry: Int): MutVec2d {
    this.x = this.x - rx
    this.y = this.y - ry
    return this
}

@JvmName("minusMutVec2dVec2i")
operator fun MutVec2d.minus(right: Vec2i): MutVec2d {
    this.x = this.x - right.x
    this.y = this.y - right.y
    return this
}

@JvmName("minusMutVec2dScalari")
operator fun MutVec2d.minus(right: Int): MutVec2d {
    this.x = this.x - right
    this.y = this.y - right
    return this
}

@JvmName("minusMutVec2dVec2f")
fun MutVec2d.minus(rx: Float, ry: Float): MutVec2d {
    this.x = this.x - rx
    this.y = this.y - ry
    return this
}

@JvmName("minusMutVec2dVec2f")
operator fun MutVec2d.minus(right: Vec2f): MutVec2d {
    this.x = this.x - right.x
    this.y = this.y - right.y
    return this
}

@JvmName("minusMutVec2dScalarf")
operator fun MutVec2d.minus(right: Float): MutVec2d {
    this.x = this.x - right
    this.y = this.y - right
    return this
}

/* * * TIMES * * */

@JvmName("timesMutVec2dVec2d")
fun MutVec2d.times(rx: Double, ry: Double): MutVec2d {
    this.x = this.x * rx
    this.y = this.y * ry
    return this
}

@JvmName("timesMutVec2dVec2d")
operator fun MutVec2d.times(right: Vec2d): MutVec2d {
    this.x = this.x * right.x
    this.y = this.y * right.y
    return this
}

@JvmName("timesMutVec2dScalard")
operator fun MutVec2d.times(right: Double): MutVec2d {
    this.x = this.x * right
    this.y = this.y * right
    return this
}

@JvmName("timesMutVec2dVec2l")
fun MutVec2d.times(rx: Long, ry: Long): MutVec2d {
    this.x = this.x * rx
    this.y = this.y * ry
    return this
}

@JvmName("timesMutVec2dVec2l")
operator fun MutVec2d.times(right: Vec2l): MutVec2d {
    this.x = this.x * right.x
    this.y = this.y * right.y
    return this
}

@JvmName("timesMutVec2dScalarl")
operator fun MutVec2d.times(right: Long): MutVec2d {
    this.x = this.x * right
    this.y = this.y * right
    return this
}

@JvmName("timesMutVec2dVec2i")
fun MutVec2d.times(rx: Int, ry: Int): MutVec2d {
    this.x = this.x * rx
    this.y = this.y * ry
    return this
}

@JvmName("timesMutVec2dVec2i")
operator fun MutVec2d.times(right: Vec2i): MutVec2d {
    this.x = this.x * right.x
    this.y = this.y * right.y
    return this
}

@JvmName("timesMutVec2dScalari")
operator fun MutVec2d.times(right: Int): MutVec2d {
    this.x = this.x * right
    this.y = this.y * right
    return this
}

@JvmName("timesMutVec2dVec2f")
fun MutVec2d.times(rx: Float, ry: Float): MutVec2d {
    this.x = this.x * rx
    this.y = this.y * ry
    return this
}

@JvmName("timesMutVec2dVec2f")
operator fun MutVec2d.times(right: Vec2f): MutVec2d {
    this.x = this.x * right.x
    this.y = this.y * right.y
    return this
}

@JvmName("timesMutVec2dScalarf")
operator fun MutVec2d.times(right: Float): MutVec2d {
    this.x = this.x * right
    this.y = this.y * right
    return this
}
