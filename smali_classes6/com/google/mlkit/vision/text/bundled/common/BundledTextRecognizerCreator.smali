.class public Lcom/google/mlkit/vision/text/bundled/common/BundledTextRecognizerCreator;
.super LR77;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LR77;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic newTextRecognizer(LWO1;)LP77;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/mlkit/vision/text/bundled/common/BundledTextRecognizerCreator;->newTextRecognizer(LWO1;)LvQ6;

    move-result-object p1

    return-object p1
.end method

.method public newTextRecognizer(LWO1;)LvQ6;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance p1, Landroid/os/RemoteException;

    const-string v0, "Please use newTextRecognizerWithOptions instead."

    invoke-direct {p1, v0}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic newTextRecognizerWithOptions(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboo;)LP77;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/mlkit/vision/text/bundled/common/BundledTextRecognizerCreator;->newTextRecognizerWithOptions(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboo;)LvQ6;

    move-result-object p1

    return-object p1
.end method

.method public newTextRecognizerWithOptions(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboo;)LvQ6;
    .locals 3

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    new-instance v0, LvQ6;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboo;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboo;->v()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboo;->u()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p1, v1, v2, p2}, LvQ6;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
