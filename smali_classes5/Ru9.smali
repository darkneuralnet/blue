.class public final LRu9;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LRu9;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;

.field private zzk:Ljava/lang/String;

.field private zzl:Ljava/lang/String;

.field private zzm:Lnu7;

.field private zzn:Ljava/lang/String;

.field private zzo:Z

.field private zzp:Z

.field private zzq:Z

.field private zzr:I

.field private zzs:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LRu9;

    invoke-direct {v0}, LRu9;-><init>()V

    sput-object v0, LRu9;->zzb:LRu9;

    const-class v1, LRu9;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LRu9;->zzf:Ljava/lang/String;

    iput-object v0, p0, LRu9;->zzg:Ljava/lang/String;

    iput-object v0, p0, LRu9;->zzh:Ljava/lang/String;

    iput-object v0, p0, LRu9;->zzi:Ljava/lang/String;

    iput-object v0, p0, LRu9;->zzj:Ljava/lang/String;

    iput-object v0, p0, LRu9;->zzk:Ljava/lang/String;

    iput-object v0, p0, LRu9;->zzl:Ljava/lang/String;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v1

    iput-object v1, p0, LRu9;->zzm:Lnu7;

    iput-object v0, p0, LRu9;->zzn:Ljava/lang/String;

    return-void
.end method

.method public static D()LPu9;
    .locals 1

    sget-object v0, LRu9;->zzb:LRu9;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, LPu9;

    return-object v0
.end method

.method public static synthetic E()LRu9;
    .locals 1

    sget-object v0, LRu9;->zzb:LRu9;

    return-object v0
.end method

.method public static F()LRu9;
    .locals 1

    sget-object v0, LRu9;->zzb:LRu9;

    return-object v0
.end method

.method public static synthetic H(LRu9;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, LRu9;->zze:I

    iput-object p1, p0, LRu9;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I(LRu9;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LRu9;->zze:I

    iput-object p1, p0, LRu9;->zzi:Ljava/lang/String;

    return-void
.end method

.method public static synthetic J(LRu9;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, LRu9;->zze:I

    iput-object p1, p0, LRu9;->zzj:Ljava/lang/String;

    return-void
.end method

.method public static synthetic K(LRu9;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, LRu9;->zze:I

    iput-object p1, p0, LRu9;->zzk:Ljava/lang/String;

    return-void
.end method

.method public static synthetic L(LRu9;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, LRu9;->zze:I

    iput-object p1, p0, LRu9;->zzl:Ljava/lang/String;

    return-void
.end method

.method public static synthetic M(LRu9;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, LRu9;->zzm:Lnu7;

    invoke-interface {v0}, Lnu7;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Leu7;->t(Lnu7;)Lnu7;

    move-result-object v0

    iput-object v0, p0, LRu9;->zzm:Lnu7;

    :cond_0
    iget-object p0, p0, LRu9;->zzm:Lnu7;

    invoke-static {p1, p0}, Lys7;->c(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic N(LRu9;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, LRu9;->zze:I

    iput-object p1, p0, LRu9;->zzn:Ljava/lang/String;

    return-void
.end method

.method public static synthetic O(LRu9;Z)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, LRu9;->zze:I

    iput-boolean p1, p0, LRu9;->zzo:Z

    return-void
.end method

.method public static synthetic P(LRu9;Z)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, LRu9;->zze:I

    iput-boolean p1, p0, LRu9;->zzp:Z

    return-void
.end method

.method public static synthetic Q(LRu9;I)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, LRu9;->zze:I

    iput p1, p0, LRu9;->zzr:I

    return-void
.end method

.method public static synthetic R(LRu9;I)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, LRu9;->zze:I

    iput p1, p0, LRu9;->zzs:I

    return-void
.end method

.method public static synthetic S(LRu9;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LRu9;->zze:I

    iput-object p1, p0, LRu9;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic T(LRu9;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LRu9;->zze:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LRu9;->zze:I

    iput-object p1, p0, LRu9;->zzh:Ljava/lang/String;

    return-void
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
    sget-object p1, LRu9;->zzb:LRu9;

    return-object p1

    :cond_1
    new-instance p1, LPu9;

    invoke-direct {p1, p2}, LPu9;-><init>(LT39;)V

    return-object p1

    :cond_2
    new-instance p1, LRu9;

    invoke-direct {p1}, LRu9;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xf

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

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzs"

    aput-object p3, p1, p2

    sget-object p2, LRu9;->zzb:LRu9;

    const-string p3, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\u0008\u001a\t\u1008\u0007\n\u1007\u0008\u000b\u1007\t\u000c\u1007\n\r\u100b\u000b\u000e\u1004\u000c"

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

    iget-object v0, p0, LRu9;->zzj:Ljava/lang/String;

    return-object v0
.end method
