.class public final Lcom/google/android/libraries/places/internal/zzyo;
.super Lcom/google/android/libraries/places/internal/zzadk;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzaes;


# static fields
.field private static final zzb:Lcom/google/android/libraries/places/internal/zzyo;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/libraries/places/internal/zzwy;

.field private zzg:I

.field private zzh:I

.field private zzi:Lcom/google/android/libraries/places/internal/zzzg;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/places/internal/zzyo;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzyo;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzyo;->zzb:Lcom/google/android/libraries/places/internal/zzyo;

    const-class v1, Lcom/google/android/libraries/places/internal/zzyo;

    invoke-static {v1, v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzG(Ljava/lang/Class;Lcom/google/android/libraries/places/internal/zzadk;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzadk;-><init>()V

    return-void
.end method

.method public static zza()Lcom/google/android/libraries/places/internal/zzym;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzyo;->zzb:Lcom/google/android/libraries/places/internal/zzyo;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzx()Lcom/google/android/libraries/places/internal/zzadh;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/internal/zzym;

    return-object v0
.end method

.method public static synthetic zzc()Lcom/google/android/libraries/places/internal/zzyo;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzyo;->zzb:Lcom/google/android/libraries/places/internal/zzyo;

    return-object v0
.end method

.method public static synthetic zzd(Lcom/google/android/libraries/places/internal/zzyo;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzyo;->zze:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzyo;->zze:I

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzyo;->zzh:I

    return-void
.end method

.method public static synthetic zze(Lcom/google/android/libraries/places/internal/zzyo;Lcom/google/android/libraries/places/internal/zzzg;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzyo;->zzi:Lcom/google/android/libraries/places/internal/zzzg;

    iget p1, p0, Lcom/google/android/libraries/places/internal/zzyo;->zze:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzyo;->zze:I

    return-void
.end method

.method public static synthetic zzf(Lcom/google/android/libraries/places/internal/zzyo;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzyo;->zzg:I

    iget p1, p0, Lcom/google/android/libraries/places/internal/zzyo;->zze:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzyo;->zze:I

    return-void
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
    sget-object p1, Lcom/google/android/libraries/places/internal/zzyo;->zzb:Lcom/google/android/libraries/places/internal/zzyo;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/libraries/places/internal/zzym;

    invoke-direct {p1, p2}, Lcom/google/android/libraries/places/internal/zzym;-><init>(Lcom/google/android/libraries/places/internal/zzvo;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/places/internal/zzyo;

    invoke-direct {p1}, Lcom/google/android/libraries/places/internal/zzyo;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v2

    sget-object p2, Lcom/google/android/libraries/places/internal/zzyn;->zza:Lcom/google/android/libraries/places/internal/zzadn;

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    sget-object p2, Lcom/google/android/libraries/places/internal/zzyo;->zzb:Lcom/google/android/libraries/places/internal/zzyo;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u1004\u0002\u0004\u1009\u0003"

    invoke-static {p2, p3, p1}, Lcom/google/android/libraries/places/internal/zzadk;->zzF(Lcom/google/android/libraries/places/internal/zzaer;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
