.class public final Lcom/google/android/libraries/places/internal/zzwh;
.super Lcom/google/android/libraries/places/internal/zzadk;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzaes;


# static fields
.field private static final zzb:Lcom/google/android/libraries/places/internal/zzwh;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/places/internal/zzwh;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzwh;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzwh;->zzb:Lcom/google/android/libraries/places/internal/zzwh;

    const-class v1, Lcom/google/android/libraries/places/internal/zzwh;

    invoke-static {v1, v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzG(Ljava/lang/Class;Lcom/google/android/libraries/places/internal/zzadk;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzadk;-><init>()V

    return-void
.end method

.method public static zza()Lcom/google/android/libraries/places/internal/zzwg;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzwh;->zzb:Lcom/google/android/libraries/places/internal/zzwh;

    invoke-virtual {v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzx()Lcom/google/android/libraries/places/internal/zzadh;

    move-result-object v0

    check-cast v0, Lcom/google/android/libraries/places/internal/zzwg;

    return-object v0
.end method

.method public static synthetic zzc()Lcom/google/android/libraries/places/internal/zzwh;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzwh;->zzb:Lcom/google/android/libraries/places/internal/zzwh;

    return-object v0
.end method

.method public static synthetic zzd(Lcom/google/android/libraries/places/internal/zzwh;I)V
    .locals 1

    iget p1, p0, Lcom/google/android/libraries/places/internal/zzwh;->zze:I

    const/4 v0, 0x1

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzwh;->zze:I

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzwh;->zzf:I

    return-void
.end method

.method public static synthetic zze(Lcom/google/android/libraries/places/internal/zzwh;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/libraries/places/internal/zzwh;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/libraries/places/internal/zzwh;->zze:I

    iput p1, p0, Lcom/google/android/libraries/places/internal/zzwh;->zzg:I

    return-void
.end method


# virtual methods
.method public final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/libraries/places/internal/zzwh;->zzb:Lcom/google/android/libraries/places/internal/zzwh;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/libraries/places/internal/zzwg;

    invoke-direct {p1, p3}, Lcom/google/android/libraries/places/internal/zzwg;-><init>(Lcom/google/android/libraries/places/internal/zzvo;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/places/internal/zzwh;

    invoke-direct {p1}, Lcom/google/android/libraries/places/internal/zzwh;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zze"

    aput-object v1, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/libraries/places/internal/zzwh;->zzb:Lcom/google/android/libraries/places/internal/zzwh;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001"

    invoke-static {p2, p3, p1}, Lcom/google/android/libraries/places/internal/zzadk;->zzF(Lcom/google/android/libraries/places/internal/zzaer;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
