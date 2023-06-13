.class public Lcom/google/android/gms/location/places/zzm;
.super Lcom/google/android/gms/location/places/internal/zzaa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/places/zzm$zzf;,
        Lcom/google/android/gms/location/places/zzm$zzc;,
        Lcom/google/android/gms/location/places/zzm$zzg;,
        Lcom/google/android/gms/location/places/zzm$zze;,
        Lcom/google/android/gms/location/places/zzm$zzd;,
        Lcom/google/android/gms/location/places/zzm$zzb;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "zzm"


# instance fields
.field private final zzal:Lcom/google/android/gms/location/places/zzm$zzd;

.field private final zzam:Lcom/google/android/gms/location/places/zzm$zzc;

.field private final zzan:Lcom/google/android/gms/location/places/zzm$zzg;

.field private final zzao:Lcom/google/android/gms/location/places/zzm$zzf;

.field private final zzap:Lcom/google/android/gms/location/places/zzm$zze;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/zzm$zzc;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzaa;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzal:Lcom/google/android/gms/location/places/zzm$zzd;

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzam:Lcom/google/android/gms/location/places/zzm$zzc;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzan:Lcom/google/android/gms/location/places/zzm$zzg;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzao:Lcom/google/android/gms/location/places/zzm$zzf;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzap:Lcom/google/android/gms/location/places/zzm$zze;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/zzm$zzd;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzaa;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzal:Lcom/google/android/gms/location/places/zzm$zzd;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzam:Lcom/google/android/gms/location/places/zzm$zzc;

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzan:Lcom/google/android/gms/location/places/zzm$zzg;

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzao:Lcom/google/android/gms/location/places/zzm$zzf;

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzap:Lcom/google/android/gms/location/places/zzm$zze;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/zzm$zze;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzaa;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzal:Lcom/google/android/gms/location/places/zzm$zzd;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzam:Lcom/google/android/gms/location/places/zzm$zzc;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzan:Lcom/google/android/gms/location/places/zzm$zzg;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzao:Lcom/google/android/gms/location/places/zzm$zzf;

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzap:Lcom/google/android/gms/location/places/zzm$zze;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/zzm$zzf;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzaa;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzal:Lcom/google/android/gms/location/places/zzm$zzd;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzam:Lcom/google/android/gms/location/places/zzm$zzc;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzan:Lcom/google/android/gms/location/places/zzm$zzg;

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzao:Lcom/google/android/gms/location/places/zzm$zzf;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzap:Lcom/google/android/gms/location/places/zzm$zze;

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzao:Lcom/google/android/gms/location/places/zzm$zzf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzal:Lcom/google/android/gms/location/places/zzm$zzd;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "placeEstimator cannot be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(ZLjava/lang/Object;)V

    if-nez p1, :cond_2

    sget-object p1, Lcom/google/android/gms/location/places/zzm;->TAG:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    const-string v1, "onPlaceEstimated received null DataHolder"

    invoke-static {p1, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzal:Lcom/google/android/gms/location/places/zzm$zzd;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->RESULT_INTERNAL_ERROR:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl;->setFailedResult(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->getMetadata()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_3

    const/16 v0, 0x64

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lcom/google/android/gms/location/places/PlaceLikelihoodBuffer;->zzb(Landroid/os/Bundle;)I

    move-result v0

    :goto_1
    new-instance v1, Lcom/google/android/gms/location/places/PlaceLikelihoodBuffer;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/location/places/PlaceLikelihoodBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iget-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzal:Lcom/google/android/gms/location/places/zzm$zzd;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    if-nez p1, :cond_1

    sget-object p1, Lcom/google/android/gms/location/places/zzm;->TAG:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    const-string v1, "onAutocompletePrediction received null DataHolder"

    invoke-static {p1, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzam:Lcom/google/android/gms/location/places/zzm$zzc;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->RESULT_INTERNAL_ERROR:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BaseImplementation$ApiMethodImpl;->setFailedResult(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/location/places/zzm;->zzam:Lcom/google/android/gms/location/places/zzm$zzc;

    new-instance v1, Lcom/google/android/gms/location/places/AutocompletePredictionBuffer;

    invoke-direct {v1, p1}, Lcom/google/android/gms/location/places/AutocompletePredictionBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_1

    sget-object p1, Lcom/google/android/gms/location/places/zzm;->TAG:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {p1, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    const-string v2, "onPlaceUserDataFetched received null DataHolder"

    invoke-static {p1, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    sget-object p1, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS_CACHE:Lcom/google/android/gms/common/api/Status;

    throw v0

    :cond_1
    new-instance v1, Lht8;

    invoke-direct {v1, p1}, Lht8;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    throw v0
.end method

.method public final zze(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/location/places/PlaceBuffer;

    invoke-direct {v0, p1}, Lcom/google/android/gms/location/places/PlaceBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iget-object p1, p0, Lcom/google/android/gms/location/places/zzm;->zzap:Lcom/google/android/gms/location/places/zzm$zze;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
