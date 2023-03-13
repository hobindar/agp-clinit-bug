# This file contains proguard rules that apply to both the release and debug variants of the agent.
# Rules that that are specific to the debug variant should be placed in proguard-debug.pro instead.

-dontusemixedcaseclassnames
-verbose

-renamesourcefileattribute SourceFile

-keepattributes Exceptions, Deprecated, SourceFile, LineNumberTable, Synthetic

-keep class ca.hobin.bugdemo.** { *; }

-keep class android.os.** { *; }
