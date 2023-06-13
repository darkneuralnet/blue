.class public final Lla0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/q$d;


# static fields
.field public static final a:Lla0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lla0;

    invoke-direct {v0}, Lla0;-><init>()V

    sput-object v0, Lla0;->a:Lla0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/util/Size;Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/q$b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "Landroidx/camera/core/impl/s<",
            "*>;",
            "Landroidx/camera/core/impl/q$b;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroidx/camera/core/impl/s;->m(Landroidx/camera/core/impl/q;)Landroidx/camera/core/impl/q;

    move-result-object v1

    invoke-static {}, Landroidx/camera/core/impl/n;->S()Landroidx/camera/core/impl/n;

    move-result-object v2

    invoke-static {}, Landroidx/camera/core/impl/q;->a()Landroidx/camera/core/impl/q;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/camera/core/impl/q;->l()I

    move-result v3

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/camera/core/impl/q;->l()I

    move-result v3

    invoke-virtual {v1}, Landroidx/camera/core/impl/q;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroidx/camera/core/impl/q$b;->a(Ljava/util/Collection;)Landroidx/camera/core/impl/q$b;

    invoke-virtual {v1}, Landroidx/camera/core/impl/q;->i()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroidx/camera/core/impl/q$b;->c(Ljava/util/List;)Landroidx/camera/core/impl/q$b;

    invoke-virtual {v1}, Landroidx/camera/core/impl/q;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroidx/camera/core/impl/q$b;->b(Ljava/util/Collection;)Landroidx/camera/core/impl/q$b;

    invoke-virtual {v1}, Landroidx/camera/core/impl/q;->d()Landroidx/camera/core/impl/f;

    move-result-object v2

    :cond_0
    invoke-virtual {p3, v2}, Landroidx/camera/core/impl/q$b;->s(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/q$b;

    instance-of v1, p2, Landroidx/camera/core/impl/o;

    if-eqz v1, :cond_1

    invoke-static {p1, p3}, Lb24;->b(Landroid/util/Size;Landroidx/camera/core/impl/q$b;)V

    :cond_1
    new-instance p1, Lja0;

    invoke-direct {p1, p2}, Lja0;-><init>(Landroidx/camera/core/impl/f;)V

    invoke-virtual {p1, v3}, Lja0;->V(I)I

    move-result p2

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/q$b;->u(I)Landroidx/camera/core/impl/q$b;

    invoke-static {}, Lwb0;->b()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lja0;->W(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/q$b;->e(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroidx/camera/core/impl/q$b;

    invoke-static {}, LTa0;->b()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lja0;->Z(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/q$b;->j(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroidx/camera/core/impl/q$b;

    invoke-static {}, LK90;->c()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lja0;->Y(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p2

    invoke-static {p2}, Lcf0;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lcf0;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/q$b;->d(Lpa0;)Landroidx/camera/core/impl/q$b;

    invoke-static {}, Landroidx/camera/core/impl/m;->V()Landroidx/camera/core/impl/m;

    move-result-object p2

    sget-object v1, Lja0;->K:Landroidx/camera/core/impl/f$a;

    invoke-static {}, LCb0;->e()LCb0;

    move-result-object v2

    invoke-virtual {p1, v2}, Lja0;->S(LCb0;)LCb0;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    sget-object v1, Lja0;->M:Landroidx/camera/core/impl/f$a;

    invoke-virtual {p1, v0}, Lja0;->X(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v1, v0}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    sget-object v0, Lja0;->G:Landroidx/camera/core/impl/f$a;

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v1, v2}, Lja0;->a0(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/q$b;->g(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/q$b;

    invoke-virtual {p1}, Lja0;->T()Lnf0;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroidx/camera/core/impl/q$b;->g(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/q$b;

    return-void
.end method
