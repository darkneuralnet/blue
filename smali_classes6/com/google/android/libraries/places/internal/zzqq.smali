.class public final Lcom/google/android/libraries/places/internal/zzqq;
.super Lcom/google/android/libraries/places/internal/zzadk;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzaes;


# static fields
.field private static final zzb:Lcom/google/android/libraries/places/internal/zzqq;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/libraries/places/internal/zzqn;

.field private zzg:Lcom/google/android/libraries/places/internal/zzadr;

.field private zzh:Lcom/google/android/libraries/places/internal/zzpz;

.field private zzi:Lcom/google/android/libraries/places/internal/zzpz;

.field private zzj:Lcom/google/android/libraries/places/internal/zzmv;

.field private zzk:I

.field private zzl:Lcom/google/android/libraries/places/internal/zzqb;

.field private zzm:Lcom/google/android/libraries/places/internal/zzpx;

.field private zzn:Lcom/google/android/libraries/places/internal/zzpu;

.field private zzo:Lcom/google/android/libraries/places/internal/zzqd;

.field private zzp:Lcom/google/android/libraries/places/internal/zzadr;

.field private zzq:Lcom/google/android/libraries/places/internal/zzps;

.field private zzr:Lcom/google/android/libraries/places/internal/zzqf;

.field private zzs:Lcom/google/android/libraries/places/internal/zzpj;

.field private zzt:Lcom/google/android/libraries/places/internal/zzrd;

.field private zzu:Lcom/google/android/libraries/places/internal/zzrf;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/places/internal/zzqq;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzqq;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzqq;->zzb:Lcom/google/android/libraries/places/internal/zzqq;

    const-class v1, Lcom/google/android/libraries/places/internal/zzqq;

    invoke-static {v1, v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzG(Ljava/lang/Class;Lcom/google/android/libraries/places/internal/zzadk;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzadk;-><init>()V

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzadk;->zzB()Lcom/google/android/libraries/places/internal/zzadr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/places/internal/zzqq;->zzg:Lcom/google/android/libraries/places/internal/zzadr;

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzadk;->zzB()Lcom/google/android/libraries/places/internal/zzadr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/places/internal/zzqq;->zzp:Lcom/google/android/libraries/places/internal/zzadr;

    return-void
.end method

.method public static synthetic zza()Lcom/google/android/libraries/places/internal/zzqq;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzqq;->zzb:Lcom/google/android/libraries/places/internal/zzqq;

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
    sget-object p1, Lcom/google/android/libraries/places/internal/zzqq;->zzb:Lcom/google/android/libraries/places/internal/zzqq;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/libraries/places/internal/zzqo;

    invoke-direct {p1, p2}, Lcom/google/android/libraries/places/internal/zzqo;-><init>(Lcom/google/android/libraries/places/internal/zzph;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/places/internal/zzqq;

    invoke-direct {p1}, Lcom/google/android/libraries/places/internal/zzqq;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x14

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v2

    const-class p2, Lcom/google/android/libraries/places/internal/zzqs;

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

    sget-object p3, Lcom/google/android/libraries/places/internal/zzqp;->zza:Lcom/google/android/libraries/places/internal/zzadn;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-class p3, Lcom/google/android/libraries/places/internal/zzqj;

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzt"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zzu"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/libraries/places/internal/zzqq;->zzb:Lcom/google/android/libraries/places/internal/zzqq;

    const-string p3, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u1009\u0002\u0005\u1009\u0003\u0006\u100c\u0004\u0007\u1009\u0005\u0008\u1009\u0006\t\u1009\u0007\n\u1009\u0008\u000b\u001b\u000c\u1009\t\r\u1009\n\u000e\u1009\u000b\u000f\u1009\u000c\u0010\u1009\r"

    invoke-static {p2, p3, p1}, Lcom/google/android/libraries/places/internal/zzadk;->zzF(Lcom/google/android/libraries/places/internal/zzaer;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
