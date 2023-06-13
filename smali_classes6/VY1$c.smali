.class public LVY1$c;
.super LVY1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVY1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LVY1<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient d:LVY1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVY1<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVY1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVY1<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LVY1;-><init>()V

    iput-object p1, p0, LVY1$c;->d:LVY1;

    return-void
.end method


# virtual methods
.method public L()LVY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVY1<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LVY1$c;->d:LVY1;

    return-object v0
.end method

.method public N(II)LVY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "LVY1<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, LVY1$c;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, LEZ3;->s(III)V

    iget-object v0, p0, LVY1$c;->d:LVY1;

    invoke-virtual {p0, p2}, LVY1$c;->R(I)I

    move-result p2

    invoke-virtual {p0, p1}, LVY1$c;->R(I)I

    move-result p1

    invoke-virtual {v0, p2, p1}, LVY1;->N(II)LVY1;

    move-result-object p1

    invoke-virtual {p1}, LVY1;->L()LVY1;

    move-result-object p1

    return-object p1
.end method

.method public final Q(I)I
    .locals 1

    invoke-virtual {p0}, LVY1$c;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final R(I)I
    .locals 1

    invoke-virtual {p0}, LVY1$c;->size()I

    move-result v0

    sub-int/2addr v0, p1

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LVY1$c;->d:LVY1;

    invoke-virtual {v0, p1}, LVY1;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-virtual {p0}, LVY1$c;->size()I

    move-result v0

    invoke-static {p1, v0}, LEZ3;->l(II)I

    iget-object v0, p0, LVY1$c;->d:LVY1;

    invoke-virtual {p0, p1}, LVY1$c;->Q(I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, LVY1$c;->d:LVY1;

    invoke-virtual {v0}, LQY1;->h()Z

    move-result v0

    return v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LVY1$c;->d:LVY1;

    invoke-virtual {v0, p1}, LVY1;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, LVY1$c;->Q(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, LVY1;->j()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LVY1$c;->d:LVY1;

    invoke-virtual {v0, p1}, LVY1;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, LVY1$c;->Q(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    invoke-super {p0}, LVY1;->C()Lue6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-super {p0, p1}, LVY1;->D(I)Lue6;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LVY1$c;->d:LVY1;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LVY1$c;->N(II)LVY1;

    move-result-object p1

    return-object p1
.end method
