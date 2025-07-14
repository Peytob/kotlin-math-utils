package dev.peytob.math.vector.vec3

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusMutVec3f")
operator fun MutVec3f.unaryPlus(): MutVec3f {
    return this
}

@JvmName("unaryMinusMutVec3f")
operator fun MutVec3f.unaryMinus(): MutVec3f {
    this.x = -this.x
    this.y = -this.y
    this.z = -this.z
    return this
}

/* + + PLUS + + */

@JvmName("plusMutVec3fVec3d")
fun MutVec3f.plus(rx: Double, ry: Double, rz: Double): MutVec3f {
    this.x = (this.x + rx).toFloat()
    this.y = (this.y + ry).toFloat()
    this.z = (this.z + rz).toFloat()
    return this
}

@JvmName("plusMutVec3fVec3d")
operator fun MutVec3f.plus(right: Vec3d): MutVec3f {
    this.x = (this.x + right.x).toFloat()
    this.y = (this.y + right.y).toFloat()
    this.z = (this.z + right.z).toFloat()
    return this
}

@JvmName("plusMutVec3fScalard")
operator fun MutVec3f.plus(right: Double): MutVec3f {
    this.x = (this.x + right).toFloat()
    this.y = (this.y + right).toFloat()
    this.z = (this.z + right).toFloat()
    return this
}

@JvmName("plusMutVec3fVec3l")
fun MutVec3f.plus(rx: Long, ry: Long, rz: Long): MutVec3f {
    this.x = this.x + rx
    this.y = this.y + ry
    this.z = this.z + rz
    return this
}

@JvmName("plusMutVec3fVec3l")
operator fun MutVec3f.plus(right: Vec3l): MutVec3f {
    this.x = this.x + right.x
    this.y = this.y + right.y
    this.z = this.z + right.z
    return this
}

@JvmName("plusMutVec3fScalarl")
operator fun MutVec3f.plus(right: Long): MutVec3f {
    this.x = this.x + right
    this.y = this.y + right
    this.z = this.z + right
    return this
}

@JvmName("plusMutVec3fVec3i")
fun MutVec3f.plus(rx: Int, ry: Int, rz: Int): MutVec3f {
    this.x = this.x + rx
    this.y = this.y + ry
    this.z = this.z + rz
    return this
}

@JvmName("plusMutVec3fVec3i")
operator fun MutVec3f.plus(right: Vec3i): MutVec3f {
    this.x = this.x + right.x
    this.y = this.y + right.y
    this.z = this.z + right.z
    return this
}

@JvmName("plusMutVec3fScalari")
operator fun MutVec3f.plus(right: Int): MutVec3f {
    this.x = this.x + right
    this.y = this.y + right
    this.z = this.z + right
    return this
}

@JvmName("plusMutVec3fVec3f")
fun MutVec3f.plus(rx: Float, ry: Float, rz: Float): MutVec3f {
    this.x = this.x + rx
    this.y = this.y + ry
    this.z = this.z + rz
    return this
}

@JvmName("plusMutVec3fVec3f")
operator fun MutVec3f.plus(right: Vec3f): MutVec3f {
    this.x = this.x + right.x
    this.y = this.y + right.y
    this.z = this.z + right.z
    return this
}

@JvmName("plusMutVec3fScalarf")
operator fun MutVec3f.plus(right: Float): MutVec3f {
    this.x = this.x + right
    this.y = this.y + right
    this.z = this.z + right
    return this
}

/* - - MINUS - - */

@JvmName("minusMutVec3fVec3d")
fun MutVec3f.minus(rx: Double, ry: Double, rz: Double): MutVec3f {
    this.x = (this.x - rx).toFloat()
    this.y = (this.y - ry).toFloat()
    this.z = (this.z - rz).toFloat()
    return this
}

@JvmName("minusMutVec3fVec3d")
operator fun MutVec3f.minus(right: Vec3d): MutVec3f {
    this.x = (this.x - right.x).toFloat()
    this.y = (this.y - right.y).toFloat()
    this.z = (this.z - right.z).toFloat()
    return this
}

@JvmName("minusMutVec3fScalard")
operator fun MutVec3f.minus(right: Double): MutVec3f {
    this.x = (this.x - right).toFloat()
    this.y = (this.y - right).toFloat()
    this.z = (this.z - right).toFloat()
    return this
}

@JvmName("minusMutVec3fVec3l")
fun MutVec3f.minus(rx: Long, ry: Long, rz: Long): MutVec3f {
    this.x = this.x - rx
    this.y = this.y - ry
    this.z = this.z - rz
    return this
}

@JvmName("minusMutVec3fVec3l")
operator fun MutVec3f.minus(right: Vec3l): MutVec3f {
    this.x = this.x - right.x
    this.y = this.y - right.y
    this.z = this.z - right.z
    return this
}

@JvmName("minusMutVec3fScalarl")
operator fun MutVec3f.minus(right: Long): MutVec3f {
    this.x = this.x - right
    this.y = this.y - right
    this.z = this.z - right
    return this
}

@JvmName("minusMutVec3fVec3i")
fun MutVec3f.minus(rx: Int, ry: Int, rz: Int): MutVec3f {
    this.x = this.x - rx
    this.y = this.y - ry
    this.z = this.z - rz
    return this
}

@JvmName("minusMutVec3fVec3i")
operator fun MutVec3f.minus(right: Vec3i): MutVec3f {
    this.x = this.x - right.x
    this.y = this.y - right.y
    this.z = this.z - right.z
    return this
}

@JvmName("minusMutVec3fScalari")
operator fun MutVec3f.minus(right: Int): MutVec3f {
    this.x = this.x - right
    this.y = this.y - right
    this.z = this.z - right
    return this
}

@JvmName("minusMutVec3fVec3f")
fun MutVec3f.minus(rx: Float, ry: Float, rz: Float): MutVec3f {
    this.x = this.x - rx
    this.y = this.y - ry
    this.z = this.z - rz
    return this
}

@JvmName("minusMutVec3fVec3f")
operator fun MutVec3f.minus(right: Vec3f): MutVec3f {
    this.x = this.x - right.x
    this.y = this.y - right.y
    this.z = this.z - right.z
    return this
}

@JvmName("minusMutVec3fScalarf")
operator fun MutVec3f.minus(right: Float): MutVec3f {
    this.x = this.x - right
    this.y = this.y - right
    this.z = this.z - right
    return this
}

/* * * TIMES * * */

@JvmName("timesMutVec3fVec3d")
fun MutVec3f.times(rx: Double, ry: Double, rz: Double): MutVec3f {
    this.x = (this.x * rx).toFloat()
    this.y = (this.y * ry).toFloat()
    this.z = (this.z * rz).toFloat()
    return this
}

@JvmName("timesMutVec3fVec3d")
operator fun MutVec3f.times(right: Vec3d): MutVec3f {
    this.x = (this.x * right.x).toFloat()
    this.y = (this.y * right.y).toFloat()
    this.z = (this.z * right.z).toFloat()
    return this
}

@JvmName("timesMutVec3fScalard")
operator fun MutVec3f.times(right: Double): MutVec3f {
    this.x = (this.x * right).toFloat()
    this.y = (this.y * right).toFloat()
    this.z = (this.z * right).toFloat()
    return this
}

@JvmName("timesMutVec3fVec3l")
fun MutVec3f.times(rx: Long, ry: Long, rz: Long): MutVec3f {
    this.x = this.x * rx
    this.y = this.y * ry
    this.z = this.z * rz
    return this
}

@JvmName("timesMutVec3fVec3l")
operator fun MutVec3f.times(right: Vec3l): MutVec3f {
    this.x = this.x * right.x
    this.y = this.y * right.y
    this.z = this.z * right.z
    return this
}

@JvmName("timesMutVec3fScalarl")
operator fun MutVec3f.times(right: Long): MutVec3f {
    this.x = this.x * right
    this.y = this.y * right
    this.z = this.z * right
    return this
}

@JvmName("timesMutVec3fVec3i")
fun MutVec3f.times(rx: Int, ry: Int, rz: Int): MutVec3f {
    this.x = this.x * rx
    this.y = this.y * ry
    this.z = this.z * rz
    return this
}

@JvmName("timesMutVec3fVec3i")
operator fun MutVec3f.times(right: Vec3i): MutVec3f {
    this.x = this.x * right.x
    this.y = this.y * right.y
    this.z = this.z * right.z
    return this
}

@JvmName("timesMutVec3fScalari")
operator fun MutVec3f.times(right: Int): MutVec3f {
    this.x = this.x * right
    this.y = this.y * right
    this.z = this.z * right
    return this
}

@JvmName("timesMutVec3fVec3f")
fun MutVec3f.times(rx: Float, ry: Float, rz: Float): MutVec3f {
    this.x = this.x * rx
    this.y = this.y * ry
    this.z = this.z * rz
    return this
}

@JvmName("timesMutVec3fVec3f")
operator fun MutVec3f.times(right: Vec3f): MutVec3f {
    this.x = this.x * right.x
    this.y = this.y * right.y
    this.z = this.z * right.z
    return this
}

@JvmName("timesMutVec3fScalarf")
operator fun MutVec3f.times(right: Float): MutVec3f {
    this.x = this.x * right
    this.y = this.y * right
    this.z = this.z * right
    return this
}
