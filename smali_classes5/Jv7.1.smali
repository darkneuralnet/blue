.class public final LJv7;
.super LMs7;
.source "SourceFile"


# instance fields
.field public final b:LLv7;

.field public c:LOs7;

.field public final synthetic d:LMv7;


# direct methods
.method public constructor <init>(LMv7;)V
    .locals 2

    iput-object p1, p0, LJv7;->d:LMv7;

    invoke-direct {p0}, LMs7;-><init>()V

    new-instance v0, LLv7;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LLv7;-><init>(Lkt7;LJv7;)V

    iput-object v0, p0, LJv7;->b:LLv7;

    invoke-virtual {p0}, LJv7;->a()LOs7;

    move-result-object p1

    iput-object p1, p0, LJv7;->c:LOs7;

    return-void
.end method


# virtual methods
.method public final a()LOs7;
    .locals 2

    iget-object v0, p0, LJv7;->b:LLv7;

    invoke-virtual {v0}, LLv7;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LLv7;->a()Lht7;

    move-result-object v0

    invoke-virtual {v0}, Lkt7;->A()LOs7;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, LJv7;->c:LOs7;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()B
    .locals 2

    iget-object v0, p0, LJv7;->c:LOs7;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LOs7;->zza()B

    move-result v0

    iget-object v1, p0, LJv7;->c:LOs7;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, LJv7;->a()LOs7;

    move-result-object v1

    iput-object v1, p0, LJv7;->c:LOs7;

    :cond_0
    return v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
