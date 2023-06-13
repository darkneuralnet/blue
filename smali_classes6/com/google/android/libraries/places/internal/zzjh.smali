.class final Lcom/google/android/libraries/places/internal/zzjh;
.super Lcom/google/android/libraries/places/internal/zzjk;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/util/Map;

.field private final zzb:Ljava/util/Map;

.field private final zzc:Lcom/google/android/libraries/places/internal/zzjj;

.field private final zzd:Lcom/google/android/libraries/places/internal/zzji;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/libraries/places/internal/zzjg;Lcom/google/android/libraries/places/internal/zzjd;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzjk;-><init>()V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzjh;->zza:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/libraries/places/internal/zzjh;->zzb:Ljava/util/Map;

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzjg;->zze(Lcom/google/android/libraries/places/internal/zzjg;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzjg;->zzf(Lcom/google/android/libraries/places/internal/zzjg;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzjg;->zzc(Lcom/google/android/libraries/places/internal/zzjg;)Lcom/google/android/libraries/places/internal/zzjj;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/libraries/places/internal/zzjh;->zzc:Lcom/google/android/libraries/places/internal/zzjj;

    invoke-static {p1}, Lcom/google/android/libraries/places/internal/zzjg;->zzb(Lcom/google/android/libraries/places/internal/zzjg;)Lcom/google/android/libraries/places/internal/zzji;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzjh;->zzd:Lcom/google/android/libraries/places/internal/zzji;

    return-void
.end method
