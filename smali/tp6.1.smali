.class public interface abstract Ltp6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltp6$a;
    }
.end annotation


# virtual methods
.method public abstract a(Landroidx/camera/core/o;)V
.end method

.method public b()LZd3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZd3<",
            "LFP2;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LQy0;->f(Ljava/lang/Object;)LZd3;

    move-result-object v0

    return-object v0
.end method

.method public c()LZd3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZd3<",
            "LuR5;",
            ">;"
        }
    .end annotation

    sget-object v0, LuR5;->c:LZd3;

    return-object v0
.end method

.method public d(Ltp6$a;)V
    .locals 0

    return-void
.end method

.method public e(Landroidx/camera/core/o;Lr46;)V
    .locals 0

    invoke-interface {p0, p1}, Ltp6;->a(Landroidx/camera/core/o;)V

    return-void
.end method
