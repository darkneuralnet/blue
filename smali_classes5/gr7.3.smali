.class public final Lgr7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:Lgr7;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:F

.field private zzh:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgr7;

    invoke-direct {v0}, Lgr7;-><init>()V

    sput-object v0, Lgr7;->zzb:Lgr7;

    const-class v1, Lgr7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lgr7;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lgr7;->zzh:Ljava/lang/String;

    return-void
.end method

.method public static synthetic D()Lgr7;
    .locals 1

    sget-object v0, Lgr7;->zzb:Lgr7;

    return-object v0
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 p2, 0x0

    if-eq p1, p3, :cond_1

    const/4 p3, 0x5

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lgr7;->zzb:Lgr7;

    return-object p1

    :cond_1
    new-instance p1, Lfr7;

    invoke-direct {p1, p2}, Lfr7;-><init>(Leq7;)V

    return-object p1

    :cond_2
    new-instance p1, Lgr7;

    invoke-direct {p1}, Lgr7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zze"

    aput-object v2, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    sget-object p2, Lgr7;->zzb:Lgr7;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1001\u0001\u0003\u1008\u0002"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
