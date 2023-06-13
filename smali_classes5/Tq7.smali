.class public final LTq7;
.super Lbu7;
.source "SourceFile"


# static fields
.field private static final zze:LTq7;


# instance fields
.field private zzA:LUr7;

.field private zzB:I

.field private zzC:F

.field private zzD:Z

.field private zzE:I

.field private zzF:B

.field private zzf:I

.field private zzg:Lnu7;

.field private zzh:Lgq7;

.field private zzi:Lgq7;

.field private zzj:Lgq7;

.field private zzk:Ljava/lang/String;

.field private zzl:F

.field private zzm:Lnu7;

.field private zzn:Lnu7;

.field private zzo:F

.field private zzp:Ljava/lang/String;

.field private zzq:Z

.field private zzr:Lnu7;

.field private zzs:I

.field private zzt:I

.field private zzu:Z

.field private zzv:LLq7;

.field private zzw:Z

.field private zzx:I

.field private zzy:I

.field private zzz:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LTq7;

    invoke-direct {v0}, LTq7;-><init>()V

    sput-object v0, LTq7;->zze:LTq7;

    const-class v1, LTq7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lbu7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LTq7;->zzF:B

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LTq7;->zzg:Lnu7;

    const-string v0, ""

    iput-object v0, p0, LTq7;->zzk:Ljava/lang/String;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v1

    iput-object v1, p0, LTq7;->zzm:Lnu7;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v1

    iput-object v1, p0, LTq7;->zzn:Lnu7;

    iput-object v0, p0, LTq7;->zzp:Ljava/lang/String;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LTq7;->zzr:Lnu7;

    return-void
.end method

.method public static synthetic E()LTq7;
    .locals 1

    sget-object v0, LTq7;->zze:LTq7;

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
    iput-byte p3, p0, LTq7;->zzF:B

    return-object v3

    :cond_1
    sget-object p1, LTq7;->zze:LTq7;

    return-object p1

    :cond_2
    new-instance p1, LSq7;

    invoke-direct {p1, v3}, LSq7;-><init>(Leq7;)V

    return-object p1

    :cond_3
    new-instance p1, LTq7;

    invoke-direct {p1}, LTq7;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x1f

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzf"

    aput-object p2, p1, v0

    const-string p2, "zzg"

    aput-object p2, p1, p3

    const-class p2, LNr7;

    aput-object p2, p1, v4

    const-string p2, "zzh"

    aput-object p2, p1, v3

    const-string p2, "zzi"

    aput-object p2, p1, v2

    const-string p2, "zzk"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-class p3, Liq7;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-class p3, Lkq7;

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-class p3, Lgr7;

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zzt"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzu"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zzv"

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zzw"

    aput-object p3, p1, p2

    const/16 p2, 0x15

    const-string p3, "zzx"

    aput-object p3, p1, p2

    const/16 p2, 0x16

    const-string p3, "zzy"

    aput-object p3, p1, p2

    const/16 p2, 0x17

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x18

    const-string p3, "zzz"

    aput-object p3, p1, p2

    const/16 p2, 0x19

    const-string p3, "zzA"

    aput-object p3, p1, p2

    const/16 p2, 0x1a

    const-string p3, "zzB"

    aput-object p3, p1, p2

    const/16 p2, 0x1b

    invoke-static {}, LqB7;->a()Liu7;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0x1c

    const-string p3, "zzC"

    aput-object p3, p1, p2

    const/16 p2, 0x1d

    const-string p3, "zzD"

    aput-object p3, p1, p2

    const/16 p2, 0x1e

    const-string p3, "zzE"

    aput-object p3, p1, p2

    sget-object p2, LTq7;->zze:LTq7;

    const-string p3, "\u0001\u0019\u0000\u0001\u0001d\u0019\u0000\u0004\u0006\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1008\u0003\u0005\u1001\u0004\u0006\u001b\u0007\u1001\u0005\u0008\u1008\u0006\t\u041b\n\u1007\u0007\u000b\u001b\u000c\u1004\u0008\r\u1004\t\u000e\u1007\n\u000f\u1409\u000b\u0010\u1007\u000c\u0011\u1004\r\u0012\u1004\u000e\u0013\u1409\u0002\u0014\u1004\u000f\u0015\u1009\u0010\u0016\u100c\u0011\u0017\u1001\u0012\u0018\u1007\u0013d\u1004\u0014"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LTq7;->zzF:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
