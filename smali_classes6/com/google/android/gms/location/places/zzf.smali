.class public final Lcom/google/android/gms/location/places/zzf;
.super Lcom/google/android/gms/location/places/internal/zzy;
.source "SourceFile"


# instance fields
.field private final zzn:Lcom/google/android/gms/location/places/zzg;

.field private final zzo:Lcom/google/android/gms/location/places/zze;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/location/places/zze;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzy;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzf;->zzn:Lcom/google/android/gms/location/places/zzg;

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzf;->zzo:Lcom/google/android/gms/location/places/zze;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/zzg;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzy;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzf;->zzn:Lcom/google/android/gms/location/places/zzg;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzf;->zzo:Lcom/google/android/gms/location/places/zze;

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/location/places/PlacePhotoMetadataResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/places/zzf;->zzn:Lcom/google/android/gms/location/places/zzg;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/location/places/PlacePhotoResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/places/zzf;->zzo:Lcom/google/android/gms/location/places/zze;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
