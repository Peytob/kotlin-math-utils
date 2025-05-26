package dev.peytob.math.vector.vec2

import kotlin.math.sqrt

@JvmName(name = "length2d")
fun Vec2<Double>.length(): Float {
    var s = 0.0
    s += this.x * this.x
    s += this.y * this.y
    return sqrt(s).toFloat()
}

@JvmName(name = "length2l")
fun length(x: Long, y: Long): Float {
    var s = 0.0
    s += x * x
    s += y * y
    return sqrt(s).toFloat()
}

@JvmName(name = "length2d")
fun length(x: Double, y: Double): Float {
    var s = 0.0
    s += x * x
    s += y * y
    return sqrt(s).toFloat()
}

@JvmName(name = "length2i")
fun Vec2<Int>.length(): Float {
    var s = 0.0
    s += this.x * this.x
    s += this.y * this.y
    return sqrt(s).toFloat()
}

@JvmName(name = "length2l")
fun Vec2<Long>.length(): Float {
    var s = 0.0
    s += this.x * this.x
    s += this.y * this.y
    return sqrt(s).toFloat()
}

@JvmName(name = "length2f")
fun length(x: Float, y: Float): Float {
    var s = 0.0
    s += x * x
    s += y * y
    return sqrt(s).toFloat()
}

@JvmName(name = "length2i")
fun length(x: Int, y: Int): Float {
    var s = 0.0
    s += x * x
    s += y * y
    return sqrt(s).toFloat()
}

@JvmName(name = "length2f")
fun Vec2<Float>.length(): Float {
    var s = 0.0
    s += this.x * this.x
    s += this.y * this.y
    return sqrt(s).toFloat()
}
