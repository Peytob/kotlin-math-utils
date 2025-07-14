package dev.peytob.math.vector.vec3

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusVec3f")
operator fun Vec3f.unaryPlus(): Vec3f {
    return this
}

@JvmName("unaryMinusVec3f")
operator fun Vec3f.unaryMinus(): Vec3f {
    return StructVec3f(
        x = -x,
        y = -y,
        z = -z
    )
}

/* + + PLUS + + */

@JvmName("plusVec3fVec3d")
fun Vec3f.plus(rx: Double, ry: Double, rz: Double): Vec3f {
    return StructVec3f(
        x = (this.x + rx).toFloat(),
        y = (this.y + ry).toFloat(),
        z = (this.z + rz).toFloat()
    )
}

@JvmName("plusVec3fVec3d")
operator fun Vec3f.plus(right: Vec3d): Vec3f {
    return StructVec3f(
        x = (this.x + right.x).toFloat(),
        y = (this.y + right.y).toFloat(),
        z = (this.z + right.z).toFloat()
    )
}

@JvmName("plusVec3fScalard")
operator fun Vec3f.plus(right: Double): Vec3f {
    return StructVec3f(
        x = (this.x + right).toFloat(),
        y = (this.y + right).toFloat(),
        z = (this.z + right).toFloat()
    )
}

@JvmName("plusVec3fVec3l")
fun Vec3f.plus(rx: Long, ry: Long, rz: Long): Vec3f {
    return StructVec3f(
        x = this.x + rx,
        y = this.y + ry,
        z = this.z + rz
    )
}

@JvmName("plusVec3fVec3l")
operator fun Vec3f.plus(right: Vec3l): Vec3f {
    return StructVec3f(
        x = this.x + right.x,
        y = this.y + right.y,
        z = this.z + right.z
    )
}

@JvmName("plusVec3fScalarl")
operator fun Vec3f.plus(right: Long): Vec3f {
    return StructVec3f(
        x = this.x + right,
        y = this.y + right,
        z = this.z + right
    )
}

@JvmName("plusVec3fVec3i")
fun Vec3f.plus(rx: Int, ry: Int, rz: Int): Vec3f {
    return StructVec3f(
        x = this.x + rx,
        y = this.y + ry,
        z = this.z + rz
    )
}

@JvmName("plusVec3fVec3i")
operator fun Vec3f.plus(right: Vec3i): Vec3f {
    return StructVec3f(
        x = this.x + right.x,
        y = this.y + right.y,
        z = this.z + right.z
    )
}

@JvmName("plusVec3fScalari")
operator fun Vec3f.plus(right: Int): Vec3f {
    return StructVec3f(
        x = this.x + right,
        y = this.y + right,
        z = this.z + right
    )
}

@JvmName("plusVec3fVec3f")
fun Vec3f.plus(rx: Float, ry: Float, rz: Float): Vec3f {
    return StructVec3f(
        x = this.x + rx,
        y = this.y + ry,
        z = this.z + rz
    )
}

@JvmName("plusVec3fVec3f")
operator fun Vec3f.plus(right: Vec3f): Vec3f {
    return StructVec3f(
        x = this.x + right.x,
        y = this.y + right.y,
        z = this.z + right.z
    )
}

@JvmName("plusVec3fScalarf")
operator fun Vec3f.plus(right: Float): Vec3f {
    return StructVec3f(
        x = this.x + right,
        y = this.y + right,
        z = this.z + right
    )
}

/* - - MINUS - - */

@JvmName("minusVec3fVec3d")
fun Vec3f.minus(rx: Double, ry: Double, rz: Double): Vec3f {
    return StructVec3f(
        x = (this.x - rx).toFloat(),
        y = (this.y - ry).toFloat(),
        z = (this.z - rz).toFloat()
    )
}

@JvmName("minusVec3fVec3d")
operator fun Vec3f.minus(right: Vec3d): Vec3f {
    return StructVec3f(
        x = (this.x - right.x).toFloat(),
        y = (this.y - right.y).toFloat(),
        z = (this.z - right.z).toFloat()
    )
}

@JvmName("minusVec3fScalard")
operator fun Vec3f.minus(right: Double): Vec3f {
    return StructVec3f(
        x = (this.x - right).toFloat(),
        y = (this.y - right).toFloat(),
        z = (this.z - right).toFloat()
    )
}

@JvmName("minusVec3fVec3l")
fun Vec3f.minus(rx: Long, ry: Long, rz: Long): Vec3f {
    return StructVec3f(
        x = this.x - rx,
        y = this.y - ry,
        z = this.z - rz
    )
}

@JvmName("minusVec3fVec3l")
operator fun Vec3f.minus(right: Vec3l): Vec3f {
    return StructVec3f(
        x = this.x - right.x,
        y = this.y - right.y,
        z = this.z - right.z
    )
}

@JvmName("minusVec3fScalarl")
operator fun Vec3f.minus(right: Long): Vec3f {
    return StructVec3f(
        x = this.x - right,
        y = this.y - right,
        z = this.z - right
    )
}

@JvmName("minusVec3fVec3i")
fun Vec3f.minus(rx: Int, ry: Int, rz: Int): Vec3f {
    return StructVec3f(
        x = this.x - rx,
        y = this.y - ry,
        z = this.z - rz
    )
}

@JvmName("minusVec3fVec3i")
operator fun Vec3f.minus(right: Vec3i): Vec3f {
    return StructVec3f(
        x = this.x - right.x,
        y = this.y - right.y,
        z = this.z - right.z
    )
}

@JvmName("minusVec3fScalari")
operator fun Vec3f.minus(right: Int): Vec3f {
    return StructVec3f(
        x = this.x - right,
        y = this.y - right,
        z = this.z - right
    )
}

@JvmName("minusVec3fVec3f")
fun Vec3f.minus(rx: Float, ry: Float, rz: Float): Vec3f {
    return StructVec3f(
        x = this.x - rx,
        y = this.y - ry,
        z = this.z - rz
    )
}

@JvmName("minusVec3fVec3f")
operator fun Vec3f.minus(right: Vec3f): Vec3f {
    return StructVec3f(
        x = this.x - right.x,
        y = this.y - right.y,
        z = this.z - right.z
    )
}

@JvmName("minusVec3fScalarf")
operator fun Vec3f.minus(right: Float): Vec3f {
    return StructVec3f(
        x = this.x - right,
        y = this.y - right,
        z = this.z - right
    )
}

/* * * TIMES * * */

@JvmName("timesVec3fVec3d")
fun Vec3f.times(rx: Double, ry: Double, rz: Double): Vec3f {
    return StructVec3f(
        x = (this.x * rx).toFloat(),
        y = (this.y * ry).toFloat(),
        z = (this.z * rz).toFloat()
    )
}

@JvmName("timesVec3fVec3d")
operator fun Vec3f.times(right: Vec3d): Vec3f {
    return StructVec3f(
        x = (this.x * right.x).toFloat(),
        y = (this.y * right.y).toFloat(),
        z = (this.z * right.z).toFloat()
    )
}

@JvmName("timesVec3fScalard")
operator fun Vec3f.times(right: Double): Vec3f {
    return StructVec3f(
        x = (this.x * right).toFloat(),
        y = (this.y * right).toFloat(),
        z = (this.z * right).toFloat()
    )
}

@JvmName("timesVec3fVec3l")
fun Vec3f.times(rx: Long, ry: Long, rz: Long): Vec3f {
    return StructVec3f(
        x = this.x * rx,
        y = this.y * ry,
        z = this.z * rz
    )
}

@JvmName("timesVec3fVec3l")
operator fun Vec3f.times(right: Vec3l): Vec3f {
    return StructVec3f(
        x = this.x * right.x,
        y = this.y * right.y,
        z = this.z * right.z
    )
}

@JvmName("timesVec3fScalarl")
operator fun Vec3f.times(right: Long): Vec3f {
    return StructVec3f(
        x = this.x * right,
        y = this.y * right,
        z = this.z * right
    )
}

@JvmName("timesVec3fVec3i")
fun Vec3f.times(rx: Int, ry: Int, rz: Int): Vec3f {
    return StructVec3f(
        x = this.x * rx,
        y = this.y * ry,
        z = this.z * rz
    )
}

@JvmName("timesVec3fVec3i")
operator fun Vec3f.times(right: Vec3i): Vec3f {
    return StructVec3f(
        x = this.x * right.x,
        y = this.y * right.y,
        z = this.z * right.z
    )
}

@JvmName("timesVec3fScalari")
operator fun Vec3f.times(right: Int): Vec3f {
    return StructVec3f(
        x = this.x * right,
        y = this.y * right,
        z = this.z * right
    )
}

@JvmName("timesVec3fVec3f")
fun Vec3f.times(rx: Float, ry: Float, rz: Float): Vec3f {
    return StructVec3f(
        x = this.x * rx,
        y = this.y * ry,
        z = this.z * rz
    )
}

@JvmName("timesVec3fVec3f")
operator fun Vec3f.times(right: Vec3f): Vec3f {
    return StructVec3f(
        x = this.x * right.x,
        y = this.y * right.y,
        z = this.z * right.z
    )
}

@JvmName("timesVec3fScalarf")
operator fun Vec3f.times(right: Float): Vec3f {
    return StructVec3f(
        x = this.x * right,
        y = this.y * right,
        z = this.z * right
    )
}

/* * * DOT * * */

@JvmName("dotVec3fVec3d")
fun Vec3f.dot(rx: Double, ry: Double, rz: Double): Float {
    return (this.x * rx + this.y * ry + this.z * rz).toFloat()
}

@JvmName("dotVec3fVec3d")
fun Vec3f.dot(right: Vec3d): Float {
    return (this.x * right.x + this.y * right.y + this.z + right.z).toFloat()
}

@JvmName("dotVec3fScalard")
fun Vec3f.dot(right: Double): Float {
    return (this.x * right + this.y * right + this.z * right).toFloat()
}

@JvmName("dotVec3fVec3l")
fun Vec3f.dot(rx: Long, ry: Long, rz: Long): Float {
    return this.x * rx + this.y * ry + this.z * rz
}

@JvmName("dotVec3fVec3l")
fun Vec3f.dot(right: Vec3l): Float {
    return this.x * right.x + this.y * right.y + this.z * right.z
}

@JvmName("dotVec3fScalarl")
fun Vec3f.dot(right: Long): Float {
    return this.x * right + this.y * right + this.z * right
}

@JvmName("dotVec3fVec3i")
fun Vec3f.dot(rx: Int, ry: Int, rz: Int): Float {
    return this.x * rx + this.y * ry + this.z * rz
}

@JvmName("dotVec3fVec3i")
fun Vec3f.dot(right: Vec3i): Float {
    return this.x * right.x + this.y * right.y + this.z * right.z
}

@JvmName("dotVec3fScalari")
fun Vec3f.dot(right: Int): Float {
    return this.x * right + this.y * right + this.z * right
}

@JvmName("dotVec3fVec3f")
fun Vec3f.dot(rx: Float, ry: Float, rz: Float): Float {
    return this.x * rx + this.y * ry + this.z * rz
}

@JvmName("dotVec3fVec3f")
fun Vec3f.dot(right: Vec3f): Float {
    return this.x * right.x + this.y * right.y + this.z * right.z
}

@JvmName("dotVec3fScalarf")
fun Vec3f.dot(right: Float): Float {
    return this.x * right + this.y * right + this.z * right
}
