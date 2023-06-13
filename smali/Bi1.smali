.class public LBi1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lr90;

.field public final b:LCi1;

.field public final c:Ljava/util/concurrent/Executor;

.field public d:Z

.field public e:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lr90$c;


# direct methods
.method public constructor <init>(Lr90;LWa0;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LBi1;->d:Z

    iput-object p1, p0, LBi1;->a:Lr90;

    new-instance p1, LCi1;

    invoke-direct {p1, p2, v0}, LCi1;-><init>(LWa0;I)V

    iput-object p1, p0, LBi1;->b:LCi1;

    iput-object p3, p0, LBi1;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, LBi1;->e:LO80$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v3, "Cancelled by another setExposureCompensationIndex()"

    invoke-direct {v2, v3}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LO80$a;->f(Ljava/lang/Throwable;)Z

    iput-object v1, p0, LBi1;->e:LO80$a;

    :cond_0
    iget-object v0, p0, LBi1;->f:Lr90$c;

    if-eqz v0, :cond_1

    iget-object v2, p0, LBi1;->a:Lr90;

    invoke-virtual {v2, v0}, Lr90;->d0(Lr90$c;)V

    iput-object v1, p0, LBi1;->f:Lr90$c;

    :cond_1
    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-boolean v0, p0, LBi1;->d:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, LBi1;->d:Z

    if-nez p1, :cond_1

    iget-object p1, p0, LBi1;->b:LCi1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LCi1;->b(I)V

    invoke-virtual {p0}, LBi1;->a()V

    :cond_1
    return-void
.end method

.method public c(Lja0$a;)V
    .locals 2

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_EXPOSURE_COMPENSATION:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v1, p0, LBi1;->b:LCi1;

    invoke-virtual {v1}, LCi1;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    return-void
.end method
