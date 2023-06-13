.class public final Lds7;
.super LZt7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LVs7;->E()LVs7;

    move-result-object v0

    invoke-direct {p0, v0}, LZt7;-><init>(Leu7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lmr7;)V
    .locals 0

    invoke-static {}, LVs7;->E()LVs7;

    move-result-object p1

    invoke-direct {p0, p1}, LZt7;-><init>(Leu7;)V

    return-void
.end method


# virtual methods
.method public final A(F)Lds7;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LVs7;

    const v0, 0x3f19999a    # 0.6f

    invoke-static {p1, v0}, LVs7;->J(LVs7;F)V

    return-object p0
.end method

.method public final B(I)Lds7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVs7;

    invoke-static {v0, p1}, LVs7;->I(LVs7;I)V

    return-object p0
.end method

.method public final C(I)Lds7;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LVs7;

    invoke-static {p1, v0}, LVs7;->K(LVs7;I)V

    return-object p0
.end method

.method public final D(Z)Lds7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVs7;

    invoke-static {v0, p1}, LVs7;->H(LVs7;Z)V

    return-object p0
.end method

.method public final p(LMu8;)Lds7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVs7;

    invoke-virtual {p1}, LZt7;->l()Leu7;

    move-result-object p1

    check-cast p1, LZu8;

    invoke-static {v0, p1}, LVs7;->G(LVs7;LZu8;)V

    return-object p0
.end method

.method public final q(LVF8;)Lds7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVs7;

    invoke-static {v0, p1}, LVs7;->L(LVs7;LVF8;)V

    return-object p0
.end method

.method public final r(LJF7;)Lds7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVs7;

    invoke-static {v0, p1}, LVs7;->F(LVs7;LJF7;)V

    return-object p0
.end method

.method public final t(Z)Lds7;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LVs7;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LVs7;->M(LVs7;Z)V

    return-object p0
.end method
