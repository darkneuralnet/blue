.class public LdZ1;
.super LYY1;
.source "SourceFile"

# interfaces
.implements LYv5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LdZ1$c;,
        LdZ1$b;,
        LdZ1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LYY1<",
        "TK;TV;>;",
        "LYv5<",
        "TK;TV;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field public final transient i:LbZ1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LbZ1<",
            "TV;>;"
        }
    .end annotation
.end field

.field public transient j:LbZ1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LbZ1<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LXY1;ILjava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXY1<",
            "TK;",
            "LbZ1<",
            "TV;>;>;I",
            "Ljava/util/Comparator<",
            "-TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, LYY1;-><init>(LXY1;I)V

    invoke-static {p3}, LdZ1;->B(Ljava/util/Comparator;)LbZ1;

    move-result-object p1

    iput-object p1, p0, LdZ1;->i:LbZ1;

    return-void
.end method

.method public static A()LdZ1$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "LdZ1$a<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LdZ1$a;

    invoke-direct {v0}, LdZ1$a;-><init>()V

    return-object v0
.end method

.method public static B(Ljava/util/Comparator;)LbZ1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TV;>;)",
            "LbZ1<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {}, LbZ1;->A()LbZ1;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LeZ1;->N(Ljava/util/Comparator;)LSt4;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static D(Ljava/util/Collection;Ljava/util/Comparator;)LdZ1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/Map$Entry<",
            "+TK;+",
            "Ljava/util/Collection<",
            "+TV;>;>;>;",
            "Ljava/util/Comparator<",
            "-TV;>;)",
            "LdZ1<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LdZ1;->F()LdZ1;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LXY1$a;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, LXY1$a;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {p1, v2}, LdZ1;->I(Ljava/util/Comparator;Ljava/util/Collection;)LbZ1;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v3, v2}, LXY1$a;->f(Ljava/lang/Object;Ljava/lang/Object;)LXY1$a;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    new-instance p0, LdZ1;

    invoke-virtual {v0}, LXY1$a;->c()LXY1;

    move-result-object v0

    invoke-direct {p0, v0, v1, p1}, LdZ1;-><init>(LXY1;ILjava/util/Comparator;)V

    return-object p0
.end method

.method public static F()LdZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "LdZ1<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v0, LRa1;->k:LRa1;

    return-object v0
.end method

.method public static I(Ljava/util/Comparator;Ljava/util/Collection;)LbZ1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TV;>;",
            "Ljava/util/Collection<",
            "+TV;>;)",
            "LbZ1<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {p1}, LbZ1;->w(Ljava/util/Collection;)LbZ1;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LeZ1;->J(Ljava/util/Comparator;Ljava/util/Collection;)LeZ1;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static J(Ljava/util/Comparator;)LbZ1$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TV;>;)",
            "LbZ1$a<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    new-instance p0, LbZ1$a;

    invoke-direct {p0}, LbZ1$a;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, LeZ1$a;

    invoke-direct {v0, p0}, LeZ1$a;-><init>(Ljava/util/Comparator;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Comparator;

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v1

    if-ltz v1, :cond_4

    invoke-static {}, LXY1;->a()LXY1$a;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v1, :cond_3

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v7

    if-lez v7, :cond_2

    invoke-static {v0}, LdZ1;->J(Ljava/util/Comparator;)LbZ1$a;

    move-result-object v8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8, v10}, LbZ1$a;->h(Ljava/lang/Object;)LbZ1$a;

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v8}, LbZ1$a;->k()LbZ1;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/AbstractCollection;->size()I

    move-result v9

    if-ne v9, v7, :cond_1

    invoke-virtual {v2, v6, v8}, LXY1$a;->f(Ljava/lang/Object;Ljava/lang/Object;)LXY1$a;

    add-int/2addr v5, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/io/InvalidObjectException;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x28

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Duplicate key-value pairs exist for key "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/io/InvalidObjectException;

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x1f

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Invalid value count "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :try_start_0
    invoke-virtual {v2}, LXY1$a;->c()LXY1;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, LYY1$e;->a:LZs5$b;

    invoke-virtual {v1, p0, p1}, LZs5$b;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, LYY1$e;->b:LZs5$b;

    invoke-virtual {p1, p0, v5}, LZs5$b;->a(Ljava/lang/Object;I)V

    sget-object p1, LdZ1$c;->a:LZs5$b;

    invoke-static {v0}, LdZ1;->B(Ljava/util/Comparator;)LbZ1;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, LZs5$b;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/io/InvalidObjectException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/io/InvalidObjectException;

    throw p1

    :cond_4
    new-instance p1, Ljava/io/InvalidObjectException;

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v2, 0x1d

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid key count "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    invoke-virtual {p0}, LdZ1;->H()Ljava/util/Comparator;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    invoke-static {p0, p1}, LZs5;->d(LgX2;Ljava/io/ObjectOutputStream;)V

    return-void
.end method


# virtual methods
.method public C()LbZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LbZ1<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LdZ1;->j:LbZ1;

    if-nez v0, :cond_0

    new-instance v0, LdZ1$b;

    invoke-direct {v0, p0}, LdZ1$b;-><init>(LdZ1;)V

    iput-object v0, p0, LdZ1;->j:LbZ1;

    :cond_0
    return-object v0
.end method

.method public E(Ljava/lang/Object;)LbZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "LbZ1<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYY1;->g:LXY1;

    invoke-virtual {v0, p1}, LXY1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LbZ1;

    iget-object v0, p0, LdZ1;->i:LbZ1;

    invoke-static {p1, v0}, LKV2;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LbZ1;

    return-object p1
.end method

.method public H()Ljava/util/Comparator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "-TV;>;"
        }
    .end annotation

    iget-object v0, p0, LdZ1;->i:LbZ1;

    instance-of v1, v0, LeZ1;

    if-eqz v1, :cond_0

    check-cast v0, LeZ1;

    invoke-virtual {v0}, LeZ1;->comparator()Ljava/util/Comparator;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LdZ1;->C()LbZ1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, LdZ1;->C()LbZ1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1}, LdZ1;->E(Ljava/lang/Object;)LbZ1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    invoke-virtual {p0, p1}, LdZ1;->E(Ljava/lang/Object;)LbZ1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic t()LQY1;
    .locals 1

    invoke-virtual {p0}, LdZ1;->C()LbZ1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v(Ljava/lang/Object;)LQY1;
    .locals 0

    invoke-virtual {p0, p1}, LdZ1;->E(Ljava/lang/Object;)LbZ1;

    move-result-object p1

    return-object p1
.end method
