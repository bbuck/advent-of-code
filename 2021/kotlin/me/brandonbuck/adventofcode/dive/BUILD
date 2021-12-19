load("//:kotlin.bzl", "kt_jvm_binary", "kt_jvm_library")

kt_jvm_library(
    name = "vector",
    srcs = ["Vector.kt"],
)

kt_jvm_binary(
    name = "solution1",
    srcs = ["Solution1.kt"],
    main_class = "me.brandonbuck.adventofcode.dive.Solution1Kt",
    deps = [
        ":vector",
        "//2021/kotlin/me/brandonbuck/adventofcode/common:io",
    ],
)

kt_jvm_binary(
    name = "solution2",
    srcs = ["Solution2.kt"],
    main_class = "me.brandonbuck.adventofcode.dive.Solution2Kt",
    deps = [
        ":vector",
        "//2021/kotlin/me/brandonbuck/adventofcode/common:io",
    ],
)
