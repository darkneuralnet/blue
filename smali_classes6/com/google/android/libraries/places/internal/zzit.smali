.class public final Lcom/google/android/libraries/places/internal/zzit;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lcom/google/android/libraries/places/internal/zzix;

.field public static final zzb:Lcom/google/android/libraries/places/internal/zzix;

.field public static final zzc:Lcom/google/android/libraries/places/internal/zzix;

.field public static final zzd:Lcom/google/android/libraries/places/internal/zzix;

.field public static final zze:Lcom/google/android/libraries/places/internal/zzix;

.field public static final zzf:Lcom/google/android/libraries/places/internal/zzix;

.field public static final zzg:Lcom/google/android/libraries/places/internal/zzix;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "cause"

    const-class v1, Ljava/lang/Throwable;

    invoke-static {v0, v1}, Lcom/google/android/libraries/places/internal/zzix;->zza(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/libraries/places/internal/zzix;

    move-result-object v0

    sput-object v0, Lcom/google/android/libraries/places/internal/zzit;->zza:Lcom/google/android/libraries/places/internal/zzix;

    const-string v0, "ratelimit_count"

    const-class v1, Ljava/lang/Integer;

    invoke-static {v0, v1}, Lcom/google/android/libraries/places/internal/zzix;->zza(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/libraries/places/internal/zzix;

    move-result-object v0

    sput-object v0, Lcom/google/android/libraries/places/internal/zzit;->zzb:Lcom/google/android/libraries/places/internal/zzix;

    const-string v0, "ratelimit_period"

    const-class v1, Lcom/google/android/libraries/places/internal/zziw;

    invoke-static {v0, v1}, Lcom/google/android/libraries/places/internal/zzix;->zza(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/libraries/places/internal/zzix;

    move-result-object v0

    sput-object v0, Lcom/google/android/libraries/places/internal/zzit;->zzc:Lcom/google/android/libraries/places/internal/zzix;

    new-instance v0, Lcom/google/android/libraries/places/internal/zzir;

    const-class v1, Ljava/lang/Object;

    const/4 v2, 0x1

    const-string v3, "group_by"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/libraries/places/internal/zzir;-><init>(Ljava/lang/String;Ljava/lang/Class;Z)V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzit;->zzd:Lcom/google/android/libraries/places/internal/zzix;

    const-string v0, "forced"

    const-class v1, Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lcom/google/android/libraries/places/internal/zzix;->zza(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/libraries/places/internal/zzix;

    move-result-object v0

    sput-object v0, Lcom/google/android/libraries/places/internal/zzit;->zze:Lcom/google/android/libraries/places/internal/zzix;

    new-instance v0, Lcom/google/android/libraries/places/internal/zzis;

    const-class v1, Lcom/google/android/libraries/places/internal/zzkr;

    const/4 v2, 0x0

    const-string v3, "tags"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/libraries/places/internal/zzis;-><init>(Ljava/lang/String;Ljava/lang/Class;Z)V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzit;->zzf:Lcom/google/android/libraries/places/internal/zzix;

    const-string v0, "stack_size"

    const-class v1, Lcom/google/android/libraries/places/internal/zziy;

    invoke-static {v0, v1}, Lcom/google/android/libraries/places/internal/zzix;->zza(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/libraries/places/internal/zzix;

    move-result-object v0

    sput-object v0, Lcom/google/android/libraries/places/internal/zzit;->zzg:Lcom/google/android/libraries/places/internal/zzix;

    return-void
.end method
