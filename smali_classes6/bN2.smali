.class public LbN2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(D)D
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Math;->asin(D)D

    move-result-wide p0

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    mul-double/2addr p0, v0

    return-wide p0
.end method

.method public static b(D)D
    .locals 2

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    mul-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->sin(D)D

    move-result-wide p0

    mul-double/2addr p0, p0

    return-wide p0
.end method

.method public static c(DDD)D
    .locals 2

    sub-double v0, p0, p2

    invoke-static {v0, v1}, LbN2;->b(D)D

    move-result-wide v0

    invoke-static {p4, p5}, LbN2;->b(D)D

    move-result-wide p4

    invoke-static {p0, p1}, Ljava/lang/Math;->cos(D)D

    move-result-wide p0

    mul-double/2addr p4, p0

    invoke-static {p2, p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide p0

    mul-double/2addr p4, p0

    add-double/2addr v0, p4

    return-wide v0
.end method

.method public static d(D)D
    .locals 2

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    mul-double/2addr p0, v0

    const-wide v0, 0x3fe921fb54442d18L    # 0.7853981633974483

    add-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->tan(D)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static e(DD)D
    .locals 0

    rem-double/2addr p0, p2

    add-double/2addr p0, p2

    rem-double/2addr p0, p2

    return-wide p0
.end method

.method public static f(DDD)D
    .locals 1

    cmpl-double v0, p0, p2

    if-ltz v0, :cond_0

    cmpg-double v0, p0, p4

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    sub-double/2addr p0, p2

    sub-double/2addr p4, p2

    invoke-static {p0, p1, p4, p5}, LbN2;->e(DD)D

    move-result-wide p0

    add-double/2addr p0, p2

    :goto_0
    return-wide p0
.end method
