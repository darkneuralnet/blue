.class public abstract Lcom/google/ar/sceneform/rendering/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/ar/sceneform/rendering/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/ar/sceneform/rendering/d;",
        "B:",
        "Lcom/google/ar/sceneform/rendering/d$a<",
        "TT;TB;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Landroid/content/Context;

.field public c:Landroid/net/Uri;

.field public d:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lcom/google/ar/sceneform/rendering/e;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field public j:[B

.field public k:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d$a;->a:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d$a;->b:Landroid/content/Context;

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d$a;->c:Landroid/net/Uri;

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d$a;->d:Ljava/util/concurrent/Callable;

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d$a;->e:Lcom/google/ar/sceneform/rendering/e;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/ar/sceneform/rendering/d$a;->f:Z

    iput-boolean v1, p0, Lcom/google/ar/sceneform/rendering/d$a;->g:Z

    iput-boolean v1, p0, Lcom/google/ar/sceneform/rendering/d$a;->h:Z

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d$a;->i:Ljava/util/function/Function;

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/d$a;->j:[B

    const/16 v0, 0x18

    iput v0, p0, Lcom/google/ar/sceneform/rendering/d$a;->k:I

    return-void
.end method

.method public static synthetic a(Lcom/google/ar/sceneform/rendering/d$a;Lcom/google/ar/sceneform/rendering/d;)Lcom/google/ar/sceneform/rendering/d;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/ar/sceneform/rendering/d$a;->n(Lcom/google/ar/sceneform/rendering/d;)Lcom/google/ar/sceneform/rendering/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/google/ar/sceneform/rendering/d$a;Lcom/google/ar/sceneform/rendering/d;)Lcom/google/ar/sceneform/rendering/d;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/ar/sceneform/rendering/d$a;->o(Lcom/google/ar/sceneform/rendering/d;)Lcom/google/ar/sceneform/rendering/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/google/ar/sceneform/rendering/d$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/ar/sceneform/rendering/d$a;->g:Z

    return p0
.end method

.method public static synthetic d(Lcom/google/ar/sceneform/rendering/d$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/ar/sceneform/rendering/d$a;->f:Z

    return p0
.end method

.method public static synthetic e(Lcom/google/ar/sceneform/rendering/d$a;)Lcom/google/ar/sceneform/rendering/e;
    .locals 0

    iget-object p0, p0, Lcom/google/ar/sceneform/rendering/d$a;->e:Lcom/google/ar/sceneform/rendering/e;

    return-object p0
.end method

.method public static synthetic f(Lcom/google/ar/sceneform/rendering/d$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/ar/sceneform/rendering/d$a;->h:Z

    return p0
.end method

.method public static synthetic g(Lcom/google/ar/sceneform/rendering/d$a;)I
    .locals 0

    iget p0, p0, Lcom/google/ar/sceneform/rendering/d$a;->k:I

    return p0
.end method

.method private synthetic n(Lcom/google/ar/sceneform/rendering/d;)Lcom/google/ar/sceneform/rendering/d;
    .locals 1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d$a;->j()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->p()Lcom/google/ar/sceneform/rendering/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/ar/sceneform/rendering/d;

    return-object p1
.end method

.method private synthetic o(Lcom/google/ar/sceneform/rendering/d;)Lcom/google/ar/sceneform/rendering/d;
    .locals 1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d$a;->j()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->p()Lcom/google/ar/sceneform/rendering/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/ar/sceneform/rendering/d;

    return-object p1
.end method


# virtual methods
.method public h()Ljava/util/concurrent/CompletableFuture;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/CompletableFuture<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "\'"

    const-string v1, "Unable to load Renderable registryId=\'"

    :try_start_0
    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d$a;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Lcom/google/ar/sceneform/rendering/d$a;->a:Ljava/lang/Object;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d$a;->k()LrM4;

    move-result-object v3

    invoke-virtual {v3, v2}, LrM4;->c(Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v0, Lmx4;

    invoke-direct {v0, p0}, Lmx4;-><init>(Lcom/google/ar/sceneform/rendering/d$a;)V

    invoke-virtual {v3, v0}, Ljava/util/concurrent/CompletableFuture;->thenApply(Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d$a;->r()Lcom/google/ar/sceneform/rendering/d;

    move-result-object v3

    iget-object v4, p0, Lcom/google/ar/sceneform/rendering/d$a;->e:Lcom/google/ar/sceneform/rendering/e;

    if-eqz v4, :cond_1

    invoke-static {v3}, Ljava/util/concurrent/CompletableFuture;->completedFuture(Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v4, p0, Lcom/google/ar/sceneform/rendering/d$a;->d:Ljava/util/concurrent/Callable;

    if-nez v4, :cond_2

    new-instance v3, Ljava/util/concurrent/CompletableFuture;

    invoke-direct {v3}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    new-instance v4, Ljava/lang/AssertionError;

    const-string v5, "Input Stream Creator is null."

    invoke-direct {v4, v5}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d$a;->j()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v3, v0}, LFA1;->c(Ljava/lang/String;Ljava/util/concurrent/CompletableFuture;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;

    return-object v3

    :cond_2
    iget-boolean v4, p0, Lcom/google/ar/sceneform/rendering/d$a;->g:Z

    const-string v5, "Gltf Renderable.Builder must have a valid context."

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/google/ar/sceneform/rendering/d$a;->b:Landroid/content/Context;

    if-eqz v4, :cond_3

    invoke-virtual {p0, v4, v3}, Lcom/google/ar/sceneform/rendering/d$a;->p(Landroid/content/Context;Lcom/google/ar/sceneform/rendering/d;)Ljava/util/concurrent/CompletableFuture;

    move-result-object v3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v5}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_4
    iget-boolean v4, p0, Lcom/google/ar/sceneform/rendering/d$a;->f:Z

    if-eqz v4, :cond_6

    iget-object v4, p0, Lcom/google/ar/sceneform/rendering/d$a;->b:Landroid/content/Context;

    if-eqz v4, :cond_5

    iget-object v5, p0, Lcom/google/ar/sceneform/rendering/d$a;->j:[B

    invoke-virtual {p0, v4, v3, v5}, Lcom/google/ar/sceneform/rendering/d$a;->q(Landroid/content/Context;Lcom/google/ar/sceneform/rendering/d;[B)Ljava/util/concurrent/CompletableFuture;

    move-result-object v3

    goto :goto_0

    :cond_5
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v5}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_6
    const/4 v3, 0x0

    :goto_0
    if-eqz v2, :cond_7

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d$a;->k()LrM4;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, LrM4;->e(Ljava/lang/Object;Ljava/util/concurrent/CompletableFuture;)V

    :cond_7
    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d$a;->j()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v3, v0}, LFA1;->c(Ljava/lang/String;Ljava/util/concurrent/CompletableFuture;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;

    new-instance v0, Lnx4;

    invoke-direct {v0, p0}, Lnx4;-><init>(Lcom/google/ar/sceneform/rendering/d$a;)V

    invoke-virtual {v3, v0}, Ljava/util/concurrent/CompletableFuture;->thenApply(Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v2

    new-instance v3, Ljava/util/concurrent/CompletableFuture;

    invoke-direct {v3}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d$a;->j()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/d$a;->a:Ljava/lang/Object;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v0}, LFA1;->c(Ljava/lang/String;Ljava/util/concurrent/CompletableFuture;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;

    return-object v3
.end method

.method public i()V
    .locals 2

    invoke-static {}, Lzd;->c()V

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d$a;->m()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "ModelRenderable must have a source."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public abstract j()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract k()LrM4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LrM4<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract l()Lcom/google/ar/sceneform/rendering/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TB;"
        }
    .end annotation
.end method

.method public m()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d$a;->c:Landroid/net/Uri;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d$a;->d:Ljava/util/concurrent/Callable;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d$a;->e:Lcom/google/ar/sceneform/rendering/e;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final p(Landroid/content/Context;Lcom/google/ar/sceneform/rendering/d;)Ljava/util/concurrent/CompletableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)",
            "Ljava/util/concurrent/CompletableFuture<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lnt2;

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/d$a;->c:Landroid/net/Uri;

    invoke-static {v1}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    iget-object v2, p0, Lcom/google/ar/sceneform/rendering/d$a;->i:Ljava/util/function/Function;

    invoke-direct {v0, p2, p1, v1, v2}, Lnt2;-><init>(Lcom/google/ar/sceneform/rendering/d;Landroid/content/Context;Landroid/net/Uri;Ljava/util/function/Function;)V

    iget-object p1, p0, Lcom/google/ar/sceneform/rendering/d$a;->d:Ljava/util/concurrent/Callable;

    invoke-static {p1}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Callable;

    invoke-virtual {v0, p1}, Lnt2;->d(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/CompletableFuture;

    move-result-object p1

    return-object p1
.end method

.method public final q(Landroid/content/Context;Lcom/google/ar/sceneform/rendering/d;[B)Ljava/util/concurrent/CompletableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;[B)",
            "Ljava/util/concurrent/CompletableFuture<",
            "TT;>;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract r()Lcom/google/ar/sceneform/rendering/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public s(Lcom/google/ar/sceneform/rendering/e;)Lcom/google/ar/sceneform/rendering/d$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/ar/sceneform/rendering/e;",
            ")TB;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/d$a;->e:Lcom/google/ar/sceneform/rendering/e;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/d$a;->a:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/d$a;->c:Landroid/net/Uri;

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d$a;->l()Lcom/google/ar/sceneform/rendering/d$a;

    move-result-object p1

    return-object p1
.end method
