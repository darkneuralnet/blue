.class public final LQM8;
.super Lwe8;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field public final c:LEM8;

.field public d:LV98;

.field public volatile e:Ljava/lang/Boolean;

.field public final f:LTs7;

.field public final g:LmR8;

.field public final h:Ljava/util/List;

.field public final i:LTs7;


# direct methods
.method public constructor <init>(LPn8;)V
    .locals 2

    invoke-direct {p0, p1}, Lwe8;-><init>(LPn8;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LQM8;->h:Ljava/util/List;

    new-instance v0, LmR8;

    invoke-virtual {p1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-direct {v0, v1}, LmR8;-><init>(Lcom/google/android/gms/common/util/Clock;)V

    iput-object v0, p0, LQM8;->g:LmR8;

    new-instance v0, LEM8;

    invoke-direct {v0, p0}, LEM8;-><init>(LQM8;)V

    iput-object v0, p0, LQM8;->c:LEM8;

    new-instance v0, LjJ8;

    invoke-direct {v0, p0, p1}, LjJ8;-><init>(LQM8;LQs8;)V

    iput-object v0, p0, LQM8;->f:LTs7;

    new-instance v0, LGJ8;

    invoke-direct {v0, p0, p1}, LGJ8;-><init>(LQM8;LQs8;)V

    iput-object v0, p0, LQM8;->i:LTs7;

    return-void
.end method

.method public static bridge synthetic H(LQM8;)LV98;
    .locals 0

    iget-object p0, p0, LQM8;->d:LV98;

    return-object p0
.end method

.method public static bridge synthetic I(LQM8;)LEM8;
    .locals 0

    iget-object p0, p0, LQM8;->c:LEM8;

    return-object p0
.end method

.method public static bridge synthetic K(LQM8;LV98;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, LQM8;->d:LV98;

    return-void
.end method

.method public static bridge synthetic L(LQM8;)V
    .locals 0

    invoke-virtual {p0}, LQM8;->D()V

    return-void
.end method

.method public static bridge synthetic M(LQM8;Landroid/content/ComponentName;)V
    .locals 2

    invoke-virtual {p0}, Lns8;->e()V

    iget-object v0, p0, LQM8;->d:LV98;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LQM8;->d:LV98;

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "Disconnected from device MeasurementService"

    invoke-virtual {v0, v1, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, LQM8;->P()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic N(LQM8;)V
    .locals 0

    invoke-virtual {p0}, LQM8;->E()V

    return-void
.end method


# virtual methods
.method public final B(Z)Lcom/google/android/gms/measurement/internal/zzq;
    .locals 3

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->C()LFg7;

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->y()Lla8;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    iget-object v2, p1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->F()LIh8;

    move-result-object v2

    iget-object v2, v2, LIh8;->d:Leh8;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->F()LIh8;

    move-result-object p1

    iget-object p1, p1, LIh8;->d:Leh8;

    invoke-virtual {p1}, Leh8;->a()Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object v2, LIh8;->y:Landroid/util/Pair;

    if-ne p1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-virtual {v0, v1}, Lla8;->n(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object p1

    return-object p1
.end method

.method public final D()V
    .locals 4

    invoke-virtual {p0}, Lns8;->e()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    iget-object v1, p0, LQM8;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Processing queued up service tasks"

    invoke-virtual {v0, v2, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LQM8;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Task exception while flushing queue"

    invoke-virtual {v2, v3, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LQM8;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, LQM8;->i:LTs7;

    invoke-virtual {v0}, LTs7;->b()V

    return-void
.end method

.method public final E()V
    .locals 3

    invoke-virtual {p0}, Lns8;->e()V

    iget-object v0, p0, LQM8;->g:LmR8;

    invoke-virtual {v0}, LmR8;->b()V

    iget-object v0, p0, LQM8;->f:LTs7;

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->w()Lgl7;

    sget-object v1, La98;->L:LL88;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LTs7;->d(J)V

    return-void
.end method

.method public final F(Ljava/lang/Runnable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, LQM8;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, LQM8;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->w()Lgl7;

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string v0, "Discarding data. Max runnable queue size reached"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, LQM8;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LQM8;->i:LTs7;

    const-wide/32 v0, 0xea60

    invoke-virtual {p1, v0, v1}, LTs7;->d(J)V

    invoke-virtual {p0}, LQM8;->P()V

    return-void
.end method

.method public final G()Z
    .locals 1

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->C()LFg7;

    const/4 v0, 0x1

    return v0
.end method

.method public final J()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LQM8;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final O()V
    .locals 2

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v0

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->B()LOa8;

    move-result-object v1

    invoke-virtual {v1}, LOa8;->o()Z

    new-instance v1, LzI8;

    invoke-direct {v1, p0, v0}, LzI8;-><init>(LQM8;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, v1}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final P()V
    .locals 5

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    invoke-virtual {p0}, LQM8;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LQM8;->y()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->G()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->C()LFg7;

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->z()Landroid/content/Context;

    move-result-object v2

    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const/high16 v2, 0x10000

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.measurement.START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->z()Landroid/content/Context;

    move-result-object v2

    iget-object v4, p0, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->C()LFg7;

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v1, p0, LQM8;->c:LEM8;

    invoke-virtual {v1, v0}, LEM8;->b(Landroid/content/Intent;)V

    return-void

    :cond_1
    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v1, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    :cond_2
    return-void

    :cond_3
    iget-object v0, p0, LQM8;->c:LEM8;

    invoke-virtual {v0}, LEM8;->c()V

    return-void
.end method

.method public final Q()V
    .locals 3

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    iget-object v0, p0, LQM8;->c:LEM8;

    invoke-virtual {v0}, LEM8;->d()V

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/stats/ConnectionTracker;->getInstance()Lcom/google/android/gms/common/stats/ConnectionTracker;

    move-result-object v0

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->z()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, LQM8;->c:LEM8;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/stats/ConnectionTracker;->unbindService(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, LQM8;->d:LV98;

    return-void
.end method

.method public final R(LhS7;)V
    .locals 2

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v0

    new-instance v1, LnI8;

    invoke-direct {v1, p0, v0, p1}, LnI8;-><init>(LQM8;Lcom/google/android/gms/measurement/internal/zzq;LhS7;)V

    invoke-virtual {p0, v1}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final S(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 2

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v0

    new-instance v1, LbI8;

    invoke-direct {v1, p0, p1, v0}, LbI8;-><init>(LQM8;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, v1}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final T(LhS7;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v5

    new-instance v0, LZK8;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, LZK8;-><init>(LQM8;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;LhS7;)V

    invoke-virtual {p0, v0}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final U(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v6

    new-instance p2, LNK8;

    const/4 v3, 0x0

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, LNK8;-><init>(LQM8;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, p2}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final V(LhS7;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v5

    new-instance v0, LzG8;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move v6, p4

    move-object v7, p1

    invoke-direct/range {v1 .. v7}, LzG8;-><init>(LQM8;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;ZLhS7;)V

    invoke-virtual {p0, v0}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final W(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v6

    new-instance p2, LlL8;

    const/4 v3, 0x0

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, LlL8;-><init>(LQM8;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;Z)V

    invoke-virtual {p0, p2}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l(Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V
    .locals 8

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    invoke-virtual {p0}, LQM8;->G()Z

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->B()LOa8;

    move-result-object v0

    invoke-virtual {v0, p1}, LOa8;->s(Lcom/google/android/gms/measurement/internal/zzaw;)Z

    move-result v5

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v4

    new-instance v0, LpK8;

    const/4 v3, 0x1

    move-object v1, v0

    move-object v2, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, LpK8;-><init>(LQM8;ZLcom/google/android/gms/measurement/internal/zzq;ZLcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final m(LhS7;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->N()LOW8;

    move-result-object v0

    const v1, 0xbdfcb8

    invoke-virtual {v0, v1}, LOW8;->r0(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Lns8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->t()Lec8;

    move-result-object p2

    const-string p3, "Not bundling data. Service unavailable or out of date"

    invoke-virtual {p2, p3}, Lec8;->a(Ljava/lang/String;)V

    iget-object p2, p0, Lns8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->N()LOW8;

    move-result-object p2

    const/4 p3, 0x0

    new-array p3, p3, [B

    invoke-virtual {p2, p1, p3}, LOW8;->H(LhS7;[B)V

    return-void

    :cond_0
    new-instance v0, LvJ8;

    invoke-direct {v0, p0, p2, p3, p1}, LvJ8;-><init>(LQM8;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;LhS7;)V

    invoke-virtual {p0, v0}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final n()V
    .locals 2

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v0

    invoke-virtual {p0}, LQM8;->G()Z

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->B()LOa8;

    move-result-object v1

    invoke-virtual {v1}, LOa8;->n()V

    new-instance v1, LPH8;

    invoke-direct {v1, p0, v0}, LPH8;-><init>(LQM8;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, v1}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final o(LV98;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 10
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    invoke-virtual {p0}, LQM8;->G()Z

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    const/4 v0, 0x0

    const/16 v1, 0x64

    move v2, v0

    move v3, v1

    :goto_0
    const/16 v4, 0x3e9

    if-ge v2, v4, :cond_6

    if-ne v3, v1, :cond_6

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p0, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->B()LOa8;

    move-result-object v4

    invoke-virtual {v4, v1}, LOa8;->m(I)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    goto :goto_1

    :cond_0
    move v4, v0

    :goto_1
    if-eqz p2, :cond_1

    if-ge v4, v1, :cond_1

    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    move v6, v0

    :goto_2
    if-ge v6, v5, :cond_5

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

    instance-of v8, v7, Lcom/google/android/gms/measurement/internal/zzaw;

    if-eqz v8, :cond_2

    :try_start_0
    check-cast v7, Lcom/google/android/gms/measurement/internal/zzaw;

    invoke-interface {p1, v7, p3}, LV98;->J2(Lcom/google/android/gms/measurement/internal/zzaw;Lcom/google/android/gms/measurement/internal/zzq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v7

    iget-object v8, p0, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->a()LFc8;

    move-result-object v8

    invoke-virtual {v8}, LFc8;->o()Lec8;

    move-result-object v8

    const-string v9, "Failed to send event to the service"

    invoke-virtual {v8, v9, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    instance-of v8, v7, Lcom/google/android/gms/measurement/internal/zzlj;

    if-eqz v8, :cond_3

    :try_start_1
    check-cast v7, Lcom/google/android/gms/measurement/internal/zzlj;

    invoke-interface {p1, v7, p3}, LV98;->z(Lcom/google/android/gms/measurement/internal/zzlj;Lcom/google/android/gms/measurement/internal/zzq;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v7

    iget-object v8, p0, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->a()LFc8;

    move-result-object v8

    invoke-virtual {v8}, LFc8;->o()Lec8;

    move-result-object v8

    const-string v9, "Failed to send user property to the service"

    invoke-virtual {v8, v9, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    instance-of v8, v7, Lcom/google/android/gms/measurement/internal/zzac;

    if-eqz v8, :cond_4

    :try_start_2
    check-cast v7, Lcom/google/android/gms/measurement/internal/zzac;

    invoke-interface {p1, v7, p3}, LV98;->R4(Lcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzq;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception v7

    iget-object v8, p0, Lns8;->a:LPn8;

    invoke-virtual {v8}, LPn8;->a()LFc8;

    move-result-object v8

    invoke-virtual {v8}, LFc8;->o()Lec8;

    move-result-object v8

    const-string v9, "Failed to send conditional user property to the service"

    invoke-virtual {v8, v9, v7}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget-object v7, p0, Lns8;->a:LPn8;

    invoke-virtual {v7}, LPn8;->a()LFc8;

    move-result-object v7

    invoke-virtual {v7}, LFc8;->o()Lec8;

    move-result-object v7

    const-string v8, "Discarding data. Unrecognized parcel type."

    invoke-virtual {v7, v8}, Lec8;->a(Ljava/lang/String;)V

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    add-int/lit8 v2, v2, 0x1

    move v3, v4

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public final p(Lcom/google/android/gms/measurement/internal/zzac;)V
    .locals 8

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->C()LFg7;

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->B()LOa8;

    move-result-object v0

    invoke-virtual {v0, p1}, LOa8;->r(Lcom/google/android/gms/measurement/internal/zzac;)Z

    move-result v5

    new-instance v6, Lcom/google/android/gms/measurement/internal/zzac;

    invoke-direct {v6, p1}, Lcom/google/android/gms/measurement/internal/zzac;-><init>(Lcom/google/android/gms/measurement/internal/zzac;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v4

    new-instance v0, LBK8;

    const/4 v3, 0x1

    move-object v1, v0

    move-object v2, p0

    move-object v7, p1

    invoke-direct/range {v1 .. v7}, LBK8;-><init>(LQM8;ZLcom/google/android/gms/measurement/internal/zzq;ZLcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzac;)V

    invoke-virtual {p0, v0}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final q(Z)V
    .locals 1

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LQM8;->G()Z

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->B()LOa8;

    move-result-object p1

    invoke-virtual {p1}, LOa8;->n()V

    :cond_0
    invoke-virtual {p0}, LQM8;->x()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object p1

    new-instance v0, LeK8;

    invoke-direct {v0, p0, p1}, LeK8;-><init>(LQM8;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, v0}, LQM8;->F(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final r(LwE8;)V
    .locals 1

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    new-instance v0, LLI8;

    invoke-direct {v0, p0, p1}, LLI8;-><init>(LQM8;LwE8;)V

    invoke-virtual {p0, v0}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final s(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v0

    new-instance v1, LXI8;

    invoke-direct {v1, p0, v0, p1}, LXI8;-><init>(LQM8;Lcom/google/android/gms/measurement/internal/zzq;Landroid/os/Bundle;)V

    invoke-virtual {p0, v1}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final t()V
    .locals 2

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v0

    new-instance v1, LSJ8;

    invoke-direct {v1, p0, v0}, LSJ8;-><init>(LQM8;Lcom/google/android/gms/measurement/internal/zzq;)V

    invoke-virtual {p0, v1}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final u(LV98;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, Lns8;->e()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LQM8;->d:LV98;

    invoke-virtual {p0}, LQM8;->E()V

    invoke-virtual {p0}, LQM8;->D()V

    return-void
.end method

.method public final v(Lcom/google/android/gms/measurement/internal/zzlj;)V
    .locals 3

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    invoke-virtual {p0}, LQM8;->G()Z

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->B()LOa8;

    move-result-object v0

    invoke-virtual {v0, p1}, LOa8;->t(Lcom/google/android/gms/measurement/internal/zzlj;)Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, LQM8;->B(Z)Lcom/google/android/gms/measurement/internal/zzq;

    move-result-object v1

    new-instance v2, LDH8;

    invoke-direct {v2, p0, v1, v0, p1}, LDH8;-><init>(LQM8;Lcom/google/android/gms/measurement/internal/zzq;ZLcom/google/android/gms/measurement/internal/zzlj;)V

    invoke-virtual {p0, v2}, LQM8;->F(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final w()Z
    .locals 1

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    iget-object v0, p0, LQM8;->d:LV98;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final x()Z
    .locals 4

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    invoke-virtual {p0}, LQM8;->y()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->N()LOW8;

    move-result-object v0

    invoke-virtual {v0}, LOW8;->q0()I

    move-result v0

    sget-object v2, La98;->j0:LL88;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v1
.end method

.method public final y()Z
    .locals 7

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    iget-object v0, p0, LQM8;->e:Ljava/lang/Boolean;

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, Lwe8;->f()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {v0}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "use_service"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_6

    :cond_1
    iget-object v4, p0, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->C()LFg7;

    iget-object v4, p0, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->y()Lla8;

    move-result-object v4

    invoke-virtual {v4}, Lla8;->l()I

    move-result v4

    if-ne v4, v1, :cond_2

    :goto_1
    move v3, v1

    goto/16 :goto_4

    :cond_2
    iget-object v4, p0, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->a()LFc8;

    move-result-object v4

    invoke-virtual {v4}, LFc8;->s()Lec8;

    move-result-object v4

    const-string v5, "Checking service availability"

    invoke-virtual {v4, v5}, Lec8;->a(Ljava/lang/String;)V

    iget-object v4, p0, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->N()LOW8;

    move-result-object v4

    const v5, 0xbdfcb8

    invoke-virtual {v4, v5}, LOW8;->r0(I)I

    move-result v4

    if-eqz v4, :cond_a

    if-eq v4, v1, :cond_9

    const/4 v5, 0x2

    if-eq v4, v5, :cond_6

    const/4 v0, 0x3

    if-eq v4, v0, :cond_5

    const/16 v0, 0x9

    if-eq v4, v0, :cond_4

    const/16 v0, 0x12

    if-eq v4, v0, :cond_3

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v4, "Unexpected service status"

    invoke-virtual {v0, v4, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object v0

    const-string v3, "Service updating"

    invoke-virtual {v0, v3}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object v0

    const-string v1, "Service invalid"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object v0

    const-string v1, "Service disabled"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    :goto_2
    move v1, v3

    goto :goto_4

    :cond_6
    iget-object v4, p0, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->a()LFc8;

    move-result-object v4

    invoke-virtual {v4}, LFc8;->n()Lec8;

    move-result-object v4

    const-string v5, "Service container out of date"

    invoke-virtual {v4, v5}, Lec8;->a(Ljava/lang/String;)V

    iget-object v4, p0, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->N()LOW8;

    move-result-object v4

    invoke-virtual {v4}, LOW8;->q0()I

    move-result v4

    const/16 v5, 0x4423

    if-ge v4, v5, :cond_7

    goto :goto_4

    :cond_7
    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    move v1, v3

    :goto_3
    move v6, v3

    move v3, v1

    move v1, v6

    goto :goto_4

    :cond_9
    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v4, "Service missing"

    invoke-virtual {v0, v4}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_4

    :cond_a
    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v3, "Service available"

    invoke-virtual {v0, v3}, Lec8;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :goto_4
    if-nez v3, :cond_b

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->G()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v1, "No way to upload. Consider using the full version of Analytics"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    if-eqz v1, :cond_c

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    invoke-virtual {v0}, Lns8;->e()V

    invoke-virtual {v0}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_c
    :goto_5
    move v1, v3

    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, LQM8;->e:Ljava/lang/Boolean;

    :cond_d
    iget-object v0, p0, LQM8;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
