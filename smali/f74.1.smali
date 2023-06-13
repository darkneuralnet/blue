.class public Lf74;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/camera/core/h$n;

.field public final b:Landroid/graphics/Rect;

.field public final c:I

.field public final d:I

.field public final e:Landroid/graphics/Matrix;

.field public final f:LBY5;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZe0;Landroidx/camera/core/h$n;Landroid/graphics/Rect;IILandroid/graphics/Matrix;LBY5;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZe0;",
            "Landroidx/camera/core/h$n;",
            "Landroid/graphics/Rect;",
            "II",
            "Landroid/graphics/Matrix;",
            "LBY5;",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf74;->a:Landroidx/camera/core/h$n;

    iput p5, p0, Lf74;->d:I

    iput p4, p0, Lf74;->c:I

    iput-object p3, p0, Lf74;->b:Landroid/graphics/Rect;

    iput-object p6, p0, Lf74;->e:Landroid/graphics/Matrix;

    iput-object p7, p0, Lf74;->f:LBY5;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lf74;->g:Ljava/lang/String;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lf74;->h:Ljava/util/List;

    invoke-interface {p1}, LZe0;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/impl/e;

    iget-object p3, p0, Lf74;->h:Ljava/util/List;

    invoke-interface {p2}, Landroidx/camera/core/impl/e;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object p8, p0, Lf74;->i:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf74;->i:Lcom/google/common/util/concurrent/ListenableFuture;

    return-object v0
.end method

.method public b()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lf74;->b:Landroid/graphics/Rect;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lf74;->d:I

    return v0
.end method

.method public d()Landroidx/camera/core/h$n;
    .locals 1

    iget-object v0, p0, Lf74;->a:Landroidx/camera/core/h$n;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lf74;->c:I

    return v0
.end method

.method public f()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lf74;->e:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf74;->h:Ljava/util/List;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf74;->g:Ljava/lang/String;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lf74;->f:LBY5;

    invoke-interface {v0}, LBY5;->c()Z

    move-result v0

    return v0
.end method

.method public j()Z
    .locals 1

    invoke-virtual {p0}, Lf74;->d()Landroidx/camera/core/h$n;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k(Landroidx/camera/core/ImageCaptureException;)V
    .locals 1

    iget-object v0, p0, Lf74;->f:LBY5;

    invoke-interface {v0, p1}, LBY5;->f(Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method

.method public l(Landroidx/camera/core/h$o;)V
    .locals 1

    iget-object v0, p0, Lf74;->f:LBY5;

    invoke-interface {v0, p1}, LBY5;->e(Landroidx/camera/core/h$o;)V

    return-void
.end method

.method public m(Landroidx/camera/core/i;)V
    .locals 1

    iget-object v0, p0, Lf74;->f:LBY5;

    invoke-interface {v0, p1}, LBY5;->b(Landroidx/camera/core/i;)V

    return-void
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Lf74;->f:LBY5;

    invoke-interface {v0}, LBY5;->d()V

    return-void
.end method

.method public o(Landroidx/camera/core/ImageCaptureException;)V
    .locals 1

    iget-object v0, p0, Lf74;->f:LBY5;

    invoke-interface {v0, p1}, LBY5;->a(Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method
