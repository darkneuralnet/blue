.class public LEX1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Lci1;


# instance fields
.field public final a:Landroidx/camera/core/impl/i;

.field public final b:Landroidx/camera/core/impl/d;

.field public final c:Llf0;

.field public final d:LhB5;

.field public final e:Le74;

.field public final f:Llf0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lci1;

    invoke-direct {v0}, Lci1;-><init>()V

    sput-object v0, LEX1;->g:Lci1;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/i;Landroid/util/Size;Lyb0;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LO36;->a()V

    iput-object p1, p0, LEX1;->a:Landroidx/camera/core/impl/i;

    invoke-static {p1}, Landroidx/camera/core/impl/d$a;->j(Landroidx/camera/core/impl/s;)Landroidx/camera/core/impl/d$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object v0

    iput-object v0, p0, LEX1;->b:Landroidx/camera/core/impl/d;

    new-instance v0, Llf0;

    invoke-direct {v0}, Llf0;-><init>()V

    iput-object v0, p0, LEX1;->c:Llf0;

    new-instance v1, LhB5;

    invoke-direct {v1}, LhB5;-><init>()V

    iput-object v1, p0, LEX1;->d:LhB5;

    new-instance v2, Le74;

    invoke-static {}, LAc0;->c()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroidx/camera/core/impl/i;->X(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/Executor;

    if-eqz p3, :cond_0

    new-instance v4, Ls62;

    invoke-direct {v4, p3}, Ls62;-><init>(Lyb0;)V

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-direct {v2, v3, v4}, Le74;-><init>(Ljava/util/concurrent/Executor;Ls62;)V

    iput-object v2, p0, LEX1;->e:Le74;

    invoke-virtual {p1}, Landroidx/camera/core/impl/i;->l()I

    move-result p1

    invoke-static {p2, p1}, Llf0$b;->g(Landroid/util/Size;I)Llf0$b;

    move-result-object p1

    iput-object p1, p0, LEX1;->f:Llf0$b;

    invoke-virtual {v0, p1}, Llf0;->k(Llf0$b;)Llf0$c;

    move-result-object p1

    invoke-virtual {v1, p1}, LhB5;->f(Llf0$c;)Le74$a;

    move-result-object p1

    invoke-virtual {v2, p1}, Le74;->q(Le74$a;)Ljava/lang/Void;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LEX1;->c:Llf0;

    invoke-virtual {v0}, Llf0;->g()V

    iget-object v0, p0, LEX1;->d:LhB5;

    invoke-virtual {v0}, LhB5;->d()V

    iget-object v0, p0, LEX1;->e:Le74;

    invoke-virtual {v0}, Le74;->o()V

    return-void
.end method

.method public final b(LZe0;LJY5;LBY5;)Lgc0;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, LZe0;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/e;

    new-instance v3, Landroidx/camera/core/impl/d$a;

    invoke-direct {v3}, Landroidx/camera/core/impl/d$a;-><init>()V

    iget-object v4, p0, LEX1;->b:Landroidx/camera/core/impl/d;

    invoke-virtual {v4}, Landroidx/camera/core/impl/d;->h()I

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/d$a;->s(I)V

    iget-object v4, p0, LEX1;->b:Landroidx/camera/core/impl/d;

    invoke-virtual {v4}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    invoke-virtual {p2}, LJY5;->n()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/d$a;->a(Ljava/util/Collection;)V

    iget-object v4, p0, LEX1;->f:Llf0$b;

    invoke-virtual {v4}, Llf0$b;->f()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/d$a;->f(Landroidx/camera/core/impl/DeferrableSurface;)V

    iget-object v4, p0, LEX1;->f:Llf0$b;

    invoke-virtual {v4}, Llf0$b;->c()I

    move-result v4

    const/16 v5, 0x100

    if-ne v4, v5, :cond_1

    sget-object v4, LEX1;->g:Lci1;

    invoke-virtual {v4}, Lci1;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Landroidx/camera/core/impl/d;->i:Landroidx/camera/core/impl/f$a;

    invoke-virtual {p2}, LJY5;->l()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroidx/camera/core/impl/d$a;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_0
    sget-object v4, Landroidx/camera/core/impl/d;->j:Landroidx/camera/core/impl/f$a;

    invoke-virtual {p0, p2}, LEX1;->g(LJY5;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroidx/camera/core/impl/d$a;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_1
    invoke-interface {v2}, Landroidx/camera/core/impl/e;->a()Landroidx/camera/core/impl/d;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    invoke-interface {v2}, Landroidx/camera/core/impl/e;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Landroidx/camera/core/impl/d$a;->g(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, p0, LEX1;->f:Llf0$b;

    invoke-virtual {v2}, Llf0$b;->a()Lpa0;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroidx/camera/core/impl/d$a;->c(Lpa0;)V

    invoke-virtual {v3}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_2
    new-instance p1, Lgc0;

    invoke-direct {p1, v0, p3}, Lgc0;-><init>(Ljava/util/List;LBY5;)V

    return-object p1
.end method

.method public final c()LZe0;
    .locals 2

    iget-object v0, p0, LEX1;->a:Landroidx/camera/core/impl/i;

    invoke-static {}, Laf0;->b()LZe0;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/i;->S(LZe0;)LZe0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, LZe0;

    return-object v0
.end method

.method public final d(LZe0;LJY5;LBY5;Lcom/google/common/util/concurrent/ListenableFuture;)Lf74;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZe0;",
            "LJY5;",
            "LBY5;",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;)",
            "Lf74;"
        }
    .end annotation

    new-instance v9, Lf74;

    invoke-virtual {p2}, LJY5;->k()Landroidx/camera/core/h$n;

    move-result-object v2

    invoke-virtual {p2}, LJY5;->g()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {p2}, LJY5;->l()I

    move-result v4

    invoke-virtual {p2}, LJY5;->i()I

    move-result v5

    invoke-virtual {p2}, LJY5;->m()Landroid/graphics/Matrix;

    move-result-object v6

    move-object v0, v9

    move-object v1, p1

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v0 .. v8}, Lf74;-><init>(LZe0;Landroidx/camera/core/h$n;Landroid/graphics/Rect;IILandroid/graphics/Matrix;LBY5;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-object v9
.end method

.method public e(LJY5;LBY5;Lcom/google/common/util/concurrent/ListenableFuture;)LsE3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJY5;",
            "LBY5;",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;)",
            "LsE3<",
            "Lgc0;",
            "Lf74;",
            ">;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, LEX1;->c()LZe0;

    move-result-object v0

    new-instance v1, LsE3;

    invoke-virtual {p0, v0, p1, p2}, LEX1;->b(LZe0;LJY5;LBY5;)Lgc0;

    move-result-object v2

    invoke-virtual {p0, v0, p1, p2, p3}, LEX1;->d(LZe0;LJY5;LBY5;Lcom/google/common/util/concurrent/ListenableFuture;)Lf74;

    move-result-object p1

    invoke-direct {v1, v2, p1}, LsE3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public f(Landroid/util/Size;)Landroidx/camera/core/impl/q$b;
    .locals 1

    iget-object v0, p0, LEX1;->a:Landroidx/camera/core/impl/i;

    invoke-static {v0, p1}, Landroidx/camera/core/impl/q$b;->o(Landroidx/camera/core/impl/s;Landroid/util/Size;)Landroidx/camera/core/impl/q$b;

    move-result-object p1

    iget-object v0, p0, LEX1;->f:Llf0$b;

    invoke-virtual {v0}, Llf0$b;->f()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/q$b;->h(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$b;

    return-object p1
.end method

.method public g(LJY5;)I
    .locals 3

    invoke-virtual {p1}, LJY5;->j()Landroidx/camera/core/h$m;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LJY5;->g()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, LEX1;->f:Llf0$b;

    invoke-virtual {v2}, Llf0$b;->e()Landroid/util/Size;

    move-result-object v2

    invoke-static {v1, v2}, Lp96;->f(Landroid/graphics/Rect;Landroid/util/Size;)Z

    move-result v1

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {p1}, LJY5;->f()I

    move-result p1

    if-nez p1, :cond_1

    const/16 p1, 0x64

    return p1

    :cond_1
    const/16 p1, 0x5f

    return p1

    :cond_2
    invoke-virtual {p1}, LJY5;->i()I

    move-result p1

    return p1
.end method

.method public h()I
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LEX1;->c:Llf0;

    invoke-virtual {v0}, Llf0;->b()I

    move-result v0

    return v0
.end method

.method public i(Landroidx/camera/core/ImageCaptureException;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LEX1;->f:Llf0$b;

    invoke-virtual {v0}, Llf0$b;->b()Ls91;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls91;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public j(Landroidx/camera/core/d$a;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LEX1;->c:Llf0;

    invoke-virtual {v0, p1}, Llf0;->j(Landroidx/camera/core/d$a;)V

    return-void
.end method

.method public k(Lf74;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LEX1;->f:Llf0$b;

    invoke-virtual {v0}, Llf0$b;->d()Ls91;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls91;->accept(Ljava/lang/Object;)V

    return-void
.end method
