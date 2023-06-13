.class public final synthetic LCa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LAa0$b;

.field public final synthetic c:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic d:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic e:Landroid/view/Surface;

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(LAa0$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCa0;->b:LAa0$b;

    iput-object p2, p0, LCa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, LCa0;->d:Landroid/hardware/camera2/CaptureRequest;

    iput-object p4, p0, LCa0;->e:Landroid/view/Surface;

    iput-wide p5, p0, LCa0;->f:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, LCa0;->b:LAa0$b;

    iget-object v1, p0, LCa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, LCa0;->d:Landroid/hardware/camera2/CaptureRequest;

    iget-object v3, p0, LCa0;->e:Landroid/view/Surface;

    iget-wide v4, p0, LCa0;->f:J

    invoke-static/range {v0 .. v5}, LAa0$b;->a(LAa0$b;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V

    return-void
.end method
