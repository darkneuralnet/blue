.class public LMW3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lu00;

.field public b:Z

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lu00;->e:Lu00;

    iput-object v0, p0, LMW3;->a:Lu00;

    return-void
.end method


# virtual methods
.method public final a(LyB0;LWB1;)V
    .locals 2

    instance-of v0, p2, LFW3;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LFW3;

    invoke-virtual {p0, p1, v0}, LMW3;->f(LyB0;LFW3;)I

    move-result v0

    invoke-virtual {p0, v0}, LMW3;->g(I)V

    :cond_0
    instance-of v0, p2, LBr2;

    if-eqz v0, :cond_1

    check-cast p2, LBr2;

    invoke-virtual {p0, p1, p2}, LMW3;->e(LyB0;LBr2;)I

    move-result p1

    invoke-virtual {p0, p1}, LMW3;->g(I)V

    goto :goto_3

    :cond_1
    instance-of v0, p2, LCX3;

    if-eqz v0, :cond_2

    check-cast p2, LCX3;

    invoke-virtual {p0, p1, p2}, LMW3;->c(LyB0;LCX3;)I

    move-result p1

    invoke-virtual {p0, p1}, LMW3;->g(I)V

    goto :goto_3

    :cond_2
    instance-of v0, p2, LDW2;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p2, LDW2;

    :goto_0
    invoke-virtual {p2}, LXB1;->f0()I

    move-result v0

    if-ge v1, v0, :cond_6

    invoke-virtual {p2, v1}, LXB1;->d0(I)LWB1;

    move-result-object v0

    check-cast v0, LBr2;

    invoke-virtual {p0, p1, v0}, LMW3;->e(LyB0;LBr2;)I

    move-result v0

    invoke-virtual {p0, v0}, LMW3;->g(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    instance-of v0, p2, LWW2;

    if-eqz v0, :cond_4

    check-cast p2, LWW2;

    :goto_1
    invoke-virtual {p2}, LXB1;->f0()I

    move-result v0

    if-ge v1, v0, :cond_6

    invoke-virtual {p2, v1}, LXB1;->d0(I)LWB1;

    move-result-object v0

    check-cast v0, LCX3;

    invoke-virtual {p0, p1, v0}, LMW3;->c(LyB0;LCX3;)I

    move-result v0

    invoke-virtual {p0, v0}, LMW3;->g(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    instance-of v0, p2, LXB1;

    if-eqz v0, :cond_6

    new-instance v0, LYB1;

    move-object v1, p2

    check-cast v1, LXB1;

    invoke-direct {v0, v1}, LYB1;-><init>(LWB1;)V

    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LWB1;

    if-eq v1, p2, :cond_5

    invoke-virtual {p0, p1, v1}, LMW3;->a(LyB0;LWB1;)V

    goto :goto_2

    :cond_6
    :goto_3
    return-void
.end method

.method public b(LyB0;LWB1;)I
    .locals 2

    invoke-virtual {p2}, LWB1;->r0()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p2, LBr2;

    if-eqz v0, :cond_1

    check-cast p2, LBr2;

    invoke-virtual {p0, p1, p2}, LMW3;->e(LyB0;LBr2;)I

    move-result p1

    return p1

    :cond_1
    instance-of v0, p2, LCX3;

    if-eqz v0, :cond_2

    check-cast p2, LCX3;

    invoke-virtual {p0, p1, p2}, LMW3;->c(LyB0;LCX3;)I

    move-result p1

    return p1

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, LMW3;->b:Z

    iput v0, p0, LMW3;->c:I

    invoke-virtual {p0, p1, p2}, LMW3;->a(LyB0;LWB1;)V

    iget-object p1, p0, LMW3;->a:Lu00;

    iget p2, p0, LMW3;->c:I

    invoke-interface {p1, p2}, Lu00;->a(I)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    iget p1, p0, LMW3;->c:I

    if-gtz p1, :cond_5

    iget-boolean p1, p0, LMW3;->b:Z

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    return v1

    :cond_5
    :goto_0
    return v0
.end method

.method public final c(LyB0;LCX3;)I
    .locals 5

    invoke-virtual {p2}, LCX3;->r0()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p2}, LCX3;->L0()LKr2;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LMW3;->d(LyB0;LKr2;)I

    move-result v0

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    return v2

    :cond_2
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    invoke-virtual {p2}, LCX3;->O0()I

    move-result v4

    if-ge v3, v4, :cond_5

    invoke-virtual {p2, v3}, LCX3;->M0(I)LKr2;

    move-result-object v4

    invoke-virtual {p0, p1, v4}, LMW3;->d(LyB0;LKr2;)I

    move-result v4

    if-nez v4, :cond_3

    return v1

    :cond_3
    if-ne v4, v2, :cond_4

    return v2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return v0
.end method

.method public final d(LyB0;LKr2;)I
    .locals 1

    invoke-virtual {p2}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lsf1;->E(LyB0;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x2

    return p1

    :cond_0
    invoke-virtual {p2}, LBr2;->Y()[LyB0;

    move-result-object p2

    invoke-static {p1, p2}, LLW3;->c(LyB0;[LyB0;)I

    move-result p1

    return p1
.end method

.method public final e(LyB0;LBr2;)I
    .locals 4

    invoke-virtual {p2}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lsf1;->E(LyB0;)Z

    move-result v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p2}, LBr2;->M0()LEB0;

    move-result-object v0

    invoke-virtual {p2}, LBr2;->T0()Z

    move-result p2

    const/4 v2, 0x0

    if-nez p2, :cond_2

    invoke-interface {v0, v2}, LEB0;->u(I)LyB0;

    move-result-object p2

    invoke-virtual {p1, p2}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v3, 0x1

    if-nez p2, :cond_1

    invoke-interface {v0}, LEB0;->size()I

    move-result p2

    sub-int/2addr p2, v3

    invoke-interface {v0, p2}, LEB0;->u(I)LyB0;

    move-result-object p2

    invoke-virtual {p1, p2}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_1
    return v3

    :cond_2
    invoke-static {p1, v0}, LLW3;->b(LyB0;LEB0;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v1
.end method

.method public final f(LyB0;LFW3;)I
    .locals 0

    invoke-virtual {p2}, LFW3;->W()LyB0;

    move-result-object p2

    invoke-virtual {p2, p1}, LyB0;->g(LyB0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x2

    return p1
.end method

.method public final g(I)V
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    iput-boolean v0, p0, LMW3;->b:Z

    :cond_0
    if-ne p1, v0, :cond_1

    iget p1, p0, LMW3;->c:I

    add-int/2addr p1, v0

    iput p1, p0, LMW3;->c:I

    :cond_1
    return-void
.end method
