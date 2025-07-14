package dev.peytob.math.random

import kotlin.random.Random

class JdkRandom1DWrapper(
    seed: Int
) : Random1D {

    private val random = Random(seed)

    override fun nextFloat(): Float = random.nextFloat()

    override fun nextInt(): Int = random.nextInt()

    override fun nextInt(until: Int): Int = random.nextInt(until)

    override fun nextInt(from: Int, until: Int): Int = random.nextInt(from, until)

    override fun asKotlinRandom(): Random = random
}