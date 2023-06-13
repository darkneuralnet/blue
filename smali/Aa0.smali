.class public final LAa0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAa0$a;,
        LAa0$c;,
        LAa0$b;
    }
.end annotation


# instance fields
.field public final a:LAa0$a;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance p2, LRa0;

    invoke-direct {p2, p1}, LRa0;-><init>(Landroid/hardware/camera2/CameraCaptureSession;)V

    iput-object p2, p0, LAa0;->a:LAa0$a;

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LSa0;->d(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)LAa0$a;

    move-result-object p1

    iput-object p1, p0, LAa0;->a:LAa0$a;

    :goto_0
    return-void
.end method

.method public static d(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)LAa0;
    .locals 1

    new-instance v0, LAa0;

    invoke-direct {v0, p0, p1}, LAa0;-><init>(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CaptureRequest;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    iget-object v0, p0, LAa0;->a:LAa0$a;

    invoke-interface {v0, p1, p2, p3}, LAa0$a;->b(Ljava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public b(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    iget-object v0, p0, LAa0;->a:LAa0$a;

    invoke-interface {v0, p1, p2, p3}, LAa0$a;->c(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public c()Landroid/hardware/camera2/CameraCaptureSession;
    .locals 1

    iget-object v0, p0, LAa0;->a:LAa0$a;

    invoke-interface {v0}, LAa0$a;->a()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    return-object v0
.end method
