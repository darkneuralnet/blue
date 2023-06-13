.class public final LpE7;
.super Lbu7;
.source "SourceFile"


# static fields
.field private static final zze:LpE7;


# instance fields
.field private zzf:I

.field private zzg:I

.field private zzh:Ljava/lang/Object;

.field private zzi:I

.field private zzj:Ljava/lang/Object;

.field private zzk:Ljava/lang/String;

.field private zzl:Ljava/lang/String;

.field private zzm:LNw7;

.field private zzn:I

.field private zzo:Z

.field private zzp:I

.field private zzq:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LpE7;

    invoke-direct {v0}, LpE7;-><init>()V

    sput-object v0, LpE7;->zze:LpE7;

    const-class v1, LpE7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lbu7;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LpE7;->zzg:I

    iput v0, p0, LpE7;->zzi:I

    const/4 v0, 0x2

    iput-byte v0, p0, LpE7;->zzq:B

    const-string v0, "FaceAttributesClientBrainEmbedder"

    iput-object v0, p0, LpE7;->zzk:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, LpE7;->zzl:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, LpE7;->zzo:Z

    iput v0, p0, LpE7;->zzp:I

    return-void
.end method

.method public static synthetic E()LpE7;
    .locals 1

    sget-object v0, LpE7;->zze:LpE7;

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
    iput-byte p3, p0, LpE7;->zzq:B

    return-object v3

    :cond_1
    sget-object p1, LpE7;->zze:LpE7;

    return-object p1

    :cond_2
    new-instance p1, LoE7;

    invoke-direct {p1, v3}, LoE7;-><init>(LmE7;)V

    return-object p1

    :cond_3
    new-instance p1, LpE7;

    invoke-direct {p1}, LpE7;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0xe

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzg"

    aput-object p2, p1, p3

    const-string p2, "zzj"

    aput-object p2, p1, v4

    const-string p2, "zzi"

    aput-object p2, p1, v3

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-class p2, LfD7;

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    sget-object p3, LnE7;->a:Liu7;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-class p3, LsE7;

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzm"

    aput-object p3, p1, p2

    sget-object p2, LpE7;->zze:LpE7;

    const-string p3, "\u0001\n\u0002\u0001\u0002\r\n\u0000\u0000\u0001\u0002\u103c\u0000\u0003\u103b\u0000\u0004\u1007\u0008\u0005\u100c\t\u0007\u143c\u0001\u0008\u103b\u0001\t\u1008\u0000\n\u1008\u0001\u000c\u1004\u0003\r\u1009\u0002"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LpE7;->zzq:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
