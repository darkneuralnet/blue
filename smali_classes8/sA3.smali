.class public LsA3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:LeZ3;

.field public final c:LWB1;

.field public final d:LWB1;

.field public final e:LbC1;

.field public final f:Z

.field public g:LWB1;

.field public h:I

.field public i:LNW3;

.field public j:I


# direct methods
.method public constructor <init>(ILWB1;LWB1;LeZ3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LsA3;->a:I

    iput-object p4, p0, LsA3;->b:LeZ3;

    invoke-virtual {p2}, LWB1;->c0()LbC1;

    move-result-object p4

    iput-object p4, p0, LsA3;->e:LbC1;

    invoke-virtual {p2}, LWB1;->F()I

    move-result p4

    invoke-virtual {p3}, LWB1;->F()I

    move-result v0

    invoke-static {p1, p4, v0}, LyA3;->m(III)I

    move-result p1

    iput p1, p0, LsA3;->j:I

    invoke-virtual {p2}, LWB1;->F()I

    move-result p1

    if-nez p1, :cond_0

    iput-object p2, p0, LsA3;->c:LWB1;

    iput-object p3, p0, LsA3;->d:LWB1;

    const/4 p1, 0x0

    iput-boolean p1, p0, LsA3;->f:Z

    goto :goto_0

    :cond_0
    iput-object p3, p0, LsA3;->c:LWB1;

    iput-object p2, p0, LsA3;->d:LWB1;

    const/4 p1, 0x1

    iput-boolean p1, p0, LsA3;->f:Z

    :goto_0
    return-void
.end method

.method public static h(LWB1;LeZ3;)[LyB0;
    .locals 5

    new-instance v0, LDB0;

    invoke-direct {v0}, LDB0;-><init>()V

    invoke-virtual {p0}, LWB1;->f0()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, LWB1;->d0(I)LWB1;

    move-result-object v3

    check-cast v3, LFW3;

    invoke-virtual {v3}, LFW3;->r0()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v3, p1}, LyA3;->o(LFW3;LeZ3;)LyB0;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v4}, LDB0;->f(LyB0;Z)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LDB0;->b2()[LyB0;

    move-result-object p0

    return-object p0
.end method

.method public static i(LWB1;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWB1;",
            ")",
            "Ljava/util/List<",
            "LBr2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, LWB1;->f0()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, LWB1;->d0(I)LWB1;

    move-result-object v2

    check-cast v2, LBr2;

    invoke-virtual {v2}, LBr2;->r0()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static j(LWB1;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWB1;",
            ")",
            "Ljava/util/List<",
            "LCX3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, LWB1;->f0()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, LWB1;->d0(I)LWB1;

    move-result-object v2

    check-cast v2, LCX3;

    invoke-virtual {v2}, LCX3;->r0()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static n(ILWB1;LWB1;LeZ3;)LWB1;
    .locals 1

    new-instance v0, LsA3;

    invoke-direct {v0, p0, p1, p2, p3}, LsA3;-><init>(ILWB1;LWB1;LeZ3;)V

    invoke-virtual {v0}, LsA3;->l()LWB1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a([LyB0;)LWB1;
    .locals 1

    iget-boolean v0, p0, LsA3;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LsA3;->d()LWB1;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, LsA3;->k(Z[LyB0;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LsA3;->f(Ljava/util/List;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public final b([LyB0;)LWB1;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, LsA3;->k(Z[LyB0;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LsA3;->f(Ljava/util/List;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public final c([LyB0;)LWB1;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, LsA3;->k(Z[LyB0;)Ljava/util/List;

    move-result-object p1

    iget v0, p0, LsA3;->h:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LsA3;->g:LWB1;

    invoke-static {v0}, LsA3;->i(LWB1;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    iget v1, p0, LsA3;->h:I

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    iget-object v1, p0, LsA3;->g:LWB1;

    invoke-static {v1}, LsA3;->j(LWB1;)Ljava/util/List;

    move-result-object v2

    :cond_1
    iget-object v1, p0, LsA3;->e:LbC1;

    invoke-static {v2, v0, p1, v1}, LyA3;->c(Ljava/util/List;Ljava/util/List;Ljava/util/List;LbC1;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public final d()LWB1;
    .locals 2

    iget-object v0, p0, LsA3;->d:LWB1;

    iget-object v1, p0, LsA3;->g:LWB1;

    if-eq v0, v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v1}, LWB1;->m()LWB1;

    move-result-object v0

    return-object v0
.end method

.method public final e(LWB1;)LNW3;
    .locals 2

    iget v0, p0, LsA3;->h:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance v0, Lw12;

    invoke-direct {v0, p1}, Lw12;-><init>(LWB1;)V

    return-object v0

    :cond_0
    new-instance v0, Lx12;

    invoke-direct {v0, p1}, Lx12;-><init>(LWB1;)V

    return-object v0
.end method

.method public final f(Ljava/util/List;)LWB1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LFW3;",
            ">;)",
            "LWB1;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object p1, p0, LsA3;->e:LbC1;

    invoke-virtual {p1, v1}, LbC1;->b(I)LWB1;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LWB1;

    return-object p1

    :cond_1
    invoke-static {p1}, LbC1;->F(Ljava/util/Collection;)[LFW3;

    move-result-object p1

    iget-object v0, p0, LsA3;->e:LbC1;

    invoke-virtual {v0, p1}, LbC1;->o([LFW3;)LVW2;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/util/Set;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "LyB0;",
            ">;)",
            "Ljava/util/List<",
            "LFW3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LyB0;

    iget-object v2, p0, LsA3;->e:LbC1;

    invoke-virtual {v2, v1}, LbC1;->t(LyB0;)LFW3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final k(Z[LyB0;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z[",
            "LyB0;",
            ")",
            "Ljava/util/List<",
            "LFW3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p2, v2

    invoke-virtual {p0, p1, v3}, LsA3;->m(ZLyB0;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, LyB0;->e()LyB0;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, LsA3;->g(Ljava/util/Set;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public l()LWB1;
    .locals 3

    iget-object v0, p0, LsA3;->d:LWB1;

    invoke-virtual {p0, v0}, LsA3;->o(LWB1;)LWB1;

    move-result-object v0

    iput-object v0, p0, LsA3;->g:LWB1;

    invoke-virtual {v0}, LWB1;->F()I

    move-result v0

    iput v0, p0, LsA3;->h:I

    iget-object v0, p0, LsA3;->g:LWB1;

    invoke-virtual {p0, v0}, LsA3;->e(LWB1;)LNW3;

    move-result-object v0

    iput-object v0, p0, LsA3;->i:LNW3;

    iget-object v0, p0, LsA3;->c:LWB1;

    iget-object v1, p0, LsA3;->b:LeZ3;

    invoke-static {v0, v1}, LsA3;->h(LWB1;LeZ3;)[LyB0;

    move-result-object v0

    iget v1, p0, LsA3;->a:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const-string v0, "Unknown overlay op code"

    invoke-static {v0}, LKo;->f(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, LsA3;->a([LyB0;)LWB1;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0, v0}, LsA3;->c([LyB0;)LWB1;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {p0, v0}, LsA3;->b([LyB0;)LWB1;

    move-result-object v0

    return-object v0
.end method

.method public final m(ZLyB0;)Z
    .locals 2

    iget-object v0, p0, LsA3;->i:LNW3;

    invoke-interface {v0, p2}, LNW3;->a(LyB0;)I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-ne v1, p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p1, :cond_1

    xor-int/lit8 p1, p2, 0x1

    return p1

    :cond_1
    return p2
.end method

.method public final o(LWB1;)LWB1;
    .locals 1

    iget v0, p0, LsA3;->j:I

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, LsA3;->d:LWB1;

    iget-object v0, p0, LsA3;->b:LeZ3;

    invoke-static {p1, v0}, LtA3;->o(LWB1;LeZ3;)LWB1;

    move-result-object p1

    return-object p1
.end method
