.class public Lox4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lue;


# static fields
.field public static final o:Ljava/lang/String; = "ox4"


# instance fields
.field public final a:Lo96;

.field public final b:Lcom/google/ar/sceneform/rendering/d;

.field public c:I
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation
.end field

.field public d:I
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation
.end field

.field public e:I

.field public f:Lcom/google/android/filament/gltfio/FilamentAsset;

.field public g:Lcom/google/android/filament/gltfio/Animator;

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LRU2;",
            ">;"
        }
    .end annotation
.end field

.field public i:I

.field public j:Z

.field public k:Z

.field public l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/filament/MaterialInstance;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public n:LjN2;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo96;Lcom/google/ar/sceneform/rendering/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lox4;->c:I

    iput v0, p0, Lox4;->d:I

    iput v0, p0, Lox4;->e:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lox4;->h:Ljava/util/ArrayList;

    const/4 v0, 0x4

    iput v0, p0, Lox4;->i:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lox4;->j:Z

    iput-boolean v0, p0, Lox4;->k:Z

    const-string v0, "Parameter \"transformProvider\" was null."

    invoke-static {p1, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Parameter \"renderable\" was null."

    invoke-static {p2, v0}, LDZ3;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lox4;->a:Lo96;

    iput-object p2, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p2}, Lcom/google/ar/sceneform/rendering/d;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lox4;->l:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p2}, Lcom/google/ar/sceneform/rendering/d;->j()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lox4;->m:Ljava/util/ArrayList;

    invoke-static {}, Lox4;->e()I

    move-result p1

    iput p1, p0, Lox4;->c:I

    invoke-virtual {p0}, Lox4;->m()LjN2;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p2, p0, Lox4;->c:I

    invoke-static {p2, p1}, Lox4;->d(ILjN2;)I

    move-result p1

    iput p1, p0, Lox4;->d:I

    :cond_0
    invoke-virtual {p0}, Lox4;->f()V

    invoke-virtual {p0}, Lox4;->c()V

    return-void
.end method

.method public static d(ILjN2;)I
    .locals 3
    .param p0    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    invoke-static {}, Ldl1;->d()Lcom/google/android/filament/EntityManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/EntityManager;->create()I

    move-result v0

    invoke-static {}, Ldl1;->j()Lcom/google/android/filament/TransformManager;

    move-result-object v1

    invoke-static {}, Ldl1;->j()Lcom/google/android/filament/TransformManager;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/google/android/filament/TransformManager;->getInstance(I)I

    move-result p0

    iget-object p1, p1, LjN2;->a:[F

    invoke-virtual {v1, v0, p0, p1}, Lcom/google/android/filament/TransformManager;->create(II[F)I

    return v0
.end method

.method public static e()I
    .locals 2
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    invoke-static {}, Ldl1;->d()Lcom/google/android/filament/EntityManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/EntityManager;->create()I

    move-result v0

    invoke-static {}, Ldl1;->j()Lcom/google/android/filament/TransformManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/filament/TransformManager;->create(I)I

    return v0
.end method


# virtual methods
.method public b(LRU2;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public c()V
    .locals 13

    iget-object v0, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/d;->l()Lcom/google/ar/sceneform/rendering/a;

    move-result-object v0

    instance-of v0, v0, Lcom/google/ar/sceneform/rendering/g;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/d;->l()Lcom/google/ar/sceneform/rendering/a;

    move-result-object v0

    check-cast v0, Lcom/google/ar/sceneform/rendering/g;

    invoke-static {}, Ldl1;->b()Lcom/google/android/filament/gltfio/AssetLoader;

    move-result-object v1

    iget-object v2, v0, Lcom/google/ar/sceneform/rendering/g;->b:Ljava/nio/Buffer;

    invoke-virtual {v1, v2}, Lcom/google/android/filament/gltfio/AssetLoader;->createAsset(Ljava/nio/Buffer;)Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v2, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    iget-object v2, v2, Lcom/google/ar/sceneform/rendering/d;->i:Lnm0;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getBoundingBox()Lcom/google/android/filament/Box;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/filament/Box;->getHalfExtent()[F

    move-result-object v5

    invoke-virtual {v2}, Lcom/google/android/filament/Box;->getCenter()[F

    move-result-object v2

    iget-object v6, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    new-instance v7, Lb10;

    new-instance v8, LQj6;

    aget v9, v5, v4

    aget v10, v5, v3

    const/4 v11, 0x2

    aget v5, v5, v11

    invoke-direct {v8, v9, v10, v5}, LQj6;-><init>(FFF)V

    const/high16 v5, 0x40000000    # 2.0f

    invoke-virtual {v8, v5}, LQj6;->m(F)LQj6;

    move-result-object v5

    new-instance v8, LQj6;

    aget v9, v2, v4

    aget v10, v2, v3

    aget v2, v2, v11

    invoke-direct {v8, v9, v10, v2}, LQj6;-><init>(FFF)V

    invoke-direct {v7, v5, v8}, Lb10;-><init>(LQj6;LQj6;)V

    iput-object v7, v6, Lcom/google/ar/sceneform/rendering/d;->i:Lnm0;

    :cond_0
    iget-object v2, v0, Lcom/google/ar/sceneform/rendering/g;->d:Ljava/util/function/Function;

    invoke-virtual {v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getResourceUris()[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    move v7, v4

    :goto_0
    if-ge v7, v6, :cond_2

    aget-object v8, v5, v7

    if-nez v2, :cond_1

    sget-object v9, Lox4;->o:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Failed to download uri "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " no url resolver."

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v9, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    invoke-interface {v2, v8}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/net/Uri;

    :try_start_0
    iget-object v10, v0, Lcom/google/ar/sceneform/rendering/g;->a:Landroid/content/Context;

    invoke-static {v10, v9}, Lht2;->k(Landroid/content/Context;Landroid/net/Uri;)Ljava/util/concurrent/Callable;

    move-result-object v10

    invoke-static {}, Ldl1;->i()Lcom/google/android/filament/gltfio/ResourceLoader;

    move-result-object v11

    invoke-static {v10}, Ltm5;->b(Ljava/util/concurrent/Callable;)[B

    move-result-object v10

    invoke-static {v10}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v10

    invoke-virtual {v11, v8, v10}, Lcom/google/android/filament/gltfio/ResourceLoader;->addResourceData(Ljava/lang/String;Ljava/nio/Buffer;)Lcom/google/android/filament/gltfio/ResourceLoader;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v8

    sget-object v10, Lox4;->o:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Failed to download data uri "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v10, v9, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    iget-boolean v0, v0, Lcom/google/ar/sceneform/rendering/d;->b:Z

    if-eqz v0, :cond_3

    invoke-static {}, Ldl1;->i()Lcom/google/android/filament/gltfio/ResourceLoader;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->asyncBeginLoad(Lcom/google/android/filament/gltfio/FilamentAsset;)Z

    goto :goto_2

    :cond_3
    invoke-static {}, Ldl1;->i()Lcom/google/android/filament/gltfio/ResourceLoader;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->loadResources(Lcom/google/android/filament/gltfio/FilamentAsset;)Lcom/google/android/filament/gltfio/ResourceLoader;

    :goto_2
    invoke-static {}, Ldl1;->h()Lcom/google/android/filament/RenderableManager;

    move-result-object v0

    iget-object v2, p0, Lox4;->l:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object v2, p0, Lox4;->m:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getEntities()[I

    move-result-object v2

    array-length v5, v2

    move v6, v4

    :goto_3
    if-ge v6, v5, :cond_5

    aget v7, v2, v6

    invoke-virtual {v0, v7}, Lcom/google/android/filament/RenderableManager;->getInstance(I)I

    move-result v7

    if-nez v7, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0, v7, v3}, Lcom/google/android/filament/RenderableManager;->setScreenSpaceContactShadows(IZ)V

    invoke-virtual {v0, v7, v4}, Lcom/google/android/filament/RenderableManager;->getMaterialInstanceAt(II)Lcom/google/android/filament/MaterialInstance;

    move-result-object v7

    iget-object v8, p0, Lox4;->m:Ljava/util/ArrayList;

    invoke-virtual {v7}, Lcom/google/android/filament/MaterialInstance;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v8, p0, Lox4;->l:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_5
    invoke-static {}, Ldl1;->j()Lcom/google/android/filament/TransformManager;

    move-result-object v0

    invoke-virtual {v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getRoot()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/filament/TransformManager;->getInstance(I)I

    move-result v2

    iget v3, p0, Lox4;->d:I

    if-nez v3, :cond_6

    iget v3, p0, Lox4;->c:I

    :cond_6
    invoke-virtual {v0, v3}, Lcom/google/android/filament/TransformManager;->getInstance(I)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/google/android/filament/TransformManager;->setParent(II)V

    iput-object v1, p0, Lox4;->f:Lcom/google/android/filament/gltfio/FilamentAsset;

    iget-object v0, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/d;->k()I

    move-result v0

    invoke-virtual {p0, v0}, Lox4;->t(I)V

    iget-object v0, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/d;->n()Z

    move-result v0

    invoke-virtual {p0, v0}, Lox4;->u(Z)V

    iget-object v0, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/d;->o()Z

    move-result v0

    invoke-virtual {p0, v0}, Lox4;->v(Z)V

    invoke-virtual {v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getInstance()Lcom/google/android/filament/gltfio/FilamentInstance;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/FilamentInstance;->getAnimator()Lcom/google/android/filament/gltfio/Animator;

    move-result-object v0

    iput-object v0, p0, Lox4;->g:Lcom/google/android/filament/gltfio/Animator;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lox4;->h:Ljava/util/ArrayList;

    :goto_5
    iget-object v0, p0, Lox4;->g:Lcom/google/android/filament/gltfio/Animator;

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/Animator;->getAnimationCount()I

    move-result v0

    if-ge v4, v0, :cond_8

    iget-object v0, p0, Lox4;->h:Ljava/util/ArrayList;

    new-instance v1, LRU2;

    iget-object v2, p0, Lox4;->g:Lcom/google/android/filament/gltfio/Animator;

    invoke-virtual {v2, v4}, Lcom/google/android/filament/gltfio/Animator;->getAnimationName(I)Ljava/lang/String;

    move-result-object v7

    iget-object v2, p0, Lox4;->g:Lcom/google/android/filament/gltfio/Animator;

    invoke-virtual {v2, v4}, Lcom/google/android/filament/gltfio/Animator;->getAnimationDuration(I)F

    move-result v9

    invoke-virtual {p0}, Lox4;->n()Lcom/google/ar/sceneform/rendering/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/ar/sceneform/rendering/d;->c()I

    move-result v10

    move-object v5, v1

    move-object v6, p0

    move v8, v4

    invoke-direct/range {v5 .. v10}, LRU2;-><init>(Lue;Ljava/lang/String;IFI)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Failed to load gltf"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, Lox4;->f:Lcom/google/android/filament/gltfio/FilamentAsset;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {v0}, LVU2;->a(Lcom/google/android/filament/gltfio/FilamentAsset;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Lox4;->f:Lcom/google/android/filament/gltfio/FilamentAsset;

    :cond_0
    invoke-static {}, Ldl1;->h()Lcom/google/android/filament/RenderableManager;

    move-result-object v0

    iget v1, p0, Lox4;->d:I

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    :try_start_1
    invoke-virtual {v0, v1}, Lcom/google/android/filament/RenderableManager;->destroy(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    iput v2, p0, Lox4;->d:I

    :cond_1
    iget v1, p0, Lox4;->c:I

    if-eqz v1, :cond_2

    :try_start_2
    invoke-virtual {v0, v1}, Lcom/google/android/filament/RenderableManager;->destroy(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    iput v2, p0, Lox4;->c:I

    :cond_2
    return-void
.end method

.method public h(I)LRU2;
    .locals 2

    invoke-virtual {p0}, Lox4;->i()I

    move-result v0

    const-string v1, "No animation found at the given index"

    invoke-static {p1, v0, v1}, LDZ3;->b(IILjava/lang/String;)V

    iget-object v0, p0, Lox4;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRU2;

    return-object p1
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Lox4;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public j()I
    .locals 1
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget v0, p0, Lox4;->c:I

    return v0
.end method

.method public k()Lcom/google/android/filament/gltfio/Animator;
    .locals 1

    iget-object v0, p0, Lox4;->g:Lcom/google/android/filament/gltfio/Animator;

    return-object v0
.end method

.method public l()Lcom/google/android/filament/gltfio/FilamentAsset;
    .locals 1

    iget-object v0, p0, Lox4;->f:Lcom/google/android/filament/gltfio/FilamentAsset;

    return-object v0
.end method

.method public m()LjN2;
    .locals 3

    iget-object v0, p0, Lox4;->n:LjN2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/d;->l()Lcom/google/ar/sceneform/rendering/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/ar/sceneform/rendering/a;->k()F

    move-result v1

    invoke-interface {v0}, Lcom/google/ar/sceneform/rendering/a;->l()LQj6;

    move-result-object v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v2, v1, v2

    if-nez v2, :cond_1

    invoke-static {}, LQj6;->x()LQj6;

    move-result-object v2

    invoke-static {v0, v2}, LQj6;->e(LQj6;LQj6;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v2, LjN2;

    invoke-direct {v2}, LjN2;-><init>()V

    iput-object v2, p0, Lox4;->n:LjN2;

    invoke-virtual {v2, v1}, LjN2;->c(F)V

    iget-object v1, p0, Lox4;->n:LjN2;

    invoke-virtual {v1, v0}, LjN2;->e(LQj6;)V

    iget-object v0, p0, Lox4;->n:LjN2;

    return-object v0
.end method

.method public n()Lcom/google/ar/sceneform/rendering/d;
    .locals 1

    iget-object v0, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    return-object v0
.end method

.method public o()I
    .locals 1
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation

    iget v0, p0, Lox4;->d:I

    if-nez v0, :cond_0

    iget v0, p0, Lox4;->c:I

    :cond_0
    return v0
.end method

.method public p()LjN2;
    .locals 2

    iget-object v0, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    iget-object v1, p0, Lox4;->a:Lo96;

    invoke-interface {v1}, Lo96;->y()LjN2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/ar/sceneform/rendering/d;->e(LjN2;)LjN2;

    move-result-object v0

    return-object v0
.end method

.method public q(Lio/github/sceneview/SceneView;)V
    .locals 2

    iget-object v0, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    invoke-virtual {v0, p1}, Lcom/google/ar/sceneform/rendering/d;->r(Lio/github/sceneview/SceneView;)V

    iget-object p1, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->f()LDh0;

    move-result-object p1

    iget v0, p0, Lox4;->e:I

    invoke-virtual {p1, v0}, LDh0;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lox4;->b:Lcom/google/ar/sceneform/rendering/d;

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/d;->l()Lcom/google/ar/sceneform/rendering/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lox4;->w(Lcom/google/ar/sceneform/rendering/a;)V

    invoke-virtual {p0}, Lox4;->o()I

    move-result v1

    invoke-interface {v0, p0, v1}, Lcom/google/ar/sceneform/rendering/a;->p(Lox4;I)V

    invoke-virtual {p1}, LDh0;->b()I

    move-result p1

    iput p1, p0, Lox4;->e:I

    invoke-virtual {p0}, Lox4;->y()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lox4;->x(Z)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lox4;->y()V

    :cond_1
    :goto_0
    return-void
.end method

.method public r(II)V
    .locals 2

    invoke-static {}, Ldl1;->h()Lcom/google/android/filament/RenderableManager;

    move-result-object v0

    invoke-virtual {p0}, Lox4;->o()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/RenderableManager;->getInstance(I)I

    move-result v1

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/filament/RenderableManager;->setBlendOrderAt(III)V

    return-void
.end method

.method public s(Lcom/google/android/filament/TransformManager;[F)V
    .locals 1

    iget v0, p0, Lox4;->c:I

    invoke-virtual {p1, v0}, Lcom/google/android/filament/TransformManager;->getInstance(I)I

    move-result v0

    invoke-virtual {p1, v0, p2}, Lcom/google/android/filament/TransformManager;->setTransform(I[F)V

    return-void
.end method

.method public t(I)V
    .locals 4

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/4 v1, 0x7

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lox4;->i:I

    invoke-static {}, Ldl1;->h()Lcom/google/android/filament/RenderableManager;

    move-result-object p1

    invoke-virtual {p0}, Lox4;->l()Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getEntities()[I

    move-result-object v1

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget v2, v1, v0

    invoke-virtual {p1, v2}, Lcom/google/android/filament/RenderableManager;->getInstance(I)I

    move-result v2

    if-eqz v2, :cond_0

    iget v3, p0, Lox4;->i:I

    invoke-virtual {p1, v2, v3}, Lcom/google/android/filament/RenderableManager;->setPriority(II)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public u(Z)V
    .locals 4

    iput-boolean p1, p0, Lox4;->j:Z

    invoke-static {}, Ldl1;->h()Lcom/google/android/filament/RenderableManager;

    move-result-object v0

    invoke-virtual {p0}, Lox4;->j()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/RenderableManager;->getInstance(I)I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/filament/RenderableManager;->setCastShadows(IZ)V

    :cond_0
    invoke-virtual {p0}, Lox4;->l()Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getEntities()[I

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    array-length v3, v1

    if-ge v2, v3, :cond_3

    aget v3, v1, v2

    invoke-virtual {v0, v3}, Lcom/google/android/filament/RenderableManager;->getInstance(I)I

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0, v3, p1}, Lcom/google/android/filament/RenderableManager;->setCastShadows(IZ)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public v(Z)V
    .locals 4

    iput-boolean p1, p0, Lox4;->k:Z

    invoke-static {}, Ldl1;->h()Lcom/google/android/filament/RenderableManager;

    move-result-object v0

    invoke-virtual {p0}, Lox4;->j()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/filament/RenderableManager;->getInstance(I)I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/filament/RenderableManager;->setReceiveShadows(IZ)V

    :cond_0
    invoke-virtual {p0}, Lox4;->l()Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getEntities()[I

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    array-length v3, v1

    if-ge v2, v3, :cond_3

    aget v3, v1, v2

    invoke-virtual {v0, v3}, Lcom/google/android/filament/RenderableManager;->getInstance(I)I

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0, v3, p1}, Lcom/google/android/filament/RenderableManager;->setReceiveShadows(IZ)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final w(Lcom/google/ar/sceneform/rendering/a;)V
    .locals 0

    return-void
.end method

.method public x(Z)Z
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    invoke-virtual {p0}, Lox4;->i()I

    move-result v3

    if-ge v1, v3, :cond_3

    invoke-virtual {p0, v1}, Lox4;->h(I)LRU2;

    move-result-object v3

    if-nez p1, :cond_0

    invoke-virtual {v3}, LRU2;->l()Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_0
    invoke-virtual {p0}, Lox4;->k()Lcom/google/android/filament/gltfio/Animator;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lox4;->k()Lcom/google/android/filament/gltfio/Animator;

    move-result-object v2

    invoke-virtual {v3}, LRU2;->k()F

    move-result v4

    invoke-virtual {v2, v1, v4}, Lcom/google/android/filament/gltfio/Animator;->applyAnimation(IF)V

    :cond_1
    invoke-virtual {v3, v0}, LRU2;->m(Z)V

    const/4 v2, 0x1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return v2
.end method

.method public final y()V
    .locals 1

    invoke-virtual {p0}, Lox4;->k()Lcom/google/android/filament/gltfio/Animator;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lox4;->k()Lcom/google/android/filament/gltfio/Animator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/Animator;->updateBoneMatrices()V

    :cond_0
    return-void
.end method
