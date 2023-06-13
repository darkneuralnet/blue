.class public final LKn7;
.super Lub9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# static fields
.field private static final zzb:LKn7;


# instance fields
.field private zze:I

.field private zzf:LGu7;

.field private zzg:LGu7;

.field private zzh:LGu7;

.field private zzi:LGu7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LKn7;

    invoke-direct {v0}, LKn7;-><init>()V

    sput-object v0, LKn7;->zzb:LKn7;

    const-class v1, LKn7;

    invoke-static {v1, v0}, Lub9;->k(Ljava/lang/Class;Lub9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lub9;-><init>()V

    return-void
.end method

.method public static u()LRm7;
    .locals 1

    sget-object v0, LKn7;->zzb:LKn7;

    invoke-virtual {v0}, Lub9;->o()LFa9;

    move-result-object v0

    check-cast v0, LRm7;

    return-object v0
.end method

.method public static synthetic v()LKn7;
    .locals 1

    sget-object v0, LKn7;->zzb:LKn7;

    return-object v0
.end method

.method public static synthetic w(LKn7;LGu7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LKn7;->zzf:LGu7;

    iget p1, p0, LKn7;->zze:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, LKn7;->zze:I

    return-void
.end method

.method public static synthetic x(LKn7;LGu7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LKn7;->zzg:LGu7;

    iget p1, p0, LKn7;->zze:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, LKn7;->zze:I

    return-void
.end method

.method public static synthetic y(LKn7;LGu7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LKn7;->zzh:LGu7;

    iget p1, p0, LKn7;->zze:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, LKn7;->zze:I

    return-void
.end method

.method public static synthetic z(LKn7;LGu7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LKn7;->zzi:LGu7;

    iget p1, p0, LKn7;->zze:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, LKn7;->zze:I

    return-void
.end method


# virtual methods
.method public final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, LKn7;->zzb:LKn7;

    return-object p1

    :cond_1
    new-instance p1, LRm7;

    invoke-direct {p1, p2}, LRm7;-><init>(Lrl9;)V

    return-object p1

    :cond_2
    new-instance p1, LKn7;

    invoke-direct {p1}, LKn7;-><init>()V

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

    sget-object p2, LKn7;->zzb:LKn7;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003"

    invoke-static {p2, p3, p1}, Lub9;->j(Lpg9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
