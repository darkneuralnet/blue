.class public final LKp8;
.super LpU8;
.source "SourceFile"

# interfaces
.implements LA19;


# static fields
.field private static final zza:LKp8;


# instance fields
.field private zzd:I

.field private zze:J

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:J

.field private zzi:F

.field private zzj:D


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LKp8;

    invoke-direct {v0}, LKp8;-><init>()V

    sput-object v0, LKp8;->zza:LKp8;

    const-class v1, LKp8;

    invoke-static {v1, v0}, LpU8;->w(Ljava/lang/Class;LpU8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LpU8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LKp8;->zzf:Ljava/lang/String;

    iput-object v0, p0, LKp8;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static E()Lyp8;
    .locals 1

    sget-object v0, LKp8;->zza:LKp8;

    invoke-virtual {v0}, LpU8;->i()LUS8;

    move-result-object v0

    check-cast v0, Lyp8;

    return-object v0
.end method

.method public static synthetic F()LKp8;
    .locals 1

    sget-object v0, LKp8;->zza:LKp8;

    return-object v0
.end method

.method public static synthetic I(LKp8;J)V
    .locals 1

    iget v0, p0, LKp8;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LKp8;->zzd:I

    iput-wide p1, p0, LKp8;->zze:J

    return-void
.end method

.method public static synthetic J(LKp8;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LKp8;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LKp8;->zzd:I

    iput-object p1, p0, LKp8;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic K(LKp8;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, LKp8;->zzd:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LKp8;->zzd:I

    iput-object p1, p0, LKp8;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic M(LKp8;)V
    .locals 1

    iget v0, p0, LKp8;->zzd:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, LKp8;->zzd:I

    sget-object v0, LKp8;->zza:LKp8;

    iget-object v0, v0, LKp8;->zzg:Ljava/lang/String;

    iput-object v0, p0, LKp8;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic N(LKp8;J)V
    .locals 1

    iget v0, p0, LKp8;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LKp8;->zzd:I

    iput-wide p1, p0, LKp8;->zzh:J

    return-void
.end method

.method public static synthetic O(LKp8;)V
    .locals 2

    iget v0, p0, LKp8;->zzd:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, LKp8;->zzd:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LKp8;->zzh:J

    return-void
.end method

.method public static synthetic P(LKp8;D)V
    .locals 1

    iget v0, p0, LKp8;->zzd:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, LKp8;->zzd:I

    iput-wide p1, p0, LKp8;->zzj:D

    return-void
.end method

.method public static synthetic Q(LKp8;)V
    .locals 2

    iget v0, p0, LKp8;->zzd:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, LKp8;->zzd:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LKp8;->zzj:D

    return-void
.end method


# virtual methods
.method public final A(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, LKp8;->zza:LKp8;

    return-object p1

    :cond_1
    new-instance p1, Lyp8;

    invoke-direct {p1, p2}, Lyp8;-><init>(LXh8;)V

    return-object p1

    :cond_2
    new-instance p1, LKp8;

    invoke-direct {p1}, LKp8;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    sget-object p2, LKp8;->zza:LKp8;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1001\u0004\u0006\u1000\u0005"

    invoke-static {p2, p3, p1}, LpU8;->t(Lr19;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final B()D
    .locals 2

    iget-wide v0, p0, LKp8;->zzj:D

    return-wide v0
.end method

.method public final C()J
    .locals 2

    iget-wide v0, p0, LKp8;->zzh:J

    return-wide v0
.end method

.method public final D()J
    .locals 2

    iget-wide v0, p0, LKp8;->zze:J

    return-wide v0
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LKp8;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LKp8;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final R()Z
    .locals 1

    iget v0, p0, LKp8;->zzd:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final S()Z
    .locals 1

    iget v0, p0, LKp8;->zzd:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final T()Z
    .locals 2

    iget v0, p0, LKp8;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final U()Z
    .locals 1

    iget v0, p0, LKp8;->zzd:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
