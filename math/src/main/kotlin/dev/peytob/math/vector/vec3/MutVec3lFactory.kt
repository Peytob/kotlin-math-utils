package dev.peytob.math.vector.vec3

@JvmName(name = "mutableVec3l")
fun mutableVec3l(): MutVec3l {
    return StructMutVec3l(
        x = 0L,
        y = 0L,
        z = 0L
    )
}

@JvmName(name = "mutableVec3ld")
fun mutableVec3l(right: Vec3d): MutVec3l {
    return StructMutVec3l(
        x = right.x.toLong(),
        y = right.y.toLong(),
        z = right.z.toLong()
    )
}

@JvmName(name = "mutableVec3ld")
fun mutableVec3l(x: Double, y: Double, z: Double): MutVec3l {
    return StructMutVec3l(
        x = x.toLong(),
        y = y.toLong(),
        z = z.toLong()
    )
}

@JvmName(name = "mutableVec3ll")
fun mutableVec3l(right: Vec3l): MutVec3l {
    return StructMutVec3l(
        x = right.x,
        y = right.y,
        z = right.z
    )
}

@JvmName(name = "mutableVec3ll")
fun mutableVec3l(x: Long, y: Long, z: Long): MutVec3l {
    return StructMutVec3l(
        x = x,
        y = y,
        z = z
    )
}

@JvmName(name = "mutableVec3li")
fun mutableVec3l(right: Vec3i): MutVec3l {
    return StructMutVec3l(
        x = right.x.toLong(),
        y = right.y.toLong(),
        z = right.z.toLong()
    )
}

@JvmName(name = "mutableVec3li")
fun mutableVec3l(x: Int, y: Int, z: Int): MutVec3l {
    return StructMutVec3l(
        x = x.toLong(),
        y = y.toLong(),
        z = z.toLong()
    )
}

@JvmName(name = "mutableVec3lf")
fun mutableVec3l(right: Vec3f): MutVec3l {
    return StructMutVec3l(
        x = right.x.toLong(),
        y = right.y.toLong(),
        z = right.z.toLong()
    )
}

@JvmName(name = "mutableVec3lf")
fun mutableVec3l(x: Float, y: Float, z: Float): MutVec3l {
    return StructMutVec3l(
        x = x.toLong(),
        y = y.toLong(),
        z = z.toLong()
    )
}
