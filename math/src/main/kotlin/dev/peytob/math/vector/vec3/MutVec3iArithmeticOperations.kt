package dev.peytob.math.vector.vec3

/* + - + UNARY ARITHMETIC - + - */

@JvmName("unaryPlusMutVec3i")
operator fun MutVec3i.unaryPlus(): MutVec3i {
    return this
}

@JvmName("unaryMinusMutVec3i")
operator fun MutVec3i.unaryMinus(): MutVec3i {
    this.x = -this.x
    this.y = -this.y
    this.z = -this.z
    return this
}

/* + + PLUS + + */

@JvmName("plusMutVec3iVec3d")
fun MutVec3i.plus(rx: Double, ry: Double, rz: Double): MutVec3i {
    this.x = (this.x + rx).toInt()
    this.y = (this.y + ry).toInt()
    this.z = (this.z + rz).toInt()
    return this
}

@JvmName("plusMutVec3iVec3d")
operator fun MutVec3i.plus(right: Vec3d): MutVec3i {
    this.x = (this.x + right.x).toInt()
    this.y = (this.y + right.y).toInt()
    this.z = (this.z + right.z).toInt()
    return this
}

@JvmName("plusMutVec3iScalard")
operator fun MutVec3i.plus(right: Double): MutVec3i {
    this.x = (this.x + right).toInt()
    this.y = (this.y + right).toInt()
    this.z = (this.z + right).toInt()
    return this
}

@JvmName("plusMutVec3iVec3l")
fun MutVec3i.plus(rx: Long, ry: Long, rz: Long): MutVec3i {
    this.x = (this.x + rx).toInt()
    this.y = (this.y + ry).toInt()
    this.z = (this.z + rz).toInt()
    return this
}

@JvmName("plusMutVec3iVec3l")
operator fun MutVec3i.plus(right: Vec3l): MutVec3i {
    this.x = (this.x + right.x).toInt()
    this.y = (this.y + right.y).toInt()
    this.z = (this.z + right.z).toInt()
    return this
}

@JvmName("plusMutVec3iScalarl")
operator fun MutVec3i.plus(right: Long): MutVec3i {
    this.x = (this.x + right).toInt()
    this.y = (this.y + right).toInt()
    this.z = (this.z + right).toInt()
    return this
}

@JvmName("plusMutVec3iVec3i")
fun MutVec3i.plus(rx: Int, ry: Int, rz: Int): MutVec3i {
    this.x = this.x + rx
    this.y = this.y + ry
    this.z = this.z + rz
    return this
}

@JvmName("plusMutVec3iVec3i")
operator fun MutVec3i.plus(right: Vec3i): MutVec3i {
    this.x = this.x + right.x
    this.y = this.y + right.y
    this.z = this.z + right.z
    return this
}

@JvmName("plusMutVec3iScalari")
operator fun MutVec3i.plus(right: Int): MutVec3i {
    this.x = this.x + right
    this.y = this.y + right
    this.z = this.z + right
    return this
}

@JvmName("plusMutVec3iVec3f")
fun MutVec3i.plus(rx: Float, ry: Float, rz: Float): MutVec3i {
    this.x = (this.x + rx).toInt()
    this.y = (this.y + ry).toInt()
    this.z = (this.z + rz).toInt()
    return this
}

@JvmName("plusMutVec3iVec3f")
operator fun MutVec3i.plus(right: Vec3f): MutVec3i {
    this.x = (this.x + right.x).toInt()
    this.y = (this.y + right.y).toInt()
    this.z = (this.z + right.z).toInt()
    return this
}

@JvmName("plusMutVec3iScalarf")
operator fun MutVec3i.plus(right: Float): MutVec3i {
    this.x = (this.x + right).toInt()
    this.y = (this.y + right).toInt()
    this.z = (this.z + right).toInt()
    return this
}

/* - - MINUS - - */

@JvmName("minusMutVec3iVec3d")
fun MutVec3i.minus(rx: Double, ry: Double, rz: Double): MutVec3i {
    this.x = (this.x - rx).toInt()
    this.y = (this.y - ry).toInt()
    this.z = (this.z - rz).toInt()
    return this
}

@JvmName("minusMutVec3iVec3d")
operator fun MutVec3i.minus(right: Vec3d): MutVec3i {
    this.x = (this.x - right.x).toInt()
    this.y = (this.y - right.y).toInt()
    this.z = (this.z - right.z).toInt()
    return this
}

@JvmName("minusMutVec3iScalard")
operator fun MutVec3i.minus(right: Double): MutVec3i {
    this.x = (this.x - right).toInt()
    this.y = (this.y - right).toInt()
    this.z = (this.z - right).toInt()
    return this
}

@JvmName("minusMutVec3iVec3l")
fun MutVec3i.minus(rx: Long, ry: Long, rz: Long): MutVec3i {
    this.x = (this.x - rx).toInt()
    this.y = (this.y - ry).toInt()
    this.z = (this.z - rz).toInt()
    return this
}

@JvmName("minusMutVec3iVec3l")
operator fun MutVec3i.minus(right: Vec3l): MutVec3i {
    this.x = (this.x - right.x).toInt()
    this.y = (this.y - right.y).toInt()
    this.z = (this.z - right.z).toInt()
    return this
}

@JvmName("minusMutVec3iScalarl")
operator fun MutVec3i.minus(right: Long): MutVec3i {
    this.x = (this.x - right).toInt()
    this.y = (this.y - right).toInt()
    this.z = (this.z - right).toInt()
    return this
}

@JvmName("minusMutVec3iVec3i")
fun MutVec3i.minus(rx: Int, ry: Int, rz: Int): MutVec3i {
    this.x = this.x - rx
    this.y = this.y - ry
    this.z = this.z - rz
    return this
}

@JvmName("minusMutVec3iVec3i")
operator fun MutVec3i.minus(right: Vec3i): MutVec3i {
    this.x = this.x - right.x
    this.y = this.y - right.y
    this.z = this.z - right.z
    return this
}

@JvmName("minusMutVec3iScalari")
operator fun MutVec3i.minus(right: Int): MutVec3i {
    this.x = this.x - right
    this.y = this.y - right
    this.z = this.z - right
    return this
}

@JvmName("minusMutVec3iVec3f")
fun MutVec3i.minus(rx: Float, ry: Float, rz: Float): MutVec3i {
    this.x = (this.x - rx).toInt()
    this.y = (this.y - ry).toInt()
    this.z = (this.z - rz).toInt()
    return this
}

@JvmName("minusMutVec3iVec3f")
operator fun MutVec3i.minus(right: Vec3f): MutVec3i {
    this.x = (this.x - right.x).toInt()
    this.y = (this.y - right.y).toInt()
    this.z = (this.z - right.z).toInt()
    return this
}

@JvmName("minusMutVec3iScalarf")
operator fun MutVec3i.minus(right: Float): MutVec3i {
    this.x = (this.x - right).toInt()
    this.y = (this.y - right).toInt()
    this.z = (this.z - right).toInt()
    return this
}

/* * * TIMES * * */

@JvmName("timesMutVec3iVec3d")
fun MutVec3i.times(rx: Double, ry: Double, rz: Double): MutVec3i {
    this.x = (this.x * rx).toInt()
    this.y = (this.y * ry).toInt()
    this.z = (this.z * rz).toInt()
    return this
}

@JvmName("timesMutVec3iVec3d")
operator fun MutVec3i.times(right: Vec3d): MutVec3i {
    this.x = (this.x * right.x).toInt()
    this.y = (this.y * right.y).toInt()
    this.z = (this.z * right.z).toInt()
    return this
}

@JvmName("timesMutVec3iScalard")
operator fun MutVec3i.times(right: Double): MutVec3i {
    this.x = (this.x * right).toInt()
    this.y = (this.y * right).toInt()
    this.z = (this.z * right).toInt()
    return this
}

@JvmName("timesMutVec3iVec3l")
fun MutVec3i.times(rx: Long, ry: Long, rz: Long): MutVec3i {
    this.x = (this.x * rx).toInt()
    this.y = (this.y * ry).toInt()
    this.z = (this.z * rz).toInt()
    return this
}

@JvmName("timesMutVec3iVec3l")
operator fun MutVec3i.times(right: Vec3l): MutVec3i {
    this.x = (this.x * right.x).toInt()
    this.y = (this.y * right.y).toInt()
    this.z = (this.z * right.z).toInt()
    return this
}

@JvmName("timesMutVec3iScalarl")
operator fun MutVec3i.times(right: Long): MutVec3i {
    this.x = (this.x * right).toInt()
    this.y = (this.y * right).toInt()
    this.z = (this.z * right).toInt()
    return this
}

@JvmName("timesMutVec3iVec3i")
fun MutVec3i.times(rx: Int, ry: Int, rz: Int): MutVec3i {
    this.x = this.x * rx
    this.y = this.y * ry
    this.z = this.z * rz
    return this
}

@JvmName("timesMutVec3iVec3i")
operator fun MutVec3i.times(right: Vec3i): MutVec3i {
    this.x = this.x * right.x
    this.y = this.y * right.y
    this.z = this.z * right.z
    return this
}

@JvmName("timesMutVec3iScalari")
operator fun MutVec3i.times(right: Int): MutVec3i {
    this.x = this.x * right
    this.y = this.y * right
    this.z = this.z * right
    return this
}

@JvmName("timesMutVec3iVec3f")
fun MutVec3i.times(rx: Float, ry: Float, rz: Float): MutVec3i {
    this.x = (this.x * rx).toInt()
    this.y = (this.y * ry).toInt()
    this.z = (this.z * rz).toInt()
    return this
}

@JvmName("timesMutVec3iVec3f")
operator fun MutVec3i.times(right: Vec3f): MutVec3i {
    this.x = (this.x * right.x).toInt()
    this.y = (this.y * right.y).toInt()
    this.z = (this.z * right.z).toInt()
    return this
}

@JvmName("timesMutVec3iScalarf")
operator fun MutVec3i.times(right: Float): MutVec3i {
    this.x = (this.x * right).toInt()
    this.y = (this.y * right).toInt()
    this.z = (this.z * right).toInt()
    return this
}
