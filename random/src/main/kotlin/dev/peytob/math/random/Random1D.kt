package dev.peytob.math.random

import kotlin.random.Random

/**
 * Returns random scalar sequence.
 */
interface Random1D {

    fun nextFloat(): Float

    fun nextInt(): Int

    fun nextInt(until: Int): Int

    fun nextInt(from: Int, until: Int): Int

    fun asKotlinRandom(): Random
}
