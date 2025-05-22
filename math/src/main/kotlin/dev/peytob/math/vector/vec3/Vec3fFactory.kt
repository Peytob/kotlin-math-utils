package dev.peytob.math.vector.vec3

private val ZERO: Vec3f = StructVec3f(x = 0.0f, y = 0.0f, z = 0.0f)

@JvmName(name = "immutableVec3f")
fun immutableVec3f(): Vec3f = ZERO

@JvmName(name = "immutableVec3fd")
fun immutableVec3f(right: Vec3d): Vec3f {
    return StructVec3f(
        x = right.x.toFloat(),
        y = right.y.toFloat(),
        z = right.z.toFloat()
    )
}

@JvmName(name = "immutableVec3fd")
fun immutableVec3f(x: Double, y: Double, z: Double): Vec3f {
    return StructVec3f(
        x = x.toFloat(),
        y = y.toFloat(),
        z = z.toFloat()
    )
}

@JvmName(name = "immutableVec3fl")
fun immutableVec3f(right: Vec3l): Vec3f {
    return StructVec3f(
        x = right.x.toFloat(),
        y = right.y.toFloat(),
        z = right.z.toFloat()
    )
}

@JvmName(name = "immutableVec3fl")
fun immutableVec3f(x: Long, y: Long, z: Long): Vec3f {
    return StructVec3f(
        x = x.toFloat(),
        y = y.toFloat(),
        z = z.toFloat()
    )
}

@JvmName(name = "immutableVec3fi")
fun immutableVec3f(right: Vec3i): Vec3f {
    return StructVec3f(
        x = right.x.toFloat(),
        y = right.y.toFloat(),
        z = right.z.toFloat()
    )
}

@JvmName(name = "immutableVec3fi")
fun immutableVec3f(x: Int, y: Int, z: Int): Vec3f {
    return StructVec3f(
        x = x.toFloat(),
        y = y.toFloat(),
        z = z.toFloat()
    )
}

@JvmName(name = "immutableVec3ff")
fun immutableVec3f(right: Vec3f): Vec3f {
    return StructVec3f(
        x = right.x,
        y = right.y,
        z = right.z
    )
}

@JvmName(name = "immutableVec3ff")
fun immutableVec3f(x: Float, y: Float, z: Float): Vec3f {
    return StructVec3f(
        x = x,
        y = y,
        z = z
    )
}
