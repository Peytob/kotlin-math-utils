package dev.peytob.math.vector.vec3

private val ZERO: Vec3i = StructVec3i(x = 0, y = 0, z = 0)

@JvmName(name = "immutableVec3i")
fun immutableVec3i(): Vec3i = ZERO

@JvmName(name = "immutableVec3id")
fun immutableVec3i(right: Vec3d): Vec3i {
    return StructVec3i(
        x = right.x.toInt(),
        y = right.y.toInt(),
        z = right.z.toInt()
    )
}

@JvmName(name = "immutableVec3id")
fun immutableVec3i(x: Double, y: Double, z: Double): Vec3i {
    return StructVec3i(
        x = x.toInt(),
        y = y.toInt(),
        z = z.toInt()
    )
}

@JvmName(name = "immutableVec3il")
fun immutableVec3i(right: Vec3l): Vec3i {
    return StructVec3i(
        x = right.x.toInt(),
        y = right.y.toInt(),
        z = right.z.toInt()
    )
}

@JvmName(name = "immutableVec3il")
fun immutableVec3i(x: Long, y: Long, z: Long): Vec3i {
    return StructVec3i(
        x = x.toInt(),
        y = y.toInt(),
        z = z.toInt()
    )
}

@JvmName(name = "immutableVec3ii")
fun immutableVec3i(right: Vec3i): Vec3i {
    return StructVec3i(
        x = right.x,
        y = right.y,
        z = right.z
    )
}

@JvmName(name = "immutableVec3ii")
fun immutableVec3i(x: Int, y: Int, z: Int): Vec3i {
    return StructVec3i(
        x = x,
        y = y,
        z = z
    )
}

@JvmName(name = "immutableVec3if")
fun immutableVec3i(right: Vec3f): Vec3i {
    return StructVec3i(
        x = right.x.toInt(),
        y = right.y.toInt(),
        z = right.z.toInt()
    )
}

@JvmName(name = "immutableVec3if")
fun immutableVec3i(x: Float, y: Float, z: Float): Vec3i {
    return StructVec3i(
        x = x.toInt(),
        y = y.toInt(),
        z = z.toInt()
    )
}
