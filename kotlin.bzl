"""
Provide friendlier Kotlin rule exports.
"""

load(
    "@io_bazel_rules_kotlin//kotlin:kotlin.bzl",
    _kt_jvm_binary = "kt_jvm_binary",
    _kt_jvm_library = "kt_jvm_library",
)

kt_jvm_library = _kt_jvm_library
kt_jvm_binary = _kt_jvm_binary
