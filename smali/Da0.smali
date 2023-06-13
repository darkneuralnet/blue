.class public final synthetic LDa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LAa0$b;

.field public final synthetic c:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic d:I

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(LAa0$b;Landroid/hardware/camera2/CameraCaptureSession;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDa0;->b:LAa0$b;

    iput-object p2, p0, LDa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    iput p3, p0, LDa0;->d:I

    iput-wide p4, p0, LDa0;->e:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LDa0;->b:LAa0$b;

    iget-object v1, p0, LDa0;->c:Landroid/hardware/camera2/CameraCaptureSession;

    iget v2, p0, LDa0;->d:I

    iget-wide v3, p0, LDa0;->e:J

    invoke-static {v0, v1, v2, v3, v4}, LAa0$b;->e(LAa0$b;Landroid/hardware/camera2/CameraCaptureSession;IJ)V

    return-void
.end method
