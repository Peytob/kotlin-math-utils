package dev.peytob.math.vector.vec3

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusVec3l")
operator fun Vec3l.unaryPlus(): Vec3l {
    return this
}

@JvmName("unaryMinusVec3l")
operator fun Vec3l.unaryMinus(): Vec3l {
    return StructVec3l(
        x = -x,
        y = -y,
        z = -z
    )
}

/* + + PLUS + + */

@JvmName("plusVec3lVec3d")
fun Vec3l.plus(rx: Double, ry: Double, rz: Double): Vec3l {
    return StructVec3l(
        x = (this.x + rx).toLong(),
        y = (this.y + ry).toLong(),
        z = (this.z + rz).toLong()
    )
}

@JvmName("plusVec3lVec3d")
operator fun Vec3l.plus(right: Vec3d): Vec3l {
    return StructVec3l(
        x = (this.x + right.x).toLong(),
        y = (this.y + right.y).toLong(),
        z = (this.z + right.z).toLong()
    )
}

@JvmName("plusVec3lScalard")
operator fun Vec3l.plus(right: Double): Vec3l {
    return StructVec3l(
        x = (this.x + right).toLong(),
        y = (this.y + right).toLong(),
        z = (this.z + right).toLong()
    )
}

@JvmName("plusVec3lVec3l")
fun Vec3l.plus(rx: Long, ry: Long, rz: Long): Vec3l {
    return StructVec3l(
        x = this.x + rx,
        y = this.y + ry,
        z = this.z + rz
    )
}

@JvmName("plusVec3lVec3l")
operator fun Vec3l.plus(right: Vec3l): Vec3l {
    return StructVec3l(
        x = this.x + right.x,
        y = this.y + right.y,
        z = this.z + right.z
    )
}

@JvmName("plusVec3lScalarl")
operator fun Vec3l.plus(right: Long): Vec3l {
    return StructVec3l(
        x = this.x + right,
        y = this.y + right,
        z = this.z + right
    )
}

@JvmName("plusVec3lVec3i")
fun Vec3l.plus(rx: Int, ry: Int, rz: Int): Vec3l {
    return StructVec3l(
        x = this.x + rx,
        y = this.y + ry,
        z = this.z + rz
    )
}

@JvmName("plusVec3lVec3i")
operator fun Vec3l.plus(right: Vec3i): Vec3l {
    return StructVec3l(
        x = this.x + right.x,
        y = this.y + right.y,
        z = this.z + right.z
    )
}

@JvmName("plusVec3lScalari")
operator fun Vec3l.plus(right: Int): Vec3l {
    return StructVec3l(
        x = this.x + right,
        y = this.y + right,
        z = this.z + right
    )
}

@JvmName("plusVec3lVec3f")
fun Vec3l.plus(rx: Float, ry: Float, rz: Float): Vec3l {
    return StructVec3l(
        x = (this.x + rx).toLong(),
        y = (this.y + ry).toLong(),
        z = (this.z + rz).toLong()
    )
}

@JvmName("plusVec3lVec3f")
operator fun Vec3l.plus(right: Vec3f): Vec3l {
    return StructVec3l(
        x = (this.x + right.x).toLong(),
        y = (this.y + right.y).toLong(),
        z = (this.z + right.z).toLong()
    )
}

@JvmName("plusVec3lScalarf")
operator fun Vec3l.plus(right: Float): Vec3l {
    return StructVec3l(
        x = (this.x + right).toLong(),
        y = (this.y + right).toLong(),
        z = (this.z + right).toLong()
    )
}

/* - - MINUS - - */

@JvmName("minusVec3lVec3d")
fun Vec3l.minus(rx: Double, ry: Double, rz: Double): Vec3l {
    return StructVec3l(
        x = (this.x - rx).toLong(),
        y = (this.y - ry).toLong(),
        z = (this.z - rz).toLong(),
    )
}

@JvmName("minusVec3lVec3d")
operator fun Vec3l.minus(right: Vec3d): Vec3l {
    return StructVec3l(
        x = (this.x - right.x).toLong(),
        y = (this.y - right.y).toLong(),
        z = (this.z - right.z).toLong()
    )
}

@JvmName("minusVec3lScalard")
operator fun Vec3l.minus(right: Double): Vec3l {
    return StructVec3l(
        x = (this.x - right).toLong(),
        y = (this.y - right).toLong(),
        z = (this.z - right).toLong()
    )
}

@JvmName("minusVec3lVec3l")
fun Vec3l.minus(rx: Long, ry: Long, rz: Long): Vec3l {
    return StructVec3l(
        x = this.x - rx,
        y = this.y - ry,
        z = this.z - rz
    )
}

@JvmName("minusVec3lVec3l")
operator fun Vec3l.minus(right: Vec3l): Vec3l {
    return StructVec3l(
        x = this.x - right.x,
        y = this.y - right.y,
        z = this.z - right.z
    )
}

@JvmName("minusVec3lScalarl")
operator fun Vec3l.minus(right: Long): Vec3l {
    return StructVec3l(
        x = this.x - right,
        y = this.y - right,
        z = this.z - right
    )
}

@JvmName("minusVec3lVec3i")
fun Vec3l.minus(rx: Int, ry: Int, rz: Int): Vec3l {
    return StructVec3l(
        x = this.x - rx,
        y = this.y - ry,
        z = this.z - rz
    )
}

@JvmName("minusVec3lVec3i")
operator fun Vec3l.minus(right: Vec3i): Vec3l {
    return StructVec3l(
        x = this.x - right.x,
        y = this.y - right.y,
        z = this.z - right.z
    )
}

@JvmName("minusVec3lScalari")
operator fun Vec3l.minus(right: Int): Vec3l {
    return StructVec3l(
        x = this.x - right,
        y = this.y - right,
        z = this.z - right
    )
}

@JvmName("minusVec3lVec3f")
fun Vec3l.minus(rx: Float, ry: Float, rz: Float): Vec3l {
    return StructVec3l(
        x = (this.x - rx).toLong(),
        y = (this.y - ry).toLong(),
        z = (this.z - rz).toLong()
    )
}

@JvmName("minusVec3lVec3f")
operator fun Vec3l.minus(right: Vec3f): Vec3l {
    return StructVec3l(
        x = (this.x - right.x).toLong(),
        y = (this.y - right.y).toLong(),
        z = (this.z - right.z).toLong()
    )
}

@JvmName("minusVec3lScalarf")
operator fun Vec3l.minus(right: Float): Vec3l {
    return StructVec3l(
        x = (this.x - right).toLong(),
        y = (this.y - right).toLong(),
        z = (this.z - right).toLong()
    )
}

/* * * TIMES * * */

@JvmName("timesVec3lVec3d")
fun Vec3l.times(rx: Double, ry: Double, rz: Double): Vec3l {
    return StructVec3l(
        x = (this.x * rx).toLong(),
        y = (this.y * ry).toLong(),
        z = (this.z * rz).toLong()
    )
}

@JvmName("timesVec3lVec3d")
operator fun Vec3l.times(right: Vec3d): Vec3l {
    return StructVec3l(
        x = (this.x * right.x).toLong(),
        y = (this.y * right.y).toLong(),
        z = (this.z * right.z).toLong()
    )
}

@JvmName("timesVec3lScalard")
operator fun Vec3l.times(right: Double): Vec3l {
    return StructVec3l(
        x = (this.x * right).toLong(),
        y = (this.y * right).toLong(),
        z = (this.z * right).toLong()
    )
}

@JvmName("timesVec3lVec3l")
fun Vec3l.times(rx: Long, ry: Long, rz: Long): Vec3l {
    return StructVec3l(
        x = this.x * rx,
        y = this.y * ry,
        z = this.z * rz
    )
}

@JvmName("timesVec3lVec3l")
operator fun Vec3l.times(right: Vec3l): Vec3l {
    return StructVec3l(
        x = this.x * right.x,
        y = this.y * right.y,
        z = this.z * right.z
    )
}

@JvmName("timesVec3lScalarl")
operator fun Vec3l.times(right: Long): Vec3l {
    return StructVec3l(
        x = this.x * right,
        y = this.y * right,
        z = this.z * right
    )
}

@JvmName("timesVec3lVec3i")
fun Vec3l.times(rx: Int, ry: Int, rz: Int): Vec3l {
    return StructVec3l(
        x = this.x * rx,
        y = this.y * ry,
        z = this.z * rz
    )
}

@JvmName("timesVec3lVec3i")
operator fun Vec3l.times(right: Vec3i): Vec3l {
    return StructVec3l(
        x = this.x * right.x,
        y = this.y * right.y,
        z = this.z * right.z
    )
}

@JvmName("timesVec3lScalari")
operator fun Vec3l.times(right: Int): Vec3l {
    return StructVec3l(
        x = this.x * right,
        y = this.y * right,
        z = this.z * right
    )
}

@JvmName("timesVec3lVec3f")
fun Vec3l.times(rx: Float, ry: Float, rz: Float): Vec3l {
    return StructVec3l(
        x = (this.x * rx).toLong(),
        y = (this.y * ry).toLong(),
        z = (this.z * rz).toLong()
    )
}

@JvmName("timesVec3lVec3f")
operator fun Vec3l.times(right: Vec3f): Vec3l {
    return StructVec3l(
        x = (this.x * right.x).toLong(),
        y = (this.y * right.y).toLong(),
        z = (this.z * right.z).toLong()
    )
}

@JvmName("timesVec3lScalarf")
operator fun Vec3l.times(right: Float): Vec3l {
    return StructVec3l(
        x = (this.x * right).toLong(),
        y = (this.y * right).toLong(),
        z = (this.z * right).toLong()
    )
}

/* * * DOT * * */

@JvmName("dotVec3lVec3d")
fun Vec3l.dot(rx: Double, ry: Double, rz: Double): Long {
    return (this.x * rx + this.y * ry + this.z * rz).toLong()
}

@JvmName("dotVec3lVec3d")
fun Vec3l.dot(right: Vec3d): Long {
    return (this.x * right.x + this.y * right.y + this.z + right.z).toLong()
}

@JvmName("dotVec3lScalard")
fun Vec3l.dot(right: Double): Long {
    return (this.x * right + this.y * right + this.z * right).toLong()
}

@JvmName("dotVec3lVec3l")
fun Vec3l.dot(rx: Long, ry: Long, rz: Long): Long {
    return this.x * rx + this.y * ry + this.z * rz
}

@JvmName("dotVec3lVec3l")
fun Vec3l.dot(right: Vec3l): Long {
    return this.x * right.x + this.y * right.y + this.z * right.z
}

@JvmName("dotVec3lScalarl")
fun Vec3l.dot(right: Long): Long {
    return this.x * right + this.y * right + this.z * right
}

@JvmName("dotVec3lVec3i")
fun Vec3l.dot(rx: Int, ry: Int, rz: Int): Long {
    return this.x * rx + this.y * ry + this.z * rz
}

@JvmName("dotVec3lVec3i")
fun Vec3l.dot(right: Vec3i): Long {
    return this.x * right.x + this.y * right.y + this.z * right.z
}

@JvmName("dotVec3lScalari")
fun Vec3l.dot(right: Int): Long {
    return this.x * right + this.y * right + this.z * right
}

@JvmName("dotVec3lVec3f")
fun Vec3l.dot(rx: Float, ry: Float, rz: Float): Long {
    return (this.x * rx + this.y * ry + this.z * rz).toLong()
}

@JvmName("dotVec3lVec3f")
fun Vec3l.dot(right: Vec3f): Long {
    return (this.x * right.x + this.y * right.y + this.z * right.z).toLong()
}

@JvmName("dotVec3lScalarf")
fun Vec3l.dot(right: Float): Long {
    return (this.x * right + this.y * right + this.z * right).toLong()
}
