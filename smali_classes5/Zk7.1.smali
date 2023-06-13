.class public final LZk7;
.super LFa9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LVl7;->v()LVl7;

    move-result-object v0

    invoke-direct {p0, v0}, LFa9;-><init>(Lub9;)V

    return-void
.end method

.method public synthetic constructor <init>(Lrl9;)V
    .locals 0

    invoke-static {}, LVl7;->v()LVl7;

    move-result-object p1

    invoke-direct {p0, p1}, LFa9;-><init>(Lub9;)V

    return-void
.end method


# virtual methods
.method public final A(F)LZk7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LVl7;

    invoke-static {v0, p1}, LVl7;->w(LVl7;F)V

    return-object p0
.end method

.method public final B(Z)LZk7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LVl7;

    invoke-static {v0, p1}, LVl7;->C(LVl7;Z)V

    return-object p0
.end method

.method public final C(Z)LZk7;
    .locals 1

    iget-boolean p1, p0, LFa9;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LFa9;->d:Z

    :cond_0
    iget-object p1, p0, LFa9;->c:Lub9;

    check-cast p1, LVl7;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LVl7;->y(LVl7;Z)V

    return-object p0
.end method

.method public final D(I)LZk7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LVl7;

    invoke-static {v0, p1}, LVl7;->G(LVl7;I)V

    return-object p0
.end method

.method public final G(I)LZk7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LVl7;

    invoke-static {v0, p1}, LVl7;->F(LVl7;I)V

    return-object p0
.end method

.method public final H(I)LZk7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LVl7;

    invoke-static {v0, p1}, LVl7;->H(LVl7;I)V

    return-object p0
.end method

.method public final p(LCo9;)LZk7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LVl7;

    invoke-virtual {p1}, LFa9;->m()Lub9;

    move-result-object p1

    check-cast p1, LAq9;

    invoke-static {v0, p1}, LVl7;->A(LVl7;LAq9;)V

    return-object p0
.end method

.method public final t(Z)LZk7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LVl7;

    invoke-static {v0, p1}, LVl7;->x(LVl7;Z)V

    return-object p0
.end method

.method public final w(LRm7;)LZk7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LVl7;

    invoke-virtual {p1}, LFa9;->m()Lub9;

    move-result-object p1

    check-cast p1, LKn7;

    invoke-static {v0, p1}, LVl7;->z(LVl7;LKn7;)V

    return-object p0
.end method

.method public final y(LKn7;)LZk7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LVl7;

    invoke-static {v0, p1}, LVl7;->z(LVl7;LKn7;)V

    return-object p0
.end method

.method public final z(Lwr7;)LZk7;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFa9;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFa9;->d:Z

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LVl7;

    invoke-virtual {p1}, LFa9;->m()Lub9;

    move-result-object p1

    check-cast p1, Lls7;

    invoke-static {v0, p1}, LVl7;->B(LVl7;Lls7;)V

    return-object p0
.end method
