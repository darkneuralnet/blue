.class public LlV3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/List;

.field public b:LN83;

.field public c:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LlV3;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LlV3;->c:Ljava/util/List;

    new-instance v0, LN83;

    new-instance v1, LJ83;

    invoke-direct {v1}, LJ83;-><init>()V

    invoke-direct {v0, v1}, LN83;-><init>(LJ83;)V

    iput-object v0, p0, LlV3;->b:LN83;

    return-void
.end method

.method public constructor <init>(LJ83;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LlV3;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LlV3;->c:Ljava/util/List;

    new-instance v0, LN83;

    invoke-direct {v0, p1}, LN83;-><init>(LJ83;)V

    iput-object v0, p0, LlV3;->b:LN83;

    return-void
.end method

.method public static j(Ljava/util/Collection;)V
    .locals 1

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD83;

    invoke-virtual {v0}, LD83;->k()Lz91;

    move-result-object v0

    check-cast v0, Ll41;

    invoke-virtual {v0}, Ll41;->p()V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lv91;)V
    .locals 1

    iget-object v0, p0, LlV3;->b:LN83;

    invoke-virtual {v0, p1}, LN83;->a(Lv91;)V

    iget-object v0, p0, LlV3;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 4

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq91;

    iget-object v1, p0, LlV3;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lk41;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lk41;-><init>(Lq91;Z)V

    new-instance v2, Lk41;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lk41;-><init>(Lq91;Z)V

    invoke-virtual {v1, v2}, Lk41;->H(Lk41;)V

    invoke-virtual {v2, v1}, Lk41;->H(Lk41;)V

    invoke-virtual {p0, v1}, LlV3;->a(Lv91;)V

    invoke-virtual {p0, v2}, LlV3;->a(Lv91;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(LyB0;)LD83;
    .locals 1

    iget-object v0, p0, LlV3;->b:LN83;

    invoke-virtual {v0, p1}, LN83;->b(LyB0;)LD83;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LlV3;->c:Ljava/util/List;

    return-object v0
.end method

.method public e()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LlV3;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LlV3;->b:LN83;

    invoke-virtual {v0}, LN83;->e()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LlV3;->b:LN83;

    invoke-virtual {v0}, LN83;->f()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public h(Lq91;)V
    .locals 1

    iget-object v0, p0, LlV3;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public i(ILyB0;)Z
    .locals 1

    iget-object v0, p0, LlV3;->b:LN83;

    invoke-virtual {v0, p2}, LN83;->c(LyB0;)LD83;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    :cond_0
    invoke-virtual {p2}, LSD1;->b()LSl2;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, LSl2;->d(I)I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    return p2

    :cond_1
    return v0
.end method
