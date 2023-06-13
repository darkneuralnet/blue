.class public final Lar9;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:Llu7;

.field private static final zze:Llu7;

.field private static final zzf:Lar9;


# instance fields
.field private zzg:I

.field private zzh:LDn9;

.field private zzi:Lhy9;

.field private zzj:Lku7;

.field private zzk:Lku7;

.field private zzl:Lgn9;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljq9;

    invoke-direct {v0}, Ljq9;-><init>()V

    sput-object v0, Lar9;->zzb:Llu7;

    new-instance v0, Lmq9;

    invoke-direct {v0}, Lmq9;-><init>()V

    sput-object v0, Lar9;->zze:Llu7;

    new-instance v0, Lar9;

    invoke-direct {v0}, Lar9;-><init>()V

    sput-object v0, Lar9;->zzf:Lar9;

    const-class v1, Lar9;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    invoke-static {}, Leu7;->q()Lku7;

    move-result-object v0

    iput-object v0, p0, Lar9;->zzj:Lku7;

    invoke-static {}, Leu7;->q()Lku7;

    move-result-object v0

    iput-object v0, p0, Lar9;->zzk:Lku7;

    return-void
.end method

.method public static synthetic D()Lar9;
    .locals 1

    sget-object v0, Lar9;->zzf:Lar9;

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
    sget-object p1, Lar9;->zzf:Lar9;

    return-object p1

    :cond_1
    new-instance p1, Lvq9;

    invoke-direct {p1, p2}, Lvq9;-><init>(LT39;)V

    return-object p1

    :cond_2
    new-instance p1, Lar9;

    invoke-direct {p1}, Lar9;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzg"

    aput-object v4, p1, v3

    const-string v3, "zzh"

    aput-object v3, p1, p2

    const-string p2, "zzi"

    aput-object p2, p1, v2

    const-string p2, "zzj"

    aput-object p2, p1, v1

    sget-object p2, Lpq9;->a:Liu7;

    aput-object p2, p1, v0

    const-string p2, "zzk"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    sget-object p3, Lsq9;->a:Liu7;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzl"

    aput-object p3, p1, p2

    sget-object p2, Lar9;->zzf:Lar9;

    const-string p3, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u001e\u0004\u001e\u0005\u1009\u0002"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
