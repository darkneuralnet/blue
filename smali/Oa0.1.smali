.class public final synthetic LOa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LAa0$c;

.field public final synthetic c:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic d:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(LAa0$c;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOa0;->b:LAa0$c;

    iput-object p2, p0, LOa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, LOa0;->d:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LOa0;->b:LAa0$c;

    iget-object v1, p0, LOa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, LOa0;->d:Landroid/view/Surface;

    invoke-static {v0, v1, v2}, LAa0$c;->a(LAa0$c;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V

    return-void
.end method
