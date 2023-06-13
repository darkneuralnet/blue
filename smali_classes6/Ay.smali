.class public final LAy;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LV78<",
        "LAy;",
        "LjH8;",
        ">;",
        "Lrj8;"
    }
.end annotation


# static fields
.field private static final zza:LAy;


# instance fields
.field private zzd:I

.field private zze:Lqa8;

.field private zzf:I

.field private zzg:Ljava/lang/String;

.field private zzh:LgZ7;

.field private zzi:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LAy;

    invoke-direct {v0}, LAy;-><init>()V

    sput-object v0, LAy;->zza:LAy;

    const-class v1, LAy;

    invoke-static {v1, v0}, LV78;->w(Ljava/lang/Class;LV78;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LAy;->zzi:B

    invoke-static {}, LV78;->p()Lqa8;

    move-result-object v0

    iput-object v0, p0, LAy;->zze:Lqa8;

    const-string v0, ""

    iput-object v0, p0, LAy;->zzg:Ljava/lang/String;

    sget-object v0, LgZ7;->c:LgZ7;

    iput-object v0, p0, LAy;->zzh:LgZ7;

    return-void
.end method

.method public static synthetic H()LAy;
    .locals 1

    sget-object v0, LAy;->zza:LAy;

    return-object v0
.end method

.method public static I([BLJ28;)LAy;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzeo;
        }
    .end annotation

    sget-object v0, LAy;->zza:LAy;

    invoke-static {v0, p0, p1}, LV78;->k(LV78;[BLJ28;)LV78;

    move-result-object p0

    check-cast p0, LAy;

    return-object p0
.end method


# virtual methods
.method public final G(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_4

    if-eq p1, v3, :cond_3

    const/4 v3, 0x0

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    move p3, v0

    :cond_0
    iput-byte p3, p0, LAy;->zzi:B

    return-object v3

    :cond_1
    sget-object p1, LAy;->zza:LAy;

    return-object p1

    :cond_2
    new-instance p1, LjH8;

    invoke-direct {p1, v3}, LjH8;-><init>(Lqf7;)V

    return-object p1

    :cond_3
    new-instance p1, LAy;

    invoke-direct {p1}, LAy;-><init>()V

    return-object p1

    :cond_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zze"

    aput-object p2, p1, p3

    const-class p2, LuQ7;

    aput-object p2, p1, v4

    const-string p2, "zzf"

    aput-object p2, p1, v3

    sget-object p2, Lgm7;->a:Lf98;

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzh"

    aput-object p3, p1, p2

    sget-object p2, LAy;->zza:LAy;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u041b\u0002\u150c\u0000\u0003\u1008\u0001\u0004\u100a\u0002"

    invoke-static {p2, p3, p1}, LV78;->t(Ldj8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LAy;->zzi:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final J()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LAy;->zze:Lqa8;

    return-object v0
.end method
