.class public LBb5;
.super Lsr2;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lsr2;-><init>()V

    return-void
.end method

.method public static A(LyB0;LyB0;LyB0;)D
    .locals 10

    invoke-virtual {p1}, LyB0;->m()D

    move-result-wide v0

    invoke-virtual {p2}, LyB0;->m()D

    move-result-wide v2

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v4

    if-eqz v4, :cond_0

    return-wide v2

    :cond_0
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v4

    if-eqz v4, :cond_1

    return-wide v0

    :cond_1
    invoke-virtual {p0, p1}, LyB0;->g(LyB0;)Z

    move-result v4

    if-eqz v4, :cond_2

    return-wide v0

    :cond_2
    invoke-virtual {p0, p2}, LyB0;->g(LyB0;)Z

    move-result v4

    if-eqz v4, :cond_3

    return-wide v2

    :cond_3
    sub-double/2addr v2, v0

    const-wide/16 v4, 0x0

    cmpl-double v4, v2, v4

    if-nez v4, :cond_4

    return-wide v0

    :cond_4
    iget-wide v4, p2, LyB0;->b:D

    iget-wide v6, p1, LyB0;->b:D

    sub-double/2addr v4, v6

    iget-wide v8, p2, LyB0;->c:D

    iget-wide p1, p1, LyB0;->c:D

    sub-double/2addr v8, p1

    mul-double/2addr v4, v4

    mul-double/2addr v8, v8

    add-double/2addr v4, v8

    iget-wide v8, p0, LyB0;->b:D

    sub-double/2addr v8, v6

    iget-wide v6, p0, LyB0;->c:D

    sub-double/2addr v6, p1

    mul-double/2addr v8, v8

    mul-double/2addr v6, v6

    add-double/2addr v8, v6

    div-double/2addr v8, v4

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    mul-double/2addr v2, p0

    add-double/2addr v0, v2

    return-wide v0
.end method

.method public static B(LyB0;LyB0;LyB0;LyB0;LyB0;)D
    .locals 0

    invoke-static {p0, p1, p2}, LBb5;->A(LyB0;LyB0;LyB0;)D

    move-result-wide p1

    invoke-static {p0, p3, p4}, LBb5;->A(LyB0;LyB0;LyB0;)D

    move-result-wide p3

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result p0

    if-eqz p0, :cond_0

    return-wide p3

    :cond_0
    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    move-result p0

    if-eqz p0, :cond_1

    return-wide p1

    :cond_1
    add-double/2addr p1, p3

    const-wide/high16 p3, 0x4000000000000000L    # 2.0

    div-double/2addr p1, p3

    return-wide p1
.end method

.method public static r(LyB0;)LyB0;
    .locals 1

    new-instance v0, LyB0;

    invoke-direct {v0, p0}, LyB0;-><init>(LyB0;)V

    return-object v0
.end method

.method public static s(LyB0;D)LyB0;
    .locals 1

    invoke-static {p0}, LBb5;->r(LyB0;)LyB0;

    move-result-object p0

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, LyB0;->q(D)V

    :cond_0
    return-object p0
.end method

.method public static t(LyB0;LyB0;LyB0;)LyB0;
    .locals 0

    invoke-static {p0, p1, p2}, LBb5;->z(LyB0;LyB0;LyB0;)D

    move-result-wide p1

    invoke-static {p0, p1, p2}, LBb5;->s(LyB0;D)LyB0;

    move-result-object p0

    return-object p0
.end method

.method public static x(LyB0;LyB0;LyB0;LyB0;)LyB0;
    .locals 6

    invoke-static {p0, p2, p3}, LG51;->a(LyB0;LyB0;LyB0;)D

    move-result-wide v0

    invoke-static {p1, p2, p3}, LG51;->a(LyB0;LyB0;LyB0;)D

    move-result-wide v2

    cmpg-double v4, v2, v0

    if-gez v4, :cond_0

    move-wide v0, v2

    move-object v2, p1

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    invoke-static {p2, p0, p1}, LG51;->a(LyB0;LyB0;LyB0;)D

    move-result-wide v3

    cmpg-double v5, v3, v0

    if-gez v5, :cond_1

    move-wide v0, v3

    goto :goto_1

    :cond_1
    move-object p2, v2

    :goto_1
    invoke-static {p3, p0, p1}, LG51;->a(LyB0;LyB0;LyB0;)D

    move-result-wide p0

    cmpg-double p0, p0, v0

    if-gez p0, :cond_2

    goto :goto_2

    :cond_2
    move-object p3, p2

    :goto_2
    return-object p3
.end method

.method public static y(LyB0;LyB0;)D
    .locals 2

    invoke-virtual {p0}, LyB0;->m()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, LyB0;->m()D

    move-result-wide v0

    :cond_0
    return-wide v0
.end method

.method public static z(LyB0;LyB0;LyB0;)D
    .locals 3

    invoke-virtual {p0}, LyB0;->m()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    invoke-static {p0, p1, p2}, LBb5;->A(LyB0;LyB0;LyB0;)D

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public b(LyB0;LyB0;LyB0;LyB0;)I
    .locals 9

    const/4 v0, 0x0

    iput-boolean v0, p0, Lsr2;->d:Z

    invoke-static {p1, p2, p3, p4}, Lsf1;->J(LyB0;LyB0;LyB0;LyB0;)Z

    move-result v1

    if-nez v1, :cond_0

    return v0

    :cond_0
    invoke-static {p1, p2, p3}, LDy3;->a(LyB0;LyB0;LyB0;)I

    move-result v1

    invoke-static {p1, p2, p4}, LDy3;->a(LyB0;LyB0;LyB0;)I

    move-result v2

    if-lez v1, :cond_1

    if-gtz v2, :cond_2

    :cond_1
    if-gez v1, :cond_3

    if-gez v2, :cond_3

    :cond_2
    return v0

    :cond_3
    invoke-static {p3, p4, p1}, LDy3;->a(LyB0;LyB0;LyB0;)I

    move-result v3

    invoke-static {p3, p4, p2}, LDy3;->a(LyB0;LyB0;LyB0;)I

    move-result v4

    if-lez v3, :cond_4

    if-gtz v4, :cond_5

    :cond_4
    if-gez v3, :cond_6

    if-gez v4, :cond_6

    :cond_5
    return v0

    :cond_6
    const/4 v5, 0x1

    if-nez v1, :cond_7

    if-nez v2, :cond_7

    if-nez v3, :cond_7

    if-nez v4, :cond_7

    move v6, v5

    goto :goto_0

    :cond_7
    move v6, v0

    :goto_0
    if-eqz v6, :cond_8

    invoke-virtual {p0, p1, p2, p3, p4}, LBb5;->q(LyB0;LyB0;LyB0;LyB0;)I

    move-result p1

    return p1

    :cond_8
    if-eqz v1, :cond_a

    if-eqz v2, :cond_a

    if-eqz v3, :cond_a

    if-nez v4, :cond_9

    goto :goto_1

    :cond_9
    iput-boolean v5, p0, Lsr2;->d:Z

    invoke-virtual {p0, p1, p2, p3, p4}, LBb5;->u(LyB0;LyB0;LyB0;LyB0;)LyB0;

    move-result-object v1

    invoke-static {v1, p1, p2, p3, p4}, LBb5;->B(LyB0;LyB0;LyB0;LyB0;LyB0;)D

    move-result-wide p1

    move-wide p2, p1

    move-object p1, v1

    goto :goto_3

    :cond_a
    :goto_1
    iput-boolean v0, p0, Lsr2;->d:Z

    invoke-virtual {p1, p3}, LyB0;->g(LyB0;)Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-static {p1, p3}, LBb5;->y(LyB0;LyB0;)D

    move-result-wide p2

    goto :goto_3

    :cond_b
    invoke-virtual {p1, p4}, LyB0;->g(LyB0;)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-static {p1, p4}, LBb5;->y(LyB0;LyB0;)D

    move-result-wide p2

    goto :goto_3

    :cond_c
    invoke-virtual {p2, p3}, LyB0;->g(LyB0;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-static {p2, p3}, LBb5;->y(LyB0;LyB0;)D

    move-result-wide p3

    :goto_2
    move-object p1, p2

    move-wide p2, p3

    goto :goto_3

    :cond_d
    invoke-virtual {p2, p4}, LyB0;->g(LyB0;)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-static {p2, p4}, LBb5;->y(LyB0;LyB0;)D

    move-result-wide p3

    goto :goto_2

    :cond_e
    if-nez v1, :cond_f

    invoke-static {p3, p1, p2}, LBb5;->z(LyB0;LyB0;LyB0;)D

    move-result-wide p1

    move-wide v7, p1

    move-object p1, p3

    move-wide p2, v7

    goto :goto_3

    :cond_f
    if-nez v2, :cond_10

    invoke-static {p4, p1, p2}, LBb5;->z(LyB0;LyB0;LyB0;)D

    move-result-wide p1

    move-wide p2, p1

    move-object p1, p4

    goto :goto_3

    :cond_10
    if-nez v3, :cond_11

    invoke-static {p1, p3, p4}, LBb5;->z(LyB0;LyB0;LyB0;)D

    move-result-wide p2

    goto :goto_3

    :cond_11
    if-nez v4, :cond_12

    invoke-static {p2, p3, p4}, LBb5;->z(LyB0;LyB0;LyB0;)D

    move-result-wide p3

    goto :goto_2

    :cond_12
    const/4 p1, 0x0

    const-wide/high16 p2, 0x7ff8000000000000L    # Double.NaN

    :goto_3
    iget-object p4, p0, Lsr2;->c:[LyB0;

    invoke-static {p1, p2, p3}, LBb5;->s(LyB0;D)LyB0;

    move-result-object p1

    aput-object p1, p4, v0

    return v5
.end method

.method public c(LyB0;LyB0;LyB0;)V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lsr2;->d:Z

    invoke-static {p2, p3, p1}, Lsf1;->H(LyB0;LyB0;LyB0;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p2, p3, p1}, LDy3;->a(LyB0;LyB0;LyB0;)I

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p3, p2, p1}, LDy3;->a(LyB0;LyB0;LyB0;)I

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, p0, Lsr2;->d:Z

    invoke-virtual {p1, p2}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1, p3}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    iput-boolean v0, p0, Lsr2;->d:Z

    :cond_1
    iput v1, p0, Lsr2;->a:I

    return-void

    :cond_2
    iput v0, p0, Lsr2;->a:I

    return-void
.end method

.method public final q(LyB0;LyB0;LyB0;LyB0;)I
    .locals 7

    invoke-static {p1, p2, p3}, Lsf1;->H(LyB0;LyB0;LyB0;)Z

    move-result v0

    invoke-static {p1, p2, p4}, Lsf1;->H(LyB0;LyB0;LyB0;)Z

    move-result v1

    invoke-static {p3, p4, p1}, Lsf1;->H(LyB0;LyB0;LyB0;)Z

    move-result v2

    invoke-static {p3, p4, p2}, Lsf1;->H(LyB0;LyB0;LyB0;)Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    iget-object v0, p0, Lsr2;->c:[LyB0;

    invoke-static {p3, p1, p2}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p3

    aput-object p3, v0, v5

    iget-object p3, p0, Lsr2;->c:[LyB0;

    invoke-static {p4, p1, p2}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p1

    aput-object p1, p3, v6

    return v4

    :cond_0
    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    iget-object v0, p0, Lsr2;->c:[LyB0;

    invoke-static {p1, p3, p4}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p1

    aput-object p1, v0, v5

    iget-object p1, p0, Lsr2;->c:[LyB0;

    invoke-static {p2, p3, p4}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p2

    aput-object p2, p1, v6

    return v4

    :cond_1
    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    iget-object v0, p0, Lsr2;->c:[LyB0;

    invoke-static {p3, p1, p2}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p2

    aput-object p2, v0, v5

    iget-object p2, p0, Lsr2;->c:[LyB0;

    invoke-static {p1, p3, p4}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p4

    aput-object p4, p2, v6

    invoke-virtual {p3, p1}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-nez v1, :cond_2

    if-nez v3, :cond_2

    move v4, v6

    :cond_2
    return v4

    :cond_3
    if-eqz v0, :cond_5

    if-eqz v3, :cond_5

    iget-object v0, p0, Lsr2;->c:[LyB0;

    invoke-static {p3, p1, p2}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p1

    aput-object p1, v0, v5

    iget-object p1, p0, Lsr2;->c:[LyB0;

    invoke-static {p2, p3, p4}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p4

    aput-object p4, p1, v6

    invoke-virtual {p3, p2}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    if-nez v1, :cond_4

    if-nez v2, :cond_4

    move v4, v6

    :cond_4
    return v4

    :cond_5
    if-eqz v1, :cond_7

    if-eqz v2, :cond_7

    iget-object v1, p0, Lsr2;->c:[LyB0;

    invoke-static {p4, p1, p2}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p2

    aput-object p2, v1, v5

    iget-object p2, p0, Lsr2;->c:[LyB0;

    invoke-static {p1, p3, p4}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p3

    aput-object p3, p2, v6

    invoke-virtual {p4, p1}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    if-nez v0, :cond_6

    if-nez v3, :cond_6

    move v4, v6

    :cond_6
    return v4

    :cond_7
    if-eqz v1, :cond_9

    if-eqz v3, :cond_9

    iget-object v1, p0, Lsr2;->c:[LyB0;

    invoke-static {p4, p1, p2}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p1

    aput-object p1, v1, v5

    iget-object p1, p0, Lsr2;->c:[LyB0;

    invoke-static {p2, p3, p4}, LBb5;->t(LyB0;LyB0;LyB0;)LyB0;

    move-result-object p3

    aput-object p3, p1, v6

    invoke-virtual {p4, p2}, LyB0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    if-nez v0, :cond_8

    if-nez v2, :cond_8

    move v4, v6

    :cond_8
    return v4

    :cond_9
    return v5
.end method

.method public final u(LyB0;LyB0;LyB0;LyB0;)LyB0;
    .locals 2

    invoke-virtual {p0, p1, p2, p3, p4}, LBb5;->v(LyB0;LyB0;LyB0;LyB0;)LyB0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBb5;->w(LyB0;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1, p2, p3, p4}, LBb5;->x(LyB0;LyB0;LyB0;LyB0;)LyB0;

    move-result-object p1

    invoke-static {p1}, LBb5;->r(LyB0;)LyB0;

    move-result-object v0

    :cond_0
    iget-object p1, p0, Lsr2;->g:LeZ3;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, LeZ3;->f(LyB0;)V

    :cond_1
    return-object v0
.end method

.method public final v(LyB0;LyB0;LyB0;LyB0;)LyB0;
    .locals 1

    invoke-static {p1, p2, p3, p4}, LN62;->a(LyB0;LyB0;LyB0;LyB0;)LyB0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p1, p2, p3, p4}, LBb5;->x(LyB0;LyB0;LyB0;LyB0;)LyB0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final w(LyB0;)Z
    .locals 6

    new-instance v0, Lsf1;

    iget-object v1, p0, Lsr2;->b:[[LyB0;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    aget-object v3, v1, v2

    const/4 v4, 0x1

    aget-object v1, v1, v4

    invoke-direct {v0, v3, v1}, Lsf1;-><init>(LyB0;LyB0;)V

    new-instance v1, Lsf1;

    iget-object v3, p0, Lsr2;->b:[[LyB0;

    aget-object v3, v3, v4

    aget-object v5, v3, v2

    aget-object v3, v3, v4

    invoke-direct {v1, v5, v3}, Lsf1;-><init>(LyB0;LyB0;)V

    invoke-virtual {v0, p1}, Lsf1;->a(LyB0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1, p1}, Lsf1;->a(LyB0;)Z

    move-result p1

    if-eqz p1, :cond_0

    move v2, v4

    :cond_0
    return v2
.end method
