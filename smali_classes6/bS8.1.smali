.class public final LbS8;
.super LRQ8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LRQ8<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final transient d:LvQ8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvQ8<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final transient e:[Ljava/lang/Object;

.field public final transient f:I


# direct methods
.method public constructor <init>(LvQ8;[Ljava/lang/Object;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LvQ8<",
            "TK;TV;>;[",
            "Ljava/lang/Object;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0}, LRQ8;-><init>()V

    iput-object p1, p0, LbS8;->d:LvQ8;

    iput-object p2, p0, LbS8;->e:[Ljava/lang/Object;

    iput p4, p0, LbS8;->f:I

    return-void
.end method

.method public static synthetic A(LbS8;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LbS8;->e:[Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic z(LbS8;)I
    .locals 0

    iget p0, p0, LbS8;->f:I

    return p0
.end method


# virtual methods
.method public final a([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, LXO8;->e()LZP8;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LXO8;->a([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, LbS8;->d:LvQ8;

    invoke-virtual {v2, v0}, LvQ8;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final f()LbU8;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LbU8<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, LXO8;->e()LZP8;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LZP8;->C(I)LnU8;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, LXO8;->e()LZP8;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LZP8;->C(I)LnU8;

    move-result-object v0

    return-object v0
.end method

.method public final s()LZP8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZP8<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, LQR8;

    invoke-direct {v0, p0}, LQR8;-><init>(LbS8;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LbS8;->f:I

    return v0
.end method
