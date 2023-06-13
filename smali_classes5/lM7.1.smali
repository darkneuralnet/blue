.class public abstract LlM7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public b:I

.field public c:I

.field public d:I

.field public final synthetic e:LzN7;


# direct methods
.method public synthetic constructor <init>(LzN7;LVL7;)V
    .locals 0

    iput-object p1, p0, LlM7;->e:LzN7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LzN7;->a(LzN7;)I

    move-result p2

    iput p2, p0, LlM7;->b:I

    invoke-virtual {p1}, LzN7;->e()I

    move-result p1

    iput p1, p0, LlM7;->c:I

    const/4 p1, -0x1

    iput p1, p0, LlM7;->d:I

    return-void
.end method


# virtual methods
.method public abstract a(I)Ljava/lang/Object;
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, LlM7;->e:LzN7;

    invoke-static {v0}, LzN7;->a(LzN7;)I

    move-result v0

    iget v1, p0, LlM7;->b:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 1

    iget v0, p0, LlM7;->c:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LlM7;->b()V

    invoke-virtual {p0}, LlM7;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LlM7;->c:I

    iput v0, p0, LlM7;->d:I

    invoke-virtual {p0, v0}, LlM7;->a(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LlM7;->e:LzN7;

    iget v2, p0, LlM7;->c:I

    invoke-virtual {v1, v2}, LzN7;->f(I)I

    move-result v1

    iput v1, p0, LlM7;->c:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 3

    invoke-virtual {p0}, LlM7;->b()V

    iget v0, p0, LlM7;->d:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "no calls to next() since the last call to remove()"

    invoke-static {v0, v1}, LNt7;->d(ZLjava/lang/Object;)V

    iget v0, p0, LlM7;->b:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, LlM7;->b:I

    iget-object v0, p0, LlM7;->e:LzN7;

    iget v1, p0, LlM7;->d:I

    iget-object v2, v0, LzN7;->d:[Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    aget-object v1, v2, v1

    invoke-virtual {v0, v1}, LzN7;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, LlM7;->c:I

    const/4 v1, -0x1

    add-int/2addr v0, v1

    iput v0, p0, LlM7;->c:I

    iput v1, p0, LlM7;->d:I

    return-void
.end method
