.class public final Lou9;
.super LEm9;
.source "SourceFile"

# interfaces
.implements LPp9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEm9<",
        "Lou9;",
        "Lmu9;",
        ">;",
        "LPp9;"
    }
.end annotation


# static fields
.field private static final zzb:Lou9;

.field private static volatile zze:Lhq9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhq9<",
            "Lou9;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzf:Ljava/lang/String;

.field private zzg:I

.field private zzh:Ljava/lang/String;

.field private zzi:LRv9;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lou9;

    invoke-direct {v0}, Lou9;-><init>()V

    sput-object v0, Lou9;->zzb:Lou9;

    const-class v1, Lou9;

    invoke-static {v1, v0}, LEm9;->m(Ljava/lang/Class;LEm9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LEm9;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lou9;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lou9;->zzh:Ljava/lang/String;

    return-void
.end method

.method public static synthetic w()Lou9;
    .locals 1

    sget-object v0, Lou9;->zzb:Lou9;

    return-object v0
.end method

.method public static x()Lou9;
    .locals 1

    sget-object v0, Lou9;->zzb:Lou9;

    return-object v0
.end method


# virtual methods
.method public final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_7

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_6

    if-eq p1, v0, :cond_5

    const/4 p2, 0x0

    if-eq p1, p3, :cond_4

    const/4 p3, 0x5

    if-eq p1, p3, :cond_3

    const/4 p3, 0x6

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lou9;->zze:Lhq9;

    if-nez p1, :cond_2

    const-class p2, Lou9;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lou9;->zze:Lhq9;

    if-nez p1, :cond_1

    new-instance p1, Lhm9;

    sget-object p3, Lou9;->zzb:Lou9;

    invoke-direct {p1, p3}, Lhm9;-><init>(LEm9;)V

    sput-object p1, Lou9;->zze:Lhq9;

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
    sget-object p1, Lou9;->zzb:Lou9;

    return-object p1

    :cond_4
    new-instance p1, Lmu9;

    invoke-direct {p1, p2}, Lmu9;-><init>(Lit9;)V

    return-object p1

    :cond_5
    new-instance p1, Lou9;

    invoke-direct {p1}, Lou9;-><init>()V

    return-object p1

    :cond_6
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zzf"

    aput-object v2, p1, p3

    const-string p3, "zzg"

    aput-object p3, p1, p2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const-string p2, "zzi"

    aput-object p2, p1, v0

    sget-object p2, Lou9;->zzb:Lou9;

    const-string p3, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u000c\u0003\u0208\u0004\t"

    invoke-static {p2, p3, p1}, LEm9;->l(LNp9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lou9;->zzf:Ljava/lang/String;

    return-object v0
.end method
