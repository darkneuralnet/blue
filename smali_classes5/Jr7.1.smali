.class public final LJr7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LJr7;


# instance fields
.field private zze:I

.field private zzf:Lkt7;

.field private zzg:I

.field private zzh:I

.field private zzi:Ljava/lang/String;

.field private zzj:Lnu7;

.field private zzk:LLr7;

.field private zzl:Lnu7;

.field private zzm:Lar7;

.field private zzn:LXq7;

.field private zzo:Lnu7;

.field private zzp:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LJr7;

    invoke-direct {v0}, LJr7;-><init>()V

    sput-object v0, LJr7;->zzb:LJr7;

    const-class v1, LJr7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LJr7;->zzp:B

    sget-object v0, Lkt7;->c:Lkt7;

    iput-object v0, p0, LJr7;->zzf:Lkt7;

    const-string v0, ""

    iput-object v0, p0, LJr7;->zzi:Ljava/lang/String;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LJr7;->zzj:Lnu7;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LJr7;->zzl:Lnu7;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LJr7;->zzo:Lnu7;

    return-void
.end method

.method public static synthetic D()LJr7;
    .locals 1

    sget-object v0, LJr7;->zzb:LJr7;

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
    iput-byte p3, p0, LJr7;->zzp:B

    return-object v3

    :cond_1
    sget-object p1, LJr7;->zzb:LJr7;

    return-object p1

    :cond_2
    new-instance p1, LIr7;

    invoke-direct {p1, v3}, LIr7;-><init>(Leq7;)V

    return-object p1

    :cond_3
    new-instance p1, LJr7;

    invoke-direct {p1}, LJr7;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0xe

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zze"

    aput-object p2, p1, v0

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const-string p2, "zzi"

    aput-object p2, p1, v4

    const-string p2, "zzj"

    aput-object p2, p1, v3

    const-class p2, LTq7;

    aput-object p2, p1, v2

    const-string p2, "zzk"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-class p3, LHr7;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-class p3, LFr7;

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzg"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzh"

    aput-object p3, p1, p2

    sget-object p2, LJr7;->zzb:LJr7;

    const-string p3, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0003\u0004\u0001\u150a\u0000\u0002\u1008\u0003\u0003\u041b\u0004\u1009\u0004\u0005\u041b\u0006\u1009\u0005\u0007\u1009\u0006\u0008\u041b\t\u1004\u0001\n\u1004\u0002"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LJr7;->zzp:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
