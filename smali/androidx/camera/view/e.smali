.class public final Landroidx/camera/view/e;
.super Landroidx/camera/view/c;
.source "SourceFile"


# instance fields
.field public e:Landroid/view/TextureView;

.field public f:Landroid/graphics/SurfaceTexture;

.field public g:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/camera/core/o$g;",
            ">;"
        }
    .end annotation
.end field

.field public h:Landroidx/camera/core/o;

.field public i:Z

.field public j:Landroid/graphics/SurfaceTexture;

.field public k:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field public l:Landroidx/camera/view/c$a;

.field public m:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Landroidx/camera/view/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/view/c;-><init>(Landroid/widget/FrameLayout;Landroidx/camera/view/b;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/camera/view/e;->i:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Landroidx/camera/view/e;->k:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static synthetic i(Landroidx/camera/view/e;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/view/e;->q(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/camera/view/e;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/view/e;->n(Landroidx/camera/core/o;)V

    return-void
.end method

.method public static synthetic k(Landroidx/camera/view/e;Landroid/view/Surface;Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/view/e;->p(Landroid/view/Surface;Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/o;)V

    return-void
.end method

.method public static synthetic l(Landroidx/camera/view/e;Landroid/view/Surface;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/view/e;->o(Landroid/view/Surface;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic n(Landroidx/camera/core/o;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/e;->h:Landroidx/camera/core/o;

    if-eqz v0, :cond_0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/camera/view/e;->h:Landroidx/camera/core/o;

    iput-object p1, p0, Landroidx/camera/view/e;->g:Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/view/e;->r()V

    return-void
.end method

.method private synthetic o(Landroid/view/Surface;LO80$a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "TextureViewImpl"

    const-string v1, "Surface set on Preview."

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/view/e;->h:Landroidx/camera/core/o;

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lm36;

    invoke-direct {v2, p2}, Lm36;-><init>(LO80$a;)V

    invoke-virtual {v0, p1, v1, v2}, Landroidx/camera/core/o;->A(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lrz0;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "provideSurface[request="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/camera/view/e;->h:Landroidx/camera/core/o;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " surface="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic p(Landroid/view/Surface;Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/o;)V
    .locals 2

    const-string v0, "TextureViewImpl"

    const-string v1, "Safe to release surface."

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/camera/view/e;->r()V

    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    iget-object p1, p0, Landroidx/camera/view/e;->g:Lcom/google/common/util/concurrent/ListenableFuture;

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    iput-object v0, p0, Landroidx/camera/view/e;->g:Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_0
    iget-object p1, p0, Landroidx/camera/view/e;->h:Landroidx/camera/core/o;

    if-ne p1, p3, :cond_1

    iput-object v0, p0, Landroidx/camera/view/e;->h:Landroidx/camera/core/o;

    :cond_1
    return-void
.end method

.method private synthetic q(LO80$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/view/e;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    const-string p1, "textureViewImpl_waitForNextFrame"

    return-object p1
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/e;->e:Landroid/view/TextureView;

    return-object v0
.end method

.method public b()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/view/e;->s()V

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/camera/view/e;->i:Z

    return-void
.end method

.method public e(Landroidx/camera/core/o;Landroidx/camera/view/c$a;)V
    .locals 1

    invoke-virtual {p1}, Landroidx/camera/core/o;->n()Landroid/util/Size;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/view/c;->a:Landroid/util/Size;

    iput-object p2, p0, Landroidx/camera/view/e;->l:Landroidx/camera/view/c$a;

    invoke-virtual {p0}, Landroidx/camera/view/e;->m()V

    iget-object p2, p0, Landroidx/camera/view/e;->h:Landroidx/camera/core/o;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroidx/camera/core/o;->D()Z

    :cond_0
    iput-object p1, p0, Landroidx/camera/view/e;->h:Landroidx/camera/core/o;

    iget-object p2, p0, Landroidx/camera/view/e;->e:Landroid/view/TextureView;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, LNA0;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p2

    new-instance v0, Li36;

    invoke-direct {v0, p0, p1}, Li36;-><init>(Landroidx/camera/view/e;Landroidx/camera/core/o;)V

    invoke-virtual {p1, p2, v0}, Landroidx/camera/core/o;->j(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Landroidx/camera/view/e;->t()V

    return-void
.end method

.method public g(Ljava/util/concurrent/Executor;Landroidx/camera/view/PreviewView$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/e;->m:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public h()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ll36;

    invoke-direct {v0, p0}, Ll36;-><init>(Landroidx/camera/view/e;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public m()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/view/c;->b:Landroid/widget/FrameLayout;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/camera/view/c;->a:Landroid/util/Size;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroid/view/TextureView;

    iget-object v1, p0, Landroidx/camera/view/c;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/camera/view/e;->e:Landroid/view/TextureView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Landroidx/camera/view/c;->a:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v2

    iget-object v3, p0, Landroidx/camera/view/c;->a:Landroid/util/Size;

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Landroidx/camera/view/e;->e:Landroid/view/TextureView;

    new-instance v1, Landroidx/camera/view/e$a;

    invoke-direct {v1, p0}, Landroidx/camera/view/e$a;-><init>(Landroidx/camera/view/e;)V

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    iget-object v0, p0, Landroidx/camera/view/c;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Landroidx/camera/view/c;->b:Landroid/widget/FrameLayout;

    iget-object v1, p0, Landroidx/camera/view/e;->e:Landroid/view/TextureView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final r()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/e;->l:Landroidx/camera/view/c$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/view/c$a;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/view/e;->l:Landroidx/camera/view/c$a;

    :cond_0
    return-void
.end method

.method public final s()V
    .locals 2

    iget-boolean v0, p0, Landroidx/camera/view/e;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/e;->j:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/e;->e:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/view/e;->j:Landroid/graphics/SurfaceTexture;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Landroidx/camera/view/e;->e:Landroid/view/TextureView;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/view/e;->j:Landroid/graphics/SurfaceTexture;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/view/e;->i:Z

    :cond_0
    return-void
.end method

.method public t()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/view/c;->a:Landroid/util/Size;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/camera/view/e;->f:Landroid/graphics/SurfaceTexture;

    if-eqz v1, :cond_1

    iget-object v2, p0, Landroidx/camera/view/e;->h:Landroidx/camera/core/o;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v0

    iget-object v2, p0, Landroidx/camera/view/c;->a:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v0, Landroid/view/Surface;

    iget-object v1, p0, Landroidx/camera/view/e;->f:Landroid/graphics/SurfaceTexture;

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iget-object v1, p0, Landroidx/camera/view/e;->h:Landroidx/camera/core/o;

    new-instance v2, Lj36;

    invoke-direct {v2, p0, v0}, Lj36;-><init>(Landroidx/camera/view/e;Landroid/view/Surface;)V

    invoke-static {v2}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v2

    iput-object v2, p0, Landroidx/camera/view/e;->g:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance v3, Lk36;

    invoke-direct {v3, p0, v0, v2, v1}, Lk36;-><init>(Landroidx/camera/view/e;Landroid/view/Surface;Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/o;)V

    iget-object v0, p0, Landroidx/camera/view/e;->e:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LNA0;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p0}, Landroidx/camera/view/c;->d()V

    :cond_1
    :goto_0
    return-void
.end method
