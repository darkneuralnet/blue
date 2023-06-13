.class public Lcom/google/android/gms/vision/face/mlkit/FaceDetectorCreator;
.super Ls29;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation

.annotation build Lcom/google/android/gms/common/util/RetainForClient;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ls29;-><init>()V

    return-void
.end method


# virtual methods
.method public newFaceDetector(LWO1;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;)LY19;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    new-instance v2, LmC7;

    invoke-direct {v2, p1}, LmC7;-><init>(Landroid/content/Context;)V

    :try_start_0
    const-string v3, "face_detector_v2_jni"

    invoke-static {v3}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v3, v0

    const/4 v0, 0x0

    invoke-virtual {v2, p2, v0, v3, v4}, LmC7;->b(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;Ljava/lang/String;J)V

    new-instance v0, LPe7;

    new-instance v1, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;

    invoke-direct {v1}, Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;-><init>()V

    invoke-direct {v0, p1, p2, v1, v2}, LPe7;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;Lcom/google/android/gms/vision/face/FaceDetectorV2Jni;LmC7;)V

    return-object v0

    :catch_0
    move-exception p1

    const-string v3, "FaceDetectorCreator"

    const-string v4, "Failed to load library face_detector_v2_jni"

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    sub-long/2addr v5, v0

    invoke-virtual {v2, p2, v4, v5, v6}, LmC7;->b(Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;Ljava/lang/String;J)V

    invoke-static {v4}, Lu68;->a(Ljava/lang/String;)Landroid/os/RemoteException;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Landroid/os/RemoteException;

    throw p1
.end method
