.class public final Lcom/google/android/libraries/places/internal/zzyz;
.super Lcom/google/android/libraries/places/internal/zzadk;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/internal/zzaes;


# static fields
.field private static final zzb:Lcom/google/android/libraries/places/internal/zzyz;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/libraries/places/internal/zzadr;

.field private zzg:I

.field private zzh:Ljava/lang/String;

.field private zzi:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/libraries/places/internal/zzyz;

    invoke-direct {v0}, Lcom/google/android/libraries/places/internal/zzyz;-><init>()V

    sput-object v0, Lcom/google/android/libraries/places/internal/zzyz;->zzb:Lcom/google/android/libraries/places/internal/zzyz;

    const-class v1, Lcom/google/android/libraries/places/internal/zzyz;

    invoke-static {v1, v0}, Lcom/google/android/libraries/places/internal/zzadk;->zzG(Ljava/lang/Class;Lcom/google/android/libraries/places/internal/zzadk;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/libraries/places/internal/zzadk;-><init>()V

    invoke-static {}, Lcom/google/android/libraries/places/internal/zzadk;->zzB()Lcom/google/android/libraries/places/internal/zzadr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/places/internal/zzyz;->zzf:Lcom/google/android/libraries/places/internal/zzadr;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/libraries/places/internal/zzyz;->zzh:Ljava/lang/String;

    return-void
.end method

.method public static synthetic zza()Lcom/google/android/libraries/places/internal/zzyz;
    .locals 1

    sget-object v0, Lcom/google/android/libraries/places/internal/zzyz;->zzb:Lcom/google/android/libraries/places/internal/zzyz;

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
    sget-object p1, Lcom/google/android/libraries/places/internal/zzyz;->zzb:Lcom/google/android/libraries/places/internal/zzyz;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/libraries/places/internal/zzyy;

    invoke-direct {p1, p2}, Lcom/google/android/libraries/places/internal/zzyy;-><init>(Lcom/google/android/libraries/places/internal/zzvo;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/libraries/places/internal/zzyz;

    invoke-direct {p1}, Lcom/google/android/libraries/places/internal/zzyz;-><init>()V

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

    sget-object p2, Lcom/google/android/libraries/places/internal/zzyw;->zza:Lcom/google/android/libraries/places/internal/zzadn;

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    sget-object p2, Lcom/google/android/libraries/places/internal/zzyz;->zzb:Lcom/google/android/libraries/places/internal/zzyz;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002\u100c\u0000\u0003\u1008\u0001\u0004\u1007\u0002"

    invoke-static {p2, p3, p1}, Lcom/google/android/libraries/places/internal/zzadk;->zzF(Lcom/google/android/libraries/places/internal/zzaer;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
