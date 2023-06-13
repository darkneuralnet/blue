.class public final Lcom/google/android/gms/internal/gtm/zzcf;
.super Lcom/google/android/gms/internal/gtm/zzbs;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field private final zza:Lcom/google/android/gms/internal/gtm/zzav;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gtm/zzbv;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gtm/zzbs;-><init>(Lcom/google/android/gms/internal/gtm/zzbv;)V

    new-instance p1, Lcom/google/android/gms/internal/gtm/zzav;

    invoke-direct {p1}, Lcom/google/android/gms/internal/gtm/zzav;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzcf;->zza:Lcom/google/android/gms/internal/gtm/zzav;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/gtm/zzav;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzW()V

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzcf;->zza:Lcom/google/android/gms/internal/gtm/zzav;

    return-object v0
.end method

.method public final zzd()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzq()LQl9;

    move-result-object v0

    invoke-virtual {v0}, LQl9;->c()Lcom/google/android/gms/internal/gtm/zzav;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzcf;->zza:Lcom/google/android/gms/internal/gtm/zzav;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gtm/zzav;->zzh(Lcom/google/android/gms/internal/gtm/zzav;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzB()Lcom/google/android/gms/internal/gtm/zzft;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzW()V

    iget-object v1, v0, Lcom/google/android/gms/internal/gtm/zzft;->zzb:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzcf;->zza:Lcom/google/android/gms/internal/gtm/zzav;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/gtm/zzav;->zzk(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbs;->zzW()V

    iget-object v0, v0, Lcom/google/android/gms/internal/gtm/zzft;->zza:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzcf;->zza:Lcom/google/android/gms/internal/gtm/zzav;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/gtm/zzav;->zzl(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
