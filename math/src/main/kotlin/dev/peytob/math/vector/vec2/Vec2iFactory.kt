package dev.peytob.math.vector.vec2

private val ZERO: Vec2i = StructVec2i(x = 0, y = 0)

@JvmName(name = "immutableVec2i")
fun immutableVec2i(): Vec2i = ZERO

@JvmName(name = "immutableVec2id")
fun immutableVec2i(right: Vec2d): Vec2i {
    return StructVec2i(
        x = right.x.toInt(),
        y = right.y.toInt()
    )
}

@JvmName(name = "immutableVec2id")
fun immutableVec2i(x: Double, y: Double): Vec2i {
    return StructVec2i(
        x = x.toInt(),
        y = y.toInt()
    )
}

@JvmName(name = "immutableVec2il")
fun immutableVec2i(right: Vec2l): Vec2i {
    return StructVec2i(
        x = right.x.toInt(),
        y = right.y.toInt()
    )
}

@JvmName(name = "immutableVec2il")
fun immutableVec2i(x: Long, y: Long): Vec2i {
    return StructVec2i(
        x = x.toInt(),
        y = y.toInt()
    )
}

@JvmName(name = "immutableVec2ii")
fun immutableVec2i(right: Vec2i): Vec2i {
    return StructVec2i(
        x = right.x,
        y = right.y
    )
}

@JvmName(name = "immutableVec2ii")
fun immutableVec2i(x: Int, y: Int): Vec2i {
    return StructVec2i(
        x = x,
        y = y
    )
}

@JvmName(name = "immutableVec2if")
fun immutableVec2i(right: Vec2f): Vec2i {
    return StructVec2i(
        x = right.x.toInt(),
        y = right.y.toInt()
    )
}

@JvmName(name = "immutableVec2if")
fun immutableVec2i(x: Float, y: Float): Vec2i {
    return StructVec2i(
        x = x.toInt(),
        y = y.toInt()
    )
}
