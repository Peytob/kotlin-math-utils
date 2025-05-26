package dev.peytob.math.vector.vec2

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusMutVec2l")
operator fun MutVec2l.unaryPlus(): MutVec2l {
    return this
}

@JvmName("unaryMinusMutVec2l")
operator fun MutVec2l.unaryMinus(): MutVec2l {
    this.x = -this.x
    this.y = -this.y
    return this
}

/* + + PLUS + + */

@JvmName("plusMutVec2lVec2d")
fun MutVec2l.plus(rx: Double, ry: Double): MutVec2l {
    this.x = (this.x + rx).toLong()
    this.y = (this.y + ry).toLong()
    return this
}

@JvmName("plusMutVec2lVec2d")
operator fun MutVec2l.plus(right: Vec2d): MutVec2l {
    this.x = (this.x + right.x).toLong()
    this.y = (this.y + right.y).toLong()
    return this
}

@JvmName("plusMutVec2lScalard")
operator fun MutVec2l.plus(right: Double): MutVec2l {
    this.x = (this.x + right).toLong()
    this.y = (this.y + right).toLong()
    return this
}

@JvmName("plusMutVec2lVec2l")
fun MutVec2l.plus(rx: Long, ry: Long): MutVec2l {
    this.x = (this.x + rx)
    this.y = (this.y + ry)
    return this
}

@JvmName("plusMutVec2lVec2l")
operator fun MutVec2l.plus(right: Vec2l): MutVec2l {
    this.x = this.x + right.x
    this.y = this.y + right.y
    return this
}

@JvmName("plusMutVec2lScalarl")
operator fun MutVec2l.plus(right: Long): MutVec2l {
    this.x = this.x + right
    this.y = this.y + right
    return this
}

@JvmName("plusMutVec2lVec2i")
fun MutVec2l.plus(rx: Int, ry: Int): MutVec2l {
    this.x = this.x + rx
    this.y = this.y + ry
    return this
}

@JvmName("plusMutVec2lVec2i")
operator fun MutVec2l.plus(right: Vec2i): MutVec2l {
    this.x = this.x + right.x
    this.y = this.y + right.y
    return this
}

@JvmName("plusMutVec2lScalari")
operator fun MutVec2l.plus(right: Int): MutVec2l {
    this.x = this.x + right
    this.y = this.y + right
    return this
}

@JvmName("plusMutVec2lVec2f")
fun MutVec2l.plus(rx: Float, ry: Float): MutVec2l {
    this.x = (this.x + rx).toLong()
    this.y = (this.y + ry).toLong()
    return this
}

@JvmName("plusMutVec2lVec2f")
operator fun MutVec2l.plus(right: Vec2f): MutVec2l {
    this.x = (this.x + right.x).toLong()
    this.y = (this.y + right.y).toLong()
    return this
}

@JvmName("plusMutVec2lScalarf")
operator fun MutVec2l.plus(right: Float): MutVec2l {
    this.x = (this.x + right).toLong()
    this.y = (this.y + right).toLong()
    return this
}

/* - - MINUS - - */

@JvmName("minusMutVec2lVec2d")
fun MutVec2l.minus(rx: Double, ry: Double): MutVec2l {
    this.x = (this.x - rx).toLong()
    this.y = (this.y - ry).toLong()
    return this
}

@JvmName("minusMutVec2lVec2d")
operator fun MutVec2l.minus(right: Vec2d): MutVec2l {
    this.x = (this.x - right.x).toLong()
    this.y = (this.y - right.y).toLong()
    return this
}

@JvmName("minusMutVec2lScalard")
operator fun MutVec2l.minus(right: Double): MutVec2l {
    this.x = (this.x - right).toLong()
    this.y = (this.y - right).toLong()
    return this
}

@JvmName("minusMutVec2lVec2l")
fun MutVec2l.minus(rx: Long, ry: Long): MutVec2l {
    this.x = this.x - rx
    this.y = this.y - ry
    return this
}

@JvmName("minusMutVec2lVec2l")
operator fun MutVec2l.minus(right: Vec2l): MutVec2l {
    this.x = (this.x - right.x)
    this.y = (this.y - right.y)
    return this
}

@JvmName("minusMutVec2lScalarl")
operator fun MutVec2l.minus(right: Long): MutVec2l {
    this.x = (this.x - right)
    this.y = (this.y - right)
    return this
}

@JvmName("minusMutVec2lVec2i")
fun MutVec2l.minus(rx: Int, ry: Int): MutVec2l {
    this.x = this.x - rx
    this.y = this.y - ry
    return this
}

@JvmName("minusMutVec2lVec2i")
operator fun MutVec2l.minus(right: Vec2i): MutVec2l {
    this.x = this.x - right.x
    this.y = this.y - right.y
    return this
}

@JvmName("minusMutVec2lScalari")
operator fun MutVec2l.minus(right: Int): MutVec2l {
    this.x = this.x - right
    this.y = this.y - right
    return this
}

@JvmName("minusMutVec2lVec2f")
fun MutVec2l.minus(rx: Float, ry: Float): MutVec2l {
    this.x = (this.x - rx).toLong()
    this.y = (this.y - ry).toLong()
    return this
}

@JvmName("minusMutVec2lVec2f")
operator fun MutVec2l.minus(right: Vec2f): MutVec2l {
    this.x = (this.x - right.x).toLong()
    this.y = (this.y - right.y).toLong()
    return this
}

@JvmName("minusMutVec2lScalarf")
operator fun MutVec2l.minus(right: Float): MutVec2l {
    this.x = (this.x - right).toLong()
    this.y = (this.y - right).toLong()
    return this
}

/* * * TIMES * * */

@JvmName("timesMutVec2lVec2d")
fun MutVec2l.times(rx: Double, ry: Double): MutVec2l {
    this.x = (this.x * rx).toLong()
    this.y = (this.y * ry).toLong()
    return this
}

@JvmName("timesMutVec2lVec2d")
operator fun MutVec2l.times(right: Vec2d): MutVec2l {
    this.x = (this.x * right.x).toLong()
    this.y = (this.y * right.y).toLong()
    return this
}

@JvmName("timesMutVec2lScalard")
operator fun MutVec2l.times(right: Double): MutVec2l {
    this.x = (this.x * right).toLong()
    this.y = (this.y * right).toLong()
    return this
}

@JvmName("timesMutVec2lVec2l")
fun MutVec2l.times(rx: Long, ry: Long): MutVec2l {
    this.x = this.x * rx
    this.y = this.y * ry
    return this
}

@JvmName("timesMutVec2lVec2l")
operator fun MutVec2l.times(right: Vec2l): MutVec2l {
    this.x = this.x * right.x
    this.y = this.y * right.y
    return this
}

@JvmName("timesMutVec2lScalarl")
operator fun MutVec2l.times(right: Long): MutVec2l {
    this.x = this.x * right
    this.y = this.y * right
    return this
}

@JvmName("timesMutVec2lVec2i")
fun MutVec2l.times(rx: Int, ry: Int): MutVec2l {
    this.x = this.x * rx
    this.y = this.y * ry
    return this
}

@JvmName("timesMutVec2lVec2i")
operator fun MutVec2l.times(right: Vec2i): MutVec2l {
    this.x = this.x * right.x
    this.y = this.y * right.y
    return this
}

@JvmName("timesMutVec2lScalari")
operator fun MutVec2l.times(right: Int): MutVec2l {
    this.x = this.x * right
    this.y = this.y * right
    return this
}

@JvmName("timesMutVec2lVec2f")
fun MutVec2l.times(rx: Float, ry: Float): MutVec2l {
    this.x = (this.x * rx).toLong()
    this.y = (this.y * ry).toLong()
    return this
}

@JvmName("timesMutVec2lVec2f")
operator fun MutVec2l.times(right: Vec2f): MutVec2l {
    this.x = (this.x * right.x).toLong()
    this.y = (this.y * right.y).toLong()
    return this
}

@JvmName("timesMutVec2lScalarf")
operator fun MutVec2l.times(right: Float): MutVec2l {
    this.x = (this.x * right).toLong()
    this.y = (this.y * right).toLong()
    return this
}
