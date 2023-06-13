.class public final LHo8;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:Llu7;

.field private static final zze:LHo8;


# instance fields
.field private zzf:I

.field private zzg:Lku7;

.field private zzh:F

.field private zzi:Z

.field private zzj:I

.field private zzk:LNw7;

.field private zzl:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LWn8;

    invoke-direct {v0}, LWn8;-><init>()V

    sput-object v0, LHo8;->zzb:Llu7;

    new-instance v0, LHo8;

    invoke-direct {v0}, LHo8;-><init>()V

    sput-object v0, LHo8;->zze:LHo8;

    const-class v1, LHo8;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    invoke-static {}, Leu7;->q()Lku7;

    move-result-object v0

    iput-object v0, p0, LHo8;->zzg:Lku7;

    const/4 v0, 0x1

    iput v0, p0, LHo8;->zzj:I

    return-void
.end method

.method public static synthetic D()LHo8;
    .locals 1

    sget-object v0, LHo8;->zze:LHo8;

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
    sget-object p1, LHo8;->zze:LHo8;

    return-object p1

    :cond_1
    new-instance p1, Ljo8;

    invoke-direct {p1, p2}, Ljo8;-><init>(LWn8;)V

    return-object p1

    :cond_2
    new-instance p1, LHo8;

    invoke-direct {p1}, LHo8;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x9

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzf"

    aput-object v4, p1, v3

    const-string v3, "zzg"

    aput-object v3, p1, p2

    sget-object p2, LIn8;->a:Liu7;

    aput-object p2, p1, v2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const-string p2, "zzi"

    aput-object p2, p1, v0

    const-string p2, "zzj"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    sget-object p3, Lvo8;->a:Liu7;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzl"

    aput-object p3, p1, p2

    sget-object p2, LHo8;->zze:LHo8;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001\u001e\u0002\u1001\u0000\u0003\u1007\u0001\u0004\u100c\u0002\u0005\u1009\u0003\u0007\u1007\u0004"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
