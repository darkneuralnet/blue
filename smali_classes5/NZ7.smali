.class public final LNZ7;
.super Ljava/util/AbstractMap;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final i:Ljava/util/Comparator;


# instance fields
.field public final b:Ljava/util/Comparator;

.field public c:LzZ7;

.field public d:I

.field public e:I

.field public final f:LzZ7;

.field public g:LtX7;

.field public h:LWY7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LPW7;

    invoke-direct {v0}, LPW7;-><init>()V

    sput-object v0, LNZ7;->i:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget-object v0, LNZ7;->i:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v1, 0x0

    iput v1, p0, LNZ7;->d:I

    iput v1, p0, LNZ7;->e:I

    new-instance v1, LzZ7;

    invoke-direct {v1}, LzZ7;-><init>()V

    iput-object v1, p0, LNZ7;->f:LzZ7;

    iput-object v0, p0, LNZ7;->b:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Z)LzZ7;
    .locals 6

    iget-object v0, p0, LNZ7;->b:Ljava/util/Comparator;

    iget-object v1, p0, LNZ7;->c:LzZ7;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    sget-object v3, LNZ7;->i:Ljava/util/Comparator;

    if-ne v0, v3, :cond_0

    move-object v3, p1

    check-cast v3, Ljava/lang/Comparable;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_1

    iget-object v4, v1, LzZ7;->g:Ljava/lang/Object;

    invoke-interface {v3, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v4

    goto :goto_1

    :cond_1
    iget-object v4, v1, LzZ7;->g:Ljava/lang/Object;

    invoke-interface {v0, p1, v4}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    :goto_1
    if-nez v4, :cond_2

    return-object v1

    :cond_2
    if-gez v4, :cond_3

    iget-object v5, v1, LzZ7;->c:LzZ7;

    goto :goto_2

    :cond_3
    iget-object v5, v1, LzZ7;->d:LzZ7;

    :goto_2
    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    move-object v1, v5

    goto :goto_0

    :cond_5
    const/4 v4, 0x0

    :goto_3
    if-nez p2, :cond_6

    return-object v2

    :cond_6
    iget-object p2, p0, LNZ7;->f:LzZ7;

    const/4 v3, 0x1

    if-nez v1, :cond_9

    sget-object v1, LNZ7;->i:Ljava/util/Comparator;

    if-ne v0, v1, :cond_8

    instance-of v0, p1, Ljava/lang/Comparable;

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    new-instance p2, Ljava/lang/ClassCastException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, " is not Comparable"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    :goto_4
    new-instance v0, LzZ7;

    iget-object v1, p2, LzZ7;->f:LzZ7;

    invoke-direct {v0, v2, p1, p2, v1}, LzZ7;-><init>(LzZ7;Ljava/lang/Object;LzZ7;LzZ7;)V

    iput-object v0, p0, LNZ7;->c:LzZ7;

    goto :goto_6

    :cond_9
    new-instance v0, LzZ7;

    iget-object v2, p2, LzZ7;->f:LzZ7;

    invoke-direct {v0, v1, p1, p2, v2}, LzZ7;-><init>(LzZ7;Ljava/lang/Object;LzZ7;LzZ7;)V

    if-gez v4, :cond_a

    iput-object v0, v1, LzZ7;->c:LzZ7;

    goto :goto_5

    :cond_a
    iput-object v0, v1, LzZ7;->d:LzZ7;

    :goto_5
    invoke-virtual {p0, v1, v3}, LNZ7;->f(LzZ7;Z)V

    :goto_6
    iget p1, p0, LNZ7;->d:I

    add-int/2addr p1, v3

    iput p1, p0, LNZ7;->d:I

    iget p1, p0, LNZ7;->e:I

    add-int/2addr p1, v3

    iput p1, p0, LNZ7;->e:I

    return-object v0
.end method

.method public final b(Ljava/util/Map$Entry;)LzZ7;
    .locals 2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LNZ7;->c(Ljava/lang/Object;)LzZ7;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, v0, LzZ7;->h:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eq v1, p1, :cond_0

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Ljava/lang/Object;)LzZ7;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v1}, LNZ7;->a(Ljava/lang/Object;Z)LzZ7;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    nop

    :catch_0
    :cond_0
    return-object v0
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LNZ7;->c:LzZ7;

    const/4 v0, 0x0

    iput v0, p0, LNZ7;->d:I

    iget v0, p0, LNZ7;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LNZ7;->e:I

    iget-object v0, p0, LNZ7;->f:LzZ7;

    iput-object v0, v0, LzZ7;->f:LzZ7;

    iput-object v0, v0, LzZ7;->e:LzZ7;

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, LNZ7;->c(Ljava/lang/Object;)LzZ7;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d(Ljava/lang/Object;)LzZ7;
    .locals 1

    invoke-virtual {p0, p1}, LNZ7;->c(Ljava/lang/Object;)LzZ7;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LNZ7;->e(LzZ7;Z)V

    :cond_0
    return-object p1
.end method

.method public final e(LzZ7;Z)V
    .locals 6

    if-eqz p2, :cond_0

    iget-object p2, p1, LzZ7;->f:LzZ7;

    iget-object v0, p1, LzZ7;->e:LzZ7;

    iput-object v0, p2, LzZ7;->e:LzZ7;

    iget-object v0, p1, LzZ7;->e:LzZ7;

    iput-object p2, v0, LzZ7;->f:LzZ7;

    :cond_0
    iget-object p2, p1, LzZ7;->c:LzZ7;

    iget-object v0, p1, LzZ7;->d:LzZ7;

    iget-object v1, p1, LzZ7;->b:LzZ7;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p2, :cond_6

    if-eqz v0, :cond_6

    iget v1, p2, LzZ7;->i:I

    iget v4, v0, LzZ7;->i:I

    if-le v1, v4, :cond_1

    :goto_0
    iget-object v0, p2, LzZ7;->d:LzZ7;

    move-object v5, v0

    move-object v0, p2

    move-object p2, v5

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_1
    :goto_1
    iget-object p2, v0, LzZ7;->c:LzZ7;

    move-object v5, v0

    move-object v0, p2

    move-object p2, v5

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, p2

    :cond_3
    invoke-virtual {p0, v0, v2}, LNZ7;->e(LzZ7;Z)V

    iget-object p2, p1, LzZ7;->c:LzZ7;

    if-eqz p2, :cond_4

    iget v1, p2, LzZ7;->i:I

    iput-object p2, v0, LzZ7;->c:LzZ7;

    iput-object v0, p2, LzZ7;->b:LzZ7;

    iput-object v3, p1, LzZ7;->c:LzZ7;

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_2
    iget-object p2, p1, LzZ7;->d:LzZ7;

    if-eqz p2, :cond_5

    iget v2, p2, LzZ7;->i:I

    iput-object p2, v0, LzZ7;->d:LzZ7;

    iput-object v0, p2, LzZ7;->b:LzZ7;

    iput-object v3, p1, LzZ7;->d:LzZ7;

    :cond_5
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    iput p2, v0, LzZ7;->i:I

    invoke-virtual {p0, p1, v0}, LNZ7;->g(LzZ7;LzZ7;)V

    return-void

    :cond_6
    if-eqz p2, :cond_7

    invoke-virtual {p0, p1, p2}, LNZ7;->g(LzZ7;LzZ7;)V

    iput-object v3, p1, LzZ7;->c:LzZ7;

    goto :goto_3

    :cond_7
    if-eqz v0, :cond_8

    invoke-virtual {p0, p1, v0}, LNZ7;->g(LzZ7;LzZ7;)V

    iput-object v3, p1, LzZ7;->d:LzZ7;

    goto :goto_3

    :cond_8
    invoke-virtual {p0, p1, v3}, LNZ7;->g(LzZ7;LzZ7;)V

    :goto_3
    invoke-virtual {p0, v1, v2}, LNZ7;->f(LzZ7;Z)V

    iget p1, p0, LNZ7;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LNZ7;->d:I

    iget p1, p0, LNZ7;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LNZ7;->e:I

    return-void
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LNZ7;->g:LtX7;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LtX7;

    invoke-direct {v0, p0}, LtX7;-><init>(LNZ7;)V

    iput-object v0, p0, LNZ7;->g:LtX7;

    return-object v0
.end method

.method public final f(LzZ7;Z)V
    .locals 7

    :goto_0
    if-eqz p1, :cond_e

    iget-object v0, p1, LzZ7;->c:LzZ7;

    iget-object v1, p1, LzZ7;->d:LzZ7;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget v3, v0, LzZ7;->i:I

    goto :goto_1

    :cond_0
    move v3, v2

    :goto_1
    if-eqz v1, :cond_1

    iget v4, v1, LzZ7;->i:I

    goto :goto_2

    :cond_1
    move v4, v2

    :goto_2
    sub-int v5, v3, v4

    const/4 v6, -0x2

    if-ne v5, v6, :cond_6

    iget-object v0, v1, LzZ7;->c:LzZ7;

    iget-object v3, v1, LzZ7;->d:LzZ7;

    if-eqz v3, :cond_2

    iget v3, v3, LzZ7;->i:I

    goto :goto_3

    :cond_2
    move v3, v2

    :goto_3
    if-eqz v0, :cond_3

    iget v2, v0, LzZ7;->i:I

    :cond_3
    sub-int/2addr v2, v3

    const/4 v0, -0x1

    if-eq v2, v0, :cond_5

    if-nez v2, :cond_4

    if-nez p2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p0, v1}, LNZ7;->i(LzZ7;)V

    invoke-virtual {p0, p1}, LNZ7;->h(LzZ7;)V

    goto :goto_5

    :cond_5
    :goto_4
    invoke-virtual {p0, p1}, LNZ7;->h(LzZ7;)V

    :goto_5
    if-nez p2, :cond_e

    goto :goto_9

    :cond_6
    const/4 v1, 0x2

    const/4 v6, 0x1

    if-ne v5, v1, :cond_b

    iget-object v1, v0, LzZ7;->c:LzZ7;

    iget-object v3, v0, LzZ7;->d:LzZ7;

    if-eqz v3, :cond_7

    iget v3, v3, LzZ7;->i:I

    goto :goto_6

    :cond_7
    move v3, v2

    :goto_6
    if-eqz v1, :cond_8

    iget v2, v1, LzZ7;->i:I

    :cond_8
    sub-int/2addr v2, v3

    if-eq v2, v6, :cond_a

    if-nez v2, :cond_9

    if-nez p2, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {p0, v0}, LNZ7;->h(LzZ7;)V

    invoke-virtual {p0, p1}, LNZ7;->i(LzZ7;)V

    goto :goto_8

    :cond_a
    :goto_7
    invoke-virtual {p0, p1}, LNZ7;->i(LzZ7;)V

    :goto_8
    if-eqz p2, :cond_d

    goto :goto_a

    :cond_b
    if-nez v5, :cond_c

    add-int/lit8 v3, v3, 0x1

    iput v3, p1, LzZ7;->i:I

    if-eqz p2, :cond_d

    goto :goto_a

    :cond_c
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v6

    iput v0, p1, LzZ7;->i:I

    if-nez p2, :cond_d

    goto :goto_a

    :cond_d
    :goto_9
    iget-object p1, p1, LzZ7;->b:LzZ7;

    goto :goto_0

    :cond_e
    :goto_a
    return-void
.end method

.method public final g(LzZ7;LzZ7;)V
    .locals 2

    iget-object v0, p1, LzZ7;->b:LzZ7;

    const/4 v1, 0x0

    iput-object v1, p1, LzZ7;->b:LzZ7;

    if-eqz p2, :cond_0

    iput-object v0, p2, LzZ7;->b:LzZ7;

    :cond_0
    if-eqz v0, :cond_2

    iget-object v1, v0, LzZ7;->c:LzZ7;

    if-ne v1, p1, :cond_1

    iput-object p2, v0, LzZ7;->c:LzZ7;

    return-void

    :cond_1
    iput-object p2, v0, LzZ7;->d:LzZ7;

    return-void

    :cond_2
    iput-object p2, p0, LNZ7;->c:LzZ7;

    return-void
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LNZ7;->c(Ljava/lang/Object;)LzZ7;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, LzZ7;->h:Ljava/lang/Object;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final h(LzZ7;)V
    .locals 5

    iget-object v0, p1, LzZ7;->c:LzZ7;

    iget-object v1, p1, LzZ7;->d:LzZ7;

    iget-object v2, v1, LzZ7;->c:LzZ7;

    iget-object v3, v1, LzZ7;->d:LzZ7;

    iput-object v2, p1, LzZ7;->d:LzZ7;

    if-eqz v2, :cond_0

    iput-object p1, v2, LzZ7;->b:LzZ7;

    :cond_0
    invoke-virtual {p0, p1, v1}, LNZ7;->g(LzZ7;LzZ7;)V

    iput-object p1, v1, LzZ7;->c:LzZ7;

    iput-object v1, p1, LzZ7;->b:LzZ7;

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    iget v0, v0, LzZ7;->i:I

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_0
    if-eqz v2, :cond_2

    iget v2, v2, LzZ7;->i:I

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_1
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, LzZ7;->i:I

    if-eqz v3, :cond_3

    iget v4, v3, LzZ7;->i:I

    :cond_3
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v1, LzZ7;->i:I

    return-void
.end method

.method public final i(LzZ7;)V
    .locals 5

    iget-object v0, p1, LzZ7;->c:LzZ7;

    iget-object v1, p1, LzZ7;->d:LzZ7;

    iget-object v2, v0, LzZ7;->c:LzZ7;

    iget-object v3, v0, LzZ7;->d:LzZ7;

    iput-object v3, p1, LzZ7;->c:LzZ7;

    if-eqz v3, :cond_0

    iput-object p1, v3, LzZ7;->b:LzZ7;

    :cond_0
    invoke-virtual {p0, p1, v0}, LNZ7;->g(LzZ7;LzZ7;)V

    iput-object p1, v0, LzZ7;->d:LzZ7;

    iput-object v0, p1, LzZ7;->b:LzZ7;

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget v1, v1, LzZ7;->i:I

    goto :goto_0

    :cond_1
    move v1, v4

    :goto_0
    if-eqz v3, :cond_2

    iget v3, v3, LzZ7;->i:I

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, LzZ7;->i:I

    if-eqz v2, :cond_3

    iget v4, v2, LzZ7;->i:I

    :cond_3
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, LzZ7;->i:I

    return-void
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LNZ7;->h:LWY7;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LWY7;

    invoke-direct {v0, p0}, LWY7;-><init>(LNZ7;)V

    iput-object v0, p0, LNZ7;->h:LWY7;

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LNZ7;->a(Ljava/lang/Object;Z)LzZ7;

    move-result-object p1

    iget-object v0, p1, LzZ7;->h:Ljava/lang/Object;

    iput-object p2, p1, LzZ7;->h:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "key == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LNZ7;->d(Ljava/lang/Object;)LzZ7;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, LzZ7;->h:Ljava/lang/Object;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LNZ7;->d:I

    return v0
.end method
