.class public final LuB7;
.super Lbu7;
.source "SourceFile"


# static fields
.field private static final zze:LuB7;


# instance fields
.field private zzA:Lju7;

.field private zzB:I

.field private zzC:B

.field private zzf:I

.field private zzg:I

.field private zzh:LNA7;

.field private zzi:LgB7;

.field private zzj:I

.field private zzk:I

.field private zzl:Lup7;

.field private zzm:F

.field private zzn:F

.field private zzo:F

.field private zzp:Ljava/lang/String;

.field private zzq:LkB7;

.field private zzr:Ljava/lang/String;

.field private zzs:LeB7;

.field private zzt:LnB7;

.field private zzu:LtB7;

.field private zzv:I

.field private zzw:J

.field private zzx:LEs7;

.field private zzy:Ljava/lang/String;

.field private zzz:Lnu7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LuB7;

    invoke-direct {v0}, LuB7;-><init>()V

    sput-object v0, LuB7;->zze:LuB7;

    const-class v1, LuB7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lbu7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LuB7;->zzC:B

    const/4 v1, -0x1

    iput v1, p0, LuB7;->zzg:I

    iput v0, p0, LuB7;->zzj:I

    const-string v0, ""

    iput-object v0, p0, LuB7;->zzp:Ljava/lang/String;

    iput-object v0, p0, LuB7;->zzr:Ljava/lang/String;

    iput-object v0, p0, LuB7;->zzy:Ljava/lang/String;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LuB7;->zzz:Lnu7;

    invoke-static {}, Leu7;->p()Lju7;

    move-result-object v0

    iput-object v0, p0, LuB7;->zzA:Lju7;

    return-void
.end method

.method public static synthetic E()LuB7;
    .locals 1

    sget-object v0, LuB7;->zze:LuB7;

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
    iput-byte p3, p0, LuB7;->zzC:B

    return-object v3

    :cond_1
    sget-object p1, LuB7;->zze:LuB7;

    return-object p1

    :cond_2
    new-instance p1, LlB7;

    invoke-direct {p1, v3}, LlB7;-><init>(LHA7;)V

    return-object p1

    :cond_3
    new-instance p1, LuB7;

    invoke-direct {p1}, LuB7;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x19

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzf"

    aput-object p2, p1, v0

    const-string p2, "zzg"

    aput-object p2, p1, p3

    const-string p2, "zzh"

    aput-object p2, p1, v4

    const-string p2, "zzi"

    aput-object p2, p1, v3

    const-string p2, "zzj"

    aput-object p2, p1, v2

    sget-object p2, LrB7;->a:Liu7;

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    sget-object p3, LpB7;->a:Liu7;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zzt"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzu"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zzv"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzw"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zzx"

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0x15

    const-string p3, "zzy"

    aput-object p3, p1, p2

    const/16 p2, 0x16

    const-string p3, "zzz"

    aput-object p3, p1, p2

    const/16 p2, 0x17

    const-string p3, "zzA"

    aput-object p3, p1, p2

    const/16 p2, 0x18

    const-string p3, "zzB"

    aput-object p3, p1, p2

    sget-object p2, LuB7;->zze:LuB7;

    const-string p3, "\u0001\u0016\u0000\u0001\u0001\u001a\u0016\u0000\u0002\u0004\u0001\u1004\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100c\u0003\u0005\u100c\u0004\u0006\u1009\u0005\u0007\u1001\u0008\u0008\u1008\t\r\u1409\n\u000e\u1001\u0006\u000f\u1008\u000b\u0010\u1409\u000c\u0011\u1009\r\u0012\u1009\u000e\u0013\u1004\u000f\u0014\u1002\u0010\u0015\u1009\u0011\u0016\u1001\u0007\u0017\u1008\u0012\u0018\u001a\u0019\u0013\u001a\u1004\u0013"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LuB7;->zzC:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
