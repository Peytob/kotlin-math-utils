package dev.peytob.math.vector.vec2

@JvmName(name = "mutableVec2f")
fun mutableVec2f(): MutVec2f {
    return StructMutVec2f(
        x = 0.0f,
        y = 0.0f
    )
}

@JvmName(name = "mutableVec2fd")
fun mutableVec2f(right: Vec2d): MutVec2f {
    return StructMutVec2f(
        x = right.x.toFloat(),
        y = right.y.toFloat()
    )
}

@JvmName(name = "mutableVec2fd")
fun mutableVec2f(x: Double, y: Double): MutVec2f {
    return StructMutVec2f(
        x = x.toFloat(),
        y = y.toFloat()
    )
}

@JvmName(name = "mutableVec2fl")
fun mutableVec2f(right: Vec2l): MutVec2f {
    return StructMutVec2f(
        x = right.x.toFloat(),
        y = right.y.toFloat()
    )
}

@JvmName(name = "mutableVec2fl")
fun mutableVec2f(x: Long, y: Long): MutVec2f {
    return StructMutVec2f(
        x = x.toFloat(),
        y = y.toFloat()
    )
}

@JvmName(name = "mutableVec2fi")
fun mutableVec2f(right: Vec2i): MutVec2f {
    return StructMutVec2f(
        x = right.x.toFloat(),
        y = right.y.toFloat()
    )
}

@JvmName(name = "mutableVec2fi")
fun mutableVec2f(x: Int, y: Int): MutVec2f {
    return StructMutVec2f(
        x = x.toFloat(),
        y = y.toFloat()
    )
}

@JvmName(name = "mutableVec2ff")
fun mutableVec2f(right: Vec2f): MutVec2f {
    return StructMutVec2f(
        x = right.x,
        y = right.y
    )
}

@JvmName(name = "mutableVec2ff")
fun mutableVec2f(x: Float, y: Float): MutVec2f {
    return StructMutVec2f(
        x = x,
        y = y
    )
}
