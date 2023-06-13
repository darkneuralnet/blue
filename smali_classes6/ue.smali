.class public interface abstract Lue;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(LRU2;)V
    .locals 1

    invoke-interface {p0, p1}, Lue;->b(LRU2;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LRU2;->m(Z)V

    :cond_0
    return-void
.end method

.method public abstract b(LRU2;)Z
.end method
