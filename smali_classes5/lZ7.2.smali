.class public abstract LlZ7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public b:LzZ7;

.field public c:LzZ7;

.field public d:I

.field public final synthetic e:LNZ7;


# direct methods
.method public constructor <init>(LNZ7;)V
    .locals 1

    iput-object p1, p0, LlZ7;->e:LNZ7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, LNZ7;->f:LzZ7;

    iget-object v0, v0, LzZ7;->e:LzZ7;

    iput-object v0, p0, LlZ7;->b:LzZ7;

    const/4 v0, 0x0

    iput-object v0, p0, LlZ7;->c:LzZ7;

    iget p1, p1, LNZ7;->e:I

    iput p1, p0, LlZ7;->d:I

    return-void
.end method


# virtual methods
.method public final a()LzZ7;
    .locals 3

    iget-object v0, p0, LlZ7;->b:LzZ7;

    iget-object v1, p0, LlZ7;->e:LNZ7;

    iget-object v2, v1, LNZ7;->f:LzZ7;

    if-eq v0, v2, :cond_1

    iget v1, v1, LNZ7;->e:I

    iget v2, p0, LlZ7;->d:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, LzZ7;->e:LzZ7;

    iput-object v1, p0, LlZ7;->b:LzZ7;

    iput-object v0, p0, LlZ7;->c:LzZ7;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, LlZ7;->b:LzZ7;

    iget-object v1, p0, LlZ7;->e:LNZ7;

    iget-object v1, v1, LNZ7;->f:LzZ7;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, LlZ7;->c:LzZ7;

    if-eqz v0, :cond_0

    iget-object v1, p0, LlZ7;->e:LNZ7;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LNZ7;->e(LzZ7;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, LlZ7;->c:LzZ7;

    iget-object v0, p0, LlZ7;->e:LNZ7;

    iget v0, v0, LNZ7;->e:I

    iput v0, p0, LlZ7;->d:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
