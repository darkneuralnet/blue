.class public final Lcom/google/android/libraries/places/internal/zzc;
.super Lcom/google/android/libraries/places/internal/zzadk;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzaes;


# static fields
.field private static final zzb:Lcom/google/android/libraries/places/internal/zzc;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/libraries/places/internal/zzae;

.field private zzg:Lcom/google/android/libraries/places/internal/zzj;

.field private zzh:Lcom/google/android/libraries/places/internal/zzl;

.field private zzi:Lcom/google/android/libraries/places/internal/zzg;

.field private zzj:Lcom/google/android/libraries/places/internal/zzs;

.field private zzk:Lcom/google/android/libraries/places/internal/zze;

.field private zzl:Lcom/google/android/libraries/places/internal/zzp;

.field private zzm:Lcom/google/android/libraries/places/internal/zzw;

.field private zzn:Lcom/google/android/libraries/places/internal/zzu;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/places/internal/zzc;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzc;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzc;->zzb:Lcom/google/android/libraries/places/internal/zzc;

    const-class v1, Lcom/google/android/libraries/places/internal/zzc;

    invoke-static {v1, v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzG(Ljava/lang/Class;Lcom/google/android/libraries/places/internal/zzadk;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzadk;-><init>()V

    return-void
.end method

.method public static synthetic zza()Lcom/google/android/libraries/places/internal/zzc;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzc;->zzb:Lcom/google/android/libraries/places/internal/zzc;

    return-object v0
.end method


# virtual methods
.method public final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 p2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/google/android/libraries/places/internal/zzc;->zzb:Lcom/google/android/libraries/places/internal/zzc;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/libraries/places/internal/zzb;

    invoke-direct {p1, p2}, Lcom/google/android/libraries/places/internal/zzb;-><init>(Lcom/google/android/libraries/places/internal/zza;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/places/internal/zzc;

    invoke-direct {p1}, Lcom/google/android/libraries/places/internal/zzc;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xa

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const-string p2, "zzi"

    aput-object p2, p1, v0

    const-string p2, "zzj"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzn"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/libraries/places/internal/zzc;->zzb:Lcom/google/android/libraries/places/internal/zzc;

    const-string p3, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004\u0006\u1009\u0005\u0007\u1009\u0006\u0008\u1009\u0007\t\u1009\u0008"

    invoke-static {p2, p3, p1}, Lcom/google/android/libraries/places/internal/zzadk;->zzF(Lcom/google/android/libraries/places/internal/zzaer;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
