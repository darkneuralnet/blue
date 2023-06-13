.class public final Lku9;
.super LEm9;
.source "SourceFile"

# interfaces
.implements LPp9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEm9<",
        "Lku9;",
        "LEt9;",
        ">;",
        "LPp9;"
    }
.end annotation


# static fields
.field private static final zzb:Lku9;

.field private static volatile zze:Lhq9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhq9<",
            "Lku9;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:J

.field private zzi:Ljava/lang/String;

.field private zzj:Lyp9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyp9<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzk:Ljava/lang/String;

.field private zzl:Z

.field private zzm:Lyp9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyp9<",
            "Ljava/lang/Integer;",
            "Lnh9;",
            ">;"
        }
    .end annotation
.end field

.field private zzn:Ljava/lang/String;

.field private zzo:Lwu9;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lku9;

    invoke-direct {v0}, Lku9;-><init>()V

    sput-object v0, Lku9;->zzb:Lku9;

    const-class v1, Lku9;

    invoke-static {v1, v0}, LEm9;->m(Ljava/lang/Class;LEm9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LEm9;-><init>()V

    invoke-static {}, Lyp9;->d()Lyp9;

    move-result-object v0

    iput-object v0, p0, Lku9;->zzj:Lyp9;

    invoke-static {}, Lyp9;->d()Lyp9;

    move-result-object v0

    iput-object v0, p0, Lku9;->zzm:Lyp9;

    const-string v0, ""

    iput-object v0, p0, Lku9;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lku9;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lku9;->zzi:Ljava/lang/String;

    iput-object v0, p0, Lku9;->zzk:Ljava/lang/String;

    iput-object v0, p0, Lku9;->zzn:Ljava/lang/String;

    return-void
.end method

.method public static synthetic A()Lku9;
    .locals 1

    sget-object v0, Lku9;->zzb:Lku9;

    return-object v0
.end method

.method public static synthetic B(Lku9;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lku9;->zzj:Lyp9;

    invoke-virtual {v0}, Lyp9;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lku9;->zzj:Lyp9;

    invoke-virtual {v0}, Lyp9;->e()Lyp9;

    move-result-object v0

    iput-object v0, p0, Lku9;->zzj:Lyp9;

    :cond_0
    iget-object p0, p0, Lku9;->zzj:Lyp9;

    return-object p0
.end method

.method public static synthetic C(Lku9;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lku9;->zzm:Lyp9;

    invoke-virtual {v0}, Lyp9;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lku9;->zzm:Lyp9;

    invoke-virtual {v0}, Lyp9;->e()Lyp9;

    move-result-object v0

    iput-object v0, p0, Lku9;->zzm:Lyp9;

    :cond_0
    iget-object p0, p0, Lku9;->zzm:Lyp9;

    return-object p0
.end method

.method public static synthetic D(Lku9;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lku9;->zzk:Ljava/lang/String;

    return-void
.end method

.method public static synthetic E(Lku9;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lku9;->zzl:Z

    return-void
.end method

.method public static synthetic F(Lku9;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lku9;->zzn:Ljava/lang/String;

    return-void
.end method

.method public static synthetic G(Lku9;Lwu9;)V
    .locals 0

    iput-object p1, p0, Lku9;->zzo:Lwu9;

    return-void
.end method

.method public static synthetic H(Lku9;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lku9;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic w(Lku9;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lku9;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic x(Lku9;J)V
    .locals 0

    iput-wide p1, p0, Lku9;->zzh:J

    return-void
.end method

.method public static y()LEt9;
    .locals 1

    sget-object v0, Lku9;->zzb:Lku9;

    invoke-virtual {v0}, LEm9;->o()Lbm9;

    move-result-object v0

    check-cast v0, LEt9;

    return-object v0
.end method


# virtual methods
.method public final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_7

    const/4 p3, 0x6

    const/4 v0, 0x5

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    if-eq p1, v3, :cond_6

    if-eq p1, v2, :cond_5

    const/4 p2, 0x0

    if-eq p1, v1, :cond_4

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lku9;->zze:Lhq9;

    if-nez p1, :cond_2

    const-class p2, Lku9;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lku9;->zze:Lhq9;

    if-nez p1, :cond_1

    new-instance p1, Lhm9;

    sget-object p3, Lku9;->zzb:Lku9;

    invoke-direct {p1, p3}, Lhm9;-><init>(LEm9;)V

    sput-object p1, Lku9;->zze:Lhq9;

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
    sget-object p1, Lku9;->zzb:Lku9;

    return-object p1

    :cond_4
    new-instance p1, LEt9;

    invoke-direct {p1, p2}, LEt9;-><init>(Lit9;)V

    return-object p1

    :cond_5
    new-instance p1, Lku9;

    invoke-direct {p1}, Lku9;-><init>()V

    return-object p1

    :cond_6
    const/16 p1, 0xc

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "zzf"

    aput-object v5, p1, v4

    const-string v4, "zzg"

    aput-object v4, p1, p2

    const-string p2, "zzh"

    aput-object p2, p1, v3

    const-string p2, "zzi"

    aput-object p2, p1, v2

    const-string p2, "zzj"

    aput-object p2, p1, v1

    sget-object p2, LCt9;->a:Lvp9;

    aput-object p2, p1, v0

    const-string p2, "zzk"

    aput-object p2, p1, p3

    const/4 p2, 0x7

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    sget-object p3, Liu9;->a:Lvp9;

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzo"

    aput-object p3, p1, p2

    sget-object p2, Lku9;->zzb:Lku9;

    const-string p3, "\u0000\n\u0000\u0000\u0001\n\n\u0002\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0208\u00052\u0006\u0208\u0007\u0007\u00082\t\u0208\n\t"

    invoke-static {p2, p3, p1}, LEm9;->l(LNp9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
