.class public interface abstract Landroidx/camera/core/impl/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/f$c;,
        Landroidx/camera/core/impl/f$a;,
        Landroidx/camera/core/impl/f$b;
    }
.end annotation


# direct methods
.method public static H(Landroidx/camera/core/impl/f$c;Landroidx/camera/core/impl/f$c;)Z
    .locals 2

    sget-object v0, Landroidx/camera/core/impl/f$c;->b:Landroidx/camera/core/impl/f$c;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Landroidx/camera/core/impl/f$c;->c:Landroidx/camera/core/impl/f$c;

    if-ne p0, v0, :cond_1

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static N(Landroidx/camera/core/impl/f;Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/f;
    .locals 4

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    invoke-static {}, Landroidx/camera/core/impl/n;->S()Landroidx/camera/core/impl/n;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Landroidx/camera/core/impl/m;->W(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/m;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroidx/camera/core/impl/m;->V()Landroidx/camera/core/impl/m;

    move-result-object p1

    :goto_0
    if-eqz p0, :cond_2

    invoke-interface {p0}, Landroidx/camera/core/impl/f;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/f;->h(Landroidx/camera/core/impl/f$a;)Landroidx/camera/core/impl/f$c;

    move-result-object v2

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/f;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v1, v2, v3}, Landroidx/camera/core/impl/m;->n(Landroidx/camera/core/impl/f$a;Landroidx/camera/core/impl/f$c;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Landroidx/camera/core/impl/n;->T(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/n;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/f$a<",
            "TValueT;>;)TValueT;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;Landroidx/camera/core/impl/f$b;)V
.end method

.method public abstract c(Landroidx/camera/core/impl/f$a;)Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/f$a<",
            "*>;)",
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/f$c;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/f$a<",
            "TValueT;>;TValueT;)TValueT;"
        }
    .end annotation
.end method

.method public abstract e(Landroidx/camera/core/impl/f$a;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/f$a<",
            "*>;)Z"
        }
    .end annotation
.end method

.method public abstract f(Landroidx/camera/core/impl/f$a;Landroidx/camera/core/impl/f$c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/f$a<",
            "TValueT;>;",
            "Landroidx/camera/core/impl/f$c;",
            ")TValueT;"
        }
    .end annotation
.end method

.method public abstract g()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/f$a<",
            "*>;>;"
        }
    .end annotation
.end method

.method public abstract h(Landroidx/camera/core/impl/f$a;)Landroidx/camera/core/impl/f$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/f$a<",
            "*>;)",
            "Landroidx/camera/core/impl/f$c;"
        }
    .end annotation
.end method
