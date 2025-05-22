package dev.peytob.math.vector.vec2

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusVec2i")
operator fun Vec2i.unaryPlus(): Vec2i {
    return this
}

@JvmName("unaryMinusVec2i")
operator fun Vec2i.unaryMinus(): Vec2i {
    return StructVec2i(
        x = -x,
        y = -y
    )
}

/* + + PLUS + + */

@JvmName("plusVec2iVec2d")
fun Vec2i.plus(rx: Double, ry: Double): Vec2i {
    return StructVec2i(
        x = (this.x + rx).toInt(),
        y = (this.y + ry).toInt()
    )
}

@JvmName("plusVec2iVec2d")
operator fun Vec2i.plus(right: Vec2d): Vec2i {
    return StructVec2i(
        x = (this.x + right.x).toInt(),
        y = (this.y + right.y).toInt()
    )
}

@JvmName("plusVec2iScalard")
operator fun Vec2i.plus(right: Double): Vec2i {
    return StructVec2i(
        x = (this.x + right).toInt(),
        y = (this.y + right).toInt()
    )
}

@JvmName("plusVec2iVec2l")
fun Vec2i.plus(rx: Long, ry: Long): Vec2i {
    return StructVec2i(
        x = (this.x + rx).toInt(),
        y = (this.y + ry).toInt()
    )
}

@JvmName("plusVec2iVec2l")
operator fun Vec2i.plus(right: Vec2l): Vec2i {
    return StructVec2i(
        x = (this.x + right.x).toInt(),
        y = (this.y + right.y).toInt()
    )
}

@JvmName("plusVec2iScalarl")
operator fun Vec2i.plus(right: Long): Vec2i {
    return StructVec2i(
        x = (this.x + right).toInt(),
        y = (this.y + right).toInt()
    )
}

@JvmName("plusVec2iVec2i")
fun Vec2i.plus(rx: Int, ry: Int): Vec2i {
    return StructVec2i(
        x = this.x + rx,
        y = this.y + ry
    )
}

@JvmName("plusVec2iVec2i")
operator fun Vec2i.plus(right: Vec2i): Vec2i {
    return StructVec2i(
        x = this.x + right.x,
        y = this.y + right.y
    )
}

@JvmName("plusVec2iScalari")
operator fun Vec2i.plus(right: Int): Vec2i {
    return StructVec2i(
        x = this.x + right,
        y = this.y + right
    )
}

@JvmName("plusVec2iVec2f")
fun Vec2i.plus(rx: Float, ry: Float): Vec2i {
    return StructVec2i(
        x = (this.x + rx).toInt(),
        y = (this.y + ry).toInt()
    )
}

@JvmName("plusVec2iVec2f")
operator fun Vec2i.plus(right: Vec2f): Vec2i {
    return StructVec2i(
        x = (this.x + right.x).toInt(),
        y = (this.y + right.y).toInt()
    )
}

@JvmName("plusVec2iScalarf")
operator fun Vec2i.plus(right: Float): Vec2i {
    return StructVec2i(
        x = (this.x + right).toInt(),
        y = (this.y + right).toInt()
    )
}

/* - - MINUS - - */

@JvmName("minusVec2iVec2d")
fun Vec2i.minus(rx: Double, ry: Double): Vec2i {
    return StructVec2i(
        x = (this.x - rx).toInt(),
        y = (this.y - ry).toInt()
    )
}

@JvmName("minusVec2iVec2d")
operator fun Vec2i.minus(right: Vec2d): Vec2i {
    return StructVec2i(
        x = (this.x - right.x).toInt(),
        y = (this.y - right.y).toInt()
    )
}

@JvmName("minusVec2iScalard")
operator fun Vec2i.minus(right: Double): Vec2i {
    return StructVec2i(
        x = (this.x - right).toInt(),
        y = (this.y - right).toInt()
    )
}

@JvmName("minusVec2iVec2l")
fun Vec2i.minus(rx: Long, ry: Long): Vec2i {
    return StructVec2i(
        x = (this.x - rx).toInt(),
        y = (this.y - ry).toInt()
    )
}

@JvmName("minusVec2iVec2l")
operator fun Vec2i.minus(right: Vec2l): Vec2i {
    return StructVec2i(
        x = (this.x - right.x).toInt(),
        y = (this.y - right.y).toInt()
    )
}

@JvmName("minusVec2iScalarl")
operator fun Vec2i.minus(right: Long): Vec2i {
    return StructVec2i(
        x = (this.x - right).toInt(),
        y = (this.y - right).toInt()
    )
}

@JvmName("minusVec2iVec2i")
fun Vec2i.minus(rx: Int, ry: Int): Vec2i {
    return StructVec2i(
        x = this.x - rx,
        y = this.y - ry
    )
}

@JvmName("minusVec2iVec2i")
operator fun Vec2i.minus(right: Vec2i): Vec2i {
    return StructVec2i(
        x = this.x - right.x,
        y = this.y - right.y
    )
}

@JvmName("minusVec2iScalari")
operator fun Vec2i.minus(right: Int): Vec2i {
    return StructVec2i(
        x = this.x - right,
        y = this.y - right
    )
}

@JvmName("minusVec2iVec2f")
fun Vec2i.minus(rx: Float, ry: Float): Vec2i {
    return StructVec2i(
        x = (this.x - rx).toInt(),
        y = (this.y - ry).toInt()
    )
}

@JvmName("minusVec2iVec2f")
operator fun Vec2i.minus(right: Vec2f): Vec2i {
    return StructVec2i(
        x = (this.x - right.x).toInt(),
        y = (this.y - right.y).toInt()
    )
}

@JvmName("minusVec2iScalarf")
operator fun Vec2i.minus(right: Float): Vec2i {
    return StructVec2i(
        x = (this.x - right).toInt(),
        y = (this.y - right).toInt()
    )
}

/* * * TIMES * * */

@JvmName("timesVec2iVec2d")
fun Vec2i.times(rx: Double, ry: Double): Vec2i {
    return StructVec2i(
        x = (this.x * rx).toInt(),
        y = (this.y * ry).toInt()
    )
}

@JvmName("timesVec2iVec2d")
operator fun Vec2i.times(right: Vec2d): Vec2i {
    return StructVec2i(
        x = (this.x * right.x).toInt(),
        y = (this.y * right.y).toInt()
    )
}

@JvmName("timesVec2iScalard")
operator fun Vec2i.times(right: Double): Vec2i {
    return StructVec2i(
        x = (this.x * right).toInt(),
        y = (this.y * right).toInt()
    )
}

@JvmName("timesVec2iVec2l")
fun Vec2i.times(rx: Long, ry: Long): Vec2i {
    return StructVec2i(
        x = (this.x * rx).toInt(),
        y = (this.y * ry).toInt()
    )
}

@JvmName("timesVec2iVec2l")
operator fun Vec2i.times(right: Vec2l): Vec2i {
    return StructVec2i(
        x = (this.x * right.x).toInt(),
        y = (this.y * right.y).toInt()
    )
}

@JvmName("timesVec2iScalarl")
operator fun Vec2i.times(right: Long): Vec2i {
    return StructVec2i(
        x = (this.x * right).toInt(),
        y = (this.y * right).toInt()
    )
}

@JvmName("timesVec2iVec2i")
fun Vec2i.times(rx: Int, ry: Int): Vec2i {
    return StructVec2i(
        x = this.x * rx,
        y = this.y * ry
    )
}

@JvmName("timesVec2iVec2i")
operator fun Vec2i.times(right: Vec2i): Vec2i {
    return StructVec2i(
        x = this.x * right.x,
        y = this.y * right.y
    )
}

@JvmName("timesVec2iScalari")
operator fun Vec2i.times(right: Int): Vec2i {
    return StructVec2i(
        x = this.x * right,
        y = this.y * right
    )
}

@JvmName("timesVec2iVec2f")
fun Vec2i.times(rx: Float, ry: Float): Vec2i {
    return StructVec2i(
        x = (this.x * rx).toInt(),
        y = (this.y * ry).toInt()
    )
}

@JvmName("timesVec2iVec2f")
operator fun Vec2i.times(right: Vec2f): Vec2i {
    return StructVec2i(
        x = (this.x * right.x).toInt(),
        y = (this.y * right.y).toInt()
    )
}

@JvmName("timesVec2iScalarf")
operator fun Vec2i.times(right: Float): Vec2i {
    return StructVec2i(
        x = (this.x * right).toInt(),
        y = (this.y * right).toInt()
    )
}

/* * * DOT * * */

@JvmName("dotVec2iVec2d")
fun Vec2i.dot(rx: Double, ry: Double): Int {
    return (this.x * rx + this.y * ry).toInt()
}

@JvmName("dotVec2iVec2d")
fun Vec2i.dot(right: Vec2d): Int {
    return (this.x * right.x + this.y * right.y).toInt()
}

@JvmName("dotVec2iScalard")
fun Vec2i.dot(right: Double): Int {
    return (this.x * right + this.y * right).toInt()
}

@JvmName("dotVec2iVec2l")
fun Vec2i.dot(rx: Long, ry: Long): Int {
    return (this.x * rx + this.y * ry).toInt()
}

@JvmName("dotVec2iVec2l")
fun Vec2i.dot(right: Vec2l): Int {
    return (this.x * right.x + this.y * right.y).toInt()
}

@JvmName("dotVec2iScalarl")
fun Vec2i.dot(right: Long): Int {
    return (this.x * right + this.y * right).toInt()
}

@JvmName("dotVec2iVec2i")
fun Vec2i.dot(rx: Int, ry: Int): Int {
    return this.x * rx + this.y * ry
}

@JvmName("dotVec2iVec2i")
fun Vec2i.dot(right: Vec2i): Int {
    return this.x * right.x + this.y * right.y
}

@JvmName("dotVec2iScalari")
fun Vec2i.dot(right: Int): Int {
    return this.x * right + this.y * right
}

@JvmName("dotVec2iVec2f")
fun Vec2i.dot(rx: Float, ry: Float): Int {
    return (this.x * rx + this.y * ry).toInt()
}

@JvmName("dotVec2iVec2f")
fun Vec2i.dot(right: Vec2f): Int {
    return (this.x * right.x + this.y * right.y).toInt()
}

@JvmName("dotVec2iScalarf")
fun Vec2i.dot(right: Float): Int {
    return (this.x * right + this.y * right).toInt()
}
