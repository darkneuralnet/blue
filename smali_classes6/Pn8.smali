.class public final LPn8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQs8;


# static fields
.field public static volatile H:LPn8;


# instance fields
.field public volatile A:Ljava/lang/Boolean;

.field public B:Ljava/lang/Boolean;
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field public C:Ljava/lang/Boolean;
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field public volatile D:Z

.field public E:I

.field public final F:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final G:J
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:LFg7;

.field public final g:Lgl7;

.field public final h:LIh8;

.field public final i:LFc8;

.field public final j:Ldn8;

.field public final k:LcR8;

.field public final l:LOW8;

.field public final m:Lqb8;

.field public final n:Lcom/google/android/gms/common/util/Clock;

.field public final o:LnG8;

.field public final p:LRC8;

.field public final q:LaY7;

.field public final r:LND8;

.field public final s:Ljava/lang/String;

.field public t:LOa8;

.field public u:LQM8;

.field public v:LJt7;

.field public w:Lla8;

.field public x:Z

.field public y:Ljava/lang/Boolean;

.field public z:J


# direct methods
.method public constructor <init>(LGv8;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LPn8;->x:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, LPn8;->F:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, LGv8;->a:Landroid/content/Context;

    new-instance v2, LFg7;

    invoke-direct {v2, v1}, LFg7;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, LPn8;->f:LFg7;

    sput-object v2, Lg88;->a:LFg7;

    iput-object v1, p0, LPn8;->a:Landroid/content/Context;

    iget-object v2, p1, LGv8;->b:Ljava/lang/String;

    iput-object v2, p0, LPn8;->b:Ljava/lang/String;

    iget-object v2, p1, LGv8;->c:Ljava/lang/String;

    iput-object v2, p0, LPn8;->c:Ljava/lang/String;

    iget-object v2, p1, LGv8;->d:Ljava/lang/String;

    iput-object v2, p0, LPn8;->d:Ljava/lang/String;

    iget-boolean v2, p1, LGv8;->h:Z

    iput-boolean v2, p0, LPn8;->e:Z

    iget-object v2, p1, LGv8;->e:Ljava/lang/Boolean;

    iput-object v2, p0, LPn8;->A:Ljava/lang/Boolean;

    iget-object v2, p1, LGv8;->j:Ljava/lang/String;

    iput-object v2, p0, LPn8;->s:Ljava/lang/String;

    const/4 v2, 0x1

    iput-boolean v2, p0, LPn8;->D:Z

    iget-object v3, p1, LGv8;->g:Lcom/google/android/gms/internal/measurement/zzcl;

    if-eqz v3, :cond_1

    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzcl;->h:Landroid/os/Bundle;

    if-eqz v4, :cond_1

    const-string v5, "measurementEnabled"

    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/Boolean;

    if-eqz v5, :cond_0

    check-cast v4, Ljava/lang/Boolean;

    iput-object v4, p0, LPn8;->B:Ljava/lang/Boolean;

    :cond_0
    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzcl;->h:Landroid/os/Bundle;

    const-string v4, "measurementDeactivated"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/Boolean;

    iput-object v3, p0, LPn8;->C:Ljava/lang/Boolean;

    :cond_1
    invoke-static {v1}, LlB8;->d(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/common/util/DefaultClock;->getInstance()Lcom/google/android/gms/common/util/Clock;

    move-result-object v3

    iput-object v3, p0, LPn8;->n:Lcom/google/android/gms/common/util/Clock;

    iget-object v4, p1, LGv8;->i:Ljava/lang/Long;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v3

    :goto_0
    iput-wide v3, p0, LPn8;->G:J

    new-instance v3, Lgl7;

    invoke-direct {v3, p0}, Lgl7;-><init>(LPn8;)V

    iput-object v3, p0, LPn8;->g:Lgl7;

    new-instance v3, LIh8;

    invoke-direct {v3, p0}, LIh8;-><init>(LPn8;)V

    invoke-virtual {v3}, LBs8;->i()V

    iput-object v3, p0, LPn8;->h:LIh8;

    new-instance v3, LFc8;

    invoke-direct {v3, p0}, LFc8;-><init>(LPn8;)V

    invoke-virtual {v3}, LBs8;->i()V

    iput-object v3, p0, LPn8;->i:LFc8;

    new-instance v3, LOW8;

    invoke-direct {v3, p0}, LOW8;-><init>(LPn8;)V

    invoke-virtual {v3}, LBs8;->i()V

    iput-object v3, p0, LPn8;->l:LOW8;

    new-instance v3, Lsv8;

    invoke-direct {v3, p1, p0}, Lsv8;-><init>(LGv8;LPn8;)V

    new-instance v4, Lqb8;

    invoke-direct {v4, v3}, Lqb8;-><init>(Lcb8;)V

    iput-object v4, p0, LPn8;->m:Lqb8;

    new-instance v3, LaY7;

    invoke-direct {v3, p0}, LaY7;-><init>(LPn8;)V

    iput-object v3, p0, LPn8;->q:LaY7;

    new-instance v3, LnG8;

    invoke-direct {v3, p0}, LnG8;-><init>(LPn8;)V

    invoke-virtual {v3}, Lwe8;->g()V

    iput-object v3, p0, LPn8;->o:LnG8;

    new-instance v3, LRC8;

    invoke-direct {v3, p0}, LRC8;-><init>(LPn8;)V

    invoke-virtual {v3}, Lwe8;->g()V

    iput-object v3, p0, LPn8;->p:LRC8;

    new-instance v3, LcR8;

    invoke-direct {v3, p0}, LcR8;-><init>(LPn8;)V

    invoke-virtual {v3}, Lwe8;->g()V

    iput-object v3, p0, LPn8;->k:LcR8;

    new-instance v3, LND8;

    invoke-direct {v3, p0}, LND8;-><init>(LPn8;)V

    invoke-virtual {v3}, LBs8;->i()V

    iput-object v3, p0, LPn8;->r:LND8;

    new-instance v3, Ldn8;

    invoke-direct {v3, p0}, Ldn8;-><init>(LPn8;)V

    invoke-virtual {v3}, LBs8;->i()V

    iput-object v3, p0, LPn8;->j:Ldn8;

    iget-object v4, p1, LGv8;->g:Lcom/google/android/gms/internal/measurement/zzcl;

    if-eqz v4, :cond_3

    iget-wide v4, v4, Lcom/google/android/gms/internal/measurement/zzcl;->c:J

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    move v0, v2

    :goto_1
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, LPn8;->I()LRC8;

    move-result-object v1

    iget-object v2, v1, Lns8;->a:LPn8;

    iget-object v2, v2, LPn8;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Landroid/app/Application;

    if-eqz v2, :cond_6

    iget-object v2, v1, Lns8;->a:LPn8;

    iget-object v2, v2, LPn8;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    check-cast v2, Landroid/app/Application;

    iget-object v4, v1, LRC8;->c:LGC8;

    if-nez v4, :cond_4

    new-instance v4, LGC8;

    invoke-direct {v4, v1}, LGC8;-><init>(LRC8;)V

    iput-object v4, v1, LRC8;->c:LGC8;

    :cond_4
    if-eqz v0, :cond_6

    iget-object v0, v1, LRC8;->c:LGC8;

    invoke-virtual {v2, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, v1, LRC8;->c:LGC8;

    invoke-virtual {v2, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, v1, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "Registered activity lifecycle callback"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object v0

    const-string v1, "Application context is not an Application"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    :cond_6
    :goto_2
    new-instance v0, LBn8;

    invoke-direct {v0, p0, p1}, LBn8;-><init>(LPn8;LGv8;)V

    invoke-virtual {v3, v0}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)LPn8;
    .locals 12

    if-eqz p1, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzcl;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzcl;->g:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcl;

    iget-wide v2, p1, Lcom/google/android/gms/internal/measurement/zzcl;->b:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/measurement/zzcl;->c:J

    iget-boolean v6, p1, Lcom/google/android/gms/internal/measurement/zzcl;->d:Z

    iget-object v7, p1, Lcom/google/android/gms/internal/measurement/zzcl;->e:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    iget-object v10, p1, Lcom/google/android/gms/internal/measurement/zzcl;->h:Landroid/os/Bundle;

    const/4 v11, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/measurement/zzcl;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LPn8;->H:LPn8;

    if-nez v0, :cond_3

    const-class v0, LPn8;

    monitor-enter v0

    :try_start_0
    sget-object v1, LPn8;->H:LPn8;

    if-nez v1, :cond_2

    new-instance v1, LGv8;

    invoke-direct {v1, p0, p1, p2}, LGv8;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)V

    new-instance p0, LPn8;

    invoke-direct {p0, v1}, LPn8;-><init>(LGv8;)V

    sput-object p0, LPn8;->H:LPn8;

    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    if-eqz p1, :cond_4

    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzcl;->h:Landroid/os/Bundle;

    if-eqz p0, :cond_4

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, LPn8;->H:LPn8;

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LPn8;->H:LPn8;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzcl;->h:Landroid/os/Bundle;

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LPn8;->A:Ljava/lang/Boolean;

    :cond_4
    :goto_0
    sget-object p0, LPn8;->H:LPn8;

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LPn8;->H:LPn8;

    return-object p0
.end method

.method public static bridge synthetic b(LPn8;LGv8;)V
    .locals 3

    invoke-virtual {p0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LPn8;->g:Lgl7;

    invoke-virtual {v0}, Lgl7;->t()Ljava/lang/String;

    new-instance v0, LJt7;

    invoke-direct {v0, p0}, LJt7;-><init>(LPn8;)V

    invoke-virtual {v0}, LBs8;->i()V

    iput-object v0, p0, LPn8;->v:LJt7;

    new-instance v0, Lla8;

    iget-wide v1, p1, LGv8;->f:J

    invoke-direct {v0, p0, v1, v2}, Lla8;-><init>(LPn8;J)V

    invoke-virtual {v0}, Lwe8;->g()V

    iput-object v0, p0, LPn8;->w:Lla8;

    new-instance p1, LOa8;

    invoke-direct {p1, p0}, LOa8;-><init>(LPn8;)V

    invoke-virtual {p1}, Lwe8;->g()V

    iput-object p1, p0, LPn8;->t:LOa8;

    new-instance p1, LQM8;

    invoke-direct {p1, p0}, LQM8;-><init>(LPn8;)V

    invoke-virtual {p1}, Lwe8;->g()V

    iput-object p1, p0, LPn8;->u:LQM8;

    iget-object p1, p0, LPn8;->l:LOW8;

    invoke-virtual {p1}, LBs8;->j()V

    iget-object p1, p0, LPn8;->h:LIh8;

    invoke-virtual {p1}, LBs8;->j()V

    iget-object p1, p0, LPn8;->w:Lla8;

    invoke-virtual {p1}, Lwe8;->h()V

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->r()Lec8;

    move-result-object p1

    iget-object v1, p0, LPn8;->g:Lgl7;

    invoke-virtual {v1}, Lgl7;->n()J

    const-wide/32 v1, 0x12cc8

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "App measurement initialized, version"

    invoke-virtual {p1, v2, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->r()Lec8;

    move-result-object p1

    const-string v1, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    invoke-virtual {p1, v1}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lla8;->p()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LPn8;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LPn8;->N()LOW8;

    move-result-object v0

    invoke-virtual {v0, p1}, LOW8;->U(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->r()Lec8;

    move-result-object p1

    const-string v0, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->r()Lec8;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lec8;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->n()Lec8;

    move-result-object p1

    const-string v0, "Debug-level message logging enabled"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    iget p1, p0, LPn8;->E:I

    iget-object v0, p0, LPn8;->F:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eq p1, v0, :cond_2

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    iget v0, p0, LPn8;->E:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, LPn8;->F:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Not all components initialized"

    invoke-virtual {p1, v2, v0, v1}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, LPn8;->x:Z

    return-void
.end method

.method public static final q()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call on client side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final r(Lns8;)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final s(Lwe8;)V
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lwe8;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Component not initialized: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final t(LBs8;)V
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LBs8;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Component not initialized: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final A()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    iget-object v0, p0, LPn8;->n:Lcom/google/android/gms/common/util/Clock;

    return-object v0
.end method

.method public final B()LOa8;
    .locals 1

    iget-object v0, p0, LPn8;->t:LOa8;

    invoke-static {v0}, LPn8;->s(Lwe8;)V

    iget-object v0, p0, LPn8;->t:LOa8;

    return-object v0
.end method

.method public final C()LFg7;
    .locals 1

    iget-object v0, p0, LPn8;->f:LFg7;

    return-object v0
.end method

.method public final D()Lqb8;
    .locals 1

    iget-object v0, p0, LPn8;->m:Lqb8;

    return-object v0
.end method

.method public final E()LFc8;
    .locals 2

    iget-object v0, p0, LPn8;->i:LFc8;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LBs8;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final F()LIh8;
    .locals 1

    iget-object v0, p0, LPn8;->h:LIh8;

    invoke-static {v0}, LPn8;->r(Lns8;)V

    iget-object v0, p0, LPn8;->h:LIh8;

    return-object v0
.end method

.method public final G()Ldn8;
    .locals 1

    iget-object v0, p0, LPn8;->j:Ldn8;

    return-object v0
.end method

.method public final I()LRC8;
    .locals 1

    iget-object v0, p0, LPn8;->p:LRC8;

    invoke-static {v0}, LPn8;->s(Lwe8;)V

    iget-object v0, p0, LPn8;->p:LRC8;

    return-object v0
.end method

.method public final J()LND8;
    .locals 1

    iget-object v0, p0, LPn8;->r:LND8;

    invoke-static {v0}, LPn8;->t(LBs8;)V

    iget-object v0, p0, LPn8;->r:LND8;

    return-object v0
.end method

.method public final K()LnG8;
    .locals 1

    iget-object v0, p0, LPn8;->o:LnG8;

    invoke-static {v0}, LPn8;->s(Lwe8;)V

    iget-object v0, p0, LPn8;->o:LnG8;

    return-object v0
.end method

.method public final L()LQM8;
    .locals 1

    iget-object v0, p0, LPn8;->u:LQM8;

    invoke-static {v0}, LPn8;->s(Lwe8;)V

    iget-object v0, p0, LPn8;->u:LQM8;

    return-object v0
.end method

.method public final M()LcR8;
    .locals 1

    iget-object v0, p0, LPn8;->k:LcR8;

    invoke-static {v0}, LPn8;->s(Lwe8;)V

    iget-object v0, p0, LPn8;->k:LcR8;

    return-object v0
.end method

.method public final N()LOW8;
    .locals 1

    iget-object v0, p0, LPn8;->l:LOW8;

    invoke-static {v0}, LPn8;->r(Lns8;)V

    iget-object v0, p0, LPn8;->l:LOW8;

    return-object v0
.end method

.method public final O()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPn8;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final P()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPn8;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final Q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPn8;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final R()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LPn8;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final a()LFc8;
    .locals 1

    iget-object v0, p0, LPn8;->i:LFc8;

    invoke-static {v0}, LPn8;->t(LBs8;)V

    iget-object v0, p0, LPn8;->i:LFc8;

    return-object v0
.end method

.method public final c()Ldn8;
    .locals 1

    iget-object v0, p0, LPn8;->j:Ldn8;

    invoke-static {v0}, LPn8;->t(LBs8;)V

    iget-object v0, p0, LPn8;->j:Ldn8;

    return-object v0
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, LPn8;->F:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final synthetic e(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    const-string p1, "timestamp"

    const-string p5, "gclid"

    const-string v0, ""

    const-string v1, "deeplink"

    const/16 v2, 0xc8

    if-eq p2, v2, :cond_0

    const/16 v2, 0xcc

    if-eq p2, v2, :cond_0

    const/16 v2, 0x130

    if-ne p2, v2, :cond_8

    move p2, v2

    :cond_0
    if-nez p3, :cond_8

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p2

    iget-object p2, p2, LIh8;->s:LVf8;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, LVf8;->a(Z)V

    if-eqz p4, :cond_7

    array-length p2, p4

    if-nez p2, :cond_1

    goto/16 :goto_2

    :cond_1
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p4}, Ljava/lang/String;-><init>([B)V

    :try_start_0
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-wide/16 v2, 0x0

    invoke-virtual {p3, p1, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->n()Lec8;

    move-result-object p1

    const-string p2, "Deferred Deep Link is empty."

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p0}, LPn8;->N()LOW8;

    move-result-object p3

    iget-object v0, p3, Lns8;->a:LPn8;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_1

    :cond_3
    iget-object p3, p3, Lns8;->a:LPn8;

    iget-object p3, p3, LPn8;->a:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p3

    new-instance v0, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-direct {v0, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/4 v4, 0x0

    invoke-virtual {p3, v0, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_6

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_6

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, p5, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "_cis"

    const-string p5, "ddp"

    invoke-virtual {p3, p4, p5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p4, p0, LPn8;->p:LRC8;

    const-string p5, "auto"

    const-string v0, "_cmp"

    invoke-virtual {p4, p5, v0, p3}, LRC8;->r(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p0}, LPn8;->N()LOW8;

    move-result-object p3

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p4, :cond_4

    goto :goto_0

    :cond_4
    :try_start_1
    iget-object p4, p3, Lns8;->a:LPn8;

    iget-object p4, p4, LPn8;->a:Landroid/content/Context;

    const-string p5, "google.analytics.deferred.deeplink.prefs"

    invoke-virtual {p4, p5, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p4

    invoke-interface {p4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p4

    invoke-interface {p4, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-interface {p4, p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz p1, :cond_5

    :try_start_2
    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.google.analytics.action.DEEPLINK_ACTION"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object p2, p3, Lns8;->a:LPn8;

    iget-object p2, p2, LPn8;->a:Landroid/content/Context;

    invoke-virtual {p2, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_5
    :goto_0
    return-void

    :catch_0
    move-exception p1

    iget-object p2, p3, Lns8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->o()Lec8;

    move-result-object p2

    const-string p3, "Failed to persist Deferred Deep Link. exception"

    invoke-virtual {p2, p3, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_6
    :goto_1
    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->t()Lec8;

    move-result-object p1

    const-string p3, "Deferred Deep Link validation failed. gclid, deep link"

    invoke-virtual {p1, p3, p4, p2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception p1

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->o()Lec8;

    move-result-object p2

    const-string p3, "Failed to parse the Deferred Deep Link response. exception"

    invoke-virtual {p2, p3, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_7
    :goto_2
    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->n()Lec8;

    move-result-object p1

    const-string p2, "Deferred Deep Link response empty."

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_8
    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->t()Lec8;

    move-result-object p1

    const-string p4, "Network Request for Deferred Deep Link failed. response, exception"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p4, p2, p3}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final f()V
    .locals 1

    iget v0, p0, LPn8;->E:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LPn8;->E:I

    return-void
.end method

.method public final g()V
    .locals 10

    invoke-virtual {p0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p0}, LPn8;->J()LND8;

    move-result-object v0

    invoke-static {v0}, LPn8;->t(LBs8;)V

    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object v0

    invoke-virtual {v0}, Lla8;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v1

    invoke-virtual {v1, v0}, LIh8;->m(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, p0, LPn8;->g:Lgl7;

    invoke-virtual {v2}, Lgl7;->x()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, LPn8;->J()LND8;

    move-result-object v2

    invoke-virtual {v2}, LBs8;->h()V

    iget-object v2, v2, Lns8;->a:LPn8;

    iget-object v2, v2, LPn8;->a:Landroid/content/Context;

    const-string v3, "connectivity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    :try_start_0
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, LPn8;->N()LOW8;

    move-result-object v2

    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object v3

    iget-object v3, v3, Lns8;->a:LPn8;

    iget-object v3, v3, LPn8;->g:Lgl7;

    invoke-virtual {v3}, Lgl7;->n()J

    const-wide/32 v3, 0x12cc8

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v1

    iget-object v1, v1, LIh8;->t:Lzg8;

    invoke-virtual {v1}, Lzg8;->a()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    add-long/2addr v6, v8

    move-object v1, v2

    move-wide v2, v3

    move-object v4, v0

    invoke-virtual/range {v1 .. v7}, LOW8;->p(JLjava/lang/String;Ljava/lang/String;J)Ljava/net/URL;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {p0}, LPn8;->J()LND8;

    move-result-object v2

    new-instance v7, Lpn8;

    invoke-direct {v7, p0}, Lpn8;-><init>(LPn8;)V

    invoke-virtual {v2}, Lns8;->e()V

    invoke-virtual {v2}, LBs8;->h()V

    invoke-static {v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v2, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->c()Ldn8;

    move-result-object v8

    new-instance v9, LBD8;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    move-object v3, v0

    invoke-direct/range {v1 .. v7}, LBD8;-><init>(LND8;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lpn8;)V

    invoke-virtual {v8, v9}, Ldn8;->v(Ljava/lang/Runnable;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object v0

    const-string v1, "Network is not available for Deferred Deep Link request. Skipping"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_0
    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    const-string v1, "ADID unavailable to retrieve Deferred Deep Link. Skipping"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final h(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LPn8;->A:Ljava/lang/Boolean;

    return-void
.end method

.method public final i(Z)V
    .locals 1

    invoke-virtual {p0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iput-boolean p1, p0, LPn8;->D:Z

    return-void
.end method

.method public final j(Lcom/google/android/gms/internal/measurement/zzcl;)V
    .locals 9

    invoke-virtual {p0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v0

    invoke-virtual {v0}, LIh8;->n()LXm7;

    move-result-object v0

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v1

    iget-object v2, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, Lns8;->e()V

    invoke-virtual {v1}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "consent_source"

    const/16 v3, 0x64

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iget-object v2, p0, LPn8;->g:Lgl7;

    iget-object v4, v2, Lns8;->a:LPn8;

    const-string v4, "google_analytics_default_allow_ad_storage"

    invoke-virtual {v2, v4}, Lgl7;->q(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v4, p0, LPn8;->g:Lgl7;

    iget-object v5, v4, Lns8;->a:LPn8;

    const-string v5, "google_analytics_default_allow_analytics_storage"

    invoke-virtual {v4, v5}, Lgl7;->q(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    const/16 v5, -0xa

    const/4 v6, 0x0

    if-nez v2, :cond_0

    if-eqz v4, :cond_1

    :cond_0
    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v7

    invoke-virtual {v7, v5}, LIh8;->t(I)Z

    move-result v7

    if-eqz v7, :cond_1

    new-instance p1, LXm7;

    invoke-direct {p1, v2, v4}, LXm7;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    move v3, v5

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object v2

    invoke-virtual {v2}, Lla8;->q()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/16 v4, 0x1e

    if-nez v2, :cond_3

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_2

    const/16 v2, 0xa

    if-eq v1, v2, :cond_2

    if-eq v1, v4, :cond_2

    if-eq v1, v4, :cond_2

    const/16 v2, 0x28

    if-ne v1, v2, :cond_3

    :cond_2
    invoke-virtual {p0}, LPn8;->I()LRC8;

    move-result-object p1

    sget-object v1, LXm7;->b:LXm7;

    iget-wide v7, p0, LPn8;->G:J

    invoke-virtual {p1, v1, v5, v7, v8}, LRC8;->G(LXm7;IJ)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object v1

    invoke-virtual {v1}, Lla8;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    if-eqz p1, :cond_4

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzcl;->h:Landroid/os/Bundle;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v1

    invoke-virtual {v1, v4}, LIh8;->t(I)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzcl;->h:Landroid/os/Bundle;

    invoke-static {p1}, LXm7;->a(Landroid/os/Bundle;)LXm7;

    move-result-object p1

    sget-object v1, LXm7;->b:LXm7;

    invoke-virtual {p1, v1}, LXm7;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    move v3, v4

    goto :goto_1

    :cond_4
    :goto_0
    move-object p1, v6

    :goto_1
    if-eqz p1, :cond_5

    invoke-virtual {p0}, LPn8;->I()LRC8;

    move-result-object v0

    iget-wide v1, p0, LPn8;->G:J

    invoke-virtual {v0, p1, v3, v1, v2}, LRC8;->G(LXm7;IJ)V

    move-object v0, p1

    :cond_5
    invoke-virtual {p0}, LPn8;->I()LRC8;

    move-result-object p1

    invoke-virtual {p1, v0}, LRC8;->J(LXm7;)V

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    iget-object p1, p1, LIh8;->e:Lzg8;

    invoke-virtual {p1}, Lzg8;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_6

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->s()Lec8;

    move-result-object p1

    iget-wide v0, p0, LPn8;->G:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Persisting first open"

    invoke-virtual {p1, v1, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    iget-object p1, p1, LIh8;->e:Lzg8;

    iget-wide v0, p0, LPn8;->G:J

    invoke-virtual {p1, v0, v1}, Lzg8;->b(J)V

    :cond_6
    invoke-virtual {p0}, LPn8;->I()LRC8;

    move-result-object p1

    iget-object p1, p1, LRC8;->n:LIo9;

    invoke-virtual {p1}, LIo9;->c()V

    invoke-virtual {p0}, LPn8;->o()Z

    move-result p1

    if-nez p1, :cond_b

    invoke-virtual {p0}, LPn8;->l()Z

    move-result p1

    if-eqz p1, :cond_15

    invoke-virtual {p0}, LPn8;->N()LOW8;

    move-result-object p1

    const-string v0, "android.permission.INTERNET"

    invoke-virtual {p1, v0}, LOW8;->T(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string v0, "App is missing INTERNET permission"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {p0}, LPn8;->N()LOW8;

    move-result-object p1

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {p1, v0}, LOW8;->T(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string v0, "App is missing ACCESS_NETWORK_STATE permission"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    :cond_8
    iget-object p1, p0, LPn8;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->isCallerInstantApp()Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, LPn8;->g:Lgl7;

    invoke-virtual {p1}, Lgl7;->G()Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, LPn8;->a:Landroid/content/Context;

    invoke-static {p1}, LOW8;->a0(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string v0, "AppMeasurementReceiver not registered/enabled"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    :cond_9
    iget-object p1, p0, LPn8;->a:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LOW8;->b0(Landroid/content/Context;Z)Z

    move-result p1

    if-nez p1, :cond_a

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string v0, "AppMeasurementService not registered/enabled"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    :cond_a
    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string v0, "Uploading is not possible. App measurement disabled"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_b
    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object p1

    invoke-virtual {p1}, Lla8;->q()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object p1

    invoke-virtual {p1}, Lla8;->o()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_f

    :cond_c
    invoke-virtual {p0}, LPn8;->N()LOW8;

    move-result-object p1

    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object v0

    invoke-virtual {v0}, Lla8;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v1

    invoke-virtual {v1}, Lns8;->e()V

    invoke-virtual {v1}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "gmp_app_id"

    invoke-interface {v1, v2, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object v3

    invoke-virtual {v3}, Lla8;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v4

    invoke-virtual {v4}, Lns8;->e()V

    invoke-virtual {v4}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v5, "admob_app_id"

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v0, v1, v3, v4}, LOW8;->d0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->r()Lec8;

    move-result-object p1

    const-string v0, "Rechecking which service to use due to a GMP App Id change"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    invoke-virtual {p1}, Lns8;->e()V

    invoke-virtual {p1}, LIh8;->o()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    if-eqz v0, :cond_d

    invoke-virtual {p1, v0}, LIh8;->p(Ljava/lang/Boolean;)V

    :cond_d
    invoke-virtual {p0}, LPn8;->B()LOa8;

    move-result-object p1

    invoke-virtual {p1}, LOa8;->n()V

    iget-object p1, p0, LPn8;->u:LQM8;

    invoke-virtual {p1}, LQM8;->Q()V

    iget-object p1, p0, LPn8;->u:LQM8;

    invoke-virtual {p1}, LQM8;->P()V

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    iget-object p1, p1, LIh8;->e:Lzg8;

    iget-wide v0, p0, LPn8;->G:J

    invoke-virtual {p1, v0, v1}, Lzg8;->b(J)V

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    iget-object p1, p1, LIh8;->g:Lsh8;

    invoke-virtual {p1, v6}, Lsh8;->b(Ljava/lang/String;)V

    :cond_e
    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object v0

    invoke-virtual {v0}, Lla8;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lns8;->e()V

    invoke-virtual {p1}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object v0

    invoke-virtual {v0}, Lla8;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lns8;->e()V

    invoke-virtual {p1}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v5, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_f
    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    invoke-virtual {p1}, LIh8;->n()LXm7;

    move-result-object p1

    sget-object v0, Lcm7;->d:Lcm7;

    invoke-virtual {p1, v0}, LXm7;->i(Lcm7;)Z

    move-result p1

    if-nez p1, :cond_10

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    iget-object p1, p1, LIh8;->g:Lsh8;

    invoke-virtual {p1, v6}, Lsh8;->b(Ljava/lang/String;)V

    :cond_10
    invoke-virtual {p0}, LPn8;->I()LRC8;

    move-result-object p1

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->g:Lsh8;

    invoke-virtual {v0}, Lsh8;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LRC8;->B(Ljava/lang/String;)V

    invoke-static {}, Lic9;->b()Z

    iget-object p1, p0, LPn8;->g:Lgl7;

    sget-object v0, La98;->g0:LL88;

    invoke-virtual {p1, v6, v0}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-virtual {p0}, LPn8;->N()LOW8;

    move-result-object p1

    :try_start_0
    iget-object p1, p1, Lns8;->a:LPn8;

    iget-object p1, p1, LPn8;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    const-string v0, "com.google.firebase.remoteconfig.FirebaseRemoteConfig"

    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    iget-object p1, p1, LIh8;->u:Lsh8;

    invoke-virtual {p1}, Lsh8;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_11

    invoke-virtual {p0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->t()Lec8;

    move-result-object p1

    const-string v0, "Remote config removed with active feature rollouts"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    iget-object p1, p1, LIh8;->u:Lsh8;

    invoke-virtual {p1, v6}, Lsh8;->b(Ljava/lang/String;)V

    :cond_11
    :goto_2
    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object p1

    invoke-virtual {p1}, Lla8;->q()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_12

    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object p1

    invoke-virtual {p1}, Lla8;->o()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_15

    :cond_12
    invoke-virtual {p0}, LPn8;->l()Z

    move-result p1

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v0

    invoke-virtual {v0}, LIh8;->r()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, LPn8;->g:Lgl7;

    invoke-virtual {v0}, Lgl7;->E()Z

    move-result v0

    if-nez v0, :cond_13

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v0

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, LIh8;->q(Z)V

    :cond_13
    if-eqz p1, :cond_14

    invoke-virtual {p0}, LPn8;->I()LRC8;

    move-result-object p1

    invoke-virtual {p1}, LRC8;->f0()V

    :cond_14
    invoke-virtual {p0}, LPn8;->M()LcR8;

    move-result-object p1

    iget-object p1, p1, LcR8;->d:LJQ8;

    invoke-virtual {p1}, LJQ8;->a()V

    invoke-virtual {p0}, LPn8;->L()LQM8;

    move-result-object p1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p1, v0}, LQM8;->S(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {p0}, LPn8;->L()LQM8;

    move-result-object p1

    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->x:Ljg8;

    invoke-virtual {v0}, Ljg8;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, LQM8;->s(Landroid/os/Bundle;)V

    :cond_15
    :goto_3
    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object p1

    iget-object p1, p1, LIh8;->n:LVf8;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LVf8;->a(Z)V

    return-void
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, LPn8;->A:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, LPn8;->A:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l()Z
    .locals 1

    invoke-virtual {p0}, LPn8;->u()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final m()Z
    .locals 1

    invoke-virtual {p0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, LPn8;->D:Z

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-object v0, p0, LPn8;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public final o()Z
    .locals 5

    iget-boolean v0, p0, LPn8;->x:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LPn8;->y:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-wide v1, p0, LPn8;->z:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, LPn8;->n:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, LPn8;->z:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    :cond_0
    iget-object v0, p0, LPn8;->n:Lcom/google/android/gms/common/util/Clock;

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, LPn8;->z:J

    invoke-virtual {p0}, LPn8;->N()LOW8;

    move-result-object v0

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, LOW8;->T(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LPn8;->N()LOW8;

    move-result-object v0

    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v3}, LOW8;->T(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LPn8;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->isCallerInstantApp()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LPn8;->g:Lgl7;

    invoke-virtual {v0}, Lgl7;->G()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LPn8;->a:Landroid/content/Context;

    invoke-static {v0}, LOW8;->a0(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LPn8;->a:Landroid/content/Context;

    invoke-static {v0, v2}, LOW8;->b0(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, LPn8;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LPn8;->N()LOW8;

    move-result-object v0

    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object v3

    invoke-virtual {v3}, Lla8;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object v4

    invoke-virtual {v4}, Lla8;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, LOW8;->M(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, LPn8;->y()Lla8;

    move-result-object v0

    invoke-virtual {v0}, Lla8;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move v1, v2

    :cond_4
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, LPn8;->y:Ljava/lang/Boolean;

    :cond_5
    iget-object v0, p0, LPn8;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AppMeasurement is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, LPn8;->e:Z

    return v0
.end method

.method public final u()I
    .locals 3

    invoke-virtual {p0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LPn8;->g:Lgl7;

    invoke-virtual {v0}, Lgl7;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, LPn8;->C:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    return v0

    :cond_2
    :goto_0
    invoke-virtual {p0}, LPn8;->c()Ldn8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    iget-boolean v0, p0, LPn8;->D:Z

    if-nez v0, :cond_3

    const/16 v0, 0x8

    return v0

    :cond_3
    invoke-virtual {p0}, LPn8;->F()LIh8;

    move-result-object v0

    invoke-virtual {v0}, LIh8;->o()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_4
    const/4 v0, 0x3

    return v0

    :cond_5
    iget-object v0, p0, LPn8;->g:Lgl7;

    iget-object v2, v0, Lns8;->a:LPn8;

    iget-object v2, v2, LPn8;->f:LFg7;

    const-string v2, "firebase_analytics_collection_enabled"

    invoke-virtual {v0, v2}, Lgl7;->q(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    return v1

    :cond_6
    const/4 v0, 0x4

    return v0

    :cond_7
    iget-object v0, p0, LPn8;->B:Ljava/lang/Boolean;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    return v1

    :cond_8
    const/4 v0, 0x5

    return v0

    :cond_9
    iget-object v0, p0, LPn8;->A:Ljava/lang/Boolean;

    if-eqz v0, :cond_b

    iget-object v0, p0, LPn8;->A:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    return v1

    :cond_a
    const/4 v0, 0x7

    return v0

    :cond_b
    return v1
.end method

.method public final v()LaY7;
    .locals 2

    iget-object v0, p0, LPn8;->q:LaY7;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final w()Lgl7;
    .locals 1

    iget-object v0, p0, LPn8;->g:Lgl7;

    return-object v0
.end method

.method public final x()LJt7;
    .locals 1

    iget-object v0, p0, LPn8;->v:LJt7;

    invoke-static {v0}, LPn8;->t(LBs8;)V

    iget-object v0, p0, LPn8;->v:LJt7;

    return-object v0
.end method

.method public final y()Lla8;
    .locals 1

    iget-object v0, p0, LPn8;->w:Lla8;

    invoke-static {v0}, LPn8;->s(Lwe8;)V

    iget-object v0, p0, LPn8;->w:Lla8;

    return-object v0
.end method

.method public final z()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LPn8;->a:Landroid/content/Context;

    return-object v0
.end method
