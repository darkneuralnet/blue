.class public LVB1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVB1$a;
    }
.end annotation


# instance fields
.field public a:LbC1;

.field public b:LeZ3;

.field public c:LVB1$a;

.field public d:I

.field public e:D


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, LbC1;

    invoke-direct {v0}, LbC1;-><init>()V

    invoke-direct {p0, v0}, LVB1;-><init>(LbC1;)V

    return-void
.end method

.method public constructor <init>(LbC1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LVB1;->b:LeZ3;

    new-instance v0, LVB1$a;

    invoke-direct {v0}, LVB1$a;-><init>()V

    iput-object v0, p0, LVB1;->c:LVB1$a;

    const/16 v0, 0x64

    iput v0, p0, LVB1;->d:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LVB1;->e:D

    iput-object p1, p0, LVB1;->a:LbC1;

    invoke-virtual {p1}, LbC1;->B()LeZ3;

    move-result-object p1

    iput-object p1, p0, LVB1;->b:LeZ3;

    return-void
.end method


# virtual methods
.method public a(DD)LyB0;
    .locals 1

    new-instance v0, LyB0;

    invoke-direct {v0, p1, p2, p3, p4}, LyB0;-><init>(DD)V

    iget-object p1, p0, LVB1;->b:LeZ3;

    invoke-virtual {p1, v0}, LeZ3;->f(LyB0;)V

    return-object v0
.end method

.method public b()LCX3;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, LVB1;->c:LVB1$a;

    invoke-virtual {v1}, LVB1$a;->b()Lsf1;

    move-result-object v1

    invoke-virtual {v1}, Lsf1;->r()D

    move-result-wide v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    invoke-virtual {v1}, Lsf1;->m()D

    move-result-wide v6

    div-double/2addr v6, v4

    invoke-virtual {v1}, Lsf1;->p()D

    move-result-wide v4

    add-double/2addr v4, v2

    invoke-virtual {v1}, Lsf1;->q()D

    move-result-wide v8

    add-double/2addr v8, v6

    iget v1, v0, LVB1;->d:I

    add-int/lit8 v1, v1, 0x1

    new-array v1, v1, [LyB0;

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_0
    iget v13, v0, LVB1;->d:I

    if-ge v11, v13, :cond_0

    int-to-double v14, v11

    const-wide v16, 0x401921fb54442d18L    # 6.283185307179586

    move/from16 v18, v11

    int-to-double v10, v13

    div-double v16, v16, v10

    mul-double v14, v14, v16

    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    mul-double/2addr v10, v2

    add-double/2addr v10, v4

    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    move-result-wide v13

    mul-double/2addr v13, v6

    add-double/2addr v13, v8

    add-int/lit8 v15, v12, 0x1

    invoke-virtual {v0, v10, v11, v13, v14}, LVB1;->a(DD)LyB0;

    move-result-object v10

    aput-object v10, v1, v12

    add-int/lit8 v11, v18, 0x1

    move v12, v15

    goto :goto_0

    :cond_0
    new-instance v2, LyB0;

    const/4 v3, 0x0

    aget-object v3, v1, v3

    invoke-direct {v2, v3}, LyB0;-><init>(LyB0;)V

    aput-object v2, v1, v12

    iget-object v2, v0, LVB1;->a:LbC1;

    invoke-virtual {v2, v1}, LbC1;->j([LyB0;)LKr2;

    move-result-object v1

    iget-object v2, v0, LVB1;->a:LbC1;

    invoke-virtual {v2, v1}, LbC1;->x(LKr2;)LCX3;

    move-result-object v1

    invoke-virtual {v0, v1}, LVB1;->c(LWB1;)LWB1;

    move-result-object v1

    check-cast v1, LCX3;

    return-object v1
.end method

.method public c(LWB1;)LWB1;
    .locals 6

    iget-wide v0, p0, LVB1;->e:D

    const-wide/16 v2, 0x0

    cmpl-double v2, v0, v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LVB1;->c:LVB1$a;

    invoke-virtual {v2}, LVB1$a;->a()LyB0;

    move-result-object v2

    iget-wide v2, v2, LyB0;->b:D

    iget-object v4, p0, LVB1;->c:LVB1$a;

    invoke-virtual {v4}, LVB1$a;->a()LyB0;

    move-result-object v4

    iget-wide v4, v4, LyB0;->c:D

    invoke-static/range {v0 .. v5}, Le9;->f(DDD)Le9;

    move-result-object v0

    invoke-virtual {p1, v0}, LWB1;->e(LGB0;)V

    :cond_0
    return-object p1
.end method

.method public d(LyB0;)V
    .locals 1

    iget-object v0, p0, LVB1;->c:LVB1$a;

    invoke-virtual {v0, p1}, LVB1$a;->c(LyB0;)V

    return-void
.end method

.method public e(D)V
    .locals 1

    iget-object v0, p0, LVB1;->c:LVB1$a;

    invoke-virtual {v0, p1, p2}, LVB1$a;->d(D)V

    return-void
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, LVB1;->d:I

    return-void
.end method

.method public g(D)V
    .locals 1

    iget-object v0, p0, LVB1;->c:LVB1$a;

    invoke-virtual {v0, p1, p2}, LVB1$a;->e(D)V

    return-void
.end method
