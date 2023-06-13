.class public final LVG8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LhS7;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzaw;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;LhS7;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LVG8;->e:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iput-object p2, p0, LVG8;->b:LhS7;

    iput-object p3, p0, LVG8;->c:Lcom/google/android/gms/measurement/internal/zzaw;

    iput-object p4, p0, LVG8;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LVG8;->e:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->L()LQM8;

    move-result-object v0

    iget-object v1, p0, LVG8;->b:LhS7;

    iget-object v2, p0, LVG8;->c:Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v3, p0, LVG8;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, LQM8;->m(LhS7;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V

    return-void
.end method
