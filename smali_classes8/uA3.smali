.class public LuA3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:LQd6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LuA3$a;

    invoke-direct {v0}, LuA3$a;-><init>()V

    sput-object v0, LuA3;->a:LQd6;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LWB1;)D
    .locals 6

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object p0

    invoke-virtual {p0}, Lsf1;->n()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    invoke-virtual {p0}, Lsf1;->o()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    invoke-virtual {p0}, Lsf1;->p()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    invoke-virtual {p0}, Lsf1;->q()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static b(LWB1;LWB1;I)LWB1;
    .locals 2

    :try_start_0
    invoke-static {p0, p1, p2}, LtA3;->j(LWB1;LWB1;I)LWB1;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    invoke-static {p0, p1, p2}, LuA3;->f(LWB1;LWB1;I)LWB1;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-static {p0, p1, p2}, LuA3;->c(LWB1;LWB1;I)LWB1;

    move-result-object p0

    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    throw v0
.end method

.method public static c(LWB1;LWB1;I)LWB1;
    .locals 3

    :try_start_0
    invoke-static {p0, p1}, LfZ3;->d(LWB1;LWB1;)D

    move-result-wide v0

    new-instance v2, LeZ3;

    invoke-direct {v2, v0, v1}, LeZ3;-><init>(D)V

    invoke-static {p0, p1, p2, v2}, LtA3;->l(LWB1;LWB1;ILeZ3;)LWB1;

    move-result-object p0
    :try_end_0
    .catch Lorg/locationtech/jts/geom/TopologyException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(LWB1;LWB1;ID)LWB1;
    .locals 0

    :try_start_0
    invoke-static {p0, p3, p4}, LuA3;->h(LWB1;D)LWB1;

    move-result-object p0

    invoke-static {p1, p3, p4}, LuA3;->h(LWB1;D)LWB1;

    move-result-object p1

    invoke-static {p0, p1, p2, p3, p4}, LuA3;->e(LWB1;LWB1;ID)LWB1;

    move-result-object p0
    :try_end_0
    .catch Lorg/locationtech/jts/geom/TopologyException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static e(LWB1;LWB1;ID)LWB1;
    .locals 1

    new-instance v0, LqM5;

    invoke-direct {v0, p3, p4}, LqM5;-><init>(D)V

    invoke-static {p0, p1, p2, v0}, LtA3;->k(LWB1;LWB1;ILT83;)LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static f(LWB1;LWB1;I)LWB1;
    .locals 5

    invoke-static {p0, p1}, LuA3;->j(LWB1;LWB1;)D

    move-result-wide v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x5

    if-ge v2, v3, :cond_2

    invoke-static {p0, p1, p2, v0, v1}, LuA3;->g(LWB1;LWB1;ID)LWB1;

    move-result-object v3

    if-eqz v3, :cond_0

    return-object v3

    :cond_0
    invoke-static {p0, p1, p2, v0, v1}, LuA3;->d(LWB1;LWB1;ID)LWB1;

    move-result-object v3

    if-eqz v3, :cond_1

    return-object v3

    :cond_1
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static g(LWB1;LWB1;ID)LWB1;
    .locals 0

    :try_start_0
    invoke-static {p0, p1, p2, p3, p4}, LuA3;->e(LWB1;LWB1;ID)LWB1;

    move-result-object p0
    :try_end_0
    .catch Lorg/locationtech/jts/geom/TopologyException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static h(LWB1;D)LWB1;
    .locals 2

    new-instance v0, LtA3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LtA3;-><init>(LWB1;LeZ3;)V

    new-instance p0, LqM5;

    invoke-direct {p0, p1, p2}, LqM5;-><init>(D)V

    invoke-virtual {v0, p0}, LtA3;->m(LT83;)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, LtA3;->n(Z)V

    invoke-virtual {v0}, LtA3;->e()LWB1;

    move-result-object p0

    return-object p0
.end method

.method public static i(LWB1;)D
    .locals 4

    invoke-static {p0}, LuA3;->a(LWB1;)D

    move-result-wide v0

    const-wide v2, 0x426d1a94a2000000L    # 1.0E12

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public static j(LWB1;LWB1;)D
    .locals 2

    invoke-static {p0}, LuA3;->i(LWB1;)D

    move-result-wide v0

    invoke-static {p1}, LuA3;->i(LWB1;)D

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    return-wide p0
.end method
