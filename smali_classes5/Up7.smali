.class public final LUp7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LUp7;


# instance fields
.field private zze:LZu7;

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Z

.field private zzi:Z

.field private zzj:Ljava/lang/String;

.field private zzk:Ljava/lang/String;

.field private zzl:Ljava/lang/String;

.field private zzm:Lnu7;

.field private zzn:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LUp7;

    invoke-direct {v0}, LUp7;-><init>()V

    sput-object v0, LUp7;->zzb:LUp7;

    const-class v1, LUp7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    invoke-static {}, LZu7;->d()LZu7;

    move-result-object v0

    iput-object v0, p0, LUp7;->zze:LZu7;

    const-string v0, ""

    iput-object v0, p0, LUp7;->zzf:Ljava/lang/String;

    iput-object v0, p0, LUp7;->zzg:Ljava/lang/String;

    iput-object v0, p0, LUp7;->zzj:Ljava/lang/String;

    iput-object v0, p0, LUp7;->zzk:Ljava/lang/String;

    iput-object v0, p0, LUp7;->zzl:Ljava/lang/String;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LUp7;->zzm:Lnu7;

    return-void
.end method

.method public static synthetic D()LUp7;
    .locals 1

    sget-object v0, LUp7;->zzb:LUp7;

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
    sget-object p1, LUp7;->zzb:LUp7;

    return-object p1

    :cond_1
    new-instance p1, LSp7;

    invoke-direct {p1, p2}, LSp7;-><init>(LRp7;)V

    return-object p1

    :cond_2
    new-instance p1, LUp7;

    invoke-direct {p1}, LUp7;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xb

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    sget-object v3, LTp7;->a:LYu7;

    aput-object v3, p1, p2

    const-string p2, "zzi"

    aput-object p2, p1, v2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    const-string p2, "zzj"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzh"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzn"

    aput-object p3, p1, p2

    sget-object p2, LUp7;->zzb:LUp7;

    const-string p3, "\u0000\n\u0000\u0000\u0001\u000c\n\u0001\u0001\u0000\u00012\u0004\u0007\u0005\u0208\u0006\u0208\u0007\u0208\u0008\u0007\t\u0208\n\u0208\u000b\u021a\u000c\u0007"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
