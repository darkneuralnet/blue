.class public final Lbf0;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# instance fields
.field public final a:Lpa0;


# direct methods
.method public constructor <init>(Lpa0;)V
    .locals 1

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lbf0;->a:Lpa0;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cameraCaptureCallback is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V

    invoke-virtual {p2}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of p2, p1, LxY5;

    const-string v0, "The tagBundle object from the CaptureResult is not a TagBundle object."

    invoke-static {p2, v0}, LHZ3;->b(ZLjava/lang/Object;)V

    check-cast p1, LxY5;

    goto :goto_0

    :cond_0
    invoke-static {}, LxY5;->a()LxY5;

    move-result-object p1

    :goto_0
    iget-object p2, p0, Lbf0;->a:Lpa0;

    new-instance v0, LV80;

    invoke-direct {v0, p1, p3}, LV80;-><init>(LxY5;Landroid/hardware/camera2/CaptureResult;)V

    invoke-virtual {p2, v0}, Lpa0;->b(Lxa0;)V

    return-void
.end method

.method public onCaptureFailed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureFailed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V

    new-instance p1, Lra0;

    sget-object p2, Lra0$a;->b:Lra0$a;

    invoke-direct {p1, p2}, Lra0;-><init>(Lra0$a;)V

    iget-object p2, p0, Lbf0;->a:Lpa0;

    invoke-virtual {p2, p1}, Lpa0;->c(Lra0;)V

    return-void
.end method
