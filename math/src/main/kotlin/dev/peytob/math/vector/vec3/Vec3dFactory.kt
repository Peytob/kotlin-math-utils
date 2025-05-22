package dev.peytob.math.vector.vec3

private val ZERO: Vec3d = StructVec3d(x = 0.0, y = 0.0, z = 0.0)

@JvmName(name = "immutableVec3d")
fun immutableVec3d(): Vec3d = ZERO

@JvmName(name = "immutableVec3dd")
fun immutableVec3d(right: Vec3d): Vec3d {
    return StructVec3d(
        x = right.x,
        y = right.y,
        z = right.z
    )
}

@JvmName(name = "immutableVec3dd")
fun immutableVec3d(x: Double, y: Double, z: Double): Vec3d {
    return StructVec3d(
        x = x,
        y = y,
        z = z
    )
}

@JvmName(name = "immutableVec3dl")
fun immutableVec3d(right: Vec3l): Vec3d {
    return StructVec3d(
        x = right.x.toDouble(),
        y = right.y.toDouble(),
        z = right.z.toDouble()
    )
}

@JvmName(name = "immutableVec3dl")
fun immutableVec3d(x: Long, y: Long, z: Long): Vec3d {
    return StructVec3d(
        x = x.toDouble(),
        y = y.toDouble(),
        z = z.toDouble()
    )
}

@JvmName(name = "immutableVec3di")
fun immutableVec3d(right: Vec3i): Vec3d {
    return StructVec3d(
        x = right.x.toDouble(),
        y = right.y.toDouble(),
        z = right.z.toDouble()
    )
}

@JvmName(name = "immutableVec3di")
fun immutableVec3d(x: Int, y: Int, z: Int): Vec3d {
    return StructVec3d(
        x = x.toDouble(),
        y = y.toDouble(),
        z = z.toDouble()
    )
}

@JvmName(name = "immutableVec3df")
fun immutableVec3d(right: Vec3f): Vec3d {
    return StructVec3d(
        x = right.x.toDouble(),
        y = right.y.toDouble(),
        z = right.z.toDouble()
    )
}

@JvmName(name = "immutableVec3df")
fun immutableVec3d(x: Float, y: Float, z: Float): Vec3d {
    return StructVec3d(
        x = x.toDouble(),
        y = y.toDouble(),
        z = z.toDouble()
    )
}
