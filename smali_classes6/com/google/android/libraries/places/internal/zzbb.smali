.class public final Lcom/google/android/libraries/places/internal/zzbb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lcom/google/android/libraries/places/internal/zzas;

.field private static final zzb:Lcom/google/android/libraries/places/internal/zzbb;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/libraries/places/internal/zzav;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzav;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzbb;->zza:Lcom/google/android/libraries/places/internal/zzas;

    new-instance v0, Lcom/google/android/libraries/places/internal/zzbb;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/google/android/libraries/places/internal/zzbb;-><init>(J)V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzbb;->zzb:Lcom/google/android/libraries/places/internal/zzbb;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zza()Lcom/google/android/libraries/places/internal/zzbb;
    .locals 3

    new-instance v0, Lcom/google/android/libraries/places/internal/zzbb;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/google/android/libraries/places/internal/zzbb;-><init>(J)V

    return-object v0
.end method
