.class public final Lcom/google/android/libraries/places/internal/zzve;
.super Lcom/google/android/libraries/places/internal/zzadk;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzaes;


# static fields
.field private static final zzb:Lcom/google/android/libraries/places/internal/zzve;


# instance fields
.field private zze:I

.field private zzf:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/places/internal/zzve;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzve;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzve;->zzb:Lcom/google/android/libraries/places/internal/zzve;

    const-class v1, Lcom/google/android/libraries/places/internal/zzve;

    invoke-static {v1, v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzG(Ljava/lang/Class;Lcom/google/android/libraries/places/internal/zzadk;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzadk;-><init>()V

    return-void
.end method

.method public static synthetic zza()Lcom/google/android/libraries/places/internal/zzve;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzve;->zzb:Lcom/google/android/libraries/places/internal/zzve;

    return-object v0
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
    sget-object p1, Lcom/google/android/libraries/places/internal/zzve;->zzb:Lcom/google/android/libraries/places/internal/zzve;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/libraries/places/internal/zzvc;

    invoke-direct {p1, p3}, Lcom/google/android/libraries/places/internal/zzvc;-><init>(Lcom/google/android/libraries/places/internal/zzsz;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/places/internal/zzve;

    invoke-direct {p1}, Lcom/google/android/libraries/places/internal/zzve;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zze"

    aput-object v1, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/libraries/places/internal/zzvd;->zza:Lcom/google/android/libraries/places/internal/zzadn;

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/libraries/places/internal/zzve;->zzb:Lcom/google/android/libraries/places/internal/zzve;

    const-string p3, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000"

    invoke-static {p2, p3, p1}, Lcom/google/android/libraries/places/internal/zzadk;->zzF(Lcom/google/android/libraries/places/internal/zzaer;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
