package dev.peytob.math.demo

import dev.peytob.math.field.CurlNoise22D
import dev.peytob.math.field.Field22D
import dev.peytob.math.geometry.rect.RectI
import dev.peytob.math.geometry.rect.rectI
import dev.peytob.math.noise.*
import dev.peytob.math.noise.decorator.ScaledNoiseDecorator
import dev.peytob.math.random.JdkRandom1DWrapper

import dev.peytob.math.vector.vec2.immutableVec2f
import dev.peytob.math.vector.vec2.immutableVec2i

fun main() {
    val defaultImageSize = immutableVec2i(512, 512)
    val random1 = JdkRandom1DWrapper(System.currentTimeMillis().toInt())

    buildNoiseImage(
        ScaledNoiseDecorator(PerlinNoise2D(random1.nextInt()), 1f / 64f, immutableVec2f()),
        rectI(immutableVec2i(), defaultImageSize),
        "perlin_1_div_64_scale"
    )

    buildNoiseImage(
        ScaledNoiseDecorator(PerlinNoise2D(random1.nextInt()), 0.1f, immutableVec2f(100f, 100f)),
        rectI(immutableVec2i(), defaultImageSize),
        "perlin_0_1_scale"
    )

    buildNoiseImage(
        FbmNoise2D(ScaledNoiseDecorator(PerlinNoise2D(random1.nextInt()), 1f / 64f, immutableVec2f()), 3),
        rectI(immutableVec2i(), defaultImageSize),
        "fbm_perlin"
    )

    buildNoiseImage(
        ScaledNoiseDecorator(WorleyNoise2D(random1.nextInt()), 1f / 128f, immutableVec2f(10f, 10f)),
        rectI(immutableVec2i(), defaultImageSize),
        "worley_noise"
    )

    buildNoiseImage(
        GoldNoise2D(random1.nextInt()),
        rectI(immutableVec2i(), defaultImageSize),
        "gold_noise"
    )
    buildFieldImage(
        CurlNoise22D(ScaledNoiseDecorator(PerlinNoise2D(random1.nextInt()), 0.05f, immutableVec2f())),
        rectI(immutableVec2i(), defaultImageSize),
        "curl_noise"
    )
}

fun buildNoiseImage(noise2D: Noise2D, noiseRect: RectI, filename: String) {
    val noiseImageBuilder = NoiseImageBuilder(noise2D)
    val buildImage = noiseImageBuilder.buildImage(noiseRect)
    buildImage.saveAsFile(filename, "png")
}

fun buildFieldImage(field2D: Field22D, noiseRect: RectI, filename: String) {
    val noiseImageBuilder = FieldImageBuilder(field2D)
    val buildImage = noiseImageBuilder.buildImage(noiseRect)
    buildImage.saveAsFile(filename, "png")
}
