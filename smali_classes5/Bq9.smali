.class public final LBq9;
.super Lsl9;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final synthetic e:Lgs9;


# direct methods
.method public constructor <init>(Lgs9;)V
    .locals 0

    iput-object p1, p0, LBq9;->e:Lgs9;

    invoke-direct {p0, p1}, Lsl9;-><init>(LDo9;)V

    return-void
.end method

.method public constructor <init>(Lgs9;I)V
    .locals 1

    iput-object p1, p0, LBq9;->e:Lgs9;

    iget-object v0, p1, LDo9;->c:Ljava/util/Collection;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lsl9;-><init>(LDo9;Ljava/util/Iterator;)V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LBq9;->e:Lgs9;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    invoke-virtual {p0}, Lsl9;->a()V

    iget-object v1, p0, Lsl9;->b:Ljava/util/Iterator;

    check-cast v1, Ljava/util/ListIterator;

    invoke-interface {v1, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    iget-object p1, p0, LBq9;->e:Lgs9;

    iget-object p1, p1, Lgs9;->g:LJt9;

    invoke-static {p1}, LJt9;->f(LJt9;)I

    if-eqz v0, :cond_0

    iget-object p1, p0, LBq9;->e:Lgs9;

    invoke-virtual {p1}, LDo9;->a()V

    :cond_0
    return-void
.end method

.method public final hasPrevious()Z
    .locals 1

    invoke-virtual {p0}, Lsl9;->a()V

    iget-object v0, p0, Lsl9;->b:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public final nextIndex()I
    .locals 1

    invoke-virtual {p0}, Lsl9;->a()V

    iget-object v0, p0, Lsl9;->b:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsl9;->a()V

    iget-object v0, p0, Lsl9;->b:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    invoke-virtual {p0}, Lsl9;->a()V

    iget-object v0, p0, Lsl9;->b:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lsl9;->a()V

    iget-object v0, p0, Lsl9;->b:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void
.end method
