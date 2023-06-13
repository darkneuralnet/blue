.class public Lio/github/sceneview/node/ViewNode;
.super Lio/github/sceneview/node/Node;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/sceneview/node/ViewNode$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\n\u001a\u00020\u0004H\u0016J\u0008\u0010\u000b\u001a\u00020\u0004H\u0016R\u0016\u0010\u000f\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR.\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/github/sceneview/node/ViewNode;",
        "Lio/github/sceneview/node/Node;",
        "LPy1;",
        "frameTime",
        "",
        "g",
        "Lio/github/sceneview/SceneView;",
        "sceneView",
        "q0",
        "r0",
        "P0",
        "N",
        "",
        "K",
        "I",
        "renderableId",
        "Lox4;",
        "value",
        "P",
        "Lox4;",
        "getRenderableInstance",
        "()Lox4;",
        "setRenderableInstance",
        "(Lox4;)V",
        "renderableInstance",
        "Lcom/google/ar/sceneform/rendering/i;",
        "O0",
        "()Lcom/google/ar/sceneform/rendering/i;",
        "renderable",
        "Q",
        "a",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final Q:Lio/github/sceneview/node/ViewNode$a;

.field public static final R:I

.field public static final S:Lhu1;

.field public static final T:LUc4;

.field public static final U:Lhu1;

.field public static final W:Lhu1;


# instance fields
.field public K:I

.field public P:Lox4;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Lio/github/sceneview/node/ViewNode$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/sceneview/node/ViewNode$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/github/sceneview/node/ViewNode;->Q:Lio/github/sceneview/node/ViewNode$a;

    const/16 v0, 0x8

    sput v0, Lio/github/sceneview/node/ViewNode;->R:I

    new-instance v0, Lhu1;

    const/4 v1, 0x0

    const v2, -0x42333333    # -0.1f

    invoke-direct {v0, v1, v1, v2}, Lhu1;-><init>(FFF)V

    sput-object v0, Lio/github/sceneview/node/ViewNode;->S:Lhu1;

    new-instance v0, LUc4;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xf

    const/4 v9, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v9}, LUc4;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/github/sceneview/node/ViewNode;->T:LUc4;

    invoke-virtual {v0}, LUc4;->e()Lhu1;

    move-result-object v0

    sput-object v0, Lio/github/sceneview/node/ViewNode;->U:Lhu1;

    new-instance v0, Lhu1;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Lhu1;-><init>(F)V

    sput-object v0, Lio/github/sceneview/node/ViewNode;->W:Lhu1;

    return-void
.end method


# virtual methods
.method public N()V
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/node/ViewNode;->P:Lox4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lox4;->g()V

    :cond_0
    invoke-super {p0}, Lio/github/sceneview/node/Node;->N()V

    return-void
.end method

.method public final O0()Lcom/google/ar/sceneform/rendering/i;
    .locals 3

    iget-object v0, p0, Lio/github/sceneview/node/ViewNode;->P:Lox4;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lox4;->n()Lcom/google/ar/sceneform/rendering/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Lcom/google/ar/sceneform/rendering/i;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/google/ar/sceneform/rendering/i;

    :cond_1
    return-object v1
.end method

.method public P0()V
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->v0()V

    invoke-virtual {p0}, Lio/github/sceneview/node/ViewNode;->O0()Lcom/google/ar/sceneform/rendering/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/d;->d()Lnm0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lio/github/sceneview/node/Node;->w0(Lnm0;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/ViewNode;->O0()Lcom/google/ar/sceneform/rendering/i;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/ar/sceneform/rendering/d;->f()LDh0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LDh0;->b()I

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput v0, p0, Lio/github/sceneview/node/ViewNode;->K:I

    return-void
.end method

.method public g(LPy1;)V
    .locals 2

    const-string v0, "frameTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lio/github/sceneview/node/Node;->g(LPy1;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->j0()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/github/sceneview/node/ViewNode;->P:Lox4;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object v0

    invoke-virtual {p1, v0}, Lox4;->q(Lio/github/sceneview/SceneView;)V

    :cond_0
    invoke-virtual {p0}, Lio/github/sceneview/node/ViewNode;->O0()Lcom/google/ar/sceneform/rendering/i;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/d;->f()LDh0;

    move-result-object p1

    iget v0, p0, Lio/github/sceneview/node/ViewNode;->K:I

    invoke-virtual {p1, v0}, LDh0;->a(I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lio/github/sceneview/node/ViewNode;->P0()V

    :cond_1
    iget-object p1, p0, Lio/github/sceneview/node/ViewNode;->P:Lox4;

    if-eqz p1, :cond_2

    invoke-static {}, Ldl1;->j()Lcom/google/android/filament/TransformManager;

    move-result-object v0

    invoke-virtual {p1}, Lox4;->p()LjN2;

    move-result-object v1

    iget-object v1, v1, LjN2;->a:[F

    invoke-virtual {p1, v0, v1}, Lox4;->s(Lcom/google/android/filament/TransformManager;[F)V

    :cond_2
    return-void
.end method

.method public q0(Lio/github/sceneview/SceneView;)V
    .locals 1

    const-string v0, "sceneView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lio/github/sceneview/node/Node;->q0(Lio/github/sceneview/SceneView;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/ViewNode;->O0()Lcom/google/ar/sceneform/rendering/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->e0()LFp6;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/ar/sceneform/rendering/i;->x(LFp6;)V

    :cond_0
    return-void
.end method

.method public r0(Lio/github/sceneview/SceneView;)V
    .locals 1

    const-string v0, "sceneView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lio/github/sceneview/node/Node;->r0(Lio/github/sceneview/SceneView;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/ViewNode;->O0()Lcom/google/ar/sceneform/rendering/i;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/ar/sceneform/rendering/i;->y()V

    :cond_0
    return-void
.end method
