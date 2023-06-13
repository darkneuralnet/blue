.class public final LzG7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LzG7;


# instance fields
.field private zze:I

.field private zzf:J

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:I

.field private zzj:I

.field private zzk:Lnu7;

.field private zzl:Ljava/lang/String;

.field private zzm:LrG7;

.field private zzn:Lkt7;

.field private zzo:LLG7;

.field private zzp:Ljava/lang/String;

.field private zzq:Lnu7;

.field private zzr:Lnu7;

.field private zzs:Lkt7;

.field private zzt:Ljava/lang/String;

.field private zzu:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LzG7;

    invoke-direct {v0}, LzG7;-><init>()V

    sput-object v0, LzG7;->zzb:LzG7;

    const-class v1, LzG7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Leu7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, LzG7;->zzu:B

    const-string v0, ""

    iput-object v0, p0, LzG7;->zzg:Ljava/lang/String;

    iput-object v0, p0, LzG7;->zzh:Ljava/lang/String;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v1

    iput-object v1, p0, LzG7;->zzk:Lnu7;

    iput-object v0, p0, LzG7;->zzl:Ljava/lang/String;

    sget-object v1, Lkt7;->c:Lkt7;

    iput-object v1, p0, LzG7;->zzn:Lkt7;

    iput-object v0, p0, LzG7;->zzp:Ljava/lang/String;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v2

    iput-object v2, p0, LzG7;->zzq:Lnu7;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v2

    iput-object v2, p0, LzG7;->zzr:Lnu7;

    iput-object v1, p0, LzG7;->zzs:Lkt7;

    iput-object v0, p0, LzG7;->zzt:Ljava/lang/String;

    return-void
.end method

.method public static synthetic D()LzG7;
    .locals 1

    sget-object v0, LzG7;->zzb:LzG7;

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
    iput-byte p3, p0, LzG7;->zzu:B

    return-object v3

    :cond_1
    sget-object p1, LzG7;->zzb:LzG7;

    return-object p1

    :cond_2
    new-instance p1, LwG7;

    invoke-direct {p1, v3}, LwG7;-><init>(LvG7;)V

    return-object p1

    :cond_3
    new-instance p1, LzG7;

    invoke-direct {p1}, LzG7;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x12

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zze"

    aput-object p2, p1, v0

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const-string p2, "zzq"

    aput-object p2, p1, v4

    const-class p2, LyG7;

    aput-object p2, p1, v3

    const-string p2, "zzg"

    aput-object p2, p1, v2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zzt"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-class p3, LuG7;

    aput-object p3, p1, p2

    sget-object p2, LzG7;->zzb:LzG7;

    const-string p3, "\u0001\u000f\u0000\u0001\u0001\u001c\u000f\u0000\u0003\u0004\u0001\u1502\u0000\u0002\u0431\u0010\u1008\u0001\u0011\u1008\u0002\u0012\u1004\u0003\u0013\u1004\u0004\u0014\u001a\u0015\u1008\u0005\u0016\u100a\u0007\u0017\u1409\u0008\u0018\u1409\u0006\u0019\u100a\n\u001a\u1008\t\u001b\u1008\u000b\u001c\u001b"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LzG7;->zzu:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
