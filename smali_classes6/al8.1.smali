.class public final Lal8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LNp9;",
        ">",
        "Ljava/lang/Object;",
        "Lk69<",
        "Lzj8<",
        "TT;>;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LNj8<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LNj8<",
            "TT;>;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lal8;->a:Ljava/util/List;

    iput-object p2, p0, Lal8;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static a(Ljava/util/List;Ljava/util/concurrent/Executor;)Lal8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LNp9;",
            ">(",
            "Ljava/util/List<",
            "LNj8<",
            "TT;>;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lal8<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lal8;

    invoke-direct {v0, p0, p1}, Lal8;-><init>(Ljava/util/List;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic b(LNp9;ILjava/util/List;)LMb9;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p1}, Lva9;->f(Ljava/lang/Object;)LMb9;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Future;

    invoke-static {v1}, Lva9;->l(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lal8;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LNj8;

    new-instance v2, Lnk8;

    invoke-direct {v2, v1}, Lnk8;-><init>(LNj8;)V

    invoke-static {v2}, LKD8;->c(Lk69;)Lk69;

    move-result-object v1

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object p1
.end method

.method public final synthetic c(Ljava/util/List;ILNp9;)LMb9;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p1}, Lva9;->a(Ljava/lang/Iterable;)Lha9;

    move-result-object v0

    new-instance v1, Lak8;

    invoke-direct {v1, p0, p3, p2, p1}, Lak8;-><init>(Lal8;LNp9;ILjava/util/List;)V

    invoke-static {v1}, LKD8;->b(Lc69;)Lc69;

    move-result-object p1

    iget-object p2, p0, Lal8;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, p1, p2}, Lha9;->b(Lc69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic d(ILjava/util/List;Ljava/lang/Object;)LMb9;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Future;

    invoke-static {v1}, Lva9;->l(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lal8;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LNj8;

    invoke-interface {v1}, LNj8;->zza()LMb9;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p3}, Lva9;->b(Ljava/lang/Iterable;)Lha9;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2}, LA69;->a(Ljava/lang/Object;)Ljava/util/concurrent/Callable;

    move-result-object p2

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lha9;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic zza(Ljava/lang/Object;)LMb9;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lzj8;

    iget-object v0, p0, Lal8;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p0, Lal8;->a:Ljava/util/List;

    check-cast v2, LZP8;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, LZP8;->C(I)LnU8;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LNj8;

    invoke-interface {v3}, LNj8;->zzb()LMb9;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, LNk8;

    invoke-direct {v2, p0, v1, v0}, LNk8;-><init>(Lal8;Ljava/util/List;I)V

    invoke-static {v2}, LKD8;->c(Lk69;)Lk69;

    move-result-object v2

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-interface {p1, v2, v3}, Lzj8;->a(Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    new-instance v2, LAk8;

    invoke-direct {v2, p0, v0, v1}, LAk8;-><init>(Lal8;ILjava/util/List;)V

    invoke-static {v2}, LKD8;->c(Lk69;)Lk69;

    move-result-object v0

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    return-object p1
.end method
