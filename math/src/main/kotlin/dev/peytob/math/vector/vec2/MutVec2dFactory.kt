package dev.peytob.math.vector.vec2

@JvmName(name = "mutableVec2d")
fun mutableVec2d(): MutVec2d {
    return StructMutVec2d(
        x = 0.0,
        y = 0.0
    )
}

@JvmName(name = "mutableVec2dd")
fun mutableVec2d(right: Vec2d): MutVec2d {
    return StructMutVec2d(
        x = right.x,
        y = right.y
    )
}

@JvmName(name = "mutableVec2dd")
fun mutableVec2d(x: Double, y: Double): MutVec2d {
    return StructMutVec2d(
        x = x,
        y = y
    )
}

@JvmName(name = "mutableVec2dl")
fun mutableVec2d(right: Vec2l): MutVec2d {
    return StructMutVec2d(
        x = right.x.toDouble(),
        y = right.y.toDouble()
    )
}

@JvmName(name = "mutableVec2dl")
fun mutableVec2d(x: Long, y: Long): MutVec2d {
    return StructMutVec2d(
        x = x.toDouble(),
        y = y.toDouble()
    )
}

@JvmName(name = "mutableVec2di")
fun mutableVec2d(right: Vec2i): MutVec2d {
    return StructMutVec2d(
        x = right.x.toDouble(),
        y = right.y.toDouble()
    )
}

@JvmName(name = "mutableVec2di")
fun mutableVec2d(x: Int, y: Int): MutVec2d {
    return StructMutVec2d(
        x = x.toDouble(),
        y = y.toDouble()
    )
}

@JvmName(name = "mutableVec2df")
fun mutableVec2d(right: Vec2f): MutVec2d {
    return StructMutVec2d(
        x = right.x.toDouble(),
        y = right.y.toDouble()
    )
}

@JvmName(name = "mutableVec2df")
fun mutableVec2d(x: Float, y: Float): MutVec2d {
    return StructMutVec2d(
        x = x.toDouble(),
        y = y.toDouble()
    )
}
