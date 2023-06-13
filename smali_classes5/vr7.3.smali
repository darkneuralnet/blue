.class public final Lvr7;
.super LKp7;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final synthetic e:Lks7;


# direct methods
.method public constructor <init>(Lks7;)V
    .locals 0

    iput-object p1, p0, Lvr7;->e:Lks7;

    invoke-direct {p0, p1}, LKp7;-><init>(LEq7;)V

    return-void
.end method

.method public constructor <init>(Lks7;I)V
    .locals 1

    iput-object p1, p0, Lvr7;->e:Lks7;

    iget-object v0, p1, LEq7;->c:Ljava/util/Collection;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LKp7;-><init>(LEq7;Ljava/util/Iterator;)V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lvr7;->e:Lks7;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    invoke-virtual {p0}, LKp7;->a()V

    iget-object v1, p0, LKp7;->b:Ljava/util/Iterator;

    check-cast v1, Ljava/util/ListIterator;

    invoke-interface {v1, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    iget-object p1, p0, Lvr7;->e:Lks7;

    iget-object p1, p1, Lks7;->g:Lbt7;

    invoke-static {p1}, Lbt7;->f(Lbt7;)I

    if-eqz v0, :cond_0

    iget-object p1, p0, Lvr7;->e:Lks7;

    invoke-virtual {p1}, LEq7;->a()V

    :cond_0
    return-void
.end method

.method public final hasPrevious()Z
    .locals 1

    invoke-virtual {p0}, LKp7;->a()V

    iget-object v0, p0, LKp7;->b:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public final nextIndex()I
    .locals 1

    invoke-virtual {p0}, LKp7;->a()V

    iget-object v0, p0, LKp7;->b:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LKp7;->a()V

    iget-object v0, p0, LKp7;->b:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    invoke-virtual {p0}, LKp7;->a()V

    iget-object v0, p0, LKp7;->b:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LKp7;->a()V

    iget-object v0, p0, LKp7;->b:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void
.end method
