.class public final LB59;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:Llu7;

.field private static final zze:Llu7;

.field private static final zzf:Llu7;

.field private static final zzg:LB59;


# instance fields
.field private zzh:I

.field private zzi:J

.field private zzj:Lku7;

.field private zzk:Lku7;

.field private zzl:Lku7;

.field private zzm:Ljava/lang/String;

.field private zzn:I

.field private zzo:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc49;

    invoke-direct {v0}, Lc49;-><init>()V

    sput-object v0, LB59;->zzb:Llu7;

    new-instance v0, Lk49;

    invoke-direct {v0}, Lk49;-><init>()V

    sput-object v0, LB59;->zze:Llu7;

    new-instance v0, Ls49;

    invoke-direct {v0}, Ls49;-><init>()V

    sput-object v0, LB59;->zzf:Llu7;

    new-instance v0, LB59;

    invoke-direct {v0}, LB59;-><init>()V

    sput-object v0, LB59;->zzg:LB59;

    const-class v1, LB59;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    invoke-static {}, Leu7;->q()Lku7;

    move-result-object v0

    iput-object v0, p0, LB59;->zzj:Lku7;

    invoke-static {}, Leu7;->q()Lku7;

    move-result-object v0

    iput-object v0, p0, LB59;->zzk:Lku7;

    invoke-static {}, Leu7;->q()Lku7;

    move-result-object v0

    iput-object v0, p0, LB59;->zzl:Lku7;

    const-string v0, ""

    iput-object v0, p0, LB59;->zzm:Ljava/lang/String;

    return-void
.end method

.method public static synthetic D()LB59;
    .locals 1

    sget-object v0, LB59;->zzg:LB59;

    return-object v0
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
    sget-object p1, LB59;->zzg:LB59;

    return-object p1

    :cond_1
    new-instance p1, LA49;

    invoke-direct {p1, p2}, LA49;-><init>(LT39;)V

    return-object p1

    :cond_2
    new-instance p1, LB59;

    invoke-direct {p1}, LB59;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xc

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzh"

    aput-object v4, p1, v3

    const-string v3, "zzi"

    aput-object v3, p1, p2

    const-string p2, "zzj"

    aput-object p2, p1, v2

    sget-object p2, Lt59;->a:Liu7;

    aput-object p2, p1, v1

    const-string v1, "zzk"

    aput-object v1, p1, v0

    aput-object p2, p1, p3

    const/4 p3, 0x6

    const-string v0, "zzl"

    aput-object v0, p1, p3

    const/4 p3, 0x7

    aput-object p2, p1, p3

    const/16 p2, 0x8

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    sget-object p3, Ll59;->a:Liu7;

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzo"

    aput-object p3, p1, p2

    sget-object p2, LB59;->zzg:LB59;

    const-string p3, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u1003\u0000\u0002\u001e\u0003\u001e\u0004\u001e\u0005\u1008\u0001\u0006\u100c\u0002\u0007\u1004\u0003"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
