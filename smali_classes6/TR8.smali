.class public abstract LTR8;
.super LIR8;
.source "SourceFile"


# instance fields
.field public c:Z


# direct methods
.method public constructor <init>(LhV8;)V
    .locals 0

    invoke-direct {p0, p1}, LIR8;-><init>(LhV8;)V

    iget-object p1, p0, LIR8;->b:LhV8;

    invoke-virtual {p1}, LhV8;->o()V

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 2

    invoke-virtual {p0}, LTR8;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()V
    .locals 2

    iget-boolean v0, p0, LTR8;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LTR8;->i()Z

    iget-object v0, p0, LIR8;->b:LhV8;

    invoke-virtual {v0}, LhV8;->j()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LTR8;->c:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t initialize twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, LTR8;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract i()Z
.end method
