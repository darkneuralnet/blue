.class public final LLr7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LLr7;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:F

.field private zzi:F

.field private zzj:I

.field private zzk:I

.field private zzl:I

.field private zzm:I

.field private zzn:I

.field private zzo:Ljava/lang/String;

.field private zzp:F

.field private zzq:Ljava/lang/String;

.field private zzr:F

.field private zzs:Lnu7;

.field private zzt:Lju7;

.field private zzu:Lju7;

.field private zzv:Lnu7;

.field private zzw:Lju7;

.field private zzx:Lju7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LLr7;

    invoke-direct {v0}, LLr7;-><init>()V

    sput-object v0, LLr7;->zzb:LLr7;

    const-class v1, LLr7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LLr7;->zzo:Ljava/lang/String;

    iput-object v0, p0, LLr7;->zzq:Ljava/lang/String;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LLr7;->zzs:Lnu7;

    invoke-static {}, Leu7;->p()Lju7;

    move-result-object v0

    iput-object v0, p0, LLr7;->zzt:Lju7;

    invoke-static {}, Leu7;->p()Lju7;

    move-result-object v0

    iput-object v0, p0, LLr7;->zzu:Lju7;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LLr7;->zzv:Lnu7;

    invoke-static {}, Leu7;->p()Lju7;

    move-result-object v0

    iput-object v0, p0, LLr7;->zzw:Lju7;

    invoke-static {}, Leu7;->p()Lju7;

    move-result-object v0

    iput-object v0, p0, LLr7;->zzx:Lju7;

    return-void
.end method

.method public static synthetic D()LLr7;
    .locals 1

    sget-object v0, LLr7;->zzb:LLr7;

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
    sget-object p1, LLr7;->zzb:LLr7;

    return-object p1

    :cond_1
    new-instance p1, LKr7;

    invoke-direct {p1, p2}, LKr7;-><init>(Leq7;)V

    return-object p1

    :cond_2
    new-instance p1, LLr7;

    invoke-direct {p1}, LLr7;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x14

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const-string p2, "zzi"

    aput-object p2, p1, v0

    const-string p2, "zzj"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzr"

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

    sget-object p2, LLr7;->zzb:LLr7;

    const-string p3, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0006\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1004\u0006\u0008\u1004\u0007\t\u1004\u0008\n\u1008\u000b\u000b\u001a\u000c\u1008\t\r\u1001\n\u000e\u1001\u000c\u000f$\u0010$\u0011\u001a\u0012$\u0013$"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
