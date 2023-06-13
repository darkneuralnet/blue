.class public final synthetic LIa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LAa0$c;

.field public final synthetic c:Landroid/hardware/camera2/CameraCaptureSession;


# direct methods
.method public synthetic constructor <init>(LAa0$c;Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIa0;->b:LAa0$c;

    iput-object p2, p0, LIa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LIa0;->b:LAa0$c;

    iget-object v1, p0, LIa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-static {v0, v1}, LAa0$c;->e(LAa0$c;Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method
