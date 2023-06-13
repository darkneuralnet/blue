.class public final LlF8;
.super LZt7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LVF8;->E()LVF8;

    move-result-object v0

    invoke-direct {p0, v0}, LZt7;-><init>(Leu7;)V

    return-void
.end method

.method public synthetic constructor <init>(LZE8;)V
    .locals 0

    invoke-static {}, LVF8;->E()LVF8;

    move-result-object p1

    invoke-direct {p0, p1}, LZt7;-><init>(Leu7;)V

    return-void
.end method


# virtual methods
.method public final A(Low8;)LlF8;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVF8;

    invoke-virtual {p1}, LZt7;->l()Leu7;

    move-result-object p1

    check-cast p1, LCw8;

    invoke-static {v0, p1}, LVF8;->F(LVF8;LCw8;)V

    return-object p0
.end method

.method public final B(LCw8;)LlF8;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVF8;

    invoke-static {v0, p1}, LVF8;->F(LVF8;LCw8;)V

    return-object p0
.end method

.method public final C(F)LlF8;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVF8;

    invoke-static {v0, p1}, LVF8;->I(LVF8;F)V

    return-object p0
.end method

.method public final D(Low8;)LlF8;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVF8;

    invoke-virtual {p1}, LZt7;->l()Leu7;

    move-result-object p1

    check-cast p1, LCw8;

    invoke-static {v0, p1}, LVF8;->G(LVF8;LCw8;)V

    return-object p0
.end method

.method public final p(Ljava/lang/Iterable;)LlF8;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVF8;

    invoke-static {v0, p1}, LVF8;->J(LVF8;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final q(Ljava/lang/String;)LlF8;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LVF8;

    const-string v0, ""

    invoke-static {p1, v0}, LVF8;->L(LVF8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final r(LNw7;)LlF8;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVF8;

    invoke-static {v0, p1}, LVF8;->K(LVF8;LNw7;)V

    return-object p0
.end method

.method public final t(I)LlF8;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LVF8;

    invoke-static {v0, p1}, LVF8;->H(LVF8;I)V

    return-object p0
.end method
