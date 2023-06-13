.class final Lcom/google/android/libraries/places/internal/zzdv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private addressComponents:[Lcom/google/android/libraries/places/internal/zzdv$zza;

.field private businessStatus:Ljava/lang/String;

.field private formattedAddress:Ljava/lang/String;

.field private geometry:Lcom/google/android/libraries/places/internal/zzdv$zzb;

.field private icon:Ljava/lang/String;

.field private iconBackgroundColor:Ljava/lang/String;

.field private iconMaskBaseUri:Ljava/lang/String;

.field private internationalPhoneNumber:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private openingHours:Lcom/google/android/libraries/places/internal/zzdv$zzc;

.field private photos:[Lcom/google/android/libraries/places/internal/zzdv$zzd;

.field private placeId:Ljava/lang/String;

.field private plusCode:Lcom/google/android/libraries/places/internal/zzdv$zze;

.field private priceLevel:Ljava/lang/Integer;

.field private rating:Ljava/lang/Double;

.field private types:[Ljava/lang/String;

.field private userRatingsTotal:Ljava/lang/Integer;

.field private utcOffset:Ljava/lang/Integer;

.field private website:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/libraries/places/internal/zzdv$zzb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->geometry:Lcom/google/android/libraries/places/internal/zzdv$zzb;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/libraries/places/internal/zzdv$zzc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->openingHours:Lcom/google/android/libraries/places/internal/zzdv$zzc;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/libraries/places/internal/zzdv$zze;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->plusCode:Lcom/google/android/libraries/places/internal/zzdv$zze;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/libraries/places/internal/zzhs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->addressComponents:[Lcom/google/android/libraries/places/internal/zzdv$zza;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/libraries/places/internal/zzhs;->zzl([Ljava/lang/Object;)Lcom/google/android/libraries/places/internal/zzhs;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zze()Lcom/google/android/libraries/places/internal/zzhs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->photos:[Lcom/google/android/libraries/places/internal/zzdv$zzd;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/libraries/places/internal/zzhs;->zzl([Ljava/lang/Object;)Lcom/google/android/libraries/places/internal/zzhs;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzf()Lcom/google/android/libraries/places/internal/zzhs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->types:[Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/libraries/places/internal/zzhs;->zzl([Ljava/lang/Object;)Lcom/google/android/libraries/places/internal/zzhs;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzg()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->rating:Ljava/lang/Double;

    return-object v0
.end method

.method public final zzh()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->priceLevel:Ljava/lang/Integer;

    return-object v0
.end method

.method public final zzi()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->userRatingsTotal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final zzj()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->utcOffset:Ljava/lang/Integer;

    return-object v0
.end method

.method public final zzk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->businessStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final zzl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->formattedAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final zzm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->iconBackgroundColor:Ljava/lang/String;

    return-object v0
.end method

.method public final zzn()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->iconMaskBaseUri:Ljava/lang/String;

    return-object v0
.end method

.method public final zzo()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->internationalPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final zzp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final zzq()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->placeId:Ljava/lang/String;

    return-object v0
.end method

.method public final zzr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzdv;->website:Ljava/lang/String;

    return-object v0
.end method
