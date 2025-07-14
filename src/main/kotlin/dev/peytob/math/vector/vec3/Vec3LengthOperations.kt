package dev.peytob.math.vector.vec3

import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName
import kotlin.math.sqrt

@JvmName(name = "length3l")
fun Vec3<Long>.length(): Float {
    var s = 0.0
    s += this.x * this.x
    s += this.y * this.y
    s += this.z * this.z
    return sqrt(s).toFloat()
}

@JvmName(name = "length3l")
fun length(x: Long, y: Long, z: Long): Float {
    var s = 0.0
    s += x * x
    s += y * y
    s += z * z
    return sqrt(s).toFloat()
}

@JvmName(name = "length3i")
fun length(x: Int, y: Int, z: Int): Float {
    var s = 0.0
    s += x * x
    s += y * y
    s += z * z
    return sqrt(s).toFloat()
}

@JvmName(name = "length3d")
fun length(x: Double, y: Double, z: Double): Float {
    var s = 0.0
    s += x * x
    s += y * y
    s += z * z
    return sqrt(s).toFloat()
}

@JvmName(name = "length3f")
fun Vec3<Float>.length(): Float {
    var s = 0.0
    s += this.x * this.x
    s += this.y * this.y
    s += this.z * this.z
    return sqrt(s).toFloat()
}

@JvmName(name = "length3f")
fun length(x: Float, y: Float, z: Float): Float {
    var s = 0.0
    s += x * x
    s += y * y
    s += z * z
    return sqrt(s).toFloat()
}

@JvmName(name = "length3d")
fun Vec3<Double>.length(): Float {
    var s = 0.0
    s += this.x * this.x
    s += this.y * this.y
    s += this.z * this.z
    return sqrt(s).toFloat()
}

@JvmName(name = "length3i")
fun Vec3<Int>.length(): Float {
    var s = 0.0
    s += this.x * this.x
    s += this.y * this.y
    s += this.z * this.z
    return sqrt(s).toFloat()
}
