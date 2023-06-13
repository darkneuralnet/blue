.class public Liq2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LEB0;)D
    .locals 13

    invoke-interface {p0}, LEB0;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    if-gt v0, v3, :cond_0

    return-wide v1

    :cond_0
    invoke-interface {p0}, LEB0;->R()LyB0;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {p0, v5, v4}, LEB0;->T(ILyB0;)V

    iget-wide v5, v4, LyB0;->b:D

    iget-wide v7, v4, LyB0;->c:D

    :goto_0
    if-ge v3, v0, :cond_1

    invoke-interface {p0, v3, v4}, LEB0;->T(ILyB0;)V

    iget-wide v9, v4, LyB0;->b:D

    iget-wide v11, v4, LyB0;->c:D

    sub-double v5, v9, v5

    sub-double v7, v11, v7

    mul-double/2addr v5, v5

    mul-double/2addr v7, v7

    add-double/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v5

    add-double/2addr v1, v5

    add-int/lit8 v3, v3, 0x1

    move-wide v5, v9

    move-wide v7, v11

    goto :goto_0

    :cond_1
    return-wide v1
.end method
