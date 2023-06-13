.class public abstract LbZ1;
.super LQY1;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LbZ1$a;,
        LbZ1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LQY1<",
        "TE;>;",
        "Ljava/util/Set<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public transient c:LVY1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVY1<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LQY1;-><init>()V

    return-void
.end method

.method public static A()LbZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "LbZ1<",
            "TE;>;"
        }
    .end annotation

    sget-object v0, LRt4;->j:LRt4;

    return-object v0
.end method

.method public static C(Ljava/lang/Object;)LbZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "LbZ1<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, LuB5;

    invoke-direct {v0, p0}, LuB5;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static D(Ljava/lang/Object;Ljava/lang/Object;)LbZ1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;)",
            "LbZ1<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    invoke-static {v0, v1}, LbZ1;->v(I[Ljava/lang/Object;)LbZ1;

    move-result-object p0

    return-object p0
.end method

.method public static E(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LbZ1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;)",
            "LbZ1<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p0, 0x2

    aput-object p2, v1, p0

    invoke-static {v0, v1}, LbZ1;->v(I[Ljava/lang/Object;)LbZ1;

    move-result-object p0

    return-object p0
.end method

.method public static F(II)Z
    .locals 1

    shr-int/lit8 v0, p1, 0x1

    shr-int/lit8 p1, p1, 0x2

    add-int/2addr v0, p1

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic o(II)Z
    .locals 0

    invoke-static {p0, p1}, LbZ1;->F(II)Z

    move-result p0

    return p0
.end method

.method public static synthetic s(I[Ljava/lang/Object;)LbZ1;
    .locals 0

    invoke-static {p0, p1}, LbZ1;->v(I[Ljava/lang/Object;)LbZ1;

    move-result-object p0

    return-object p0
.end method

.method public static u(I)I
    .locals 5

    const/4 v0, 0x2

    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const v0, 0x2ccccccc

    const/4 v1, 0x1

    if-ge p0, v0, :cond_1

    add-int/lit8 v0, p0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    shl-int/2addr v0, v1

    :goto_0
    int-to-double v1, v0

    const-wide v3, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v1, v3

    int-to-double v3, p0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_0

    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    if-ge p0, v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    const-string p0, "collection too large"

    invoke-static {v1, p0}, LEZ3;->e(ZLjava/lang/Object;)V

    return v0
.end method

.method public static varargs v(I[Ljava/lang/Object;)LbZ1;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I[",
            "Ljava/lang/Object;",
            ")",
            "LbZ1<",
            "TE;>;"
        }
    .end annotation

    if-eqz p0, :cond_7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_6

    invoke-static {p0}, LbZ1;->u(I)I

    move-result v2

    new-array v6, v2, [Ljava/lang/Object;

    add-int/lit8 v7, v2, -0x1

    move v3, v0

    move v5, v3

    move v8, v5

    :goto_0
    if-ge v3, p0, :cond_2

    aget-object v4, p1, v3

    invoke-static {v4, v3}, LHd3;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v9

    invoke-static {v9}, LwH1;->b(I)I

    move-result v10

    :goto_1
    and-int v11, v10, v7

    aget-object v12, v6, v11

    if-nez v12, :cond_0

    add-int/lit8 v10, v8, 0x1

    aput-object v4, p1, v8

    aput-object v4, v6, v11

    add-int/2addr v5, v9

    move v8, v10

    goto :goto_2

    :cond_0
    invoke-virtual {v12, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    invoke-static {p1, v8, p0, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    if-ne v8, v1, :cond_3

    aget-object p0, p1, v0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, LuB5;

    invoke-direct {p1, p0}, LuB5;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_3
    invoke-static {v8}, LbZ1;->u(I)I

    move-result p0

    div-int/lit8 v2, v2, 0x2

    if-ge p0, v2, :cond_4

    invoke-static {v8, p1}, LbZ1;->v(I[Ljava/lang/Object;)LbZ1;

    move-result-object p0

    return-object p0

    :cond_4
    array-length p0, p1

    invoke-static {v8, p0}, LbZ1;->F(II)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {p1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    :cond_5
    move-object v4, p1

    new-instance p0, LRt4;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, LRt4;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    return-object p0

    :cond_6
    aget-object p0, p1, v0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, LbZ1;->C(Ljava/lang/Object;)LbZ1;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-static {}, LbZ1;->A()LbZ1;

    move-result-object p0

    return-object p0
.end method

.method public static w(Ljava/util/Collection;)LbZ1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+TE;>;)",
            "LbZ1<",
            "TE;>;"
        }
    .end annotation

    instance-of v0, p0, LbZ1;

    if-eqz v0, :cond_0

    instance-of v0, p0, Ljava/util/SortedSet;

    if-nez v0, :cond_0

    move-object v0, p0

    check-cast v0, LbZ1;

    invoke-virtual {v0}, LQY1;->h()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    array-length v0, p0

    invoke-static {v0, p0}, LbZ1;->v(I[Ljava/lang/Object;)LbZ1;

    move-result-object p0

    return-object p0
.end method

.method public static x([Ljava/lang/Object;)LbZ1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([TE;)",
            "LbZ1<",
            "TE;>;"
        }
    .end annotation

    array-length v0, p0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    array-length v0, p0

    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    invoke-static {v0, p0}, LbZ1;->v(I[Ljava/lang/Object;)LbZ1;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-static {p0}, LbZ1;->C(Ljava/lang/Object;)LbZ1;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {}, LbZ1;->A()LbZ1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()LVY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVY1<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LbZ1;->c:LVY1;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LbZ1;->y()LVY1;

    move-result-object v0

    iput-object v0, p0, LbZ1;->c:LVY1;

    :cond_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LbZ1;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LbZ1;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, LbZ1;

    invoke-virtual {v0}, LbZ1;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LbZ1;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    if-eq v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-static {p0, p1}, Ldw5;->a(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Ldw5;->d(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LbZ1;->j()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public abstract j()Lre6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lre6<",
            "TE;>;"
        }
    .end annotation
.end method

.method writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, LbZ1$b;

    invoke-virtual {p0}, LQY1;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, LbZ1$b;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public y()LVY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVY1<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, LQY1;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LVY1;->o([Ljava/lang/Object;)LVY1;

    move-result-object v0

    return-object v0
.end method

.method public z()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
