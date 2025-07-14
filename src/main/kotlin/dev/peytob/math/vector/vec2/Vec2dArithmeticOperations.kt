package dev.peytob.math.vector.vec2

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusVec2d")
operator fun Vec2d.unaryPlus(): Vec2d {
    return this
}

@JvmName("unaryMinusVec2d")
operator fun Vec2d.unaryMinus(): Vec2d {
    return StructVec2d(
        x = -x,
        y = -y
    )
}

/* + + PLUS + + */

@JvmName("plusVec2dVec2d")
fun Vec2d.plus(rx: Double, ry: Double): Vec2d {
    return StructVec2d(
        x = this.x + rx,
        y = this.y + ry
    )
}

@JvmName("plusVec2dVec2d")
operator fun Vec2d.plus(right: Vec2d): Vec2d {
    return StructVec2d(
        x = this.x + right.x,
        y = this.y + right.y
    )
}

@JvmName("plusVec2dScalard")
operator fun Vec2d.plus(right: Double): Vec2d {
    return StructVec2d(
        x = this.x + right,
        y = this.y + right
    )
}

@JvmName("plusVec2dVec2l")
fun Vec2d.plus(rx: Long, ry: Long): Vec2d {
    return StructVec2d(
        x = this.x + rx,
        y = this.y + ry
    )
}

@JvmName("plusVec2dVec2l")
operator fun Vec2d.plus(right: Vec2l): Vec2d {
    return StructVec2d(
        x = this.x + right.x,
        y = this.y + right.y
    )
}

@JvmName("plusVec2dScalarl")
operator fun Vec2d.plus(right: Long): Vec2d {
    return StructVec2d(
        x = this.x + right,
        y = this.y + right
    )
}

@JvmName("plusVec2dVec2i")
fun Vec2d.plus(rx: Int, ry: Int): Vec2d {
    return StructVec2d(
        x = this.x + rx,
        y = this.y + ry
    )
}

@JvmName("plusVec2dVec2i")
operator fun Vec2d.plus(right: Vec2i): Vec2d {
    return StructVec2d(
        x = this.x + right.x,
        y = this.y + right.y
    )
}

@JvmName("plusVec2dScalari")
operator fun Vec2d.plus(right: Int): Vec2d {
    return StructVec2d(
        x = this.x + right,
        y = this.y + right
    )
}

@JvmName("plusVec2dVec2f")
fun Vec2d.plus(rx: Float, ry: Float): Vec2d {
    return StructVec2d(
        x = this.x + rx,
        y = this.y + ry
    )
}

@JvmName("plusVec2dVec2f")
operator fun Vec2d.plus(right: Vec2f): Vec2d {
    return StructVec2d(
        x = this.x + right.x,
        y = this.y + right.y
    )
}

@JvmName("plusVec2dScalarf")
operator fun Vec2d.plus(right: Float): Vec2d {
    return StructVec2d(
        x = this.x + right,
        y = this.y + right
    )
}

/* - - MINUS - - */

@JvmName("minusVec2dVec2d")
fun Vec2d.minus(rx: Double, ry: Double): Vec2d {
    return StructVec2d(
        x = this.x - rx,
        y = this.y - ry
    )
}

@JvmName("minusVec2dVec2d")
operator fun Vec2d.minus(right: Vec2d): Vec2d {
    return StructVec2d(
        x = this.x - right.x,
        y = this.y - right.y
    )
}

@JvmName("minusVec2dScalard")
operator fun Vec2d.minus(right: Double): Vec2d {
    return StructVec2d(
        x = this.x - right,
        y = this.y - right
    )
}

@JvmName("minusVec2dVec2l")
fun Vec2d.minus(rx: Long, ry: Long): Vec2d {
    return StructVec2d(
        x = this.x - rx,
        y = this.y - ry
    )
}

@JvmName("minusVec2dVec2l")
operator fun Vec2d.minus(right: Vec2l): Vec2d {
    return StructVec2d(
        x = this.x - right.x,
        y = this.y - right.y
    )
}

@JvmName("minusVec2dScalarl")
operator fun Vec2d.minus(right: Long): Vec2d {
    return StructVec2d(
        x = this.x - right,
        y = this.y - right
    )
}

@JvmName("minusVec2dVec2i")
fun Vec2d.minus(rx: Int, ry: Int): Vec2d {
    return StructVec2d(
        x = this.x - rx,
        y = this.y - ry
    )
}

@JvmName("minusVec2dVec2i")
operator fun Vec2d.minus(right: Vec2i): Vec2d {
    return StructVec2d(
        x = this.x - right.x,
        y = this.y - right.y
    )
}

@JvmName("minusVec2dScalari")
operator fun Vec2d.minus(right: Int): Vec2d {
    return StructVec2d(
        x = this.x - right,
        y = this.y - right
    )
}

@JvmName("minusVec2dVec2f")
fun Vec2d.minus(rx: Float, ry: Float): Vec2d {
    return StructVec2d(
        x = this.x - rx,
        y = this.y - ry
    )
}

@JvmName("minusVec2dVec2f")
operator fun Vec2d.minus(right: Vec2f): Vec2d {
    return StructVec2d(
        x = this.x - right.x,
        y = this.y - right.y
    )
}

@JvmName("minusVec2dScalarf")
operator fun Vec2d.minus(right: Float): Vec2d {
    return StructVec2d(
        x = this.x - right,
        y = this.y - right
    )
}

/* * * TIMES * * */

@JvmName("timesVec2dVec2d")
fun Vec2d.times(rx: Double, ry: Double): Vec2d {
    return StructVec2d(
        x = this.x * rx,
        y = this.y * ry
    )
}

@JvmName("timesVec2dVec2d")
operator fun Vec2d.times(right: Vec2d): Vec2d {
    return StructVec2d(
        x = this.x * right.x,
        y = this.y * right.y
    )
}

@JvmName("timesVec2dScalard")
operator fun Vec2d.times(right: Double): Vec2d {
    return StructVec2d(
        x = this.x * right,
        y = this.y * right
    )
}

@JvmName("timesVec2dVec2l")
fun Vec2d.times(rx: Long, ry: Long): Vec2d {
    return StructVec2d(
        x = this.x * rx,
        y = this.y * ry
    )
}

@JvmName("timesVec2dVec2l")
operator fun Vec2d.times(right: Vec2l): Vec2d {
    return StructVec2d(
        x = this.x * right.x,
        y = this.y * right.y
    )
}

@JvmName("timesVec2dScalarl")
operator fun Vec2d.times(right: Long): Vec2d {
    return StructVec2d(
        x = this.x * right,
        y = this.y * right
    )
}

@JvmName("timesVec2dVec2i")
fun Vec2d.times(rx: Int, ry: Int): Vec2d {
    return StructVec2d(
        x = this.x * rx,
        y = this.y * ry
    )
}

@JvmName("timesVec2dVec2i")
operator fun Vec2d.times(right: Vec2i): Vec2d {
    return StructVec2d(
        x = this.x * right.x,
        y = this.y * right.y
    )
}

@JvmName("timesVec2dScalari")
operator fun Vec2d.times(right: Int): Vec2d {
    return StructVec2d(
        x = this.x * right,
        y = this.y * right
    )
}

@JvmName("timesVec2dVec2f")
fun Vec2d.times(rx: Float, ry: Float): Vec2d {
    return StructVec2d(
        x = this.x * rx,
        y = this.y * ry
    )
}

@JvmName("timesVec2dVec2f")
operator fun Vec2d.times(right: Vec2f): Vec2d {
    return StructVec2d(
        x = this.x * right.x,
        y = this.y * right.y
    )
}

@JvmName("timesVec2dScalarf")
operator fun Vec2d.times(right: Float): Vec2d {
    return StructVec2d(
        x = this.x * right,
        y = this.y * right
    )
}

/* * * DOT * * */

@JvmName("dotVec2dVec2d")
fun Vec2d.dot(rx: Double, ry: Double): Double {
    return this.x * rx + this.y * ry
}

@JvmName("dotVec2dVec2d")
fun Vec2d.dot(right: Vec2d): Double {
    return this.x * right.x + this.y * right.y
}

@JvmName("dotVec2dScalard")
fun Vec2d.dot(right: Double): Double {
    return this.x * right + this.y * right
}

@JvmName("dotVec2dVec2l")
fun Vec2d.dot(rx: Long, ry: Long): Double {
    return this.x * rx + this.y * ry
}

@JvmName("dotVec2dVec2l")
fun Vec2d.dot(right: Vec2l): Double {
    return this.x * right.x + this.y * right.y
}

@JvmName("dotVec2dScalarl")
fun Vec2d.dot(right: Long): Double {
    return this.x * right + this.y * right
}

@JvmName("dotVec2dVec2i")
fun Vec2d.dot(rx: Int, ry: Int): Double {
    return this.x * rx + this.y * ry
}

@JvmName("dotVec2dVec2i")
fun Vec2d.dot(right: Vec2i): Double {
    return this.x * right.x + this.y * right.y
}

@JvmName("dotVec2dScalari")
fun Vec2d.dot(right: Int): Double {
    return this.x * right + this.y * right
}

@JvmName("dotVec2dVec2f")
fun Vec2d.dot(rx: Float, ry: Float): Double {
    return this.x * rx + this.y * ry
}

@JvmName("dotVec2dVec2f")
fun Vec2d.dot(right: Vec2f): Double {
    return this.x * right.x + this.y * right.y
}

@JvmName("dotVec2dScalarf")
fun Vec2d.dot(right: Float): Double {
    return this.x * right + this.y * right
}
