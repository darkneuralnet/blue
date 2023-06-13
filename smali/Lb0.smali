.class public interface abstract LLb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lna0;
.implements Landroidx/camera/core/p$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLb0$a;
    }
.end annotation


# virtual methods
.method public a()Landroidx/camera/core/CameraControl;
    .locals 1

    invoke-interface {p0}, LLb0;->k()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v0

    return-object v0
.end method

.method public b()LJb0;
    .locals 1

    invoke-interface {p0}, LLb0;->d()LKb0;

    move-result-object v0

    return-object v0
.end method

.method public abstract d()LKb0;
.end method

.method public e()Z
    .locals 1

    invoke-interface {p0}, LLb0;->b()LJb0;

    move-result-object v0

    invoke-interface {v0}, LJb0;->b()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f(Landroidx/camera/core/impl/c;)V
    .locals 0

    return-void
.end method

.method public abstract j()LZd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZd3<",
            "LLb0$a;",
            ">;"
        }
    .end annotation
.end method

.method public abstract k()Landroidx/camera/core/impl/CameraControlInternal;
.end method

.method public l()Landroidx/camera/core/impl/c;
    .locals 1

    invoke-static {}, Lbb0;->a()Landroidx/camera/core/impl/c;

    move-result-object v0

    return-object v0
.end method

.method public n(Z)V
    .locals 0

    return-void
.end method

.method public abstract o(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract p(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation
.end method

.method public q()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
