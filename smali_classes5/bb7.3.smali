.class public Lbb7;
.super Lab7;
.source "SourceFile"

# interfaces
.implements LUb7;


# direct methods
.method public constructor <init>(Lcb7;)V
    .locals 0

    invoke-direct {p0, p1}, Lab7;-><init>(Lfb7;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic p()Lfb7;
    .locals 1

    invoke-virtual {p0}, Lbb7;->t()Lcb7;

    move-result-object v0

    return-object v0
.end method

.method public final r()V
    .locals 2

    invoke-super {p0}, Lab7;->r()V

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, Lcb7;

    iget-object v0, v0, Lcb7;->zbb:LTa7;

    invoke-static {}, LTa7;->e()LTa7;

    move-result-object v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, Lcb7;

    iget-object v1, v0, Lcb7;->zbb:LTa7;

    invoke-virtual {v1}, LTa7;->d()LTa7;

    move-result-object v1

    iput-object v1, v0, Lcb7;->zbb:LTa7;

    :cond_0
    return-void
.end method

.method public final t()Lcb7;
    .locals 1

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, Lcb7;

    invoke-virtual {v0}, Lfb7;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, Lcb7;

    return-object v0

    :cond_0
    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, Lcb7;

    iget-object v0, v0, Lcb7;->zbb:LTa7;

    invoke-virtual {v0}, LTa7;->h()V

    invoke-super {p0}, Lab7;->p()Lfb7;

    move-result-object v0

    check-cast v0, Lcb7;

    return-object v0
.end method

.method public final bridge synthetic u1()LTb7;
    .locals 1

    invoke-virtual {p0}, Lbb7;->t()Lcb7;

    move-result-object v0

    return-object v0
.end method
