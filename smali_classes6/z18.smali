.class public final Lz18;
.super LEm9;
.source "SourceFile"

# interfaces
.implements LPp9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEm9<",
        "Lz18;",
        "LH08;",
        ">;",
        "LPp9;"
    }
.end annotation


# static fields
.field private static final zzb:Lz18;

.field private static volatile zze:Lhq9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhq9<",
            "Lz18;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzf:Lyp9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyp9<",
            "Ljava/lang/String;",
            "Lq28;",
            ">;"
        }
    .end annotation
.end field

.field private zzg:Lyp9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyp9<",
            "Ljava/lang/String;",
            "LR28;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz18;

    invoke-direct {v0}, Lz18;-><init>()V

    sput-object v0, Lz18;->zzb:Lz18;

    const-class v1, Lz18;

    invoke-static {v1, v0}, LEm9;->m(Ljava/lang/Class;LEm9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LEm9;-><init>()V

    invoke-static {}, Lyp9;->d()Lyp9;

    move-result-object v0

    iput-object v0, p0, Lz18;->zzf:Lyp9;

    invoke-static {}, Lyp9;->d()Lyp9;

    move-result-object v0

    iput-object v0, p0, Lz18;->zzg:Lyp9;

    return-void
.end method

.method public static synthetic A(Lz18;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lz18;->zzg:Lyp9;

    invoke-virtual {v0}, Lyp9;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz18;->zzg:Lyp9;

    invoke-virtual {v0}, Lyp9;->e()Lyp9;

    move-result-object v0

    iput-object v0, p0, Lz18;->zzg:Lyp9;

    :cond_0
    iget-object p0, p0, Lz18;->zzg:Lyp9;

    return-object p0
.end method

.method public static synthetic w()Lz18;
    .locals 1

    sget-object v0, Lz18;->zzb:Lz18;

    return-object v0
.end method

.method public static x()Lz18;
    .locals 1

    sget-object v0, Lz18;->zzb:Lz18;

    return-object v0
.end method

.method public static synthetic y(Lz18;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lz18;->zzf:Lyp9;

    invoke-virtual {v0}, Lyp9;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz18;->zzf:Lyp9;

    invoke-virtual {v0}, Lyp9;->e()Lyp9;

    move-result-object v0

    iput-object v0, p0, Lz18;->zzf:Lyp9;

    :cond_0
    iget-object p0, p0, Lz18;->zzf:Lyp9;

    return-object p0
.end method


# virtual methods
.method public final B()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LR28;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz18;->zzg:Lyp9;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final C()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lq28;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz18;->zzf:Lyp9;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final D(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lz18;->zzf:Lyp9;

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

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
    sget-object p1, Lz18;->zze:Lhq9;

    if-nez p1, :cond_2

    const-class p2, Lz18;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lz18;->zze:Lhq9;

    if-nez p1, :cond_1

    new-instance p1, Lhm9;

    sget-object p3, Lz18;->zzb:Lz18;

    invoke-direct {p1, p3}, Lhm9;-><init>(LEm9;)V

    sput-object p1, Lz18;->zze:Lhq9;

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
    sget-object p1, Lz18;->zzb:Lz18;

    return-object p1

    :cond_4
    new-instance p1, LH08;

    invoke-direct {p1, p2}, LH08;-><init>(Lu08;)V

    return-object p1

    :cond_5
    new-instance p1, Lz18;

    invoke-direct {p1}, Lz18;-><init>()V

    return-object p1

    :cond_6
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zzf"

    aput-object v2, p1, p3

    sget-object p3, Ll18;->a:Lvp9;

    aput-object p3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    sget-object p2, LW08;->a:Lvp9;

    aput-object p2, p1, v0

    sget-object p2, Lz18;->zzb:Lz18;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022"

    invoke-static {p2, p3, p1}, LEm9;->l(LNp9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
