.class public LMp0$d;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMp0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LMp0;


# direct methods
.method public constructor <init>(LMp0;)V
    .locals 0

    iput-object p1, p0, LMp0$d;->b:LMp0;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, LMp0$d;->b:LMp0;

    invoke-virtual {v0}, LMp0;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, LMp0$d;->b:LMp0;

    invoke-virtual {v0}, LMp0;->x()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, LMp0$d;->b:LMp0;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, LMp0;->i(LMp0;Ljava/lang/Object;)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget-object v2, p0, LMp0$d;->b:LMp0;

    invoke-static {v2, v0}, LMp0;->j(LMp0;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, LXd3;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LMp0$d;->b:LMp0;

    invoke-virtual {v0}, LMp0;->z()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 9

    iget-object v0, p0, LMp0$d;->b:LMp0;

    invoke-virtual {v0}, LMp0;->x()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, LMp0$d;->b:LMp0;

    invoke-virtual {v0}, LMp0;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, LMp0$d;->b:LMp0;

    invoke-static {v0}, LMp0;->k(LMp0;)I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    iget-object p1, p0, LMp0$d;->b:LMp0;

    invoke-static {p1}, LMp0;->l(LMp0;)Ljava/lang/Object;

    move-result-object v5

    iget-object p1, p0, LMp0$d;->b:LMp0;

    invoke-static {p1}, LMp0;->m(LMp0;)[I

    move-result-object v6

    iget-object p1, p0, LMp0$d;->b:LMp0;

    invoke-static {p1}, LMp0;->c(LMp0;)[Ljava/lang/Object;

    move-result-object v7

    iget-object p1, p0, LMp0$d;->b:LMp0;

    invoke-static {p1}, LMp0;->d(LMp0;)[Ljava/lang/Object;

    move-result-object v8

    move v4, v0

    invoke-static/range {v2 .. v8}, LOp0;->f(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_2

    return v1

    :cond_2
    iget-object v1, p0, LMp0$d;->b:LMp0;

    invoke-virtual {v1, p1, v0}, LMp0;->K(II)V

    iget-object p1, p0, LMp0$d;->b:LMp0;

    invoke-static {p1}, LMp0;->e(LMp0;)I

    iget-object p1, p0, LMp0$d;->b:LMp0;

    invoke-virtual {p1}, LMp0;->D()V

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LMp0$d;->b:LMp0;

    invoke-virtual {v0}, LMp0;->size()I

    move-result v0

    return v0
.end method
