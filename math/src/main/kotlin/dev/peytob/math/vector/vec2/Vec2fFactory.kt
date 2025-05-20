package dev.peytob.math.vector.vec2

private val ZERO: Vec2f = StructVec2f(x = 0.0f, y = 0.0f)

@JvmName(name = "immutableVec2f")
fun immutableVec2f(): Vec2f = ZERO

@JvmName(name = "immutableVec2fd")
fun immutableVec2f(right: Vec2d): Vec2f {
    return StructVec2f(
        x = right.x.toFloat(),
        y = right.y.toFloat()
    )
}

@JvmName(name = "immutableVec2fd")
fun immutableVec2f(x: Double, y: Double): Vec2f {
    return StructVec2f(
        x = x.toFloat(),
        y = y.toFloat()
    )
}

@JvmName(name = "immutableVec2fl")
fun immutableVec2f(right: Vec2l): Vec2f {
    return StructVec2f(
        x = right.x.toFloat(),
        y = right.y.toFloat()
    )
}

@JvmName(name = "immutableVec2fl")
fun immutableVec2f(x: Long, y: Long): Vec2f {
    return StructVec2f(
        x = x.toFloat(),
        y = y.toFloat()
    )
}

@JvmName(name = "immutableVec2fi")
fun immutableVec2f(right: Vec2i): Vec2f {
    return StructVec2f(
        x = right.x.toFloat(),
        y = right.y.toFloat()
    )
}

@JvmName(name = "immutableVec2fi")
fun immutableVec2f(x: Int, y: Int): Vec2f {
    return StructVec2f(
        x = x.toFloat(),
        y = y.toFloat()
    )
}

@JvmName(name = "immutableVec2ff")
fun immutableVec2f(right: Vec2f): Vec2f {
    return StructVec2f(
        x = right.x,
        y = right.y
    )
}

@JvmName(name = "immutableVec2ff")
fun immutableVec2f(x: Float, y: Float): Vec2f {
    return StructVec2f(
        x = x,
        y = y
    )
}
