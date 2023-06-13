.class public LX70;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(DDDDDD)I
    .locals 2

    invoke-static/range {p0 .. p11}, LX70;->c(DDDDDD)I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return v0

    :cond_0
    invoke-static {p4, p5}, LJF0;->l0(D)LJF0;

    move-result-object v0

    neg-double p0, p0

    invoke-virtual {v0, p0, p1}, LJF0;->P(D)LJF0;

    move-result-object p0

    invoke-static {p6, p7}, LJF0;->l0(D)LJF0;

    move-result-object p1

    neg-double p2, p2

    invoke-virtual {p1, p2, p3}, LJF0;->P(D)LJF0;

    move-result-object p1

    invoke-static {p8, p9}, LJF0;->l0(D)LJF0;

    move-result-object p2

    neg-double p3, p4

    invoke-virtual {p2, p3, p4}, LJF0;->P(D)LJF0;

    move-result-object p2

    invoke-static {p10, p11}, LJF0;->l0(D)LJF0;

    move-result-object p3

    neg-double p4, p6

    invoke-virtual {p3, p4, p5}, LJF0;->P(D)LJF0;

    move-result-object p3

    invoke-virtual {p0, p3}, LJF0;->Z(LJF0;)LJF0;

    move-result-object p0

    invoke-virtual {p1, p2}, LJF0;->Z(LJF0;)LJF0;

    move-result-object p1

    invoke-virtual {p0, p1}, LJF0;->c0(LJF0;)LJF0;

    move-result-object p0

    invoke-virtual {p0}, LJF0;->d0()I

    move-result p0

    return p0
.end method

.method public static b(LyB0;LyB0;LyB0;)I
    .locals 12

    iget-wide v0, p0, LyB0;->b:D

    iget-wide v2, p0, LyB0;->c:D

    iget-wide v4, p1, LyB0;->b:D

    iget-wide v6, p1, LyB0;->c:D

    iget-wide v8, p2, LyB0;->b:D

    iget-wide v10, p2, LyB0;->c:D

    invoke-static/range {v0 .. v11}, LX70;->a(DDDDDD)I

    move-result p0

    return p0
.end method

.method public static c(DDDDDD)I
    .locals 0

    sub-double/2addr p0, p8

    sub-double/2addr p6, p10

    mul-double/2addr p0, p6

    sub-double/2addr p2, p10

    sub-double/2addr p4, p8

    mul-double/2addr p2, p4

    sub-double p4, p0, p2

    const-wide/16 p6, 0x0

    cmpl-double p8, p0, p6

    if-lez p8, :cond_1

    cmpg-double p6, p2, p6

    if-gtz p6, :cond_0

    invoke-static {p4, p5}, LX70;->d(D)I

    move-result p0

    return p0

    :cond_0
    add-double/2addr p0, p2

    goto :goto_0

    :cond_1
    cmpg-double p8, p0, p6

    if-gez p8, :cond_5

    cmpl-double p6, p2, p6

    if-ltz p6, :cond_2

    invoke-static {p4, p5}, LX70;->d(D)I

    move-result p0

    return p0

    :cond_2
    neg-double p0, p0

    sub-double/2addr p0, p2

    :goto_0
    const-wide p2, 0x3cd203af9ee75616L    # 1.0E-15

    mul-double/2addr p0, p2

    cmpl-double p2, p4, p0

    if-gez p2, :cond_4

    neg-double p2, p4

    cmpl-double p0, p2, p0

    if-ltz p0, :cond_3

    goto :goto_1

    :cond_3
    const/4 p0, 0x2

    return p0

    :cond_4
    :goto_1
    invoke-static {p4, p5}, LX70;->d(D)I

    move-result p0

    return p0

    :cond_5
    invoke-static {p4, p5}, LX70;->d(D)I

    move-result p0

    return p0
.end method

.method public static d(D)I
    .locals 3

    const-wide/16 v0, 0x0

    cmpl-double v2, p0, v0

    if-lez v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    cmpg-double p0, p0, v0

    if-gez p0, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
