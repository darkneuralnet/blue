.class public final LfS7;
.super LZt7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LuS7;->F()LuS7;

    move-result-object v0

    invoke-direct {p0, v0}, LZt7;-><init>(Leu7;)V

    return-void
.end method

.method public synthetic constructor <init>(LQR7;)V
    .locals 0

    invoke-static {}, LuS7;->F()LuS7;

    move-result-object p1

    invoke-direct {p0, p1}, LZt7;-><init>(Leu7;)V

    return-void
.end method


# virtual methods
.method public final p(LEe8;)LfS7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LuS7;

    invoke-virtual {p1}, LZt7;->l()Leu7;

    move-result-object p1

    check-cast p1, Lrm8;

    invoke-static {v0, p1}, LuS7;->H(LuS7;Lrm8;)V

    return-object p0
.end method

.method public final q(LvA8;)LfS7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LuS7;

    invoke-virtual {p1}, LZt7;->l()Leu7;

    move-result-object p1

    check-cast p1, LaH8;

    invoke-static {v0, p1}, LuS7;->J(LuS7;LaH8;)V

    return-object p0
.end method

.method public final r(Lj38;)LfS7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LuS7;

    invoke-virtual {p1}, LZt7;->l()Leu7;

    move-result-object p1

    check-cast p1, Lo48;

    invoke-static {v0, p1}, LuS7;->I(LuS7;Lo48;)V

    return-object p0
.end method

.method public final t(Lfh8;)LfS7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LuS7;

    invoke-virtual {p1}, LZt7;->l()Leu7;

    move-result-object p1

    check-cast p1, Lth8;

    invoke-static {v0, p1}, LuS7;->G(LuS7;Lth8;)V

    return-object p0
.end method
