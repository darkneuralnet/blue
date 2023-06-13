.class public final LnG8;
.super Lwe8;
.source "SourceFile"


# instance fields
.field public volatile c:LwE8;

.field public volatile d:LwE8;

.field public e:LwE8;
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field public final f:Ljava/util/Map;

.field public g:Landroid/app/Activity;

.field public volatile h:Z

.field public volatile i:LwE8;

.field public j:LwE8;

.field public k:Z

.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LPn8;)V
    .locals 0

    invoke-direct {p0, p1}, Lwe8;-><init>(LPn8;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnG8;->l:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, LnG8;->f:Ljava/util/Map;

    return-void
.end method

.method public static bridge synthetic n(LnG8;)LwE8;
    .locals 0

    iget-object p0, p0, LnG8;->j:LwE8;

    return-object p0
.end method

.method public static bridge synthetic r(LnG8;LwE8;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, LnG8;->j:LwE8;

    return-void
.end method

.method public static bridge synthetic s(LnG8;LwE8;LwE8;JZLandroid/os/Bundle;)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v6}, LnG8;->l(LwE8;LwE8;JZLandroid/os/Bundle;)V

    return-void
.end method

.method public static bridge synthetic t(LnG8;Landroid/os/Bundle;LwE8;LwE8;J)V
    .locals 8

    const-string v0, "screen_name"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "screen_class"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const/4 v6, 0x1

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->N()LOW8;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "screen_view"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, LOW8;->x0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    move-result-object v0

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    move-object v7, v0

    invoke-virtual/range {v1 .. v7}, LnG8;->l(LwE8;LwE8;JZLandroid/os/Bundle;)V

    return-void
.end method

.method public static bridge synthetic u(LnG8;LwE8;ZJ)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3, p4}, LnG8;->m(LwE8;ZJ)V

    return-void
.end method


# virtual methods
.method public final B(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->D()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LnG8;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LwE8;

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "id"

    iget-wide v2, p1, LwE8;->c:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v1, "name"

    iget-object v2, p1, LwE8;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "referrer_name"

    iget-object p1, p1, LwE8;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "com.google.app_measurement.screen_service"

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final D(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->D()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->u()Lec8;

    move-result-object p1

    const-string p2, "setCurrentScreen cannot be called while screen reporting is disabled."

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, LnG8;->c:LwE8;

    if-nez v0, :cond_1

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->u()Lec8;

    move-result-object p1

    const-string p2, "setCurrentScreen cannot be called while no activity active"

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v1, p0, LnG8;->f:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->u()Lec8;

    move-result-object p1

    const-string p2, "setCurrentScreen must be called with an activity in the activity lifecycle"

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    if-nez p3, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    const-string v1, "Activity"

    invoke-virtual {p0, p3, v1}, LnG8;->q(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :cond_3
    iget-object v1, v0, LwE8;->b:Ljava/lang/String;

    invoke-static {v1, p3}, LHE8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    iget-object v0, v0, LwE8;->a:Ljava/lang/String;

    invoke-static {v0, p2}, LHE8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v1, :cond_5

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->u()Lec8;

    move-result-object p1

    const-string p2, "setCurrentScreen cannot be called with the same class and name"

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_5
    :goto_0
    const/16 v0, 0x64

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->w()Lgl7;

    if-gt v1, v0, :cond_6

    goto :goto_1

    :cond_6
    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->u()Lec8;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const-string p3, "Invalid screen name length in setCurrentScreen. Length"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_7
    :goto_1
    if-eqz p3, :cond_9

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_8

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->w()Lgl7;

    if-gt v1, v0, :cond_8

    goto :goto_2

    :cond_8
    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->u()Lec8;

    move-result-object p1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    const-string p3, "Invalid class name length in setCurrentScreen. Length"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_9
    :goto_2
    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    if-nez p2, :cond_a

    const-string v1, "null"

    goto :goto_3

    :cond_a
    move-object v1, p2

    :goto_3
    const-string v2, "Setting current screen to name, class"

    invoke-virtual {v0, v2, v1, p3}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, LwE8;

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->N()LOW8;

    move-result-object v1

    invoke-virtual {v1}, LOW8;->t0()J

    move-result-wide v1

    invoke-direct {v0, p2, p3, v1, v2}, LwE8;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object p2, p0, LnG8;->f:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-virtual {p0, p1, v0, p2}, LnG8;->G(Landroid/app/Activity;LwE8;Z)V

    return-void
.end method

.method public final E(Landroid/os/Bundle;J)V
    .locals 12

    iget-object v0, p0, LnG8;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LnG8;->k:Z

    if-nez v1, :cond_0

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->u()Lec8;

    move-result-object p1

    const-string p2, "Cannot log screen view event when the app is in the background."

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_0
    const-string v1, "screen_name"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v1, 0x64

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    iget-object v4, p0, Lns8;->a:LPn8;

    invoke-virtual {v4}, LPn8;->w()Lgl7;

    if-le v2, v1, :cond_2

    :cond_1
    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->u()Lec8;

    move-result-object p1

    const-string p2, "Invalid screen name length for screen view. Length"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :cond_2
    const-string v2, "screen_class"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    iget-object v5, p0, Lns8;->a:LPn8;

    invoke-virtual {v5}, LPn8;->w()Lgl7;

    if-le v4, v1, :cond_4

    :cond_3
    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->u()Lec8;

    move-result-object p1

    const-string p2, "Invalid screen class length for screen view. Length"

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :cond_4
    if-nez v2, :cond_6

    iget-object v1, p0, LnG8;->g:Landroid/app/Activity;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "Activity"

    invoke-virtual {p0, v1, v2}, LnG8;->q(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_5
    const-string v1, "Activity"

    :goto_0
    move-object v4, v1

    goto :goto_1

    :cond_6
    move-object v4, v2

    :goto_1
    iget-object v1, p0, LnG8;->c:LwE8;

    iget-boolean v2, p0, LnG8;->h:Z

    if-eqz v2, :cond_7

    if-eqz v1, :cond_7

    const/4 v2, 0x0

    iput-boolean v2, p0, LnG8;->h:Z

    iget-object v2, v1, LwE8;->b:Ljava/lang/String;

    invoke-static {v2, v4}, LHE8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    iget-object v1, v1, LwE8;->a:Ljava/lang/String;

    invoke-static {v1, v3}, LHE8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v2, :cond_7

    if-eqz v1, :cond_7

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->u()Lec8;

    move-result-object p1

    const-string p2, "Ignoring call to log screen view event with duplicate parameters."

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    if-nez v3, :cond_8

    const-string v1, "null"

    goto :goto_2

    :cond_8
    move-object v1, v3

    :goto_2
    if-nez v4, :cond_9

    const-string v2, "null"

    goto :goto_3

    :cond_9
    move-object v2, v4

    :goto_3
    const-string v5, "Logging screen view with name, class"

    invoke-virtual {v0, v5, v1, v2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, LnG8;->c:LwE8;

    if-nez v0, :cond_a

    iget-object v0, p0, LnG8;->d:LwE8;

    goto :goto_4

    :cond_a
    iget-object v0, p0, LnG8;->c:LwE8;

    :goto_4
    new-instance v1, LwE8;

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->N()LOW8;

    move-result-object v2

    invoke-virtual {v2}, LOW8;->t0()J

    move-result-wide v5

    const/4 v7, 0x1

    move-object v2, v1

    move-wide v8, p2

    invoke-direct/range {v2 .. v9}, LwE8;-><init>(Ljava/lang/String;Ljava/lang/String;JZJ)V

    iput-object v1, p0, LnG8;->c:LwE8;

    iput-object v0, p0, LnG8;->d:LwE8;

    iput-object v1, p0, LnG8;->i:LwE8;

    iget-object p2, p0, Lns8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v10

    iget-object p2, p0, Lns8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->c()Ldn8;

    move-result-object p2

    new-instance p3, LTE8;

    move-object v5, p3

    move-object v6, p0

    move-object v7, p1

    move-object v8, v1

    move-object v9, v0

    invoke-direct/range {v5 .. v11}, LTE8;-><init>(LnG8;Landroid/os/Bundle;LwE8;LwE8;J)V

    invoke-virtual {p2, p3}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final F(Landroid/app/Activity;)LwE8;
    .locals 5

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LnG8;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LwE8;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Activity"

    invoke-virtual {p0, v0, v1}, LnG8;->q(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LwE8;

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->N()LOW8;

    move-result-object v2

    invoke-virtual {v2}, LOW8;->t0()J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-direct {v1, v4, v0, v2, v3}, LwE8;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object v0, p0, LnG8;->f:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    :cond_0
    iget-object p1, p0, LnG8;->i:LwE8;

    if-eqz p1, :cond_1

    iget-object p1, p0, LnG8;->i:LwE8;

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final G(Landroid/app/Activity;LwE8;Z)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v0, p2

    iget-object v1, v7, LnG8;->c:LwE8;

    if-nez v1, :cond_0

    iget-object v1, v7, LnG8;->d:LwE8;

    goto :goto_0

    :cond_0
    iget-object v1, v7, LnG8;->c:LwE8;

    :goto_0
    move-object v3, v1

    iget-object v1, v0, LwE8;->b:Ljava/lang/String;

    if-nez v1, :cond_2

    if-eqz p1, :cond_1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "Activity"

    invoke-virtual {v7, v1, v2}, LnG8;->q(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    move-object v10, v1

    new-instance v1, LwE8;

    iget-object v9, v0, LwE8;->a:Ljava/lang/String;

    iget-wide v11, v0, LwE8;->c:J

    iget-boolean v13, v0, LwE8;->e:Z

    iget-wide v14, v0, LwE8;->f:J

    move-object v8, v1

    invoke-direct/range {v8 .. v15}, LwE8;-><init>(Ljava/lang/String;Ljava/lang/String;JZJ)V

    move-object v2, v1

    goto :goto_2

    :cond_2
    move-object v2, v0

    :goto_2
    iget-object v0, v7, LnG8;->c:LwE8;

    iput-object v0, v7, LnG8;->d:LwE8;

    iput-object v2, v7, LnG8;->c:LwE8;

    iget-object v0, v7, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v4

    iget-object v0, v7, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v8

    new-instance v9, LfF8;

    move-object v0, v9

    move-object/from16 v1, p0

    move/from16 v6, p3

    invoke-direct/range {v0 .. v6}, LfF8;-><init>(LnG8;LwE8;LwE8;JZ)V

    invoke-virtual {v8, v9}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l(LwE8;LwE8;JZLandroid/os/Bundle;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    move-object/from16 v5, p6

    invoke-virtual {p0}, Lns8;->e()V

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v2, :cond_1

    iget-wide v8, v2, LwE8;->c:J

    iget-wide v10, v1, LwE8;->c:J

    cmp-long v8, v8, v10

    if-nez v8, :cond_1

    iget-object v8, v2, LwE8;->b:Ljava/lang/String;

    iget-object v9, v1, LwE8;->b:Ljava/lang/String;

    invoke-static {v8, v9}, LHE8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    iget-object v8, v2, LwE8;->a:Ljava/lang/String;

    iget-object v9, v1, LwE8;->a:Ljava/lang/String;

    invoke-static {v8, v9}, LHE8;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    move v8, v6

    goto :goto_1

    :cond_1
    :goto_0
    move v8, v7

    :goto_1
    if-eqz p5, :cond_2

    iget-object v9, v0, LnG8;->e:LwE8;

    if-eqz v9, :cond_2

    move v6, v7

    :cond_2
    if-eqz v8, :cond_c

    if-eqz v5, :cond_3

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_2

    :cond_3
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    :goto_2
    move-object v14, v8

    invoke-static {v1, v14, v7}, LOW8;->v(LwE8;Landroid/os/Bundle;Z)V

    if-eqz v2, :cond_6

    iget-object v5, v2, LwE8;->a:Ljava/lang/String;

    if-eqz v5, :cond_4

    const-string v8, "_pn"

    invoke-virtual {v14, v8, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object v5, v2, LwE8;->b:Ljava/lang/String;

    if-eqz v5, :cond_5

    const-string v8, "_pc"

    invoke-virtual {v14, v8, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget-wide v8, v2, LwE8;->c:J

    const-string v2, "_pi"

    invoke-virtual {v14, v2, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_6
    const-wide/16 v8, 0x0

    if-eqz v6, :cond_7

    iget-object v2, v0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->M()LcR8;

    move-result-object v2

    iget-object v2, v2, LcR8;->e:LyQ8;

    iget-wide v10, v2, LyQ8;->b:J

    sub-long v10, v3, v10

    iput-wide v3, v2, LyQ8;->b:J

    cmp-long v2, v10, v8

    if-lez v2, :cond_7

    iget-object v2, v0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->N()LOW8;

    move-result-object v2

    invoke-virtual {v2, v14, v10, v11}, LOW8;->t(Landroid/os/Bundle;J)V

    :cond_7
    iget-object v2, v0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->w()Lgl7;

    move-result-object v2

    invoke-virtual {v2}, Lgl7;->D()Z

    move-result v2

    if-nez v2, :cond_8

    const-string v2, "_mst"

    const-wide/16 v10, 0x1

    invoke-virtual {v14, v2, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_8
    iget-boolean v2, v1, LwE8;->e:Z

    if-eq v7, v2, :cond_9

    const-string v2, "auto"

    goto :goto_3

    :cond_9
    const-string v2, "app"

    :goto_3
    move-object v10, v2

    iget-object v2, v0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v11

    iget-boolean v2, v1, LwE8;->e:Z

    if-eqz v2, :cond_b

    move-wide/from16 p5, v11

    iget-wide v11, v1, LwE8;->f:J

    cmp-long v2, v11, v8

    if-nez v2, :cond_a

    goto :goto_4

    :cond_a
    move-wide v12, v11

    goto :goto_5

    :cond_b
    move-wide/from16 p5, v11

    :goto_4
    move-wide/from16 v12, p5

    :goto_5
    iget-object v2, v0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->I()LRC8;

    move-result-object v9

    const-string v11, "_vs"

    invoke-virtual/range {v9 .. v14}, LRC8;->s(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    :cond_c
    if-eqz v6, :cond_d

    iget-object v2, v0, LnG8;->e:LwE8;

    invoke-virtual {p0, v2, v7, v3, v4}, LnG8;->m(LwE8;ZJ)V

    :cond_d
    iput-object v1, v0, LnG8;->e:LwE8;

    iget-boolean v2, v1, LwE8;->e:Z

    if-eqz v2, :cond_e

    iput-object v1, v0, LnG8;->j:LwE8;

    :cond_e
    iget-object v2, v0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->L()LQM8;

    move-result-object v2

    invoke-virtual {v2, v1}, LQM8;->r(LwE8;)V

    return-void
.end method

.method public final m(LwE8;ZJ)V
    .locals 3

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->v()LaY7;

    move-result-object v0

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LaY7;->k(J)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-boolean v1, p1, LwE8;->d:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->M()LcR8;

    move-result-object v2

    iget-object v2, v2, LcR8;->e:LyQ8;

    invoke-virtual {v2, v1, p2, p3, p4}, LyQ8;->d(ZZJ)Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    iput-boolean v0, p1, LwE8;->d:Z

    :cond_1
    return-void
.end method

.method public final o()LwE8;
    .locals 1

    iget-object v0, p0, LnG8;->c:LwE8;

    return-object v0
.end method

.method public final p(Z)LwE8;
    .locals 0

    invoke-virtual {p0}, Lwe8;->f()V

    invoke-virtual {p0}, Lns8;->e()V

    if-nez p1, :cond_0

    iget-object p1, p0, LnG8;->e:LwE8;

    return-object p1

    :cond_0
    iget-object p1, p0, LnG8;->e:LwE8;

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    iget-object p1, p0, LnG8;->j:LwE8;

    return-object p1
.end method

.method public final q(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "Activity"

    return-object p1

    :cond_0
    const-string p2, "\\."

    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length p2, p1

    if-lez p2, :cond_1

    add-int/lit8 p2, p2, -0x1

    aget-object p1, p1, p2

    goto :goto_0

    :cond_1
    const-string p1, ""

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    const/16 v0, 0x64

    if-le p2, v0, :cond_2

    iget-object p2, p0, Lns8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->w()Lgl7;

    const/4 p2, 0x0

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public final v(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 5

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->D()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    return-void

    :cond_1
    const-string v0, "com.google.app_measurement.screen_service"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_2

    return-void

    :cond_2
    new-instance v0, LwE8;

    const-string v1, "name"

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "referrer_name"

    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "id"

    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, LwE8;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object p2, p0, LnG8;->f:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final w(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, LnG8;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LnG8;->g:Landroid/app/Activity;

    if-ne p1, v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, LnG8;->g:Landroid/app/Activity;

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->D()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LnG8;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final x(Landroid/app/Activity;)V
    .locals 4

    iget-object v0, p0, LnG8;->l:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, LnG8;->k:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, LnG8;->h:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->w()Lgl7;

    move-result-object v2

    invoke-virtual {v2}, Lgl7;->D()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iput-object v3, p0, LnG8;->c:LwE8;

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->c()Ldn8;

    move-result-object p1

    new-instance v2, LDF8;

    invoke-direct {v2, p0, v0, v1}, LDF8;-><init>(LnG8;J)V

    invoke-virtual {p1, v2}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LnG8;->F(Landroid/app/Activity;)LwE8;

    move-result-object p1

    iget-object v2, p0, LnG8;->c:LwE8;

    iput-object v2, p0, LnG8;->d:LwE8;

    iput-object v3, p0, LnG8;->c:LwE8;

    iget-object v2, p0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->c()Ldn8;

    move-result-object v2

    new-instance v3, LPF8;

    invoke-direct {v3, p0, p1, v0, v1}, LPF8;-><init>(LnG8;LwE8;J)V

    invoke-virtual {v2, v3}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final y(Landroid/app/Activity;)V
    .locals 4

    iget-object v0, p0, LnG8;->l:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LnG8;->k:Z

    iget-object v1, p0, LnG8;->g:Landroid/app/Activity;

    const/4 v2, 0x0

    if-eq p1, v1, :cond_0

    iget-object v1, p0, LnG8;->l:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iput-object p1, p0, LnG8;->g:Landroid/app/Activity;

    iput-boolean v2, p0, LnG8;->h:Z

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->w()Lgl7;

    move-result-object v1

    invoke-virtual {v1}, Lgl7;->D()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, LnG8;->i:LwE8;

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->c()Ldn8;

    move-result-object v1

    new-instance v3, LbG8;

    invoke-direct {v3, p0}, LbG8;-><init>(LnG8;)V

    invoke-virtual {v1, v3}, Ldn8;->w(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    invoke-virtual {v0}, Lgl7;->D()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p1, p0, LnG8;->i:LwE8;

    iput-object p1, p0, LnG8;->c:LwE8;

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->c()Ldn8;

    move-result-object p1

    new-instance v0, LrF8;

    invoke-direct {v0, p0}, LrF8;-><init>(LnG8;)V

    invoke-virtual {p1, v0}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, LnG8;->F(Landroid/app/Activity;)LwE8;

    move-result-object v0

    invoke-virtual {p0, p1, v0, v2}, LnG8;->G(Landroid/app/Activity;LwE8;Z)V

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->v()LaY7;

    move-result-object p1

    iget-object v0, p1, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p1, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->c()Ldn8;

    move-result-object v2

    new-instance v3, LSP7;

    invoke-direct {v3, p1, v0, v1}, LSP7;-><init>(LaY7;J)V

    invoke-virtual {v2, v3}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method
