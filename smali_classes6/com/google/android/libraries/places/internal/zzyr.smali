.class public final Lcom/google/android/libraries/places/internal/zzyr;
.super Lcom/google/android/libraries/places/internal/zzadk;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzaes;


# static fields
.field private static final zzb:Lcom/google/android/libraries/places/internal/zzadp;

.field private static final zze:Lcom/google/android/libraries/places/internal/zzyr;


# instance fields
.field private zzf:Lcom/google/android/libraries/places/internal/zzado;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/places/internal/zzyp;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzyp;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzyr;->zzb:Lcom/google/android/libraries/places/internal/zzadp;

    new-instance v0, Lcom/google/android/libraries/places/internal/zzyr;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzyr;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzyr;->zze:Lcom/google/android/libraries/places/internal/zzyr;

    const-class v1, Lcom/google/android/libraries/places/internal/zzyr;

    invoke-static {v1, v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzG(Ljava/lang/Class;Lcom/google/android/libraries/places/internal/zzadk;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzadk;-><init>()V

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzadk;->zzz()Lcom/google/android/libraries/places/internal/zzado;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/places/internal/zzyr;->zzf:Lcom/google/android/libraries/places/internal/zzado;

    return-void
.end method

.method public static synthetic zza()Lcom/google/android/libraries/places/internal/zzyr;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzyr;->zze:Lcom/google/android/libraries/places/internal/zzyr;

    return-object v0
.end method


# virtual methods
.method public final zzb(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/libraries/places/internal/zzyr;->zze:Lcom/google/android/libraries/places/internal/zzyr;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/libraries/places/internal/zzyq;

    invoke-direct {p1, p3}, Lcom/google/android/libraries/places/internal/zzyq;-><init>(Lcom/google/android/libraries/places/internal/zzvo;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/places/internal/zzyr;

    invoke-direct {p1}, Lcom/google/android/libraries/places/internal/zzyr;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzf"

    aput-object v0, p1, p3

    sget-object p3, Lcom/google/android/libraries/places/internal/zzaap;->zza:Lcom/google/android/libraries/places/internal/zzadn;

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/libraries/places/internal/zzyr;->zze:Lcom/google/android/libraries/places/internal/zzyr;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e"

    invoke-static {p2, p3, p1}, Lcom/google/android/libraries/places/internal/zzadk;->zzF(Lcom/google/android/libraries/places/internal/zzaer;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
