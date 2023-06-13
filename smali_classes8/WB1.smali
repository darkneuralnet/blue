.class public abstract LWB1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final f:LZB1;

.field private static final serialVersionUID:J = 0x799ea46522854a3eL


# instance fields
.field public b:Lsf1;

.field public final c:LbC1;

.field public d:I

.field public e:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LWB1$a;

    invoke-direct {v0}, LWB1$a;-><init>()V

    sput-object v0, LWB1;->f:LZB1;

    return-void
.end method

.method public constructor <init>(LbC1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LWB1;->e:Ljava/lang/Object;

    iput-object p1, p0, LWB1;->c:LbC1;

    invoke-virtual {p1}, LbC1;->C()I

    move-result p1

    iput p1, p0, LWB1;->d:I

    return-void
.end method

.method public static g(LWB1;)V
    .locals 1

    invoke-virtual {p0}, LWB1;->u0()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Operation does not support GeometryCollection arguments"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static l0([LWB1;)Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    aget-object v2, p0, v1

    invoke-virtual {v2}, LWB1;->r0()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static o0([Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    aget-object v2, p0, v1

    if-nez v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method


# virtual methods
.method public A0(LWB1;)Z
    .locals 2

    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsf1;->K(Lsf1;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LWB1;->C0(LWB1;)LP62;

    move-result-object v0

    invoke-virtual {p0}, LWB1;->F()I

    move-result v1

    invoke-virtual {p1}, LWB1;->F()I

    move-result p1

    invoke-virtual {v0, v1, p1}, LP62;->j(II)Z

    move-result p1

    return p1
.end method

.method public C0(LWB1;)LP62;
    .locals 0

    invoke-static {p0}, LWB1;->g(LWB1;)V

    invoke-static {p1}, LWB1;->g(LWB1;)V

    invoke-static {p0, p1}, LWt4;->c(LWB1;LWB1;)LP62;

    move-result-object p1

    return-object p1
.end method

.method public abstract F()I
.end method

.method public F0(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LWB1;->e:Ljava/lang/Object;

    return-void
.end method

.method public G0()Ljava/lang/String;
    .locals 1

    new-instance v0, Lkw6;

    invoke-direct {v0}, Lkw6;-><init>()V

    invoke-virtual {v0, p0}, Lkw6;->D(LWB1;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public H()V
    .locals 1

    sget-object v0, LWB1;->f:LZB1;

    invoke-virtual {p0, v0}, LWB1;->f(LZB1;)V

    return-void
.end method

.method public H0(LWB1;)Z
    .locals 2

    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsf1;->K(Lsf1;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LWB1;->C0(LWB1;)LP62;

    move-result-object v0

    invoke-virtual {p0}, LWB1;->F()I

    move-result v1

    invoke-virtual {p1}, LWB1;->F()I

    move-result p1

    invoke-virtual {v0, v1, p1}, LP62;->k(II)Z

    move-result p1

    return p1
.end method

.method public I0(LWB1;)LWB1;
    .locals 0

    invoke-static {p0, p1}, LeC1;->c(LWB1;LWB1;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public J()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LWB1;->b:Lsf1;

    return-void
.end method

.method public J0(LWB1;)Z
    .locals 0

    invoke-virtual {p1, p0}, LWB1;->l(LWB1;)Z

    move-result p1

    return p1
.end method

.method public M()D
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public abstract N()LWB1;
.end method

.method public abstract P()I
.end method

.method public U()LFW3;
    .locals 1

    invoke-virtual {p0}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LWB1;->c:LbC1;

    invoke-virtual {v0}, LbC1;->s()LFW3;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {p0}, LTg0;->k(LWB1;)LyB0;

    move-result-object v0

    invoke-virtual {p0, v0, p0}, LWB1;->p(LyB0;LWB1;)LFW3;

    move-result-object v0

    return-object v0
.end method

.method public abstract W()LyB0;
.end method

.method public abstract Y()[LyB0;
.end method

.method public Z()Lsf1;
    .locals 2

    iget-object v0, p0, LWB1;->b:Lsf1;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LWB1;->k()Lsf1;

    move-result-object v0

    iput-object v0, p0, LWB1;->b:Lsf1;

    :cond_0
    new-instance v0, Lsf1;

    iget-object v1, p0, LWB1;->b:Lsf1;

    invoke-direct {v0, v1}, Lsf1;-><init>(Lsf1;)V

    return-object v0
.end method

.method public c0()LbC1;
    .locals 1

    iget-object v0, p0, LWB1;->c:LbC1;

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 3

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWB1;

    iget-object v1, v0, LWB1;->b:Lsf1;

    if-eqz v1, :cond_0

    new-instance v2, Lsf1;

    invoke-direct {v2, v1}, Lsf1;-><init>(Lsf1;)V

    iput-object v2, v0, LWB1;->b:Lsf1;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    invoke-static {}, LKo;->e()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 3

    move-object v0, p1

    check-cast v0, LWB1;

    invoke-virtual {p0}, LWB1;->k0()I

    move-result v1

    invoke-virtual {v0}, LWB1;->k0()I

    move-result v2

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, LWB1;->k0()I

    move-result p1

    invoke-virtual {v0}, LWB1;->k0()I

    move-result v0

    sub-int/2addr p1, v0

    return p1

    :cond_0
    invoke-virtual {p0}, LWB1;->r0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LWB1;->r0()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p0}, LWB1;->r0()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    invoke-virtual {v0}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    invoke-virtual {p0, p1}, LWB1;->j(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public abstract d(LCB0;)V
.end method

.method public d0(I)LWB1;
    .locals 0

    return-object p0
.end method

.method public abstract e(LGB0;)V
.end method

.method public e0()D
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LWB1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LWB1;

    invoke-virtual {p0, p1}, LWB1;->t(LWB1;)Z

    move-result p1

    return p1
.end method

.method public abstract f(LZB1;)V
.end method

.method public f0()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public abstract g0()I
.end method

.method public h(Ljava/util/Collection;Ljava/util/Collection;)I
    .locals 2

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    invoke-interface {v0, v1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public h0()LeZ3;
    .locals 1

    iget-object v0, p0, LWB1;->c:LbC1;

    invoke-virtual {v0}, LbC1;->B()LeZ3;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {v0}, Lsf1;->hashCode()I

    move-result v0

    return v0
.end method

.method public abstract j(Ljava/lang/Object;)I
.end method

.method public abstract k()Lsf1;
.end method

.method public abstract k0()I
.end method

.method public l(LWB1;)Z
    .locals 6

    invoke-virtual {p1}, LWB1;->F()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, LWB1;->F()I

    move-result v0

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, LWB1;->F()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, LWB1;->F()I

    move-result v0

    if-ge v0, v2, :cond_1

    invoke-virtual {p1}, LWB1;->e0()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v0, v2, v4

    if-lez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v2

    invoke-virtual {v0, v2}, Lsf1;->b(Lsf1;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, LWB1;->x0()Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, LCX3;

    invoke-static {v0, p1}, LTs4;->b(LCX3;LWB1;)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p0, p1}, LWB1;->C0(LWB1;)LP62;

    move-result-object p1

    invoke-virtual {p1}, LP62;->d()Z

    move-result p1

    return p1
.end method

.method public m()LWB1;
    .locals 2

    invoke-virtual {p0}, LWB1;->n()LWB1;

    move-result-object v0

    iget-object v1, p0, LWB1;->b:Lsf1;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lsf1;->c()Lsf1;

    move-result-object v1

    :goto_0
    iput-object v1, v0, LWB1;->b:Lsf1;

    iget v1, p0, LWB1;->d:I

    iput v1, v0, LWB1;->d:I

    iget-object v1, p0, LWB1;->e:Ljava/lang/Object;

    iput-object v1, v0, LWB1;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public abstract n()LWB1;
.end method

.method public o(LWB1;)Z
    .locals 7

    invoke-virtual {p1}, LWB1;->F()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, LWB1;->F()I

    move-result v0

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, LWB1;->F()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, LWB1;->F()I

    move-result v0

    if-ge v0, v2, :cond_1

    invoke-virtual {p1}, LWB1;->e0()D

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmpl-double v0, v3, v5

    if-lez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v3

    invoke-virtual {v0, v3}, Lsf1;->f(Lsf1;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, LWB1;->x0()Z

    move-result v0

    if-eqz v0, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0, p1}, LWB1;->C0(LWB1;)LP62;

    move-result-object p1

    invoke-virtual {p1}, LP62;->e()Z

    move-result p1

    return p1
.end method

.method public final p(LyB0;LWB1;)LFW3;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p2}, LWB1;->c0()LbC1;

    move-result-object p1

    invoke-virtual {p1}, LbC1;->s()LFW3;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p2}, LWB1;->h0()LeZ3;

    move-result-object v0

    invoke-virtual {v0, p1}, LeZ3;->f(LyB0;)V

    invoke-virtual {p2}, LWB1;->c0()LbC1;

    move-result-object p2

    invoke-virtual {p2, p1}, LbC1;->t(LyB0;)LFW3;

    move-result-object p1

    return-object p1
.end method

.method public q(LWB1;)Z
    .locals 2

    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsf1;->K(Lsf1;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LWB1;->C0(LWB1;)LP62;

    move-result-object v0

    invoke-virtual {p0}, LWB1;->F()I

    move-result v1

    invoke-virtual {p1}, LWB1;->F()I

    move-result p1

    invoke-virtual {v0, v1, p1}, LP62;->f(II)Z

    move-result p1

    return p1
.end method

.method public q0(LWB1;)Z
    .locals 5

    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsf1;->K(Lsf1;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, LWB1;->x0()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, LCX3;

    invoke-static {v0, p1}, LVs4;->b(LCX3;LWB1;)Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p1}, LWB1;->x0()Z

    move-result v0

    if-eqz v0, :cond_2

    check-cast p1, LCX3;

    invoke-static {p1, p0}, LVs4;->b(LCX3;LWB1;)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0}, LWB1;->u0()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, LWB1;->u0()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, LWB1;->C0(LWB1;)LP62;

    move-result-object p1

    invoke-virtual {p1}, LP62;->h()Z

    move-result p1

    return p1

    :cond_4
    :goto_0
    move v0, v1

    :goto_1
    invoke-virtual {p0}, LWB1;->f0()I

    move-result v2

    if-ge v0, v2, :cond_7

    move v2, v1

    :goto_2
    invoke-virtual {p1}, LWB1;->f0()I

    move-result v3

    if-ge v2, v3, :cond_6

    invoke-virtual {p0, v0}, LWB1;->d0(I)LWB1;

    move-result-object v3

    invoke-virtual {p1, v2}, LWB1;->d0(I)LWB1;

    move-result-object v4

    invoke-virtual {v3, v4}, LWB1;->q0(LWB1;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 p1, 0x1

    return p1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    return v1
.end method

.method public r(LyB0;LyB0;D)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmpl-double v0, p3, v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1, p2}, LyB0;->f(LyB0;)D

    move-result-wide p1

    cmpg-double p1, p1, p3

    if-gtz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract r0()Z
.end method

.method public s0(LWB1;)Z
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public t(LWB1;)Z
    .locals 2

    if-eq p0, p1, :cond_1

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, LWB1;->w(LWB1;D)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LWB1;->G0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u0()Z
    .locals 2

    invoke-virtual {p0}, LWB1;->k0()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract w(LWB1;D)Z
.end method

.method public x0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
