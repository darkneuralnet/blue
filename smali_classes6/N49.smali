.class public final LN49;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LhS7;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;LhS7;)V
    .locals 0

    iput-object p1, p0, LN49;->c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iput-object p2, p0, LN49;->b:LhS7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LN49;->c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v0}, LPn8;->N()LOW8;

    move-result-object v0

    iget-object v1, p0, LN49;->b:LhS7;

    iget-object v2, p0, LN49;->c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LPn8;

    invoke-virtual {v2}, LPn8;->k()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, LOW8;->E(LhS7;Z)V

    return-void
.end method
