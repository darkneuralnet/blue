.class public Lcom/google/ar/sceneform/rendering/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/ar/sceneform/rendering/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ar/sceneform/rendering/f$a;
    }
.end annotation


# instance fields
.field public final a:LQj6;

.field public final b:LQj6;

.field public c:F

.field public final d:LQj6;

.field public e:Ljava/nio/IntBuffer;

.field public f:Ljava/nio/FloatBuffer;

.field public g:Ljava/nio/FloatBuffer;

.field public h:Ljava/nio/FloatBuffer;

.field public i:Ljava/nio/FloatBuffer;

.field public j:Lcom/google/android/filament/IndexBuffer;

.field public k:Lcom/google/android/filament/VertexBuffer;

.field public final l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/ar/sceneform/rendering/f$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LQj6;->x()LQj6;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->a:LQj6;

    invoke-static {}, LQj6;->x()LQj6;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->b:LQj6;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/google/ar/sceneform/rendering/f;->c:F

    invoke-static {}, LQj6;->x()LQj6;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->d:LQj6;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->l:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(LQj6;)V
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->a:LQj6;

    invoke-virtual {v0, p1}, LQj6;->o(LQj6;)V

    return-void
.end method

.method public b(Ljava/nio/FloatBuffer;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/f;->i:Ljava/nio/FloatBuffer;

    return-void
.end method

.method public c(Lcom/google/android/filament/IndexBuffer;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/f;->j:Lcom/google/android/filament/IndexBuffer;

    return-void
.end method

.method public d()Lcom/google/android/filament/IndexBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->j:Lcom/google/android/filament/IndexBuffer;

    return-object v0
.end method

.method public e()Lcom/google/android/filament/VertexBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->k:Lcom/google/android/filament/VertexBuffer;

    return-object v0
.end method

.method public f()Ljava/nio/FloatBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->f:Ljava/nio/FloatBuffer;

    return-object v0
.end method

.method public g(Ljava/nio/FloatBuffer;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/f;->g:Ljava/nio/FloatBuffer;

    return-void
.end method

.method public h(LQj6;)V
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->b:LQj6;

    invoke-virtual {v0, p1}, LQj6;->o(LQj6;)V

    return-void
.end method

.method public i()LQj6;
    .locals 2

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->b:LQj6;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, LQj6;->m(F)LQj6;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/google/ar/sceneform/rendering/f$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->l:Ljava/util/ArrayList;

    return-object v0
.end method

.method public k()F
    .locals 1

    iget v0, p0, Lcom/google/ar/sceneform/rendering/f;->c:F

    return v0
.end method

.method public l()LQj6;
    .locals 2

    new-instance v0, LQj6;

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/f;->d:LQj6;

    invoke-direct {v0, v1}, LQj6;-><init>(LQj6;)V

    return-object v0
.end method

.method public m()LQj6;
    .locals 2

    new-instance v0, LQj6;

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/f;->a:LQj6;

    invoke-direct {v0, v1}, LQj6;-><init>(LQj6;)V

    return-object v0
.end method

.method public n(Lcom/google/android/filament/VertexBuffer;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/f;->k:Lcom/google/android/filament/VertexBuffer;

    return-void
.end method

.method public o(Ljava/nio/FloatBuffer;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/f;->h:Ljava/nio/FloatBuffer;

    return-void
.end method

.method public p(Lox4;I)V
    .locals 13
    .param p2    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    invoke-virtual {p1}, Lox4;->n()Lcom/google/ar/sceneform/rendering/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->l()Lcom/google/ar/sceneform/rendering/a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->i()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {}, Ldl1;->h()Lcom/google/android/filament/RenderableManager;

    move-result-object v10

    invoke-virtual {v10, p2}, Lcom/google/android/filament/RenderableManager;->getInstance(I)I

    move-result v2

    invoke-interface {v0}, Lcom/google/ar/sceneform/rendering/a;->j()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-eqz v2, :cond_1

    invoke-virtual {v10, v2}, Lcom/google/android/filament/RenderableManager;->getPrimitiveCount(I)I

    move-result v3

    if-eq v3, v11, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->k()I

    move-result p2

    invoke-virtual {v10, v2, p2}, Lcom/google/android/filament/RenderableManager;->setPriority(II)V

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->n()Z

    move-result p2

    invoke-virtual {v10, v2, p2}, Lcom/google/android/filament/RenderableManager;->setCastShadows(IZ)V

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->o()Z

    move-result p1

    invoke-virtual {v10, v2, p1}, Lcom/google/android/filament/RenderableManager;->setReceiveShadows(IZ)V

    :goto_0
    move p1, v2

    goto :goto_2

    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    :try_start_0
    invoke-virtual {v10, p2}, Lcom/google/android/filament/RenderableManager;->destroy(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    new-instance v2, Lcom/google/android/filament/RenderableManager$Builder;

    invoke-direct {v2, v11}, Lcom/google/android/filament/RenderableManager$Builder;-><init>(I)V

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->k()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/filament/RenderableManager$Builder;->priority(I)Lcom/google/android/filament/RenderableManager$Builder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->n()Z

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/filament/RenderableManager$Builder;->castShadows(Z)Lcom/google/android/filament/RenderableManager$Builder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->o()Z

    move-result p1

    invoke-virtual {v2, p1}, Lcom/google/android/filament/RenderableManager$Builder;->receiveShadows(Z)Lcom/google/android/filament/RenderableManager$Builder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/ar/sceneform/rendering/f;->x(Lcom/google/android/filament/RenderableManager$Builder;)V

    invoke-static {p1, p2}, Lel1;->a(Lcom/google/android/filament/RenderableManager$Builder;I)V

    invoke-virtual {v10, p2}, Lcom/google/android/filament/RenderableManager;->getInstance(I)I

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_0

    :goto_2
    invoke-interface {v0}, Lcom/google/ar/sceneform/rendering/a;->w()LQj6;

    move-result-object p2

    invoke-interface {v0}, Lcom/google/ar/sceneform/rendering/a;->m()LQj6;

    move-result-object v2

    new-instance v12, Lcom/google/android/filament/Box;

    iget v4, v2, LQj6;->a:F

    iget v5, v2, LQj6;->b:F

    iget v6, v2, LQj6;->c:F

    iget v7, p2, LQj6;->a:F

    iget v8, p2, LQj6;->b:F

    iget v9, p2, LQj6;->c:F

    move-object v3, v12

    invoke-direct/range {v3 .. v9}, Lcom/google/android/filament/Box;-><init>(FFFFFF)V

    invoke-virtual {v10, p1, v12}, Lcom/google/android/filament/RenderableManager;->setAxisAlignedBoundingBox(ILcom/google/android/filament/Box;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ne p2, v11, :cond_5

    sget-object p2, Lcom/google/android/filament/RenderableManager$PrimitiveType;->TRIANGLES:Lcom/google/android/filament/RenderableManager$PrimitiveType;

    const/4 v2, 0x0

    move v12, v2

    :goto_3
    if-ge v12, v11, :cond_4

    invoke-interface {v0}, Lcom/google/ar/sceneform/rendering/a;->j()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/ar/sceneform/rendering/f$a;

    invoke-interface {v0}, Lcom/google/ar/sceneform/rendering/a;->e()Lcom/google/android/filament/VertexBuffer;

    move-result-object v6

    invoke-interface {v0}, Lcom/google/ar/sceneform/rendering/a;->d()Lcom/google/android/filament/IndexBuffer;

    move-result-object v7

    if-eqz v6, :cond_3

    if-eqz v7, :cond_3

    iget v8, v2, Lcom/google/ar/sceneform/rendering/f$a;->a:I

    iget v2, v2, Lcom/google/ar/sceneform/rendering/f$a;->b:I

    sub-int v9, v2, v8

    move-object v2, v10

    move v3, p1

    move v4, v12

    move-object v5, p2

    invoke-virtual/range {v2 .. v9}, Lcom/google/android/filament/RenderableManager;->setGeometryAt(IILcom/google/android/filament/RenderableManager$PrimitiveType;Lcom/google/android/filament/VertexBuffer;Lcom/google/android/filament/IndexBuffer;II)V

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/filament/MaterialInstance;

    invoke-virtual {v10, p1, v12, v2}, Lcom/google/android/filament/RenderableManager;->setMaterialInstanceAt(IILcom/google/android/filament/MaterialInstance;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Internal Error: Failed to get vertex or index buffer"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Material Bindings are out of sync with meshes."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Unable to create RenderableInstance."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public q()Ljava/nio/FloatBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->g:Ljava/nio/FloatBuffer;

    return-object v0
.end method

.method public r()Ljava/nio/FloatBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->h:Ljava/nio/FloatBuffer;

    return-object v0
.end method

.method public s(Ljava/nio/IntBuffer;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/f;->e:Ljava/nio/IntBuffer;

    return-void
.end method

.method public t(Ljava/nio/FloatBuffer;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/f;->f:Ljava/nio/FloatBuffer;

    return-void
.end method

.method public u()Ljava/nio/FloatBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->i:Ljava/nio/FloatBuffer;

    return-object v0
.end method

.method public v()Ljava/nio/IntBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/f;->e:Ljava/nio/IntBuffer;

    return-object v0
.end method

.method public w()LQj6;
    .locals 2

    new-instance v0, LQj6;

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/f;->b:LQj6;

    invoke-direct {v0, v1}, LQj6;-><init>(LQj6;)V

    return-object v0
.end method

.method public final x(Lcom/google/android/filament/RenderableManager$Builder;)V
    .locals 0

    return-void
.end method
