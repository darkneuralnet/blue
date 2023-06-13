.class public final LRR3;
.super LK0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/internal/markers/KMutableListIterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LK0<",
        "TT;>;",
        "Lkotlin/jvm/internal/markers/KMutableListIterator;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u000b\u001a\u00020\u0008H\u0016J\u0017\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u0008\u0010\r\u001a\u00020\u0008H\u0002J\u0008\u0010\u000e\u001a\u00020\u0008H\u0002J\u0008\u0010\u000f\u001a\u00020\u0008H\u0002J\u0008\u0010\u0010\u001a\u00020\u0008H\u0002R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0017\u00a8\u0006!"
    }
    d2 = {
        "LRR3;",
        "T",
        "",
        "LK0;",
        "previous",
        "()Ljava/lang/Object;",
        "next",
        "element",
        "",
        "add",
        "(Ljava/lang/Object;)V",
        "remove",
        "set",
        "i",
        "j",
        "g",
        "h",
        "LPR3;",
        "d",
        "LPR3;",
        "builder",
        "",
        "e",
        "I",
        "expectedModCount",
        "Lpa6;",
        "f",
        "Lpa6;",
        "trieIterator",
        "lastIteratedIndex",
        "index",
        "<init>",
        "(LPR3;I)V",
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
.field public final d:LPR3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LPR3<",
            "TT;>;"
        }
    .end annotation
.end field

.field public e:I

.field public f:Lpa6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpa6<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public g:I


# direct methods
.method public constructor <init>(LPR3;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LPR3<",
            "TT;>;I)V"
        }
    .end annotation

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/collections/AbstractMutableList;->size()I

    move-result v0

    invoke-direct {p0, p2, v0}, LK0;-><init>(II)V

    iput-object p1, p0, LRR3;->d:LPR3;

    invoke-virtual {p1}, LPR3;->c()I

    move-result p1

    iput p1, p0, LRR3;->e:I

    const/4 p1, -0x1

    iput p1, p0, LRR3;->g:I

    invoke-virtual {p0}, LRR3;->j()V

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0}, LRR3;->g()V

    iget-object v0, p0, LRR3;->d:LPR3;

    invoke-virtual {p0}, LK0;->c()I

    move-result v1

    invoke-virtual {v0, v1, p1}, LPR3;->add(ILjava/lang/Object;)V

    invoke-virtual {p0}, LK0;->c()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, LK0;->e(I)V

    invoke-virtual {p0}, LRR3;->i()V

    return-void
.end method

.method public final g()V
    .locals 2

    iget v0, p0, LRR3;->e:I

    iget-object v1, p0, LRR3;->d:LPR3;

    invoke-virtual {v1}, LPR3;->c()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final h()V
    .locals 2

    iget v0, p0, LRR3;->g:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, LRR3;->d:LPR3;

    invoke-virtual {v0}, Lkotlin/collections/AbstractMutableList;->size()I

    move-result v0

    invoke-virtual {p0, v0}, LK0;->f(I)V

    iget-object v0, p0, LRR3;->d:LPR3;

    invoke-virtual {v0}, LPR3;->c()I

    move-result v0

    iput v0, p0, LRR3;->e:I

    const/4 v0, -0x1

    iput v0, p0, LRR3;->g:I

    invoke-virtual {p0}, LRR3;->j()V

    return-void
.end method

.method public final j()V
    .locals 5

    iget-object v0, p0, LRR3;->d:LPR3;

    invoke-virtual {v0}, LPR3;->e()[Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LRR3;->f:Lpa6;

    return-void

    :cond_0
    iget-object v1, p0, LRR3;->d:LPR3;

    invoke-virtual {v1}, Lkotlin/collections/AbstractMutableList;->size()I

    move-result v1

    invoke-static {v1}, LUi6;->d(I)I

    move-result v1

    invoke-virtual {p0}, LK0;->c()I

    move-result v2

    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v2

    iget-object v3, p0, LRR3;->d:LPR3;

    invoke-virtual {v3}, LPR3;->f()I

    move-result v3

    div-int/lit8 v3, v3, 0x5

    add-int/lit8 v3, v3, 0x1

    iget-object v4, p0, LRR3;->f:Lpa6;

    if-nez v4, :cond_1

    new-instance v4, Lpa6;

    invoke-direct {v4, v0, v2, v1, v3}, Lpa6;-><init>([Ljava/lang/Object;III)V

    iput-object v4, p0, LRR3;->f:Lpa6;

    goto :goto_0

    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v4, v0, v2, v1, v3}, Lpa6;->j([Ljava/lang/Object;III)V

    :goto_0
    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, LRR3;->g()V

    invoke-virtual {p0}, LK0;->a()V

    invoke-virtual {p0}, LK0;->c()I

    move-result v0

    iput v0, p0, LRR3;->g:I

    iget-object v0, p0, LRR3;->f:Lpa6;

    if-nez v0, :cond_0

    iget-object v0, p0, LRR3;->d:LPR3;

    invoke-virtual {v0}, LPR3;->h()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LK0;->c()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, v2}, LK0;->e(I)V

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    invoke-virtual {v0}, LK0;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LK0;->c()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, LK0;->e(I)V

    invoke-virtual {v0}, Lpa6;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, LRR3;->d:LPR3;

    invoke-virtual {v1}, LPR3;->h()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, LK0;->c()I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p0, v3}, LK0;->e(I)V

    invoke-virtual {v0}, LK0;->d()I

    move-result v0

    sub-int/2addr v2, v0

    aget-object v0, v1, v2

    return-object v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, LRR3;->g()V

    invoke-virtual {p0}, LK0;->b()V

    invoke-virtual {p0}, LK0;->c()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LRR3;->g:I

    iget-object v0, p0, LRR3;->f:Lpa6;

    if-nez v0, :cond_0

    iget-object v0, p0, LRR3;->d:LPR3;

    invoke-virtual {v0}, LPR3;->h()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LK0;->c()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, LK0;->e(I)V

    invoke-virtual {p0}, LK0;->c()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    invoke-virtual {p0}, LK0;->c()I

    move-result v1

    invoke-virtual {v0}, LK0;->d()I

    move-result v2

    if-le v1, v2, :cond_1

    iget-object v1, p0, LRR3;->d:LPR3;

    invoke-virtual {v1}, LPR3;->h()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, LK0;->c()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0, v2}, LK0;->e(I)V

    invoke-virtual {p0}, LK0;->c()I

    move-result v2

    invoke-virtual {v0}, LK0;->d()I

    move-result v0

    sub-int/2addr v2, v0

    aget-object v0, v1, v2

    return-object v0

    :cond_1
    invoke-virtual {p0}, LK0;->c()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, LK0;->e(I)V

    invoke-virtual {v0}, Lpa6;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    invoke-virtual {p0}, LRR3;->g()V

    invoke-virtual {p0}, LRR3;->h()V

    iget-object v0, p0, LRR3;->d:LPR3;

    iget v1, p0, LRR3;->g:I

    invoke-virtual {v0, v1}, Lkotlin/collections/AbstractMutableList;->remove(I)Ljava/lang/Object;

    iget v0, p0, LRR3;->g:I

    invoke-virtual {p0}, LK0;->c()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, LRR3;->g:I

    invoke-virtual {p0, v0}, LK0;->e(I)V

    :cond_0
    invoke-virtual {p0}, LRR3;->i()V

    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0}, LRR3;->g()V

    invoke-virtual {p0}, LRR3;->h()V

    iget-object v0, p0, LRR3;->d:LPR3;

    iget v1, p0, LRR3;->g:I

    invoke-virtual {v0, v1, p1}, LPR3;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LRR3;->d:LPR3;

    invoke-virtual {p1}, LPR3;->c()I

    move-result p1

    iput p1, p0, LRR3;->e:I

    invoke-virtual {p0}, LRR3;->j()V

    return-void
.end method
