.class public final LGv2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJR3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LJR3<",
        "Ljava/util/Locale;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u0010\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0008\u0010\r\u001a\u00020\u0008H\u0016R\u001a\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "LGv2;",
        "LJR3;",
        "Ljava/util/Locale;",
        "key",
        "u",
        "",
        "e",
        "element",
        "",
        "y",
        "elements",
        "f",
        "s",
        "a",
        "LMj6;",
        "b",
        "LMj6;",
        "valueSetStore",
        "<init>",
        "(LMj6;)V",
        "restring_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final b:LMj6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMj6<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LMj6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMj6<",
            "Ljava/util/Locale;",
            ">;)V"
        }
    .end annotation

    const-string v0, "valueSetStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGv2;->b:LMj6;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LGv2;->b:LMj6;

    invoke-interface {v0}, LMj6;->a()V

    return-void
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/util/Locale;

    invoke-virtual {p0, p1}, LGv2;->j(Ljava/util/Locale;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/Locale;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, LJR3$a;->b(LJR3;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Locale;

    invoke-virtual {p0, p1}, LGv2;->s(Ljava/util/Locale;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Locale;

    invoke-virtual {p0, p1}, LGv2;->u(Ljava/util/Locale;)Ljava/util/Locale;

    move-result-object p1

    return-object p1
.end method

.method public clear()V
    .locals 0

    invoke-static {p0}, LJR3$a;->c(LJR3;)V

    return-void
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljava/util/Locale;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Locale;

    invoke-virtual {p0, p1}, LGv2;->o(Ljava/util/Locale;)Z

    move-result p1

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, LJR3$a;->e(LJR3;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public e()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LGv2;->b:LMj6;

    invoke-interface {v0}, LMj6;->e()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/util/Locale;",
            ">;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LGv2;->b:LMj6;

    invoke-interface {v0, p1}, LMj6;->f(Ljava/util/Collection;)V

    return-void
.end method

.method public bridge synthetic getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LGv2;->w(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Locale;

    invoke-virtual {p0, p1}, LGv2;->y(Ljava/util/Locale;)V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    invoke-static {p0}, LJR3$a;->h(LJR3;)Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LJR3$a;->i(LJR3;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public j(Ljava/util/Locale;)Z
    .locals 0

    invoke-static {p0, p1}, LJR3$a;->a(LJR3;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public o(Ljava/util/Locale;)Z
    .locals 0

    invoke-static {p0, p1}, LJR3$a;->d(LJR3;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljava/util/Locale;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Locale;

    invoke-virtual {p0, p1}, LGv2;->x(Ljava/util/Locale;)Z

    move-result p1

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, LJR3$a;->k(LJR3;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, LJR3$a;->l(LJR3;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public s(Ljava/util/Locale;)V
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LGv2;->b:LMj6;

    invoke-interface {v0, p1}, LMj6;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, LGv2;->v()I

    move-result v0

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/CollectionToArray;->toArray(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/jvm/internal/CollectionToArray;->toArray(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public u(Ljava/util/Locale;)Ljava/util/Locale;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LGv2;->b:LMj6;

    invoke-interface {v0, p1}, LMj6;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Locale;

    return-object p1
.end method

.method public v()I
    .locals 1

    invoke-static {p0}, LJR3$a;->f(LJR3;)I

    move-result v0

    return v0
.end method

.method public w(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/reflect/KProperty<",
            "*>;)",
            "Ljava/util/Set<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LJR3$a;->g(LJR3;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public x(Ljava/util/Locale;)Z
    .locals 0

    invoke-static {p0, p1}, LJR3$a;->j(LJR3;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public y(Ljava/util/Locale;)V
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LGv2;->b:LMj6;

    invoke-interface {v0, p1}, LMj6;->h(Ljava/lang/Object;)V

    return-void
.end method
