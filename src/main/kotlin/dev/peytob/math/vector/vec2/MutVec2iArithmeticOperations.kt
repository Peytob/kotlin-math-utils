package dev.peytob.math.vector.vec2

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusMutVec2i")
operator fun MutVec2i.unaryPlus(): MutVec2i {
    return this
}

@JvmName("unaryMinusMutVec2i")
operator fun MutVec2i.unaryMinus(): MutVec2i {
    this.x = -this.x
    this.y = -this.y
    return this
}

/* + + PLUS + + */

@JvmName("plusMutVec2iVec2d")
fun MutVec2i.plus(rx: Double, ry: Double): MutVec2i {
    this.x = (this.x + rx).toInt()
    this.y = (this.y + ry).toInt()
    return this
}

@JvmName("plusMutVec2iVec2d")
operator fun MutVec2i.plus(right: Vec2d): MutVec2i {
    this.x = (this.x + right.x).toInt()
    this.y = (this.y + right.y).toInt()
    return this
}

@JvmName("plusMutVec2iScalard")
operator fun MutVec2i.plus(right: Double): MutVec2i {
    this.x = (this.x + right).toInt()
    this.y = (this.y + right).toInt()
    return this
}

@JvmName("plusMutVec2iVec2l")
fun MutVec2i.plus(rx: Long, ry: Long): MutVec2i {
    this.x = (this.x + rx).toInt()
    this.y = (this.y + ry).toInt()
    return this
}

@JvmName("plusMutVec2iVec2l")
operator fun MutVec2i.plus(right: Vec2l): MutVec2i {
    this.x = (this.x + right.x).toInt()
    this.y = (this.y + right.y).toInt()
    return this
}

@JvmName("plusMutVec2iScalarl")
operator fun MutVec2i.plus(right: Long): MutVec2i {
    this.x = (this.x + right).toInt()
    this.y = (this.y + right).toInt()
    return this
}

@JvmName("plusMutVec2iVec2i")
fun MutVec2i.plus(rx: Int, ry: Int): MutVec2i {
    this.x = this.x + rx
    this.y = this.y + ry
    return this
}

@JvmName("plusMutVec2iVec2i")
operator fun MutVec2i.plus(right: Vec2i): MutVec2i {
    this.x = this.x + right.x
    this.y = this.y + right.y
    return this
}

@JvmName("plusMutVec2iScalari")
operator fun MutVec2i.plus(right: Int): MutVec2i {
    this.x = this.x + right
    this.y = this.y + right
    return this
}

@JvmName("plusMutVec2iVec2f")
fun MutVec2i.plus(rx: Float, ry: Float): MutVec2i {
    this.x = (this.x + rx).toInt()
    this.y = (this.y + ry).toInt()
    return this
}

@JvmName("plusMutVec2iVec2f")
operator fun MutVec2i.plus(right: Vec2f): MutVec2i {
    this.x = (this.x + right.x).toInt()
    this.y = (this.y + right.y).toInt()
    return this
}

@JvmName("plusMutVec2iScalarf")
operator fun MutVec2i.plus(right: Float): MutVec2i {
    this.x = (this.x + right).toInt()
    this.y = (this.y + right).toInt()
    return this
}

/* - - MINUS - - */

@JvmName("minusMutVec2iVec2d")
fun MutVec2i.minus(rx: Double, ry: Double): MutVec2i {
    this.x = (this.x - rx).toInt()
    this.y = (this.y - ry).toInt()
    return this
}

@JvmName("minusMutVec2iVec2d")
operator fun MutVec2i.minus(right: Vec2d): MutVec2i {
    this.x = (this.x - right.x).toInt()
    this.y = (this.y - right.y).toInt()
    return this
}

@JvmName("minusMutVec2iScalard")
operator fun MutVec2i.minus(right: Double): MutVec2i {
    this.x = (this.x - right).toInt()
    this.y = (this.y - right).toInt()
    return this
}

@JvmName("minusMutVec2iVec2l")
fun MutVec2i.minus(rx: Long, ry: Long): MutVec2i {
    this.x = (this.x - rx).toInt()
    this.y = (this.y - ry).toInt()
    return this
}

@JvmName("minusMutVec2iVec2l")
operator fun MutVec2i.minus(right: Vec2l): MutVec2i {
    this.x = (this.x - right.x).toInt()
    this.y = (this.y - right.y).toInt()
    return this
}

@JvmName("minusMutVec2iScalarl")
operator fun MutVec2i.minus(right: Long): MutVec2i {
    this.x = (this.x - right).toInt()
    this.y = (this.y - right).toInt()
    return this
}

@JvmName("minusMutVec2iVec2i")
fun MutVec2i.minus(rx: Int, ry: Int): MutVec2i {
    this.x = this.x - rx
    this.y = this.y - ry
    return this
}

@JvmName("minusMutVec2iVec2i")
operator fun MutVec2i.minus(right: Vec2i): MutVec2i {
    this.x = this.x - right.x
    this.y = this.y - right.y
    return this
}

@JvmName("minusMutVec2iScalari")
operator fun MutVec2i.minus(right: Int): MutVec2i {
    this.x = this.x - right
    this.y = this.y - right
    return this
}

@JvmName("minusMutVec2iVec2f")
fun MutVec2i.minus(rx: Float, ry: Float): MutVec2i {
    this.x = (this.x - rx).toInt()
    this.y = (this.y - ry).toInt()
    return this
}

@JvmName("minusMutVec2iVec2f")
operator fun MutVec2i.minus(right: Vec2f): MutVec2i {
    this.x = (this.x - right.x).toInt()
    this.y = (this.y - right.y).toInt()
    return this
}

@JvmName("minusMutVec2iScalarf")
operator fun MutVec2i.minus(right: Float): MutVec2i {
    this.x = (this.x - right).toInt()
    this.y = (this.y - right).toInt()
    return this
}

/* * * TIMES * * */

@JvmName("timesMutVec2iVec2d")
fun MutVec2i.times(rx: Double, ry: Double): MutVec2i {
    this.x = (this.x * rx).toInt()
    this.y = (this.y * ry).toInt()
    return this
}

@JvmName("timesMutVec2iVec2d")
operator fun MutVec2i.times(right: Vec2d): MutVec2i {
    this.x = (this.x * right.x).toInt()
    this.y = (this.y * right.y).toInt()
    return this
}

@JvmName("timesMutVec2iScalard")
operator fun MutVec2i.times(right: Double): MutVec2i {
    this.x = (this.x * right).toInt()
    this.y = (this.y * right).toInt()
    return this
}

@JvmName("timesMutVec2iVec2l")
fun MutVec2i.times(rx: Long, ry: Long): MutVec2i {
    this.x = (this.x * rx).toInt()
    this.y = (this.y * ry).toInt()
    return this
}

@JvmName("timesMutVec2iVec2l")
operator fun MutVec2i.times(right: Vec2l): MutVec2i {
    this.x = (this.x * right.x).toInt()
    this.y = (this.y * right.y).toInt()
    return this
}

@JvmName("timesMutVec2iScalarl")
operator fun MutVec2i.times(right: Long): MutVec2i {
    this.x = (this.x * right).toInt()
    this.y = (this.y * right).toInt()
    return this
}

@JvmName("timesMutVec2iVec2i")
fun MutVec2i.times(rx: Int, ry: Int): MutVec2i {
    this.x = this.x * rx
    this.y = this.y * ry
    return this
}

@JvmName("timesMutVec2iVec2i")
operator fun MutVec2i.times(right: Vec2i): MutVec2i {
    this.x = this.x * right.x
    this.y = this.y * right.y
    return this
}

@JvmName("timesMutVec2iScalari")
operator fun MutVec2i.times(right: Int): MutVec2i {
    this.x = this.x * right
    this.y = this.y * right
    return this
}

@JvmName("timesMutVec2iVec2f")
fun MutVec2i.times(rx: Float, ry: Float): MutVec2i {
    this.x = (this.x * rx).toInt()
    this.y = (this.y * ry).toInt()
    return this
}

@JvmName("timesMutVec2iVec2f")
operator fun MutVec2i.times(right: Vec2f): MutVec2i {
    this.x = (this.x * right.x).toInt()
    this.y = (this.y * right.y).toInt()
    return this
}

@JvmName("timesMutVec2iScalarf")
operator fun MutVec2i.times(right: Float): MutVec2i {
    this.x = (this.x * right).toInt()
    this.y = (this.y * right).toInt()
    return this
}
