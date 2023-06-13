.class public Lpp0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public c:J

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpp0;->a:Z

    const/16 v0, 0x35

    iput v0, p0, Lpp0;->b:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lpp0;->c:J

    return-void
.end method

.method public static b(JI)I
    .locals 2

    const-wide/16 v0, 0x1

    shl-long/2addr v0, p2

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static d(JJ)I
    .locals 5

    const/4 v0, 0x0

    const/16 v1, 0x34

    move v2, v1

    :goto_0
    if-ltz v2, :cond_1

    invoke-static {p0, p1, v2}, Lpp0;->b(JI)I

    move-result v3

    invoke-static {p2, p3, v2}, Lpp0;->b(JI)I

    move-result v4

    if-eq v3, v4, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static e(J)J
    .locals 1

    const/16 v0, 0x34

    shr-long/2addr p0, v0

    return-wide p0
.end method

.method public static f(JI)J
    .locals 4

    const-wide/16 v0, 0x1

    shl-long v2, v0, p2

    sub-long/2addr v2, v0

    not-long v0, v2

    and-long/2addr p0, v0

    return-wide p0
.end method


# virtual methods
.method public a(D)V
    .locals 4

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    iget-boolean v0, p0, Lpp0;->a:Z

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lpp0;->c:J

    invoke-static {p1, p2}, Lpp0;->e(J)J

    move-result-wide p1

    iput-wide p1, p0, Lpp0;->d:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lpp0;->a:Z

    return-void

    :cond_0
    invoke-static {p1, p2}, Lpp0;->e(J)J

    move-result-wide v0

    iget-wide v2, p0, Lpp0;->d:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lpp0;->c:J

    return-void

    :cond_1
    iget-wide v0, p0, Lpp0;->c:J

    invoke-static {v0, v1, p1, p2}, Lpp0;->d(JJ)I

    move-result p1

    iput p1, p0, Lpp0;->b:I

    iget-wide v0, p0, Lpp0;->c:J

    add-int/lit8 p1, p1, 0xc

    rsub-int/lit8 p1, p1, 0x40

    invoke-static {v0, v1, p1}, Lpp0;->f(JI)J

    move-result-wide p1

    iput-wide p1, p0, Lpp0;->c:J

    return-void
.end method

.method public c()D
    .locals 2

    iget-wide v0, p0, Lpp0;->c:J

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method
