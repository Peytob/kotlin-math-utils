package dev.peytob.math.vector.vec3

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusVec3i")
operator fun Vec3i.unaryPlus(): Vec3i {
    return this
}

@JvmName("unaryMinusVec3i")
operator fun Vec3i.unaryMinus(): Vec3i {
    return StructVec3i(
        x = -x,
        y = -y,
        z = -z
    )
}

/* + + PLUS + + */

@JvmName("plusVec3iVec3d")
fun Vec3i.plus(rx: Double, ry: Double, rz: Double): Vec3i {
    return StructVec3i(
        x = (this.x + rx).toInt(),
        y = (this.y + ry).toInt(),
        z = (this.z + rz).toInt()
    )
}

@JvmName("plusVec3iVec3d")
operator fun Vec3i.plus(right: Vec3d): Vec3i {
    return StructVec3i(
        x = (this.x + right.x).toInt(),
        y = (this.y + right.y).toInt(),
        z = (this.z + right.z).toInt()
    )
}

@JvmName("plusVec3iScalard")
operator fun Vec3i.plus(right: Double): Vec3i {
    return StructVec3i(
        x = (this.x + right).toInt(),
        y = (this.y + right).toInt(),
        z = (this.z + right).toInt()
    )
}

@JvmName("plusVec3iVec3l")
fun Vec3i.plus(rx: Long, ry: Long, rz: Long): Vec3i {
    return StructVec3i(
        x = (this.x + rx).toInt(),
        y = (this.y + ry).toInt(),
        z = (this.z + rz).toInt()
    )
}

@JvmName("plusVec3iVec3l")
operator fun Vec3i.plus(right: Vec3l): Vec3i {
    return StructVec3i(
        x = (this.x + right.x).toInt(),
        y = (this.y + right.y).toInt(),
        z = (this.z + right.z).toInt()
    )
}

@JvmName("plusVec3iScalarl")
operator fun Vec3i.plus(right: Long): Vec3i {
    return StructVec3i(
        x = (this.x + right).toInt(),
        y = (this.y + right).toInt(),
        z = (this.z + right).toInt()
    )
}

@JvmName("plusVec3iVec3i")
fun Vec3i.plus(rx: Int, ry: Int, rz: Int): Vec3i {
    return StructVec3i(
        x = this.x + rx,
        y = this.y + ry,
        z = this.z + rz
    )
}

@JvmName("plusVec3iVec3i")
operator fun Vec3i.plus(right: Vec3i): Vec3i {
    return StructVec3i(
        x = this.x + right.x,
        y = this.y + right.y,
        z = this.z + right.z
    )
}

@JvmName("plusVec3iScalari")
operator fun Vec3i.plus(right: Int): Vec3i {
    return StructVec3i(
        x = this.x + right,
        y = this.y + right,
        z = this.z + right
    )
}

@JvmName("plusVec3iVec3f")
fun Vec3i.plus(rx: Float, ry: Float, rz: Float): Vec3i {
    return StructVec3i(
        x = (this.x + rx).toInt(),
        y = (this.y + ry).toInt(),
        z = (this.z + rz).toInt()
    )
}

@JvmName("plusVec3iVec3f")
operator fun Vec3i.plus(right: Vec3f): Vec3i {
    return StructVec3i(
        x = (this.x + right.x).toInt(),
        y = (this.y + right.y).toInt(),
        z = (this.z + right.z).toInt()
    )
}

@JvmName("plusVec3iScalarf")
operator fun Vec3i.plus(right: Float): Vec3i {
    return StructVec3i(
        x = (this.x + right).toInt(),
        y = (this.y + right).toInt(),
        z = (this.z + right).toInt()
    )
}

/* - - MINUS - - */

@JvmName("minusVec3iVec3d")
fun Vec3i.minus(rx: Double, ry: Double, rz: Double): Vec3i {
    return StructVec3i(
        x = (this.x - rx).toInt(),
        y = (this.y - ry).toInt(),
        z = (this.z - rz).toInt()
    )
}

@JvmName("minusVec3iVec3d")
operator fun Vec3i.minus(right: Vec3d): Vec3i {
    return StructVec3i(
        x = (this.x - right.x).toInt(),
        y = (this.y - right.y).toInt(),
        z = (this.z - right.z).toInt()
    )
}

@JvmName("minusVec3iScalard")
operator fun Vec3i.minus(right: Double): Vec3i {
    return StructVec3i(
        x = (this.x - right).toInt(),
        y = (this.y - right).toInt(),
        z = (this.z - right).toInt()
    )
}

@JvmName("minusVec3iVec3l")
fun Vec3i.minus(rx: Long, ry: Long, rz: Long): Vec3i {
    return StructVec3i(
        x = (this.x - rx).toInt(),
        y = (this.y - ry).toInt(),
        z = (this.z - rz).toInt()
    )
}

@JvmName("minusVec3iVec3l")
operator fun Vec3i.minus(right: Vec3l): Vec3i {
    return StructVec3i(
        x = (this.x - right.x).toInt(),
        y = (this.y - right.y).toInt(),
        z = (this.z - right.z).toInt()
    )
}

@JvmName("minusVec3iScalarl")
operator fun Vec3i.minus(right: Long): Vec3i {
    return StructVec3i(
        x = (this.x - right).toInt(),
        y = (this.y - right).toInt(),
        z = (this.z - right).toInt()
    )
}

@JvmName("minusVec3iVec3i")
fun Vec3i.minus(rx: Int, ry: Int, rz: Int): Vec3i {
    return StructVec3i(
        x = this.x - rx,
        y = this.y - ry,
        z = this.z - rz
    )
}

@JvmName("minusVec3iVec3i")
operator fun Vec3i.minus(right: Vec3i): Vec3i {
    return StructVec3i(
        x = this.x - right.x,
        y = this.y - right.y,
        z = this.z - right.z
    )
}

@JvmName("minusVec3iScalari")
operator fun Vec3i.minus(right: Int): Vec3i {
    return StructVec3i(
        x = this.x - right,
        y = this.y - right,
        z = this.z - right
    )
}

@JvmName("minusVec3iVec3f")
fun Vec3i.minus(rx: Float, ry: Float, rz: Float): Vec3i {
    return StructVec3i(
        x = (this.x - rx).toInt(),
        y = (this.y - ry).toInt(),
        z = (this.z - rz).toInt()
    )
}

@JvmName("minusVec3iVec3f")
operator fun Vec3i.minus(right: Vec3f): Vec3i {
    return StructVec3i(
        x = (this.x - right.x).toInt(),
        y = (this.y - right.y).toInt(),
        z = (this.z - right.z).toInt()
    )
}

@JvmName("minusVec3iScalarf")
operator fun Vec3i.minus(right: Float): Vec3i {
    return StructVec3i(
        x = (this.x - right).toInt(),
        y = (this.y - right).toInt(),
        z = (this.z - right).toInt()
    )
}

/* * * TIMES * * */

@JvmName("timesVec3iVec3d")
fun Vec3i.times(rx: Double, ry: Double, rz: Double): Vec3i {
    return StructVec3i(
        x = (this.x * rx).toInt(),
        y = (this.y * ry).toInt(),
        z = (this.z * rz).toInt()
    )
}

@JvmName("timesVec3iVec3d")
operator fun Vec3i.times(right: Vec3d): Vec3i {
    return StructVec3i(
        x = (this.x * right.x).toInt(),
        y = (this.y * right.y).toInt(),
        z = (this.z * right.z).toInt()
    )
}

@JvmName("timesVec3iScalard")
operator fun Vec3i.times(right: Double): Vec3i {
    return StructVec3i(
        x = (this.x * right).toInt(),
        y = (this.y * right).toInt(),
        z = (this.z * right).toInt()
    )
}

@JvmName("timesVec3iVec3l")
fun Vec3i.times(rx: Long, ry: Long, rz: Long): Vec3i {
    return StructVec3i(
        x = (this.x * rx).toInt(),
        y = (this.y * ry).toInt(),
        z = (this.z * rz).toInt()
    )
}

@JvmName("timesVec3iVec3l")
operator fun Vec3i.times(right: Vec3l): Vec3i {
    return StructVec3i(
        x = (this.x * right.x).toInt(),
        y = (this.y * right.y).toInt(),
        z = (this.z * right.z).toInt()
    )
}

@JvmName("timesVec3iScalarl")
operator fun Vec3i.times(right: Long): Vec3i {
    return StructVec3i(
        x = (this.x * right).toInt(),
        y = (this.y * right).toInt(),
        z = (this.z * right).toInt()
    )
}

@JvmName("timesVec3iVec3i")
fun Vec3i.times(rx: Int, ry: Int, rz: Int): Vec3i {
    return StructVec3i(
        x = this.x * rx,
        y = this.y * ry,
        z = this.z * rz
    )
}

@JvmName("timesVec3iVec3i")
operator fun Vec3i.times(right: Vec3i): Vec3i {
    return StructVec3i(
        x = this.x * right.x,
        y = this.y * right.y,
        z = this.z * right.z
    )
}

@JvmName("timesVec3iScalari")
operator fun Vec3i.times(right: Int): Vec3i {
    return StructVec3i(
        x = this.x * right,
        y = this.y * right,
        z = this.z * right
    )
}

@JvmName("timesVec3iVec3f")
fun Vec3i.times(rx: Float, ry: Float, rz: Float): Vec3i {
    return StructVec3i(
        x = (this.x * rx).toInt(),
        y = (this.y * ry).toInt(),
        z = (this.z * rz).toInt()
    )
}

@JvmName("timesVec3iVec3f")
operator fun Vec3i.times(right: Vec3f): Vec3i {
    return StructVec3i(
        x = (this.x * right.x).toInt(),
        y = (this.y * right.y).toInt(),
        z = (this.z * right.z).toInt()
    )
}

@JvmName("timesVec3iScalarf")
operator fun Vec3i.times(right: Float): Vec3i {
    return StructVec3i(
        x = (this.x * right).toInt(),
        y = (this.y * right).toInt(),
        z = (this.z * right).toInt()
    )
}

/* * * DOT * * */

@JvmName("dotVec3iVec3d")
fun Vec3i.dot(rx: Double, ry: Double, rz: Double): Int {
    return (this.x * rx + this.y * ry + this.z * rz).toInt()
}

@JvmName("dotVec3iVec3d")
fun Vec3i.dot(right: Vec3d): Int {
    return (this.x * right.x + this.y * right.y + this.z + right.z).toInt()
}

@JvmName("dotVec3iScalard")
fun Vec3i.dot(right: Double): Int {
    return (this.x * right + this.y * right + this.z * right).toInt()
}

@JvmName("dotVec3iVec3l")
fun Vec3i.dot(rx: Long, ry: Long, rz: Long): Int {
    return (this.x * rx + this.y * ry + this.z * rz).toInt()
}

@JvmName("dotVec3iVec3l")
fun Vec3i.dot(right: Vec3l): Int {
    return (this.x * right.x + this.y * right.y + this.z * right.z).toInt()
}

@JvmName("dotVec3iScalarl")
fun Vec3i.dot(right: Long): Int {
    return (this.x * right + this.y * right + this.z * right).toInt()
}

@JvmName("dotVec3iVec3i")
fun Vec3i.dot(rx: Int, ry: Int, rz: Int): Int {
    return this.x * rx + this.y * ry + this.z * rz
}

@JvmName("dotVec3iVec3i")
fun Vec3i.dot(right: Vec3i): Int {
    return this.x * right.x + this.y * right.y + this.z * right.z
}

@JvmName("dotVec3iScalari")
fun Vec3i.dot(right: Int): Int {
    return this.x * right + this.y * right + this.z * right
}

@JvmName("dotVec3iVec3f")
fun Vec3i.dot(rx: Float, ry: Float, rz: Float): Int {
    return (this.x * rx + this.y * ry + this.z * rz).toInt()
}

@JvmName("dotVec3iVec3f")
fun Vec3i.dot(right: Vec3f): Int {
    return (this.x * right.x + this.y * right.y + this.z * right.z).toInt()
}

@JvmName("dotVec3iScalarf")
fun Vec3i.dot(right: Float): Int {
    return (this.x * right + this.y * right + this.z * right).toInt()
}
