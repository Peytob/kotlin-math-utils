package dev.peytob.math.vector.vec2

@JvmName(name = "mutableVec2i")
fun mutableVec2i(): MutVec2i {
    return StructMutVec2i(
        x = 0,
        y = 0
    )
}

@JvmName(name = "mutableVec2id")
fun mutableVec2i(right: Vec2d): MutVec2i {
    return StructMutVec2i(
        x = right.x.toInt(),
        y = right.y.toInt()
    )
}

@JvmName(name = "mutableVec2id")
fun mutableVec2i(x: Double, y: Double): MutVec2i {
    return StructMutVec2i(
        x = x.toInt(),
        y = y.toInt()
    )
}

@JvmName(name = "mutableVec2il")
fun mutableVec2i(right: Vec2l): MutVec2i {
    return StructMutVec2i(
        x = right.x.toInt(),
        y = right.y.toInt()
    )
}

@JvmName(name = "mutableVec2il")
fun mutableVec2i(x: Long, y: Long): MutVec2i {
    return StructMutVec2i(
        x = x.toInt(),
        y = y.toInt()
    )
}

@JvmName(name = "mutableVec2ii")
fun mutableVec2i(right: Vec2i): MutVec2i {
    return StructMutVec2i(
        x = right.x,
        y = right.y
    )
}

@JvmName(name = "mutableVec2ii")
fun mutableVec2i(x: Int, y: Int): MutVec2i {
    return StructMutVec2i(
        x = x,
        y = y
    )
}

@JvmName(name = "mutableVec2if")
fun mutableVec2i(right: Vec2f): MutVec2i {
    return StructMutVec2i(
        x = right.x.toInt(),
        y = right.y.toInt()
    )
}

@JvmName(name = "mutableVec2if")
fun mutableVec2i(x: Float, y: Float): MutVec2i {
    return StructMutVec2i(
        x = x.toInt(),
        y = y.toInt()
    )
}
