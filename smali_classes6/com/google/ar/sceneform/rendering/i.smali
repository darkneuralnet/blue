.class public Lcom/google/ar/sceneform/rendering/i;
.super Lcom/google/ar/sceneform/rendering/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ar/sceneform/rendering/i$b;,
        Lcom/google/ar/sceneform/rendering/i$a;
    }
.end annotation


# static fields
.field public static final s:Ljava/lang/String; = "i"


# instance fields
.field public l:Lft6;

.field public final m:Landroid/view/View;

.field public final n:LjN2;

.field public o:Lcom/google/ar/sceneform/rendering/i$b;

.field public p:Lcom/google/ar/sceneform/rendering/i$a;

.field public q:Z

.field public final r:Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/google/ar/sceneform/rendering/i;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/ar/sceneform/rendering/d;-><init>(Lcom/google/ar/sceneform/rendering/d;)V

    new-instance v0, LjN2;

    invoke-direct {v0}, LjN2;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/i;->n:LjN2;

    sget-object v0, Lcom/google/ar/sceneform/rendering/i$b;->b:Lcom/google/ar/sceneform/rendering/i$b;

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/i;->o:Lcom/google/ar/sceneform/rendering/i$b;

    sget-object v0, Lcom/google/ar/sceneform/rendering/i$a;->c:Lcom/google/ar/sceneform/rendering/i$a;

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/i;->p:Lcom/google/ar/sceneform/rendering/i$a;

    new-instance v0, Ldt6;

    invoke-direct {v0, p0}, Ldt6;-><init>(Lcom/google/ar/sceneform/rendering/i;)V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/i;->r:Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture$a;

    iget-object v1, p1, Lcom/google/ar/sceneform/rendering/i;->m:Landroid/view/View;

    iput-object v1, p0, Lcom/google/ar/sceneform/rendering/i;->m:Landroid/view/View;

    iget-object v1, p1, Lcom/google/ar/sceneform/rendering/i;->p:Lcom/google/ar/sceneform/rendering/i$a;

    iput-object v1, p0, Lcom/google/ar/sceneform/rendering/i;->p:Lcom/google/ar/sceneform/rendering/i$a;

    iget-object v1, p1, Lcom/google/ar/sceneform/rendering/i;->o:Lcom/google/ar/sceneform/rendering/i$b;

    iput-object v1, p0, Lcom/google/ar/sceneform/rendering/i;->o:Lcom/google/ar/sceneform/rendering/i$b;

    iget-object p1, p1, Lcom/google/ar/sceneform/rendering/i;->l:Lft6;

    invoke-static {p1}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lft6;

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/i;->l:Lft6;

    invoke-virtual {p1}, Lft6;->a()Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->a(Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture$a;)V

    return-void
.end method

.method private synthetic A()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/i;->z()V

    return-void
.end method

.method private synthetic B(II)V
    .locals 0

    iget-boolean p1, p0, Lcom/google/ar/sceneform/rendering/i;->q:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/i;->E()V

    :cond_0
    return-void
.end method

.method public static synthetic u(Lcom/google/ar/sceneform/rendering/i;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/ar/sceneform/rendering/i;->A()V

    return-void
.end method

.method public static synthetic v(Lcom/google/ar/sceneform/rendering/i;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/i;->D()V

    return-void
.end method

.method public static synthetic w(Lcom/google/ar/sceneform/rendering/i;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/ar/sceneform/rendering/i;->B(II)V

    return-void
.end method


# virtual methods
.method public C()Lcom/google/ar/sceneform/rendering/i;
    .locals 1

    new-instance v0, Lcom/google/ar/sceneform/rendering/i;

    invoke-direct {v0, p0}, Lcom/google/ar/sceneform/rendering/i;-><init>(Lcom/google/ar/sceneform/rendering/i;)V

    return-object v0
.end method

.method public final D()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d;->f()LDh0;

    move-result-object v0

    invoke-virtual {v0}, LDh0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/d;->i:Lnm0;

    check-cast v0, Lb10;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d;->l()Lcom/google/ar/sceneform/rendering/a;

    const/4 v0, 0x0

    throw v0
.end method

.method public final E()V
    .locals 2

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/i;->m:Landroid/view/View;

    new-instance v1, Let6;

    invoke-direct {v1, p0}, Let6;-><init>(Lcom/google/ar/sceneform/rendering/i;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public e(LjN2;)LjN2;
    .locals 1

    const-string v0, "Parameter \"originalMatrix\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    throw p1
.end method

.method public finalize()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    :try_start_0
    invoke-static {}, LB36;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lct6;

    invoke-direct {v1, p0}, Lct6;-><init>(Lcom/google/ar/sceneform/rendering/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_1
    sget-object v1, Lcom/google/ar/sceneform/rendering/i;->s:Ljava/lang/String;

    const-string v2, "Error while Finalizing View Renderable."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method

.method public bridge synthetic p()Lcom/google/ar/sceneform/rendering/d;
    .locals 1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/i;->C()Lcom/google/ar/sceneform/rendering/i;

    move-result-object v0

    return-object v0
.end method

.method public r(Lio/github/sceneview/SceneView;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d;->f()LDh0;

    move-result-object v0

    invoke-virtual {v0}, LDh0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/i;->l:Lft6;

    invoke-static {v0}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lft6;

    invoke-virtual {v0}, Lft6;->a()Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d;->g()Lcom/google/android/filament/MaterialInstance;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->f()Z

    move-result v2

    const-string v3, "viewTextureReady"

    invoke-virtual {v1, v3, v2}, Lcom/google/android/filament/MaterialInstance;->setParameter(Ljava/lang/String;Z)V

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->e()Z

    move-result v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    iget-boolean v1, p0, Lcom/google/ar/sceneform/rendering/i;->q:Z

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d;->g()Lcom/google/android/filament/MaterialInstance;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->d()LQi1;

    move-result-object v0

    invoke-virtual {v0}, LQi1;->b()Lcom/google/android/filament/Texture;

    move-result-object v0

    const-string v2, "viewTexture"

    invoke-static {v1, v2, v0}, LJM2;->c(Lcom/google/android/filament/MaterialInstance;Ljava/lang/String;Lcom/google/android/filament/Texture;)V

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/i;->D()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/i;->q:Z

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->g0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/d;->g()Lcom/google/android/filament/MaterialInstance;

    move-result-object v0

    new-instance v1, Lgu1;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lgu1;-><init>(FF)V

    const-string v2, "offsetUv"

    invoke-static {v0, v2, v1}, LJM2;->d(Lcom/google/android/filament/MaterialInstance;Ljava/lang/String;Lgu1;)V

    :cond_4
    invoke-super {p0, p1}, Lcom/google/ar/sceneform/rendering/d;->r(Lio/github/sceneview/SceneView;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public x(LFp6;)V
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/i;->l:Lft6;

    invoke-static {v0}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lft6;

    invoke-virtual {v0}, Lft6;->a()Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->b(LFp6;)V

    return-void
.end method

.method public y()V
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/i;->l:Lft6;

    invoke-static {v0}, LDZ3;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lft6;

    invoke-virtual {v0}, Lft6;->a()Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->c()V

    return-void
.end method

.method public z()V
    .locals 2

    invoke-static {}, Lzd;->c()V

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/i;->l:Lft6;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lft6;->a()Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/i;->r:Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture$a;

    invoke-virtual {v0, v1}, Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture;->g(Lcom/google/ar/sceneform/rendering/RenderViewToExternalTexture$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/i;->l:Lft6;

    :cond_0
    return-void
.end method
