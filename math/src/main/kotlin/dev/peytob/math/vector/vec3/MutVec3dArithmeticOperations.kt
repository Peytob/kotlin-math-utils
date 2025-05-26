package dev.peytob.math.vector.vec3

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusMutVec3d")
operator fun MutVec3d.unaryPlus(): MutVec3d {
    return this
}

@JvmName("unaryMinusMutVec3d")
operator fun MutVec3d.unaryMinus(): MutVec3d {
    this.x = -this.x
    this.y = -this.y
    this.z = -this.z
    return this
}

/* + + PLUS + + */

@JvmName("plusMutVec3dVec3d")
fun MutVec3d.plus(rx: Double, ry: Double, rz: Double): MutVec3d {
    this.x = this.x + rx
    this.y = this.y + ry
    this.z = this.z + rz
    return this
}

@JvmName("plusMutVec3dVec3d")
operator fun MutVec3d.plus(right: Vec3d): MutVec3d {
    this.x = this.x + right.x
    this.y = this.y + right.y
    this.z = this.z + right.z
    return this
}

@JvmName("plusMutVec3dScalard")
operator fun MutVec3d.plus(right: Double): MutVec3d {
    this.x = this.x + right
    this.y = this.y + right
    this.z = this.z + right
    return this
}

@JvmName("plusMutVec3dVec3l")
fun MutVec3d.plus(rx: Long, ry: Long, rz: Long): MutVec3d {
    this.x = this.x + rx
    this.y = this.y + ry
    this.z = this.z + rz
    return this
}

@JvmName("plusMutVec3dVec3l")
operator fun MutVec3d.plus(right: Vec3l): MutVec3d {
    this.x = this.x + right.x
    this.y = this.y + right.y
    this.z = this.z + right.z
    return this
}

@JvmName("plusMutVec3dScalarl")
operator fun MutVec3d.plus(right: Long): MutVec3d {
    this.x = this.x + right
    this.y = this.y + right
    this.z = this.z + right
    return this
}

@JvmName("plusMutVec3dVec3i")
fun MutVec3d.plus(rx: Int, ry: Int, rz: Int): MutVec3d {
    this.x = this.x + rx
    this.y = this.y + ry
    this.z = this.z + rz
    return this
}

@JvmName("plusMutVec3dVec3i")
operator fun MutVec3d.plus(right: Vec3i): MutVec3d {
    this.x = this.x + right.x
    this.y = this.y + right.y
    this.z = this.z + right.z
    return this
}

@JvmName("plusMutVec3dScalari")
operator fun MutVec3d.plus(right: Int): MutVec3d {
    this.x = this.x + right
    this.y = this.y + right
    this.z = this.z + right
    return this
}

@JvmName("plusMutVec3dVec3f")
fun MutVec3d.plus(rx: Float, ry: Float, rz: Float): MutVec3d {
    this.x = this.x + rx
    this.y = this.y + ry
    this.z = this.z + rz
    return this
}

@JvmName("plusMutVec3dVec3f")
operator fun MutVec3d.plus(right: Vec3f): MutVec3d {
    this.x = this.x + right.x
    this.y = this.y + right.y
    this.z = this.z + right.z
    return this
}

@JvmName("plusMutVec3dScalarf")
operator fun MutVec3d.plus(right: Float): MutVec3d {
    this.x = this.x + right
    this.y = this.y + right
    this.z = this.z + right
    return this
}

/* - - MINUS - - */

@JvmName("minusMutVec3dVec3d")
fun MutVec3d.minus(rx: Double, ry: Double, rz: Double): MutVec3d {
    this.x = this.x - rx
    this.y = this.y - ry
    this.z = this.z - rz
    return this
}

@JvmName("minusMutVec3dVec3d")
operator fun MutVec3d.minus(right: Vec3d): MutVec3d {
    this.x = this.x - right.x
    this.y = this.y - right.y
    this.z = this.z - right.z
    return this
}

@JvmName("minusMutVec3dScalard")
operator fun MutVec3d.minus(right: Double): MutVec3d {
    this.x = this.x - right
    this.y = this.y - right
    this.z = this.z - right
    return this
}

@JvmName("minusMutVec3dVec3l")
fun MutVec3d.minus(rx: Long, ry: Long, rz: Long): MutVec3d {
    this.x = this.x - rx
    this.y = this.y - ry
    this.z = this.z - rz
    return this
}

@JvmName("minusMutVec3dVec3l")
operator fun MutVec3d.minus(right: Vec3l): MutVec3d {
    this.x = this.x - right.x
    this.y = this.y - right.y
    this.z = this.z - right.z
    return this
}

@JvmName("minusMutVec3dScalarl")
operator fun MutVec3d.minus(right: Long): MutVec3d {
    this.x = this.x - right
    this.y = this.y - right
    this.z = this.z - right
    return this
}

@JvmName("minusMutVec3dVec3i")
fun MutVec3d.minus(rx: Int, ry: Int, rz: Int): MutVec3d {
    this.x = this.x - rx
    this.y = this.y - ry
    this.z = this.z - rz
    return this
}

@JvmName("minusMutVec3dVec3i")
operator fun MutVec3d.minus(right: Vec3i): MutVec3d {
    this.x = this.x - right.x
    this.y = this.y - right.y
    this.z = this.z - right.z
    return this
}

@JvmName("minusMutVec3dScalari")
operator fun MutVec3d.minus(right: Int): MutVec3d {
    this.x = this.x - right
    this.y = this.y - right
    this.z = this.z - right
    return this
}

@JvmName("minusMutVec3dVec3f")
fun MutVec3d.minus(rx: Float, ry: Float, rz: Float): MutVec3d {
    this.x = this.x - rx
    this.y = this.y - ry
    this.z = this.z - rz
    return this
}

@JvmName("minusMutVec3dVec3f")
operator fun MutVec3d.minus(right: Vec3f): MutVec3d {
    this.x = this.x - right.x
    this.y = this.y - right.y
    this.z = this.z - right.z
    return this
}

@JvmName("minusMutVec3dScalarf")
operator fun MutVec3d.minus(right: Float): MutVec3d {
    this.x = this.x - right
    this.y = this.y - right
    this.z = this.z - right
    return this
}

/* * * TIMES * * */

@JvmName("timesMutVec3dVec3d")
fun MutVec3d.times(rx: Double, ry: Double, rz: Double): MutVec3d {
    this.x = this.x * rx
    this.y = this.y * ry
    this.z = this.z * rz
    return this
}

@JvmName("timesMutVec3dVec3d")
operator fun MutVec3d.times(right: Vec3d): MutVec3d {
    this.x = this.x * right.x
    this.y = this.y * right.y
    this.z = this.z * right.z
    return this
}

@JvmName("timesMutVec3dScalard")
operator fun MutVec3d.times(right: Double): MutVec3d {
    this.x = this.x * right
    this.y = this.y * right
    this.z = this.z * right
    return this
}

@JvmName("timesMutVec3dVec3l")
fun MutVec3d.times(rx: Long, ry: Long, rz: Long): MutVec3d {
    this.x = this.x * rx
    this.y = this.y * ry
    this.z = this.z * rz
    return this
}

@JvmName("timesMutVec3dVec3l")
operator fun MutVec3d.times(right: Vec3l): MutVec3d {
    this.x = this.x * right.x
    this.y = this.y * right.y
    this.z = this.z * right.z
    return this
}

@JvmName("timesMutVec3dScalarl")
operator fun MutVec3d.times(right: Long): MutVec3d {
    this.x = this.x * right
    this.y = this.y * right
    this.z = this.z * right
    return this
}

@JvmName("timesMutVec3dVec3i")
fun MutVec3d.times(rx: Int, ry: Int, rz: Int): MutVec3d {
    this.x = this.x * rx
    this.y = this.y * ry
    this.z = this.z * rz
    return this
}

@JvmName("timesMutVec3dVec3i")
operator fun MutVec3d.times(right: Vec3i): MutVec3d {
    this.x = this.x * right.x
    this.y = this.y * right.y
    this.z = this.z * right.z
    return this
}

@JvmName("timesMutVec3dScalari")
operator fun MutVec3d.times(right: Int): MutVec3d {
    this.x = this.x * right
    this.y = this.y * right
    this.z = this.z * right
    return this
}

@JvmName("timesMutVec3dVec3f")
fun MutVec3d.times(rx: Float, ry: Float, rz: Float): MutVec3d {
    this.x = this.x * rx
    this.y = this.y * ry
    this.z = this.z * rz
    return this
}

@JvmName("timesMutVec3dVec3f")
operator fun MutVec3d.times(right: Vec3f): MutVec3d {
    this.x = this.x * right.x
    this.y = this.y * right.y
    this.z = this.z * right.z
    return this
}

@JvmName("timesMutVec3dScalarf")
operator fun MutVec3d.times(right: Float): MutVec3d {
    this.x = this.x * right
    this.y = this.y * right
    this.z = this.z * right
    return this
}
