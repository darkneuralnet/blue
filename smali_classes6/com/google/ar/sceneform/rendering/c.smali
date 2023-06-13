.class public Lcom/google/ar/sceneform/rendering/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo96;


# instance fields
.field public final b:Lio/github/sceneview/SceneView;

.field public final c:Lcom/google/ar/core/Plane;

.field public final d:LjN2;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Lcom/google/ar/sceneform/rendering/b;

.field public j:Lox4;

.field public final k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/ar/sceneform/rendering/h;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Lcom/google/ar/sceneform/rendering/e;

.field public n:Lcom/google/ar/sceneform/rendering/e$c;

.field public o:Lcom/google/ar/sceneform/rendering/e$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lio/github/sceneview/SceneView;Lcom/google/ar/core/Plane;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LjN2;

    invoke-direct {v0}, LjN2;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->d:LjN2;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->e:Z

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->f:Z

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->g:Z

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->h:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->i:Lcom/google/ar/sceneform/rendering/b;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->k:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/c;->b:Lio/github/sceneview/SceneView;

    iput-object p2, p0, Lcom/google/ar/sceneform/rendering/c;->c:Lcom/google/ar/core/Plane;

    invoke-static {}, Lcom/google/ar/sceneform/rendering/e;->g()Lcom/google/ar/sceneform/rendering/e$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/ar/sceneform/rendering/e$b;->d(Ljava/util/List;)Lcom/google/ar/sceneform/rendering/e$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/e$b;->c()Lcom/google/ar/sceneform/rendering/e;

    move-result-object p1

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/c;->m:Lcom/google/ar/sceneform/rendering/e;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->e:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->j:Lox4;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->b:Lio/github/sceneview/SceneView;

    invoke-virtual {v0}, Lox4;->o()I

    move-result v0

    invoke-virtual {v1, v0}, Lio/github/sceneview/SceneView;->J(I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->e:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public b()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->c()V

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->j:Lox4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lox4;->g()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->i:Lcom/google/ar/sceneform/rendering/b;

    return-void
.end method

.method public final c()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->e:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->j:Lox4;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->b:Lio/github/sceneview/SceneView;

    invoke-virtual {v0}, Lox4;->o()I

    move-result v0

    invoke-virtual {v1, v0}, Lio/github/sceneview/SceneView;->l0(I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->e:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public d(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->f:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/ar/sceneform/rendering/c;->f:Z

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->i()V

    :cond_0
    return-void
.end method

.method public e(Lcom/google/android/filament/MaterialInstance;)V
    .locals 2

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->n:Lcom/google/ar/sceneform/rendering/e$c;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/ar/sceneform/rendering/e$c;->a()Lcom/google/ar/sceneform/rendering/e$c$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/google/ar/sceneform/rendering/e$c$a;->f(Ljava/util/List;)Lcom/google/ar/sceneform/rendering/e$c$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/ar/sceneform/rendering/e$c$a;->e(Lcom/google/android/filament/MaterialInstance;)Lcom/google/ar/sceneform/rendering/e$c$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/e$c$a;->d()Lcom/google/ar/sceneform/rendering/e$c;

    move-result-object p1

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/c;->n:Lcom/google/ar/sceneform/rendering/e$c;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/ar/sceneform/rendering/e$c;->e(Lcom/google/android/filament/MaterialInstance;)V

    :goto_0
    iget-object p1, p0, Lcom/google/ar/sceneform/rendering/c;->i:Lcom/google/ar/sceneform/rendering/b;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->j()V

    :cond_1
    return-void
.end method

.method public f(Lcom/google/android/filament/MaterialInstance;)V
    .locals 2

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->o:Lcom/google/ar/sceneform/rendering/e$c;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/ar/sceneform/rendering/e$c;->a()Lcom/google/ar/sceneform/rendering/e$c$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/google/ar/sceneform/rendering/e$c$a;->f(Ljava/util/List;)Lcom/google/ar/sceneform/rendering/e$c$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/ar/sceneform/rendering/e$c$a;->e(Lcom/google/android/filament/MaterialInstance;)Lcom/google/ar/sceneform/rendering/e$c$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/e$c$a;->d()Lcom/google/ar/sceneform/rendering/e$c;

    move-result-object p1

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/c;->o:Lcom/google/ar/sceneform/rendering/e$c;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/ar/sceneform/rendering/e$c;->e(Lcom/google/android/filament/MaterialInstance;)V

    :goto_0
    iget-object p1, p0, Lcom/google/ar/sceneform/rendering/c;->i:Lcom/google/ar/sceneform/rendering/b;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->j()V

    :cond_1
    return-void
.end method

.method public g(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->g:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/ar/sceneform/rendering/c;->g:Z

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->i()V

    :cond_0
    return-void
.end method

.method public h(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->h:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/ar/sceneform/rendering/c;->h:Z

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->i()V

    :cond_0
    return-void
.end method

.method public i()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->f:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->h:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/ar/sceneform/rendering/c;->g:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->c:Lcom/google/ar/core/Plane;

    invoke-virtual {v0}, Lcom/google/ar/core/Plane;->getTrackingState()Lcom/google/ar/core/TrackingState;

    move-result-object v0

    sget-object v1, Lcom/google/ar/core/TrackingState;->TRACKING:Lcom/google/ar/core/TrackingState;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->c()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->c:Lcom/google/ar/core/Plane;

    invoke-virtual {v0}, Lcom/google/ar/core/Plane;->getCenterPose()Lcom/google/ar/core/Pose;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->d:LjN2;

    iget-object v1, v1, LjN2;->a:[F

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/ar/core/Pose;->toMatrix([FI)V

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->k()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->c()V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->j()V

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->a()V

    return-void

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->c()V

    return-void
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->m:Lcom/google/ar/sceneform/rendering/e;

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/e;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-boolean v1, p0, Lcom/google/ar/sceneform/rendering/c;->h:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->n:Lcom/google/ar/sceneform/rendering/e$c;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-boolean v1, p0, Lcom/google/ar/sceneform/rendering/c;->g:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->o:Lcom/google/ar/sceneform/rendering/e$c;

    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/google/ar/sceneform/rendering/c;->c()V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->i:Lcom/google/ar/sceneform/rendering/b;

    const/4 v2, 0x0

    if-nez v1, :cond_3

    :try_start_0
    invoke-static {}, Lcom/google/ar/sceneform/rendering/b;->u()Lcom/google/ar/sceneform/rendering/b$b;

    move-result-object v1

    iget-object v3, p0, Lcom/google/ar/sceneform/rendering/c;->m:Lcom/google/ar/sceneform/rendering/e;

    invoke-virtual {v1, v3}, Lcom/google/ar/sceneform/rendering/d$a;->s(Lcom/google/ar/sceneform/rendering/e;)Lcom/google/ar/sceneform/rendering/d$a;

    move-result-object v1

    check-cast v1, Lcom/google/ar/sceneform/rendering/b$b;

    invoke-virtual {v1}, Lcom/google/ar/sceneform/rendering/d$a;->h()Ljava/util/concurrent/CompletableFuture;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/CompletableFuture;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ar/sceneform/rendering/b;

    iput-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->i:Lcom/google/ar/sceneform/rendering/b;

    invoke-virtual {v1, v2}, Lcom/google/ar/sceneform/rendering/d;->s(Z)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->i:Lcom/google/ar/sceneform/rendering/b;

    invoke-virtual {v1, p0}, Lcom/google/ar/sceneform/rendering/d;->a(Lo96;)Lox4;

    move-result-object v1

    iput-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->j:Lox4;

    goto :goto_0

    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Unable to create plane renderable."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_3
    iget-object v3, p0, Lcom/google/ar/sceneform/rendering/c;->m:Lcom/google/ar/sceneform/rendering/e;

    invoke-virtual {v1, v3}, Lcom/google/ar/sceneform/rendering/d;->t(Lcom/google/ar/sceneform/rendering/e;)V

    :goto_0
    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->j:Lox4;

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->j:Lox4;

    invoke-virtual {v0, v2, v2}, Lox4;->r(II)V

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->j:Lox4;

    invoke-virtual {v0, v1, v1}, Lox4;->r(II)V

    :cond_4
    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->j:Lox4;

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->b:Lio/github/sceneview/SceneView;

    invoke-virtual {v0, v1}, Lox4;->q(Lio/github/sceneview/SceneView;)V

    invoke-static {}, Ldl1;->j()Lcom/google/android/filament/TransformManager;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ar/sceneform/rendering/c;->j:Lox4;

    iget v1, v1, Lox4;->c:I

    invoke-virtual {v0, v1}, Lcom/google/android/filament/TransformManager;->getInstance(I)I

    move-result v1

    iget-object v2, p0, Lcom/google/ar/sceneform/rendering/c;->j:Lox4;

    invoke-virtual {v2}, Lox4;->p()LjN2;

    move-result-object v2

    iget-object v2, v2, LjN2;->a:[F

    invoke-virtual {v0, v1, v2}, Lcom/google/android/filament/TransformManager;->setTransform(I[F)V

    return-void
.end method

.method public final k()Z
    .locals 13

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->c:Lcom/google/ar/core/Plane;

    invoke-virtual {v0}, Lcom/google/ar/core/Plane;->getPolygon()Ljava/nio/FloatBuffer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_1

    return v1

    :cond_1
    mul-int/lit8 v3, v2, 0x2

    iget-object v4, p0, Lcom/google/ar/sceneform/rendering/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    iget-object v4, p0, Lcom/google/ar/sceneform/rendering/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->ensureCapacity(I)V

    mul-int/lit8 v3, v2, 0x6

    add-int/lit8 v4, v2, -0x2

    mul-int/lit8 v5, v4, 0x3

    add-int/2addr v3, v5

    iget-object v5, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    iget-object v5, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->ensureCapacity(I)V

    invoke-static {}, LQj6;->w()LQj6;

    move-result-object v3

    :goto_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->get()F

    move-result v5

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->get()F

    move-result v7

    iget-object v8, p0, Lcom/google/ar/sceneform/rendering/c;->k:Ljava/util/ArrayList;

    invoke-static {}, Lcom/google/ar/sceneform/rendering/h;->a()Lcom/google/ar/sceneform/rendering/h$b;

    move-result-object v9

    new-instance v10, LQj6;

    invoke-direct {v10, v5, v6, v7}, LQj6;-><init>(FFF)V

    invoke-virtual {v9, v10}, Lcom/google/ar/sceneform/rendering/h$b;->g(LQj6;)Lcom/google/ar/sceneform/rendering/h$b;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/google/ar/sceneform/rendering/h$b;->f(LQj6;)Lcom/google/ar/sceneform/rendering/h$b;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/ar/sceneform/rendering/h$b;->e()Lcom/google/ar/sceneform/rendering/h;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->get()F

    move-result v5

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->get()F

    move-result v7

    float-to-double v8, v5

    float-to-double v10, v7

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v8

    double-to-float v8, v8

    cmpl-float v9, v8, v6

    const/high16 v10, 0x3f800000    # 1.0f

    if-eqz v9, :cond_3

    const v9, 0x3e4ccccd    # 0.2f

    div-float v8, v9, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    move-result v8

    sub-float v8, v10, v8

    goto :goto_2

    :cond_3
    const v8, 0x3f4ccccd    # 0.8f

    :goto_2
    iget-object v9, p0, Lcom/google/ar/sceneform/rendering/c;->k:Ljava/util/ArrayList;

    invoke-static {}, Lcom/google/ar/sceneform/rendering/h;->a()Lcom/google/ar/sceneform/rendering/h$b;

    move-result-object v11

    new-instance v12, LQj6;

    mul-float/2addr v5, v8

    mul-float/2addr v7, v8

    invoke-direct {v12, v5, v10, v7}, LQj6;-><init>(FFF)V

    invoke-virtual {v11, v12}, Lcom/google/ar/sceneform/rendering/h$b;->g(LQj6;)Lcom/google/ar/sceneform/rendering/h$b;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/google/ar/sceneform/rendering/h$b;->f(LQj6;)Lcom/google/ar/sceneform/rendering/h$b;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/ar/sceneform/rendering/h$b;->e()Lcom/google/ar/sceneform/rendering/h;

    move-result-object v5

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    int-to-short v0, v2

    move v3, v1

    :goto_3
    if-ge v3, v4, :cond_5

    iget-object v5, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    add-int v6, v0, v3

    add-int/lit8 v7, v6, 0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    add-int/lit8 v6, v6, 0x2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    move v3, v1

    :goto_4
    if-ge v3, v2, :cond_6

    add-int v4, v1, v3

    add-int/lit8 v5, v3, 0x1

    rem-int v6, v5, v2

    add-int v7, v1, v6

    add-int/2addr v3, v0

    add-int/2addr v6, v0

    iget-object v8, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lcom/google/ar/sceneform/rendering/c;->l:Ljava/util/ArrayList;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v5

    goto :goto_4

    :cond_6
    const/4 v0, 0x1

    return v0
.end method

.method public y()LjN2;
    .locals 1

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/c;->d:LjN2;

    return-object v0
.end method
