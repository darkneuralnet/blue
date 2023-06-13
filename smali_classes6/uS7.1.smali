.class public final LuS7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LuS7;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:Ljava/lang/Object;

.field private zzh:Lo48;

.field private zzi:Z

.field private zzj:LaH8;

.field private zzk:Lth8;

.field private zzl:Lrm8;

.field private zzm:I

.field private zzn:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LuS7;

    invoke-direct {v0}, LuS7;-><init>()V

    sput-object v0, LuS7;->zzb:LuS7;

    const-class v1, LuS7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LuS7;->zzf:I

    const/4 v0, 0x2

    iput-byte v0, p0, LuS7;->zzn:B

    return-void
.end method

.method public static E()LfS7;
    .locals 1

    sget-object v0, LuS7;->zzb:LuS7;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, LfS7;

    return-object v0
.end method

.method public static synthetic F()LuS7;
    .locals 1

    sget-object v0, LuS7;->zzb:LuS7;

    return-object v0
.end method

.method public static synthetic G(LuS7;Lth8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LuS7;->zzk:Lth8;

    iget p1, p0, LuS7;->zze:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, LuS7;->zze:I

    return-void
.end method

.method public static synthetic H(LuS7;Lrm8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LuS7;->zzl:Lrm8;

    iget p1, p0, LuS7;->zze:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, LuS7;->zze:I

    return-void
.end method

.method public static synthetic I(LuS7;Lo48;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LuS7;->zzh:Lo48;

    iget p1, p0, LuS7;->zze:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, LuS7;->zze:I

    return-void
.end method

.method public static synthetic J(LuS7;LaH8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LuS7;->zzj:LaH8;

    iget p1, p0, LuS7;->zze:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, LuS7;->zze:I

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
    iput-byte p3, p0, LuS7;->zzn:B

    return-object v3

    :cond_1
    sget-object p1, LuS7;->zzb:LuS7;

    return-object p1

    :cond_2
    new-instance p1, LfS7;

    invoke-direct {p1, v3}, LfS7;-><init>(LQR7;)V

    return-object p1

    :cond_3
    new-instance p1, LuS7;

    invoke-direct {p1}, LuS7;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x9

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzg"

    aput-object p2, p1, v0

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const-string p2, "zze"

    aput-object p2, p1, v4

    const-string p2, "zzh"

    aput-object p2, p1, v3

    const-string p2, "zzi"

    aput-object p2, p1, v2

    const-string p2, "zzk"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzm"

    aput-object p3, p1, p2

    sget-object p2, LuS7;->zzb:LuS7;

    const-string p3, "\u0001\u0008\u0001\u0001\u0001\u0008\u0008\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1007\u0001\u0003\u1009\u0003\u0004\u1009\u0002\u0005\u103a\u0000\u0006\u103a\u0000\u0007\u1009\u0006\u0008\u1004\u0007"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, LuS7;->zzn:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final D()I
    .locals 1

    iget v0, p0, LuS7;->zzm:I

    return v0
.end method

.method public final K()Z
    .locals 2

    iget v0, p0, LuS7;->zzf:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LuS7;->zzg:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final L()Z
    .locals 2

    iget v0, p0, LuS7;->zzf:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LuS7;->zzg:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final M()Z
    .locals 1

    iget v0, p0, LuS7;->zze:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
