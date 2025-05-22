package dev.peytob.math.vector.vec3

@JvmName(name = "mutableVec3d")
fun mutableVec3d(): MutVec3d {
    return StructMutVec3d(
        x = 0.0,
        y = 0.0,
        z = 0.0
    )
}

@JvmName(name = "mutableVec3dd")
fun mutableVec3d(right: Vec3d): MutVec3d {
    return StructMutVec3d(
        x = right.x,
        y = right.y,
        z = right.z
    )
}

@JvmName(name = "mutableVec3dd")
fun mutableVec3d(x: Double, y: Double, z: Double): MutVec3d {
    return StructMutVec3d(
        x = x,
        y = y,
        z = z
    )
}

@JvmName(name = "mutableVec3dl")
fun mutableVec3d(right: Vec3l): MutVec3d {
    return StructMutVec3d(
        x = right.x.toDouble(),
        y = right.y.toDouble(),
        z = right.z.toDouble()
    )
}

@JvmName(name = "mutableVec3dl")
fun mutableVec3d(x: Long, y: Long, z: Long): MutVec3d {
    return StructMutVec3d(
        x = x.toDouble(),
        y = y.toDouble(),
        z = z.toDouble()
    )
}

@JvmName(name = "mutableVec3di")
fun mutableVec3d(right: Vec3i): MutVec3d {
    return StructMutVec3d(
        x = right.x.toDouble(),
        y = right.y.toDouble(),
        z = right.z.toDouble()
    )
}

@JvmName(name = "mutableVec3di")
fun mutableVec3d(x: Int, y: Int, z: Int): MutVec3d {
    return StructMutVec3d(
        x = x.toDouble(),
        y = y.toDouble(),
        z = z.toDouble()
    )
}

@JvmName(name = "mutableVec3df")
fun mutableVec3d(right: Vec3f): MutVec3d {
    return StructMutVec3d(
        x = right.x.toDouble(),
        y = right.y.toDouble(),
        z = right.z.toDouble()
    )
}

@JvmName(name = "mutableVec3df")
fun mutableVec3d(x: Float, y: Float, z: Float): MutVec3d {
    return StructMutVec3d(
        x = x.toDouble(),
        y = y.toDouble(),
        z = z.toDouble()
    )
}
