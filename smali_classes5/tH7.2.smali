.class public final LtH7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:LtH7;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Lnu7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LtH7;

    invoke-direct {v0}, LtH7;-><init>()V

    sput-object v0, LtH7;->zzb:LtH7;

    const-class v1, LtH7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    const-string v0, "visionkit-pa.googleapis.com"

    iput-object v0, p0, LtH7;->zzf:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, LtH7;->zzg:Ljava/lang/String;

    invoke-static {}, Leu7;->s()Lnu7;

    move-result-object v0

    iput-object v0, p0, LtH7;->zzh:Lnu7;

    return-void
.end method

.method public static synthetic D()LtH7;
    .locals 1

    sget-object v0, LtH7;->zzb:LtH7;

    return-object v0
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, LtH7;->zzb:LtH7;

    return-object p1

    :cond_1
    new-instance p1, LqH7;

    invoke-direct {p1, p2}, LqH7;-><init>(LpH7;)V

    return-object p1

    :cond_2
    new-instance p1, LtH7;

    invoke-direct {p1}, LtH7;-><init>()V

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

    const-class p2, LsH7;

    aput-object p2, p1, v0

    sget-object p2, LtH7;->zzb:LtH7;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001b"

    invoke-static {p2, p3, p1}, Leu7;->v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
