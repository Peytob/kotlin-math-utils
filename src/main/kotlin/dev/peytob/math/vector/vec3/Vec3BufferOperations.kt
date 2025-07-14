package dev.peytob.math.vector.vec3

import java.nio.ByteBuffer
import java.nio.DoubleBuffer
import java.nio.FloatBuffer
import java.nio.IntBuffer
import java.nio.LongBuffer
import kotlin.Long
import kotlin.jvm.JvmName

@JvmName(name = "toByteBuffer3d")
infix fun Vec3<Double>.to(buffer: ByteBuffer) {
    buffer.putDouble(x)
    buffer.putDouble(y)
    buffer.putDouble(z)
}

@JvmName(name = "toByteBuffer3i")
infix fun Vec3<Int>.to(buffer: ByteBuffer) {
    buffer.putInt(x)
    buffer.putInt(y)
    buffer.putInt(z)
}

@JvmName(name = "toBuffer3i")
infix fun Vec3<Int>.to(buffer: IntBuffer) {
    buffer.put(x)
    buffer.put(y)
    buffer.put(z)
}

@JvmName(name = "toByteBuffer3l")
infix fun Vec3<Long>.to(buffer: ByteBuffer) {
    buffer.putLong(x)
    buffer.putLong(y)
    buffer.putLong(z)
}

@JvmName(name = "toBuffer3l")
infix fun Vec3<Long>.to(buffer: LongBuffer) {
    buffer.put(x)
    buffer.put(y)
    buffer.put(z)
}

@JvmName(name = "toBuffer3f")
infix fun Vec3<Float>.to(buffer: FloatBuffer) {
    buffer.put(x)
    buffer.put(y)
    buffer.put(z)
}

@JvmName(name = "toByteBuffer3f")
infix fun Vec3<Float>.to(buffer: ByteBuffer) {
    buffer.putFloat(x)
    buffer.putFloat(y)
    buffer.putFloat(z)
}

@JvmName(name = "toBuffer3d")
infix fun Vec3<Double>.to(buffer: DoubleBuffer) {
    buffer.put(x)
    buffer.put(y)
    buffer.put(z)
}
