.class public LSa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAa0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSa0$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/hardware/camera2/CameraCaptureSession;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraCaptureSession;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p1, p0, LSa0;->a:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p2, p0, LSa0;->b:Ljava/lang/Object;

    return-void
.end method

.method public static d(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)LAa0$a;
    .locals 2

    new-instance v0, LSa0;

    new-instance v1, LSa0$a;

    invoke-direct {v1, p1}, LSa0$a;-><init>(Landroid/os/Handler;)V

    invoke-direct {v0, p0, v1}, LSa0;-><init>(Landroid/hardware/camera2/CameraCaptureSession;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/hardware/camera2/CameraCaptureSession;
    .locals 1

    iget-object v0, p0, LSa0;->a:Landroid/hardware/camera2/CameraCaptureSession;

    return-object v0
.end method

.method public b(Ljava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
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

    new-instance v0, LAa0$b;

    invoke-direct {v0, p2, p3}, LAa0$b;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V

    iget-object p2, p0, LSa0;->b:Ljava/lang/Object;

    check-cast p2, LSa0$a;

    iget-object p3, p0, LSa0;->a:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object p2, p2, LSa0$a;->a:Landroid/os/Handler;

    invoke-virtual {p3, p1, v0, p2}, Landroid/hardware/camera2/CameraCaptureSession;->captureBurst(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    move-result p1

    return p1
.end method

.method public c(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    new-instance v0, LAa0$b;

    invoke-direct {v0, p2, p3}, LAa0$b;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V

    iget-object p2, p0, LSa0;->b:Ljava/lang/Object;

    check-cast p2, LSa0$a;

    iget-object p3, p0, LSa0;->a:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object p2, p2, LSa0$a;->a:Landroid/os/Handler;

    invoke-virtual {p3, p1, v0, p2}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    move-result p1

    return p1
.end method
