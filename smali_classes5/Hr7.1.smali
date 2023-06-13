.class public final LHr7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LHr7;


# instance fields
.field private zze:I

.field private zzf:Lgq7;

.field private zzg:Ljava/lang/String;

.field private zzh:Lku7;

.field private zzi:I

.field private zzj:I

.field private zzk:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LHr7;

    invoke-direct {v0}, LHr7;-><init>()V

    sput-object v0, LHr7;->zzb:LHr7;

    const-class v1, LHr7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LHr7;->zzk:B

    const-string v0, ""

    iput-object v0, p0, LHr7;->zzg:Ljava/lang/String;

    invoke-static {}, Leu7;->q()Lku7;

    move-result-object v0

    iput-object v0, p0, LHr7;->zzh:Lku7;

    return-void
.end method

.method public static synthetic D()LHr7;
    .locals 1

    sget-object v0, LHr7;->zzb:LHr7;

    return-object v0
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    iput-byte p3, p0, LHr7;->zzk:B

    return-object v3

    :cond_1
    sget-object p1, LHr7;->zzb:LHr7;

    return-object p1

    :cond_2
    new-instance p1, LGr7;

    invoke-direct {p1, v3}, LGr7;-><init>(Leq7;)V

    return-object p1

    :cond_3
    new-instance p1, LHr7;

    invoke-direct {p1}, LHr7;-><init>()V

    return-object p1

    :cond_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zze"

    aput-object p2, p1, v0

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const-string p2, "zzg"

    aput-object p2, p1, v4

    const-string p2, "zzh"

    aput-object p2, p1, v3

    const-string p2, "zzi"

    aput-object p2, p1, v2

    const-string p2, "zzj"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    invoke-static {}, LqB7;->a()Liu7;

    move-result-object p3

    aput-object p3, p1, p2

    sget-object p2, LHr7;->zzb:LHr7;

    const-string p3, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u0016\u0004\u1004\u0002\u0005\u100c\u0003"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LHr7;->zzk:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
