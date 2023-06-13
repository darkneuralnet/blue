.class public final LoO7;
.super LZt7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LSO7;->E()LSO7;

    move-result-object v0

    invoke-direct {p0, v0}, LZt7;-><init>(Leu7;)V

    return-void
.end method

.method public synthetic constructor <init>(LaO7;)V
    .locals 0

    invoke-static {}, LSO7;->E()LSO7;

    move-result-object p1

    invoke-direct {p0, p1}, LZt7;-><init>(Leu7;)V

    return-void
.end method


# virtual methods
.method public final A(I)LoO7;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LSO7;

    const/4 v0, 0x3

    invoke-static {p1, v0}, LSO7;->J(LSO7;I)V

    return-object p0
.end method

.method public final p(F)LoO7;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LSO7;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LSO7;->F(LSO7;F)V

    return-object p0
.end method

.method public final q(I)LoO7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LSO7;

    invoke-static {v0, p1}, LSO7;->H(LSO7;I)V

    return-object p0
.end method

.method public final r(Z)LoO7;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LSO7;

    invoke-static {p1, v0}, LSO7;->G(LSO7;Z)V

    return-object p0
.end method

.method public final t(F)LoO7;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LSO7;

    const v0, 0x3e4ccccd    # 0.2f

    invoke-static {p1, v0}, LSO7;->I(LSO7;F)V

    return-object p0
.end method
