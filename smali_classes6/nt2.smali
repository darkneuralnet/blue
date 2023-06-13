.class public Lnt2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/ar/sceneform/rendering/d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/String; = "nt2"


# instance fields
.field public final a:Lcom/google/ar/sceneform/rendering/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/ar/sceneform/rendering/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/google/ar/sceneform/rendering/d;Landroid/content/Context;Landroid/net/Uri;Ljava/util/function/Function;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Ljava/util/function/Function<",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnt2;->a:Lcom/google/ar/sceneform/rendering/d;

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->l()Lcom/google/ar/sceneform/rendering/a;

    move-result-object v0

    instance-of v1, v0, Lcom/google/ar/sceneform/rendering/g;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/ar/sceneform/rendering/g;

    iput-object v0, p0, Lnt2;->b:Lcom/google/ar/sceneform/rendering/g;

    new-instance v1, Lmt2;

    invoke-direct {v1, p3, p4}, Lmt2;-><init>(Landroid/net/Uri;Ljava/util/function/Function;)V

    iput-object v1, v0, Lcom/google/ar/sceneform/rendering/g;->d:Ljava/util/function/Function;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, v0, Lcom/google/ar/sceneform/rendering/g;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->f()LDh0;

    move-result-object p1

    invoke-virtual {p1}, LDh0;->d()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Expected task type "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lnt2;->c:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Ljava/util/concurrent/Callable;)[B
    .locals 0

    invoke-static {p0}, Lnt2;->f(Ljava/util/concurrent/Callable;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/net/Uri;Ljava/util/function/Function;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    invoke-static {p0, p1, p2}, Lnt2;->h(Landroid/net/Uri;Ljava/util/function/Function;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lnt2;[B)Lcom/google/ar/sceneform/rendering/d;
    .locals 0

    invoke-direct {p0, p1}, Lnt2;->g([B)Lcom/google/ar/sceneform/rendering/d;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/net/Uri;Ljava/lang/String;Ljava/util/function/Function;)Landroid/net/Uri;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Ljava/util/function/Function<",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ">;)",
            "Landroid/net/Uri;"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/Uri;

    return-object p0

    :cond_0
    const-string p2, "/"

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_1
    invoke-static {p1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p0

    const-string p2, ".."

    invoke-virtual {p0, p2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p0

    invoke-virtual {p0}, Ljava/net/URI;->normalize()Ljava/net/URI;

    move-result-object p0

    invoke-virtual {p0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    new-array p2, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    const-string p1, "Resource path contains a scheme but should be relative, uri: (%s)"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method public static synthetic f(Ljava/util/concurrent/Callable;)[B
    .locals 1

    :try_start_0
    invoke-static {p0}, Ltm5;->b(Ljava/util/concurrent/Callable;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/util/concurrent/CompletionException;

    invoke-direct {v0, p0}, Ljava/util/concurrent/CompletionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private synthetic g([B)Lcom/google/ar/sceneform/rendering/d;
    .locals 5

    iget-object v0, p0, Lnt2;->b:Lcom/google/ar/sceneform/rendering/g;

    const/4 v1, 0x0

    aget-byte v2, p1, v1

    const/16 v3, 0x67

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    aget-byte v3, p1, v2

    const/16 v4, 0x6c

    if-ne v3, v4, :cond_0

    const/4 v3, 0x2

    aget-byte v3, p1, v3

    const/16 v4, 0x54

    if-ne v3, v4, :cond_0

    const/4 v3, 0x3

    aget-byte v3, p1, v3

    const/16 v4, 0x46

    if-ne v3, v4, :cond_0

    move v1, v2

    :cond_0
    iput-boolean v1, v0, Lcom/google/ar/sceneform/rendering/g;->c:Z

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, v0, Lcom/google/ar/sceneform/rendering/g;->b:Ljava/nio/Buffer;

    iget-object p1, p0, Lnt2;->a:Lcom/google/ar/sceneform/rendering/d;

    return-object p1
.end method

.method public static synthetic h(Landroid/net/Uri;Ljava/util/function/Function;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    invoke-static {p0, p2, p1}, Lnt2;->e(Landroid/net/Uri;Ljava/lang/String;Ljava/util/function/Function;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/CompletableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;)",
            "Ljava/util/concurrent/CompletableFuture<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lkt2;

    invoke-direct {v0, p1}, Lkt2;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {}, LB36;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/concurrent/CompletableFuture;->supplyAsync(Ljava/util/function/Supplier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;

    move-result-object p1

    new-instance v0, Llt2;

    invoke-direct {v0, p0}, Llt2;-><init>(Lnt2;)V

    invoke-static {}, LB36;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/CompletableFuture;->thenApplyAsync(Ljava/util/function/Function;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;

    move-result-object p1

    return-object p1
.end method
