.class public LfC1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LWB1;


# direct methods
.method public constructor <init>(LWB1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfC1;->a:LWB1;

    return-void
.end method

.method public static a(LWB1;)D
    .locals 6

    invoke-static {p0}, LfC1;->c(LWB1;)D

    move-result-wide v0

    invoke-virtual {p0}, LWB1;->h0()LeZ3;

    move-result-object p0

    invoke-virtual {p0}, LeZ3;->c()LeZ3$a;

    move-result-object v2

    sget-object v3, LeZ3;->e:LeZ3$a;

    if-ne v2, v3, :cond_0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-virtual {p0}, LeZ3;->b()D

    move-result-wide v4

    div-double/2addr v2, v4

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double/2addr v2, v4

    const-wide v4, 0x3ff6a3d70a3d70a4L    # 1.415

    div-double/2addr v2, v4

    cmpl-double p0, v2, v0

    if-lez p0, :cond_0

    move-wide v0, v2

    :cond_0
    return-wide v0
.end method

.method public static b(LWB1;LWB1;)D
    .locals 2

    invoke-static {p0}, LfC1;->a(LWB1;)D

    move-result-wide v0

    invoke-static {p1}, LfC1;->a(LWB1;)D

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static c(LWB1;)D
    .locals 4

    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object p0

    invoke-virtual {p0}, Lsf1;->m()D

    move-result-wide v0

    invoke-virtual {p0}, Lsf1;->r()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    const-wide v2, 0x3e112e0be826d695L    # 1.0E-9

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public static e(LWB1;LWB1;D)[LWB1;
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [LWB1;

    new-instance v1, LfC1;

    invoke-direct {v1, p0}, LfC1;-><init>(LWB1;)V

    invoke-virtual {v1, p1, p2, p3}, LfC1;->f(LWB1;D)LWB1;

    move-result-object p0

    const/4 v1, 0x0

    aput-object p0, v0, v1

    new-instance p0, LfC1;

    invoke-direct {p0, p1}, LfC1;-><init>(LWB1;)V

    aget-object p1, v0, v1

    invoke-virtual {p0, p1, p2, p3}, LfC1;->f(LWB1;D)LWB1;

    move-result-object p0

    const/4 p1, 0x1

    aput-object p0, v0, p1

    return-object v0
.end method


# virtual methods
.method public final d(LWB1;)[LyB0;
    .locals 4

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    invoke-virtual {p1}, LWB1;->Y()[LyB0;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    aget-object v3, p1, v2

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-array p1, v1, [LyB0;

    invoke-interface {v0, p1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LyB0;

    return-object p1
.end method

.method public f(LWB1;D)LWB1;
    .locals 1

    invoke-virtual {p0, p1}, LfC1;->d(LWB1;)[LyB0;

    move-result-object p1

    new-instance v0, LoM5;

    invoke-direct {v0, p2, p3, p1}, LoM5;-><init>(D[LyB0;)V

    iget-object p1, p0, LfC1;->a:LWB1;

    invoke-virtual {v0, p1}, LgC1;->b(LWB1;)LWB1;

    move-result-object p1

    return-object p1
.end method
