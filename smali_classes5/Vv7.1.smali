.class public final LVv7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public b:I

.field public c:Z

.field public d:Ljava/util/Iterator;

.field public final synthetic e:LXv7;


# direct methods
.method public synthetic constructor <init>(LXv7;LQv7;)V
    .locals 0

    iput-object p1, p0, LVv7;->e:LXv7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, LVv7;->b:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LVv7;->d:Ljava/util/Iterator;

    if-nez v0, :cond_0

    iget-object v0, p0, LVv7;->e:LXv7;

    invoke-static {v0}, LXv7;->h(LXv7;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, LVv7;->d:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, LVv7;->d:Ljava/util/Iterator;

    return-object v0
.end method

.method public final hasNext()Z
    .locals 3

    iget v0, p0, LVv7;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, LVv7;->e:LXv7;

    invoke-static {v2}, LXv7;->f(LXv7;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v0, v2, :cond_2

    iget-object v0, p0, LVv7;->e:LXv7;

    invoke-static {v0}, LXv7;->h(LXv7;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LVv7;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LVv7;->c:Z

    iget v1, p0, LVv7;->b:I

    add-int/2addr v1, v0

    iput v1, p0, LVv7;->b:I

    iget-object v0, p0, LVv7;->e:LXv7;

    invoke-static {v0}, LXv7;->f(LXv7;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, LVv7;->e:LXv7;

    invoke-static {v0}, LXv7;->f(LXv7;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, LVv7;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LVv7;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    :goto_0
    return-object v0
.end method

.method public final remove()V
    .locals 3

    iget-boolean v0, p0, LVv7;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, LVv7;->c:Z

    iget-object v0, p0, LVv7;->e:LXv7;

    invoke-static {v0}, LXv7;->i(LXv7;)V

    iget v0, p0, LVv7;->b:I

    iget-object v1, p0, LVv7;->e:LXv7;

    invoke-static {v1}, LXv7;->f(LXv7;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, LVv7;->e:LXv7;

    iget v1, p0, LVv7;->b:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, LVv7;->b:I

    invoke-static {v0, v1}, LXv7;->d(LXv7;I)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {p0}, LVv7;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() was called before next()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
