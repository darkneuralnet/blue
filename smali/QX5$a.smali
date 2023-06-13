.class public LQX5$a;
.super LDX5$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQX5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V
    .locals 0

    invoke-direct {p0}, LDX5$a;-><init>()V

    iput-object p1, p0, LQX5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, LTa0;->a(Ljava/util/List;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object p1

    invoke-direct {p0, p1}, LQX5$a;-><init>(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    return-void
.end method


# virtual methods
.method public m(LDX5;)V
    .locals 1

    iget-object v0, p0, LQX5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, LDX5;->f()LAa0;

    move-result-object p1

    invoke-virtual {p1}, LAa0;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onActive(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public n(LDX5;)V
    .locals 1

    iget-object v0, p0, LQX5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, LDX5;->f()LAa0;

    move-result-object p1

    invoke-virtual {p1}, LAa0;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-static {v0, p1}, Luh;->b(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public o(LDX5;)V
    .locals 1

    iget-object v0, p0, LQX5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, LDX5;->f()LAa0;

    move-result-object p1

    invoke-virtual {p1}, LAa0;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public p(LDX5;)V
    .locals 1

    iget-object v0, p0, LQX5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, LDX5;->f()LAa0;

    move-result-object p1

    invoke-virtual {p1}, LAa0;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public q(LDX5;)V
    .locals 1

    iget-object v0, p0, LQX5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, LDX5;->f()LAa0;

    move-result-object p1

    invoke-virtual {p1}, LAa0;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public r(LDX5;)V
    .locals 1

    iget-object v0, p0, LQX5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, LDX5;->f()LAa0;

    move-result-object p1

    invoke-virtual {p1}, LAa0;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onReady(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public s(LDX5;)V
    .locals 0

    return-void
.end method

.method public t(LDX5;Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, LQX5$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, LDX5;->f()LAa0;

    move-result-object p1

    invoke-virtual {p1}, LAa0;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lph;->a(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V

    return-void
.end method
