.class public LBv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lad;

.field public static volatile e:LBv0;


# instance fields
.field public final a:Lcom/google/firebase/perf/config/RemoteConfigManager;

.field public b:LPY1;

.field public c:Li21;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lad;->e()Lad;

    move-result-object v0

    sput-object v0, LBv0;->d:Lad;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/perf/config/RemoteConfigManager;LPY1;Li21;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    invoke-static {}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getInstance()Lcom/google/firebase/perf/config/RemoteConfigManager;

    move-result-object p1

    :cond_0
    iput-object p1, p0, LBv0;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    if-nez p2, :cond_1

    new-instance p2, LPY1;

    invoke-direct {p2}, LPY1;-><init>()V

    :cond_1
    iput-object p2, p0, LBv0;->b:LPY1;

    if-nez p3, :cond_2

    invoke-static {}, Li21;->e()Li21;

    move-result-object p3

    :cond_2
    iput-object p3, p0, LBv0;->c:Li21;

    return-void
.end method

.method public static declared-synchronized g()LBv0;
    .locals 3

    const-class v0, LBv0;

    monitor-enter v0

    :try_start_0
    sget-object v1, LBv0;->e:LBv0;

    if-nez v1, :cond_0

    new-instance v1, LBv0;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, v2}, LBv0;-><init>(Lcom/google/firebase/perf/config/RemoteConfigManager;LPY1;Li21;)V

    sput-object v1, LBv0;->e:LBv0;

    :cond_0
    sget-object v1, LBv0;->e:LBv0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public A()J
    .locals 5

    invoke-static {}, Ltx0;->e()Ltx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->p(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->M(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->w(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->M(J)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Ltx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->k(Ljava/lang/String;J)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {p0, v0}, LBv0;->d(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->M(J)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-virtual {v0}, Ltx0;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public B()J
    .locals 5

    invoke-static {}, Lux0;->e()Lux0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->p(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->w(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lux0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->k(Ljava/lang/String;J)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {p0, v0}, LBv0;->d(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-virtual {v0}, Lux0;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public C()J
    .locals 5

    invoke-static {}, Lvx0;->e()Lvx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->p(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->w(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lvx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->k(Ljava/lang/String;J)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {p0, v0}, LBv0;->d(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-virtual {v0}, Lvx0;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public D()D
    .locals 5

    invoke-static {}, Lwx0;->e()Lwx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->o(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    div-double/2addr v1, v3

    invoke-virtual {p0, v1, v2}, LBv0;->L(D)Z

    move-result v3

    if-eqz v3, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->v(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->L(D)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lwx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->j(Ljava/lang/String;D)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {p0, v0}, LBv0;->c(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->L(D)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-virtual {v0}, Lwx0;->d()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public E()J
    .locals 5

    invoke-static {}, Lxx0;->e()Lxx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->w(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->H(J)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lxx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->k(Ljava/lang/String;J)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->d(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->H(J)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {v0}, Lxx0;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public F()J
    .locals 5

    invoke-static {}, Lyx0;->e()Lyx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->w(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->H(J)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lyx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->k(Ljava/lang/String;J)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->d(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->H(J)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {v0}, Lyx0;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public G()D
    .locals 5

    invoke-static {}, Lzx0;->e()Lzx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->v(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->L(D)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lzx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->j(Ljava/lang/String;D)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->c(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->L(D)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {v0}, Lzx0;->d()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public final H(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final I(Ljava/lang/String;)Z
    .locals 5

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, ";"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    sget-object v4, LU30;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final J(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public K()Z
    .locals 2

    invoke-virtual {p0}, LBv0;->j()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p0}, LBv0;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final L(D)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmpg-double v0, v0, p1

    if-gtz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final M(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final N(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public O(Landroid/content/Context;)V
    .locals 2

    sget-object v0, LBv0;->d:Lad;

    invoke-static {p1}, LQi6;->b(Landroid/content/Context;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lad;->i(Z)V

    iget-object v0, p0, LBv0;->c:Li21;

    invoke-virtual {v0, p1}, Li21;->i(Landroid/content/Context;)V

    return-void
.end method

.method public P(LPY1;)V
    .locals 0

    iput-object p1, p0, LBv0;->b:LPY1;

    return-void
.end method

.method public a()Ljava/lang/String;
    .locals 5

    invoke-static {}, Lkx0;->e()Lkx0;

    move-result-object v0

    sget-object v1, LU30;->a:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lkx0;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lkx0;->c()Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, -0x1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v4, p0, LBv0;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValueOrDefault(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :goto_0
    invoke-virtual {v0}, Lkx0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v3}, Lkx0;->g(J)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v2, v3}, Lkx0;->f(J)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v0, p0, LBv0;->c:Li21;

    invoke-virtual {v0, v1, v2}, Li21;->l(Ljava/lang/String;Ljava/lang/String;)Z

    return-object v2

    :cond_2
    invoke-virtual {p0, v0}, LBv0;->e(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_3
    invoke-virtual {v0}, Lkx0;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(LAx0;)Ljy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAx0<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljy3<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBv0;->c:Li21;

    invoke-virtual {p1}, LAx0;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Li21;->b(Ljava/lang/String;)Ljy3;

    move-result-object p1

    return-object p1
.end method

.method public final c(LAx0;)Ljy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAx0<",
            "Ljava/lang/Double;",
            ">;)",
            "Ljy3<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBv0;->c:Li21;

    invoke-virtual {p1}, LAx0;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Li21;->c(Ljava/lang/String;)Ljy3;

    move-result-object p1

    return-object p1
.end method

.method public final d(LAx0;)Ljy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAx0<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljy3<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBv0;->c:Li21;

    invoke-virtual {p1}, LAx0;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Li21;->f(Ljava/lang/String;)Ljy3;

    move-result-object p1

    return-object p1
.end method

.method public final e(LAx0;)Ljy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAx0<",
            "Ljava/lang/String;",
            ">;)",
            "Ljy3<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBv0;->c:Li21;

    invoke-virtual {p1}, LAx0;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Li21;->g(Ljava/lang/String;)Ljy3;

    move-result-object p1

    return-object p1
.end method

.method public f()D
    .locals 5

    invoke-static {}, Ljx0;->e()Ljx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->o(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    div-double/2addr v1, v3

    invoke-virtual {p0, v1, v2}, LBv0;->L(D)Z

    move-result v3

    if-eqz v3, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->v(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->L(D)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Ljx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->j(Ljava/lang/String;D)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {p0, v0}, LBv0;->c(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->L(D)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-virtual {v0}, Ljx0;->d()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public h()Z
    .locals 4

    invoke-static {}, Lix0;->e()Lix0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->n(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->u(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lix0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v2, v0, v3}, Li21;->m(Ljava/lang/String;Z)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_1
    invoke-virtual {p0, v0}, LBv0;->b(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_2
    invoke-virtual {v0}, Lix0;->d()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/Boolean;
    .locals 3

    invoke-static {}, Lgx0;->e()Lgx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->n(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lgx0;->d()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/lang/Boolean;
    .locals 3

    invoke-virtual {p0}, LBv0;->i()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_0
    invoke-static {}, Lhx0;->d()Lhx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->b(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0

    :cond_1
    invoke-virtual {p0, v0}, LBv0;->n(LAx0;)Ljy3;

    move-result-object v0

    invoke-virtual {v0}, Ljy3;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()Z
    .locals 4

    invoke-static {}, Lqx0;->e()Lqx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->u(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LBv0;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    invoke-virtual {v2}, Lcom/google/firebase/perf/config/RemoteConfigManager;->isLastFetchFailed()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lqx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v2, v0, v3}, Li21;->m(Ljava/lang/String;Z)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_1
    invoke-virtual {p0, v0}, LBv0;->b(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_2
    invoke-virtual {v0}, Lqx0;->d()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final l()Z
    .locals 4

    invoke-static {}, Lpx0;->e()Lpx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->x(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lpx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Li21;->l(Ljava/lang/String;Ljava/lang/String;)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, LBv0;->I(Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->e(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, LBv0;->I(Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_1
    invoke-virtual {v0}, Lpx0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->I(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public m()Z
    .locals 1

    invoke-virtual {p0}, LBv0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LBv0;->l()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final n(LAx0;)Ljy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAx0<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljy3<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBv0;->b:LPY1;

    invoke-virtual {p1}, LAx0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LPY1;->b(Ljava/lang/String;)Ljy3;

    move-result-object p1

    return-object p1
.end method

.method public final o(LAx0;)Ljy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAx0<",
            "Ljava/lang/Double;",
            ">;)",
            "Ljy3<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBv0;->b:LPY1;

    invoke-virtual {p1}, LAx0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LPY1;->c(Ljava/lang/String;)Ljy3;

    move-result-object p1

    return-object p1
.end method

.method public final p(LAx0;)Ljy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAx0<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljy3<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBv0;->b:LPY1;

    invoke-virtual {p1}, LAx0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LPY1;->e(Ljava/lang/String;)Ljy3;

    move-result-object p1

    return-object p1
.end method

.method public q()J
    .locals 5

    invoke-static {}, Llx0;->e()Llx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->w(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->H(J)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Llx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->k(Ljava/lang/String;J)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->d(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->H(J)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {v0}, Llx0;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public r()J
    .locals 5

    invoke-static {}, Lmx0;->e()Lmx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->w(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->H(J)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lmx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->k(Ljava/lang/String;J)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->d(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->H(J)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {v0}, Lmx0;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public s()D
    .locals 5

    invoke-static {}, Lnx0;->e()Lnx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->v(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->L(D)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lnx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->j(Ljava/lang/String;D)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->c(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->L(D)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {v0}, Lnx0;->d()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public t()J
    .locals 5

    invoke-static {}, Lox0;->e()Lox0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->w(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->N(J)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lox0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->k(Ljava/lang/String;J)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->d(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->N(J)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {v0}, Lox0;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final u(LAx0;)Ljy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAx0<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljy3<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBv0;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    invoke-virtual {p1}, LAx0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getBoolean(Ljava/lang/String;)Ljy3;

    move-result-object p1

    return-object p1
.end method

.method public final v(LAx0;)Ljy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAx0<",
            "Ljava/lang/Double;",
            ">;)",
            "Ljy3<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBv0;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    invoke-virtual {p1}, LAx0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getDouble(Ljava/lang/String;)Ljy3;

    move-result-object p1

    return-object p1
.end method

.method public final w(LAx0;)Ljy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAx0<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljy3<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBv0;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    invoke-virtual {p1}, LAx0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getLong(Ljava/lang/String;)Ljy3;

    move-result-object p1

    return-object p1
.end method

.method public final x(LAx0;)Ljy3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAx0<",
            "Ljava/lang/String;",
            ">;)",
            "Ljy3<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LBv0;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    invoke-virtual {p1}, LAx0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getString(Ljava/lang/String;)Ljy3;

    move-result-object p1

    return-object p1
.end method

.method public y()J
    .locals 5

    invoke-static {}, Lrx0;->e()Lrx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->p(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->w(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lrx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->k(Ljava/lang/String;J)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {p0, v0}, LBv0;->d(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-virtual {v0}, Lrx0;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public z()J
    .locals 5

    invoke-static {}, Lsx0;->e()Lsx0;

    move-result-object v0

    invoke-virtual {p0, v0}, LBv0;->p(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0, v0}, LBv0;->w(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LBv0;->c:Li21;

    invoke-virtual {v0}, Lsx0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Li21;->k(Ljava/lang/String;J)Z

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {p0, v0}, LBv0;->d(LAx0;)Ljy3;

    move-result-object v1

    invoke-virtual {v1}, Ljy3;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LBv0;->J(J)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljy3;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-virtual {v0}, Lsx0;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method
