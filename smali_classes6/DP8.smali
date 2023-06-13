.class public final LDP8;
.super LZP8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LZP8<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient d:LZP8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZP8<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZP8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZP8<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LZP8;-><init>()V

    iput-object p1, p0, LDP8;->d:LZP8;

    return-void
.end method


# virtual methods
.method public final D(I)I
    .locals 1

    iget-object v0, p0, LDP8;->d:LZP8;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LDP8;->d:LZP8;

    invoke-virtual {v0, p1}, LZP8;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, LDP8;->d:LZP8;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LyK8;->a(IILjava/lang/String;)I

    iget-object v0, p0, LDP8;->d:LZP8;

    invoke-virtual {p0, p1}, LDP8;->D(I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, LDP8;->d:LZP8;

    invoke-virtual {v0}, LXO8;->h()Z

    move-result v0

    return v0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LDP8;->d:LZP8;

    invoke-virtual {v0, p1}, LZP8;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, LDP8;->D(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LDP8;->d:LZP8;

    invoke-virtual {v0, p1}, LZP8;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, LDP8;->D(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final o()LZP8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZP8<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LDP8;->d:LZP8;

    return-object v0
.end method

.method public final s(II)LZP8;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "LZP8<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LDP8;->d:LZP8;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, LyK8;->h(III)V

    iget-object v0, p0, LDP8;->d:LZP8;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    sub-int/2addr v1, p2

    iget-object p2, p0, LDP8;->d:LZP8;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    sub-int/2addr p2, p1

    invoke-virtual {v0, v1, p2}, LZP8;->s(II)LZP8;

    move-result-object p1

    invoke-virtual {p1}, LZP8;->o()LZP8;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LDP8;->d:LZP8;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LZP8;->s(II)LZP8;

    move-result-object p1

    return-object p1
.end method
