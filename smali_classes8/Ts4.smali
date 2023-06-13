.class public LTs4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lsf1;


# direct methods
.method public constructor <init>(LCX3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object p1

    iput-object p1, p0, LTs4;->a:Lsf1;

    return-void
.end method

.method public static b(LCX3;LWB1;)Z
    .locals 1

    new-instance v0, LTs4;

    invoke-direct {v0, p0}, LTs4;-><init>(LCX3;)V

    invoke-virtual {v0, p1}, LTs4;->a(LWB1;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a(LWB1;)Z
    .locals 2

    iget-object v0, p0, LTs4;->a:Lsf1;

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsf1;->b(Lsf1;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, LTs4;->c(LWB1;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final c(LWB1;)Z
    .locals 3

    instance-of v0, p1, LCX3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, LFW3;

    if-eqz v0, :cond_1

    check-cast p1, LFW3;

    invoke-virtual {p0, p1}, LTs4;->g(LFW3;)Z

    move-result p1

    return p1

    :cond_1
    instance-of v0, p1, LBr2;

    if-eqz v0, :cond_2

    check-cast p1, LBr2;

    invoke-virtual {p0, p1}, LTs4;->e(LBr2;)Z

    move-result p1

    return p1

    :cond_2
    move v0, v1

    :goto_0
    invoke-virtual {p1}, LWB1;->f0()I

    move-result v2

    if-ge v0, v2, :cond_4

    invoke-virtual {p1, v0}, LWB1;->d0(I)LWB1;

    move-result-object v2

    invoke-virtual {p0, v2}, LTs4;->c(LWB1;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method public final d(LyB0;LyB0;)Z
    .locals 6

    invoke-virtual {p1, p2}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LTs4;->f(LyB0;)Z

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p1, LyB0;->b:D

    iget-wide v2, p2, LyB0;->b:D

    cmpl-double v2, v0, v2

    const/4 v3, 0x1

    if-nez v2, :cond_2

    iget-object p2, p0, LTs4;->a:Lsf1;

    invoke-virtual {p2}, Lsf1;->p()D

    move-result-wide v4

    cmpl-double p2, v0, v4

    if-eqz p2, :cond_1

    iget-wide p1, p1, LyB0;->b:D

    iget-object v0, p0, LTs4;->a:Lsf1;

    invoke-virtual {v0}, Lsf1;->n()D

    move-result-wide v0

    cmpl-double p1, p1, v0

    if-nez p1, :cond_4

    :cond_1
    return v3

    :cond_2
    iget-wide v0, p1, LyB0;->c:D

    iget-wide v4, p2, LyB0;->c:D

    cmpl-double p2, v0, v4

    if-nez p2, :cond_4

    iget-object p2, p0, LTs4;->a:Lsf1;

    invoke-virtual {p2}, Lsf1;->q()D

    move-result-wide v4

    cmpl-double p2, v0, v4

    if-eqz p2, :cond_3

    iget-wide p1, p1, LyB0;->c:D

    iget-object v0, p0, LTs4;->a:Lsf1;

    invoke-virtual {v0}, Lsf1;->o()D

    move-result-wide v0

    cmpl-double p1, p1, v0

    if-nez p1, :cond_4

    :cond_3
    return v3

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final e(LBr2;)Z
    .locals 6

    invoke-virtual {p1}, LBr2;->M0()LEB0;

    move-result-object p1

    new-instance v0, LyB0;

    invoke-direct {v0}, LyB0;-><init>()V

    new-instance v1, LyB0;

    invoke-direct {v1}, LyB0;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    invoke-interface {p1}, LEB0;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    if-ge v3, v4, :cond_1

    invoke-interface {p1, v3, v0}, LEB0;->T(ILyB0;)V

    add-int/lit8 v3, v3, 0x1

    invoke-interface {p1, v3, v1}, LEB0;->T(ILyB0;)V

    invoke-virtual {p0, v0, v1}, LTs4;->d(LyB0;LyB0;)Z

    move-result v4

    if-nez v4, :cond_0

    return v2

    :cond_1
    return v5
.end method

.method public final f(LyB0;)Z
    .locals 4

    iget-wide v0, p1, LyB0;->b:D

    iget-object v2, p0, LTs4;->a:Lsf1;

    invoke-virtual {v2}, Lsf1;->p()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    iget-wide v0, p1, LyB0;->b:D

    iget-object v2, p0, LTs4;->a:Lsf1;

    invoke-virtual {v2}, Lsf1;->n()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    iget-wide v0, p1, LyB0;->c:D

    iget-object v2, p0, LTs4;->a:Lsf1;

    invoke-virtual {v2}, Lsf1;->q()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    iget-wide v0, p1, LyB0;->c:D

    iget-object p1, p0, LTs4;->a:Lsf1;

    invoke-virtual {p1}, Lsf1;->o()D

    move-result-wide v2

    cmpl-double p1, v0, v2

    if-nez p1, :cond_0

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

.method public final g(LFW3;)Z
    .locals 0

    invoke-virtual {p1}, LFW3;->W()LyB0;

    move-result-object p1

    invoke-virtual {p0, p1}, LTs4;->f(LyB0;)Z

    move-result p1

    return p1
.end method
