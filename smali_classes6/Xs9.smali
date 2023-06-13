.class public final LXs9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZj9;

.field public static final b:LZj9;

.field public static final c:LZj9;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, LZj9;->y()LSj9;

    move-result-object v0

    const-wide v1, -0x4979cb9e00L

    invoke-virtual {v0, v1, v2}, LSj9;->A(J)LSj9;

    const v1, -0x3b9ac9ff

    invoke-virtual {v0, v1}, LSj9;->y(I)LSj9;

    invoke-virtual {v0}, Lbm9;->q()LEm9;

    move-result-object v0

    check-cast v0, LZj9;

    sput-object v0, LXs9;->a:LZj9;

    invoke-static {}, LZj9;->y()LSj9;

    move-result-object v0

    const-wide v1, 0x4979cb9e00L

    invoke-virtual {v0, v1, v2}, LSj9;->A(J)LSj9;

    const v1, 0x3b9ac9ff

    invoke-virtual {v0, v1}, LSj9;->y(I)LSj9;

    invoke-virtual {v0}, Lbm9;->q()LEm9;

    move-result-object v0

    check-cast v0, LZj9;

    sput-object v0, LXs9;->b:LZj9;

    invoke-static {}, LZj9;->y()LSj9;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, LSj9;->A(J)LSj9;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LSj9;->y(I)LSj9;

    invoke-virtual {v0}, Lbm9;->q()LEm9;

    move-result-object v0

    check-cast v0, LZj9;

    sput-object v0, LXs9;->c:LZj9;

    return-void
.end method

.method public static a(LZj9;)LZj9;
    .locals 7

    invoke-virtual {p0}, LZj9;->x()J

    move-result-wide v0

    invoke-virtual {p0}, LZj9;->w()I

    move-result v2

    const-wide v3, -0x4979cb9e00L

    cmp-long v3, v0, v3

    if-ltz v3, :cond_2

    const-wide v3, 0x4979cb9e00L

    cmp-long v3, v0, v3

    if-gtz v3, :cond_2

    int-to-long v3, v2

    const-wide/32 v5, -0x3b9ac9ff

    cmp-long v5, v3, v5

    if-ltz v5, :cond_2

    const-wide/32 v5, 0x3b9aca00

    cmp-long v3, v3, v5

    if-gez v3, :cond_2

    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    if-ltz v3, :cond_0

    if-gez v2, :cond_1

    :cond_0
    if-gtz v3, :cond_2

    if-gtz v2, :cond_2

    :cond_1
    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v0

    const-string v0, "Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(JI)LZj9;
    .locals 9

    int-to-long v0, p2

    const-wide/32 v2, -0x3b9aca00

    cmp-long v4, v0, v2

    const-wide/32 v5, 0x3b9aca00

    if-lez v4, :cond_0

    cmp-long v4, v0, v5

    if-ltz v4, :cond_1

    :cond_0
    div-long v7, v0, v5

    invoke-static {p0, p1, v7, v8}, LS19;->a(JJ)J

    move-result-wide p0

    rem-long/2addr v0, v5

    long-to-int p2, v0

    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v4, p0, v0

    if-lez v4, :cond_2

    if-gez p2, :cond_2

    int-to-long v7, p2

    add-long/2addr v7, v5

    long-to-int p2, v7

    const-wide/16 v4, -0x1

    add-long/2addr p0, v4

    :cond_2
    cmp-long v0, p0, v0

    if-gez v0, :cond_3

    if-lez p2, :cond_3

    int-to-long v0, p2

    add-long/2addr v0, v2

    long-to-int p2, v0

    const-wide/16 v0, 0x1

    add-long/2addr p0, v0

    :cond_3
    invoke-static {}, LZj9;->y()LSj9;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, LSj9;->A(J)LSj9;

    invoke-virtual {v0, p2}, LSj9;->y(I)LSj9;

    invoke-virtual {v0}, Lbm9;->q()LEm9;

    move-result-object p0

    check-cast p0, LZj9;

    invoke-static {p0}, LXs9;->a(LZj9;)LZj9;

    return-object p0
.end method
