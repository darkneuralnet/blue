.class public final LaP8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LaP8;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;II)I
    .locals 5

    iget-object p2, p0, LaP8;->a:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p2, v0, v0}, LPn8;->H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)LPn8;

    move-result-object p2

    invoke-virtual {p2}, LPn8;->a()LFc8;

    move-result-object v0

    const/4 v1, 0x2

    if-nez p1, :cond_0

    invoke-virtual {v0}, LFc8;->t()Lec8;

    move-result-object p1

    const-string p2, "AppMeasurementService started with null intent"

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, LPn8;->C()LFg7;

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "Local AppMeasurementService called. startId, action"

    invoke-virtual {p2, v4, v3, v2}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, LtO8;

    invoke-direct {p2, p0, p3, v0, p1}, LtO8;-><init>(LaP8;ILFc8;Landroid/content/Intent;)V

    invoke-virtual {p0, p2}, LaP8;->h(Ljava/lang/Runnable;)V

    :cond_1
    return v1
.end method

.method public final b(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-virtual {p0}, LaP8;->k()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string v1, "onBind called with null intent"

    invoke-virtual {p1, v1}, Lec8;->a(Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v1, "com.google.android.gms.measurement.START"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p1, Lcs8;

    iget-object v1, p0, LaP8;->a:Landroid/content/Context;

    invoke-static {v1}, LhV8;->f0(Landroid/content/Context;)LhV8;

    move-result-object v1

    invoke-direct {p1, v1, v0}, Lcs8;-><init>(LhV8;Ljava/lang/String;)V

    return-object p1

    :cond_1
    invoke-virtual {p0}, LaP8;->k()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->t()Lec8;

    move-result-object v1

    const-string v2, "onBind received unknown action"

    invoke-virtual {v1, v2, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final synthetic c(ILFc8;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, LaP8;->a:Landroid/content/Context;

    check-cast v0, LPO8;

    invoke-interface {v0, p1}, LPO8;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, LFc8;->s()Lec8;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "Local AppMeasurementService processed last upload request. StartId"

    invoke-virtual {p2, v0, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LaP8;->k()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->s()Lec8;

    move-result-object p1

    const-string p2, "Completed wakeful intent."

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    iget-object p1, p0, LaP8;->a:Landroid/content/Context;

    check-cast p1, LPO8;

    invoke-interface {p1, p3}, LPO8;->b(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public final synthetic d(LFc8;Landroid/app/job/JobParameters;)V
    .locals 1

    invoke-virtual {p1}, LFc8;->s()Lec8;

    move-result-object p1

    const-string v0, "AppMeasurementJobService processed last upload request."

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    iget-object p1, p0, LaP8;->a:Landroid/content/Context;

    check-cast p1, LPO8;

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, LPO8;->c(Landroid/app/job/JobParameters;Z)V

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, LaP8;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, LPn8;->H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)LPn8;

    move-result-object v0

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v0}, LPn8;->C()LFg7;

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "Local AppMeasurementService is starting up"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, LaP8;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, LPn8;->H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)LPn8;

    move-result-object v0

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v0}, LPn8;->C()LFg7;

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "Local AppMeasurementService is shutting down"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final g(Landroid/content/Intent;)V
    .locals 2

    if-nez p1, :cond_0

    invoke-virtual {p0}, LaP8;->k()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string v0, "onRebind called with null intent"

    invoke-virtual {p1, v0}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LaP8;->k()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "onRebind called. action"

    invoke-virtual {v0, v1, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Ljava/lang/Runnable;)V
    .locals 3

    iget-object v0, p0, LaP8;->a:Landroid/content/Context;

    invoke-static {v0}, LhV8;->f0(Landroid/content/Context;)LhV8;

    move-result-object v0

    invoke-virtual {v0}, LhV8;->c()Ldn8;

    move-result-object v1

    new-instance v2, LEO8;

    invoke-direct {v2, p0, v0, p1}, LEO8;-><init>(LaP8;LhV8;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i(Landroid/app/job/JobParameters;)Z
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    iget-object v0, p0, LaP8;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, LPn8;->H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)LPn8;

    move-result-object v0

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v2

    const-string v3, "action"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, LPn8;->C()LFg7;

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v3, "Local AppMeasurementJobService called. action"

    invoke-virtual {v0, v3, v2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LhO8;

    invoke-direct {v0, p0, v1, p1}, LhO8;-><init>(LaP8;LFc8;Landroid/app/job/JobParameters;)V

    invoke-virtual {p0, v0}, LaP8;->h(Ljava/lang/Runnable;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final j(Landroid/content/Intent;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-virtual {p0}, LaP8;->k()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string v1, "onUnbind called with null intent"

    invoke-virtual {p1, v1}, Lec8;->a(Ljava/lang/String;)V

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LaP8;->k()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->s()Lec8;

    move-result-object v1

    const-string v2, "onUnbind called for intent. action"

    invoke-virtual {v1, v2, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return v0
.end method

.method public final k()LFc8;
    .locals 2

    iget-object v0, p0, LaP8;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, LPn8;->H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)LPn8;

    move-result-object v0

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    return-object v0
.end method
