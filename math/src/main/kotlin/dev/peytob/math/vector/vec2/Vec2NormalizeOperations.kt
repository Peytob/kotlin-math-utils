package dev.peytob.math.vector.vec2

import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName

@JvmName(name = "normalizeMutVec2l")
fun MutVec2<Long>.normalize(): MutVec2<Long> {
    val l = this.length()
    this.x = (this.x / l).toLong()
    this.y = (this.y / l).toLong()
    return this
}

@JvmName(name = "normalizeVec2i")
fun Vec2<Int>.normalize(): Vec2<Int> {
    val l = this.length()
    val x = (this.x / l).toInt()
    val y = (this.y / l).toInt()
    return StructVec2i(x = x, y = y)
}

@JvmName(name = "normalizeMutVec2i")
fun MutVec2<Int>.normalize(): MutVec2<Int> {
    val l = this.length()
    this.x = (this.x / l).toInt()
    this.y = (this.y / l).toInt()
    return this
}

@JvmName(name = "normalizeVec2d")
fun Vec2<Double>.normalize(): Vec2<Double> {
    val l = this.length()
    val x = (this.x / l)
    val y = (this.y / l)
    return StructVec2d(x = x, y = y)
}

@JvmName(name = "normalizeMutVec2f")
fun MutVec2<Float>.normalize(): MutVec2<Float> {
    val l = this.length()
    this.x = (this.x / l)
    this.y = (this.y / l)
    return this
}

@JvmName(name = "normalizeVec2f")
fun Vec2<Float>.normalize(): Vec2<Float> {
    val l = this.length()
    val x = (this.x / l)
    val y = (this.y / l)
    return StructVec2f(x = x, y = y)
}

@JvmName(name = "normalizeVec2l")
fun Vec2<Long>.normalize(): Vec2<Long> {
    val l = this.length()
    val x = (this.x / l).toLong()
    val y = (this.y / l).toLong()
    return StructVec2l(x = x, y = y)
}

@JvmName(name = "normalizeMutVec2d")
fun MutVec2<Double>.normalize(): MutVec2<Double> {
    val l = this.length()
    this.x = (this.x / l)
    this.y = (this.y / l)
    return this
}
