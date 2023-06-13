.class public final synthetic Lmb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Llb0$b;

.field public final synthetic c:Landroid/hardware/camera2/CameraDevice;


# direct methods
.method public synthetic constructor <init>(Llb0$b;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmb0;->b:Llb0$b;

    iput-object p2, p0, Lmb0;->c:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lmb0;->b:Llb0$b;

    iget-object v1, p0, Lmb0;->c:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v0, v1}, Llb0$b;->d(Llb0$b;Landroid/hardware/camera2/CameraDevice;)V

    return-void
.end method
