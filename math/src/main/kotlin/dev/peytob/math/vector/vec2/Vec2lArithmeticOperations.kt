package dev.peytob.math.vector.vec2

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusVec2l")
operator fun Vec2l.unaryPlus(): Vec2l {
    return this
}

@JvmName("unaryMinusVec2l")
operator fun Vec2l.unaryMinus(): Vec2l {
    return StructVec2l(
        x = -x,
        y = -y
    )
}

/* + + PLUS + + */

@JvmName("plusVec2lVec2d")
fun Vec2l.plus(rx: Double, ry: Double): Vec2l {
    return StructVec2l(
        x = (this.x + rx).toLong(),
        y = (this.y + ry).toLong()
    )
}

@JvmName("plusVec2lVec2d")
operator fun Vec2l.plus(right: Vec2d): Vec2l {
    return StructVec2l(
        x = (this.x + right.x).toLong(),
        y = (this.y + right.y).toLong()
    )
}

@JvmName("plusVec2lScalard")
operator fun Vec2l.plus(right: Double): Vec2l {
    return StructVec2l(
        x = (this.x + right).toLong(),
        y = (this.y + right).toLong()
    )
}

@JvmName("plusVec2lVec2l")
fun Vec2l.plus(rx: Long, ry: Long): Vec2l {
    return StructVec2l(
        x = this.x + rx,
        y = this.y + ry
    )
}

@JvmName("plusVec2lVec2l")
operator fun Vec2l.plus(right: Vec2l): Vec2l {
    return StructVec2l(
        x = this.x + right.x,
        y = this.y + right.y
    )
}

@JvmName("plusVec2lScalarl")
operator fun Vec2l.plus(right: Long): Vec2l {
    return StructVec2l(
        x = this.x + right,
        y = this.y + right
    )
}

@JvmName("plusVec2lVec2i")
fun Vec2l.plus(rx: Int, ry: Int): Vec2l {
    return StructVec2l(
        x = this.x + rx,
        y = this.y + ry
    )
}

@JvmName("plusVec2lVec2i")
operator fun Vec2l.plus(right: Vec2i): Vec2l {
    return StructVec2l(
        x = this.x + right.x,
        y = this.y + right.y
    )
}

@JvmName("plusVec2lScalari")
operator fun Vec2l.plus(right: Int): Vec2l {
    return StructVec2l(
        x = this.x + right,
        y = this.y + right
    )
}

@JvmName("plusVec2lVec2f")
fun Vec2l.plus(rx: Float, ry: Float): Vec2l {
    return StructVec2l(
        x = (this.x + rx).toLong(),
        y = (this.y + ry).toLong()
    )
}

@JvmName("plusVec2lVec2f")
operator fun Vec2l.plus(right: Vec2f): Vec2l {
    return StructVec2l(
        x = (this.x + right.x).toLong(),
        y = (this.y + right.y).toLong()
    )
}

@JvmName("plusVec2lScalarf")
operator fun Vec2l.plus(right: Float): Vec2l {
    return StructVec2l(
        x = (this.x + right).toLong(),
        y = (this.y + right).toLong()
    )
}

/* - - MINUS - - */

@JvmName("minusVec2lVec2d")
fun Vec2l.minus(rx: Double, ry: Double): Vec2l {
    return StructVec2l(
        x = (this.x - rx).toLong(),
        y = (this.y - ry).toLong()
    )
}

@JvmName("minusVec2lVec2d")
operator fun Vec2l.minus(right: Vec2d): Vec2l {
    return StructVec2l(
        x = (this.x - right.x).toLong(),
        y = (this.y - right.y).toLong()
    )
}

@JvmName("minusVec2lScalard")
operator fun Vec2l.minus(right: Double): Vec2l {
    return StructVec2l(
        x = (this.x - right).toLong(),
        y = (this.y - right).toLong()
    )
}

@JvmName("minusVec2lVec2l")
fun Vec2l.minus(rx: Long, ry: Long): Vec2l {
    return StructVec2l(
        x = this.x - rx,
        y = this.y - ry
    )
}

@JvmName("minusVec2lVec2l")
operator fun Vec2l.minus(right: Vec2l): Vec2l {
    return StructVec2l(
        x = this.x - right.x,
        y = this.y - right.y
    )
}

@JvmName("minusVec2lScalarl")
operator fun Vec2l.minus(right: Long): Vec2l {
    return StructVec2l(
        x = this.x - right,
        y = this.y - right
    )
}

@JvmName("minusVec2lVec2i")
fun Vec2l.minus(rx: Int, ry: Int): Vec2l {
    return StructVec2l(
        x = this.x - rx,
        y = this.y - ry
    )
}

@JvmName("minusVec2lVec2i")
operator fun Vec2l.minus(right: Vec2i): Vec2l {
    return StructVec2l(
        x = this.x - right.x,
        y = this.y - right.y
    )
}

@JvmName("minusVec2lScalari")
operator fun Vec2l.minus(right: Int): Vec2l {
    return StructVec2l(
        x = this.x - right,
        y = this.y - right
    )
}

@JvmName("minusVec2lVec2f")
fun Vec2l.minus(rx: Float, ry: Float): Vec2l {
    return StructVec2l(
        x = (this.x - rx).toLong(),
        y = (this.y - ry).toLong()
    )
}

@JvmName("minusVec2lVec2f")
operator fun Vec2l.minus(right: Vec2f): Vec2l {
    return StructVec2l(
        x = (this.x - right.x).toLong(),
        y = (this.y - right.y).toLong()
    )
}

@JvmName("minusVec2lScalarf")
operator fun Vec2l.minus(right: Float): Vec2l {
    return StructVec2l(
        x = (this.x - right).toLong(),
        y = (this.y - right).toLong()
    )
}

/* * * TIMES * * */

@JvmName("timesVec2lVec2d")
fun Vec2l.times(rx: Double, ry: Double): Vec2l {
    return StructVec2l(
        x = (this.x * rx).toLong(),
        y = (this.y * ry).toLong()
    )
}

@JvmName("timesVec2lVec2d")
operator fun Vec2l.times(right: Vec2d): Vec2l {
    return StructVec2l(
        x = (this.x * right.x).toLong(),
        y = (this.y * right.y).toLong()
    )
}

@JvmName("timesVec2lScalard")
operator fun Vec2l.times(right: Double): Vec2l {
    return StructVec2l(
        x = (this.x * right).toLong(),
        y = (this.y * right).toLong()
    )
}

@JvmName("timesVec2lVec2l")
fun Vec2l.times(rx: Long, ry: Long): Vec2l {
    return StructVec2l(
        x = this.x * rx,
        y = this.y * ry
    )
}

@JvmName("timesVec2lVec2l")
operator fun Vec2l.times(right: Vec2l): Vec2l {
    return StructVec2l(
        x = this.x * right.x,
        y = this.y * right.y
    )
}

@JvmName("timesVec2lScalarl")
operator fun Vec2l.times(right: Long): Vec2l {
    return StructVec2l(
        x = this.x * right,
        y = this.y * right
    )
}

@JvmName("timesVec2lVec2i")
fun Vec2l.times(rx: Int, ry: Int): Vec2l {
    return StructVec2l(
        x = this.x * rx,
        y = this.y * ry
    )
}

@JvmName("timesVec2lVec2i")
operator fun Vec2l.times(right: Vec2i): Vec2l {
    return StructVec2l(
        x = this.x * right.x,
        y = this.y * right.y
    )
}

@JvmName("timesVec2lScalari")
operator fun Vec2l.times(right: Int): Vec2l {
    return StructVec2l(
        x = this.x * right,
        y = this.y * right
    )
}

@JvmName("timesVec2lVec2f")
fun Vec2l.times(rx: Float, ry: Float): Vec2l {
    return StructVec2l(
        x = (this.x * rx).toLong(),
        y = (this.y * ry).toLong()
    )
}

@JvmName("timesVec2lVec2f")
operator fun Vec2l.times(right: Vec2f): Vec2l {
    return StructVec2l(
        x = (this.x * right.x).toLong(),
        y = (this.y * right.y).toLong()
    )
}

@JvmName("timesVec2lScalarf")
operator fun Vec2l.times(right: Float): Vec2l {
    return StructVec2l(
        x = (this.x * right).toLong(),
        y = (this.y * right).toLong()
    )
}

/* * * DOT * * */

@JvmName("dotVec2lVec2d")
fun Vec2l.dot(rx: Double, ry: Double): Long {
    return (this.x * rx + y * ry).toLong()
}

@JvmName("dotVec2lVec2d")
fun Vec2l.dot(right: Vec2d): Long {
    return (this.x * right.x + this.y * right.y).toLong()
}

@JvmName("dotVec2lScalard")
fun Vec2l.dot(right: Double): Long {
    return (this.x * right + this.y * right).toLong()
}

@JvmName("dotVec2lVec2l")
fun Vec2l.dot(rx: Long, ry: Long): Long {
    return this.x * rx + y * ry
}

@JvmName("dotVec2lVec2l")
fun Vec2l.dot(right: Vec2l): Long {
    return this.x * right.x + this.y * right.y
}

@JvmName("dotVec2lScalarl")
fun Vec2l.dot(right: Long): Long {
    return this.x * right + this.y * right
}

@JvmName("dotVec2lVec2i")
fun Vec2l.dot(rx: Int, ry: Int): Long {
    return this.x * rx + y * ry
}

@JvmName("dotVec2lVec2i")
fun Vec2l.dot(right: Vec2i): Long {
    return this.x * right.x + this.y * right.y
}

@JvmName("dotVec2lScalari")
fun Vec2l.dot(right: Int): Long {
    return this.x * right + this.y * right
}

@JvmName("dotVec2lVec2f")
fun Vec2l.dot(rx: Float, ry: Float): Long {
    return (this.x * rx + y * ry).toLong()
}

@JvmName("dotVec2lVec2f")
fun Vec2l.dot(right: Vec2f): Long {
    return (this.x * right.x + this.y * right.y).toLong()
}

@JvmName("dotVec2lScalarf")
fun Vec2l.dot(right: Float): Long {
    return (this.x * right + this.y * right).toLong()
}
