package dev.peytob.math.vector.vec2

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusVec2f")
operator fun Vec2f.unaryPlus(): Vec2f {
    return this
}

@JvmName("unaryMinusVec2f")
operator fun Vec2f.unaryMinus(): Vec2f {
    return StructVec2f(
        x = -x,
        y = -y
    )
}

/* + + PLUS + + */

@JvmName("plusVec2fVec2d")
fun Vec2f.plus(rx: Double, ry: Double): Vec2f {
    return StructVec2f(
        x = (this.x + rx).toFloat(),
        y = (this.y + ry).toFloat()
    )
}

@JvmName("plusVec2fVec2d")
operator fun Vec2f.plus(right: Vec2d): Vec2f {
    return StructVec2f(
        x = (this.x + right.x).toFloat(),
        y = (this.y + right.y).toFloat()
    )
}

@JvmName("plusVec2fScalard")
operator fun Vec2f.plus(right: Double): Vec2f {
    return StructVec2f(
        x = (this.x + right).toFloat(),
        y = (this.y + right).toFloat()
    )
}

@JvmName("plusVec2fVec2l")
fun Vec2f.plus(rx: Long, ry: Long): Vec2f {
    return StructVec2f(
        x = this.x + rx,
        y = this.y + ry
    )
}

@JvmName("plusVec2fVec2l")
operator fun Vec2f.plus(right: Vec2l): Vec2f {
    return StructVec2f(
        x = this.x + right.x,
        y = this.y + right.y
    )
}

@JvmName("plusVec2fScalarl")
operator fun Vec2f.plus(right: Long): Vec2f {
    return StructVec2f(
        x = this.x + right,
        y = this.y + right
    )
}

@JvmName("plusVec2fVec2i")
fun Vec2f.plus(rx: Int, ry: Int): Vec2f {
    return StructVec2f(
        x = this.x + rx,
        y = this.y + ry
    )
}

@JvmName("plusVec2fVec2i")
operator fun Vec2f.plus(right: Vec2i): Vec2f {
    return StructVec2f(
        x = this.x + right.x,
        y = this.y + right.y
    )
}

@JvmName("plusVec2fScalari")
operator fun Vec2f.plus(right: Int): Vec2f {
    return StructVec2f(
        x = this.x + right,
        y = this.y + right
    )
}

@JvmName("plusVec2fVec2f")
fun Vec2f.plus(rx: Float, ry: Float): Vec2f {
    return StructVec2f(
        x = this.x + rx,
        y = this.y + ry
    )
}

@JvmName("plusVec2fVec2f")
operator fun Vec2f.plus(right: Vec2f): Vec2f {
    return StructVec2f(
        x = this.x + right.x,
        y = this.y + right.y
    )
}

@JvmName("plusVec2fScalarf")
operator fun Vec2f.plus(right: Float): Vec2f {
    return StructVec2f(
        x = this.x + right,
        y = this.y + right
    )
}

/* - - MINUS - - */

@JvmName("minusVec2fVec2d")
fun Vec2f.minus(rx: Double, ry: Double): Vec2f {
    return StructVec2f(
        x = (this.x - rx).toFloat(),
        y = (this.y - ry).toFloat()
    )
}

@JvmName("minusVec2fVec2d")
operator fun Vec2f.minus(right: Vec2d): Vec2f {
    return StructVec2f(
        x = (this.x - right.x).toFloat(),
        y = (this.y - right.y).toFloat()
    )
}

@JvmName("minusVec2fScalard")
operator fun Vec2f.minus(right: Double): Vec2f {
    return StructVec2f(
        x = (this.x - right).toFloat(),
        y = (this.y - right).toFloat()
    )
}

@JvmName("minusVec2fVec2l")
fun Vec2f.minus(rx: Long, ry: Long): Vec2f {
    return StructVec2f(
        x = this.x - rx,
        y = this.y - ry
    )
}

@JvmName("minusVec2fVec2l")
operator fun Vec2f.minus(right: Vec2l): Vec2f {
    return StructVec2f(
        x = this.x - right.x,
        y = this.y - right.y
    )
}

@JvmName("minusVec2fScalarl")
operator fun Vec2f.minus(right: Long): Vec2f {
    return StructVec2f(
        x = this.x - right,
        y = this.y - right
    )
}

@JvmName("minusVec2fVec2i")
fun Vec2f.minus(rx: Int, ry: Int): Vec2f {
    return StructVec2f(
        x = this.x - rx,
        y = this.y - ry
    )
}

@JvmName("minusVec2fVec2i")
operator fun Vec2f.minus(right: Vec2i): Vec2f {
    return StructVec2f(
        x = this.x - right.x,
        y = this.y - right.y
    )
}

@JvmName("minusVec2fScalari")
operator fun Vec2f.minus(right: Int): Vec2f {
    return StructVec2f(
        x = this.x - right,
        y = this.y - right
    )
}

@JvmName("minusVec2fVec2f")
fun Vec2f.minus(rx: Float, ry: Float): Vec2f {
    return StructVec2f(
        x = this.x - rx,
        y = this.y - ry
    )
}

@JvmName("minusVec2fVec2f")
operator fun Vec2f.minus(right: Vec2f): Vec2f {
    return StructVec2f(
        x = this.x - right.x,
        y = this.y - right.y
    )
}

@JvmName("minusVec2fScalarf")
operator fun Vec2f.minus(right: Float): Vec2f {
    return StructVec2f(
        x = this.x - right,
        y = this.y - right
    )
}

/* * * TIMES * * */

@JvmName("timesVec2fVec2d")
fun Vec2f.times(rx: Double, ry: Double): Vec2f {
    return StructVec2f(
        x = (this.x * rx).toFloat(),
        y = (this.y * ry).toFloat()
    )
}

@JvmName("timesVec2fVec2d")
operator fun Vec2f.times(right: Vec2d): Vec2f {
    return StructVec2f(
        x = (this.x * right.x).toFloat(),
        y = (this.y * right.y).toFloat()
    )
}

@JvmName("timesVec2fScalard")
operator fun Vec2f.times(right: Double): Vec2f {
    return StructVec2f(
        x = (this.x * right).toFloat(),
        y = (this.y * right).toFloat()
    )
}

@JvmName("timesVec2fVec2l")
fun Vec2f.times(rx: Long, ry: Long): Vec2f {
    return StructVec2f(
        x = this.x * rx,
        y = this.y * ry
    )
}

@JvmName("timesVec2fVec2l")
operator fun Vec2f.times(right: Vec2l): Vec2f {
    return StructVec2f(
        x = this.x * right.x,
        y = this.y * right.y
    )
}

@JvmName("timesVec2fScalarl")
operator fun Vec2f.times(right: Long): Vec2f {
    return StructVec2f(
        x = this.x * right,
        y = this.y * right
    )
}

@JvmName("timesVec2fVec2i")
fun Vec2f.times(rx: Int, ry: Int): Vec2f {
    return StructVec2f(
        x = this.x * rx,
        y = this.y * ry
    )
}

@JvmName("timesVec2fVec2i")
operator fun Vec2f.times(right: Vec2i): Vec2f {
    return StructVec2f(
        x = this.x * right.x,
        y = this.y * right.y
    )
}

@JvmName("timesVec2fScalari")
operator fun Vec2f.times(right: Int): Vec2f {
    return StructVec2f(
        x = this.x * right,
        y = this.y * right
    )
}

@JvmName("timesVec2fVec2f")
fun Vec2f.times(rx: Float, ry: Float): Vec2f {
    return StructVec2f(
        x = this.x * rx,
        y = this.y * ry
    )
}

@JvmName("timesVec2fVec2f")
operator fun Vec2f.times(right: Vec2f): Vec2f {
    return StructVec2f(
        x = this.x * right.x,
        y = this.y * right.y
    )
}

@JvmName("timesVec2fScalarf")
operator fun Vec2f.times(right: Float): Vec2f {
    return StructVec2f(
        x = this.x * right,
        y = this.y * right
    )
}

/* * * DOT * * */

@JvmName("dotVec2fVec2d")
fun Vec2f.dot(rx: Double, ry: Double): Float {
    return (this.x * rx + y * ry).toFloat()
}

@JvmName("dotVec2fVec2d")
fun Vec2f.dot(right: Vec2d): Float {
    return (this.x * right.x + this.y * right.y).toFloat()
}

@JvmName("dotVec2fScalard")
fun Vec2f.dot(right: Double): Float {
    return (this.x * right + this.y * right).toFloat()
}

@JvmName("dotVec2fVec2l")
fun Vec2f.dot(rx: Long, ry: Long): Float {
    return this.x * rx + y * ry
}

@JvmName("dotVec2fVec2l")
fun Vec2f.dot(right: Vec2l): Float {
    return this.x * right.x + this.y * right.y
}

@JvmName("dotVec2fScalarl")
fun Vec2f.dot(right: Long): Float {
    return this.x * right + this.y * right
}

@JvmName("dotVec2fVec2i")
fun Vec2f.dot(rx: Int, ry: Int): Float {
    return this.x * rx + y * ry
}

@JvmName("dotVec2fVec2i")
fun Vec2f.dot(right: Vec2i): Float {
    return this.x * right.x + this.y * right.y
}

@JvmName("dotVec2fScalari")
fun Vec2f.dot(right: Int): Float {
    return this.x * right + this.y * right
}

@JvmName("dotVec2fVec2f")
fun Vec2f.dot(rx: Float, ry: Float): Float {
    return this.x * rx + y * ry
}

@JvmName("dotVec2fVec2f")
fun Vec2f.dot(right: Vec2f): Float {
    return this.x * right.x + this.y * right.y
}

@JvmName("dotVec2fScalarf")
fun Vec2f.dot(right: Float): Float {
    return this.x * right + this.y * right
}
