.class public LOb1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llb1$a;
.implements LZd3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOb1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LZd3$a<",
            "-",
            "Ll30;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ll30;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "LO22;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic d:LOb1;


# direct methods
.method public constructor <init>(LOb1;)V
    .locals 0

    iput-object p1, p0, LOb1$d;->d:LOb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LOb1$d;->a:Ljava/util/Map;

    sget-object p1, Ll30;->c:Ll30;

    iput-object p1, p0, LOb1$d;->b:Ll30;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LOb1$d;->c:Ljava/util/List;

    return-void
.end method

.method public static synthetic e(LOb1$d;LZd3$a;)V
    .locals 0

    invoke-direct {p0, p1}, LOb1$d;->o(LZd3$a;)V

    return-void
.end method

.method public static synthetic f(LOb1$d;LZd3$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LOb1$d;->l(LZd3$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic g(Ljava/util/Map$Entry;Ll30;)V
    .locals 0

    invoke-static {p0, p1}, LOb1$d;->p(Ljava/util/Map$Entry;Ll30;)V

    return-void
.end method

.method public static synthetic h(LZd3$a;Ll30;)V
    .locals 0

    invoke-static {p0, p1}, LOb1$d;->k(LZd3$a;Ll30;)V

    return-void
.end method

.method public static synthetic i(LOb1$d;LO80$a;)V
    .locals 0

    invoke-direct {p0, p1}, LOb1$d;->m(LO80$a;)V

    return-void
.end method

.method public static synthetic j(LOb1$d;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LOb1$d;->n(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(LZd3$a;Ll30;)V
    .locals 0

    invoke-interface {p0, p1}, LZd3$a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic l(LZd3$a;Ljava/util/concurrent/Executor;)V
    .locals 3

    iget-object v0, p0, LOb1$d;->a:Ljava/util/Map;

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZd3$a;

    invoke-static {p2}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LOb1$d;->b:Ll30;

    new-instance v1, LPb1;

    invoke-direct {v1, p1, v0}, LPb1;-><init>(LZd3$a;Ll30;)V

    invoke-interface {p2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic m(LO80$a;)V
    .locals 1

    iget-object v0, p0, LOb1$d;->b:Ll30;

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic n(LO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LOb1$d;->d:LOb1;

    iget-object v0, v0, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v1, LQb1;

    invoke-direct {v1, p0, p1}, LQb1;-><init>(LOb1$d;LO80$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "fetchData"

    return-object p1
.end method

.method private synthetic o(LZd3$a;)V
    .locals 1

    iget-object v0, p0, LOb1$d;->a:Ljava/util/Map;

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic p(Ljava/util/Map$Entry;Ll30;)V
    .locals 0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LZd3$a;

    invoke-interface {p0, p1}, LZd3$a;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b(LZd3$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd3$a<",
            "-",
            "Ll30;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LOb1$d;->d:LOb1;

    iget-object v0, v0, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v1, LSb1;

    invoke-direct {v1, p0, p1}, LSb1;-><init>(LOb1$d;LZd3$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Ljava/util/concurrent/Executor;LZd3$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "LZd3$a<",
            "-",
            "Ll30;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LOb1$d;->d:LOb1;

    iget-object v0, v0, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v1, LUb1;

    invoke-direct {v1, p0, p2, p1}, LUb1;-><init>(LOb1$d;LZd3$a;Ljava/util/concurrent/Executor;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ll30;",
            ">;"
        }
    .end annotation

    new-instance v0, LTb1;

    invoke-direct {v0, p0}, LTb1;-><init>(LOb1$d;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public q(Z)V
    .locals 4

    if-eqz p1, :cond_0

    sget-object p1, Ll30;->b:Ll30;

    goto :goto_0

    :cond_0
    sget-object p1, Ll30;->c:Ll30;

    :goto_0
    iget-object v0, p0, LOb1$d;->b:Ll30;

    if-ne v0, p1, :cond_1

    return-void

    :cond_1
    iput-object p1, p0, LOb1$d;->b:Ll30;

    sget-object v0, Ll30;->c:Ll30;

    if-ne p1, v0, :cond_3

    iget-object v0, p0, LOb1$d;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/common/util/concurrent/ListenableFuture;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_1

    :cond_2
    iget-object v0, p0, LOb1$d;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_3
    iget-object v0, p0, LOb1$d;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    :try_start_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    new-instance v3, LRb1;

    invoke-direct {v3, v1, p1}, LRb1;-><init>(Ljava/util/Map$Entry;Ll30;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    iget-object v2, p0, LOb1$d;->d:LOb1;

    iget-object v2, v2, LOb1;->a:Ljava/lang/String;

    const-string v3, "Unable to post to the supplied executor."

    invoke-static {v2, v3, v1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    return-void
.end method
