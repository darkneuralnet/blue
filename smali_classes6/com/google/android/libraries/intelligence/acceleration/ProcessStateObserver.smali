.class public Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFq2;


# static fields
.field public static b:Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;

    invoke-direct {v0}, Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;-><init>()V

    sput-object v0, Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;->b:Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;->b:Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;

    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/google/android/libraries/intelligence/acceleration/Analytics;->b()Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, LDe8;->a()LLifecycleOwner;

    move-result-object v0

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lw68;

    invoke-direct {v1, p0}, Lw68;-><init>(Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catch_0
    new-instance v0, Ljava/lang/UnsatisfiedLinkError;

    const-string v1, "Make sure analytics_jni_lib is loaded. For VisionKit Pipeline, analytics_jni_lib can be loaded by setting `include_acceleration_analytics` of `pipeline_android_library` to `True` and this method should be called after initializing Pipeline.java."

    invoke-direct {v0, v1}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onStart(LLifecycleOwner;)V
    .locals 0
    .annotation runtime Landroidx/lifecycle/l;
        value = .enum Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;
    .end annotation

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/libraries/intelligence/acceleration/Analytics;->a(Z)V

    return-void
.end method

.method public onStop(LLifecycleOwner;)V
    .locals 0
    .annotation runtime Landroidx/lifecycle/l;
        value = .enum Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;
    .end annotation

    const/4 p1, 0x1

    invoke-static {p1}, Lcom/google/android/libraries/intelligence/acceleration/Analytics;->a(Z)V

    return-void
.end method
