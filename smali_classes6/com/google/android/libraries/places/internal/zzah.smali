.class public final Lcom/google/android/libraries/places/internal/zzah;
.super Lcom/google/android/libraries/places/internal/zzadk;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzaes;


# static fields
.field private static final zzb:Lcom/google/android/libraries/places/internal/zzah;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:J

.field private zzh:J

.field private zzi:J

.field private zzj:F

.field private zzk:Z

.field private zzl:Lcom/google/android/libraries/places/internal/zzadr;

.field private zzm:Lcom/google/android/libraries/places/internal/zzadr;

.field private zzn:Lcom/google/android/libraries/places/internal/zzadr;

.field private zzo:I

.field private zzp:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/places/internal/zzah;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzah;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzah;->zzb:Lcom/google/android/libraries/places/internal/zzah;

    const-class v1, Lcom/google/android/libraries/places/internal/zzah;

    invoke-static {v1, v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzG(Ljava/lang/Class;Lcom/google/android/libraries/places/internal/zzadk;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzadk;-><init>()V

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzadk;->zzB()Lcom/google/android/libraries/places/internal/zzadr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/places/internal/zzah;->zzl:Lcom/google/android/libraries/places/internal/zzadr;

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzadk;->zzB()Lcom/google/android/libraries/places/internal/zzadr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/places/internal/zzah;->zzm:Lcom/google/android/libraries/places/internal/zzadr;

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzadk;->zzB()Lcom/google/android/libraries/places/internal/zzadr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/places/internal/zzah;->zzn:Lcom/google/android/libraries/places/internal/zzadr;

    return-void
.end method

.method public static synthetic zza()Lcom/google/android/libraries/places/internal/zzah;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzah;->zzb:Lcom/google/android/libraries/places/internal/zzah;

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
    sget-object p1, Lcom/google/android/libraries/places/internal/zzah;->zzb:Lcom/google/android/libraries/places/internal/zzah;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/libraries/places/internal/zzag;

    invoke-direct {p1, p2}, Lcom/google/android/libraries/places/internal/zzag;-><init>(Lcom/google/android/libraries/places/internal/zzaf;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/places/internal/zzah;

    invoke-direct {p1}, Lcom/google/android/libraries/places/internal/zzah;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xf

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    sget-object p2, Lcom/google/android/libraries/places/internal/zzao;->zza:Lcom/google/android/libraries/places/internal/zzadn;

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-class p3, Lcom/google/android/libraries/places/internal/zzan;

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string v0, "zzn"

    aput-object v0, p1, p2

    const/16 p2, 0xc

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzp"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/libraries/places/internal/zzah;->zzb:Lcom/google/android/libraries/places/internal/zzah;

    const-string p3, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0003\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1001\u0004\u0006\u1007\u0005\u0007\u001a\u0008\u001b\t\u001b\n\u1004\u0006\u000b\u1002\u0007"

    invoke-static {p2, p3, p1}, Lcom/google/android/libraries/places/internal/zzadk;->zzF(Lcom/google/android/libraries/places/internal/zzaer;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
