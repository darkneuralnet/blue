.class public final LFG8;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LFG8;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:LCw8;

.field private zzi:LCw8;

.field private zzj:Z

.field private zzk:Z

.field private zzl:Z

.field private zzm:I

.field private zzn:LNw7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LFG8;

    invoke-direct {v0}, LFG8;-><init>()V

    sput-object v0, LFG8;->zzb:LFG8;

    const-class v1, LFG8;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LFG8;->zzf:Ljava/lang/String;

    iput-object v0, p0, LFG8;->zzg:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, LFG8;->zzm:I

    return-void
.end method

.method public static synthetic D()LFG8;
    .locals 1

    sget-object v0, LFG8;->zzb:LFG8;

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
    sget-object p1, LFG8;->zzb:LFG8;

    return-object p1

    :cond_1
    new-instance p1, LtG8;

    invoke-direct {p1, p2}, LtG8;-><init>(LhG8;)V

    return-object p1

    :cond_2
    new-instance p1, LFG8;

    invoke-direct {p1}, LFG8;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xa

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    const-string p2, "zzk"

    aput-object p2, p1, v2

    const-string p2, "zzl"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzj"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzg"

    aput-object p3, p1, p2

    sget-object p2, LFG8;->zzb:LFG8;

    const-string p3, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0005\u0003\u1007\u0006\u0004\u1009\u0002\u0006\u1007\u0004\u0007\u1004\u0007\u0008\u1009\u0008\t\u1009\u0003\n\u1008\u0001"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method