.class public LL90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/d$b;


# static fields
.field public static final a:LL90;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LL90;

    invoke-direct {v0}, LL90;-><init>()V

    sput-object v0, LL90;->a:LL90;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/d$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/s<",
            "*>;",
            "Landroidx/camera/core/impl/d$a;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/camera/core/impl/s;->D(Landroidx/camera/core/impl/d;)Landroidx/camera/core/impl/d;

    move-result-object v0

    invoke-static {}, Landroidx/camera/core/impl/n;->S()Landroidx/camera/core/impl/n;

    move-result-object v1

    invoke-static {}, Landroidx/camera/core/impl/d;->a()Landroidx/camera/core/impl/d;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/camera/core/impl/d;->h()I

    move-result v2

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/d;->h()I

    move-result v2

    invoke-virtual {v0}, Landroidx/camera/core/impl/d;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroidx/camera/core/impl/d$a;->a(Ljava/util/Collection;)V

    invoke-virtual {v0}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object v1

    :cond_0
    invoke-virtual {p2, v1}, Landroidx/camera/core/impl/d$a;->r(Landroidx/camera/core/impl/f;)V

    new-instance v0, Lja0;

    invoke-direct {v0, p1}, Lja0;-><init>(Landroidx/camera/core/impl/f;)V

    invoke-virtual {v0, v2}, Lja0;->V(I)I

    move-result p1

    invoke-virtual {p2, p1}, Landroidx/camera/core/impl/d$a;->s(I)V

    invoke-static {}, LK90;->c()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    invoke-virtual {v0, p1}, Lja0;->Y(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    invoke-static {p1}, Lcf0;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lcf0;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/camera/core/impl/d$a;->c(Lpa0;)V

    invoke-virtual {v0}, Lja0;->T()Lnf0;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    return-void
.end method
