.class public final Lgp9;
.super Lub9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# static fields
.field private static final zzb:Lgp9;


# instance fields
.field private zze:I

.field private zzf:F

.field private zzg:F

.field private zzh:F

.field private zzi:I

.field private zzj:I

.field private zzk:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgp9;

    invoke-direct {v0}, Lgp9;-><init>()V

    sput-object v0, Lgp9;->zzb:Lgp9;

    const-class v1, Lgp9;

    invoke-static {v1, v0}, Lub9;->k(Ljava/lang/Class;Lub9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lub9;-><init>()V

    const/16 v0, 0x3a98

    iput v0, p0, Lgp9;->zzi:I

    return-void
.end method

.method public static synthetic w()Lgp9;
    .locals 1

    sget-object v0, Lgp9;->zzb:Lgp9;

    return-object v0
.end method


# virtual methods
.method public final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Lgp9;->zzb:Lgp9;

    return-object p1

    :cond_1
    new-instance p1, Lho9;

    invoke-direct {p1, p2}, Lho9;-><init>(Lrn9;)V

    return-object p1

    :cond_2
    new-instance p1, Lgp9;

    invoke-direct {p1}, Lgp9;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x9

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

    sget-object p2, Luo9;->a:LWb9;

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    sget-object p3, Lcp9;->a:LWb9;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzk"

    aput-object p3, p1, p2

    sget-object p2, Lgp9;->zzb:Lgp9;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u100c\u0003\u0005\u100c\u0004\u0006\u1001\u0005"

    invoke-static {p2, p3, p1}, Lub9;->j(Lpg9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final u()F
    .locals 1

    iget v0, p0, Lgp9;->zzf:F

    return v0
.end method

.method public final v()F
    .locals 1

    iget v0, p0, Lgp9;->zzg:F

    return v0
.end method

.method public final x()I
    .locals 1

    iget v0, p0, Lgp9;->zzi:I

    invoke-static {v0}, Lvo9;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x3a99

    :cond_0
    return v0
.end method
