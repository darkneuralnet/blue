.class public Lga6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnl$b;


# static fields
.field public static final s:Lad;

.field public static final t:Lga6;


# instance fields
.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "LdQ3;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public e:LAm1;

.field public f:Lxn1;

.field public g:LSm1;

.field public h:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "LU96;",
            ">;"
        }
    .end annotation
.end field

.field public i:LYr1;

.field public j:Ljava/util/concurrent/ExecutorService;

.field public k:Landroid/content/Context;

.field public l:LBv0;

.field public m:Lln4;

.field public n:Lnl;

.field public o:Ldm$b;

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public r:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lad;->e()Lad;

    move-result-object v0

    sput-object v0, Lga6;->s:Lad;

    new-instance v0, Lga6;

    invoke-direct {v0}, Lga6;-><init>()V

    sput-object v0, Lga6;->t:Lga6;

    return-void
.end method

.method private constructor <init>()V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lga6;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lga6;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean v1, p0, Lga6;->r:Z

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-wide/16 v5, 0xa

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lga6;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lga6;->b:Ljava/util/Map;

    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "KEY_AVAILABLE_TRACES_FOR_CACHING"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "KEY_AVAILABLE_GAUGES_FOR_CACHING"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(Lga6;LgB1;Lim;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lga6;->y(LgB1;Lim;)V

    return-void
.end method

.method public static synthetic b(Lga6;)V
    .locals 0

    invoke-virtual {p0}, Lga6;->E()V

    return-void
.end method

.method public static synthetic c(Lga6;LdQ3;)V
    .locals 0

    invoke-direct {p0, p1}, Lga6;->v(LdQ3;)V

    return-void
.end method

.method public static synthetic d(Lga6;)V
    .locals 0

    invoke-direct {p0}, Lga6;->z()V

    return-void
.end method

.method public static synthetic e(Lga6;LL73;Lim;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lga6;->x(LL73;Lim;)V

    return-void
.end method

.method public static synthetic f(Lga6;Lg66;Lim;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lga6;->w(Lg66;Lim;)V

    return-void
.end method

.method public static k()Lga6;
    .locals 1

    sget-object v0, Lga6;->t:Lga6;

    return-object v0
.end method

.method public static l(LgB1;)Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, LgB1;->g0()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, LgB1;->d0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0}, LgB1;->c0()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v2, 0x2

    aput-object p0, v1, v2

    const-string p0, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)"

    invoke-static {v0, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static m(LL73;)Ljava/lang/String;
    .locals 7

    invoke-virtual {p0}, LL73;->D0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LL73;->u0()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-virtual {p0}, LL73;->z0()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, LL73;->o0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    const-string v2, "UNKNOWN"

    :goto_1
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p0}, LL73;->w0()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v4, v5

    const/4 p0, 0x1

    aput-object v2, v4, p0

    new-instance p0, Ljava/text/DecimalFormat;

    const-string v2, "#.####"

    invoke-direct {p0, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    long-to-double v0, v0

    const-wide v5, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v5

    invoke-virtual {p0, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x2

    aput-object p0, v4, v0

    const-string p0, "network request trace: %s (responseCode: %s, responseTime: %sms)"

    invoke-static {v3, p0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static n(LlQ3;)Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, LlQ3;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LlQ3;->l()Lg66;

    move-result-object p0

    invoke-static {p0}, Lga6;->o(Lg66;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, LlQ3;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, LlQ3;->e()LL73;

    move-result-object p0

    invoke-static {p0}, Lga6;->m(LL73;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {p0}, LlQ3;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, LlQ3;->g()LgB1;

    move-result-object p0

    invoke-static {p0}, Lga6;->l(LgB1;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-string p0, "log"

    return-object p0
.end method

.method public static o(Lg66;)Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lg66;->p0()J

    move-result-wide v0

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p0}, Lg66;->s0()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v3, v4

    new-instance p0, Ljava/text/DecimalFormat;

    const-string v4, "#.####"

    invoke-direct {p0, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    long-to-double v0, v0

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v4

    invoke-virtual {p0, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    aput-object p0, v3, v0

    const-string p0, "trace metric: %s (duration: %sms)"

    invoke-static {v2, p0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static p(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :catch_0
    :goto_0
    return-object v0
.end method

.method private synthetic v(LdQ3;)V
    .locals 1

    iget-object v0, p1, LdQ3;->a:LkQ3$b;

    iget-object p1, p1, LdQ3;->b:Lim;

    invoke-virtual {p0, v0, p1}, Lga6;->F(LkQ3$b;Lim;)V

    return-void
.end method

.method private synthetic w(Lg66;Lim;)V
    .locals 1

    invoke-static {}, LkQ3;->a0()LkQ3$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LkQ3$b;->P(Lg66;)LkQ3$b;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lga6;->F(LkQ3$b;Lim;)V

    return-void
.end method

.method private synthetic x(LL73;Lim;)V
    .locals 1

    invoke-static {}, LkQ3;->a0()LkQ3$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LkQ3$b;->O(LL73;)LkQ3$b;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lga6;->F(LkQ3$b;Lim;)V

    return-void
.end method

.method private synthetic y(LgB1;Lim;)V
    .locals 1

    invoke-static {}, LkQ3;->a0()LkQ3$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LkQ3$b;->N(LgB1;)LkQ3$b;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lga6;->F(LkQ3$b;Lim;)V

    return-void
.end method

.method private synthetic z()V
    .locals 2

    iget-object v0, p0, Lga6;->m:Lln4;

    iget-boolean v1, p0, Lga6;->r:Z

    invoke-virtual {v0, v1}, Lln4;->a(Z)V

    return-void
.end method


# virtual methods
.method public A(LgB1;Lim;)V
    .locals 2

    iget-object v0, p0, Lga6;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lea6;

    invoke-direct {v1, p0, p1, p2}, Lea6;-><init>(Lga6;LgB1;Lim;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public B(LL73;Lim;)V
    .locals 2

    iget-object v0, p0, Lga6;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lca6;

    invoke-direct {v1, p0, p1, p2}, Lca6;-><init>(Lga6;LL73;Lim;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public C(Lg66;Lim;)V
    .locals 2

    iget-object v0, p0, Lga6;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Laa6;

    invoke-direct {v1, p0, p1, p2}, Laa6;-><init>(Lga6;Lg66;Lim;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final D(LkQ3$b;Lim;)LkQ3;
    .locals 1

    invoke-virtual {p0}, Lga6;->G()V

    iget-object v0, p0, Lga6;->o:Ldm$b;

    invoke-virtual {v0, p2}, Ldm$b;->Q(Lim;)Ldm$b;

    move-result-object p2

    invoke-virtual {p1}, LkQ3$b;->k()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LkQ3$b;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/r$a;->z()Lcom/google/protobuf/r$a;

    move-result-object p2

    check-cast p2, Ldm$b;

    invoke-virtual {p0}, Lga6;->j()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2, v0}, Ldm$b;->N(Ljava/util/Map;)Ldm$b;

    move-result-object p2

    :cond_1
    invoke-virtual {p1, p2}, LkQ3$b;->M(Ldm$b;)LkQ3$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/r$a;->w()Lcom/google/protobuf/r;

    move-result-object p1

    check-cast p1, LkQ3;

    return-object p1
.end method

.method public final E()V
    .locals 9

    iget-object v0, p0, Lga6;->e:LAm1;

    invoke-virtual {v0}, LAm1;->j()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lga6;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lga6;->p:Ljava/lang/String;

    invoke-static {}, LBv0;->g()LBv0;

    move-result-object v0

    iput-object v0, p0, Lga6;->l:LBv0;

    new-instance v0, Lln4;

    iget-object v1, p0, Lga6;->k:Landroid/content/Context;

    new-instance v8, Lkn4;

    const-wide/16 v3, 0x64

    const-wide/16 v5, 0x1

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lkn4;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    const-wide/16 v2, 0x1f4

    invoke-direct {v0, v1, v8, v2, v3}, Lln4;-><init>(Landroid/content/Context;Lkn4;J)V

    iput-object v0, p0, Lga6;->m:Lln4;

    invoke-static {}, Lnl;->b()Lnl;

    move-result-object v0

    iput-object v0, p0, Lga6;->n:Lnl;

    new-instance v0, LYr1;

    iget-object v1, p0, Lga6;->h:LX94;

    iget-object v2, p0, Lga6;->l:LBv0;

    invoke-virtual {v2}, LBv0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LYr1;-><init>(LX94;Ljava/lang/String;)V

    iput-object v0, p0, Lga6;->i:LYr1;

    invoke-virtual {p0}, Lga6;->h()V

    return-void
.end method

.method public final F(LkQ3$b;Lim;)V
    .locals 4

    invoke-virtual {p0}, Lga6;->u()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lga6;->s(LlQ3;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lga6;->s:Lad;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Lga6;->n(LlQ3;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "Transport is not initialized yet, %s will be queued for to be dispatched later"

    invoke-virtual {v0, v2, v1}, Lad;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lga6;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, LdQ3;

    invoke-direct {v1, p1, p2}, LdQ3;-><init>(LkQ3$b;Lim;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0, p1, p2}, Lga6;->D(LkQ3$b;Lim;)LkQ3;

    move-result-object p1

    invoke-virtual {p0, p1}, Lga6;->t(LkQ3;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Lga6;->g(LkQ3;)V

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/perf/session/SessionManager;->updatePerfSessionIfExpired()Z

    :cond_2
    return-void
.end method

.method public final G()V
    .locals 6

    iget-object v0, p0, Lga6;->l:LBv0;

    invoke-virtual {v0}, LBv0;->K()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lga6;->o:Ldm$b;

    invoke-virtual {v0}, Ldm$b;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lga6;->r:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, Lga6;->g:LSm1;

    invoke-interface {v2}, LSm1;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/32 v4, 0xea60

    invoke-static {v2, v4, v5, v3}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    sget-object v3, Lga6;->s:Lad;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    const-string v0, "Task to retrieve Installation Id is timed out: %s"

    invoke-virtual {v3, v0, v1}, Lad;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v2

    sget-object v3, Lga6;->s:Lad;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    const-string v0, "Task to retrieve Installation Id is interrupted: %s"

    invoke-virtual {v3, v0, v1}, Lad;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_2
    move-exception v2

    sget-object v3, Lga6;->s:Lad;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    const-string v0, "Unable to retrieve Installation Id: %s"

    invoke-virtual {v3, v0, v1}, Lad;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lga6;->o:Ldm$b;

    invoke-virtual {v0, v2}, Ldm$b;->P(Ljava/lang/String;)Ldm$b;

    goto :goto_2

    :cond_1
    sget-object v0, Lga6;->s:Lad;

    const-string v1, "Firebase Installation Id is empty, contact Firebase Support for debugging."

    invoke-virtual {v0, v1}, Lad;->j(Ljava/lang/String;)V

    :cond_2
    :goto_2
    return-void
.end method

.method public final H()V
    .locals 1

    iget-object v0, p0, Lga6;->f:Lxn1;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lga6;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lxn1;->c()Lxn1;

    move-result-object v0

    iput-object v0, p0, Lga6;->f:Lxn1;

    :cond_0
    return-void
.end method

.method public final g(LkQ3;)V
    .locals 5

    invoke-virtual {p1}, LkQ3;->k()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    sget-object v0, Lga6;->s:Lad;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Lga6;->n(LlQ3;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-virtual {p1}, LkQ3;->l()Lg66;

    move-result-object v1

    invoke-virtual {p0, v1}, Lga6;->i(Lg66;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v2

    const-string v1, "Logging %s. In a minute, visit the Firebase console to view your data: %s"

    invoke-virtual {v0, v1, v3}, Lad;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lga6;->s:Lad;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Lga6;->n(LlQ3;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    const-string v1, "Logging %s"

    invoke-virtual {v0, v1, v2}, Lad;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lga6;->i:LYr1;

    invoke-virtual {v0, p1}, LYr1;->b(LkQ3;)V

    return-void
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Lga6;->n:Lnl;

    new-instance v1, Ljava/lang/ref/WeakReference;

    sget-object v2, Lga6;->t:Lga6;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lnl;->k(Ljava/lang/ref/WeakReference;)V

    invoke-static {}, Ldm;->h0()Ldm$b;

    move-result-object v0

    iput-object v0, p0, Lga6;->o:Ldm$b;

    iget-object v1, p0, Lga6;->e:LAm1;

    invoke-virtual {v1}, LAm1;->m()Lpn1;

    move-result-object v1

    invoke-virtual {v1}, Lpn1;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldm$b;->S(Ljava/lang/String;)Ldm$b;

    move-result-object v0

    invoke-static {}, Lmb;->a0()Lmb$b;

    move-result-object v1

    iget-object v2, p0, Lga6;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lmb$b;->M(Ljava/lang/String;)Lmb$b;

    move-result-object v1

    sget-object v2, LU30;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lmb$b;->N(Ljava/lang/String;)Lmb$b;

    move-result-object v1

    iget-object v2, p0, Lga6;->k:Landroid/content/Context;

    invoke-static {v2}, Lga6;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lmb$b;->O(Ljava/lang/String;)Lmb$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldm$b;->O(Lmb$b;)Ldm$b;

    iget-object v0, p0, Lga6;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lga6;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lga6;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LdQ3;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lga6;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lfa6;

    invoke-direct {v2, p0, v0}, Lfa6;-><init>(Lga6;LdQ3;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final i(Lg66;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lg66;->s0()Ljava/lang/String;

    move-result-object p1

    const-string v0, "_st_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lga6;->q:Ljava/lang/String;

    iget-object v1, p0, Lga6;->p:Ljava/lang/String;

    invoke-static {v0, v1, p1}, LNy0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lga6;->q:Ljava/lang/String;

    iget-object v1, p0, Lga6;->p:Ljava/lang/String;

    invoke-static {v0, v1, p1}, LNy0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final j()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lga6;->H()V

    iget-object v0, p0, Lga6;->f:Lxn1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lxn1;->b()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public onUpdateAppState(Lim;)V
    .locals 1

    sget-object v0, Lim;->d:Lim;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lga6;->r:Z

    invoke-virtual {p0}, Lga6;->u()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lga6;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lda6;

    invoke-direct {v0, p0}, Lda6;-><init>(Lga6;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final q(LkQ3;)V
    .locals 3

    invoke-virtual {p1}, LkQ3;->k()Z

    move-result v0

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lga6;->n:Lnl;

    sget-object v0, LSy0;->c:LSy0;

    invoke-virtual {v0}, LSy0;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1, v2}, Lnl;->d(Ljava/lang/String;J)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LkQ3;->j()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lga6;->n:Lnl;

    sget-object v0, LSy0;->d:LSy0;

    invoke-virtual {v0}, LSy0;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1, v2}, Lnl;->d(Ljava/lang/String;J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public r(LAm1;LSm1;LX94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAm1;",
            "LSm1;",
            "LX94<",
            "LU96;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lga6;->e:LAm1;

    invoke-virtual {p1}, LAm1;->m()Lpn1;

    move-result-object p1

    invoke-virtual {p1}, Lpn1;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lga6;->q:Ljava/lang/String;

    iput-object p2, p0, Lga6;->g:LSm1;

    iput-object p3, p0, Lga6;->h:LX94;

    iget-object p1, p0, Lga6;->j:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lba6;

    invoke-direct {p2, p0}, Lba6;-><init>(Lga6;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final s(LlQ3;)Z
    .locals 8

    iget-object v0, p0, Lga6;->b:Ljava/util/Map;

    const-string v1, "KEY_AVAILABLE_TRACES_FOR_CACHING"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lga6;->b:Ljava/util/Map;

    const-string v3, "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v4, p0, Lga6;->b:Ljava/util/Map;

    const-string v5, "KEY_AVAILABLE_GAUGES_FOR_CACHING"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {p1}, LlQ3;->k()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_0

    if-lez v0, :cond_0

    iget-object p1, p0, Lga6;->b:Ljava/util/Map;

    sub-int/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v7

    :cond_0
    invoke-interface {p1}, LlQ3;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    if-lez v2, :cond_1

    iget-object p1, p0, Lga6;->b:Ljava/util/Map;

    sub-int/2addr v2, v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v7

    :cond_1
    invoke-interface {p1}, LlQ3;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    if-lez v4, :cond_2

    iget-object p1, p0, Lga6;->b:Ljava/util/Map;

    sub-int/2addr v4, v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v7

    :cond_2
    sget-object v1, Lga6;->s:Lad;

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Lga6;->n(LlQ3;)Ljava/lang/String;

    move-result-object p1

    const/4 v5, 0x0

    aput-object p1, v3, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v7

    const/4 p1, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, p1

    const/4 p1, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, p1

    const-string p1, "%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d)."

    invoke-virtual {v1, p1, v3}, Lad;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return v5
.end method

.method public final t(LkQ3;)Z
    .locals 3

    iget-object v0, p0, Lga6;->l:LBv0;

    invoke-virtual {v0}, LBv0;->K()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lga6;->s:Lad;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lga6;->n(LlQ3;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Performance collection is not enabled, dropping %s"

    invoke-virtual {v0, p1, v1}, Lad;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_0
    invoke-virtual {p1}, LkQ3;->Y()Ldm;

    move-result-object v0

    invoke-virtual {v0}, Ldm;->d0()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lga6;->s:Lad;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lga6;->n(LlQ3;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "App Instance ID is null or empty, dropping %s"

    invoke-virtual {v0, p1, v1}, Lad;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_1
    iget-object v0, p0, Lga6;->k:Landroid/content/Context;

    invoke-static {p1, v0}, LmQ3;->b(LkQ3;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lga6;->s:Lad;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lga6;->n(LlQ3;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values."

    invoke-virtual {v0, p1, v1}, Lad;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_2
    iget-object v0, p0, Lga6;->m:Lln4;

    invoke-virtual {v0, p1}, Lln4;->h(LkQ3;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1}, Lga6;->q(LkQ3;)V

    sget-object v0, Lga6;->s:Lad;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lga6;->n(LlQ3;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Event dropped due to device sampling - %s"

    invoke-virtual {v0, p1, v1}, Lad;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_3
    iget-object v0, p0, Lga6;->m:Lln4;

    invoke-virtual {v0, p1}, Lln4;->g(LkQ3;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p1}, Lga6;->q(LkQ3;)V

    sget-object v0, Lga6;->s:Lad;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lga6;->n(LlQ3;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Rate limited (per device) - %s"

    invoke-virtual {v0, p1, v1}, Lad;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_4
    return v1
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, Lga6;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
