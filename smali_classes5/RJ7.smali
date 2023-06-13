.class public final LRJ7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LRJ7;


# instance fields
.field private zze:LUJ7;

.field private zzf:LOJ7;

.field private zzg:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LRJ7;

    invoke-direct {v0}, LRJ7;-><init>()V

    sput-object v0, LRJ7;->zzb:LRJ7;

    const-class v1, LRJ7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LRJ7;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static E()LQJ7;
    .locals 1

    sget-object v0, LRJ7;->zzb:LRJ7;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, LQJ7;

    return-object v0
.end method

.method public static synthetic F()LRJ7;
    .locals 1

    sget-object v0, LRJ7;->zzb:LRJ7;

    return-object v0
.end method

.method public static synthetic I(LRJ7;LUJ7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LRJ7;->zze:LUJ7;

    return-void
.end method

.method public static synthetic J(LRJ7;LOJ7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LRJ7;->zzf:LOJ7;

    return-void
.end method

.method public static synthetic K(LRJ7;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LRJ7;->zzg:Ljava/lang/String;

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
    sget-object p1, LRJ7;->zzb:LRJ7;

    return-object p1

    :cond_1
    new-instance p1, LQJ7;

    invoke-direct {p1, p3}, LQJ7;-><init>(LPJ7;)V

    return-object p1

    :cond_2
    new-instance p1, LRJ7;

    invoke-direct {p1}, LRJ7;-><init>()V

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

    sget-object p2, LRJ7;->zzb:LRJ7;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0208"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final D()LOJ7;
    .locals 1

    iget-object v0, p0, LRJ7;->zzf:LOJ7;

    if-nez v0, :cond_0

    invoke-static {}, LOJ7;->G()LOJ7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final G()LUJ7;
    .locals 1

    iget-object v0, p0, LRJ7;->zze:LUJ7;

    if-nez v0, :cond_0

    invoke-static {}, LUJ7;->F()LUJ7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LRJ7;->zzg:Ljava/lang/String;

    return-object v0
.end method
