.class public Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;
.super LYQ7;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation


# instance fields
.field public a:LPn8;
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field

.field public final b:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LYQ7;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    new-instance v0, Lso;

    invoke-direct {v0}, Lso;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public beginAdUnitExposure(Ljava/lang/String;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->v()LaY7;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LaY7;->i(Ljava/lang/String;J)V

    return-void
.end method

.method public clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LRC8;->l(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public clearMeasurementEnabled(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p1}, LPn8;->I()LRC8;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LRC8;->I(Ljava/lang/Boolean;)V

    return-void
.end method

.method public final d5(LhS7;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->N()LOW8;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LOW8;->K(LhS7;Ljava/lang/String;)V

    return-void
.end method

.method public endAdUnitExposure(Ljava/lang/String;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->v()LaY7;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LaY7;->j(Ljava/lang/String;J)V

    return-void
.end method

.method public generateEventId(LhS7;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->N()LOW8;

    move-result-object v0

    invoke-virtual {v0}, LOW8;->t0()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v2}, LPn8;->N()LOW8;

    move-result-object v2

    invoke-virtual {v2, p1, v0, v1}, LOW8;->J(LhS7;J)V

    return-void
.end method

.method public getAppInstanceId(LhS7;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    new-instance v1, LqA8;

    invoke-direct {v1, p0, p1}, LqA8;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;LhS7;)V

    invoke-virtual {v0, v1}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCachedAppInstanceId(LhS7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0}, LRC8;->V()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->d5(LhS7;Ljava/lang/String;)V

    return-void
.end method

.method public getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;LhS7;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    new-instance v1, LmZ8;

    invoke-direct {v1, p0, p3, p1, p2}, LmZ8;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;LhS7;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCurrentScreenClass(LhS7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0}, LRC8;->W()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->d5(LhS7;Ljava/lang/String;)V

    return-void
.end method

.method public getCurrentScreenName(LhS7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0}, LRC8;->X()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->d5(LhS7;Ljava/lang/String;)V

    return-void
.end method

.method public getGmpAppId(LhS7;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->O()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->O()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->z()Landroid/content/Context;

    move-result-object v1

    iget-object v2, v0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->R()Ljava/lang/String;

    move-result-object v2

    const-string v3, "google_app_id"

    invoke-static {v1, v3, v2}, LjE8;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v2, "getGoogleAppId failed with exception"

    invoke-virtual {v0, v2, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->d5(LhS7;Ljava/lang/String;)V

    return-void
.end method

.method public getMaxUserProperties(Ljava/lang/String;LhS7;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0, p1}, LRC8;->Q(Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p1}, LPn8;->N()LOW8;

    move-result-object p1

    const/16 v0, 0x19

    invoke-virtual {p1, p2, v0}, LOW8;->I(LhS7;I)V

    return-void
.end method

.method public getSessionId(LhS7;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->c()Ldn8;

    move-result-object v1

    new-instance v2, Lvz8;

    invoke-direct {v2, v0, p1}, Lvz8;-><init>(LRC8;LhS7;)V

    invoke-virtual {v1, v2}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getTestFlag(LhS7;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    if-eqz p2, :cond_4

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->N()LOW8;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0}, LRC8;->R()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p2, p1, v0}, LOW8;->E(LhS7;Z)V

    return-void

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->N()LOW8;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0}, LRC8;->T()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, p1, v0}, LOW8;->I(LhS7;I)V

    return-void

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->N()LOW8;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0}, LRC8;->S()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "r"

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    :try_start_0
    invoke-interface {p1, v2}, LhS7;->W0(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p2, Lns8;->a:LPn8;

    invoke-virtual {p2}, LPn8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->t()Lec8;

    move-result-object p2

    const-string v0, "Error returning double value to wrapper"

    invoke-virtual {p2, v0, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->N()LOW8;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0}, LRC8;->U()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p2, p1, v0, v1}, LOW8;->J(LhS7;J)V

    return-void

    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->N()LOW8;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0}, LRC8;->Y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, LOW8;->K(LhS7;Ljava/lang/String;)V

    return-void
.end method

.method public getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLhS7;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    new-instance v7, LvN8;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p4

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, LvN8;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;LhS7;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public initForTests(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    return-void
.end method

.method public initialize(LWO1;Lcom/google/android/gms/internal/measurement/zzcl;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    if-nez v0, :cond_0

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p1, p2, p3}, LPn8;->H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)LPn8;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    return-void

    :cond_0
    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->t()Lec8;

    move-result-object p1

    const-string p2, "Attempting to initialize multiple times"

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return-void
.end method

.method public isDataCollectionEnabled(LhS7;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    new-instance v1, LN49;

    invoke-direct {v1, p0, p1}, LN49;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;LhS7;)V

    invoke-virtual {v0, v1}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v1}, LPn8;->I()LRC8;

    move-result-object v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    move-wide/from16 v8, p6

    invoke-virtual/range {v2 .. v9}, LRC8;->p(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method

.method public logEventAndBundle(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;LhS7;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    if-eqz p3, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_0
    const-string v4, "app"

    const-string v1, "_o"

    invoke-virtual {v0, v1, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzaw;

    new-instance v3, Lcom/google/android/gms/measurement/internal/zzau;

    invoke-direct {v3, p3}, Lcom/google/android/gms/measurement/internal/zzau;-><init>(Landroid/os/Bundle;)V

    move-object v1, v0

    move-object v2, p2

    move-wide v5, p5

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzau;Ljava/lang/String;J)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->c()Ldn8;

    move-result-object p2

    new-instance p3, LVG8;

    invoke-direct {p3, p0, p4, v0, p1}, LVG8;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;LhS7;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logHealthData(ILjava/lang/String;LWO1;LWO1;LWO1;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    const/4 v0, 0x0

    if-nez p3, :cond_0

    move-object v6, v0

    goto :goto_0

    :cond_0
    invoke-static {p3}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p3

    move-object v6, p3

    :goto_0
    if-nez p4, :cond_1

    move-object v7, v0

    goto :goto_1

    :cond_1
    invoke-static {p4}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p3

    move-object v7, p3

    :goto_1
    if-nez p5, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p5}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    move-object v8, v0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p3}, LPn8;->a()LFc8;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    move v2, p1

    move-object v5, p2

    invoke-virtual/range {v1 .. v8}, LFc8;->G(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityCreated(LWO1;Landroid/os/Bundle;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p3}, LPn8;->I()LRC8;

    move-result-object p3

    iget-object p3, p3, LRC8;->c:LGC8;

    if-eqz p3, :cond_0

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p4}, LPn8;->I()LRC8;

    move-result-object p4

    invoke-virtual {p4}, LRC8;->m()V

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p3, p1, p2}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public onActivityDestroyed(LWO1;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->I()LRC8;

    move-result-object p2

    iget-object p2, p2, LRC8;->c:LGC8;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p3}, LPn8;->I()LRC8;

    move-result-object p3

    invoke-virtual {p3}, LRC8;->m()V

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityDestroyed(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityPaused(LWO1;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->I()LRC8;

    move-result-object p2

    iget-object p2, p2, LRC8;->c:LGC8;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p3}, LPn8;->I()LRC8;

    move-result-object p3

    invoke-virtual {p3}, LRC8;->m()V

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityPaused(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityResumed(LWO1;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->I()LRC8;

    move-result-object p2

    iget-object p2, p2, LRC8;->c:LGC8;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p3}, LPn8;->I()LRC8;

    move-result-object p3

    invoke-virtual {p3}, LRC8;->m()V

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityResumed(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(LWO1;LhS7;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p3}, LPn8;->I()LRC8;

    move-result-object p3

    iget-object p3, p3, LRC8;->c:LGC8;

    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0}, LRC8;->m()V

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p3, p1, p4}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    :try_start_0
    invoke-interface {p2, p4}, LhS7;->W0(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->a()LFc8;

    move-result-object p2

    invoke-virtual {p2}, LFc8;->t()Lec8;

    move-result-object p2

    const-string p3, "Error returning bundle value to wrapper"

    invoke-virtual {p2, p3, p1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityStarted(LWO1;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->I()LRC8;

    move-result-object p2

    iget-object p2, p2, LRC8;->c:LGC8;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->I()LRC8;

    move-result-object p2

    invoke-virtual {p2}, LRC8;->m()V

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    :cond_0
    return-void
.end method

.method public onActivityStopped(LWO1;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->I()LRC8;

    move-result-object p2

    iget-object p2, p2, LRC8;->c:LGC8;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->I()LRC8;

    move-result-object p2

    invoke-virtual {p2}, LRC8;->m()V

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    :cond_0
    return-void
.end method

.method public performAction(Landroid/os/Bundle;LhS7;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, LhS7;->W0(Landroid/os/Bundle;)V

    return-void
.end method

.method public registerOnMeasurementEventListener(LbT7;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    invoke-interface {p1}, LbT7;->zzd()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfv8;

    if-nez v1, :cond_0

    new-instance v1, Lmd9;

    invoke-direct {v1, p0, p1}, Lmd9;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;LbT7;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    invoke-interface {p1}, LbT7;->zzd()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p1}, LPn8;->I()LRC8;

    move-result-object p1

    invoke-virtual {p1, v1}, LRC8;->u(Lfv8;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public resetAnalyticsData(J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LRC8;->v(J)V

    return-void
.end method

.method public setConditionalUserProperty(Landroid/os/Bundle;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->o()Lec8;

    move-result-object p1

    const-string p2, "Conditional user property must not be null"

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LRC8;->E(Landroid/os/Bundle;J)V

    return-void
.end method

.method public setConsent(Landroid/os/Bundle;J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->c()Ldn8;

    move-result-object v1

    new-instance v2, LUv8;

    invoke-direct {v2, v0, p1, p2, p3}, LUv8;-><init>(LRC8;Landroid/os/Bundle;J)V

    invoke-virtual {v1, v2}, Ldn8;->x(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setConsentThirdParty(Landroid/os/Bundle;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    const/16 v1, -0x14

    invoke-virtual {v0, p1, v1, p2, p3}, LRC8;->F(Landroid/os/Bundle;IJ)V

    return-void
.end method

.method public setCurrentScreen(LWO1;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p4}, LPn8;->K()LnG8;

    move-result-object p4

    invoke-static {p1}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p4, p1, p2, p3}, LnG8;->D(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setDataCollectionEnabled(Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    invoke-virtual {v0}, Lwe8;->f()V

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->c()Ldn8;

    move-result-object v1

    new-instance v2, LjC8;

    invoke-direct {v2, v0, p1}, LjC8;-><init>(LRC8;Z)V

    invoke-virtual {v1, v2}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setDefaultEventParameters(Landroid/os/Bundle;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p1, v1

    :goto_0
    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->c()Ldn8;

    move-result-object v1

    new-instance v2, Lhw8;

    invoke-direct {v2, v0, p1}, Lhw8;-><init>(LRC8;Landroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setEventInterceptor(LbT7;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    new-instance v0, Ln99;

    invoke-direct {v0, p0, p1}, Ln99;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;LbT7;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p1}, LPn8;->c()Ldn8;

    move-result-object p1

    invoke-virtual {p1}, Ldn8;->B()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p1}, LPn8;->I()LRC8;

    move-result-object p1

    invoke-virtual {p1, v0}, LRC8;->H(LSu8;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p1}, LPn8;->c()Ldn8;

    move-result-object p1

    new-instance v1, LyT8;

    invoke-direct {v1, p0, v0}, LyT8;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Ln99;)V

    invoke-virtual {p1, v1}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setInstanceIdProvider(LET7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    return-void
.end method

.method public setMeasurementEnabled(ZJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p2}, LPn8;->I()LRC8;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, LRC8;->I(Ljava/lang/Boolean;)V

    return-void
.end method

.method public setMinimumSessionDuration(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    return-void
.end method

.method public setSessionTimeoutDuration(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v0

    iget-object v1, v0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->c()Ldn8;

    move-result-object v1

    new-instance v2, Lhx8;

    invoke-direct {v2, v0, p1, p2}, Lhx8;-><init>(LRC8;J)V

    invoke-virtual {v1, v2}, Ldn8;->w(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setUserId(Ljava/lang/String;J)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->I()LRC8;

    move-result-object v1

    if-eqz p1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, v1, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->a()LFc8;

    move-result-object p1

    invoke-virtual {p1}, LFc8;->t()Lec8;

    move-result-object p1

    const-string p2, "User ID must be non-empty or null"

    invoke-virtual {p1, p2}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, v1, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->c()Ldn8;

    move-result-object v0

    new-instance v2, Lvw8;

    invoke-direct {v2, v1, p1}, Lvw8;-><init>(LRC8;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ldn8;->w(Ljava/lang/Runnable;)V

    const/4 v2, 0x0

    const-string v3, "_id"

    const/4 v5, 0x1

    move-object v4, p1

    move-wide v6, p2

    invoke-virtual/range {v1 .. v7}, LRC8;->L(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    return-void
.end method

.method public setUserProperty(Ljava/lang/String;Ljava/lang/String;LWO1;ZJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    invoke-static {p3}, LVd3;->d5(LWO1;)Ljava/lang/Object;

    move-result-object v3

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p3}, LPn8;->I()LRC8;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, LRC8;->L(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    return-void
.end method

.method public unregisterOnMeasurementEventListener(LbT7;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    invoke-interface {p1}, LbT7;->zzd()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfv8;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    new-instance v1, Lmd9;

    invoke-direct {v1, p0, p1}, Lmd9;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;LbT7;)V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {p1}, LPn8;->I()LRC8;

    move-result-object p1

    invoke-virtual {p1, v1}, LRC8;->N(Lfv8;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final zzb()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempting to perform action before initialize."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
