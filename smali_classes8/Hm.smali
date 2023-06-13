.class public LHm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LEB0;)D
    .locals 2

    invoke-static {p0}, LHm;->b(LEB0;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static b(LEB0;)D
    .locals 17

    move-object/from16 v0, p0

    invoke-interface/range {p0 .. p0}, LEB0;->size()I

    move-result v1

    const/4 v2, 0x3

    const-wide/16 v3, 0x0

    if-ge v1, v2, :cond_0

    return-wide v3

    :cond_0
    invoke-interface/range {p0 .. p0}, LEB0;->R()LyB0;

    move-result-object v2

    invoke-interface/range {p0 .. p0}, LEB0;->R()LyB0;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, LEB0;->R()LyB0;

    move-result-object v6

    const/4 v7, 0x0

    invoke-interface {v0, v7, v5}, LEB0;->T(ILyB0;)V

    const/4 v7, 0x1

    invoke-interface {v0, v7, v6}, LEB0;->T(ILyB0;)V

    iget-wide v8, v5, LyB0;->b:D

    iget-wide v10, v6, LyB0;->b:D

    sub-double/2addr v10, v8

    iput-wide v10, v6, LyB0;->b:D

    move v10, v7

    :goto_0
    add-int/lit8 v11, v1, -0x1

    if-ge v10, v11, :cond_1

    iget-wide v11, v5, LyB0;->c:D

    iput-wide v11, v2, LyB0;->c:D

    iget-wide v11, v6, LyB0;->b:D

    iput-wide v11, v5, LyB0;->b:D

    iget-wide v11, v6, LyB0;->c:D

    iput-wide v11, v5, LyB0;->c:D

    add-int/lit8 v10, v10, 0x1

    invoke-interface {v0, v10, v6}, LEB0;->T(ILyB0;)V

    iget-wide v11, v6, LyB0;->b:D

    sub-double/2addr v11, v8

    iput-wide v11, v6, LyB0;->b:D

    iget-wide v11, v5, LyB0;->b:D

    iget-wide v13, v2, LyB0;->c:D

    move-wide v15, v8

    iget-wide v7, v6, LyB0;->c:D

    sub-double/2addr v13, v7

    mul-double/2addr v11, v13

    add-double/2addr v3, v11

    move-wide v8, v15

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double/2addr v3, v0

    return-wide v3
.end method
