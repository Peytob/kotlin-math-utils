package dev.peytob.math.vector.vec2

private val ZERO: Vec2l = StructVec2l(x = 0L, y = 0L)

@JvmName(name = "immutableVec2l")
fun immutableVec2l(): Vec2l = ZERO

@JvmName(name = "immutableVec2ld")
fun immutableVec2l(right: Vec2d): Vec2l {
    return StructVec2l(
        x = right.x.toLong(),
        y = right.y.toLong()
    )
}

@JvmName(name = "immutableVec2ld")
fun immutableVec2l(x: Double, y: Double): Vec2l {
    return StructVec2l(
        x = x.toLong(),
        y = y.toLong()
    )
}

@JvmName(name = "immutableVec2ll")
fun immutableVec2l(right: Vec2l): Vec2l {
    return StructVec2l(
        x = right.x,
        y = right.y
    )
}

@JvmName(name = "immutableVec2ll")
fun immutableVec2l(x: Long, y: Long): Vec2l {
    return StructVec2l(
        x = x,
        y = y
    )
}

@JvmName(name = "immutableVec2li")
fun immutableVec2l(right: Vec2i): Vec2l {
    return StructVec2l(
        x = right.x.toLong(),
        y = right.y.toLong()
    )
}

@JvmName(name = "immutableVec2li")
fun immutableVec2l(x: Int, y: Int): Vec2l {
    return StructVec2l(
        x = x.toLong(),
        y = y.toLong()
    )
}

@JvmName(name = "immutableVec2lf")
fun immutableVec2l(right: Vec2f): Vec2l {
    return StructVec2l(
        x = right.x.toLong(),
        y = right.y.toLong()
    )
}

@JvmName(name = "immutableVec2lf")
fun immutableVec2l(x: Float, y: Float): Vec2l {
    return StructVec2l(
        x = x.toLong(),
        y = y.toLong()
    )
}
