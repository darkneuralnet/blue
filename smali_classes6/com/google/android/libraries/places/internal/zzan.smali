.class public final Lcom/google/android/libraries/places/internal/zzan;
.super Lcom/google/android/libraries/places/internal/zzadk;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzaes;


# static fields
.field private static final zzb:Lcom/google/android/libraries/places/internal/zzan;


# instance fields
.field private zze:I

.field private zzf:Z

.field private zzg:J

.field private zzh:J

.field private zzi:I

.field private zzj:F

.field private zzk:F

.field private zzl:Z

.field private zzm:F

.field private zzn:D

.field private zzo:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/places/internal/zzan;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzan;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzan;->zzb:Lcom/google/android/libraries/places/internal/zzan;

    const-class v1, Lcom/google/android/libraries/places/internal/zzan;

    invoke-static {v1, v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzG(Ljava/lang/Class;Lcom/google/android/libraries/places/internal/zzadk;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzadk;-><init>()V

    return-void
.end method

.method public static synthetic zza()Lcom/google/android/libraries/places/internal/zzan;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzan;->zzb:Lcom/google/android/libraries/places/internal/zzan;

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
    sget-object p1, Lcom/google/android/libraries/places/internal/zzan;->zzb:Lcom/google/android/libraries/places/internal/zzan;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/libraries/places/internal/zzal;

    invoke-direct {p1, p2}, Lcom/google/android/libraries/places/internal/zzal;-><init>(Lcom/google/android/libraries/places/internal/zzak;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/places/internal/zzan;

    invoke-direct {p1}, Lcom/google/android/libraries/places/internal/zzan;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xd

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

    sget-object p2, Lcom/google/android/libraries/places/internal/zzam;->zza:Lcom/google/android/libraries/places/internal/zzadn;

    aput-object p2, p1, p3

    const/4 p3, 0x6

    const-string v0, "zzj"

    aput-object v0, p1, p3

    const/4 p3, 0x7

    const-string v0, "zzk"

    aput-object v0, p1, p3

    const/16 p3, 0x8

    const-string v0, "zzl"

    aput-object v0, p1, p3

    const/16 p3, 0x9

    const-string v0, "zzm"

    aput-object v0, p1, p3

    const/16 p3, 0xa

    const-string v0, "zzn"

    aput-object v0, p1, p3

    const/16 p3, 0xb

    const-string v0, "zzo"

    aput-object v0, p1, p3

    const/16 p3, 0xc

    aput-object p2, p1, p3

    sget-object p2, Lcom/google/android/libraries/places/internal/zzan;->zzb:Lcom/google/android/libraries/places/internal/zzan;

    const-string p3, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u100c\u0003\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1007\u0006\u0008\u1001\u0007\t\u1000\u0008\n\u100c\t"

    invoke-static {p2, p3, p1}, Lcom/google/android/libraries/places/internal/zzadk;->zzF(Lcom/google/android/libraries/places/internal/zzaer;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
