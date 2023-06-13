.class public final LIh8;
.super LBs8;
.source "SourceFile"


# static fields
.field public static final y:Landroid/util/Pair;


# instance fields
.field public c:Landroid/content/SharedPreferences;

.field public d:Leh8;

.field public final e:Lzg8;

.field public final f:Lzg8;

.field public final g:Lsh8;

.field public h:Ljava/lang/String;

.field public i:Z

.field public j:J

.field public final k:Lzg8;

.field public final l:LVf8;

.field public final m:Lsh8;

.field public final n:LVf8;

.field public final o:Lzg8;

.field public final p:Lzg8;

.field public q:Z

.field public final r:LVf8;

.field public final s:LVf8;

.field public final t:Lzg8;

.field public final u:Lsh8;

.field public final v:Lsh8;

.field public final w:Lzg8;

.field public final x:Ljg8;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/Pair;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, ""

    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, LIh8;->y:Landroid/util/Pair;

    return-void
.end method

.method public constructor <init>(LPn8;)V
    .locals 5

    invoke-direct {p0, p1}, LBs8;-><init>(LPn8;)V

    new-instance p1, Lzg8;

    const-wide/32 v0, 0x1b7740

    const-string v2, "session_timeout"

    invoke-direct {p1, p0, v2, v0, v1}, Lzg8;-><init>(LIh8;Ljava/lang/String;J)V

    iput-object p1, p0, LIh8;->k:Lzg8;

    new-instance p1, LVf8;

    const/4 v0, 0x1

    const-string v1, "start_new_session"

    invoke-direct {p1, p0, v1, v0}, LVf8;-><init>(LIh8;Ljava/lang/String;Z)V

    iput-object p1, p0, LIh8;->l:LVf8;

    new-instance p1, Lzg8;

    const-string v0, "last_pause_time"

    const-wide/16 v1, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lzg8;-><init>(LIh8;Ljava/lang/String;J)V

    iput-object p1, p0, LIh8;->o:Lzg8;

    new-instance p1, Lzg8;

    const-string v0, "session_id"

    invoke-direct {p1, p0, v0, v1, v2}, Lzg8;-><init>(LIh8;Ljava/lang/String;J)V

    iput-object p1, p0, LIh8;->p:Lzg8;

    new-instance p1, Lsh8;

    const-string v0, "non_personalized_ads"

    const/4 v3, 0x0

    invoke-direct {p1, p0, v0, v3}, Lsh8;-><init>(LIh8;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, LIh8;->m:Lsh8;

    new-instance p1, LVf8;

    const-string v0, "allow_remote_dynamite"

    const/4 v4, 0x0

    invoke-direct {p1, p0, v0, v4}, LVf8;-><init>(LIh8;Ljava/lang/String;Z)V

    iput-object p1, p0, LIh8;->n:LVf8;

    new-instance p1, Lzg8;

    const-string v0, "first_open_time"

    invoke-direct {p1, p0, v0, v1, v2}, Lzg8;-><init>(LIh8;Ljava/lang/String;J)V

    iput-object p1, p0, LIh8;->e:Lzg8;

    new-instance p1, Lzg8;

    const-string v0, "app_install_time"

    invoke-direct {p1, p0, v0, v1, v2}, Lzg8;-><init>(LIh8;Ljava/lang/String;J)V

    iput-object p1, p0, LIh8;->f:Lzg8;

    new-instance p1, Lsh8;

    const-string v0, "app_instance_id"

    invoke-direct {p1, p0, v0, v3}, Lsh8;-><init>(LIh8;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, LIh8;->g:Lsh8;

    new-instance p1, LVf8;

    const-string v0, "app_backgrounded"

    invoke-direct {p1, p0, v0, v4}, LVf8;-><init>(LIh8;Ljava/lang/String;Z)V

    iput-object p1, p0, LIh8;->r:LVf8;

    new-instance p1, LVf8;

    const-string v0, "deep_link_retrieval_complete"

    invoke-direct {p1, p0, v0, v4}, LVf8;-><init>(LIh8;Ljava/lang/String;Z)V

    iput-object p1, p0, LIh8;->s:LVf8;

    new-instance p1, Lzg8;

    const-string v0, "deep_link_retrieval_attempts"

    invoke-direct {p1, p0, v0, v1, v2}, Lzg8;-><init>(LIh8;Ljava/lang/String;J)V

    iput-object p1, p0, LIh8;->t:Lzg8;

    new-instance p1, Lsh8;

    const-string v0, "firebase_feature_rollouts"

    invoke-direct {p1, p0, v0, v3}, Lsh8;-><init>(LIh8;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, LIh8;->u:Lsh8;

    new-instance p1, Lsh8;

    const-string v0, "deferred_attribution_cache"

    invoke-direct {p1, p0, v0, v3}, Lsh8;-><init>(LIh8;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, LIh8;->v:Lsh8;

    new-instance p1, Lzg8;

    const-string v0, "deferred_attribution_cache_timestamp"

    invoke-direct {p1, p0, v0, v1, v2}, Lzg8;-><init>(LIh8;Ljava/lang/String;J)V

    iput-object p1, p0, LIh8;->w:Lzg8;

    new-instance p1, Ljg8;

    const-string v0, "default_event_parameters"

    invoke-direct {p1, p0, v0, v3}, Ljg8;-><init>(LIh8;Ljava/lang/String;Landroid/os/Bundle;)V

    iput-object p1, p0, LIh8;->x:Ljg8;

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 9

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.google.android.gms.measurement.prefs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, LIh8;->c:Landroid/content/SharedPreferences;

    const-string v1, "has_been_opened"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, LIh8;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LIh8;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    new-instance v0, Leh8;

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->w()Lgl7;

    sget-object v1, La98;->e:LL88;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    const-string v5, "health_monitor"

    const/4 v8, 0x0

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Leh8;-><init>(LIh8;Ljava/lang/String;JLOg8;)V

    iput-object v0, p0, LIh8;->d:Leh8;

    return-void
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l()Landroid/content/SharedPreferences;
    .locals 1

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, LBs8;->h()V

    iget-object v0, p0, LIh8;->c:Landroid/content/SharedPreferences;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LIh8;->c:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final m(Ljava/lang/String;)Landroid/util/Pair;
    .locals 6

    const-string v0, ""

    invoke-virtual {p0}, Lns8;->e()V

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v1

    iget-object v3, p0, LIh8;->h:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-wide v4, p0, LIh8;->j:J

    cmp-long v4, v1, v4

    if-ltz v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/util/Pair;

    iget-boolean v0, p0, LIh8;->i:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p1, v3, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_1
    :goto_0
    iget-object v3, p0, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->w()Lgl7;

    move-result-object v3

    sget-object v4, La98;->c:LL88;

    invoke-virtual {v3, p1, v4}, Lgl7;->o(Ljava/lang/String;LL88;)J

    move-result-wide v3

    add-long/2addr v1, v3

    iput-wide v1, p0, LIh8;->j:J

    const/4 p1, 0x1

    invoke-static {p1}, Lm8;->b(Z)V

    :try_start_0
    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->z()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lm8;->a(Landroid/content/Context;)Lm8$a;

    move-result-object p1

    iput-object v0, p0, LIh8;->h:Ljava/lang/String;

    invoke-virtual {p1}, Lm8$a;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iput-object v1, p0, LIh8;->h:Ljava/lang/String;

    :cond_2
    invoke-virtual {p1}, Lm8$a;->b()Z

    move-result p1

    iput-boolean p1, p0, LIh8;->i:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->n()Lec8;

    move-result-object v1

    const-string v2, "Unable to get advertising id"

    invoke-virtual {v1, v2, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, LIh8;->h:Ljava/lang/String;

    :goto_1
    const/4 p1, 0x0

    invoke-static {p1}, Lm8;->b(Z)V

    new-instance p1, Landroid/util/Pair;

    iget-object v0, p0, LIh8;->h:Ljava/lang/String;

    iget-boolean v1, p0, LIh8;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final n()LXm7;
    .locals 3

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "consent_settings"

    const-string v2, "G1"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LXm7;->b(Ljava/lang/String;)LXm7;

    move-result-object v0

    return-object v0
.end method

.method public final o()Ljava/lang/Boolean;
    .locals 3

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "measurement_enabled"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final p(Ljava/lang/Boolean;)V
    .locals 2

    invoke-virtual {p0}, Lns8;->e()V

    invoke-virtual {p0}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "measurement_enabled"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final q(Z)V
    .locals 3

    invoke-virtual {p0}, Lns8;->e()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "App measurement setting deferred collection"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "deferred_analytics_collection"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final r()Z
    .locals 2

    iget-object v0, p0, LIh8;->c:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v1, "deferred_analytics_collection"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final s(J)Z
    .locals 2

    iget-object v0, p0, LIh8;->k:Lzg8;

    invoke-virtual {v0}, Lzg8;->a()J

    move-result-wide v0

    sub-long/2addr p1, v0

    iget-object v0, p0, LIh8;->o:Lzg8;

    invoke-virtual {v0}, Lzg8;->a()J

    move-result-wide v0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final t(I)Z
    .locals 3

    invoke-virtual {p0}, LIh8;->l()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "consent_source"

    const/16 v2, 0x64

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {p1, v0}, LXm7;->j(II)Z

    move-result p1

    return p1
.end method
