.class public final LXJ7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LXJ7;


# instance fields
.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LXJ7;

    invoke-direct {v0}, LXJ7;-><init>()V

    sput-object v0, LXJ7;->zzb:LXJ7;

    const-class v1, LXJ7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LXJ7;->zze:Ljava/lang/String;

    iput-object v0, p0, LXJ7;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static E()LWJ7;
    .locals 1

    sget-object v0, LXJ7;->zzb:LXJ7;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, LWJ7;

    return-object v0
.end method

.method public static synthetic F()LXJ7;
    .locals 1

    sget-object v0, LXJ7;->zzb:LXJ7;

    return-object v0
.end method

.method public static synthetic I(LXJ7;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LXJ7;->zze:Ljava/lang/String;

    return-void
.end method

.method public static synthetic J(LXJ7;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LXJ7;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic K(LXJ7;I)V
    .locals 0

    iput p1, p0, LXJ7;->zzg:I

    return-void
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, LXJ7;->zzb:LXJ7;

    return-object p1

    :cond_1
    new-instance p1, LWJ7;

    invoke-direct {p1, p3}, LWJ7;-><init>(LVJ7;)V

    return-object p1

    :cond_2
    new-instance p1, LXJ7;

    invoke-direct {p1}, LXJ7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zze"

    aput-object v1, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, LXJ7;->zzb:LXJ7;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0004"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final D()I
    .locals 1

    iget v0, p0, LXJ7;->zzg:I

    return v0
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LXJ7;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LXJ7;->zzf:Ljava/lang/String;

    return-object v0
.end method
