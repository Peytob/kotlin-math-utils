package dev.peytob.math.vector.vec3

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusMutVec3l")
operator fun MutVec3l.unaryPlus(): MutVec3l {
    return this
}

@JvmName("unaryMinusMutVec3l")
operator fun MutVec3l.unaryMinus(): MutVec3l {
    this.x = -this.x
    this.y = -this.y
    this.z = -this.z
    return this
}

/* + + PLUS + + */

@JvmName("plusMutVec3lVec3d")
fun MutVec3l.plus(rx: Double, ry: Double, rz: Double): MutVec3l {
    this.x = (this.x + rx).toLong()
    this.y = (this.y + ry).toLong()
    this.z = (this.z + rz).toLong()
    return this
}

@JvmName("plusMutVec3lVec3d")
operator fun MutVec3l.plus(right: Vec3d): MutVec3l {
    this.x = (this.x + right.x).toLong()
    this.y = (this.y + right.y).toLong()
    this.z = (this.z + right.z).toLong()
    return this
}

@JvmName("plusMutVec3lScalard")
operator fun MutVec3l.plus(right: Double): MutVec3l {
    this.x = (this.x + right).toLong()
    this.y = (this.y + right).toLong()
    this.z = (this.z + right).toLong()
    return this
}

@JvmName("plusMutVec3lVec3l")
fun MutVec3l.plus(rx: Long, ry: Long, rz: Long): MutVec3l {
    this.x = this.x + rx
    this.y = this.y + ry
    this.z = this.z + rz
    return this
}

@JvmName("plusMutVec3lVec3l")
operator fun MutVec3l.plus(right: Vec3l): MutVec3l {
    this.x = this.x + right.x
    this.y = this.y + right.y
    this.z = this.z + right.z
    return this
}

@JvmName("plusMutVec3lScalarl")
operator fun MutVec3l.plus(right: Long): MutVec3l {
    this.x = this.x + right
    this.y = this.y + right
    this.z = this.z + right
    return this
}

@JvmName("plusMutVec3lVec3i")
fun MutVec3l.plus(rx: Int, ry: Int, rz: Int): MutVec3l {
    this.x = this.x + rx
    this.y = this.y + ry
    this.z = this.z + rz
    return this
}

@JvmName("plusMutVec3lVec3i")
operator fun MutVec3l.plus(right: Vec3i): MutVec3l {
    this.x = this.x + right.x
    this.y = this.y + right.y
    this.z = this.z + right.z
    return this
}

@JvmName("plusMutVec3lScalari")
operator fun MutVec3l.plus(right: Int): MutVec3l {
    this.x = this.x + right
    this.y = this.y + right
    this.z = this.z + right
    return this
}

@JvmName("plusMutVec3lVec3f")
fun MutVec3l.plus(rx: Float, ry: Float, rz: Float): MutVec3l {
    this.x = (this.x + rx).toLong()
    this.y = (this.y + ry).toLong()
    this.z = (this.z + rz).toLong()
    return this
}

@JvmName("plusMutVec3lVec3f")
operator fun MutVec3l.plus(right: Vec3f): MutVec3l {
    this.x = (this.x + right.x).toLong()
    this.y = (this.y + right.y).toLong()
    this.z = (this.z + right.z).toLong()
    return this
}

@JvmName("plusMutVec3lScalarf")
operator fun MutVec3l.plus(right: Float): MutVec3l {
    this.x = (this.x + right).toLong()
    this.y = (this.y + right).toLong()
    this.z = (this.z + right).toLong()
    return this
}

/* - - MINUS - - */

@JvmName("minusMutVec3lVec3d")
fun MutVec3l.minus(rx: Double, ry: Double, rz: Double): MutVec3l {
    this.x = (this.x - rx).toLong()
    this.y = (this.y - ry).toLong()
    this.z = (this.z - rz).toLong()
    return this
}

@JvmName("minusMutVec3lVec3d")
operator fun MutVec3l.minus(right: Vec3d): MutVec3l {
    this.x = (this.x - right.x).toLong()
    this.y = (this.y - right.y).toLong()
    this.z = (this.z - right.z).toLong()
    return this
}

@JvmName("minusMutVec3lScalard")
operator fun MutVec3l.minus(right: Double): MutVec3l {
    this.x = (this.x - right).toLong()
    this.y = (this.y - right).toLong()
    this.z = (this.z - right).toLong()
    return this
}

@JvmName("minusMutVec3lVec3l")
fun MutVec3l.minus(rx: Long, ry: Long, rz: Long): MutVec3l {
    this.x = this.x - rx
    this.y = this.y - ry
    this.z = this.z - rz
    return this
}

@JvmName("minusMutVec3lVec3l")
operator fun MutVec3l.minus(right: Vec3l): MutVec3l {
    this.x = this.x - right.x
    this.y = this.y - right.y
    this.z = this.z - right.z
    return this
}

@JvmName("minusMutVec3lScalarl")
operator fun MutVec3l.minus(right: Long): MutVec3l {
    this.x = this.x - right
    this.y = this.y - right
    this.z = this.z - right
    return this
}

@JvmName("minusMutVec3lVec3i")
fun MutVec3l.minus(rx: Int, ry: Int, rz: Int): MutVec3l {
    this.x = this.x - rx
    this.y = this.y - ry
    this.z = this.z - rz
    return this
}

@JvmName("minusMutVec3lVec3i")
operator fun MutVec3l.minus(right: Vec3i): MutVec3l {
    this.x = this.x - right.x
    this.y = this.y - right.y
    this.z = this.z - right.z
    return this
}

@JvmName("minusMutVec3lScalari")
operator fun MutVec3l.minus(right: Int): MutVec3l {
    this.x = this.x - right
    this.y = this.y - right
    this.z = this.z - right
    return this
}

@JvmName("minusMutVec3lVec3f")
fun MutVec3l.minus(rx: Float, ry: Float, rz: Float): MutVec3l {
    this.x = (this.x - rx).toLong()
    this.y = (this.y - ry).toLong()
    this.z = (this.z - rz).toLong()
    return this
}

@JvmName("minusMutVec3lVec3f")
operator fun MutVec3l.minus(right: Vec3f): MutVec3l {
    this.x = (this.x - right.x).toLong()
    this.y = (this.y - right.y).toLong()
    this.z = (this.z - right.z).toLong()
    return this
}

@JvmName("minusMutVec3lScalarf")
operator fun MutVec3l.minus(right: Float): MutVec3l {
    this.x = (this.x - right).toLong()
    this.y = (this.y - right).toLong()
    this.z = (this.z - right).toLong()
    return this
}

/* * * TIMES * * */

@JvmName("timesMutVec3lVec3d")
fun MutVec3l.times(rx: Double, ry: Double, rz: Double): MutVec3l {
    this.x = (this.x * rx).toLong()
    this.y = (this.y * ry).toLong()
    this.z = (this.z * rz).toLong()
    return this
}

@JvmName("timesMutVec3lVec3d")
operator fun MutVec3l.times(right: Vec3d): MutVec3l {
    this.x = (this.x * right.x).toLong()
    this.y = (this.y * right.y).toLong()
    this.z = (this.z * right.z).toLong()
    return this
}

@JvmName("timesMutVec3lScalard")
operator fun MutVec3l.times(right: Double): MutVec3l {
    this.x = (this.x * right).toLong()
    this.y = (this.y * right).toLong()
    this.z = (this.z * right).toLong()
    return this
}

@JvmName("timesMutVec3lVec3l")
fun MutVec3l.times(rx: Long, ry: Long, rz: Long): MutVec3l {
    this.x = this.x * rx
    this.y = this.y * ry
    this.z = this.z * rz
    return this
}

@JvmName("timesMutVec3lVec3l")
operator fun MutVec3l.times(right: Vec3l): MutVec3l {
    this.x = this.x * right.x
    this.y = this.y * right.y
    this.z = this.z * right.z
    return this
}

@JvmName("timesMutVec3lScalarl")
operator fun MutVec3l.times(right: Long): MutVec3l {
    this.x = this.x * right
    this.y = this.y * right
    this.z = this.z * right
    return this
}

@JvmName("timesMutVec3lVec3i")
fun MutVec3l.times(rx: Int, ry: Int, rz: Int): MutVec3l {
    this.x = this.x * rx
    this.y = this.y * ry
    this.z = this.z * rz
    return this
}

@JvmName("timesMutVec3lVec3i")
operator fun MutVec3l.times(right: Vec3i): MutVec3l {
    this.x = this.x * right.x
    this.y = this.y * right.y
    this.z = this.z * right.z
    return this
}

@JvmName("timesMutVec3lScalari")
operator fun MutVec3l.times(right: Int): MutVec3l {
    this.x = this.x * right
    this.y = this.y * right
    this.z = this.z * right
    return this
}

@JvmName("timesMutVec3lVec3f")
fun MutVec3l.times(rx: Float, ry: Float, rz: Float): MutVec3l {
    this.x = (this.x * rx).toLong()
    this.y = (this.y * ry).toLong()
    this.z = (this.z * rz).toLong()
    return this
}

@JvmName("timesMutVec3lVec3f")
operator fun MutVec3l.times(right: Vec3f): MutVec3l {
    this.x = (this.x * right.x).toLong()
    this.y = (this.y * right.y).toLong()
    this.z = (this.z * right.z).toLong()
    return this
}

@JvmName("timesMutVec3lScalarf")
operator fun MutVec3l.times(right: Float): MutVec3l {
    this.x = (this.x * right).toLong()
    this.y = (this.y * right).toLong()
    this.z = (this.z * right).toLong()
    return this
}
