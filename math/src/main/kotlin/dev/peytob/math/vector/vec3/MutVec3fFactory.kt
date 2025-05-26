package dev.peytob.math.vector.vec3

@JvmName(name = "mutableVec3f")
fun mutableVec3f(): MutVec3f {
    return StructMutVec3f(
        x = 0.0f,
        y = 0.0f,
        z = 0.0f
    )
}

@JvmName(name = "mutableVec3fd")
fun mutableVec3f(right: Vec3d): MutVec3f {
    return StructMutVec3f(
        x = right.x.toFloat(),
        y = right.y.toFloat(),
        z = right.z.toFloat()
    )
}

@JvmName(name = "mutableVec3fd")
fun mutableVec3f(x: Double, y: Double, z: Double): MutVec3f {
    return StructMutVec3f(
        x = x.toFloat(),
        y = y.toFloat(),
        z = z.toFloat()
    )
}

@JvmName(name = "mutableVec3fl")
fun mutableVec3f(right: Vec3l): MutVec3f {
    return StructMutVec3f(
        x = right.x.toFloat(),
        y = right.y.toFloat(),
        z = right.z.toFloat()
    )
}

@JvmName(name = "mutableVec3fl")
fun mutableVec3f(x: Long, y: Long, z: Long): MutVec3f {
    return StructMutVec3f(
        x = x.toFloat(),
        y = y.toFloat(),
        z = z.toFloat()
    )
}

@JvmName(name = "mutableVec3fi")
fun mutableVec3f(right: Vec3i): MutVec3f {
    return StructMutVec3f(
        x = right.x.toFloat(),
        y = right.y.toFloat(),
        z = right.z.toFloat()
    )
}

@JvmName(name = "mutableVec3fi")
fun mutableVec3f(x: Int, y: Int, z: Int): MutVec3f {
    return StructMutVec3f(
        x = x.toFloat(),
        y = y.toFloat(),
        z = z.toFloat()
    )
}

@JvmName(name = "mutableVec3ff")
fun mutableVec3f(right: Vec3f): MutVec3f {
    return StructMutVec3f(
        x = right.x,
        y = right.y,
        z = right.z
    )
}

@JvmName(name = "mutableVec3ff")
fun mutableVec3f(x: Float, y: Float, z: Float): MutVec3f {
    return StructMutVec3f(
        x = x,
        y = y,
        z = z
    )
}
