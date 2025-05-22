package dev.peytob.math.vector.vec3

@JvmName(name = "mutableVec3i")
fun mutableVec3i(): MutVec3i {
    return StructMutVec3i(
        x = 0,
        y = 0,
        z = 0
    )
}

@JvmName(name = "mutableVec3id")
fun mutableVec3i(right: Vec3d): MutVec3i {
    return StructMutVec3i(
        x = right.x.toInt(),
        y = right.y.toInt(),
        z = right.z.toInt()
    )
}

@JvmName(name = "mutableVec3id")
fun mutableVec3i(x: Double, y: Double, z: Double): MutVec3i {
    return StructMutVec3i(
        x = x.toInt(),
        y = y.toInt(),
        z = z.toInt()
    )
}

@JvmName(name = "mutableVec3il")
fun mutableVec3i(right: Vec3l): MutVec3i {
    return StructMutVec3i(
        x = right.x.toInt(),
        y = right.y.toInt(),
        z = right.z.toInt()
    )
}

@JvmName(name = "mutableVec3il")
fun mutableVec3i(x: Long, y: Long, z: Long): MutVec3i {
    return StructMutVec3i(
        x = x.toInt(),
        y = y.toInt(),
        z = z.toInt()
    )
}

@JvmName(name = "mutableVec3ii")
fun mutableVec3i(right: Vec3i): MutVec3i {
    return StructMutVec3i(
        x = right.x,
        y = right.y,
        z = right.z
    )
}

@JvmName(name = "mutableVec3ii")
fun mutableVec3i(x: Int, y: Int, z: Int): MutVec3i {
    return StructMutVec3i(
        x = x,
        y = y,
        z = z
    )
}

@JvmName(name = "mutableVec3if")
fun mutableVec3i(right: Vec3f): MutVec3i {
    return StructMutVec3i(
        x = right.x.toInt(),
        y = right.y.toInt(),
        z = right.z.toInt()
    )
}

@JvmName(name = "mutableVec3if")
fun mutableVec3i(x: Float, y: Float, z: Float): MutVec3i {
    return StructMutVec3i(
        x = x.toInt(),
        y = y.toInt(),
        z = z.toInt()
    )
}
