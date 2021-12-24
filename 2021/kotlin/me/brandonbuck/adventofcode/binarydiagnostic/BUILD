load("//:kotlin.bzl", "kt_jvm_binary", "kt_jvm_library")

kt_jvm_library(
    name = "binary_processing",
    srcs = ["BinaryProcessing.kt"],
)

kt_jvm_binary(
    name = "solution1",
    srcs = ["Solution1.kt"],
    main_class = "me.brandonbuck.adventofcode.binarydiagnostic.Solution1Kt",
    deps = [
        ":binary_processing",
        "//2021/kotlin/me/brandonbuck/adventofcode/common:io",
    ],
)

kt_jvm_binary(
    name = "solution2",
    srcs = ["Solution2.kt"],
    main_class = "me.brandonbuck.adventofcode.binarydiagnostic.Solution2Kt",
    deps = [
        ":binary_processing",
        "//2021/kotlin/me/brandonbuck/adventofcode/common:io",
    ],
)
