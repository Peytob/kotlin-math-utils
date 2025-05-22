package dev.peytob.math.vector.vec3

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusVec3d")
operator fun Vec3d.unaryPlus(): Vec3d {
    return this
}

@JvmName("unaryMinusVec3d")
operator fun Vec3d.unaryMinus(): Vec3d {
    return StructVec3d(
        x = -x,
        y = -y,
        z = -z
    )
}

/* + + PLUS + + */

@JvmName("plusVec3dVec3d")
fun Vec3d.plus(rx: Double, ry: Double, rz: Double): Vec3d {
    return StructVec3d(
        x = this.x + rx,
        y = this.y + ry,
        z = this.z + rz
    )
}

@JvmName("plusVec3dVec3d")
operator fun Vec3d.plus(right: Vec3d): Vec3d {
    return StructVec3d(
        x = this.x + right.x,
        y = this.y + right.y,
        z = this.z + right.z
    )
}

@JvmName("plusVec3dScalard")
operator fun Vec3d.plus(right: Double): Vec3d {
    return StructVec3d(
        x = this.x + right,
        y = this.y + right,
        z = this.z + right
    )
}

@JvmName("plusVec3dVec3l")
fun Vec3d.plus(rx: Long, ry: Long, rz: Long): Vec3d {
    return StructVec3d(
        x = this.x + rx,
        y = this.y + ry,
        z = this.z + rz
    )
}

@JvmName("plusVec3dVec3l")
operator fun Vec3d.plus(right: Vec3l): Vec3d {
    return StructVec3d(
        x = this.x + right.x,
        y = this.y + right.y,
        z = this.z + right.z
    )
}

@JvmName("plusVec3dScalarl")
operator fun Vec3d.plus(right: Long): Vec3d {
    return StructVec3d(
        x = this.x + right,
        y = this.y + right,
        z = this.z + right
    )
}

@JvmName("plusVec3dVec3i")
fun Vec3d.plus(rx: Int, ry: Int, rz: Int): Vec3d {
    return StructVec3d(
        x = this.x + rx,
        y = this.y + ry,
        z = this.z + rz
    )
}

@JvmName("plusVec3dVec3i")
operator fun Vec3d.plus(right: Vec3i): Vec3d {
    return StructVec3d(
        x = this.x + right.x,
        y = this.y + right.y,
        z = this.z + right.z
    )
}

@JvmName("plusVec3dScalari")
operator fun Vec3d.plus(right: Int): Vec3d {
    return StructVec3d(
        x = this.x + right,
        y = this.y + right,
        z = this.z + right
    )
}

@JvmName("plusVec3dVec3f")
fun Vec3d.plus(rx: Float, ry: Float, rz: Float): Vec3d {
    return StructVec3d(
        x = this.x + rx,
        y = this.y + ry,
        z = this.z + rz
    )
}

@JvmName("plusVec3dVec3f")
operator fun Vec3d.plus(right: Vec3f): Vec3d {
    return StructVec3d(
        x = this.x + right.x,
        y = this.y + right.y,
        z = this.z + right.z
    )
}

@JvmName("plusVec3dScalarf")
operator fun Vec3d.plus(right: Float): Vec3d {
    return StructVec3d(
        x = this.x + right,
        y = this.y + right,
        z = this.z + right
    )
}

/* - - MINUS - - */

@JvmName("minusVec3dVec3d")
fun Vec3d.minus(rx: Double, ry: Double, rz: Double): Vec3d {
    return StructVec3d(
        x = this.x - rx,
        y = this.y - ry,
        z = this.z - rz,
    )
}

@JvmName("minusVec3dVec3d")
operator fun Vec3d.minus(right: Vec3d): Vec3d {
    return StructVec3d(
        x = this.x - right.x,
        y = this.y - right.y,
        z = this.z - right.z
    )
}

@JvmName("minusVec3dScalard")
operator fun Vec3d.minus(right: Double): Vec3d {
    return StructVec3d(
        x = this.x - right,
        y = this.y - right,
        z = this.z - right
    )
}

@JvmName("minusVec3dVec3l")
fun Vec3d.minus(rx: Long, ry: Long, rz: Long): Vec3d {
    return StructVec3d(
        x = this.x - rx,
        y = this.y - ry,
        z = this.z - rz
    )
}

@JvmName("minusVec3dVec3l")
operator fun Vec3d.minus(right: Vec3l): Vec3d {
    return StructVec3d(
        x = this.x - right.x,
        y = this.y - right.y,
        z = this.z - right.z
    )
}

@JvmName("minusVec3dScalarl")
operator fun Vec3d.minus(right: Long): Vec3d {
    return StructVec3d(
        x = this.x - right,
        y = this.y - right,
        z = this.z - right
    )
}

@JvmName("minusVec3dVec3i")
fun Vec3d.minus(rx: Int, ry: Int, rz: Int): Vec3d {
    return StructVec3d(
        x = this.x - rx,
        y = this.y - ry,
        z = this.z - rz
    )
}

@JvmName("minusVec3dVec3i")
operator fun Vec3d.minus(right: Vec3i): Vec3d {
    return StructVec3d(
        x = this.x - right.x,
        y = this.y - right.y,
        z = this.z - right.z
    )
}

@JvmName("minusVec3dScalari")
operator fun Vec3d.minus(right: Int): Vec3d {
    return StructVec3d(
        x = this.x - right,
        y = this.y - right,
        z = this.z - right
    )
}

@JvmName("minusVec3dVec3f")
fun Vec3d.minus(rx: Float, ry: Float, rz: Float): Vec3d {
    return StructVec3d(
        x = this.x - rx,
        y = this.y - ry,
        z = this.z - rz
    )
}

@JvmName("minusVec3dVec3f")
operator fun Vec3d.minus(right: Vec3f): Vec3d {
    return StructVec3d(
        x = this.x - right.x,
        y = this.y - right.y,
        z = this.z - right.z
    )
}

@JvmName("minusVec3dScalarf")
operator fun Vec3d.minus(right: Float): Vec3d {
    return StructVec3d(
        x = this.x - right,
        y = this.y - right,
        z = this.z - right
    )
}

/* * * TIMES * * */

@JvmName("timesVec3dVec3d")
fun Vec3d.times(rx: Double, ry: Double, rz: Double): Vec3d {
    return StructVec3d(
        x = this.x * rx,
        y = this.y * ry,
        z = this.z * rz
    )
}

@JvmName("timesVec3dVec3d")
operator fun Vec3d.times(right: Vec3d): Vec3d {
    return StructVec3d(
        x = this.x * right.x,
        y = this.y * right.y,
        z = this.z * right.z
    )
}

@JvmName("timesVec3dScalard")
operator fun Vec3d.times(right: Double): Vec3d {
    return StructVec3d(
        x = this.x * right,
        y = this.y * right,
        z = this.z * right
    )
}

@JvmName("timesVec3dVec3l")
fun Vec3d.times(rx: Long, ry: Long, rz: Long): Vec3d {
    return StructVec3d(
        x = this.x * rx,
        y = this.y * ry,
        z = this.z * rz
    )
}

@JvmName("timesVec3dVec3l")
operator fun Vec3d.times(right: Vec3l): Vec3d {
    return StructVec3d(
        x = this.x * right.x,
        y = this.y * right.y,
        z = this.z * right.z
    )
}

@JvmName("timesVec3dScalarl")
operator fun Vec3d.times(right: Long): Vec3d {
    return StructVec3d(
        x = this.x * right,
        y = this.y * right,
        z = this.z * right
    )
}

@JvmName("timesVec3dVec3i")
fun Vec3d.times(rx: Int, ry: Int, rz: Int): Vec3d {
    return StructVec3d(
        x = this.x * rx,
        y = this.y * ry,
        z = this.z * rz
    )
}

@JvmName("timesVec3dVec3i")
operator fun Vec3d.times(right: Vec3i): Vec3d {
    return StructVec3d(
        x = this.x * right.x,
        y = this.y * right.y,
        z = this.z * right.z
    )
}

@JvmName("timesVec3dScalari")
operator fun Vec3d.times(right: Int): Vec3d {
    return StructVec3d(
        x = this.x * right,
        y = this.y * right,
        z = this.z * right
    )
}

@JvmName("timesVec3dVec3f")
fun Vec3d.times(rx: Float, ry: Float, rz: Float): Vec3d {
    return StructVec3d(
        x = this.x * rx,
        y = this.y * ry,
        z = this.z * rz
    )
}

@JvmName("timesVec3dVec3f")
operator fun Vec3d.times(right: Vec3f): Vec3d {
    return StructVec3d(
        x = this.x * right.x,
        y = this.y * right.y,
        z = this.z * right.z
    )
}

@JvmName("timesVec3dScalarf")
operator fun Vec3d.times(right: Float): Vec3d {
    return StructVec3d(
        x = this.x * right,
        y = this.y * right,
        z = this.z * right
    )
}

/* * * DOT * * */

@JvmName("dotVec3dVec3d")
fun Vec3d.dot(rx: Double, ry: Double, rz: Double): Double {
    return this.x * rx + this.y * ry + this.z * rz
}

@JvmName("dotVec3dVec3d")
fun Vec3d.dot(right: Vec3d): Double {
    return this.x * right.x + this.y * right.y + this.z + right.z
}

@JvmName("dotVec3dScalard")
fun Vec3d.dot(right: Double): Double {
    return this.x * right + this.y * right + this.z * right
}

@JvmName("dotVec3dVec3l")
fun Vec3d.dot(rx: Long, ry: Long, rz: Long): Double {
    return this.x * rx + this.y * ry + this.z * rz
}

@JvmName("dotVec3dVec3l")
fun Vec3d.dot(right: Vec3l): Double {
    return this.x * right.x + this.y * right.y + this.z * right.z
}

@JvmName("dotVec3dScalarl")
fun Vec3d.dot(right: Long): Double {
    return this.x * right + this.y * right + this.z * right
}

@JvmName("dotVec3dVec3i")
fun Vec3d.dot(rx: Int, ry: Int, rz: Int): Double {
    return this.x * rx + this.y * ry + this.z * rz
}

@JvmName("dotVec3dVec3i")
fun Vec3d.dot(right: Vec3i): Double {
    return this.x * right.x + this.y * right.y + this.z * right.z
}

@JvmName("dotVec3dScalari")
fun Vec3d.dot(right: Int): Double {
    return this.x * right + this.y * right + this.z * right
}

@JvmName("dotVec3dVec3f")
fun Vec3d.dot(rx: Float, ry: Float, rz: Float): Double {
    return this.x * rx + this.y * ry + this.z * rz
}

@JvmName("dotVec3dVec3f")
fun Vec3d.dot(right: Vec3f): Double {
    return this.x * right.x + this.y * right.y + this.z * right.z
}

@JvmName("dotVec3dScalarf")
fun Vec3d.dot(right: Float): Double {
    return this.x * right + this.y * right + this.z * right
}
