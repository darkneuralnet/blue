.class public interface abstract Lxa0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxa0$a;
    }
.end annotation


# virtual methods
.method public a(LWh1$b;)V
    .locals 1

    invoke-interface {p0}, Lxa0;->f()Lwa0;

    move-result-object v0

    invoke-virtual {p1, v0}, LWh1$b;->g(Lwa0;)LWh1$b;

    return-void
.end method

.method public abstract b()LxY5;
.end method

.method public abstract c()Lua0;
.end method

.method public abstract d()Lva0;
.end method

.method public abstract e()Lsa0;
.end method

.method public abstract f()Lwa0;
.end method

.method public g()Landroid/hardware/camera2/CaptureResult;
    .locals 1

    invoke-static {}, Lxa0$a;->h()Lxa0;

    move-result-object v0

    invoke-interface {v0}, Lxa0;->g()Landroid/hardware/camera2/CaptureResult;

    move-result-object v0

    return-object v0
.end method

.method public abstract getTimestamp()J
.end method
