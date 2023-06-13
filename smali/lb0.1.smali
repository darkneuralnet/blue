.class public final Llb0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb0$a;,
        Llb0$b;
    }
.end annotation


# instance fields
.field public final a:Llb0$a;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance p2, Lub0;

    invoke-direct {p2, p1}, Lub0;-><init>(Landroid/hardware/camera2/CameraDevice;)V

    iput-object p2, p0, Llb0;->a:Llb0$a;

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lrb0;->e(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Lrb0;

    move-result-object p1

    iput-object p1, p0, Llb0;->a:Llb0$a;

    :goto_0
    return-void
.end method

.method public static b(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Llb0;
    .locals 1

    new-instance v0, Llb0;

    invoke-direct {v0, p0, p1}, Llb0;-><init>(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)V

    return-object v0
.end method


# virtual methods
.method public a(Ltv5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;
        }
    .end annotation

    iget-object v0, p0, Llb0;->a:Llb0$a;

    invoke-interface {v0, p1}, Llb0$a;->a(Ltv5;)V

    return-void
.end method
