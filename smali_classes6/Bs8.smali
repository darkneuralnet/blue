.class public abstract LBs8;
.super Lns8;
.source "SourceFile"


# instance fields
.field public b:Z


# direct methods
.method public constructor <init>(LPn8;)V
    .locals 0

    invoke-direct {p0, p1}, Lns8;-><init>(LPn8;)V

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->f()V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 0

    return-void
.end method

.method public abstract g()Z
.end method

.method public final h()V
    .locals 2

    invoke-virtual {p0}, LBs8;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i()V
    .locals 2

    iget-boolean v0, p0, LBs8;->b:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, LBs8;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->d()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LBs8;->b:Z

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()V
    .locals 2

    iget-boolean v0, p0, LBs8;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LBs8;->f()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->d()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LBs8;->b:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, LBs8;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
