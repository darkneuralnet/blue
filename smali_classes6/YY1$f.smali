.class public LYY1$f;
.super LZY1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYY1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LZY1<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:LYY1;


# direct methods
.method public constructor <init>(LYY1;)V
    .locals 0

    iput-object p1, p0, LYY1$f;->e:LYY1;

    invoke-direct {p0}, LZY1;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic F2()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, LYY1$f;->s()LbZ1;

    move-result-object v0

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYY1$f;->e:LYY1;

    invoke-virtual {v0, p1}, LYY1;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public d3(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LYY1$f;->e:LYY1;

    iget-object v0, v0, LYY1;->g:LXY1;

    invoke-virtual {v0, p1}, LXY1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    :goto_0
    return p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public s()LbZ1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LbZ1<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, LYY1$f;->e:LYY1;

    invoke-virtual {v0}, LYY1;->w()LbZ1;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LYY1$f;->e:LYY1;

    invoke-virtual {v0}, LYY1;->size()I

    move-result v0

    return v0
.end method

.method public v(I)LmX2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LmX2$a<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, LYY1$f;->e:LYY1;

    iget-object v0, v0, LYY1;->g:LXY1;

    invoke-virtual {v0}, LXY1;->f()LbZ1;

    move-result-object v0

    invoke-virtual {v0}, LbZ1;->a()LVY1;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    invoke-static {v0, p1}, LoX2;->g(Ljava/lang/Object;I)LmX2$a;

    move-result-object p1

    return-object p1
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, LYY1$g;

    iget-object v1, p0, LYY1$f;->e:LYY1;

    invoke-direct {v0, v1}, LYY1$g;-><init>(LYY1;)V

    return-object v0
.end method
