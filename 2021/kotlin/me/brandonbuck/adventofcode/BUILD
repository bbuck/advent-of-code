load("//:kotlin.bzl", "kt_jvm_binary", "kt_jvm_library")

kt_jvm_library(
    name = "greeter",
    srcs = ["Greeter.kt"],
)

kt_jvm_binary(
    name = "greeter_app",
    srcs = ["GreeterApp.kt"],
    main_class = "me.brandonbuck.adventofcode.GreeterAppKt",
    deps = [
        ":greeter",
    ],
)
