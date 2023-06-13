.class public LrR3;
.super LpR3;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/internal/markers/KMutableIterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "LpR3<",
        "TK;TV;TT;>;",
        "Lkotlin/jvm/internal/markers/KMutableIterator;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0010\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u0002*\u0004\u0008\u0002\u0010\u00032\u0008\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\u0012\u001e\u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020$0#\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010\u0006\u001a\u00028\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\t\u001a\u00020\u0008H\u0016J\u001d\u0010\u000c\u001a\u00020\u00082\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ7\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00102\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0008\u0010\u0015\u001a\u00020\u0008H\u0002J\u0008\u0010\u0016\u001a\u00020\u0008H\u0002R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001fR\u0016\u0010\"\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010!\u00a8\u0006("
    }
    d2 = {
        "LrR3;",
        "K",
        "V",
        "T",
        "",
        "LpR3;",
        "next",
        "()Ljava/lang/Object;",
        "",
        "remove",
        "key",
        "newValue",
        "j",
        "(Ljava/lang/Object;Ljava/lang/Object;)V",
        "",
        "keyHash",
        "Lqa6;",
        "node",
        "pathIndex",
        "i",
        "(ILqa6;Ljava/lang/Object;I)V",
        "h",
        "g",
        "LqR3;",
        "e",
        "LqR3;",
        "builder",
        "f",
        "Ljava/lang/Object;",
        "lastIteratedKey",
        "",
        "Z",
        "nextWasInvoked",
        "I",
        "expectedModCount",
        "",
        "Lra6;",
        "path",
        "<init>",
        "(LqR3;[Lra6;)V",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final e:LqR3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LqR3<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public g:Z

.field public h:I


# direct methods
.method public constructor <init>(LqR3;[Lra6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LqR3<",
            "TK;TV;>;[",
            "Lra6<",
            "TK;TV;TT;>;)V"
        }
    .end annotation

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LqR3;->c()Lqa6;

    move-result-object v0

    invoke-direct {p0, v0, p2}, LpR3;-><init>(Lqa6;[Lra6;)V

    iput-object p1, p0, LrR3;->e:LqR3;

    invoke-virtual {p1}, LqR3;->b()I

    move-result p1

    iput p1, p0, LrR3;->h:I

    return-void
.end method


# virtual methods
.method public final g()V
    .locals 2

    iget-object v0, p0, LrR3;->e:LqR3;

    invoke-virtual {v0}, LqR3;->b()I

    move-result v0

    iget v1, p0, LrR3;->h:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final h()V
    .locals 1

    iget-boolean v0, p0, LrR3;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final i(ILqa6;Ljava/lang/Object;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lqa6<",
            "**>;TK;I)V"
        }
    .end annotation

    mul-int/lit8 v0, p4, 0x5

    const/16 v1, 0x1e

    if-le v0, v1, :cond_1

    invoke-virtual {p0}, LpR3;->d()[Lra6;

    move-result-object p1

    aget-object p1, p1, p4

    invoke-virtual {p2}, Lqa6;->p()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, Lqa6;->p()[Ljava/lang/Object;

    move-result-object p2

    array-length p2, p2

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lra6;->j([Ljava/lang/Object;II)V

    :goto_0
    invoke-virtual {p0}, LpR3;->d()[Lra6;

    move-result-object p1

    aget-object p1, p1, p4

    invoke-virtual {p1}, Lra6;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, LpR3;->d()[Lra6;

    move-result-object p1

    aget-object p1, p1, p4

    invoke-virtual {p1}, Lra6;->g()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p4}, LpR3;->f(I)V

    return-void

    :cond_1
    invoke-static {p1, v0}, Lua6;->f(II)I

    move-result v0

    const/4 v1, 0x1

    shl-int v0, v1, v0

    invoke-virtual {p2, v0}, Lqa6;->q(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p2, v0}, Lqa6;->n(I)I

    move-result p1

    invoke-virtual {p0}, LpR3;->d()[Lra6;

    move-result-object p3

    aget-object p3, p3, p4

    invoke-virtual {p2}, Lqa6;->p()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, Lqa6;->m()I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    invoke-virtual {p3, v0, p2, p1}, Lra6;->j([Ljava/lang/Object;II)V

    invoke-virtual {p0, p4}, LpR3;->f(I)V

    return-void

    :cond_2
    invoke-virtual {p2, v0}, Lqa6;->O(I)I

    move-result v0

    invoke-virtual {p2, v0}, Lqa6;->N(I)Lqa6;

    move-result-object v2

    invoke-virtual {p0}, LpR3;->d()[Lra6;

    move-result-object v3

    aget-object v3, v3, p4

    invoke-virtual {p2}, Lqa6;->p()[Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p2}, Lqa6;->m()I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    invoke-virtual {v3, v4, p2, v0}, Lra6;->j([Ljava/lang/Object;II)V

    add-int/2addr p4, v1

    invoke-virtual {p0, p1, v2, p3, p4}, LrR3;->i(ILqa6;Ljava/lang/Object;I)V

    return-void
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    iget-object v0, p0, LrR3;->e:LqR3;

    invoke-virtual {v0, p1}, LqR3;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LpR3;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LpR3;->b()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LrR3;->e:LqR3;

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result p2

    goto :goto_0

    :cond_1
    move p2, p1

    :goto_0
    iget-object v1, p0, LrR3;->e:LqR3;

    invoke-virtual {v1}, LqR3;->c()Lqa6;

    move-result-object v1

    invoke-virtual {p0, p2, v1, v0, p1}, LrR3;->i(ILqa6;Ljava/lang/Object;I)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, LrR3;->e:LqR3;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget-object p1, p0, LrR3;->e:LqR3;

    invoke-virtual {p1}, LqR3;->b()I

    move-result p1

    iput p1, p0, LrR3;->h:I

    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, LrR3;->g()V

    invoke-virtual {p0}, LpR3;->b()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LrR3;->f:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, LrR3;->g:Z

    invoke-super {p0}, LpR3;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 4

    invoke-virtual {p0}, LrR3;->h()V

    invoke-virtual {p0}, LpR3;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LpR3;->b()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, LrR3;->e:LqR3;

    iget-object v3, p0, LrR3;->f:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableMap(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    iget-object v3, p0, LrR3;->e:LqR3;

    invoke-virtual {v3}, LqR3;->c()Lqa6;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v0, v1}, LrR3;->i(ILqa6;Ljava/lang/Object;I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LrR3;->e:LqR3;

    iget-object v2, p0, LrR3;->f:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableMap(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, LrR3;->f:Ljava/lang/Object;

    iput-boolean v1, p0, LrR3;->g:Z

    iget-object v0, p0, LrR3;->e:LqR3;

    invoke-virtual {v0}, LqR3;->b()I

    move-result v0

    iput v0, p0, LrR3;->h:I

    return-void
.end method
