.class public LaN2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:D

.field public static final b:D


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    sput-wide v0, LaN2;->a:D

    const-wide/high16 v0, 0x4014000000000000L    # 5.0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    sput-wide v0, LaN2;->b:D

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(III)I
    .locals 0

    if-ge p0, p1, :cond_0

    return p1

    :cond_0
    if-le p0, p2, :cond_1

    return p2

    :cond_1
    return p0
.end method

.method public static b(DDDD)D
    .locals 1

    cmpl-double v0, p2, p0

    if-lez v0, :cond_0

    move-wide p0, p2

    :cond_0
    cmpl-double p2, p4, p0

    if-lez p2, :cond_1

    goto :goto_0

    :cond_1
    move-wide p4, p0

    :goto_0
    cmpl-double p0, p6, p4

    if-lez p0, :cond_2

    goto :goto_1

    :cond_2
    move-wide p6, p4

    :goto_1
    return-wide p6
.end method

.method public static c(D)D
    .locals 2

    sget-wide v0, LaN2;->b:D

    invoke-static {p0, p1, v0, v1}, LaN2;->d(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static d(DD)D
    .locals 0

    add-double/2addr p0, p2

    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    cmpg-double p2, p0, p2

    if-gez p2, :cond_0

    return-wide p0

    :cond_0
    invoke-static {p0, p1}, Ljava/lang/Math;->floor(D)D

    move-result-wide p2

    sub-double/2addr p0, p2

    return-wide p0
.end method
