.class public final Lq28;
.super LEm9;
.source "SourceFile"

# interfaces
.implements LPp9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEm9<",
        "Lq28;",
        "Lb28;",
        ">;",
        "LPp9;"
    }
.end annotation


# static fields
.field private static final zzb:Lon9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lon9<",
            "Ljava/lang/Integer;",
            "LAu9;",
            ">;"
        }
    .end annotation
.end field

.field private static final zze:Lq28;

.field private static volatile zzf:Lhq9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhq9<",
            "Lq28;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzg:Ljava/lang/String;

.field private zzh:LKr9;

.field private zzi:LAn9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAn9<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzj:Lin9;

.field private zzk:Lsu9;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LN18;

    invoke-direct {v0}, LN18;-><init>()V

    sput-object v0, Lq28;->zzb:Lon9;

    new-instance v0, Lq28;

    invoke-direct {v0}, Lq28;-><init>()V

    sput-object v0, Lq28;->zze:Lq28;

    const-class v1, Lq28;

    invoke-static {v1, v0}, LEm9;->m(Ljava/lang/Class;LEm9;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, LEm9;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lq28;->zzg:Ljava/lang/String;

    invoke-static {}, LEm9;->v()LAn9;

    move-result-object v0

    iput-object v0, p0, Lq28;->zzi:LAn9;

    invoke-static {}, LEm9;->u()Lin9;

    move-result-object v0

    iput-object v0, p0, Lq28;->zzj:Lin9;

    return-void
.end method

.method public static synthetic F(Lq28;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lq28;->zzi:LAn9;

    invoke-interface {v0}, LAn9;->zzc()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v1, v1

    :goto_0
    invoke-interface {v0, v1}, LAn9;->d(I)LAn9;

    move-result-object v0

    iput-object v0, p0, Lq28;->zzi:LAn9;

    :cond_1
    iget-object p0, p0, Lq28;->zzi:LAn9;

    invoke-static {p1, p0}, LNe9;->c(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic G(Lq28;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lq28;->zzj:Lin9;

    invoke-interface {v0}, LAn9;->zzc()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v1, v1

    :goto_0
    invoke-interface {v0, v1}, Lin9;->p(I)Lin9;

    move-result-object v0

    iput-object v0, p0, Lq28;->zzj:Lin9;

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAu9;

    iget-object v1, p0, Lq28;->zzj:Lin9;

    invoke-virtual {v0}, LAu9;->zza()I

    move-result v0

    invoke-interface {v1, v0}, Lin9;->zzh(I)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static synthetic H(Lq28;Lsu9;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lq28;->zzk:Lsu9;

    return-void
.end method

.method public static synthetic I(Lq28;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lq28;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic J(Lq28;LKr9;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lq28;->zzh:LKr9;

    return-void
.end method

.method public static w()Lb28;
    .locals 1

    sget-object v0, Lq28;->zze:Lq28;

    invoke-virtual {v0}, LEm9;->o()Lbm9;

    move-result-object v0

    check-cast v0, Lb28;

    return-object v0
.end method

.method public static synthetic x()Lq28;
    .locals 1

    sget-object v0, Lq28;->zze:Lq28;

    return-object v0
.end method

.method public static y()Lq28;
    .locals 1

    sget-object v0, Lq28;->zze:Lq28;

    return-object v0
.end method


# virtual methods
.method public final A()LKr9;
    .locals 1

    iget-object v0, p0, Lq28;->zzh:LKr9;

    if-nez v0, :cond_0

    invoke-static {}, LKr9;->B()LKr9;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final B()Lsu9;
    .locals 1

    iget-object v0, p0, Lq28;->zzk:Lsu9;

    if-nez v0, :cond_0

    invoke-static {}, Lsu9;->D()Lsu9;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq28;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final D()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq28;->zzi:LAn9;

    return-object v0
.end method

.method public final E()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LAu9;",
            ">;"
        }
    .end annotation

    new-instance v0, Lun9;

    iget-object v1, p0, Lq28;->zzj:Lin9;

    sget-object v2, Lq28;->zzb:Lon9;

    invoke-direct {v0, v1, v2}, Lun9;-><init>(Ljava/util/List;Lon9;)V

    return-object v0
.end method

.method public final n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_7

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_6

    if-eq p1, v1, :cond_5

    const/4 p2, 0x0

    if-eq p1, v0, :cond_4

    if-eq p1, p3, :cond_3

    const/4 p3, 0x6

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lq28;->zzf:Lhq9;

    if-nez p1, :cond_2

    const-class p2, Lq28;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lq28;->zzf:Lhq9;

    if-nez p1, :cond_1

    new-instance p1, Lhm9;

    sget-object p3, Lq28;->zze:Lq28;

    invoke-direct {p1, p3}, Lhm9;-><init>(LEm9;)V

    sput-object p1, Lq28;->zzf:Lhq9;

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
    sget-object p1, Lq28;->zze:Lq28;

    return-object p1

    :cond_4
    new-instance p1, Lb28;

    invoke-direct {p1, p2}, Lb28;-><init>(Lu08;)V

    return-object p1

    :cond_5
    new-instance p1, Lq28;

    invoke-direct {p1}, Lq28;-><init>()V

    return-object p1

    :cond_6
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zzg"

    aput-object v3, p1, p3

    const-string p3, "zzh"

    aput-object p3, p1, p2

    const-string p2, "zzi"

    aput-object p2, p1, v2

    const-string p2, "zzj"

    aput-object p2, p1, v1

    const-string p2, "zzk"

    aput-object p2, p1, v0

    sget-object p2, Lq28;->zze:Lq28;

    const-string p3, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0208\u0002\t\u0003\u021a\u0004,\u0005\t"

    invoke-static {p2, p3, p1}, LEm9;->l(LNp9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
