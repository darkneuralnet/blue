.class public final Lwv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public transient b:Llw6;

.field public final c:I

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lyv;",
            ">;"
        }
    .end annotation
.end field

.field public e:I

.field public f:LOH6;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LOH6;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/LinkedList<",
            "LOH6;",
            ">;>;"
        }
    .end annotation
.end field

.field public i:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "LOH6;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "LOH6;",
            ">;"
        }
    .end annotation
.end field

.field public k:I

.field public l:Z

.field public transient m:I


# direct methods
.method public constructor <init>(LRH6;II)V
    .locals 2

    invoke-virtual {p1}, LRH6;->i()Llw6;

    move-result-object v0

    invoke-virtual {p1}, LRH6;->b()I

    move-result v1

    invoke-virtual {p1}, LRH6;->c()I

    move-result p1

    invoke-direct {p0, v0, v1, p1, p3}, Lwv;-><init>(Llw6;III)V

    iput p2, p0, Lwv;->m:I

    iput p3, p0, Lwv;->k:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lwv;->l:Z

    return-void
.end method

.method public constructor <init>(LRH6;[B[BLFd3;)V
    .locals 4

    invoke-virtual {p1}, LRH6;->i()Llw6;

    move-result-object v0

    invoke-virtual {p1}, LRH6;->b()I

    move-result v1

    invoke-virtual {p1}, LRH6;->c()I

    move-result v2

    invoke-virtual {p1}, LRH6;->b()I

    move-result p1

    const/4 v3, 0x1

    shl-int p1, v3, p1

    sub-int/2addr p1, v3

    invoke-direct {p0, v0, v1, v2, p1}, Lwv;-><init>(Llw6;III)V

    invoke-virtual {p0, p2, p3, p4}, Lwv;->e([B[BLFd3;)V

    return-void
.end method

.method public constructor <init>(LRH6;[B[BLFd3;I)V
    .locals 4

    invoke-virtual {p1}, LRH6;->i()Llw6;

    move-result-object v0

    invoke-virtual {p1}, LRH6;->b()I

    move-result v1

    invoke-virtual {p1}, LRH6;->c()I

    move-result v2

    invoke-virtual {p1}, LRH6;->b()I

    move-result p1

    const/4 v3, 0x1

    shl-int p1, v3, p1

    sub-int/2addr p1, v3

    invoke-direct {p0, v0, v1, v2, p1}, Lwv;-><init>(Llw6;III)V

    invoke-virtual {p0, p2, p3, p4}, Lwv;->e([B[BLFd3;)V

    :goto_0
    iget p1, p0, Lwv;->k:I

    if-ge p1, p5, :cond_0

    invoke-virtual {p0, p2, p3, p4}, Lwv;->f([B[BLFd3;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lwv;->l:Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Llw6;III)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwv;->b:Llw6;

    iput p2, p0, Lwv;->c:I

    iput p4, p0, Lwv;->m:I

    iput p3, p0, Lwv;->e:I

    if-gt p3, p2, :cond_1

    const/4 p1, 0x2

    if-lt p3, p1, :cond_1

    sub-int/2addr p2, p3

    rem-int/lit8 p1, p2, 0x2

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lwv;->g:Ljava/util/List;

    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lwv;->h:Ljava/util/Map;

    new-instance p1, Ljava/util/Stack;

    invoke-direct {p1}, Ljava/util/Stack;-><init>()V

    iput-object p1, p0, Lwv;->i:Ljava/util/Stack;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lwv;->d:Ljava/util/List;

    const/4 p1, 0x0

    move p3, p1

    :goto_0
    if-ge p3, p2, :cond_0

    iget-object p4, p0, Lwv;->d:Ljava/util/List;

    new-instance v0, Lyv;

    invoke-direct {v0, p3}, Lyv;-><init>(I)V

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/util/TreeMap;

    invoke-direct {p2}, Ljava/util/TreeMap;-><init>()V

    iput-object p2, p0, Lwv;->j:Ljava/util/Map;

    iput p1, p0, Lwv;->k:I

    iput-boolean p1, p0, Lwv;->l:Z

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "illegal value for BDS parameter k"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lwv;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llw6;

    iget-object v1, p1, Lwv;->b:Llw6;

    invoke-virtual {v1}, Llw6;->d()Lnw6;

    move-result-object v1

    invoke-direct {v0, v1}, Llw6;-><init>(Lnw6;)V

    iput-object v0, p0, Lwv;->b:Llw6;

    iget v0, p1, Lwv;->c:I

    iput v0, p0, Lwv;->c:I

    iget v0, p1, Lwv;->e:I

    iput v0, p0, Lwv;->e:I

    iget-object v0, p1, Lwv;->f:LOH6;

    iput-object v0, p0, Lwv;->f:LOH6;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lwv;->g:Ljava/util/List;

    iget-object v1, p1, Lwv;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lwv;->h:Ljava/util/Map;

    iget-object v0, p1, Lwv;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iget-object v2, p0, Lwv;->h:Ljava/util/Map;

    iget-object v3, p1, Lwv;->h:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/LinkedList;

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lwv;->i:Ljava/util/Stack;

    iget-object v1, p1, Lwv;->i:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lwv;->d:Ljava/util/List;

    iget-object v0, p1, Lwv;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lwv;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyv;

    invoke-virtual {v2}, Lyv;->d()Lyv;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/TreeMap;

    iget-object v1, p1, Lwv;->j:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lwv;->j:Ljava/util/Map;

    iget v0, p1, Lwv;->k:I

    iput v0, p0, Lwv;->k:I

    iget v0, p1, Lwv;->m:I

    iput v0, p0, Lwv;->m:I

    iget-boolean p1, p1, Lwv;->l:Z

    iput-boolean p1, p0, Lwv;->l:Z

    return-void
.end method

.method public constructor <init>(Lwv;LN;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llw6;

    new-instance v1, Lnw6;

    invoke-direct {v1, p2}, Lnw6;-><init>(LN;)V

    invoke-direct {v0, v1}, Llw6;-><init>(Lnw6;)V

    iput-object v0, p0, Lwv;->b:Llw6;

    iget p2, p1, Lwv;->c:I

    iput p2, p0, Lwv;->c:I

    iget p2, p1, Lwv;->e:I

    iput p2, p0, Lwv;->e:I

    iget-object p2, p1, Lwv;->f:LOH6;

    iput-object p2, p0, Lwv;->f:LOH6;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lwv;->g:Ljava/util/List;

    iget-object v0, p1, Lwv;->g:Ljava/util/List;

    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance p2, Ljava/util/TreeMap;

    invoke-direct {p2}, Ljava/util/TreeMap;-><init>()V

    iput-object p2, p0, Lwv;->h:Ljava/util/Map;

    iget-object p2, p1, Lwv;->h:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iget-object v1, p0, Lwv;->h:Ljava/util/Map;

    iget-object v2, p1, Lwv;->h:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/LinkedList;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/util/Stack;

    invoke-direct {p2}, Ljava/util/Stack;-><init>()V

    iput-object p2, p0, Lwv;->i:Ljava/util/Stack;

    iget-object v0, p1, Lwv;->i:Ljava/util/Stack;

    invoke-virtual {p2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lwv;->d:Ljava/util/List;

    iget-object p2, p1, Lwv;->d:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwv;->d:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyv;

    invoke-virtual {v1}, Lyv;->d()Lyv;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance p2, Ljava/util/TreeMap;

    iget-object v0, p1, Lwv;->j:Ljava/util/Map;

    invoke-direct {p2, v0}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lwv;->j:Ljava/util/Map;

    iget p2, p1, Lwv;->k:I

    iput p2, p0, Lwv;->k:I

    iget p2, p1, Lwv;->m:I

    iput p2, p0, Lwv;->m:I

    iget-boolean p1, p1, Lwv;->l:Z

    iput-boolean p1, p0, Lwv;->l:Z

    invoke-virtual {p0}, Lwv;->g()V

    return-void
.end method

.method public constructor <init>(Lwv;[B[BLFd3;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llw6;

    iget-object v1, p1, Lwv;->b:Llw6;

    invoke-virtual {v1}, Llw6;->d()Lnw6;

    move-result-object v1

    invoke-direct {v0, v1}, Llw6;-><init>(Lnw6;)V

    iput-object v0, p0, Lwv;->b:Llw6;

    iget v0, p1, Lwv;->c:I

    iput v0, p0, Lwv;->c:I

    iget v0, p1, Lwv;->e:I

    iput v0, p0, Lwv;->e:I

    iget-object v0, p1, Lwv;->f:LOH6;

    iput-object v0, p0, Lwv;->f:LOH6;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lwv;->g:Ljava/util/List;

    iget-object v1, p1, Lwv;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lwv;->h:Ljava/util/Map;

    iget-object v0, p1, Lwv;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iget-object v2, p0, Lwv;->h:Ljava/util/Map;

    iget-object v3, p1, Lwv;->h:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/LinkedList;

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lwv;->i:Ljava/util/Stack;

    iget-object v1, p1, Lwv;->i:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lwv;->d:Ljava/util/List;

    iget-object v0, p1, Lwv;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lwv;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyv;

    invoke-virtual {v2}, Lyv;->d()Lyv;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/TreeMap;

    iget-object v1, p1, Lwv;->j:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lwv;->j:Ljava/util/Map;

    iget v0, p1, Lwv;->k:I

    iput v0, p0, Lwv;->k:I

    iget p1, p1, Lwv;->m:I

    iput p1, p0, Lwv;->m:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lwv;->l:Z

    invoke-virtual {p0, p2, p3, p4}, Lwv;->f([B[BLFd3;)V

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->available()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lwv;->c:I

    shl-int v0, v1, v0

    sub-int/2addr v0, v1

    :goto_0
    iput v0, p0, Lwv;->m:I

    iget v0, p0, Lwv;->m:I

    iget v2, p0, Lwv;->c:I

    shl-int v2, v1, v2

    sub-int/2addr v2, v1

    if-gt v0, v2, :cond_1

    iget v2, p0, Lwv;->k:I

    add-int/2addr v0, v1

    if-gt v2, v0, :cond_1

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->available()I

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "inconsistent BDS data detected"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

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

    iget v0, p0, Lwv;->m:I

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    return-void
.end method


# virtual methods
.method public final a()Lyv;
    .locals 5

    iget-object v0, p0, Lwv;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyv;

    invoke-virtual {v2}, Lyv;->j()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lyv;->k()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lyv;->e()I

    move-result v3

    invoke-virtual {v1}, Lyv;->e()I

    move-result v4

    if-ge v3, v4, :cond_3

    :goto_1
    move-object v1, v2

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Lyv;->e()I

    move-result v3

    invoke-virtual {v1}, Lyv;->e()I

    move-result v4

    if-ne v3, v4, :cond_0

    invoke-virtual {v2}, Lyv;->f()I

    move-result v3

    invoke-virtual {v1}, Lyv;->f()I

    move-result v4

    if-ge v3, v4, :cond_0

    goto :goto_1

    :cond_4
    return-object v1
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lwv;->k:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lwv;->m:I

    return v0
.end method

.method public d([B[BLFd3;)Lwv;
    .locals 1

    new-instance v0, Lwv;

    invoke-direct {v0, p0, p1, p2, p3}, Lwv;-><init>(Lwv;[B[BLFd3;)V

    return-object v0
.end method

.method public final e([B[BLFd3;)V
    .locals 10

    if-eqz p3, :cond_6

    new-instance v0, LQl2$b;

    invoke-direct {v0}, LQl2$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v1

    invoke-virtual {v0, v1}, LCH6$a;->g(I)LCH6$a;

    move-result-object v0

    check-cast v0, LQl2$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LCH6$a;->h(J)LCH6$a;

    move-result-object v0

    check-cast v0, LQl2$b;

    invoke-virtual {v0}, LQl2$b;->l()LCH6;

    move-result-object v0

    check-cast v0, LQl2;

    new-instance v1, LtH1$b;

    invoke-direct {v1}, LtH1$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v2

    invoke-virtual {v1, v2}, LCH6$a;->g(I)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LCH6$a;->h(J)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    invoke-virtual {v1}, LtH1$b;->k()LCH6;

    move-result-object v1

    check-cast v1, LtH1;

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, Lwv;->c:I

    const/4 v4, 0x1

    shl-int v3, v4, v3

    if-ge v2, v3, :cond_5

    new-instance v3, LFd3$b;

    invoke-direct {v3}, LFd3$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v5

    invoke-virtual {v3, v5}, LCH6$a;->g(I)LCH6$a;

    move-result-object v3

    check-cast v3, LFd3$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, LCH6$a;->h(J)LCH6$a;

    move-result-object v3

    check-cast v3, LFd3$b;

    invoke-virtual {v3, v2}, LFd3$b;->p(I)LFd3$b;

    move-result-object v3

    invoke-virtual {p3}, LFd3;->e()I

    move-result v5

    invoke-virtual {v3, v5}, LFd3$b;->n(I)LFd3$b;

    move-result-object v3

    invoke-virtual {p3}, LFd3;->f()I

    move-result v5

    invoke-virtual {v3, v5}, LFd3$b;->o(I)LFd3$b;

    move-result-object v3

    invoke-virtual {p3}, LCH6;->a()I

    move-result p3

    invoke-virtual {v3, p3}, LCH6$a;->f(I)LCH6$a;

    move-result-object p3

    check-cast p3, LFd3$b;

    invoke-virtual {p3}, LFd3$b;->l()LCH6;

    move-result-object p3

    check-cast p3, LFd3;

    iget-object v3, p0, Lwv;->b:Llw6;

    invoke-virtual {v3, p2, p3}, Llw6;->g([BLFd3;)[B

    move-result-object v5

    invoke-virtual {v3, v5, p1}, Llw6;->h([B[B)V

    iget-object v3, p0, Lwv;->b:Llw6;

    invoke-virtual {v3, p3}, Llw6;->e(LFd3;)Low6;

    move-result-object v3

    new-instance v5, LQl2$b;

    invoke-direct {v5}, LQl2$b;-><init>()V

    invoke-virtual {v0}, LCH6;->b()I

    move-result v6

    invoke-virtual {v5, v6}, LCH6$a;->g(I)LCH6$a;

    move-result-object v5

    check-cast v5, LQl2$b;

    invoke-virtual {v0}, LCH6;->c()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, LCH6$a;->h(J)LCH6$a;

    move-result-object v5

    check-cast v5, LQl2$b;

    invoke-virtual {v5, v2}, LQl2$b;->n(I)LQl2$b;

    move-result-object v5

    invoke-virtual {v0}, LQl2;->f()I

    move-result v6

    invoke-virtual {v5, v6}, LQl2$b;->o(I)LQl2$b;

    move-result-object v5

    invoke-virtual {v0}, LQl2;->g()I

    move-result v6

    invoke-virtual {v5, v6}, LQl2$b;->p(I)LQl2$b;

    move-result-object v5

    invoke-virtual {v0}, LCH6;->a()I

    move-result v0

    invoke-virtual {v5, v0}, LCH6$a;->f(I)LCH6$a;

    move-result-object v0

    check-cast v0, LQl2$b;

    invoke-virtual {v0}, LQl2$b;->l()LCH6;

    move-result-object v0

    check-cast v0, LQl2;

    iget-object v5, p0, Lwv;->b:Llw6;

    invoke-static {v5, v3, v0}, LPH6;->a(Llw6;Low6;LQl2;)LOH6;

    move-result-object v3

    new-instance v5, LtH1$b;

    invoke-direct {v5}, LtH1$b;-><init>()V

    invoke-virtual {v1}, LCH6;->b()I

    move-result v6

    invoke-virtual {v5, v6}, LCH6$a;->g(I)LCH6$a;

    move-result-object v5

    check-cast v5, LtH1$b;

    invoke-virtual {v1}, LCH6;->c()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, LCH6$a;->h(J)LCH6$a;

    move-result-object v5

    check-cast v5, LtH1$b;

    invoke-virtual {v5, v2}, LtH1$b;->n(I)LtH1$b;

    move-result-object v5

    invoke-virtual {v1}, LCH6;->a()I

    move-result v1

    invoke-virtual {v5, v1}, LCH6$a;->f(I)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    invoke-virtual {v1}, LtH1$b;->k()LCH6;

    move-result-object v1

    check-cast v1, LtH1;

    :goto_1
    iget-object v5, p0, Lwv;->i:Ljava/util/Stack;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    iget-object v5, p0, Lwv;->i:Ljava/util/Stack;

    invoke-virtual {v5}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LOH6;

    invoke-virtual {v5}, LOH6;->a()I

    move-result v5

    invoke-virtual {v3}, LOH6;->a()I

    move-result v6

    if-ne v5, v6, :cond_4

    invoke-virtual {v3}, LOH6;->a()I

    move-result v5

    shl-int v5, v4, v5

    div-int v5, v2, v5

    if-ne v5, v4, :cond_0

    iget-object v6, p0, Lwv;->g:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v6, 0x3

    if-ne v5, v6, :cond_1

    invoke-virtual {v3}, LOH6;->a()I

    move-result v7

    iget v8, p0, Lwv;->c:I

    iget v9, p0, Lwv;->e:I

    sub-int/2addr v8, v9

    if-ge v7, v8, :cond_1

    iget-object v7, p0, Lwv;->d:Ljava/util/List;

    invoke-virtual {v3}, LOH6;->a()I

    move-result v8

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lyv;

    invoke-virtual {v7, v3}, Lyv;->l(LOH6;)V

    :cond_1
    if-lt v5, v6, :cond_3

    and-int/lit8 v5, v5, 0x1

    if-ne v5, v4, :cond_3

    invoke-virtual {v3}, LOH6;->a()I

    move-result v5

    iget v6, p0, Lwv;->c:I

    iget v7, p0, Lwv;->e:I

    sub-int/2addr v6, v7

    if-lt v5, v6, :cond_3

    invoke-virtual {v3}, LOH6;->a()I

    move-result v5

    iget v6, p0, Lwv;->c:I

    add-int/lit8 v6, v6, -0x2

    if-gt v5, v6, :cond_3

    iget-object v5, p0, Lwv;->h:Ljava/util/Map;

    invoke-virtual {v3}, LOH6;->a()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    new-instance v5, Ljava/util/LinkedList;

    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v5, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lwv;->h:Ljava/util/Map;

    invoke-virtual {v3}, LOH6;->a()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    iget-object v5, p0, Lwv;->h:Ljava/util/Map;

    invoke-virtual {v3}, LOH6;->a()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/LinkedList;

    invoke-virtual {v5, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_2
    new-instance v5, LtH1$b;

    invoke-direct {v5}, LtH1$b;-><init>()V

    invoke-virtual {v1}, LCH6;->b()I

    move-result v6

    invoke-virtual {v5, v6}, LCH6$a;->g(I)LCH6$a;

    move-result-object v5

    check-cast v5, LtH1$b;

    invoke-virtual {v1}, LCH6;->c()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, LCH6$a;->h(J)LCH6$a;

    move-result-object v5

    check-cast v5, LtH1$b;

    invoke-virtual {v1}, LtH1;->e()I

    move-result v6

    invoke-virtual {v5, v6}, LtH1$b;->m(I)LtH1$b;

    move-result-object v5

    invoke-virtual {v1}, LtH1;->f()I

    move-result v6

    sub-int/2addr v6, v4

    div-int/lit8 v6, v6, 0x2

    invoke-virtual {v5, v6}, LtH1$b;->n(I)LtH1$b;

    move-result-object v5

    invoke-virtual {v1}, LCH6;->a()I

    move-result v1

    invoke-virtual {v5, v1}, LCH6$a;->f(I)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    invoke-virtual {v1}, LtH1$b;->k()LCH6;

    move-result-object v1

    check-cast v1, LtH1;

    iget-object v5, p0, Lwv;->b:Llw6;

    iget-object v6, p0, Lwv;->i:Ljava/util/Stack;

    invoke-virtual {v6}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LOH6;

    invoke-static {v5, v6, v3, v1}, LPH6;->b(Llw6;LOH6;LOH6;LCH6;)LOH6;

    move-result-object v3

    new-instance v5, LOH6;

    invoke-virtual {v3}, LOH6;->a()I

    move-result v6

    add-int/2addr v6, v4

    invoke-virtual {v3}, LOH6;->b()[B

    move-result-object v3

    invoke-direct {v5, v6, v3}, LOH6;-><init>(I[B)V

    new-instance v3, LtH1$b;

    invoke-direct {v3}, LtH1$b;-><init>()V

    invoke-virtual {v1}, LCH6;->b()I

    move-result v6

    invoke-virtual {v3, v6}, LCH6$a;->g(I)LCH6$a;

    move-result-object v3

    check-cast v3, LtH1$b;

    invoke-virtual {v1}, LCH6;->c()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, LCH6$a;->h(J)LCH6$a;

    move-result-object v3

    check-cast v3, LtH1$b;

    invoke-virtual {v1}, LtH1;->e()I

    move-result v6

    add-int/2addr v6, v4

    invoke-virtual {v3, v6}, LtH1$b;->m(I)LtH1$b;

    move-result-object v3

    invoke-virtual {v1}, LtH1;->f()I

    move-result v6

    invoke-virtual {v3, v6}, LtH1$b;->n(I)LtH1$b;

    move-result-object v3

    invoke-virtual {v1}, LCH6;->a()I

    move-result v1

    invoke-virtual {v3, v1}, LCH6$a;->f(I)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    invoke-virtual {v1}, LtH1$b;->k()LCH6;

    move-result-object v1

    check-cast v1, LtH1;

    move-object v3, v5

    goto/16 :goto_1

    :cond_4
    iget-object v4, p0, Lwv;->i:Ljava/util/Stack;

    invoke-virtual {v4, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_5
    iget-object p1, p0, Lwv;->i:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LOH6;

    iput-object p1, p0, Lwv;->f:LOH6;

    return-void

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "otsHashAddress == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f([B[BLFd3;)V
    .locals 11

    if-eqz p3, :cond_a

    iget-boolean v0, p0, Lwv;->l:Z

    if-nez v0, :cond_9

    iget v0, p0, Lwv;->k:I

    iget v1, p0, Lwv;->m:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_8

    iget v1, p0, Lwv;->c:I

    invoke-static {v0, v1}, LWH6;->b(II)I

    move-result v0

    iget v1, p0, Lwv;->k:I

    add-int/lit8 v3, v0, 0x1

    shr-int/2addr v1, v3

    and-int/2addr v1, v2

    if-nez v1, :cond_0

    iget v1, p0, Lwv;->c:I

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lwv;->j:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lwv;->g:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance v1, LQl2$b;

    invoke-direct {v1}, LQl2$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v3

    invoke-virtual {v1, v3}, LCH6$a;->g(I)LCH6$a;

    move-result-object v1

    check-cast v1, LQl2$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, LCH6$a;->h(J)LCH6$a;

    move-result-object v1

    check-cast v1, LQl2$b;

    invoke-virtual {v1}, LQl2$b;->l()LCH6;

    move-result-object v1

    check-cast v1, LQl2;

    new-instance v3, LtH1$b;

    invoke-direct {v3}, LtH1$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v4

    invoke-virtual {v3, v4}, LCH6$a;->g(I)LCH6$a;

    move-result-object v3

    check-cast v3, LtH1$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, LCH6$a;->h(J)LCH6$a;

    move-result-object v3

    check-cast v3, LtH1$b;

    invoke-virtual {v3}, LtH1$b;->k()LCH6;

    move-result-object v3

    check-cast v3, LtH1;

    const/4 v4, 0x0

    if-nez v0, :cond_1

    new-instance v0, LFd3$b;

    invoke-direct {v0}, LFd3$b;-><init>()V

    invoke-virtual {p3}, LCH6;->b()I

    move-result v3

    invoke-virtual {v0, v3}, LCH6$a;->g(I)LCH6$a;

    move-result-object v0

    check-cast v0, LFd3$b;

    invoke-virtual {p3}, LCH6;->c()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, LCH6$a;->h(J)LCH6$a;

    move-result-object v0

    check-cast v0, LFd3$b;

    iget v3, p0, Lwv;->k:I

    invoke-virtual {v0, v3}, LFd3$b;->p(I)LFd3$b;

    move-result-object v0

    invoke-virtual {p3}, LFd3;->e()I

    move-result v3

    invoke-virtual {v0, v3}, LFd3$b;->n(I)LFd3$b;

    move-result-object v0

    invoke-virtual {p3}, LFd3;->f()I

    move-result v3

    invoke-virtual {v0, v3}, LFd3$b;->o(I)LFd3$b;

    move-result-object v0

    invoke-virtual {p3}, LCH6;->a()I

    move-result p3

    invoke-virtual {v0, p3}, LCH6$a;->f(I)LCH6$a;

    move-result-object p3

    check-cast p3, LFd3$b;

    invoke-virtual {p3}, LFd3$b;->l()LCH6;

    move-result-object p3

    check-cast p3, LFd3;

    iget-object v0, p0, Lwv;->b:Llw6;

    invoke-virtual {v0, p2, p3}, Llw6;->g([BLFd3;)[B

    move-result-object v3

    invoke-virtual {v0, v3, p1}, Llw6;->h([B[B)V

    iget-object v0, p0, Lwv;->b:Llw6;

    invoke-virtual {v0, p3}, Llw6;->e(LFd3;)Low6;

    move-result-object v0

    new-instance v3, LQl2$b;

    invoke-direct {v3}, LQl2$b;-><init>()V

    invoke-virtual {v1}, LCH6;->b()I

    move-result v5

    invoke-virtual {v3, v5}, LCH6$a;->g(I)LCH6$a;

    move-result-object v3

    check-cast v3, LQl2$b;

    invoke-virtual {v1}, LCH6;->c()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, LCH6$a;->h(J)LCH6$a;

    move-result-object v3

    check-cast v3, LQl2$b;

    iget v5, p0, Lwv;->k:I

    invoke-virtual {v3, v5}, LQl2$b;->n(I)LQl2$b;

    move-result-object v3

    invoke-virtual {v1}, LQl2;->f()I

    move-result v5

    invoke-virtual {v3, v5}, LQl2$b;->o(I)LQl2$b;

    move-result-object v3

    invoke-virtual {v1}, LQl2;->g()I

    move-result v5

    invoke-virtual {v3, v5}, LQl2$b;->p(I)LQl2$b;

    move-result-object v3

    invoke-virtual {v1}, LCH6;->a()I

    move-result v1

    invoke-virtual {v3, v1}, LCH6$a;->f(I)LCH6$a;

    move-result-object v1

    check-cast v1, LQl2$b;

    invoke-virtual {v1}, LQl2$b;->l()LCH6;

    move-result-object v1

    check-cast v1, LQl2;

    iget-object v3, p0, Lwv;->b:Llw6;

    invoke-static {v3, v0, v1}, LPH6;->a(Llw6;Low6;LQl2;)LOH6;

    move-result-object v0

    iget-object v1, p0, Lwv;->g:Ljava/util/List;

    invoke-interface {v1, v4, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3

    :cond_1
    new-instance v1, LtH1$b;

    invoke-direct {v1}, LtH1$b;-><init>()V

    invoke-virtual {v3}, LCH6;->b()I

    move-result v5

    invoke-virtual {v1, v5}, LCH6$a;->g(I)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    invoke-virtual {v3}, LCH6;->c()J

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, LCH6$a;->h(J)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    add-int/lit8 v5, v0, -0x1

    invoke-virtual {v1, v5}, LtH1$b;->m(I)LtH1$b;

    move-result-object v1

    iget v6, p0, Lwv;->k:I

    shr-int/2addr v6, v0

    invoke-virtual {v1, v6}, LtH1$b;->n(I)LtH1$b;

    move-result-object v1

    invoke-virtual {v3}, LCH6;->a()I

    move-result v3

    invoke-virtual {v1, v3}, LCH6$a;->f(I)LCH6$a;

    move-result-object v1

    check-cast v1, LtH1$b;

    invoke-virtual {v1}, LtH1$b;->k()LCH6;

    move-result-object v1

    check-cast v1, LtH1;

    iget-object v3, p0, Lwv;->b:Llw6;

    invoke-virtual {v3, p2, p3}, Llw6;->g([BLFd3;)[B

    move-result-object v6

    invoke-virtual {v3, v6, p1}, Llw6;->h([B[B)V

    iget-object v3, p0, Lwv;->b:Llw6;

    iget-object v6, p0, Lwv;->g:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LOH6;

    iget-object v7, p0, Lwv;->j:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LOH6;

    invoke-static {v3, v6, v7, v1}, LPH6;->b(Llw6;LOH6;LOH6;LCH6;)LOH6;

    move-result-object v1

    new-instance v3, LOH6;

    invoke-virtual {v1}, LOH6;->a()I

    move-result v6

    add-int/2addr v6, v2

    invoke-virtual {v1}, LOH6;->b()[B

    move-result-object v1

    invoke-direct {v3, v6, v1}, LOH6;-><init>(I[B)V

    iget-object v1, p0, Lwv;->g:Ljava/util/List;

    invoke-interface {v1, v0, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lwv;->j:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v4

    :goto_0
    if-ge v1, v0, :cond_3

    iget v3, p0, Lwv;->c:I

    iget v5, p0, Lwv;->e:I

    sub-int/2addr v3, v5

    if-ge v1, v3, :cond_2

    iget-object v3, p0, Lwv;->g:Ljava/util/List;

    iget-object v5, p0, Lwv;->d:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lyv;

    invoke-virtual {v5}, Lyv;->g()LOH6;

    move-result-object v5

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lwv;->g:Ljava/util/List;

    iget-object v5, p0, Lwv;->h:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v5

    :goto_1
    invoke-interface {v3, v1, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    iget v1, p0, Lwv;->c:I

    iget v3, p0, Lwv;->e:I

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    move v1, v4

    :goto_2
    if-ge v1, v0, :cond_5

    iget v3, p0, Lwv;->k:I

    add-int/2addr v3, v2

    shl-int v5, v2, v1

    mul-int/lit8 v5, v5, 0x3

    add-int/2addr v3, v5

    iget v5, p0, Lwv;->c:I

    shl-int v5, v2, v5

    if-ge v3, v5, :cond_4

    iget-object v5, p0, Lwv;->d:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lyv;

    invoke-virtual {v5, v3}, Lyv;->h(I)V

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    iget v0, p0, Lwv;->c:I

    iget v1, p0, Lwv;->e:I

    sub-int/2addr v0, v1

    shr-int/2addr v0, v2

    if-ge v4, v0, :cond_7

    invoke-virtual {p0}, Lwv;->a()Lyv;

    move-result-object v5

    if-eqz v5, :cond_6

    iget-object v6, p0, Lwv;->i:Ljava/util/Stack;

    iget-object v7, p0, Lwv;->b:Llw6;

    move-object v8, p1

    move-object v9, p2

    move-object v10, p3

    invoke-virtual/range {v5 .. v10}, Lyv;->m(Ljava/util/Stack;Llw6;[B[BLFd3;)V

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    iget p1, p0, Lwv;->k:I

    add-int/2addr p1, v2

    iput p1, p0, Lwv;->k:I

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "index out of bounds"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "index already used"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "otsHashAddress == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Lwv;->g:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lwv;->h:Ljava/util/Map;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lwv;->i:Ljava/util/Stack;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lwv;->d:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lwv;->j:Ljava/util/Map;

    if-eqz v0, :cond_1

    iget v0, p0, Lwv;->c:I

    iget v1, p0, Lwv;->k:I

    int-to-long v1, v1

    invoke-static {v0, v1, v2}, LWH6;->l(IJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "index in BDS state out of bounds"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "keep == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "treeHashInstances == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "stack == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "retain == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "authenticationPath == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h(LN;)Lwv;
    .locals 1

    new-instance v0, Lwv;

    invoke-direct {v0, p0, p1}, Lwv;-><init>(Lwv;LN;)V

    return-object v0
.end method
