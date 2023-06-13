.class public final LRK7;
.super Lxz7;
.source "SourceFile"


# instance fields
.field public final transient d:Lvy7;

.field public final transient e:[Ljava/lang/Object;

.field public final transient f:I


# direct methods
.method public constructor <init>(Lvy7;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lxz7;-><init>()V

    iput-object p1, p0, LRK7;->d:Lvy7;

    iput-object p2, p0, LRK7;->e:[Ljava/lang/Object;

    iput p4, p0, LRK7;->f:I

    return-void
.end method

.method public static synthetic o(LRK7;)I
    .locals 0

    iget p0, p0, LRK7;->f:I

    return p0
.end method

.method public static synthetic s(LRK7;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LRK7;->e:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final a([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lxz7;->h()Lbw7;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lns7;->a([Ljava/lang/Object;I)I

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

    iget-object v2, p0, LRK7;->d:Lvy7;

    invoke-virtual {v2, v0}, Lvy7;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final e()LZM7;
    .locals 2

    invoke-virtual {p0}, Lxz7;->h()Lbw7;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbw7;->u(I)LqN7;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lxz7;->h()Lbw7;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbw7;->u(I)LqN7;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lbw7;
    .locals 1

    new-instance v0, LCK7;

    invoke-direct {v0, p0}, LCK7;-><init>(LRK7;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LRK7;->f:I

    return v0
.end method
