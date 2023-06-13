.class public final Lnx8;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:Lnx8;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:J

.field private zzh:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnx8;

    invoke-direct {v0}, Lnx8;-><init>()V

    sput-object v0, Lnx8;->zzb:Lnx8;

    const-class v1, Lnx8;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leu7;-><init>()V

    return-void
.end method

.method public static G()Lcx8;
    .locals 1

    sget-object v0, Lnx8;->zzb:Lnx8;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, Lcx8;

    return-object v0
.end method

.method public static synthetic H()Lnx8;
    .locals 1

    sget-object v0, Lnx8;->zzb:Lnx8;

    return-object v0
.end method

.method public static synthetic I(Lnx8;I)V
    .locals 1

    iget v0, p0, Lnx8;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnx8;->zze:I

    iput p1, p0, Lnx8;->zzf:I

    return-void
.end method

.method public static synthetic J(Lnx8;J)V
    .locals 1

    iget v0, p0, Lnx8;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lnx8;->zze:I

    iput-wide p1, p0, Lnx8;->zzg:J

    return-void
.end method

.method public static synthetic K(Lnx8;J)V
    .locals 1

    iget v0, p0, Lnx8;->zze:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lnx8;->zze:I

    iput-wide p1, p0, Lnx8;->zzh:J

    return-void
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 p2, 0x0

    if-eq p1, p3, :cond_1

    const/4 p3, 0x5

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lnx8;->zzb:Lnx8;

    return-object p1

    :cond_1
    new-instance p1, Lcx8;

    invoke-direct {p1, p2}, Lcx8;-><init>(LOw8;)V

    return-object p1

    :cond_2
    new-instance p1, Lnx8;

    invoke-direct {p1}, Lnx8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zze"

    aput-object v2, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    sget-object p2, Lnx8;->zzb:Lnx8;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001\u0003\u1002\u0002"

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

    iget v0, p0, Lnx8;->zzf:I

    return v0
.end method

.method public final E()J
    .locals 2

    iget-wide v0, p0, Lnx8;->zzg:J

    return-wide v0
.end method

.method public final F()J
    .locals 2

    iget-wide v0, p0, Lnx8;->zzh:J

    return-wide v0
.end method
