.class public LxK2;
.super Ljava/util/AbstractMap;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ConcurrentMap;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LxK2$o;,
        LxK2$b;,
        LxK2$m;,
        LxK2$g;,
        LxK2$v;,
        LxK2$l;,
        LxK2$f;,
        LxK2$D;,
        LxK2$u;,
        LxK2$k;,
        LxK2$h;,
        LxK2$z;,
        LxK2$x;,
        LxK2$t;,
        LxK2$r;,
        LxK2$n;,
        LxK2$C;,
        LxK2$e;,
        LxK2$B;,
        LxK2$y;,
        LxK2$w;,
        LxK2$d;,
        LxK2$s;,
        LxK2$q;,
        LxK2$A;,
        LxK2$c;,
        LxK2$i;,
        LxK2$j;,
        LxK2$p;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        "E::",
        "LxK2$i<",
        "TK;TV;TE;>;S:",
        "LxK2$n<",
        "TK;TV;TE;TS;>;>",
        "Ljava/util/AbstractMap<",
        "TK;TV;>;",
        "Ljava/util/concurrent/ConcurrentMap<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final k:LxK2$B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LxK2$B<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "LxK2$e;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x5L


# instance fields
.field public final transient b:I

.field public final transient c:I

.field public final transient d:[LxK2$n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LxK2$n<",
            "TK;TV;TE;TS;>;"
        }
    .end annotation
.end field

.field public final e:I

.field public final f:LRf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRf1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final transient g:LxK2$j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LxK2$j<",
            "TK;TV;TE;TS;>;"
        }
    .end annotation
.end field

.field public transient h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation
.end field

.field public transient i:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end field

.field public transient j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LxK2$a;

    invoke-direct {v0}, LxK2$a;-><init>()V

    sput-object v0, LxK2;->k:LxK2$B;

    return-void
.end method

.method public constructor <init>(LwK2;LxK2$j;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwK2;",
            "LxK2$j<",
            "TK;TV;TE;TS;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    invoke-virtual {p1}, LwK2;->b()I

    move-result v0

    const/high16 v1, 0x10000

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, LxK2;->e:I

    invoke-virtual {p1}, LwK2;->d()LRf1;

    move-result-object v0

    iput-object v0, p0, LxK2;->f:LRf1;

    iput-object p2, p0, LxK2;->g:LxK2$j;

    invoke-virtual {p1}, LwK2;->c()I

    move-result p1

    const/high16 p2, 0x40000000    # 2.0f

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 p2, 0x0

    const/4 v0, 0x1

    move v2, p2

    move v1, v0

    :goto_0
    iget v3, p0, LxK2;->e:I

    if-ge v1, v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    rsub-int/lit8 v2, v2, 0x20

    iput v2, p0, LxK2;->c:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, LxK2;->b:I

    invoke-virtual {p0, v1}, LxK2;->f(I)[LxK2$n;

    move-result-object v2

    iput-object v2, p0, LxK2;->d:[LxK2$n;

    div-int v2, p1, v1

    mul-int/2addr v1, v2

    if-ge v1, p1, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    :goto_1
    if-ge v0, v2, :cond_2

    shl-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    iget-object p1, p0, LxK2;->d:[LxK2$n;

    array-length v1, p1

    if-ge p2, v1, :cond_3

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, LxK2;->c(II)LxK2$n;

    move-result-object v1

    aput-object v1, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public static synthetic a(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0}, LxK2;->k(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static b(LwK2;)LxK2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "LwK2;",
            ")",
            "LxK2<",
            "TK;TV;+",
            "LxK2$i<",
            "TK;TV;*>;*>;"
        }
    .end annotation

    invoke-virtual {p0}, LwK2;->e()LxK2$p;

    move-result-object v0

    sget-object v1, LxK2$p;->b:LxK2$p;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LwK2;->f()LxK2$p;

    move-result-object v0

    if-ne v0, v1, :cond_0

    new-instance v0, LxK2;

    invoke-static {}, LxK2$q$a;->h()LxK2$q$a;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LxK2;-><init>(LwK2;LxK2$j;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, LwK2;->e()LxK2$p;

    move-result-object v0

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LwK2;->f()LxK2$p;

    move-result-object v0

    sget-object v2, LxK2$p;->c:LxK2$p;

    if-ne v0, v2, :cond_1

    new-instance v0, LxK2;

    invoke-static {}, LxK2$s$a;->h()LxK2$s$a;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LxK2;-><init>(LwK2;LxK2$j;)V

    return-object v0

    :cond_1
    invoke-virtual {p0}, LwK2;->e()LxK2$p;

    move-result-object v0

    sget-object v2, LxK2$p;->c:LxK2$p;

    if-ne v0, v2, :cond_2

    invoke-virtual {p0}, LwK2;->f()LxK2$p;

    move-result-object v0

    if-ne v0, v1, :cond_2

    new-instance v0, LxK2;

    invoke-static {}, LxK2$w$a;->h()LxK2$w$a;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LxK2;-><init>(LwK2;LxK2$j;)V

    return-object v0

    :cond_2
    invoke-virtual {p0}, LwK2;->e()LxK2$p;

    move-result-object v0

    if-ne v0, v2, :cond_3

    invoke-virtual {p0}, LwK2;->f()LxK2$p;

    move-result-object v0

    if-ne v0, v2, :cond_3

    new-instance v0, LxK2;

    invoke-static {}, LxK2$y$a;->h()LxK2$y$a;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LxK2;-><init>(LwK2;LxK2$j;)V

    return-object v0

    :cond_3
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public static i(I)I
    .locals 2

    shl-int/lit8 v0, p0, 0xf

    xor-int/lit16 v0, v0, -0x3283

    add-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0xa

    xor-int/2addr p0, v0

    shl-int/lit8 v0, p0, 0x3

    add-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0x6

    xor-int/2addr p0, v0

    shl-int/lit8 v0, p0, 0x2

    shl-int/lit8 v1, p0, 0xe

    add-int/2addr v0, v1

    add-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0x10

    xor-int/2addr p0, v0

    return p0
.end method

.method public static k(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TE;>;)",
            "Ljava/util/ArrayList<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-static {v0, p0}, Lzg2;->a(Ljava/util/Collection;Ljava/util/Iterator;)Z

    return-object v0
.end method

.method public static l()LxK2$B;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "E::",
            "LxK2$i<",
            "TK;TV;TE;>;>()",
            "LxK2$B<",
            "TK;TV;TE;>;"
        }
    .end annotation

    sget-object v0, LxK2;->k:LxK2$B;

    return-object v0
.end method


# virtual methods
.method public c(II)LxK2$n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "LxK2$n<",
            "TK;TV;TE;TS;>;"
        }
    .end annotation

    iget-object v0, p0, LxK2;->g:LxK2$j;

    invoke-interface {v0, p0, p1, p2}, LxK2$j;->c(LxK2;II)LxK2$n;

    move-result-object p1

    return-object p1
.end method

.method public clear()V
    .locals 4

    iget-object v0, p0, LxK2;->d:[LxK2$n;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, LxK2$n;->a()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LxK2;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, LxK2;->j(I)LxK2$n;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, LxK2$n;->c(Ljava/lang/Object;I)Z

    move-result p1

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 16

    move-object/from16 v0, p1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object/from16 v2, p0

    iget-object v3, v2, LxK2;->d:[LxK2$n;

    const-wide/16 v4, -0x1

    move v6, v1

    :goto_0
    const/4 v7, 0x3

    if-ge v6, v7, :cond_6

    array-length v7, v3

    const-wide/16 v8, 0x0

    move v10, v1

    :goto_1
    if-ge v10, v7, :cond_4

    aget-object v11, v3, v10

    iget v12, v11, LxK2$n;->c:I

    iget-object v12, v11, LxK2$n;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move v13, v1

    :goto_2
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v14

    if-ge v13, v14, :cond_3

    invoke-virtual {v12, v13}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LxK2$i;

    :goto_3
    if-eqz v14, :cond_2

    invoke-virtual {v11, v14}, LxK2$n;->l(LxK2$i;)Ljava/lang/Object;

    move-result-object v15

    if-eqz v15, :cond_1

    invoke-virtual/range {p0 .. p0}, LxK2;->m()LRf1;

    move-result-object v1

    invoke-virtual {v1, v0, v15}, LRf1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    invoke-interface {v14}, LxK2$i;->a()LxK2$i;

    move-result-object v14

    const/4 v1, 0x0

    goto :goto_3

    :cond_2
    add-int/lit8 v13, v13, 0x1

    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    iget v1, v11, LxK2$n;->d:I

    int-to-long v11, v1

    add-long/2addr v8, v11

    add-int/lit8 v10, v10, 0x1

    const/4 v1, 0x0

    goto :goto_1

    :cond_4
    cmp-long v1, v8, v4

    if-nez v1, :cond_5

    const/4 v0, 0x0

    goto :goto_4

    :cond_5
    add-int/lit8 v6, v6, 0x1

    move-wide v4, v8

    const/4 v1, 0x0

    goto :goto_0

    :cond_6
    move v0, v1

    :goto_4
    return v0
.end method

.method public d(LxK2$i;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TV;"
        }
    .end annotation

    invoke-interface {p1}, LxK2$i;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, LxK2$i;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LxK2;->f:LRf1;

    invoke-virtual {v0, p1}, LRf1;->e(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, LxK2;->i(I)I

    move-result p1

    return p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LxK2;->j:Ljava/util/Set;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LxK2$g;

    invoke-direct {v0, p0}, LxK2$g;-><init>(LxK2;)V

    iput-object v0, p0, LxK2;->j:Ljava/util/Set;

    :goto_0
    return-object v0
.end method

.method public final f(I)[LxK2$n;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "LxK2$n<",
            "TK;TV;TE;TS;>;"
        }
    .end annotation

    new-array p1, p1, [LxK2$n;

    return-object p1
.end method

.method public g(LxK2$i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    invoke-interface {p1}, LxK2$i;->c()I

    move-result v0

    invoke-virtual {p0, v0}, LxK2;->j(I)LxK2$n;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, LxK2$n;->u(LxK2$i;I)Z

    return-void
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, LxK2;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, LxK2;->j(I)LxK2$n;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, LxK2$n;->h(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h(LxK2$B;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2$B<",
            "TK;TV;TE;>;)V"
        }
    .end annotation

    invoke-interface {p1}, LxK2$B;->b()LxK2$i;

    move-result-object v0

    invoke-interface {v0}, LxK2$i;->c()I

    move-result v1

    invoke-virtual {p0, v1}, LxK2;->j(I)LxK2$n;

    move-result-object v2

    invoke-interface {v0}, LxK2$i;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0, v1, p1}, LxK2$n;->v(Ljava/lang/Object;ILxK2$B;)Z

    return-void
.end method

.method public isEmpty()Z
    .locals 10

    iget-object v0, p0, LxK2;->d:[LxK2$n;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-wide v5, v1

    move v4, v3

    :goto_0
    array-length v7, v0

    if-ge v4, v7, :cond_1

    aget-object v7, v0, v4

    iget v7, v7, LxK2$n;->c:I

    if-eqz v7, :cond_0

    return v3

    :cond_0
    aget-object v7, v0, v4

    iget v7, v7, LxK2$n;->d:I

    int-to-long v7, v7

    add-long/2addr v5, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    cmp-long v4, v5, v1

    const/4 v7, 0x1

    if-eqz v4, :cond_5

    move v4, v3

    :goto_1
    array-length v8, v0

    if-ge v4, v8, :cond_3

    aget-object v8, v0, v4

    iget v8, v8, LxK2$n;->c:I

    if-eqz v8, :cond_2

    return v3

    :cond_2
    aget-object v8, v0, v4

    iget v8, v8, LxK2$n;->d:I

    int-to-long v8, v8

    sub-long/2addr v5, v8

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    cmp-long v0, v5, v1

    if-nez v0, :cond_4

    move v3, v7

    :cond_4
    return v3

    :cond_5
    return v7
.end method

.method public j(I)LxK2$n;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LxK2$n<",
            "TK;TV;TE;TS;>;"
        }
    .end annotation

    iget-object v0, p0, LxK2;->d:[LxK2$n;

    iget v1, p0, LxK2;->c:I

    ushr-int/2addr p1, v1

    iget v1, p0, LxK2;->b:I

    and-int/2addr p1, v1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, LxK2;->h:Ljava/util/Set;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LxK2$l;

    invoke-direct {v0, p0}, LxK2$l;-><init>(LxK2;)V

    iput-object v0, p0, LxK2;->h:Ljava/util/Set;

    :goto_0
    return-object v0
.end method

.method public m()LRf1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LRf1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LxK2;->g:LxK2$j;

    invoke-interface {v0}, LxK2$j;->d()LxK2$p;

    move-result-object v0

    invoke-virtual {v0}, LxK2$p;->b()LRf1;

    move-result-object v0

    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, LxK2;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, LxK2;->j(I)LxK2$n;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, p2, v2}, LxK2$n;->t(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, LxK2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, LxK2;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, LxK2;->j(I)LxK2$n;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, p2, v2}, LxK2$n;->t(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, LxK2;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, LxK2;->j(I)LxK2$n;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, LxK2$n;->w(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LxK2;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, LxK2;->j(I)LxK2$n;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2}, LxK2$n;->x(Ljava/lang/Object;ILjava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, LxK2;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, LxK2;->j(I)LxK2$n;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2}, LxK2$n;->z(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;TV;)Z"
        }
    .end annotation

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, LxK2;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, LxK2;->j(I)LxK2$n;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2, p3}, LxK2$n;->A(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public size()I
    .locals 6

    iget-object v0, p0, LxK2;->d:[LxK2$n;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_0

    aget-object v4, v0, v3

    iget v4, v4, LxK2$n;->c:I

    int-to-long v4, v4

    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1, v2}, Lg72;->b(J)I

    move-result v0

    return v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, LxK2;->i:Ljava/util/Collection;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LxK2$v;

    invoke-direct {v0, p0}, LxK2$v;-><init>(LxK2;)V

    iput-object v0, p0, LxK2;->i:Ljava/util/Collection;

    :goto_0
    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 8

    new-instance v7, LxK2$o;

    iget-object v0, p0, LxK2;->g:LxK2$j;

    invoke-interface {v0}, LxK2$j;->b()LxK2$p;

    move-result-object v1

    iget-object v0, p0, LxK2;->g:LxK2$j;

    invoke-interface {v0}, LxK2$j;->d()LxK2$p;

    move-result-object v2

    iget-object v3, p0, LxK2;->f:LRf1;

    iget-object v0, p0, LxK2;->g:LxK2$j;

    invoke-interface {v0}, LxK2$j;->d()LxK2$p;

    move-result-object v0

    invoke-virtual {v0}, LxK2$p;->b()LRf1;

    move-result-object v4

    iget v5, p0, LxK2;->e:I

    move-object v0, v7

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, LxK2$o;-><init>(LxK2$p;LxK2$p;LRf1;LRf1;ILjava/util/concurrent/ConcurrentMap;)V

    return-object v7
.end method
