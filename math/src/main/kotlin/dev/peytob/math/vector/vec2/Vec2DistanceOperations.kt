package dev.peytob.math.vector.vec2

import kotlin.math.sqrt

@JvmName(name = "distance2id")
fun distance(left: Vec2<Int>, right: Vec2<Double>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2di")
fun distance(lx: Double, ly: Double, rx: Int, ry: Int): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2ii")
fun distance(lx: Int, ly: Int, rx: Int, ry: Int): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2fl")
fun distance(lx: Float, ly: Float, rx: Long, ry: Long): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2if")
fun distance(left: Vec2<Int>, right: Vec2<Float>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2df")
fun distance(lx: Double, ly: Double, rx: Float, ry: Float): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2ld")
fun distance(left: Vec2<Long>, right: Vec2<Double>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2fl")
fun distance(left: Vec2<Float>, right: Vec2<Long>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2di")
fun distance(left: Vec2<Double>, right: Vec2<Int>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2ff")
fun distance(left: Vec2<Float>, right: Vec2<Float>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2ii")
fun distance(left: Vec2<Int>, right: Vec2<Int>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2dd")
fun distance(lx: Double, ly: Double, rx: Double, ry: Double): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2il")
fun distance(lx: Int, ly: Int, rx: Long, ry: Long): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2li")
fun distance(left: Vec2<Long>, right: Vec2<Int>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2il")
fun distance(left: Vec2<Int>, right: Vec2<Long>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2ll")
fun distance(lx: Long, ly: Long, rx: Long, ry: Long): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2fd")
fun distance(left: Vec2<Float>, right: Vec2<Double>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2id")
fun distance(lx: Int, ly: Int, rx: Double, ry: Double): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2fi")
fun distance(left: Vec2<Float>, right: Vec2<Int>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2ld")
fun distance(lx: Long, ly: Long, rx: Double, ry: Double): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2fi")
fun distance(lx: Float, ly: Float, rx: Int, ry: Int): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2ll")
fun distance(left: Vec2<Long>, right: Vec2<Long>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2dl")
fun distance(left: Vec2<Double>, right: Vec2<Long>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2lf")
fun distance(left: Vec2<Long>, right: Vec2<Float>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2lf")
fun distance(lx: Long, ly: Long, rx: Float, ry: Float): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2dd")
fun distance(left: Vec2<Double>, right: Vec2<Double>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2fd")
fun distance(lx: Float, ly: Float, rx: Double, ry: Double): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2dl")
fun distance(lx: Double, ly: Double, rx: Long, ry: Long): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2ff")
fun distance(lx: Float, ly: Float, rx: Float, ry: Float): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2df")
fun distance(left: Vec2<Double>, right: Vec2<Float>): Float {
    var s = 0.0
    s += (left.x - right.x) * (left.x - right.x)
    s += (left.y - right.y) * (left.y - right.y)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2if")
fun distance(lx: Int, ly: Int, rx: Float, ry: Float): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
@JvmName(name = "distance2li")
fun distance(lx: Long, ly: Long, rx: Int, ry: Int): Float {
    var s = 0.0
    s += (lx - rx) * (lx - rx)
    s += (ly - ry) * (ly - ry)
    return sqrt(s).toFloat()
}
