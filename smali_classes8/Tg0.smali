.class public LTg0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LyB0;

.field public b:LyB0;

.field public c:D

.field public d:LyB0;

.field public e:LyB0;

.field public f:D

.field public g:I

.field public h:LyB0;


# direct methods
.method public constructor <init>(LWB1;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LTg0;->a:LyB0;

    new-instance v1, LyB0;

    invoke-direct {v1}, LyB0;-><init>()V

    iput-object v1, p0, LTg0;->b:LyB0;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, LTg0;->c:D

    new-instance v3, LyB0;

    invoke-direct {v3}, LyB0;-><init>()V

    iput-object v3, p0, LTg0;->d:LyB0;

    new-instance v3, LyB0;

    invoke-direct {v3}, LyB0;-><init>()V

    iput-object v3, p0, LTg0;->e:LyB0;

    iput-wide v1, p0, LTg0;->f:D

    const/4 v1, 0x0

    iput v1, p0, LTg0;->g:I

    new-instance v1, LyB0;

    invoke-direct {v1}, LyB0;-><init>()V

    iput-object v1, p0, LTg0;->h:LyB0;

    iput-object v0, p0, LTg0;->a:LyB0;

    invoke-virtual {p0, p1}, LTg0;->a(LWB1;)V

    return-void
.end method

.method public static h(LyB0;LyB0;LyB0;)D
    .locals 8

    iget-wide v0, p1, LyB0;->b:D

    iget-wide v2, p0, LyB0;->b:D

    sub-double/2addr v0, v2

    iget-wide v4, p2, LyB0;->c:D

    iget-wide v6, p0, LyB0;->c:D

    sub-double/2addr v4, v6

    mul-double/2addr v0, v4

    iget-wide v4, p2, LyB0;->b:D

    sub-double/2addr v4, v2

    iget-wide p0, p1, LyB0;->c:D

    sub-double/2addr p0, v6

    mul-double/2addr v4, p0

    sub-double/2addr v0, v4

    return-wide v0
.end method

.method public static i(LyB0;LyB0;LyB0;LyB0;)V
    .locals 4

    iget-wide v0, p0, LyB0;->b:D

    iget-wide v2, p1, LyB0;->b:D

    add-double/2addr v0, v2

    iget-wide v2, p2, LyB0;->b:D

    add-double/2addr v0, v2

    iput-wide v0, p3, LyB0;->b:D

    iget-wide v0, p0, LyB0;->c:D

    iget-wide p0, p1, LyB0;->c:D

    add-double/2addr v0, p0

    iget-wide p0, p2, LyB0;->c:D

    add-double/2addr v0, p0

    iput-wide v0, p3, LyB0;->c:D

    return-void
.end method

.method public static k(LWB1;)LyB0;
    .locals 1

    new-instance v0, LTg0;

    invoke-direct {v0, p0}, LTg0;-><init>(LWB1;)V

    invoke-virtual {v0}, LTg0;->j()LyB0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LWB1;)V
    .locals 2

    invoke-virtual {p1}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, LFW3;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LWB1;->W()LyB0;

    move-result-object p1

    invoke-virtual {p0, p1}, LTg0;->e(LyB0;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, LBr2;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LWB1;->Y()[LyB0;

    move-result-object p1

    invoke-virtual {p0, p1}, LTg0;->d([LyB0;)V

    goto :goto_1

    :cond_2
    instance-of v0, p1, LCX3;

    if-eqz v0, :cond_3

    check-cast p1, LCX3;

    invoke-virtual {p0, p1}, LTg0;->b(LCX3;)V

    goto :goto_1

    :cond_3
    instance-of v0, p1, LXB1;

    if-eqz v0, :cond_4

    check-cast p1, LXB1;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-virtual {p1, v0}, LXB1;->d0(I)LWB1;

    move-result-object v1

    invoke-virtual {p0, v1}, LTg0;->a(LWB1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public final b(LCX3;)V
    .locals 2

    invoke-virtual {p1}, LCX3;->L0()LKr2;

    move-result-object v0

    invoke-virtual {v0}, LBr2;->Y()[LyB0;

    move-result-object v0

    invoke-virtual {p0, v0}, LTg0;->f([LyB0;)V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LCX3;->O0()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, LCX3;->M0(I)LKr2;

    move-result-object v1

    invoke-virtual {v1}, LBr2;->Y()[LyB0;

    move-result-object v1

    invoke-virtual {p0, v1}, LTg0;->c([LyB0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c([LyB0;)V
    .locals 5

    invoke-static {p1}, LDy3;->c([LyB0;)Z

    move-result v0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    iget-object v2, p0, LTg0;->a:LyB0;

    aget-object v3, p1, v1

    add-int/lit8 v1, v1, 0x1

    aget-object v4, p1, v1

    invoke-virtual {p0, v2, v3, v4, v0}, LTg0;->g(LyB0;LyB0;LyB0;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LTg0;->d([LyB0;)V

    return-void
.end method

.method public final d([LyB0;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-wide/16 v2, 0x0

    move-wide v6, v2

    const/4 v5, 0x0

    :goto_0
    array-length v8, v1

    add-int/lit8 v8, v8, -0x1

    if-ge v5, v8, :cond_1

    aget-object v8, v1, v5

    add-int/lit8 v9, v5, 0x1

    aget-object v10, v1, v9

    invoke-virtual {v8, v10}, LyB0;->f(LyB0;)D

    move-result-wide v10

    cmpl-double v8, v10, v2

    if-nez v8, :cond_0

    goto :goto_1

    :cond_0
    add-double/2addr v6, v10

    aget-object v5, v1, v5

    iget-wide v12, v5, LyB0;->b:D

    aget-object v8, v1, v9

    iget-wide v14, v8, LyB0;->b:D

    add-double/2addr v12, v14

    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    div-double/2addr v12, v14

    iget-object v4, v0, LTg0;->e:LyB0;

    iget-wide v2, v4, LyB0;->b:D

    mul-double/2addr v12, v10

    add-double/2addr v2, v12

    iput-wide v2, v4, LyB0;->b:D

    iget-wide v2, v5, LyB0;->c:D

    iget-wide v12, v8, LyB0;->c:D

    add-double/2addr v2, v12

    div-double/2addr v2, v14

    iget-wide v12, v4, LyB0;->c:D

    mul-double/2addr v10, v2

    add-double/2addr v12, v10

    iput-wide v12, v4, LyB0;->c:D

    :goto_1
    move v5, v9

    const-wide/16 v2, 0x0

    goto :goto_0

    :cond_1
    iget-wide v2, v0, LTg0;->f:D

    add-double/2addr v2, v6

    iput-wide v2, v0, LTg0;->f:D

    const-wide/16 v2, 0x0

    cmpl-double v2, v6, v2

    if-nez v2, :cond_2

    array-length v2, v1

    if-lez v2, :cond_2

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, LTg0;->e(LyB0;)V

    :cond_2
    return-void
.end method

.method public final e(LyB0;)V
    .locals 5

    iget v0, p0, LTg0;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LTg0;->g:I

    iget-object v0, p0, LTg0;->h:LyB0;

    iget-wide v1, v0, LyB0;->b:D

    iget-wide v3, p1, LyB0;->b:D

    add-double/2addr v1, v3

    iput-wide v1, v0, LyB0;->b:D

    iget-wide v1, v0, LyB0;->c:D

    iget-wide v3, p1, LyB0;->c:D

    add-double/2addr v1, v3

    iput-wide v1, v0, LyB0;->c:D

    return-void
.end method

.method public final f([LyB0;)V
    .locals 5

    array-length v0, p1

    const/4 v1, 0x0

    if-lez v0, :cond_0

    aget-object v0, p1, v1

    invoke-virtual {p0, v0}, LTg0;->l(LyB0;)V

    :cond_0
    invoke-static {p1}, LDy3;->c([LyB0;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    :goto_0
    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LTg0;->a:LyB0;

    aget-object v3, p1, v1

    add-int/lit8 v1, v1, 0x1

    aget-object v4, p1, v1

    invoke-virtual {p0, v2, v3, v4, v0}, LTg0;->g(LyB0;LyB0;LyB0;Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, LTg0;->d([LyB0;)V

    return-void
.end method

.method public final g(LyB0;LyB0;LyB0;Z)V
    .locals 6

    if-eqz p4, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    goto :goto_0

    :cond_0
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    :goto_0
    iget-object p4, p0, LTg0;->b:LyB0;

    invoke-static {p1, p2, p3, p4}, LTg0;->i(LyB0;LyB0;LyB0;LyB0;)V

    invoke-static {p1, p2, p3}, LTg0;->h(LyB0;LyB0;LyB0;)D

    move-result-wide p1

    iget-object p3, p0, LTg0;->d:LyB0;

    iget-wide v2, p3, LyB0;->b:D

    mul-double/2addr v0, p1

    iget-object p1, p0, LTg0;->b:LyB0;

    iget-wide v4, p1, LyB0;->b:D

    mul-double/2addr v4, v0

    add-double/2addr v2, v4

    iput-wide v2, p3, LyB0;->b:D

    iget-wide v2, p3, LyB0;->c:D

    iget-wide p1, p1, LyB0;->c:D

    mul-double/2addr p1, v0

    add-double/2addr v2, p1

    iput-wide v2, p3, LyB0;->c:D

    iget-wide p1, p0, LTg0;->c:D

    add-double/2addr p1, v0

    iput-wide p1, p0, LTg0;->c:D

    return-void
.end method

.method public j()LyB0;
    .locals 8

    new-instance v0, LyB0;

    invoke-direct {v0}, LyB0;-><init>()V

    iget-wide v1, p0, LTg0;->c:D

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-lez v1, :cond_0

    iget-object v1, p0, LTg0;->d:LyB0;

    iget-wide v2, v1, LyB0;->b:D

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    div-double/2addr v2, v4

    iget-wide v6, p0, LTg0;->c:D

    div-double/2addr v2, v6

    iput-wide v2, v0, LyB0;->b:D

    iget-wide v1, v1, LyB0;->c:D

    div-double/2addr v1, v4

    div-double/2addr v1, v6

    iput-wide v1, v0, LyB0;->c:D

    goto :goto_0

    :cond_0
    iget-wide v1, p0, LTg0;->f:D

    cmpl-double v3, v1, v3

    if-lez v3, :cond_1

    iget-object v3, p0, LTg0;->e:LyB0;

    iget-wide v4, v3, LyB0;->b:D

    div-double/2addr v4, v1

    iput-wide v4, v0, LyB0;->b:D

    iget-wide v3, v3, LyB0;->c:D

    div-double/2addr v3, v1

    iput-wide v3, v0, LyB0;->c:D

    goto :goto_0

    :cond_1
    iget v1, p0, LTg0;->g:I

    if-lez v1, :cond_2

    iget-object v2, p0, LTg0;->h:LyB0;

    iget-wide v3, v2, LyB0;->b:D

    int-to-double v5, v1

    div-double/2addr v3, v5

    iput-wide v3, v0, LyB0;->b:D

    iget-wide v2, v2, LyB0;->c:D

    int-to-double v4, v1

    div-double/2addr v2, v4

    iput-wide v2, v0, LyB0;->c:D

    :goto_0
    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final l(LyB0;)V
    .locals 0

    iput-object p1, p0, LTg0;->a:LyB0;

    return-void
.end method
