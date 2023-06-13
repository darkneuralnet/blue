.class public LfZ3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I = 0xe


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lsf1;)D
    .locals 10

    invoke-virtual {p0}, Lsf1;->n()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    invoke-virtual {p0}, Lsf1;->o()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    invoke-virtual {p0}, Lsf1;->p()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    invoke-virtual {p0}, Lsf1;->q()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v8

    invoke-static/range {v2 .. v9}, LaN2;->b(DDDD)D

    move-result-wide v0

    return-wide v0
.end method

.method public static b(DI)D
    .locals 4

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr p0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr p0, v2

    double-to-int p0, p0

    sub-int/2addr p2, p0

    int-to-double p0, p2

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static c(D)D
    .locals 1

    sget v0, LfZ3;->a:I

    invoke-static {p0, p1, v0}, LfZ3;->b(DI)D

    move-result-wide p0

    return-wide p0
.end method

.method public static d(LWB1;LWB1;)D
    .locals 2

    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object p0

    invoke-static {p0}, LfZ3;->a(Lsf1;)D

    move-result-wide v0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object p0

    invoke-static {p0}, LfZ3;->a(Lsf1;)D

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    :cond_0
    invoke-static {v0, v1}, LfZ3;->c(D)D

    move-result-wide p0

    return-wide p0
.end method
