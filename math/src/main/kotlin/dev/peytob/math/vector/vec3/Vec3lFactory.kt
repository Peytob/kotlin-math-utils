package dev.peytob.math.vector.vec3

private val ZERO: Vec3l = StructVec3l(x = 0L, y = 0L, z = 0L)

@JvmName(name = "immutableVec3l")
fun immutableVec3l(): Vec3l = ZERO

@JvmName(name = "immutableVec3ld")
fun immutableVec3l(right: Vec3d): Vec3l {
    return StructVec3l(
        x = right.x.toLong(),
        y = right.y.toLong(),
        z = right.z.toLong()
    )
}

@JvmName(name = "immutableVec3ld")
fun immutableVec3l(x: Double, y: Double, z: Double): Vec3l {
    return StructVec3l(
        x = x.toLong(),
        y = y.toLong(),
        z = z.toLong()
    )
}

@JvmName(name = "immutableVec3ll")
fun immutableVec3l(right: Vec3l): Vec3l {
    return StructVec3l(
        x = right.x,
        y = right.y,
        z = right.z
    )
}

@JvmName(name = "immutableVec3ll")
fun immutableVec3l(x: Long, y: Long, z: Long): Vec3l {
    return StructVec3l(
        x = x,
        y = y,
        z = z
    )
}

@JvmName(name = "immutableVec3li")
fun immutableVec3l(right: Vec3i): Vec3l {
    return StructVec3l(
        x = right.x.toLong(),
        y = right.y.toLong(),
        z = right.z.toLong()
    )
}

@JvmName(name = "immutableVec3li")
fun immutableVec3l(x: Int, y: Int, z: Int): Vec3l {
    return StructVec3l(
        x = x.toLong(),
        y = y.toLong(),
        z = z.toLong()
    )
}

@JvmName(name = "immutableVec3lf")
fun immutableVec3l(right: Vec3f): Vec3l {
    return StructVec3l(
        x = right.x.toLong(),
        y = right.y.toLong(),
        z = right.z.toLong()
    )
}

@JvmName(name = "immutableVec3lf")
fun immutableVec3l(x: Float, y: Float, z: Float): Vec3l {
    return StructVec3l(
        x = x.toLong(),
        y = y.toLong(),
        z = z.toLong()
    )
}
