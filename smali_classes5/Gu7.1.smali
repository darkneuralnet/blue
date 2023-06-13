.class public final LGu7;
.super Lub9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# static fields
.field private static final zzb:LGu7;


# instance fields
.field private zze:I

.field private zzf:LT69;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LGu7;

    invoke-direct {v0}, LGu7;-><init>()V

    sput-object v0, LGu7;->zzb:LGu7;

    const-class v1, LGu7;

    invoke-static {v1, v0}, Lub9;->k(Ljava/lang/Class;Lub9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lub9;-><init>()V

    sget-object v0, LT69;->c:LT69;

    iput-object v0, p0, LGu7;->zzf:LT69;

    const-string v0, ""

    iput-object v0, p0, LGu7;->zzg:Ljava/lang/String;

    iput-object v0, p0, LGu7;->zzh:Ljava/lang/String;

    return-void
.end method

.method public static u()LQt7;
    .locals 1

    sget-object v0, LGu7;->zzb:LGu7;

    invoke-virtual {v0}, Lub9;->o()LFa9;

    move-result-object v0

    check-cast v0, LQt7;

    return-object v0
.end method

.method public static synthetic v()LGu7;
    .locals 1

    sget-object v0, LGu7;->zzb:LGu7;

    return-object v0
.end method

.method public static synthetic w(LGu7;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LGu7;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, LGu7;->zze:I

    iput-object p1, p0, LGu7;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic x(LGu7;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, LGu7;->zze:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, LGu7;->zze:I

    iput-object p1, p0, LGu7;->zzh:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, LGu7;->zzb:LGu7;

    return-object p1

    :cond_1
    new-instance p1, LQt7;

    invoke-direct {p1, p2}, LQt7;-><init>(Lrl9;)V

    return-object p1

    :cond_2
    new-instance p1, LGu7;

    invoke-direct {p1}, LGu7;-><init>()V

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

    sget-object p2, LGu7;->zzb:LGu7;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1008\u0001\u0003\u1008\u0002"

    invoke-static {p2, p3, p1}, Lub9;->j(Lpg9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
