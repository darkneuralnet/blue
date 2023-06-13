.class public final Lcom/google/android/libraries/intelligence/acceleration/Analytics;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Z)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/libraries/intelligence/acceleration/Analytics;->nativeNotifyProcessLifecycleState(Z)V

    return-void
.end method

.method public static b()Z
    .locals 1

    invoke-static {}, Lcom/google/android/libraries/intelligence/acceleration/Analytics;->nativeIsProcessInBackground()Z

    move-result v0

    return v0
.end method

.method private static native nativeIsProcessInBackground()Z
.end method

.method private static native nativeNotifyProcessLifecycleState(Z)V
.end method
