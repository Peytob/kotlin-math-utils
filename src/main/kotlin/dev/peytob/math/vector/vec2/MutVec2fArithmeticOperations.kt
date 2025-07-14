package dev.peytob.math.vector.vec2

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusMutVec2f")
operator fun MutVec2f.unaryPlus(): MutVec2f {
    return this
}

@JvmName("unaryMinusMutVec2f")
operator fun MutVec2f.unaryMinus(): MutVec2f {
    this.x = -this.x
    this.y = -this.y
    return this
}

/* + + PLUS + + */

@JvmName("plusMutVec2fVec2d")
fun MutVec2f.plus(rx: Double, ry: Double): MutVec2f {
    this.x = (this.x + rx).toFloat()
    this.y = (this.y + ry).toFloat()
    return this
}

@JvmName("plusMutVec2fVec2d")
operator fun MutVec2f.plus(right: Vec2d): MutVec2f {
    this.x = (this.x + right.x).toFloat()
    this.y = (this.y + right.y).toFloat()
    return this
}

@JvmName("plusMutVec2fScalard")
operator fun MutVec2f.plus(right: Double): MutVec2f {
    this.x = (this.x + right).toFloat()
    this.y = (this.y + right).toFloat()
    return this
}

@JvmName("plusMutVec2fVec2l")
fun MutVec2f.plus(rx: Long, ry: Long): MutVec2f {
    this.x = this.x + rx
    this.y = this.y + ry
    return this
}

@JvmName("plusMutVec2fVec2l")
operator fun MutVec2f.plus(right: Vec2l): MutVec2f {
    this.x = this.x + right.x
    this.y = this.y + right.y
    return this
}

@JvmName("plusMutVec2fScalarl")
operator fun MutVec2f.plus(right: Long): MutVec2f {
    this.x = this.x + right
    this.y = this.y + right
    return this
}

@JvmName("plusMutVec2fVec2i")
fun MutVec2f.plus(rx: Int, ry: Int): MutVec2f {
    this.x = this.x + rx
    this.y = this.y + ry
    return this
}

@JvmName("plusMutVec2fVec2i")
operator fun MutVec2f.plus(right: Vec2i): MutVec2f {
    this.x = this.x + right.x
    this.y = this.y + right.y
    return this
}

@JvmName("plusMutVec2fScalari")
operator fun MutVec2f.plus(right: Int): MutVec2f {
    this.x = this.x + right
    this.y = this.y + right
    return this
}

@JvmName("plusMutVec2fVec2f")
fun MutVec2f.plus(rx: Float, ry: Float): MutVec2f {
    this.x = this.x + rx
    this.y = this.y + ry
    return this
}

@JvmName("plusMutVec2fVec2f")
operator fun MutVec2f.plus(right: Vec2f): MutVec2f {
    this.x = this.x + right.x
    this.y = this.y + right.y
    return this
}

@JvmName("plusMutVec2fScalarf")
operator fun MutVec2f.plus(right: Float): MutVec2f {
    this.x = this.x + right
    this.y = this.y + right
    return this
}

/* - - MINUS - - */

@JvmName("minusMutVec2fVec2d")
fun MutVec2f.minus(rx: Double, ry: Double): MutVec2f {
    this.x = (this.x - rx).toFloat()
    this.y = (this.y - ry).toFloat()
    return this
}

@JvmName("minusMutVec2fVec2d")
operator fun MutVec2f.minus(right: Vec2d): MutVec2f {
    this.x = (this.x - right.x).toFloat()
    this.y = (this.y - right.y).toFloat()
    return this
}

@JvmName("minusMutVec2fScalard")
operator fun MutVec2f.minus(right: Double): MutVec2f {
    this.x = (this.x - right).toFloat()
    this.y = (this.y - right).toFloat()
    return this
}

@JvmName("minusMutVec2fVec2l")
fun MutVec2f.minus(rx: Long, ry: Long): MutVec2f {
    this.x = this.x - rx
    this.y = this.y - ry
    return this
}

@JvmName("minusMutVec2fVec2l")
operator fun MutVec2f.minus(right: Vec2l): MutVec2f {
    this.x = this.x - right.x
    this.y = this.y - right.y
    return this
}

@JvmName("minusMutVec2fScalarl")
operator fun MutVec2f.minus(right: Long): MutVec2f {
    this.x = this.x - right
    this.y = this.y - right
    return this
}

@JvmName("minusMutVec2fVec2i")
fun MutVec2f.minus(rx: Int, ry: Int): MutVec2f {
    this.x = this.x - rx
    this.y = this.y - ry
    return this
}

@JvmName("minusMutVec2fVec2i")
operator fun MutVec2f.minus(right: Vec2i): MutVec2f {
    this.x = this.x - right.x
    this.y = this.y - right.y
    return this
}

@JvmName("minusMutVec2fScalari")
operator fun MutVec2f.minus(right: Int): MutVec2f {
    this.x = this.x - right
    this.y = this.y - right
    return this
}

@JvmName("minusMutVec2fVec2f")
fun MutVec2f.minus(rx: Float, ry: Float): MutVec2f {
    this.x = this.x - rx
    this.y = this.y - ry
    return this
}

@JvmName("minusMutVec2fVec2f")
operator fun MutVec2f.minus(right: Vec2f): MutVec2f {
    this.x = this.x - right.x
    this.y = this.y - right.y
    return this
}

@JvmName("minusMutVec2fScalarf")
operator fun MutVec2f.minus(right: Float): MutVec2f {
    this.x = this.x - right
    this.y = this.y - right
    return this
}

/* * * TIMES * * */

@JvmName("timesMutVec2fVec2d")
fun MutVec2f.times(rx: Double, ry: Double): MutVec2f {
    this.x = (this.x * rx).toFloat()
    this.y = (this.y * ry).toFloat()
    return this
}

@JvmName("timesMutVec2fVec2d")
operator fun MutVec2f.times(right: Vec2d): MutVec2f {
    this.x = (this.x * right.x).toFloat()
    this.y = (this.y * right.y).toFloat()
    return this
}

@JvmName("timesMutVec2fScalard")
operator fun MutVec2f.times(right: Double): MutVec2f {
    this.x = (this.x * right).toFloat()
    this.y = (this.y * right).toFloat()
    return this
}

@JvmName("timesMutVec2fVec2l")
fun MutVec2f.times(rx: Long, ry: Long): MutVec2f {
    this.x = this.x * rx
    this.y = this.y * ry
    return this
}

@JvmName("timesMutVec2fVec2l")
operator fun MutVec2f.times(right: Vec2l): MutVec2f {
    this.x = this.x * right.x
    this.y = this.y * right.y
    return this
}

@JvmName("timesMutVec2fScalarl")
operator fun MutVec2f.times(right: Long): MutVec2f {
    this.x = this.x * right
    this.y = this.y * right
    return this
}

@JvmName("timesMutVec2fVec2i")
fun MutVec2f.times(rx: Int, ry: Int): MutVec2f {
    this.x = this.x * rx
    this.y = this.y * ry
    return this
}

@JvmName("timesMutVec2fVec2i")
operator fun MutVec2f.times(right: Vec2i): MutVec2f {
    this.x = this.x * right.x
    this.y = this.y * right.y
    return this
}

@JvmName("timesMutVec2fScalari")
operator fun MutVec2f.times(right: Int): MutVec2f {
    this.x = this.x * right
    this.y = this.y * right
    return this
}

@JvmName("timesMutVec2fVec2f")
fun MutVec2f.times(rx: Float, ry: Float): MutVec2f {
    this.x = this.x * rx
    this.y = this.y * ry
    return this
}

@JvmName("timesMutVec2fVec2f")
operator fun MutVec2f.times(right: Vec2f): MutVec2f {
    this.x = this.x * right.x
    this.y = this.y * right.y
    return this
}

@JvmName("timesMutVec2fScalarf")
operator fun MutVec2f.times(right: Float): MutVec2f {
    this.x = this.x * right
    this.y = this.y * right
    return this
}
