package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.Vec2f
import dev.peytob.math.vector.vec2.Vec2i
import dev.peytob.math.vector.vec2.immutableVec2f
import dev.peytob.math.vector.vec2.immutableVec2i
import kotlin.math.max
import kotlin.math.min

@JvmName(name = "containsRectF")
operator fun dev.peytob.math.geometry.rect.RectF.contains(point: Vec2f): Boolean {
    return contains(point.x, point.y)
}

@JvmName(name = "containsRectF")
fun dev.peytob.math.geometry.rect.RectF.contains(px: Float, py: Float): Boolean {
    val minX = min(position.x, position.x + size.x)
    val maxX = max(position.x, position.x + size.x)
    val minY = min(position.y, position.y + size.y)
    val maxY = max(position.y, position.y + size.y)

    return (px >= minX) && (px < maxX) && (py >= minY) && (py < maxY)
}

@JvmName(name = "findIntersectionRectFRectF")
fun findIntersection(left: dev.peytob.math.geometry.rect.RectF, right: dev.peytob.math.geometry.rect.RectF): dev.peytob.math.geometry.rect.RectF? {
    val r1MinX = min(left.position.x, left.position.x + left.size.x)
    val r1MaxX = max(left.position.x, left.position.x + left.size.x)
    val r1MinY = min(left.position.y, left.position.y + left.size.y)
    val r1MaxY = max(left.position.y, left.position.y + left.size.y)

    val r2MinX = min(right.position.x, right.position.x + right.size.x)
    val r2MaxX = max(right.position.x, right.position.x + right.size.x)
    val r2MinY = min(right.position.y, right.position.y + right.size.y)
    val r2MaxY = max(right.position.y, right.position.y + right.size.y)

    val interLeft = max(r1MinX, r2MinX)
    val interTop = max(r1MinY, r2MinY)
    val interRight = min(r1MaxX, r2MaxX)
    val interBottom = min(r1MaxY, r2MaxY)

    // Intersection should be non-zero
    if ((interLeft < interRight) && (interTop < interBottom)) {
        return StructRectF(
            position = immutableVec2f(interLeft, interTop),
            size = immutableVec2f(interRight - interLeft, interBottom - interTop)
        )
    }

    return null
}

@JvmName(name = "containsRectI")
operator fun dev.peytob.math.geometry.rect.RectI.contains(point: Vec2i): Boolean {
    return contains(point.x, point.y)
}

@JvmName(name = "containsRectI")
fun dev.peytob.math.geometry.rect.RectI.contains(px: Int, py: Int): Boolean {
    val minX = min(position.x, position.x + size.x)
    val maxX = max(position.x, position.x + size.x)
    val minY = min(position.y, position.y + size.y)
    val maxY = max(position.y, position.y + size.y)

    return (px >= minX) && (px < maxX) && (py >= minY) && (py < maxY)
}

@JvmName(name = "findIntersectionRectIRectI")
fun findIntersection(left: dev.peytob.math.geometry.rect.RectI, right: dev.peytob.math.geometry.rect.RectI): dev.peytob.math.geometry.rect.RectI? {
    val r1MinX = min(left.position.x, left.position.x + left.size.x)
    val r1MaxX = max(left.position.x, left.position.x + left.size.x)
    val r1MinY = min(left.position.y, left.position.y + left.size.y)
    val r1MaxY = max(left.position.y, left.position.y + left.size.y)

    val r2MinX = min(right.position.x, right.position.x + right.size.x)
    val r2MaxX = max(right.position.x, right.position.x + right.size.x)
    val r2MinY = min(right.position.y, right.position.y + right.size.y)
    val r2MaxY = max(right.position.y, right.position.y + right.size.y)

    val interLeft = max(r1MinX, r2MinX)
    val interTop = max(r1MinY, r2MinY)
    val interRight = min(r1MaxX, r2MaxX)
    val interBottom = min(r1MaxY, r2MaxY)

    // Intersection should be non-zero
    if ((interLeft < interRight) && (interTop < interBottom)) {
        return StructRectI(
            position = immutableVec2i(interLeft, interTop),
            size = immutableVec2i(interRight - interLeft, interBottom - interTop)
        )
    }

    return null
}
