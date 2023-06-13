.class public final Ly88;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile j:Ly88;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/google/android/gms/common/util/Clock;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public final d:Lgj;

.field public final e:Ljava/util/List;

.field public f:I

.field public g:Z

.field public final h:Ljava/lang/String;

.field public volatile i:LnR7;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    invoke-virtual {p0, p3, p4}, Ly88;->n(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p2, p0, Ly88;->a:Ljava/lang/String;

    goto :goto_1

    :cond_1
    :goto_0
    const-string p2, "FA"

    iput-object p2, p0, Ly88;->a:Ljava/lang/String;

    :goto_1
    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object p2

    iput-object p2, p0, Ly88;->b:Lcom/google/android/gms/common/util/Clock;

    invoke-static {}, LFO7;->a()LNN7;

    new-instance v7, La18;

    invoke-direct {v7, p0}, La18;-><init>(Ly88;)V

    new-instance p2, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x3c

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move-object v0, p2

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    invoke-static {p2}, Ljava/util/concurrent/Executors;->unconfigurableExecutorService(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    iput-object p2, p0, Ly88;->c:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lgj;

    invoke-direct {p2, p0}, Lgj;-><init>(Ly88;)V

    iput-object p2, p0, Ly88;->d:Lgj;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ly88;->e:Ljava/util/List;

    :try_start_0
    invoke-static {p1}, Lbl8;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "google_app_id"

    invoke-static {p1, v1, p2}, LjE8;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Ly88;->j()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Ly88;->h:Ljava/lang/String;

    iput-boolean v0, p0, Ly88;->g:Z

    iget-object p1, p0, Ly88;->a:Ljava/lang/String;

    const-string p2, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :catch_0
    :cond_3
    :goto_2
    invoke-virtual {p0, p3, p4}, Ly88;->n(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_7

    const-string p2, "fa"

    iput-object p2, p0, Ly88;->h:Ljava/lang/String;

    if-eqz p3, :cond_4

    if-eqz p4, :cond_4

    iget-object p2, p0, Ly88;->a:Ljava/lang/String;

    const-string v0, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics"

    invoke-static {p2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_4
    const/4 p2, 0x0

    if-nez p3, :cond_5

    move v1, v0

    goto :goto_3

    :cond_5
    move v1, p2

    :goto_3
    if-nez p4, :cond_6

    goto :goto_4

    :cond_6
    move v0, p2

    :goto_4
    xor-int p2, v1, v0

    if-eqz p2, :cond_8

    iget-object p2, p0, Ly88;->a:Ljava/lang/String;

    const-string v0, "Specified origin or custom app id is null. Both parameters will be ignored."

    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_7
    iput-object p3, p0, Ly88;->h:Ljava/lang/String;

    :cond_8
    :goto_5
    new-instance p2, LXW7;

    move-object v1, p2

    move-object v2, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p1

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LXW7;-><init>(Ly88;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-virtual {p0, p2}, Ly88;->m(Lp48;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    if-nez p1, :cond_9

    iget-object p1, p0, Ly88;->a:Ljava/lang/String;

    const-string p2, "Unable to register lifecycle notifications. Application null."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_9
    new-instance p2, Lj88;

    invoke-direct {p2, p0}, Lj88;-><init>(Ly88;)V

    invoke-virtual {p1, p2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public static bridge synthetic B(Ly88;LnR7;)V
    .locals 0

    iput-object p1, p0, Ly88;->i:LnR7;

    return-void
.end method

.method public static bridge synthetic C(Ly88;Ljava/lang/Exception;ZZ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ly88;->k(Ljava/lang/Exception;ZZ)V

    return-void
.end method

.method public static bridge synthetic D(Ly88;Lp48;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly88;->m(Lp48;)V

    return-void
.end method

.method public static bridge synthetic h(Ly88;)Z
    .locals 0

    iget-boolean p0, p0, Ly88;->g:Z

    return p0
.end method

.method public static bridge synthetic i(Ly88;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Ly88;->n(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic r(Ly88;)LnR7;
    .locals 0

    iget-object p0, p0, Ly88;->i:LnR7;

    return-object p0
.end method

.method public static t(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ly88;
    .locals 8

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ly88;->j:Ly88;

    if-nez v0, :cond_1

    const-class v0, Ly88;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ly88;->j:Ly88;

    if-nez v1, :cond_0

    new-instance v1, Ly88;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Ly88;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    sput-object v1, Ly88;->j:Ly88;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Ly88;->j:Ly88;

    return-object p0
.end method

.method public static bridge synthetic u(Ly88;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ly88;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final A(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 8

    new-instance v6, LjP7;

    invoke-direct {v6}, LjP7;-><init>()V

    new-instance v7, Lj08;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lj08;-><init>(Ly88;Ljava/lang/String;Ljava/lang/String;ZLjP7;)V

    invoke-virtual {p0, v7}, Ly88;->m(Lp48;)V

    const-wide/16 p1, 0x1388

    invoke-virtual {v6, p1, p2}, LjP7;->d5(J)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/os/BaseBundle;->size()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    new-instance p2, Ljava/util/HashMap;

    invoke-virtual {p1}, Landroid/os/BaseBundle;->size()I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/HashMap;-><init>(I)V

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_2

    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_2

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1

    :cond_2
    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-object p2

    :cond_4
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final E(Ljava/lang/String;)V
    .locals 1

    new-instance v0, LmX7;

    invoke-direct {v0, p0, p1}, LmX7;-><init>(Ly88;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ly88;->m(Lp48;)V

    return-void
.end method

.method public final F(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, LDU7;

    invoke-direct {v0, p0, p1, p2, p3}, LDU7;-><init>(Ly88;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Ly88;->m(Lp48;)V

    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 1

    new-instance v0, LBX7;

    invoke-direct {v0, p0, p1}, LBX7;-><init>(Ly88;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ly88;->m(Lp48;)V

    return-void
.end method

.method public final H(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v6}, Ly88;->l(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V

    return-void
.end method

.method public final I(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v6}, Ly88;->l(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V

    return-void
.end method

.method public final a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    new-instance p1, Ly08;

    const/4 v2, 0x0

    const/4 v3, 0x5

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v7}, Ly08;-><init>(Ly88;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ly88;->m(Lp48;)V

    return-void
.end method

.method public final b(Lfv8;)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ly88;->e:Ljava/util/List;

    monitor-enter v0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    iget-object v2, p0, Ly88;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Ly88;->e:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Ly88;->a:Ljava/lang/String;

    const-string v1, "OnEventListener already registered."

    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit v0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, LU48;

    invoke-direct {v1, p1}, LU48;-><init>(Lfv8;)V

    iget-object v2, p0, Ly88;->e:Ljava/util/List;

    new-instance v3, Landroid/util/Pair;

    invoke-direct {v3, p1, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ly88;->i:LnR7;

    if-eqz p1, :cond_2

    :try_start_1
    iget-object p1, p0, Ly88;->i:LnR7;

    invoke-interface {p1, v1}, LnR7;->registerOnMeasurementEventListener(LbT7;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/NetworkOnMainThreadException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    iget-object p1, p0, Ly88;->a:Ljava/lang/String;

    const-string v0, "Failed to register event listener on calling thread. Trying again on the dynamite thread."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    new-instance p1, Ll38;

    invoke-direct {p1, p0, v1}, Ll38;-><init>(Ly88;LU48;)V

    invoke-virtual {p0, p1}, Ly88;->m(Lp48;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final c(Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, LrU7;

    invoke-direct {v0, p0, p1}, LrU7;-><init>(Ly88;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Ly88;->m(Lp48;)V

    return-void
.end method

.method public final d(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, LtV7;

    invoke-direct {v0, p0, p1, p2, p3}, LtV7;-><init>(Ly88;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ly88;->m(Lp48;)V

    return-void
.end method

.method public final e(Z)V
    .locals 1

    new-instance v0, Lu28;

    invoke-direct {v0, p0, p1}, Lu28;-><init>(Ly88;Z)V

    invoke-virtual {p0, v0}, Ly88;->m(Lp48;)V

    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 1

    new-instance v0, LfV7;

    invoke-direct {v0, p0, p1}, LfV7;-><init>(Ly88;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ly88;->m(Lp48;)V

    return-void
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 7

    new-instance v6, Lb48;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lb48;-><init>(Ly88;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    invoke-virtual {p0, v6}, Ly88;->m(Lp48;)V

    return-void
.end method

.method public final j()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.google.firebase.analytics.FirebaseAnalytics"

    const-class v2, Ly88;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :catch_0
    return v0
.end method

.method public final k(Ljava/lang/Exception;ZZ)V
    .locals 6

    iget-boolean v0, p0, Ly88;->g:Z

    or-int/2addr v0, p2

    iput-boolean v0, p0, Ly88;->g:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Ly88;->a:Ljava/lang/String;

    const-string p3, "Data collection startup failed. No data will be collected."

    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_0
    const-string p2, "Error with data collection. Data lost."

    if-eqz p3, :cond_1

    const/4 v1, 0x5

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, Ly88;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    iget-object p3, p0, Ly88;->a:Ljava/lang/String;

    invoke-static {p3, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V
    .locals 9

    new-instance v8, LM38;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p6

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, LM38;-><init>(Ly88;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZ)V

    invoke-virtual {p0, v8}, Ly88;->m(Lp48;)V

    return-void
.end method

.method public final m(Lp48;)V
    .locals 1

    iget-object v0, p0, Ly88;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ly88;->j()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final o(Ljava/lang/String;)I
    .locals 3

    new-instance v0, LjP7;

    invoke-direct {v0}, LjP7;-><init>()V

    new-instance v1, Lp18;

    invoke-direct {v1, p0, p1, v0}, Lp18;-><init>(Ly88;Ljava/lang/String;LjP7;)V

    invoke-virtual {p0, v1}, Ly88;->m(Lp48;)V

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v1, v2}, LjP7;->d5(J)Landroid/os/Bundle;

    move-result-object p1

    const-class v0, Ljava/lang/Integer;

    invoke-static {p1, v0}, LjP7;->g5(Landroid/os/Bundle;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/16 p1, 0x19

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final p()J
    .locals 5

    new-instance v0, LjP7;

    invoke-direct {v0}, LjP7;-><init>()V

    new-instance v1, LsZ7;

    invoke-direct {v1, p0, v0}, LsZ7;-><init>(Ly88;LjP7;)V

    invoke-virtual {p0, v1}, Ly88;->m(Lp48;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, LjP7;->e5(J)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-object v3, p0, Ly88;->b:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v3

    xor-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v0

    iget v2, p0, Ly88;->f:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ly88;->f:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final q()Lgj;
    .locals 1

    iget-object v0, p0, Ly88;->d:Lgj;

    return-object v0
.end method

.method public final s(Landroid/content/Context;Z)LnR7;
    .locals 1

    :try_start_0
    sget-object p2, Lcom/google/android/gms/dynamite/DynamiteModule;->e:Lcom/google/android/gms/dynamite/DynamiteModule$a;

    const-string v0, "com.google.android.gms.measurement.dynamite"

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$a;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p1

    const-string p2, "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, LYQ7;->asInterface(Landroid/os/IBinder;)LnR7;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Ly88;->k(Ljava/lang/Exception;ZZ)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final v()Ljava/lang/String;
    .locals 3

    new-instance v0, LjP7;

    invoke-direct {v0}, LjP7;-><init>()V

    new-instance v1, LeZ7;

    invoke-direct {v1, p0, v0}, LeZ7;-><init>(Ly88;LjP7;)V

    invoke-virtual {p0, v1}, Ly88;->m(Lp48;)V

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, LjP7;->f5(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w()Ljava/lang/String;
    .locals 3

    new-instance v0, LjP7;

    invoke-direct {v0}, LjP7;-><init>()V

    new-instance v1, LUZ7;

    invoke-direct {v1, p0, v0}, LUZ7;-><init>(Ly88;LjP7;)V

    invoke-virtual {p0, v1}, Ly88;->m(Lp48;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, LjP7;->f5(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x()Ljava/lang/String;
    .locals 3

    new-instance v0, LjP7;

    invoke-direct {v0}, LjP7;-><init>()V

    new-instance v1, LGZ7;

    invoke-direct {v1, p0, v0}, LGZ7;-><init>(Ly88;LjP7;)V

    invoke-virtual {p0, v1}, Ly88;->m(Lp48;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, LjP7;->f5(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y()Ljava/lang/String;
    .locals 3

    new-instance v0, LjP7;

    invoke-direct {v0}, LjP7;-><init>()V

    new-instance v1, LPY7;

    invoke-direct {v1, p0, v0}, LPY7;-><init>(Ly88;LjP7;)V

    invoke-virtual {p0, v1}, Ly88;->m(Lp48;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, LjP7;->f5(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    new-instance v0, LjP7;

    invoke-direct {v0}, LjP7;-><init>()V

    new-instance v1, LRU7;

    invoke-direct {v1, p0, p1, p2, v0}, LRU7;-><init>(Ly88;Ljava/lang/String;Ljava/lang/String;LjP7;)V

    invoke-virtual {p0, v1}, Ly88;->m(Lp48;)V

    const-wide/16 p1, 0x1388

    invoke-virtual {v0, p1, p2}, LjP7;->d5(J)Landroid/os/Bundle;

    move-result-object p1

    const-class p2, Ljava/util/List;

    invoke-static {p1, p2}, LjP7;->g5(Landroid/os/Bundle;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    return-object p1
.end method
