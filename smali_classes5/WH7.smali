.class public final LWH7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LWH7;


# instance fields
.field private zze:I

.field private zzf:Z

.field private zzg:Z

.field private zzh:LOG7;

.field private zzi:LrL8;

.field private zzj:F

.field private zzk:F

.field private zzl:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LWH7;

    invoke-direct {v0}, LWH7;-><init>()V

    sput-object v0, LWH7;->zzb:LWH7;

    const-class v1, LWH7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LWH7;->zzf:Z

    iput-boolean v0, p0, LWH7;->zzg:Z

    const v0, 0x3f333333    # 0.7f

    iput v0, p0, LWH7;->zzj:F

    const v0, 0x3f4ccccd    # 0.8f

    iput v0, p0, LWH7;->zzk:F

    return-void
.end method

.method public static synthetic D()LWH7;
    .locals 1

    sget-object v0, LWH7;->zzb:LWH7;

    return-object v0
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, LWH7;->zzb:LWH7;

    return-object p1

    :cond_1
    new-instance p1, LPG7;

    invoke-direct {p1, p2}, LPG7;-><init>(LnG7;)V

    return-object p1

    :cond_2
    new-instance p1, LWH7;

    invoke-direct {p1}, LWH7;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    const-string p2, "zzh"

    aput-object p2, p1, v2

    const-string p2, "zzi"

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    const-string p2, "zzj"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzl"

    aput-object p3, p1, p2

    sget-object p2, LWH7;->zzb:LWH7;

    const-string p3, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0002\u0003\u1009\u0003\u0004\u1007\u0001\u0005\u1001\u0004\u0006\u1001\u0005\u0007\u1007\u0006"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
