.class public final Lcom/google/android/libraries/places/internal/zzxp;
.super Lcom/google/android/libraries/places/internal/zzadk;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzaes;


# static fields
.field private static final zzb:Lcom/google/android/libraries/places/internal/zzxp;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:Z

.field private zzi:Z

.field private zzj:Z

.field private zzk:I

.field private zzl:I

.field private zzm:I

.field private zzn:I

.field private zzo:I

.field private zzp:I

.field private zzq:I

.field private zzr:Z

.field private zzs:I

.field private zzt:I

.field private zzu:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/places/internal/zzxp;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzxp;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzxp;->zzb:Lcom/google/android/libraries/places/internal/zzxp;

    const-class v1, Lcom/google/android/libraries/places/internal/zzxp;

    invoke-static {v1, v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzG(Ljava/lang/Class;Lcom/google/android/libraries/places/internal/zzadk;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzadk;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzg:I

    return-void
.end method

.method public static zza()Lcom/google/android/libraries/places/internal/zzxm;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzxp;->zzb:Lcom/google/android/libraries/places/internal/zzxp;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzx()Lcom/google/android/libraries/places/internal/zzadh;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/internal/zzxm;

    return-object v0
.end method

.method public static synthetic zzc()Lcom/google/android/libraries/places/internal/zzxp;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzxp;->zzb:Lcom/google/android/libraries/places/internal/zzxp;

    return-object v0
.end method

.method public static synthetic zzd(Lcom/google/android/libraries/places/internal/zzxp;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput-boolean p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzh:Z

    return-void
.end method

.method public static synthetic zze(Lcom/google/android/libraries/places/internal/zzxp;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput-boolean p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzi:Z

    return-void
.end method

.method public static synthetic zzf(Lcom/google/android/libraries/places/internal/zzxp;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput-boolean p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzj:Z

    return-void
.end method

.method public static synthetic zzg(Lcom/google/android/libraries/places/internal/zzxp;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzk:I

    return-void
.end method

.method public static synthetic zzh(Lcom/google/android/libraries/places/internal/zzxp;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzl:I

    return-void
.end method

.method public static synthetic zzi(Lcom/google/android/libraries/places/internal/zzxp;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzm:I

    return-void
.end method

.method public static synthetic zzj(Lcom/google/android/libraries/places/internal/zzxp;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzn:I

    return-void
.end method

.method public static synthetic zzk(Lcom/google/android/libraries/places/internal/zzxp;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzo:I

    return-void
.end method

.method public static synthetic zzl(Lcom/google/android/libraries/places/internal/zzxp;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzp:I

    return-void
.end method

.method public static synthetic zzm(Lcom/google/android/libraries/places/internal/zzxp;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzq:I

    return-void
.end method

.method public static synthetic zzn(Lcom/google/android/libraries/places/internal/zzxp;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput-boolean p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzr:Z

    return-void
.end method

.method public static synthetic zzo(Lcom/google/android/libraries/places/internal/zzxp;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit16 v0, v0, 0x2000

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzs:I

    return-void
.end method

.method public static synthetic zzp(Lcom/google/android/libraries/places/internal/zzxp;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzf:I

    iget p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    return-void
.end method

.method public static synthetic zzq(Lcom/google/android/libraries/places/internal/zzxp;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zzg:I

    iget p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzxp;->zze:I

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
    sget-object p1, Lcom/google/android/libraries/places/internal/zzxp;->zzb:Lcom/google/android/libraries/places/internal/zzxp;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/libraries/places/internal/zzxm;

    invoke-direct {p1, p2}, Lcom/google/android/libraries/places/internal/zzxm;-><init>(Lcom/google/android/libraries/places/internal/zzvo;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/places/internal/zzxp;

    invoke-direct {p1}, Lcom/google/android/libraries/places/internal/zzxp;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x14

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    sget-object p2, Lcom/google/android/libraries/places/internal/zzxo;->zza:Lcom/google/android/libraries/places/internal/zzadn;

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    sget-object p2, Lcom/google/android/libraries/places/internal/zzxl;->zza:Lcom/google/android/libraries/places/internal/zzadn;

    aput-object p2, p1, v0

    const-string p2, "zzh"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zzt"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzu"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    sget-object p3, Lcom/google/android/libraries/places/internal/zzxn;->zza:Lcom/google/android/libraries/places/internal/zzadn;

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/libraries/places/internal/zzxp;->zzb:Lcom/google/android/libraries/places/internal/zzxp;

    const-string p3, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u100b\u0005\u0007\u100b\u0006\u0008\u100b\u0007\n\u100b\t\u000b\u100b\n\u000c\u100b\u000b\r\u1007\u000c\u000e\u100b\r\u000f\u100b\u0008\u0010\u100b\u000e\u0011\u100c\u000f"

    invoke-static {p2, p3, p1}, Lcom/google/android/libraries/places/internal/zzadk;->zzF(Lcom/google/android/libraries/places/internal/zzaer;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
