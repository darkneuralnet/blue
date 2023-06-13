.class public LF91;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LeZ3;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LS83;",
            ">;"
        }
    .end annotation
.end field

.field public c:LT83;

.field public d:Lsf1;

.field public e:Lnb5;

.field public f:Lvr2;

.field public g:[Z


# direct methods
.method public constructor <init>(LeZ3;LT83;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LF91;->b:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, LF91;->d:Lsf1;

    const/4 v0, 0x2

    new-array v0, v0, [Z

    iput-object v0, p0, LF91;->g:[Z

    iput-object p1, p0, LF91;->a:LeZ3;

    iput-object p2, p0, LF91;->c:LT83;

    return-void
.end method

.method public static k(LKr2;Z)I
    .locals 0

    invoke-virtual {p0}, LBr2;->M0()LEB0;

    move-result-object p0

    invoke-static {p0}, LDy3;->b(LEB0;)Z

    move-result p0

    if-nez p1, :cond_0

    xor-int/lit8 p0, p0, 0x1

    :cond_0
    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method public static m(LeZ3;)LT83;
    .locals 1

    new-instance v0, LmM5;

    invoke-direct {v0, p0}, LmM5;-><init>(LeZ3;)V

    return-object v0
.end method

.method public static n(Z)LT83;
    .locals 3

    new-instance v0, LEE2;

    invoke-direct {v0}, LEE2;-><init>()V

    new-instance v1, LBb5;

    invoke-direct {v1}, LBb5;-><init>()V

    new-instance v2, LO62;

    invoke-direct {v2, v1}, LO62;-><init>(Lsr2;)V

    invoke-virtual {v0, v2}, LlB5;->c(LVq5;)V

    if-eqz p0, :cond_0

    new-instance p0, Ltj6;

    invoke-direct {p0, v0}, Ltj6;-><init>(LT83;)V

    move-object v0, p0

    :cond_0
    return-object v0
.end method

.method public static u(LBr2;)[LyB0;
    .locals 0

    invoke-virtual {p0}, LBr2;->Y()[LyB0;

    move-result-object p0

    invoke-static {p0}, LBB0;->g([LyB0;)[LyB0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LWB1;I)V
    .locals 1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {p0, v0}, LF91;->q(Lsf1;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    instance-of v0, p1, LCX3;

    if-eqz v0, :cond_2

    check-cast p1, LCX3;

    invoke-virtual {p0, p1, p2}, LF91;->g(LCX3;I)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, LBr2;

    if-eqz v0, :cond_3

    check-cast p1, LBr2;

    invoke-virtual {p0, p1, p2}, LF91;->e(LBr2;I)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, LDW2;

    if-eqz v0, :cond_4

    check-cast p1, LDW2;

    invoke-virtual {p0, p1, p2}, LF91;->b(LXB1;I)V

    goto :goto_0

    :cond_4
    instance-of v0, p1, LWW2;

    if-eqz v0, :cond_5

    check-cast p1, LWW2;

    invoke-virtual {p0, p1, p2}, LF91;->b(LXB1;I)V

    goto :goto_0

    :cond_5
    instance-of v0, p1, LXB1;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, LXB1;

    invoke-virtual {p1}, LWB1;->F()I

    move-result p1

    invoke-virtual {p0, v0, p2, p1}, LF91;->d(LXB1;II)V

    :cond_6
    :goto_0
    return-void
.end method

.method public final b(LXB1;I)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, LXB1;->d0(I)LWB1;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, LF91;->a(LWB1;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c([LyB0;LJ91;)V
    .locals 1

    new-instance v0, LS83;

    invoke-direct {v0, p1, p2}, LS83;-><init>([LyB0;Ljava/lang/Object;)V

    iget-object p1, p0, LF91;->b:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d(LXB1;II)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, LXB1;->d0(I)LWB1;

    move-result-object v1

    invoke-virtual {v1}, LWB1;->F()I

    move-result v2

    if-ne v2, p3, :cond_0

    invoke-virtual {p0, v1, p2}, LF91;->a(LWB1;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Overlay input is mixed-dimension"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public final e(LBr2;I)V
    .locals 1

    invoke-virtual {p1}, LBr2;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {p0, v0}, LF91;->q(Lsf1;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1}, LF91;->r(LBr2;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, LF91;->s(LBr2;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LyB0;

    invoke-virtual {p0, v0, p2}, LF91;->f([LyB0;I)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LF91;->u(LBr2;)[LyB0;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LF91;->f([LyB0;I)V

    :cond_3
    return-void
.end method

.method public final f([LyB0;I)V
    .locals 2

    array-length v0, p1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, LJ91;

    invoke-direct {v0, p2}, LJ91;-><init>(I)V

    invoke-virtual {p0, p1, v0}, LF91;->c([LyB0;LJ91;)V

    return-void
.end method

.method public final g(LCX3;I)V
    .locals 3

    invoke-virtual {p1}, LCX3;->L0()LKr2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p2}, LF91;->h(LKr2;ZI)V

    :goto_0
    invoke-virtual {p1}, LCX3;->O0()I

    move-result v0

    if-ge v1, v0, :cond_0

    invoke-virtual {p1, v1}, LCX3;->M0(I)LKr2;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, p2}, LF91;->h(LKr2;ZI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final h(LKr2;ZI)V
    .locals 3

    invoke-virtual {p1}, LBr2;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {p0, v0}, LF91;->q(Lsf1;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1}, LF91;->j(LKr2;)[LyB0;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_2

    return-void

    :cond_2
    invoke-static {p1, p2}, LF91;->k(LKr2;Z)I

    move-result p1

    new-instance v1, LJ91;

    invoke-direct {v1, p3, p1, p2}, LJ91;-><init>(IIZ)V

    invoke-virtual {p0, v0, v1}, LF91;->c([LyB0;LJ91;)V

    return-void
.end method

.method public i(LWB1;LWB1;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWB1;",
            "LWB1;",
            ")",
            "Ljava/util/List<",
            "Lr91;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LF91;->a(LWB1;I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p2, p1}, LF91;->a(LWB1;I)V

    iget-object p1, p0, LF91;->b:Ljava/util/List;

    invoke-virtual {p0, p1}, LF91;->t(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LE91;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final j(LKr2;)[LyB0;
    .locals 3

    invoke-virtual {p1}, LBr2;->Y()[LyB0;

    move-result-object v0

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v1

    iget-object v2, p0, LF91;->e:Lnb5;

    if-eqz v2, :cond_1

    iget-object v2, p0, LF91;->d:Lsf1;

    invoke-virtual {v2, v1}, Lsf1;->f(Lsf1;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LF91;->e:Lnb5;

    invoke-virtual {p1, v0}, Lnb5;->a([LyB0;)[LyB0;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    invoke-static {p1}, LF91;->u(LBr2;)[LyB0;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/util/Collection;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcr5;",
            ">;)",
            "Ljava/util/List<",
            "Lr91;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcr5;

    invoke-interface {v1}, Lcr5;->h()[LyB0;

    move-result-object v2

    invoke-static {v2}, Lr91;->j([LyB0;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Lcr5;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ91;

    iget-object v3, p0, LF91;->g:[Z

    invoke-virtual {v2}, LJ91;->c()I

    move-result v4

    const/4 v5, 0x1

    aput-boolean v5, v3, v4

    new-instance v3, Lr91;

    invoke-interface {v1}, Lcr5;->h()[LyB0;

    move-result-object v1

    invoke-direct {v3, v1, v2}, Lr91;-><init>([LyB0;LJ91;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final o()LT83;
    .locals 1

    iget-object v0, p0, LF91;->c:LT83;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LF91;->a:LeZ3;

    invoke-static {v0}, LyA3;->h(LeZ3;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LF91;->n(Z)LT83;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, LF91;->a:LeZ3;

    invoke-static {v0}, LF91;->m(LeZ3;)LT83;

    move-result-object v0

    return-object v0
.end method

.method public p(I)Z
    .locals 1

    iget-object v0, p0, LF91;->g:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public final q(Lsf1;)Z
    .locals 1

    iget-object v0, p0, LF91;->d:Lsf1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Lsf1;->g(Lsf1;)Z

    move-result p1

    return p1
.end method

.method public final r(LBr2;)Z
    .locals 3

    invoke-virtual {p1}, LBr2;->Y()[LyB0;

    move-result-object v0

    iget-object v1, p0, LF91;->f:Lvr2;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    array-length v0, v0

    const/16 v1, 0x14

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object p1

    iget-object v0, p0, LF91;->d:Lsf1;

    invoke-virtual {v0, p1}, Lsf1;->f(Lsf1;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method public final s(LBr2;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBr2;",
            ")",
            "Ljava/util/List<",
            "[",
            "LyB0;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, LBr2;->Y()[LyB0;

    move-result-object p1

    iget-object v0, p0, LF91;->f:Lvr2;

    invoke-virtual {v0, p1}, Lvr2;->f([LyB0;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final t(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LS83;",
            ">;)",
            "Ljava/util/List<",
            "Lr91;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LF91;->o()LT83;

    move-result-object v0

    invoke-interface {v0, p1}, LT83;->a(Ljava/util/Collection;)V

    invoke-interface {v0}, LT83;->b()Ljava/util/Collection;

    move-result-object p1

    invoke-virtual {p0, p1}, LF91;->l(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public v(Lsf1;)V
    .locals 1

    iput-object p1, p0, LF91;->d:Lsf1;

    new-instance v0, Lnb5;

    invoke-direct {v0, p1}, Lnb5;-><init>(Lsf1;)V

    iput-object v0, p0, LF91;->e:Lnb5;

    new-instance v0, Lvr2;

    invoke-direct {v0, p1}, Lvr2;-><init>(Lsf1;)V

    iput-object v0, p0, LF91;->f:Lvr2;

    return-void
.end method
