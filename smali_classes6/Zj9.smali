.class public final LZj9;
.super LEm9;
.source "SourceFile"

# interfaces
.implements LPp9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEm9<",
        "LZj9;",
        "LSj9;",
        ">;",
        "LPp9;"
    }
.end annotation


# static fields
.field private static final zzb:LZj9;

.field private static volatile zze:Lhq9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhq9<",
            "LZj9;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzf:J

.field private zzg:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LZj9;

    invoke-direct {v0}, LZj9;-><init>()V

    sput-object v0, LZj9;->zzb:LZj9;

    const-class v1, LZj9;

    invoke-static {v1, v0}, LEm9;->m(Ljava/lang/Class;LEm9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LEm9;-><init>()V

    return-void
.end method

.method public static synthetic A()LZj9;
    .locals 1

    sget-object v0, LZj9;->zzb:LZj9;

    return-object v0
.end method

.method public static synthetic B(LZj9;J)V
    .locals 0

    iput-wide p1, p0, LZj9;->zzf:J

    return-void
.end method

.method public static synthetic C(LZj9;I)V
    .locals 0

    iput p1, p0, LZj9;->zzg:I

    return-void
.end method

.method public static y()LSj9;
    .locals 1

    sget-object v0, LZj9;->zzb:LZj9;

    invoke-virtual {v0}, LEm9;->o()Lbm9;

    move-result-object v0

    check-cast v0, LSj9;

    return-object v0
.end method


# virtual methods
.method public final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_7

    const/4 p3, 0x2

    if-eq p1, p3, :cond_6

    const/4 p2, 0x3

    if-eq p1, p2, :cond_5

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_4

    const/4 p2, 0x5

    if-eq p1, p2, :cond_3

    const/4 p2, 0x6

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, LZj9;->zze:Lhq9;

    if-nez p1, :cond_2

    const-class p2, LZj9;

    monitor-enter p2

    :try_start_0
    sget-object p1, LZj9;->zze:Lhq9;

    if-nez p1, :cond_1

    new-instance p1, Lhm9;

    sget-object p3, LZj9;->zzb:LZj9;

    invoke-direct {p1, p3}, Lhm9;-><init>(LEm9;)V

    sput-object p1, LZj9;->zze:Lhq9;

    :cond_1
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    return-object p1

    :cond_3
    sget-object p1, LZj9;->zzb:LZj9;

    return-object p1

    :cond_4
    new-instance p1, LSj9;

    invoke-direct {p1, p3}, LSj9;-><init>(LLj9;)V

    return-object p1

    :cond_5
    new-instance p1, LZj9;

    invoke-direct {p1}, LZj9;-><init>()V

    return-object p1

    :cond_6
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzf"

    aput-object v0, p1, p3

    const-string p3, "zzg"

    aput-object p3, p1, p2

    sget-object p2, LZj9;->zzb:LZj9;

    new-instance p3, Ltq9;

    const-string v0, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004"

    invoke-direct {p3, p2, v0, p1}, Ltq9;-><init>(LNp9;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p3

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final w()I
    .locals 1

    iget v0, p0, LZj9;->zzg:I

    return v0
.end method

.method public final x()J
    .locals 2

    iget-wide v0, p0, LZj9;->zzf:J

    return-wide v0
.end method
