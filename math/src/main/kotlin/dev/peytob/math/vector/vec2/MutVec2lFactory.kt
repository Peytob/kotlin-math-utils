package dev.peytob.math.vector.vec2

@JvmName(name = "mutableVec2l")
fun mutableVec2l(): MutVec2l {
    return StructMutVec2l(
        x  = 0,
        y = 0
    )
}

@JvmName(name = "mutableVec2ld")
fun mutableVec2l(right: Vec2d): MutVec2l {
    return StructMutVec2l(
        x = right.x.toLong(),
        y = right.y.toLong()
    )
}

@JvmName(name = "mutableVec2ld")
fun mutableVec2l(x: Double, y: Double): MutVec2l {
    return StructMutVec2l(
        x = x.toLong(),
        y = y.toLong()
    )
}

@JvmName(name = "mutableVec2ll")
fun mutableVec2l(right: Vec2l): MutVec2l {
    return StructMutVec2l(
        x = right.x,
        y = right.y
    )
}

@JvmName(name = "mutableVec2ll")
fun mutableVec2l(x: Long, y: Long): MutVec2l {
    return StructMutVec2l(
        x = x,
        y = y
    )
}

@JvmName(name = "mutableVec2li")
fun mutableVec2l(right: Vec2i): MutVec2l {
    return StructMutVec2l(
        x = right.x.toLong(),
        y = right.y.toLong()
    )
}

@JvmName(name = "mutableVec2li")
fun mutableVec2l(x: Int, y: Int): MutVec2l {
    return StructMutVec2l(
        x = x.toLong(),
        y = y.toLong()
    )
}

@JvmName(name = "mutableVec2lf")
fun mutableVec2l(right: Vec2f): MutVec2l {
    return StructMutVec2l(
        x = right.x.toLong(),
        y = right.y.toLong()
    )
}

@JvmName(name = "mutableVec2lf")
fun mutableVec2l(x: Float, y: Float): MutVec2l {
    return StructMutVec2l(
        x = x.toLong(),
        y = y.toLong()
    )
}
