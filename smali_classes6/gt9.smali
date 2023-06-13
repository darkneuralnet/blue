.class public final Lgt9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LKr9;

.field public static final b:LKr9;

.field public static final c:LKr9;

.field public static final d:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/SimpleDateFormat;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    invoke-static {}, LKr9;->y()LIr9;

    move-result-object v0

    const-wide v1, -0xe7791f700L

    invoke-virtual {v0, v1, v2}, LIr9;->A(J)LIr9;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LIr9;->y(I)LIr9;

    invoke-virtual {v0}, Lbm9;->q()LEm9;

    move-result-object v0

    check-cast v0, LKr9;

    sput-object v0, Lgt9;->a:LKr9;

    invoke-static {}, LKr9;->y()LIr9;

    move-result-object v0

    const-wide v2, 0x3afff4417fL

    invoke-virtual {v0, v2, v3}, LIr9;->A(J)LIr9;

    const v2, 0x3b9ac9ff

    invoke-virtual {v0, v2}, LIr9;->y(I)LIr9;

    invoke-virtual {v0}, Lbm9;->q()LEm9;

    move-result-object v0

    check-cast v0, LKr9;

    sput-object v0, Lgt9;->b:LKr9;

    invoke-static {}, LKr9;->y()LIr9;

    move-result-object v0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, LIr9;->A(J)LIr9;

    invoke-virtual {v0, v1}, LIr9;->y(I)LIr9;

    invoke-virtual {v0}, Lbm9;->q()LEm9;

    move-result-object v0

    check-cast v0, LKr9;

    sput-object v0, Lgt9;->c:LKr9;

    new-instance v0, Let9;

    invoke-direct {v0}, Let9;-><init>()V

    sput-object v0, Lgt9;->d:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public static a(LKr9;LKr9;)LZj9;
    .locals 7

    invoke-static {p0}, Lgt9;->b(LKr9;)LKr9;

    invoke-static {p1}, Lgt9;->b(LKr9;)LKr9;

    invoke-virtual {p1}, LKr9;->x()J

    move-result-wide v0

    invoke-virtual {p0}, LKr9;->x()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LS19;->c(JJ)J

    move-result-wide v0

    invoke-virtual {p1}, LKr9;->w()I

    move-result p1

    invoke-virtual {p0}, LKr9;->w()I

    move-result p0

    int-to-long v2, p1

    int-to-long v4, p0

    sub-long/2addr v2, v4

    long-to-int v4, v2

    int-to-long v5, v4

    cmp-long v2, v2, v5

    if-nez v2, :cond_0

    invoke-static {v0, v1, v4}, LXs9;->b(JI)LZj9;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x33

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "overflow: checkedSubtract("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(LKr9;)LKr9;
    .locals 7

    invoke-virtual {p0}, LKr9;->x()J

    move-result-wide v0

    invoke-virtual {p0}, LKr9;->w()I

    move-result v2

    const-wide v3, -0xe7791f700L

    cmp-long v3, v0, v3

    if-ltz v3, :cond_0

    const-wide v3, 0x3afff4417fL

    cmp-long v3, v0, v3

    if-gtz v3, :cond_0

    if-ltz v2, :cond_0

    int-to-long v3, v2

    const-wide/32 v5, 0x3b9aca00

    cmp-long v3, v3, v5

    if-gez v3, :cond_0

    return-object p0

    :cond_0
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

    const-string v0, "Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999]."

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(J)LKr9;
    .locals 4

    const-wide/16 v0, 0x3e8

    div-long v2, p0, v0

    rem-long/2addr p0, v0

    const-wide/32 v0, 0xf4240

    mul-long/2addr p0, v0

    long-to-int p0, p0

    invoke-static {v2, v3, p0}, Lgt9;->d(JI)LKr9;

    move-result-object p0

    return-object p0
.end method

.method public static d(JI)LKr9;
    .locals 7

    int-to-long v0, p2

    const-wide/32 v2, -0x3b9aca00

    cmp-long v2, v0, v2

    const-wide/32 v3, 0x3b9aca00

    if-lez v2, :cond_0

    cmp-long v2, v0, v3

    if-ltz v2, :cond_1

    :cond_0
    div-long v5, v0, v3

    invoke-static {p0, p1, v5, v6}, LS19;->a(JJ)J

    move-result-wide p0

    rem-long/2addr v0, v3

    long-to-int p2, v0

    :cond_1
    if-gez p2, :cond_2

    int-to-long v0, p2

    add-long/2addr v0, v3

    long-to-int p2, v0

    const-wide/16 v0, 0x1

    invoke-static {p0, p1, v0, v1}, LS19;->c(JJ)J

    move-result-wide p0

    :cond_2
    invoke-static {}, LKr9;->y()LIr9;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, LIr9;->A(J)LIr9;

    invoke-virtual {v0, p2}, LIr9;->y(I)LIr9;

    invoke-virtual {v0}, Lbm9;->q()LEm9;

    move-result-object p0

    check-cast p0, LKr9;

    invoke-static {p0}, Lgt9;->b(LKr9;)LKr9;

    return-object p0
.end method
