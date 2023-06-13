.class public final LUJ7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LUJ7;


# instance fields
.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LUJ7;

    invoke-direct {v0}, LUJ7;-><init>()V

    sput-object v0, LUJ7;->zzb:LUJ7;

    const-class v1, LUJ7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LUJ7;->zze:Ljava/lang/String;

    iput-object v0, p0, LUJ7;->zzf:Ljava/lang/String;

    iput-object v0, p0, LUJ7;->zzg:Ljava/lang/String;

    iput-object v0, p0, LUJ7;->zzh:Ljava/lang/String;

    iput-object v0, p0, LUJ7;->zzi:Ljava/lang/String;

    return-void
.end method

.method public static D()LTJ7;
    .locals 1

    sget-object v0, LUJ7;->zzb:LUJ7;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, LTJ7;

    return-object v0
.end method

.method public static synthetic E()LUJ7;
    .locals 1

    sget-object v0, LUJ7;->zzb:LUJ7;

    return-object v0
.end method

.method public static F()LUJ7;
    .locals 1

    sget-object v0, LUJ7;->zzb:LUJ7;

    return-object v0
.end method

.method public static synthetic L(LUJ7;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LUJ7;->zze:Ljava/lang/String;

    return-void
.end method

.method public static synthetic M(LUJ7;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LUJ7;->zzh:Ljava/lang/String;

    return-void
.end method

.method public static synthetic N(LUJ7;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LUJ7;->zzi:Ljava/lang/String;

    return-void
.end method

.method public static synthetic O(LUJ7;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LUJ7;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic P(LUJ7;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LUJ7;->zzg:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    sget-object p1, LUJ7;->zzb:LUJ7;

    return-object p1

    :cond_1
    new-instance p1, LTJ7;

    invoke-direct {p1, p2}, LTJ7;-><init>(LSJ7;)V

    return-object p1

    :cond_2
    new-instance p1, LUJ7;

    invoke-direct {p1}, LUJ7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zze"

    aput-object v3, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const-string p2, "zzi"

    aput-object p2, p1, v0

    sget-object p2, LUJ7;->zzb:LUJ7;

    const-string p3, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUJ7;->zzi:Ljava/lang/String;

    return-object v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUJ7;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUJ7;->zzh:Ljava/lang/String;

    return-object v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUJ7;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUJ7;->zzf:Ljava/lang/String;

    return-object v0
.end method
