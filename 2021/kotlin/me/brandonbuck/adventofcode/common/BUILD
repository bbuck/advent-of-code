load("//:kotlin.bzl", "kt_jvm_binary", "kt_jvm_library")

kt_jvm_library(
    name = "io",
    srcs = ["Io.kt"],
    visibility = ["//visibility:public"],
)

kt_jvm_binary(
    name = "IoExec",
    srcs = ["Io.kt"],
    main_class = "me.brandonbuck.adventofcode.common.io.IoKt",
)
