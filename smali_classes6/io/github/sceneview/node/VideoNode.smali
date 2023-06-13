.class public Lio/github/sceneview/node/VideoNode;
.super Lio/github/sceneview/node/ModelNode;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0017\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR,\u0010\u0017\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0006@BX\u0086.\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R$\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188\u0006@BX\u0086.\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/github/sceneview/node/VideoNode;",
        "Lio/github/sceneview/node/ModelNode;",
        "LPy1;",
        "frameTime",
        "",
        "g",
        "LLifecycleOwner;",
        "owner",
        "onDestroy",
        "",
        "w0",
        "Z",
        "isAlwaysLookAtCamera",
        "()Z",
        "setAlwaysLookAtCamera",
        "(Z)V",
        "Lcom/google/android/filament/gltfio/FilamentAsset;",
        "Lio/github/sceneview/model/Model;",
        "<set-?>",
        "x0",
        "Lcom/google/android/filament/gltfio/FilamentAsset;",
        "m1",
        "()Lcom/google/android/filament/gltfio/FilamentAsset;",
        "model",
        "Lcom/google/android/filament/Material;",
        "y0",
        "Lcom/google/android/filament/Material;",
        "l1",
        "()Lcom/google/android/filament/Material;",
        "material",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public w0:Z

.field public x0:Lcom/google/android/filament/gltfio/FilamentAsset;

.field public y0:Lcom/google/android/filament/Material;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public g(LPy1;)V
    .locals 1

    const-string v0, "frameTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lio/github/sceneview/node/ModelNode;->g(LPy1;)V

    iget-boolean p1, p0, Lio/github/sceneview/node/VideoNode;->w0:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->b0()Lio/github/sceneview/SceneView;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->getCameraNode()Lcom/google/ar/sceneform/CameraNode;

    move-result-object p1

    invoke-virtual {p1}, Lio/github/sceneview/node/Node;->g0()Lhu1;

    move-result-object p1

    invoke-static {p1}, LgN2;->q(Lhu1;)LQj6;

    move-result-object p1

    invoke-virtual {p0}, Lio/github/sceneview/node/Node;->g0()Lhu1;

    move-result-object v0

    invoke-static {v0}, LgN2;->q(Lhu1;)LQj6;

    move-result-object v0

    invoke-static {p1, v0}, LQj6;->v(LQj6;LQj6;)LQj6;

    move-result-object p1

    invoke-static {}, LQj6;->w()LQj6;

    move-result-object v0

    invoke-static {p1, v0}, LVc4;->d(LQj6;LQj6;)LVc4;

    move-result-object p1

    const-string v0, "lookRotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LgN2;->o(LVc4;)LUc4;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/github/sceneview/node/Node;->A0(LUc4;)V

    :cond_0
    return-void
.end method

.method public final l1()Lcom/google/android/filament/Material;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/node/VideoNode;->y0:Lcom/google/android/filament/Material;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "material"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final m1()Lcom/google/android/filament/gltfio/FilamentAsset;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/node/VideoNode;->x0:Lcom/google/android/filament/gltfio/FilamentAsset;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "model"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onDestroy(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lio/github/sceneview/node/Node;->onDestroy(LLifecycleOwner;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/VideoNode;->m1()Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object p1

    invoke-static {p1}, LVU2;->a(Lcom/google/android/filament/gltfio/FilamentAsset;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/VideoNode;->l1()Lcom/google/android/filament/Material;

    move-result-object p1

    invoke-static {p1}, LKM2;->b(Lcom/google/android/filament/Material;)V

    invoke-virtual {p0}, Lio/github/sceneview/node/RenderableNode;->O0()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/filament/MaterialInstance;

    invoke-static {v0}, LJM2;->a(Lcom/google/android/filament/MaterialInstance;)V

    goto :goto_0

    :cond_0
    return-void
.end method
