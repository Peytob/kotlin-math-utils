package dev.peytob.math.vector.vec2

private val ZERO: Vec2d = StructVec2d(x = 0.0, y = 0.0)

@JvmName(name = "immutableVec2d")
fun immutableVec2d(): Vec2d = ZERO

@JvmName(name = "immutableVec2dd")
fun immutableVec2d(right: Vec2d): Vec2d {
    return StructVec2d(
        x = right.x,
        y = right.y
    )
}

@JvmName(name = "immutableVec2dd")
fun immutableVec2d(x: Double, y: Double): Vec2d {
    return StructVec2d(
        x = x,
        y = y
    )
}

@JvmName(name = "immutableVec2dl")
fun immutableVec2d(right: Vec2l): Vec2d {
    return StructVec2d(
        x = right.x.toDouble(),
        y = right.y.toDouble()
    )
}

@JvmName(name = "immutableVec2dl")
fun immutableVec2d(x: Long, y: Long): Vec2d {
    return StructVec2d(
        x = x.toDouble(),
        y = y.toDouble()
    )
}

@JvmName(name = "immutableVec2di")
fun immutableVec2d(right: Vec2i): Vec2d {
    return StructVec2d(
        x = right.x.toDouble(),
        y = right.y.toDouble()
    )
}

@JvmName(name = "immutableVec2di")
fun immutableVec2d(x: Int, y: Int): Vec2d {
    return StructVec2d(
        x = x.toDouble(),
        y = y.toDouble()
    )
}

@JvmName(name = "immutableVec2df")
fun immutableVec2d(right: Vec2f): Vec2d {
    return StructVec2d(
        x = right.x.toDouble(),
        y = right.y.toDouble()
    )
}

@JvmName(name = "immutableVec2df")
fun immutableVec2d(x: Float, y: Float): Vec2d {
    return StructVec2d(
        x = x.toDouble(),
        y = y.toDouble()
    )
}
