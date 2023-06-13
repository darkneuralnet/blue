.class public LbC1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x5ea75f2051eeb313L


# instance fields
.field public b:LeZ3;

.field public c:LFB0;

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, LeZ3;

    invoke-direct {v0}, LeZ3;-><init>()V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LbC1;-><init>(LeZ3;I)V

    return-void
.end method

.method public constructor <init>(LeZ3;I)V
    .locals 1

    invoke-static {}, LbC1;->A()LFB0;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, LbC1;-><init>(LeZ3;ILFB0;)V

    return-void
.end method

.method public constructor <init>(LeZ3;ILFB0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbC1;->b:LeZ3;

    iput-object p3, p0, LbC1;->c:LFB0;

    iput p2, p0, LbC1;->d:I

    return-void
.end method

.method public static A()LFB0;
    .locals 1

    invoke-static {}, LAB0;->d()LAB0;

    move-result-object v0

    return-object v0
.end method

.method public static D(Ljava/util/Collection;)[LWB1;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [LWB1;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LWB1;

    return-object p0
.end method

.method public static E(Ljava/util/Collection;)[LBr2;
    .locals 1

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [LBr2;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LBr2;

    return-object p0
.end method

.method public static F(Ljava/util/Collection;)[LFW3;
    .locals 1

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [LFW3;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LFW3;

    return-object p0
.end method

.method public static H(Ljava/util/Collection;)[LCX3;
    .locals 1

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [LCX3;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LCX3;

    return-object p0
.end method


# virtual methods
.method public B()LeZ3;
    .locals 1

    iget-object v0, p0, LbC1;->b:LeZ3;

    return-object v0
.end method

.method public C()I
    .locals 1

    iget v0, p0, LbC1;->d:I

    return v0
.end method

.method public a(Ljava/util/Collection;)LWB1;
    .locals 8

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LWB1;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    if-nez v1, :cond_1

    move-object v1, v7

    :cond_1
    if-eq v7, v1, :cond_2

    move v3, v6

    :cond_2
    instance-of v5, v5, LXB1;

    if-eqz v5, :cond_0

    move v4, v6

    goto :goto_0

    :cond_3
    if-nez v1, :cond_4

    invoke-virtual {p0}, LbC1;->c()LXB1;

    move-result-object p1

    return-object p1

    :cond_4
    if-nez v3, :cond_b

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWB1;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    if-le v1, v6, :cond_6

    move v2, v6

    :cond_6
    if-eqz v2, :cond_a

    instance-of v1, v0, LCX3;

    if-eqz v1, :cond_7

    invoke-static {p1}, LbC1;->H(Ljava/util/Collection;)[LCX3;

    move-result-object p1

    invoke-virtual {p0, p1}, LbC1;->r([LCX3;)LWW2;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of v1, v0, LBr2;

    if-eqz v1, :cond_8

    invoke-static {p1}, LbC1;->E(Ljava/util/Collection;)[LBr2;

    move-result-object p1

    invoke-virtual {p0, p1}, LbC1;->l([LBr2;)LDW2;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of v1, v0, LFW3;

    if-eqz v1, :cond_9

    invoke-static {p1}, LbC1;->F(Ljava/util/Collection;)[LFW3;

    move-result-object p1

    invoke-virtual {p0, p1}, LbC1;->o([LFW3;)LVW2;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unhandled class: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LKo;->f(Ljava/lang/String;)V

    :cond_a
    return-object v0

    :cond_b
    :goto_1
    invoke-static {p1}, LbC1;->D(Ljava/util/Collection;)[LWB1;

    move-result-object p1

    invoke-virtual {p0, p1}, LbC1;->d([LWB1;)LXB1;

    move-result-object p1

    return-object p1
.end method

.method public b(I)LWB1;
    .locals 3

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LbC1;->v()LCX3;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid dimension: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, LbC1;->e()LBr2;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, LbC1;->s()LFW3;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p0}, LbC1;->c()LXB1;

    move-result-object p1

    return-object p1
.end method

.method public c()LXB1;
    .locals 2

    new-instance v0, LXB1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LXB1;-><init>([LWB1;LbC1;)V

    return-object v0
.end method

.method public d([LWB1;)LXB1;
    .locals 1

    new-instance v0, LXB1;

    invoke-direct {v0, p1, p0}, LXB1;-><init>([LWB1;LbC1;)V

    return-object v0
.end method

.method public e()LBr2;
    .locals 2

    invoke-virtual {p0}, LbC1;->z()LFB0;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [LyB0;

    invoke-interface {v0, v1}, LFB0;->c([LyB0;)LEB0;

    move-result-object v0

    invoke-virtual {p0, v0}, LbC1;->f(LEB0;)LBr2;

    move-result-object v0

    return-object v0
.end method

.method public f(LEB0;)LBr2;
    .locals 1

    new-instance v0, LBr2;

    invoke-direct {v0, p1, p0}, LBr2;-><init>(LEB0;LbC1;)V

    return-object v0
.end method

.method public g([LyB0;)LBr2;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LbC1;->z()LFB0;

    move-result-object v0

    invoke-interface {v0, p1}, LFB0;->c([LyB0;)LEB0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, LbC1;->f(LEB0;)LBr2;

    move-result-object p1

    return-object p1
.end method

.method public h()LKr2;
    .locals 2

    invoke-virtual {p0}, LbC1;->z()LFB0;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [LyB0;

    invoke-interface {v0, v1}, LFB0;->c([LyB0;)LEB0;

    move-result-object v0

    invoke-virtual {p0, v0}, LbC1;->i(LEB0;)LKr2;

    move-result-object v0

    return-object v0
.end method

.method public i(LEB0;)LKr2;
    .locals 1

    new-instance v0, LKr2;

    invoke-direct {v0, p1, p0}, LKr2;-><init>(LEB0;LbC1;)V

    return-object v0
.end method

.method public j([LyB0;)LKr2;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LbC1;->z()LFB0;

    move-result-object v0

    invoke-interface {v0, p1}, LFB0;->c([LyB0;)LEB0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, LbC1;->i(LEB0;)LKr2;

    move-result-object p1

    return-object p1
.end method

.method public k()LDW2;
    .locals 2

    new-instance v0, LDW2;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LDW2;-><init>([LBr2;LbC1;)V

    return-object v0
.end method

.method public l([LBr2;)LDW2;
    .locals 1

    new-instance v0, LDW2;

    invoke-direct {v0, p1, p0}, LDW2;-><init>([LBr2;LbC1;)V

    return-object v0
.end method

.method public m()LVW2;
    .locals 2

    new-instance v0, LVW2;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LVW2;-><init>([LFW3;LbC1;)V

    return-object v0
.end method

.method public n(LEB0;)LVW2;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-array p1, v0, [LFW3;

    invoke-virtual {p0, p1}, LbC1;->o([LFW3;)LVW2;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, LEB0;->size()I

    move-result v1

    new-array v1, v1, [LFW3;

    move v2, v0

    :goto_0
    invoke-interface {p1}, LEB0;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-virtual {p0}, LbC1;->z()LFB0;

    move-result-object v3

    invoke-interface {p1}, LEB0;->F()I

    move-result v4

    invoke-interface {p1}, LEB0;->e3()I

    move-result v5

    const/4 v6, 0x1

    invoke-interface {v3, v6, v4, v5}, LFB0;->a(III)LEB0;

    move-result-object v3

    invoke-static {p1, v2, v3, v0, v6}, LHB0;->a(LEB0;ILEB0;II)V

    invoke-virtual {p0, v3}, LbC1;->u(LEB0;)LFW3;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, LbC1;->o([LFW3;)LVW2;

    move-result-object p1

    return-object p1
.end method

.method public o([LFW3;)LVW2;
    .locals 1

    new-instance v0, LVW2;

    invoke-direct {v0, p1, p0}, LVW2;-><init>([LFW3;LbC1;)V

    return-object v0
.end method

.method public p([LyB0;)LVW2;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LbC1;->z()LFB0;

    move-result-object v0

    invoke-interface {v0, p1}, LFB0;->c([LyB0;)LEB0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, LbC1;->n(LEB0;)LVW2;

    move-result-object p1

    return-object p1
.end method

.method public q()LWW2;
    .locals 2

    new-instance v0, LWW2;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LWW2;-><init>([LCX3;LbC1;)V

    return-object v0
.end method

.method public r([LCX3;)LWW2;
    .locals 1

    new-instance v0, LWW2;

    invoke-direct {v0, p1, p0}, LWW2;-><init>([LCX3;LbC1;)V

    return-object v0
.end method

.method public s()LFW3;
    .locals 2

    invoke-virtual {p0}, LbC1;->z()LFB0;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [LyB0;

    invoke-interface {v0, v1}, LFB0;->c([LyB0;)LEB0;

    move-result-object v0

    invoke-virtual {p0, v0}, LbC1;->u(LEB0;)LFW3;

    move-result-object v0

    return-object v0
.end method

.method public t(LyB0;)LFW3;
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LbC1;->z()LFB0;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LyB0;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-interface {v0, v1}, LFB0;->c([LyB0;)LEB0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, LbC1;->u(LEB0;)LFW3;

    move-result-object p1

    return-object p1
.end method

.method public u(LEB0;)LFW3;
    .locals 1

    new-instance v0, LFW3;

    invoke-direct {v0, p1, p0}, LFW3;-><init>(LEB0;LbC1;)V

    return-object v0
.end method

.method public v()LCX3;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, LbC1;->y(LKr2;[LKr2;)LCX3;

    move-result-object v0

    return-object v0
.end method

.method public w(LEB0;)LCX3;
    .locals 0

    invoke-virtual {p0, p1}, LbC1;->i(LEB0;)LKr2;

    move-result-object p1

    invoke-virtual {p0, p1}, LbC1;->x(LKr2;)LCX3;

    move-result-object p1

    return-object p1
.end method

.method public x(LKr2;)LCX3;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LbC1;->y(LKr2;[LKr2;)LCX3;

    move-result-object p1

    return-object p1
.end method

.method public y(LKr2;[LKr2;)LCX3;
    .locals 1

    new-instance v0, LCX3;

    invoke-direct {v0, p1, p2, p0}, LCX3;-><init>(LKr2;[LKr2;LbC1;)V

    return-object v0
.end method

.method public z()LFB0;
    .locals 1

    iget-object v0, p0, LbC1;->c:LFB0;

    return-object v0
.end method
