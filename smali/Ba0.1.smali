.class public final synthetic LBa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LAa0$b;

.field public final synthetic c:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LAa0$b;Landroid/hardware/camera2/CameraCaptureSession;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBa0;->b:LAa0$b;

    iput-object p2, p0, LBa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    iput p3, p0, LBa0;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LBa0;->b:LAa0$b;

    iget-object v1, p0, LBa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    iget v2, p0, LBa0;->d:I

    invoke-static {v0, v1, v2}, LAa0$b;->c(LAa0$b;Landroid/hardware/camera2/CameraCaptureSession;I)V

    return-void
.end method
