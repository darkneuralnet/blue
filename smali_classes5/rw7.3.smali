.class public final Lrw7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# static fields
.field private static final zzb:Lrw7;


# instance fields
.field private zze:J

.field private zzf:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrw7;

    invoke-direct {v0}, Lrw7;-><init>()V

    sput-object v0, Lrw7;->zzb:Lrw7;

    const-class v1, Lrw7;

    invoke-static {v1, v0}, Leu7;->x(Ljava/lang/Class;Leu7;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leu7;-><init>()V

    return-void
.end method

.method public static E()Lqw7;
    .locals 1

    sget-object v0, Lrw7;->zzb:Lrw7;

    invoke-virtual {v0}, Leu7;->f()LZt7;

    move-result-object v0

    check-cast v0, Lqw7;

    return-object v0
.end method

.method public static synthetic F()Lrw7;
    .locals 1

    sget-object v0, Lrw7;->zzb:Lrw7;

    return-object v0
.end method

.method public static G()Lrw7;
    .locals 1

    sget-object v0, Lrw7;->zzb:Lrw7;

    return-object v0
.end method

.method public static synthetic H(Lrw7;J)V
    .locals 0

    iput-wide p1, p0, Lrw7;->zze:J

    return-void
.end method


# virtual methods
.method public final B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lrw7;->zzb:Lrw7;

    return-object p1

    :cond_1
    new-instance p1, Lqw7;

    invoke-direct {p1, p3}, Lqw7;-><init>(Law7;)V

    return-object p1

    :cond_2
    new-instance p1, Lrw7;

    invoke-direct {p1}, Lrw7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zze"

    aput-object v0, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    sget-object p2, Lrw7;->zzb:Lrw7;

    new-instance p3, LHv7;

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004"

    invoke-direct {p3, p2, v0, p1}, LHv7;-><init>(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p3

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final D()J
    .locals 2

    iget-wide v0, p0, Lrw7;->zze:J

    return-wide v0
.end method
