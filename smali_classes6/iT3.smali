.class public LiT3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LiT3$e;,
        LiT3$b;,
        LiT3$c;,
        LiT3$f;,
        LiT3$g;,
        LiT3$d;
    }
.end annotation


# static fields
.field public static final o:Landroid/os/Handler;

.field public static volatile p:LiT3;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# instance fields
.field public final a:LiT3$g;

.field public final b:LiT3$c;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LPI4;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Landroid/content/Context;

.field public final e:LQ41;

.field public final f:La80;

.field public final g:LlQ5;

.field public final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lz2;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/widget/ImageView;",
            "LkZ0;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Landroid/graphics/Bitmap$Config;

.field public l:Z

.field public volatile m:Z

.field public n:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LiT3$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, LiT3$a;-><init>(Landroid/os/Looper;)V

    sput-object v0, LiT3;->o:Landroid/os/Handler;

    const/4 v0, 0x0

    sput-object v0, LiT3;->p:LiT3;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LQ41;La80;LiT3$d;LiT3$g;Ljava/util/List;LlQ5;Landroid/graphics/Bitmap$Config;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LQ41;",
            "La80;",
            "LiT3$d;",
            "LiT3$g;",
            "Ljava/util/List<",
            "LPI4;",
            ">;",
            "LlQ5;",
            "Landroid/graphics/Bitmap$Config;",
            "ZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiT3;->d:Landroid/content/Context;

    iput-object p2, p0, LiT3;->e:LQ41;

    iput-object p3, p0, LiT3;->f:La80;

    iput-object p5, p0, LiT3;->a:LiT3$g;

    iput-object p8, p0, LiT3;->k:Landroid/graphics/Bitmap$Config;

    if-eqz p6, :cond_0

    invoke-interface {p6}, Ljava/util/List;->size()I

    move-result p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    new-instance p4, Ljava/util/ArrayList;

    add-int/lit8 p3, p3, 0x7

    invoke-direct {p4, p3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance p3, LsM4;

    invoke-direct {p3, p1}, LsM4;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p6, :cond_1

    invoke-interface {p4, p6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    new-instance p3, Ltz0;

    invoke-direct {p3, p1}, Ltz0;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, LIP2;

    invoke-direct {p3, p1}, LIP2;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, LGA0;

    invoke-direct {p3, p1}, LGA0;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, LYo;

    invoke-direct {p3, p1}, LYo;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lql1;

    invoke-direct {p3, p1}, Lql1;-><init>(Landroid/content/Context;)V

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, LK73;

    iget-object p2, p2, LQ41;->d:Lb61;

    invoke-direct {p1, p2, p7}, LK73;-><init>(Lb61;LlQ5;)V

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LiT3;->c:Ljava/util/List;

    iput-object p7, p0, LiT3;->g:LlQ5;

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, LiT3;->h:Ljava/util/Map;

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, LiT3;->i:Ljava/util/Map;

    iput-boolean p9, p0, LiT3;->l:Z

    iput-boolean p10, p0, LiT3;->m:Z

    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, LiT3;->j:Ljava/lang/ref/ReferenceQueue;

    new-instance p2, LiT3$c;

    sget-object p3, LiT3;->o:Landroid/os/Handler;

    invoke-direct {p2, p1, p3}, LiT3$c;-><init>(Ljava/lang/ref/ReferenceQueue;Landroid/os/Handler;)V

    iput-object p2, p0, LiT3;->b:LiT3$c;

    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static h()LiT3;
    .locals 3

    sget-object v0, LiT3;->p:LiT3;

    if-nez v0, :cond_2

    const-class v0, LiT3;

    monitor-enter v0

    :try_start_0
    sget-object v1, LiT3;->p:LiT3;

    if-nez v1, :cond_1

    sget-object v1, Lcom/squareup/picasso/PicassoProvider;->b:Landroid/content/Context;

    if-eqz v1, :cond_0

    new-instance v2, LiT3$b;

    invoke-direct {v2, v1}, LiT3$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, LiT3$b;->a()LiT3;

    move-result-object v1

    sput-object v1, LiT3;->p:LiT3;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "context == null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_1
    sget-object v0, LiT3;->p:LiT3;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, LFi6;->c()V

    iget-object v0, p0, LiT3;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lz2;->a()V

    iget-object v1, p0, LiT3;->e:LQ41;

    invoke-virtual {v1, v0}, LQ41;->c(Lz2;)V

    :cond_0
    instance-of v0, p1, Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/widget/ImageView;

    iget-object v0, p0, LiT3;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LkZ0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LkZ0;->a()V

    :cond_1
    return-void
.end method

.method public b(LMY5;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LiT3;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "target cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Landroid/widget/ImageView;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LiT3;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "view cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(LWT;)V
    .locals 6

    invoke-virtual {p1}, LWT;->h()Lz2;

    move-result-object v0

    invoke-virtual {p1}, LWT;->i()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-nez v0, :cond_2

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :cond_2
    :goto_1
    if-nez v2, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, LWT;->j()LqI4;

    move-result-object v2

    iget-object v2, v2, LqI4;->d:Landroid/net/Uri;

    invoke-virtual {p1}, LWT;->k()Ljava/lang/Exception;

    move-result-object v2

    invoke-virtual {p1}, LWT;->s()Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-virtual {p1}, LWT;->o()LiT3$e;

    move-result-object p1

    if-eqz v0, :cond_4

    invoke-virtual {p0, v5, p1, v0, v2}, LiT3;->f(Landroid/graphics/Bitmap;LiT3$e;Lz2;Ljava/lang/Exception;)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    :goto_2
    if-ge v3, v0, :cond_5

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz2;

    invoke-virtual {p0, v5, p1, v4, v2}, LiT3;->f(Landroid/graphics/Bitmap;LiT3$e;Lz2;Ljava/lang/Exception;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method public e(Landroid/widget/ImageView;LkZ0;)V
    .locals 1

    iget-object v0, p0, LiT3;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LiT3;->a(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LiT3;->i:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final f(Landroid/graphics/Bitmap;LiT3$e;Lz2;Ljava/lang/Exception;)V
    .locals 2

    invoke-virtual {p3}, Lz2;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3}, Lz2;->m()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LiT3;->h:Ljava/util/Map;

    invoke-virtual {p3}, Lz2;->k()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string v0, "Main"

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    invoke-virtual {p3, p1, p2}, Lz2;->b(Landroid/graphics/Bitmap;LiT3$e;)V

    iget-boolean p1, p0, LiT3;->m:Z

    if-eqz p1, :cond_4

    iget-object p1, p3, Lz2;->b:LqI4;

    invoke-virtual {p1}, LqI4;->d()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "from "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "completed"

    invoke-static {v0, p3, p1, p2}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "LoadedFrom cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_3
    invoke-virtual {p3, p4}, Lz2;->c(Ljava/lang/Exception;)V

    iget-boolean p1, p0, LiT3;->m:Z

    if-eqz p1, :cond_4

    iget-object p1, p3, Lz2;->b:LqI4;

    invoke-virtual {p1}, LqI4;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "errored"

    invoke-static {v0, p3, p1, p2}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public g(Lz2;)V
    .locals 2

    invoke-virtual {p1}, Lz2;->k()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LiT3;->h:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_0

    invoke-virtual {p0, v0}, LiT3;->a(Ljava/lang/Object;)V

    iget-object v1, p0, LiT3;->h:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0, p1}, LiT3;->o(Lz2;)V

    return-void
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LPI4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LiT3;->c:Ljava/util/List;

    return-object v0
.end method

.method public j(Landroid/net/Uri;)LFI4;
    .locals 2

    new-instance v0, LFI4;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LFI4;-><init>(LiT3;Landroid/net/Uri;I)V

    return-object v0
.end method

.method public k(Ljava/io/File;)LFI4;
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, LFI4;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p1, p0, v0, v1}, LFI4;-><init>(LiT3;Landroid/net/Uri;I)V

    return-object p1

    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, LiT3;->j(Landroid/net/Uri;)LFI4;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/String;)LFI4;
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, LFI4;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p1, p0, v0, v1}, LFI4;-><init>(LiT3;Landroid/net/Uri;I)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, LiT3;->j(Landroid/net/Uri;)LFI4;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Path must not be empty."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, LiT3;->f:La80;

    invoke-interface {v0, p1}, La80;->get(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LiT3;->g:LlQ5;

    invoke-virtual {v0}, LlQ5;->d()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LiT3;->g:LlQ5;

    invoke-virtual {v0}, LlQ5;->e()V

    :goto_0
    return-object p1
.end method

.method public n(Lz2;)V
    .locals 4

    iget v0, p1, Lz2;->e:I

    invoke-static {v0}, LTP2;->a(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lz2;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LiT3;->m(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const-string v2, "Main"

    if-eqz v0, :cond_1

    sget-object v3, LiT3$e;->c:LiT3$e;

    invoke-virtual {p0, v0, v3, p1, v1}, LiT3;->f(Landroid/graphics/Bitmap;LiT3$e;Lz2;Ljava/lang/Exception;)V

    iget-boolean v0, p0, LiT3;->m:Z

    if-eqz v0, :cond_2

    iget-object p1, p1, Lz2;->b:LqI4;

    invoke-virtual {p1}, LqI4;->d()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "completed"

    invoke-static {v2, v1, p1, v0}, LFi6;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1}, LiT3;->g(Lz2;)V

    iget-boolean v0, p0, LiT3;->m:Z

    if-eqz v0, :cond_2

    iget-object p1, p1, Lz2;->b:LqI4;

    invoke-virtual {p1}, LqI4;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "resumed"

    invoke-static {v2, v0, p1}, LFi6;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public o(Lz2;)V
    .locals 1

    iget-object v0, p0, LiT3;->e:LQ41;

    invoke-virtual {v0, p1}, LQ41;->h(Lz2;)V

    return-void
.end method

.method public p(LqI4;)LqI4;
    .locals 3

    iget-object v0, p0, LiT3;->a:LiT3$g;

    invoke-interface {v0, p1}, LiT3$g;->a(LqI4;)LqI4;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Request transformer "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LiT3;->a:LiT3$g;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " returned null for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
