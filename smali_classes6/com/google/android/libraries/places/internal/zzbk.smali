.class public final Lcom/google/android/libraries/places/internal/zzbk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzel;


# instance fields
.field private final zza:Lcom/google/android/libraries/places/internal/zzet;

.field private final zzb:Lcom/google/android/libraries/places/internal/zzex;

.field private final zzc:Lcom/google/android/libraries/places/internal/zzem;


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/places/internal/zzex;Lcom/google/android/libraries/places/internal/zzet;Lcom/google/android/libraries/places/internal/zzem;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzbk;->zzb:Lcom/google/android/libraries/places/internal/zzex;

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzbk;->zza:Lcom/google/android/libraries/places/internal/zzet;

    iput-object p3, p0, Lcom/google/android/libraries/places/internal/zzbk;->zzc:Lcom/google/android/libraries/places/internal/zzem;

    return-void
.end method

.method public static final zzi(Lcom/google/android/gms/tasks/Task;)I
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x2

    return p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p0, Lcom/google/android/gms/common/api/ApiException;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/android/gms/common/api/ApiException;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/common/api/ApiException;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0xd

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, v2, p0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    move-object p0, v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/ApiException;->getStatusCode()I

    move-result p0

    const/4 v0, 0x7

    if-eq p0, v0, :cond_3

    const/16 v0, 0xf

    if-eq p0, v0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x3

    return p0

    :cond_3
    const/4 p0, 0x4

    return p0
.end method

.method private final zzj()Lcom/google/android/libraries/places/internal/zzzk;
    .locals 4

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzbk;->zzc:Lcom/google/android/libraries/places/internal/zzem;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzem;->zzb()Ljava/util/Locale;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzzm;->zza()Lcom/google/android/libraries/places/internal/zzzk;

    move-result-object v2

    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/libraries/places/internal/zzzk;->zzd(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzzk;

    invoke-virtual {v0, v1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/libraries/places/internal/zzzk;->zzb(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzzk;

    :cond_0
    return-object v2
.end method

.method private final zzk(Lcom/google/android/libraries/places/internal/zzwt;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzbk;->zza:Lcom/google/android/libraries/places/internal/zzet;

    invoke-static {v0}, Lcom/google/android/libraries/places/internal/zzey;->zzb(Lcom/google/android/libraries/places/internal/zzet;)Lcom/google/android/libraries/places/internal/zzxv;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxv;->zzl(I)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzxv;->zze(Lcom/google/android/libraries/places/internal/zzwt;)Lcom/google/android/libraries/places/internal/zzxv;

    iget-object p1, p0, Lcom/google/android/libraries/places/internal/zzbk;->zzc:Lcom/google/android/libraries/places/internal/zzem;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzem;->zza()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzxv;->zza(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzya;

    invoke-direct {p0, p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzl(Lcom/google/android/libraries/places/internal/zzya;)V

    return-void
.end method

.method private final zzl(Lcom/google/android/libraries/places/internal/zzya;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzey;->zza(Lcom/google/android/libraries/places/internal/zzya;)Lcom/google/android/libraries/places/internal/zzlg;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzbk;->zzb:Lcom/google/android/libraries/places/internal/zzex;

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzex;->zza(Lcom/google/android/libraries/places/internal/zzlg;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/libraries/places/api/net/FetchPhotoRequest;)V
    .locals 2

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzze;->zza()Lcom/google/android/libraries/places/internal/zzzc;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/google/android/libraries/places/internal/zzzc;->zza(I)Lcom/google/android/libraries/places/internal/zzzc;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzze;

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzbk;->zza:Lcom/google/android/libraries/places/internal/zzet;

    invoke-static {v0}, Lcom/google/android/libraries/places/internal/zzey;->zzb(Lcom/google/android/libraries/places/internal/zzet;)Lcom/google/android/libraries/places/internal/zzxv;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzxv;->zzl(I)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzxv;->zzg(Lcom/google/android/libraries/places/internal/zzze;)Lcom/google/android/libraries/places/internal/zzxv;

    iget-object p1, p0, Lcom/google/android/libraries/places/internal/zzbk;->zzc:Lcom/google/android/libraries/places/internal/zzem;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzem;->zza()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzxv;->zza(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzya;

    invoke-direct {p0, p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzl(Lcom/google/android/libraries/places/internal/zzya;)V

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/tasks/Task;JJ)V
    .locals 2

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzwt;->zza()Lcom/google/android/libraries/places/internal/zzwo;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzwo;->zzf(I)Lcom/google/android/libraries/places/internal/zzwo;

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzi(Lcom/google/android/gms/tasks/Task;)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzwo;->zze(I)Lcom/google/android/libraries/places/internal/zzwo;

    sub-long/2addr p4, p2

    long-to-int p1, p4

    invoke-virtual {v0, p1}, Lcom/google/android/libraries/places/internal/zzwo;->zzd(I)Lcom/google/android/libraries/places/internal/zzwo;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzwt;

    invoke-direct {p0, p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzk(Lcom/google/android/libraries/places/internal/zzwt;)V

    return-void
.end method

.method public final zzc(Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;)V
    .locals 4

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzyh;->zza()Lcom/google/android/libraries/places/internal/zzyg;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzyg;->zza(I)Lcom/google/android/libraries/places/internal/zzyg;

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzzg;->zza()Lcom/google/android/libraries/places/internal/zzzf;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;->getPlaceFields()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/libraries/places/internal/zzdy;->zzb(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/libraries/places/internal/zzzf;->zza(Ljava/lang/Iterable;)Lcom/google/android/libraries/places/internal/zzzf;

    invoke-virtual {v2}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object v2

    check-cast v2, Lcom/google/android/libraries/places/internal/zzzg;

    invoke-virtual {v0, v2}, Lcom/google/android/libraries/places/internal/zzyg;->zzb(Lcom/google/android/libraries/places/internal/zzzg;)Lcom/google/android/libraries/places/internal/zzyg;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/internal/zzyh;

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzbk;->zzj()Lcom/google/android/libraries/places/internal/zzzk;

    move-result-object v2

    const/4 v3, 0x5

    invoke-virtual {v2, v3}, Lcom/google/android/libraries/places/internal/zzzk;->zze(I)Lcom/google/android/libraries/places/internal/zzzk;

    invoke-virtual {v2, v0}, Lcom/google/android/libraries/places/internal/zzzk;->zzc(Lcom/google/android/libraries/places/internal/zzyh;)Lcom/google/android/libraries/places/internal/zzzk;

    invoke-virtual {v2}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/internal/zzzm;

    iget-object v2, p0, Lcom/google/android/libraries/places/internal/zzbk;->zza:Lcom/google/android/libraries/places/internal/zzet;

    invoke-static {v2}, Lcom/google/android/libraries/places/internal/zzey;->zzb(Lcom/google/android/libraries/places/internal/zzet;)Lcom/google/android/libraries/places/internal/zzxv;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/libraries/places/internal/zzxv;->zzl(I)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {v2, v0}, Lcom/google/android/libraries/places/internal/zzxv;->zzh(Lcom/google/android/libraries/places/internal/zzzm;)Lcom/google/android/libraries/places/internal/zzxv;

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzbk;->zzc:Lcom/google/android/libraries/places/internal/zzem;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzem;->zza()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/libraries/places/internal/zzxv;->zza(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/net/FetchPlaceRequest;->getSessionToken()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/libraries/places/internal/zzxv;->zzj(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzxv;

    :cond_0
    invoke-virtual {v2}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzya;

    invoke-direct {p0, p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzl(Lcom/google/android/libraries/places/internal/zzya;)V

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/tasks/Task;JJ)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzwh;->zza()Lcom/google/android/libraries/places/internal/zzwg;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/libraries/places/internal/zzwg;->zza(I)Lcom/google/android/libraries/places/internal/zzwg;

    invoke-virtual {v1, v0}, Lcom/google/android/libraries/places/internal/zzwg;->zzb(I)Lcom/google/android/libraries/places/internal/zzwg;

    invoke-virtual {v1}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/internal/zzwh;

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzwt;->zza()Lcom/google/android/libraries/places/internal/zzwo;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/google/android/libraries/places/internal/zzwo;->zzf(I)Lcom/google/android/libraries/places/internal/zzwo;

    invoke-virtual {v1, v0}, Lcom/google/android/libraries/places/internal/zzwo;->zzc(Lcom/google/android/libraries/places/internal/zzwh;)Lcom/google/android/libraries/places/internal/zzwo;

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzi(Lcom/google/android/gms/tasks/Task;)I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/google/android/libraries/places/internal/zzwo;->zze(I)Lcom/google/android/libraries/places/internal/zzwo;

    sub-long/2addr p4, p2

    long-to-int p1, p4

    invoke-virtual {v1, p1}, Lcom/google/android/libraries/places/internal/zzwo;->zzd(I)Lcom/google/android/libraries/places/internal/zzwo;

    invoke-virtual {v1}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzwt;

    invoke-direct {p0, p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzk(Lcom/google/android/libraries/places/internal/zzwt;)V

    return-void
.end method

.method public final zze(Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest;)V
    .locals 3

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzwy;->zza()Lcom/google/android/libraries/places/internal/zzwx;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest;->getTypeFilter()Lcom/google/android/libraries/places/api/model/TypeFilter;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/google/android/libraries/places/internal/zzdz;->zza(Lcom/google/android/libraries/places/api/model/TypeFilter;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/libraries/places/internal/zzwx;->zza(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzwx;

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/internal/zzwy;

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzxk;->zza()Lcom/google/android/libraries/places/internal/zzxj;

    move-result-object v1

    if-eqz v0, :cond_1

    invoke-virtual {v1, v0}, Lcom/google/android/libraries/places/internal/zzxj;->zza(Lcom/google/android/libraries/places/internal/zzwy;)Lcom/google/android/libraries/places/internal/zzxj;

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/internal/zzxk;

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzbk;->zzj()Lcom/google/android/libraries/places/internal/zzzk;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/google/android/libraries/places/internal/zzzk;->zze(I)Lcom/google/android/libraries/places/internal/zzzk;

    invoke-virtual {v1, v0}, Lcom/google/android/libraries/places/internal/zzzk;->zza(Lcom/google/android/libraries/places/internal/zzxk;)Lcom/google/android/libraries/places/internal/zzzk;

    invoke-virtual {v1}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/internal/zzzm;

    iget-object v1, p0, Lcom/google/android/libraries/places/internal/zzbk;->zza:Lcom/google/android/libraries/places/internal/zzet;

    invoke-static {v1}, Lcom/google/android/libraries/places/internal/zzey;->zzb(Lcom/google/android/libraries/places/internal/zzet;)Lcom/google/android/libraries/places/internal/zzxv;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/android/libraries/places/internal/zzxv;->zzl(I)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {v1, v0}, Lcom/google/android/libraries/places/internal/zzxv;->zzh(Lcom/google/android/libraries/places/internal/zzzm;)Lcom/google/android/libraries/places/internal/zzxv;

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzbk;->zzc:Lcom/google/android/libraries/places/internal/zzem;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzem;->zza()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/libraries/places/internal/zzxv;->zza(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest;->getSessionToken()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/libraries/places/internal/zzxv;->zzj(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzxv;

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzya;

    invoke-direct {p0, p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzl(Lcom/google/android/libraries/places/internal/zzya;)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/tasks/Task;JJ)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;->getAutocompletePredictions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Lcom/google/android/libraries/places/internal/zzwc;->zza()Lcom/google/android/libraries/places/internal/zzwb;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/libraries/places/internal/zzwb;->zza(I)Lcom/google/android/libraries/places/internal/zzwb;

    invoke-virtual {v1}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/internal/zzwc;

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzwt;->zza()Lcom/google/android/libraries/places/internal/zzwo;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/google/android/libraries/places/internal/zzwo;->zzf(I)Lcom/google/android/libraries/places/internal/zzwo;

    invoke-virtual {v1, v0}, Lcom/google/android/libraries/places/internal/zzwo;->zzb(Lcom/google/android/libraries/places/internal/zzwc;)Lcom/google/android/libraries/places/internal/zzwo;

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzi(Lcom/google/android/gms/tasks/Task;)I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/google/android/libraries/places/internal/zzwo;->zze(I)Lcom/google/android/libraries/places/internal/zzwo;

    sub-long/2addr p4, p2

    long-to-int p1, p4

    invoke-virtual {v1, p1}, Lcom/google/android/libraries/places/internal/zzwo;->zzd(I)Lcom/google/android/libraries/places/internal/zzwo;

    invoke-virtual {v1}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzwt;

    invoke-direct {p0, p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzk(Lcom/google/android/libraries/places/internal/zzwt;)V

    return-void
.end method

.method public final zzg(Lcom/google/android/libraries/places/api/net/FindCurrentPlaceRequest;Lcom/google/android/gms/tasks/Task;JJ)V
    .locals 2

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p2

    const/4 v0, 0x1

    if-eq v0, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    invoke-static {}, Lcom/google/android/libraries/places/internal/zzyo;->zza()Lcom/google/android/libraries/places/internal/zzym;

    move-result-object p2

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzzg;->zza()Lcom/google/android/libraries/places/internal/zzzf;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/libraries/places/api/net/FindCurrentPlaceRequest;->getPlaceFields()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzdy;->zzb(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/libraries/places/internal/zzzf;->zza(Ljava/lang/Iterable;)Lcom/google/android/libraries/places/internal/zzzf;

    invoke-virtual {v1}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzzg;

    invoke-virtual {p2, p1}, Lcom/google/android/libraries/places/internal/zzym;->zzb(Lcom/google/android/libraries/places/internal/zzzg;)Lcom/google/android/libraries/places/internal/zzym;

    sub-long/2addr p5, p3

    long-to-int p1, p5

    invoke-virtual {p2, p1}, Lcom/google/android/libraries/places/internal/zzym;->zza(I)Lcom/google/android/libraries/places/internal/zzym;

    invoke-virtual {p2, v0}, Lcom/google/android/libraries/places/internal/zzym;->zzc(I)Lcom/google/android/libraries/places/internal/zzym;

    invoke-virtual {p2}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzyo;

    iget-object p2, p0, Lcom/google/android/libraries/places/internal/zzbk;->zza:Lcom/google/android/libraries/places/internal/zzet;

    invoke-static {p2}, Lcom/google/android/libraries/places/internal/zzey;->zzb(Lcom/google/android/libraries/places/internal/zzet;)Lcom/google/android/libraries/places/internal/zzxv;

    move-result-object p2

    const/4 p3, 0x6

    invoke-virtual {p2, p3}, Lcom/google/android/libraries/places/internal/zzxv;->zzl(I)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {p2, p1}, Lcom/google/android/libraries/places/internal/zzxv;->zzd(Lcom/google/android/libraries/places/internal/zzyo;)Lcom/google/android/libraries/places/internal/zzxv;

    iget-object p1, p0, Lcom/google/android/libraries/places/internal/zzbk;->zzc:Lcom/google/android/libraries/places/internal/zzem;

    invoke-virtual {p1}, Lcom/google/android/libraries/places/internal/zzem;->zza()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/libraries/places/internal/zzxv;->zza(Ljava/lang/String;)Lcom/google/android/libraries/places/internal/zzxv;

    invoke-virtual {p2}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzya;

    invoke-direct {p0, p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzl(Lcom/google/android/libraries/places/internal/zzya;)V

    return-void
.end method

.method public final zzh(Lcom/google/android/gms/tasks/Task;JJ)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/api/net/FindCurrentPlaceResponse;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/api/net/FindCurrentPlaceResponse;->getPlaceLikelihoods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Lcom/google/android/libraries/places/internal/zzvv;->zza()Lcom/google/android/libraries/places/internal/zzvu;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/libraries/places/internal/zzvu;->zza(I)Lcom/google/android/libraries/places/internal/zzvu;

    invoke-virtual {v1}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/internal/zzvv;

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzwt;->zza()Lcom/google/android/libraries/places/internal/zzwo;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/google/android/libraries/places/internal/zzwo;->zzf(I)Lcom/google/android/libraries/places/internal/zzwo;

    invoke-virtual {v1, v0}, Lcom/google/android/libraries/places/internal/zzwo;->zza(Lcom/google/android/libraries/places/internal/zzvv;)Lcom/google/android/libraries/places/internal/zzwo;

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzi(Lcom/google/android/gms/tasks/Task;)I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/google/android/libraries/places/internal/zzwo;->zze(I)Lcom/google/android/libraries/places/internal/zzwo;

    sub-long/2addr p4, p2

    long-to-int p1, p4

    invoke-virtual {v1, p1}, Lcom/google/android/libraries/places/internal/zzwo;->zzd(I)Lcom/google/android/libraries/places/internal/zzwo;

    invoke-virtual {v1}, Lcom/google/android/libraries/places/internal/zzadh;->zzt()Lcom/google/android/libraries/places/internal/zzadk;

    move-result-object p1

    check-cast p1, Lcom/google/android/libraries/places/internal/zzwt;

    invoke-direct {p0, p1}, Lcom/google/android/libraries/places/internal/zzbk;->zzk(Lcom/google/android/libraries/places/internal/zzwt;)V

    return-void
.end method
