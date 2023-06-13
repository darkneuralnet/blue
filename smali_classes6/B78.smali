.class public final LB78;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LB78;


# instance fields
.field private zze:I

.field private zzf:LhW7;

.field private zzg:Lzy7;

.field private zzh:LQn7;

.field private zzi:LAg8;

.field private zzj:Z

.field private zzk:LSA7;

.field private zzl:LVW7;

.field private zzm:LOT7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LB78;

    invoke-direct {v0}, LB78;-><init>()V

    sput-object v0, LB78;->zzb:LB78;

    const-class v1, LB78;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leu7;-><init>()V

    return-void
.end method

.method public static D()Lm78;
    .locals 1

    sget-object v0, LB78;->zzb:LB78;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, Lm78;

    return-object v0
.end method

.method public static synthetic E()LB78;
    .locals 1

    sget-object v0, LB78;->zzb:LB78;

    return-object v0
.end method

.method public static synthetic F(LB78;LhW7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LB78;->zzf:LhW7;

    iget p1, p0, LB78;->zze:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, LB78;->zze:I

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
    sget-object p1, LB78;->zzb:LB78;

    return-object p1

    :cond_1
    new-instance p1, Lm78;

    invoke-direct {p1, p2}, Lm78;-><init>(LX68;)V

    return-object p1

    :cond_2
    new-instance p1, LB78;

    invoke-direct {p1}, LB78;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x9

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzg"

    aput-object v3, p1, p2

    const-string p2, "zzk"

    aput-object p2, p1, v2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzm"

    aput-object p3, p1, p2

    sget-object p2, LB78;->zzb:LB78;

    const-string p3, "\u0001\u0008\u0000\u0001\u0001\t\u0008\u0000\u0000\u0000\u0001\u1009\u0001\u0003\u1009\u0005\u0004\u1009\u0000\u0005\u1009\u0002\u0006\u1009\u0003\u0007\u1007\u0004\u0008\u1009\u0006\t\u1009\u0007"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
