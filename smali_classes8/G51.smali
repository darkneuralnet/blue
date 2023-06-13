.class public LG51;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LyB0;LyB0;LyB0;)D
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-wide v3, v1, LyB0;->b:D

    iget-wide v5, v2, LyB0;->b:D

    cmpl-double v7, v3, v5

    if-nez v7, :cond_0

    iget-wide v7, v1, LyB0;->c:D

    iget-wide v9, v2, LyB0;->c:D

    cmpl-double v7, v7, v9

    if-nez v7, :cond_0

    invoke-virtual/range {p0 .. p1}, LyB0;->f(LyB0;)D

    move-result-wide v0

    return-wide v0

    :cond_0
    sub-double v7, v5, v3

    sub-double v9, v5, v3

    mul-double/2addr v7, v9

    iget-wide v9, v2, LyB0;->c:D

    iget-wide v11, v1, LyB0;->c:D

    sub-double v13, v9, v11

    sub-double v15, v9, v11

    mul-double/2addr v13, v15

    add-double/2addr v7, v13

    iget-wide v13, v0, LyB0;->b:D

    sub-double v15, v13, v3

    sub-double v17, v5, v3

    mul-double v15, v15, v17

    move-wide/from16 v17, v13

    iget-wide v13, v0, LyB0;->c:D

    sub-double v19, v13, v11

    sub-double v21, v9, v11

    mul-double v19, v19, v21

    add-double v15, v15, v19

    div-double/2addr v15, v7

    const-wide/16 v19, 0x0

    cmpg-double v19, v15, v19

    if-gtz v19, :cond_1

    invoke-virtual/range {p0 .. p1}, LyB0;->f(LyB0;)D

    move-result-wide v0

    return-wide v0

    :cond_1
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    cmpl-double v1, v15, v19

    if-ltz v1, :cond_2

    invoke-virtual {v0, v2}, LyB0;->f(LyB0;)D

    move-result-wide v0

    return-wide v0

    :cond_2
    sub-double v0, v11, v13

    sub-double/2addr v5, v3

    mul-double/2addr v0, v5

    sub-double v3, v3, v17

    sub-double/2addr v9, v11

    mul-double/2addr v3, v9

    sub-double/2addr v0, v3

    div-double/2addr v0, v7

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    return-wide v0
.end method
