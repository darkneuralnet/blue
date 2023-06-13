.class public final synthetic Lpb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Llb0$b;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Llb0$b;Landroid/hardware/camera2/CameraDevice;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb0;->b:Llb0$b;

    iput-object p2, p0, Lpb0;->c:Landroid/hardware/camera2/CameraDevice;

    iput p3, p0, Lpb0;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lpb0;->b:Llb0$b;

    iget-object v1, p0, Lpb0;->c:Landroid/hardware/camera2/CameraDevice;

    iget v2, p0, Lpb0;->d:I

    invoke-static {v0, v1, v2}, Llb0$b;->c(Llb0$b;Landroid/hardware/camera2/CameraDevice;I)V

    return-void
.end method
