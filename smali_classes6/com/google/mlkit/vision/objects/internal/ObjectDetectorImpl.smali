.class public Lcom/google/mlkit/vision/objects/internal/ObjectDetectorImpl;
.super Lcom/google/mlkit/vision/common/internal/MobileVisionBase;
.source "SourceFile"

# interfaces
.implements LLd3;


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/mlkit/vision/common/internal/MobileVisionBase<",
        "Ljava/util/List<",
        "LU11;",
        ">;>;",
        "LLd3;"
    }
.end annotation


# direct methods
.method public constructor <init>(LLE2;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;-><init>(LLE2;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static f(LLE2;Ljava/util/concurrent/Executor;)Lcom/google/mlkit/vision/objects/internal/ObjectDetectorImpl;
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLE2<",
            "Ljava/util/List<",
            "LU11;",
            ">;",
            "Lg32;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/mlkit/vision/objects/internal/ObjectDetectorImpl;"
        }
    .end annotation

    new-instance v0, Lcom/google/mlkit/vision/objects/internal/ObjectDetectorImpl;

    invoke-direct {v0, p0, p1}, Lcom/google/mlkit/vision/objects/internal/ObjectDetectorImpl;-><init>(LLE2;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public final h(Lg32;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg32;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "LU11;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lg32;->e()Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, LpX1;->g()LpX1;

    move-result-object v1

    invoke-virtual {v1, v0}, LpX1;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Lg32;->l()I

    move-result v1

    invoke-virtual {p1}, Lg32;->h()I

    move-result v2

    invoke-virtual {p1}, Lg32;->k()I

    move-result v3

    invoke-virtual {p1}, Lg32;->g()I

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lg32;->a(Ljava/nio/ByteBuffer;IIII)Lg32;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->a(Lg32;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
