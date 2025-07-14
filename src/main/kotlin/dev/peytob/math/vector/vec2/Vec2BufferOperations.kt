package dev.peytob.math.vector.vec2

import java.nio.*

@JvmName(name = "toByteBuffer2d")
infix fun Vec2<Double>.to(buffer: ByteBuffer) {
    buffer.putDouble(x)
    buffer.putDouble(y)
}

@JvmName(name = "toByteBuffer2f")
infix fun Vec2<Float>.to(buffer: ByteBuffer) {
    buffer.putFloat(x)
    buffer.putFloat(y)
}

@JvmName(name = "toByteBuffer2l")
infix fun Vec2<Long>.to(buffer: ByteBuffer) {
    buffer.putLong(x)
    buffer.putLong(y)
}

@JvmName(name = "toBuffer2d")
infix fun Vec2<Double>.to(buffer: DoubleBuffer) {
    buffer.put(x)
    buffer.put(y)
}

@JvmName(name = "toByteBuffer2i")
infix fun Vec2<Int>.to(buffer: ByteBuffer) {
    buffer.putInt(x)
    buffer.putInt(y)
}

@JvmName(name = "toBuffer2i")
infix fun Vec2<Int>.to(buffer: IntBuffer) {
    buffer.put(x)
    buffer.put(y)
}

@JvmName(name = "toBuffer2f")
infix fun Vec2<Float>.to(buffer: FloatBuffer) {
    buffer.put(x)
    buffer.put(y)
}

@JvmName(name = "toBuffer2l")
infix fun Vec2<Long>.to(buffer: LongBuffer) {
    buffer.put(x)
    buffer.put(y)
}
