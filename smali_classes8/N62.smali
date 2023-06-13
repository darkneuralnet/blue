.class public LN62;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LyB0;LyB0;LyB0;LyB0;)LyB0;
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    iget-wide v4, v0, LyB0;->b:D

    iget-wide v6, v1, LyB0;->b:D

    cmpg-double v8, v4, v6

    if-gez v8, :cond_0

    move-wide v8, v4

    goto :goto_0

    :cond_0
    move-wide v8, v6

    :goto_0
    iget-wide v10, v0, LyB0;->c:D

    iget-wide v0, v1, LyB0;->c:D

    cmpg-double v12, v10, v0

    if-gez v12, :cond_1

    move-wide v12, v10

    goto :goto_1

    :cond_1
    move-wide v12, v0

    :goto_1
    cmpl-double v14, v4, v6

    if-lez v14, :cond_2

    move-wide v14, v4

    goto :goto_2

    :cond_2
    move-wide v14, v6

    :goto_2
    cmpl-double v16, v10, v0

    move-wide/from16 p0, v0

    if-lez v16, :cond_3

    move-wide/from16 v16, v10

    goto :goto_3

    :cond_3
    move-wide/from16 v16, p0

    :goto_3
    iget-wide v0, v2, LyB0;->b:D

    move-wide/from16 v18, v6

    iget-wide v6, v3, LyB0;->b:D

    cmpg-double v20, v0, v6

    if-gez v20, :cond_4

    move-wide/from16 v20, v0

    goto :goto_4

    :cond_4
    move-wide/from16 v20, v6

    :goto_4
    move-wide/from16 v22, v10

    iget-wide v10, v2, LyB0;->c:D

    iget-wide v2, v3, LyB0;->c:D

    cmpg-double v24, v10, v2

    if-gez v24, :cond_5

    move-wide/from16 v24, v10

    goto :goto_5

    :cond_5
    move-wide/from16 v24, v2

    :goto_5
    cmpl-double v26, v0, v6

    if-lez v26, :cond_6

    move-wide/from16 v26, v0

    goto :goto_6

    :cond_6
    move-wide/from16 v26, v6

    :goto_6
    cmpl-double v28, v10, v2

    if-lez v28, :cond_7

    move-wide/from16 v28, v10

    goto :goto_7

    :cond_7
    move-wide/from16 v28, v2

    :goto_7
    cmpl-double v30, v8, v20

    if-lez v30, :cond_8

    goto :goto_8

    :cond_8
    move-wide/from16 v8, v20

    :goto_8
    cmpg-double v20, v14, v26

    if-gez v20, :cond_9

    goto :goto_9

    :cond_9
    move-wide/from16 v14, v26

    :goto_9
    cmpl-double v20, v12, v24

    if-lez v20, :cond_a

    goto :goto_a

    :cond_a
    move-wide/from16 v12, v24

    :goto_a
    cmpg-double v20, v16, v28

    if-gez v20, :cond_b

    goto :goto_b

    :cond_b
    move-wide/from16 v16, v28

    :goto_b
    add-double/2addr v8, v14

    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    div-double/2addr v8, v14

    add-double v12, v12, v16

    div-double/2addr v12, v14

    sub-double/2addr v4, v8

    sub-double v14, v22, v12

    sub-double v16, v18, v8

    move-wide/from16 v18, p0

    sub-double v18, v18, v12

    sub-double/2addr v0, v8

    sub-double/2addr v10, v12

    sub-double/2addr v6, v8

    sub-double/2addr v2, v12

    sub-double v20, v14, v18

    sub-double v22, v16, v4

    mul-double v4, v4, v18

    mul-double v16, v16, v14

    sub-double v4, v4, v16

    sub-double v14, v10, v2

    sub-double v16, v6, v0

    mul-double/2addr v0, v2

    mul-double/2addr v6, v10

    sub-double/2addr v0, v6

    mul-double v2, v22, v0

    mul-double v6, v16, v4

    sub-double/2addr v2, v6

    mul-double/2addr v4, v14

    mul-double v0, v0, v20

    sub-double/2addr v4, v0

    mul-double v20, v20, v16

    mul-double v14, v14, v22

    sub-double v20, v20, v14

    div-double v2, v2, v20

    div-double v4, v4, v20

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static {v2, v3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_c

    :cond_c
    new-instance v0, LyB0;

    add-double/2addr v2, v8

    add-double/2addr v4, v12

    invoke-direct {v0, v2, v3, v4, v5}, LyB0;-><init>(DD)V

    return-object v0

    :cond_d
    :goto_c
    const/4 v0, 0x0

    return-object v0
.end method
