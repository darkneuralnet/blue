.class public final Led9;
.super Lub9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# static fields
.field private static final zzb:Led9;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:I

.field private zzi:I

.field private zzj:Z

.field private zzk:J

.field private zzl:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Led9;

    invoke-direct {v0}, Led9;-><init>()V

    sput-object v0, Led9;->zzb:Led9;

    const-class v1, Led9;

    invoke-static {v1, v0}, Lub9;->k(Ljava/lang/Class;Lub9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lub9;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Led9;->zzl:Ljava/lang/String;

    return-void
.end method

.method public static synthetic A(Led9;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Led9;->zzi:I

    iget p1, p0, Led9;->zze:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Led9;->zze:I

    return-void
.end method

.method public static u()Ld99;
    .locals 1

    sget-object v0, Led9;->zzb:Led9;

    invoke-virtual {v0}, Lub9;->o()LFa9;

    move-result-object v0

    check-cast v0, Ld99;

    return-object v0
.end method

.method public static synthetic v()Led9;
    .locals 1

    sget-object v0, Led9;->zzb:Led9;

    return-object v0
.end method

.method public static synthetic w(Led9;I)V
    .locals 1

    iget v0, p0, Led9;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Led9;->zze:I

    iput p1, p0, Led9;->zzf:I

    return-void
.end method

.method public static synthetic x(Led9;J)V
    .locals 1

    iget v0, p0, Led9;->zze:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Led9;->zze:I

    iput-wide p1, p0, Led9;->zzk:J

    return-void
.end method

.method public static synthetic y(Led9;I)V
    .locals 1

    iget v0, p0, Led9;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Led9;->zze:I

    iput p1, p0, Led9;->zzg:I

    return-void
.end method

.method public static synthetic z(Led9;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Led9;->zzh:I

    iget p1, p0, Led9;->zze:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Led9;->zze:I

    return-void
.end method


# virtual methods
.method public final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Led9;->zzb:Led9;

    return-object p1

    :cond_1
    new-instance p1, Ld99;

    invoke-direct {p1, p2}, Ld99;-><init>(LH49;)V

    return-object p1

    :cond_2
    new-instance p1, Led9;

    invoke-direct {p1}, Led9;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xa

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

    sget-object p2, LgZ8;->a:LWb9;

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    sget-object p3, Lyh9;->a:LWb9;

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

    sget-object p2, Led9;->zzb:Led9;

    const-string p3, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u100c\u0002\u0004\u100c\u0003\u0005\u1007\u0004\u0006\u1002\u0005\u0007\u1008\u0006"

    invoke-static {p2, p3, p1}, Lub9;->j(Lpg9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
