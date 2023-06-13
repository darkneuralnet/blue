.class public abstract LeZ1;
.super LfZ1;
.source "SourceFile"

# interfaces
.implements Ljava/util/NavigableSet;
.implements LvN5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LeZ1$b;,
        LeZ1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LfZ1<",
        "TE;>;",
        "Ljava/util/NavigableSet<",
        "TE;>;",
        "LvN5<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient d:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TE;>;"
        }
    .end annotation
.end field

.field public transient e:LeZ1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LeZ1<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LfZ1;-><init>()V

    iput-object p1, p0, LeZ1;->d:Ljava/util/Comparator;

    return-void
.end method

.method public static varargs H(Ljava/util/Comparator;I[Ljava/lang/Object;)LeZ1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;I[TE;)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-static {p0}, LeZ1;->N(Ljava/util/Comparator;)LSt4;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p2, p1}, LHd3;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p2, v0, p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    if-ge v0, p1, :cond_2

    aget-object v2, p2, v0

    add-int/lit8 v3, v1, -0x1

    aget-object v3, p2, v3

    invoke-interface {p0, v2, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v3, v1, 0x1

    aput-object v2, p2, v1

    move v1, v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    invoke-static {p2, v1, p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    array-length p1, p2

    div-int/lit8 p1, p1, 0x2

    if-ge v1, p1, :cond_3

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    :cond_3
    new-instance p1, LSt4;

    invoke-static {p2, v1}, LVY1;->s([Ljava/lang/Object;I)LVY1;

    move-result-object p2

    invoke-direct {p1, p2, p0}, LSt4;-><init>(LVY1;Ljava/util/Comparator;)V

    return-object p1
.end method

.method public static I(Ljava/util/Comparator;Ljava/lang/Iterable;)LeZ1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, p1}, LwN5;->b(Ljava/util/Comparator;Ljava/lang/Iterable;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, LeZ1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LeZ1;

    invoke-virtual {v0}, LQY1;->h()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {p1}, Lyg2;->h(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    array-length v0, p1

    invoke-static {p0, v0, p1}, LeZ1;->H(Ljava/util/Comparator;I[Ljava/lang/Object;)LeZ1;

    move-result-object p0

    return-object p0
.end method

.method public static J(Ljava/util/Comparator;Ljava/util/Collection;)LeZ1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;",
            "Ljava/util/Collection<",
            "+TE;>;)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LeZ1;->I(Ljava/util/Comparator;Ljava/lang/Iterable;)LeZ1;

    move-result-object p0

    return-object p0
.end method

.method public static N(Ljava/util/Comparator;)LSt4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;)",
            "LSt4<",
            "TE;>;"
        }
    .end annotation

    invoke-static {}, Lzy3;->c()Lzy3;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LSt4;->g:LSt4;

    return-object p0

    :cond_0
    new-instance v0, LSt4;

    invoke-static {}, LVY1;->E()LVY1;

    move-result-object v1

    invoke-direct {v0, v1, p0}, LSt4;-><init>(LVY1;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static a0(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/InvalidObjectException;
        }
    .end annotation

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public abstract K()LeZ1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation
.end method

.method public abstract L()Lre6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lre6<",
            "TE;>;"
        }
    .end annotation
.end method

.method public M()LeZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LeZ1;->e:LeZ1;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LeZ1;->K()LeZ1;

    move-result-object v0

    iput-object v0, p0, LeZ1;->e:LeZ1;

    iput-object p0, v0, LeZ1;->e:LeZ1;

    :cond_0
    return-object v0
.end method

.method public O(Ljava/lang/Object;)LeZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LeZ1;->Q(Ljava/lang/Object;Z)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public Q(Ljava/lang/Object;Z)LeZ1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LeZ1;->R(Ljava/lang/Object;Z)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public abstract R(Ljava/lang/Object;Z)LeZ1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation
.end method

.method public S(Ljava/lang/Object;Ljava/lang/Object;)LeZ1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, p2, v1}, LeZ1;->T(Ljava/lang/Object;ZLjava/lang/Object;Z)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public T(Ljava/lang/Object;ZLjava/lang/Object;Z)LeZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;ZTE;Z)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LeZ1;->d:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LEZ3;->d(Z)V

    invoke-virtual {p0, p1, p2, p3, p4}, LeZ1;->U(Ljava/lang/Object;ZLjava/lang/Object;Z)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public abstract U(Ljava/lang/Object;ZLjava/lang/Object;Z)LeZ1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;ZTE;Z)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation
.end method

.method public V(Ljava/lang/Object;)LeZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LeZ1;->X(Ljava/lang/Object;Z)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public X(Ljava/lang/Object;Z)LeZ1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LeZ1;->Y(Ljava/lang/Object;Z)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public abstract Y(Ljava/lang/Object;Z)LeZ1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "LeZ1<",
            "TE;>;"
        }
    .end annotation
.end method

.method public Z(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LeZ1;->d:Ljava/util/Comparator;

    invoke-static {v0, p1, p2}, LeZ1;->a0(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public ceiling(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TE;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LeZ1;->X(Ljava/lang/Object;Z)LeZ1;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lyg2;->d(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "-TE;>;"
        }
    .end annotation

    iget-object v0, p0, LeZ1;->d:Ljava/util/Comparator;

    return-object v0
.end method

.method public bridge synthetic descendingIterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LeZ1;->L()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic descendingSet()Ljava/util/NavigableSet;
    .locals 1

    invoke-virtual {p0}, LeZ1;->M()LeZ1;

    move-result-object v0

    return-object v0
.end method

.method public first()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    invoke-virtual {p0}, LeZ1;->j()Lre6;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public floor(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TE;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LeZ1;->Q(Ljava/lang/Object;Z)LeZ1;

    move-result-object p1

    invoke-virtual {p1}, LeZ1;->L()Lre6;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lzg2;->l(Ljava/util/Iterator;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p0, p1, p2}, LeZ1;->Q(Ljava/lang/Object;Z)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    invoke-virtual {p0, p1}, LeZ1;->O(Ljava/lang/Object;)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public higher(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TE;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LeZ1;->X(Ljava/lang/Object;Z)LeZ1;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lyg2;->d(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LeZ1;->j()Lre6;

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

.method public last()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    invoke-virtual {p0}, LeZ1;->L()Lre6;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public lower(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TE;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LeZ1;->Q(Ljava/lang/Object;Z)LeZ1;

    move-result-object p1

    invoke-virtual {p1}, LeZ1;->L()Lre6;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lzg2;->l(Ljava/util/Iterator;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public bridge synthetic subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LeZ1;->T(Ljava/lang/Object;ZLjava/lang/Object;Z)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    invoke-virtual {p0, p1, p2}, LeZ1;->S(Ljava/lang/Object;Ljava/lang/Object;)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p0, p1, p2}, LeZ1;->X(Ljava/lang/Object;Z)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    invoke-virtual {p0, p1}, LeZ1;->V(Ljava/lang/Object;)LeZ1;

    move-result-object p1

    return-object p1
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 3

    new-instance v0, LeZ1$b;

    iget-object v1, p0, LeZ1;->d:Ljava/util/Comparator;

    invoke-virtual {p0}, LQY1;->toArray()[Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LeZ1$b;-><init>(Ljava/util/Comparator;[Ljava/lang/Object;)V

    return-object v0
.end method
