.class public final Lck7;
.super Lub9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# static fields
.field private static final zzb:Lck7;


# instance fields
.field private zze:I

.field private zzf:Lup9;

.field private zzg:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lck7;

    invoke-direct {v0}, Lck7;-><init>()V

    sput-object v0, Lck7;->zzb:Lck7;

    const-class v1, Lck7;

    invoke-static {v1, v0}, Lub9;->k(Ljava/lang/Class;Lub9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lub9;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lck7;->zzg:B

    return-void
.end method

.method public static synthetic u()Lck7;
    .locals 1

    sget-object v0, Lck7;->zzb:Lck7;

    return-object v0
.end method

.method public static v([BLN89;)Lck7;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzov;
        }
    .end annotation

    sget-object v0, Lck7;->zzb:Lck7;

    invoke-static {v0, p0, p1}, Lub9;->t(Lub9;[BLN89;)Lub9;

    move-result-object p0

    check-cast p0, Lck7;

    return-object p0
.end method


# virtual methods
.method public final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, Lck7;->zzg:B

    return-object v2

    :cond_1
    sget-object p1, Lck7;->zzb:Lck7;

    return-object p1

    :cond_2
    new-instance p1, LAj7;

    invoke-direct {p1, v2}, LAj7;-><init>(Lrl9;)V

    return-object p1

    :cond_3
    new-instance p1, Lck7;

    invoke-direct {p1}, Lck7;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zze"

    aput-object p2, p1, v0

    const-string p2, "zzf"

    aput-object p2, p1, p3

    sget-object p2, Lck7;->zzb:Lck7;

    const-string p3, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000"

    invoke-static {p2, p3, p1}, Lub9;->j(Lpg9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lck7;->zzg:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final w()Lup9;
    .locals 1

    iget-object v0, p0, Lck7;->zzf:Lup9;

    if-nez v0, :cond_0

    invoke-static {}, Lup9;->v()Lup9;

    move-result-object v0

    :cond_0
    return-object v0
.end method
