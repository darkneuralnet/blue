.class public LhN1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LyB0;

.field public b:D

.field public c:D

.field public d:D

.field public e:Z


# direct methods
.method public constructor <init>(LyB0;D)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LhN1;->e:Z

    iput-object p1, p0, LhN1;->a:LyB0;

    iput-wide p2, p0, LhN1;->b:D

    const-wide/16 v0, 0x0

    cmpg-double v0, p2, v0

    if-lez v0, :cond_1

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double p2, p2, v0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LyB0;->k()D

    move-result-wide p2

    invoke-virtual {p0, p2, p3}, LhN1;->g(D)D

    move-result-wide p2

    iput-wide p2, p0, LhN1;->c:D

    invoke-virtual {p1}, LyB0;->l()D

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LhN1;->g(D)D

    move-result-wide p1

    iput-wide p1, p0, LhN1;->d:D

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LyB0;->k()D

    move-result-wide p2

    iput-wide p2, p0, LhN1;->c:D

    invoke-virtual {p1}, LyB0;->l()D

    move-result-wide p1

    iput-wide p1, p0, LhN1;->d:D

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Scale factor must be non-zero"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()LyB0;
    .locals 1

    iget-object v0, p0, LhN1;->a:LyB0;

    return-object v0
.end method

.method public b(LyB0;)Z
    .locals 10

    iget-wide v0, p1, LyB0;->b:D

    invoke-virtual {p0, v0, v1}, LhN1;->f(D)D

    move-result-wide v0

    iget-wide v2, p1, LyB0;->c:D

    invoke-virtual {p0, v2, v3}, LhN1;->f(D)D

    move-result-wide v2

    iget-wide v4, p0, LhN1;->c:D

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    add-double v8, v4, v6

    cmpl-double p1, v0, v8

    const/4 v8, 0x0

    if-ltz p1, :cond_0

    return v8

    :cond_0
    sub-double/2addr v4, v6

    cmpg-double p1, v0, v4

    if-gez p1, :cond_1

    return v8

    :cond_1
    iget-wide v0, p0, LhN1;->d:D

    add-double v4, v0, v6

    cmpl-double p1, v2, v4

    if-ltz p1, :cond_2

    return v8

    :cond_2
    sub-double/2addr v0, v6

    cmpg-double p1, v2, v0

    if-gez p1, :cond_3

    return v8

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public c(LyB0;LyB0;)Z
    .locals 11

    iget-wide v0, p0, LhN1;->b:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v2, p1, LyB0;->b:D

    iget-wide v4, p1, LyB0;->c:D

    iget-wide v6, p2, LyB0;->b:D

    iget-wide v8, p2, LyB0;->c:D

    move-object v1, p0

    invoke-virtual/range {v1 .. v9}, LhN1;->d(DDDD)Z

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p1, LyB0;->b:D

    invoke-virtual {p0, v0, v1}, LhN1;->f(D)D

    move-result-wide v3

    iget-wide v0, p1, LyB0;->c:D

    invoke-virtual {p0, v0, v1}, LhN1;->f(D)D

    move-result-wide v5

    iget-wide v0, p2, LyB0;->b:D

    invoke-virtual {p0, v0, v1}, LhN1;->f(D)D

    move-result-wide v7

    iget-wide p1, p2, LyB0;->c:D

    invoke-virtual {p0, p1, p2}, LhN1;->f(D)D

    move-result-wide v9

    move-object v2, p0

    invoke-virtual/range {v2 .. v10}, LhN1;->d(DDDD)Z

    move-result p1

    return p1
.end method

.method public final d(DDDD)Z
    .locals 32

    move-object/from16 v0, p0

    cmpl-double v1, p1, p5

    if-lez v1, :cond_0

    move-wide/from16 v8, p1

    move-wide/from16 v10, p3

    move-wide/from16 v14, p5

    move-wide/from16 v12, p7

    goto :goto_0

    :cond_0
    move-wide/from16 v14, p1

    move-wide/from16 v12, p3

    move-wide/from16 v8, p5

    move-wide/from16 v10, p7

    :goto_0
    iget-wide v1, v0, LhN1;->c:D

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double v16, v1, v3

    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    cmpl-double v1, v1, v16

    const/16 v18, 0x0

    if-ltz v1, :cond_1

    return v18

    :cond_1
    iget-wide v1, v0, LhN1;->c:D

    sub-double v19, v1, v3

    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    cmpg-double v1, v1, v19

    if-gez v1, :cond_2

    return v18

    :cond_2
    iget-wide v1, v0, LhN1;->d:D

    add-double v21, v1, v3

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    cmpl-double v1, v1, v21

    if-ltz v1, :cond_3

    return v18

    :cond_3
    iget-wide v1, v0, LhN1;->d:D

    sub-double v23, v1, v3

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    cmpg-double v1, v1, v23

    if-gez v1, :cond_4

    return v18

    :cond_4
    cmpl-double v1, v14, v8

    const/16 v25, 0x1

    if-nez v1, :cond_5

    return v25

    :cond_5
    cmpl-double v1, v12, v10

    if-nez v1, :cond_6

    return v25

    :cond_6
    move-wide v2, v14

    move-wide v4, v12

    move-wide v6, v8

    move-wide/from16 v26, v8

    move-wide v8, v10

    move-wide/from16 v28, v10

    move-wide/from16 v10, v19

    move-wide/from16 v30, v12

    move-wide/from16 v12, v21

    invoke-static/range {v2 .. v13}, LX70;->a(DDDDDD)I

    move-result v12

    if-nez v12, :cond_8

    cmpg-double v1, v30, v28

    if-gez v1, :cond_7

    return v18

    :cond_7
    return v25

    :cond_8
    move-wide v2, v14

    move-wide/from16 v4, v30

    move-wide/from16 v6, v26

    move-wide/from16 v8, v28

    move-wide/from16 v10, v16

    move v0, v12

    move-wide/from16 v12, v21

    invoke-static/range {v2 .. v13}, LX70;->a(DDDDDD)I

    move-result v12

    if-nez v12, :cond_a

    if-lez v1, :cond_9

    return v18

    :cond_9
    return v25

    :cond_a
    if-eq v0, v12, :cond_b

    return v25

    :cond_b
    move-wide v2, v14

    move-wide/from16 v4, v30

    move-wide/from16 v6, v26

    move-wide/from16 v8, v28

    move-wide/from16 v10, v19

    move v1, v12

    move-wide/from16 v12, v23

    invoke-static/range {v2 .. v13}, LX70;->a(DDDDDD)I

    move-result v12

    if-nez v12, :cond_c

    return v25

    :cond_c
    if-eq v12, v0, :cond_d

    return v25

    :cond_d
    move-wide v2, v14

    move-wide/from16 v4, v30

    move-wide/from16 v6, v26

    move-wide/from16 v8, v28

    move-wide/from16 v10, v16

    move v0, v12

    move-wide/from16 v12, v23

    invoke-static/range {v2 .. v13}, LX70;->a(DDDDDD)I

    move-result v2

    if-nez v2, :cond_f

    cmpg-double v0, v30, v28

    if-gez v0, :cond_e

    return v18

    :cond_e
    return v25

    :cond_f
    if-eq v0, v2, :cond_10

    return v25

    :cond_10
    if-eq v2, v1, :cond_11

    return v25

    :cond_11
    return v18
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, LhN1;->e:Z

    return v0
.end method

.method public final f(D)D
    .locals 2

    iget-wide v0, p0, LhN1;->b:D

    mul-double/2addr p1, v0

    return-wide p1
.end method

.method public final g(D)D
    .locals 2

    iget-wide v0, p0, LhN1;->b:D

    mul-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-double p1, p1

    return-wide p1
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LhN1;->e:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HP("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LhN1;->a:LyB0;

    invoke-static {v1}, Lkw6;->u(LyB0;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
