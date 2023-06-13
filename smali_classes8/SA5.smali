.class public LSA5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNW3;


# direct methods
.method public static b(LyB0;LCX3;)Z
    .locals 1

    const/4 v0, 0x2

    invoke-static {p0, p1}, LSA5;->e(LyB0;LCX3;)I

    move-result p0

    if-eq v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static c(LyB0;LWB1;)I
    .locals 2

    invoke-virtual {p1}, LWB1;->r0()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lsf1;->E(LyB0;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-static {p0, p1}, LSA5;->d(LyB0;LWB1;)I

    move-result p0

    return p0
.end method

.method public static d(LyB0;LWB1;)I
    .locals 3

    instance-of v0, p1, LCX3;

    if-eqz v0, :cond_0

    check-cast p1, LCX3;

    invoke-static {p0, p1}, LSA5;->e(LyB0;LCX3;)I

    move-result p0

    return p0

    :cond_0
    instance-of v0, p1, LXB1;

    const/4 v1, 0x2

    if-eqz v0, :cond_2

    new-instance v0, LYB1;

    move-object v2, p1

    check-cast v2, LXB1;

    invoke-direct {v0, v2}, LYB1;-><init>(LWB1;)V

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LWB1;

    if-eq v2, p1, :cond_1

    invoke-static {p0, v2}, LSA5;->d(LyB0;LWB1;)I

    move-result v2

    if-eq v2, v1, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public static e(LyB0;LCX3;)I
    .locals 5

    invoke-virtual {p1}, LCX3;->r0()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, LCX3;->L0()LKr2;

    move-result-object v0

    invoke-static {p0, v0}, LSA5;->f(LyB0;LKr2;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    invoke-virtual {p1}, LCX3;->O0()I

    move-result v3

    if-ge v2, v3, :cond_4

    invoke-virtual {p1, v2}, LCX3;->M0(I)LKr2;

    move-result-object v3

    invoke-static {p0, v3}, LSA5;->f(LyB0;LKr2;)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    return v4

    :cond_2
    if-nez v3, :cond_3

    return v1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public static f(LyB0;LKr2;)I
    .locals 1

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lsf1;->E(LyB0;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x2

    return p0

    :cond_0
    invoke-virtual {p1}, LBr2;->Y()[LyB0;

    move-result-object p1

    invoke-static {p0, p1}, LLW3;->c(LyB0;[LyB0;)I

    move-result p0

    return p0
.end method
