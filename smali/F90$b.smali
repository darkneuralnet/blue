.class public LF90$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF90;->d0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:LF90;


# direct methods
.method public constructor <init>(LF90;)V
    .locals 0

    iput-object p1, p0, LF90$b;->a:LF90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, LF90$b;->a:LF90;

    iget-object p1, p1, LF90;->t:Lkb0;

    invoke-interface {p1}, Lkb0;->c()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LF90$b;->a:LF90;

    iget-object p1, p1, LF90;->f:LF90$g;

    sget-object v0, LF90$g;->e:LF90$g;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LF90$b;->a:LF90;

    sget-object v0, LF90$g;->f:LF90$g;

    invoke-virtual {p1, v0}, LF90;->k0(LF90$g;)V

    :cond_0
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    instance-of v0, p1, Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;

    if-eqz v0, :cond_1

    iget-object v0, p0, LF90$b;->a:LF90;

    check-cast p1, Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;

    invoke-virtual {p1}, Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;->a()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object p1

    invoke-virtual {v0, p1}, LF90;->J(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LF90$b;->a:LF90;

    invoke-virtual {v0, p1}, LF90;->f0(Landroidx/camera/core/impl/q;)V

    :cond_0
    return-void

    :cond_1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_2

    iget-object p1, p0, LF90$b;->a:LF90;

    const-string v0, "Unable to configure camera cancelled"

    invoke-virtual {p1, v0}, LF90;->H(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, LF90$b;->a:LF90;

    iget-object v0, v0, LF90;->f:LF90$g;

    sget-object v1, LF90$g;->e:LF90$g;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, LF90$b;->a:LF90;

    const/4 v2, 0x4

    invoke-static {v2, p1}, Ljc0$a;->b(ILjava/lang/Throwable;)Ljc0$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LF90;->l0(LF90$g;Ljc0$a;)V

    :cond_3
    instance-of v0, p1, Landroid/hardware/camera2/CameraAccessException;

    if-eqz v0, :cond_4

    iget-object v0, p0, LF90$b;->a:LF90;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to configure camera due to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LF90;->H(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    instance-of p1, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz p1, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to configure camera "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LF90$b;->a:LF90;

    iget-object v0, v0, LF90;->k:LJ90;

    invoke-virtual {v0}, LJ90;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timeout!"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Camera2CameraImpl"

    invoke-static {v0, p1}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, LF90$b;->a(Ljava/lang/Void;)V

    return-void
.end method
