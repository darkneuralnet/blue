.class public final LJY2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lkotlin/jvm/internal/markers/KMutableIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJY2;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "LHY2;",
        ">;",
        "Lkotlin/jvm/internal/markers/KMutableIterator;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "JY2$b",
        "",
        "LHY2;",
        "",
        "hasNext",
        "a",
        "",
        "remove",
        "",
        "b",
        "I",
        "index",
        "c",
        "Z",
        "wentToNext",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public b:I

.field public c:Z

.field public final synthetic d:LJY2;


# direct methods
.method public constructor <init>(LJY2;)V
    .locals 0

    iput-object p1, p0, LJY2$b;->d:LJY2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, LJY2$b;->b:I

    return-void
.end method


# virtual methods
.method public a()LHY2;
    .locals 3

    invoke-virtual {p0}, LJY2$b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LJY2$b;->c:Z

    iget-object v1, p0, LJY2$b;->d:LJY2;

    invoke-virtual {v1}, LJY2;->L()LLN5;

    move-result-object v1

    iget v2, p0, LJY2$b;->b:I

    add-int/2addr v2, v0

    iput v2, p0, LJY2$b;->b:I

    invoke-virtual {v1, v2}, LLN5;->t(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "nodes.valueAt(++index)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LHY2;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 3

    iget v0, p0, LJY2$b;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, LJY2$b;->d:LJY2;

    invoke-virtual {v2}, LJY2;->L()LLN5;

    move-result-object v2

    invoke-virtual {v2}, LLN5;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJY2$b;->a()LHY2;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 3

    iget-boolean v0, p0, LJY2$b;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LJY2$b;->d:LJY2;

    invoke-virtual {v0}, LJY2;->L()LLN5;

    move-result-object v0

    iget v1, p0, LJY2$b;->b:I

    invoke-virtual {v0, v1}, LLN5;->t(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHY2;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LHY2;->C(LJY2;)V

    iget v1, p0, LJY2$b;->b:I

    invoke-virtual {v0, v1}, LLN5;->q(I)V

    iget v0, p0, LJY2$b;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LJY2$b;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, LJY2$b;->c:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call next() before you can remove an element"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
