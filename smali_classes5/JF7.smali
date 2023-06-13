.class public final LJF7;
.super Lbu7;
.source "SourceFile"


# static fields
.field private static final zze:LJF7;


# instance fields
.field private zzA:I

.field private zzB:B

.field private zzf:I

.field private zzg:Ljava/lang/String;

.field private zzh:I

.field private zzi:I

.field private zzj:F

.field private zzk:F

.field private zzl:Lnu7;

.field private zzm:Z

.field private zzn:Z

.field private zzo:Z

.field private zzp:I

.field private zzq:LMF7;

.field private zzr:LVE7;

.field private zzs:LlD7;

.field private zzt:LBF7;

.field private zzu:LFF7;

.field private zzv:I

.field private zzw:LNw7;

.field private zzx:Z

.field private zzy:Z

.field private zzz:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LJF7;

    invoke-direct {v0}, LJF7;-><init>()V

    sput-object v0, LJF7;->zze:LJF7;

    const-class v1, LJF7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lbu7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LJF7;->zzB:B

    const-string v0, ""

    iput-object v0, p0, LJF7;->zzg:Ljava/lang/String;

    const/16 v0, 0xa

    iput v0, p0, LJF7;->zzh:I

    const/4 v0, 0x1

    iput v0, p0, LJF7;->zzi:I

    const v1, 0x3e99999a    # 0.3f

    iput v1, p0, LJF7;->zzk:F

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v1

    iput-object v1, p0, LJF7;->zzl:Lnu7;

    iput v0, p0, LJF7;->zzv:I

    return-void
.end method

.method public static E()LDF7;
    .locals 1

    sget-object v0, LJF7;->zze:LJF7;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, LDF7;

    return-object v0
.end method

.method public static synthetic F()LJF7;
    .locals 1

    sget-object v0, LJF7;->zze:LJF7;

    return-object v0
.end method

.method public static synthetic G(LJF7;Ljava/lang/String;)V
    .locals 0

    iget p1, p0, LJF7;->zzf:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, LJF7;->zzf:I

    const-string p1, "MobileSSDTfLiteClient"

    iput-object p1, p0, LJF7;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic H(LJF7;Z)V
    .locals 0

    iget p1, p0, LJF7;->zzf:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, LJF7;->zzf:I

    const/4 p1, 0x1

    iput-boolean p1, p0, LJF7;->zzm:Z

    return-void
.end method

.method public static synthetic I(LJF7;LFF7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LJF7;->zzu:LFF7;

    iget p1, p0, LJF7;->zzf:I

    or-int/lit16 p1, p1, 0x2000

    iput p1, p0, LJF7;->zzf:I

    return-void
.end method

.method public static synthetic J(LJF7;LNw7;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LJF7;->zzw:LNw7;

    iget p1, p0, LJF7;->zzf:I

    const v0, 0x8000

    or-int/2addr p1, v0

    iput p1, p0, LJF7;->zzf:I

    return-void
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
    iput-byte p3, p0, LJF7;->zzB:B

    return-object v3

    :cond_1
    sget-object p1, LJF7;->zze:LJF7;

    return-object p1

    :cond_2
    new-instance p1, LDF7;

    invoke-direct {p1, v3}, LDF7;-><init>(LCF7;)V

    return-object p1

    :cond_3
    new-instance p1, LJF7;

    invoke-direct {p1}, LJF7;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x17

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

    const-string p2, "zzk"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzn"

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

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzt"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzv"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zzu"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzw"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zzx"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzy"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zzz"

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0x15

    const-string p3, "zzA"

    aput-object p3, p1, p2

    const/16 p2, 0x16

    sget-object p3, LIF7;->a:Liu7;

    aput-object p3, p1, p2

    sget-object p2, LJF7;->zze:LJF7;

    const-string p3, "\u0001\u0015\u0000\u0001\u0001\u0016\u0015\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u100b\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u001a\u0007\u1007\u0005\u0008\u1007\u0006\t\u1007\u0007\n\u100b\u0008\u000b\u1009\t\u000c\u1009\n\r\u1009\u000c\u000f\u1004\u000e\u0010\u1009\r\u0011\u1009\u000f\u0012\u1007\u0010\u0013\u1007\u0011\u0014\u1004\u0012\u0015\u1009\u000b\u0016\u100c\u0013"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LJF7;->zzB:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
