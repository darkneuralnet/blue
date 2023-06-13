.class public final synthetic LGa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LAa0$b;

.field public final synthetic c:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic d:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic e:J

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(LAa0$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGa0;->b:LAa0$b;

    iput-object p2, p0, LGa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, LGa0;->d:Landroid/hardware/camera2/CaptureRequest;

    iput-wide p4, p0, LGa0;->e:J

    iput-wide p6, p0, LGa0;->f:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, LGa0;->b:LAa0$b;

    iget-object v1, p0, LGa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, LGa0;->d:Landroid/hardware/camera2/CaptureRequest;

    iget-wide v3, p0, LGa0;->e:J

    iget-wide v5, p0, LGa0;->f:J

    invoke-static/range {v0 .. v6}, LAa0$b;->d(LAa0$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V

    return-void
.end method
