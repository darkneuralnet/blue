.class public LMV5$a;
.super Landroidx/camera/core/impl/DeferrableSurface;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final m:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public n:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public o:Landroidx/camera/core/impl/DeferrableSurface;


# direct methods
.method public constructor <init>(Landroid/util/Size;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/impl/DeferrableSurface;-><init>(Landroid/util/Size;I)V

    new-instance p1, LKV5;

    invoke-direct {p1, p0}, LKV5;-><init>(LMV5$a;)V

    invoke-static {p1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, LMV5$a;->m:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method

.method private synthetic l(LO80$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iput-object p1, p0, LMV5$a;->n:LO80$a;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "SettableFuture hashCode: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic q(LMV5$a;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LMV5$a;->l(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public o()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LMV5$a;->m:Lcom/google/common/util/concurrent/ListenableFuture;

    return-object v0
.end method

.method public r()Z
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LMV5$a;->o:Landroidx/camera/core/impl/DeferrableSurface;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/impl/DeferrableSurface;->k()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s(Landroidx/camera/core/impl/DeferrableSurface;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LMV5$a;->o:Landroidx/camera/core/impl/DeferrableSurface;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    const-string v3, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider"

    invoke-static {v0, v3}, LHZ3;->j(ZLjava/lang/String;)V

    invoke-virtual {p0}, Landroidx/camera/core/impl/DeferrableSurface;->f()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/impl/DeferrableSurface;->f()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "The provider\'s size must match the parent"

    invoke-static {v0, v3}, LHZ3;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/camera/core/impl/DeferrableSurface;->g()I

    move-result v0

    invoke-virtual {p1}, Landroidx/camera/core/impl/DeferrableSurface;->g()I

    move-result v3

    if-ne v0, v3, :cond_2

    move v1, v2

    :cond_2
    const-string v0, "The provider\'s format must match the parent"

    invoke-static {v1, v0}, LHZ3;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/camera/core/impl/DeferrableSurface;->k()Z

    move-result v0

    xor-int/2addr v0, v2

    const-string v1, "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    iput-object p1, p0, LMV5$a;->o:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {p1}, Landroidx/camera/core/impl/DeferrableSurface;->h()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    iget-object v1, p0, LMV5$a;->n:LO80$a;

    invoke-static {v0, v1}, LIA1;->k(Lcom/google/common/util/concurrent/ListenableFuture;LO80$a;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/DeferrableSurface;->j()V

    invoke-virtual {p0}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LLV5;

    invoke-direct {v1, p1}, LLV5;-><init>(Landroidx/camera/core/impl/DeferrableSurface;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return v2
.end method
