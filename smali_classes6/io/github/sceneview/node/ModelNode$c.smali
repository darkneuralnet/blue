.class public final Lio/github/sceneview/node/ModelNode$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/node/ModelNode;->Q0(Lhu1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/android/filament/gltfio/FilamentInstance;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/google/android/filament/gltfio/FilamentInstance;",
        "Lio/github/sceneview/model/ModelInstance;",
        "modelInstance",
        "",
        "a",
        "(Lcom/google/android/filament/gltfio/FilamentInstance;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Lio/github/sceneview/node/ModelNode;

.field public final synthetic h:Lhu1;


# direct methods
.method public constructor <init>(Lio/github/sceneview/node/ModelNode;Lhu1;)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/node/ModelNode$c;->g:Lio/github/sceneview/node/ModelNode;

    iput-object p2, p0, Lio/github/sceneview/node/ModelNode$c;->h:Lhu1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/filament/gltfio/FilamentInstance;)V
    .locals 7

    const-string v0, "modelInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LUU2;->a(Lcom/google/android/filament/gltfio/FilamentInstance;)Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->getBoundingBox()Lcom/google/android/filament/Box;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/Box;->getCenter()[F

    move-result-object v0

    new-instance v1, Lhu1;

    const/4 v2, 0x0

    aget v3, v0, v2

    const/4 v4, 0x1

    aget v5, v0, v4

    const/4 v6, 0x2

    aget v0, v0, v6

    invoke-direct {v1, v3, v5, v0}, Lhu1;-><init>(FFF)V

    invoke-static {p1}, LUU2;->a(Lcom/google/android/filament/gltfio/FilamentInstance;)Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getBoundingBox()Lcom/google/android/filament/Box;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/filament/Box;->getHalfExtent()[F

    move-result-object p1

    new-instance v0, Lhu1;

    aget v2, p1, v2

    aget v3, p1, v4

    aget p1, p1, v6

    invoke-direct {v0, v2, v3, p1}, Lhu1;-><init>(FFF)V

    iget-object p1, p0, Lio/github/sceneview/node/ModelNode$c;->g:Lio/github/sceneview/node/ModelNode;

    iget-object v2, p0, Lio/github/sceneview/node/ModelNode$c;->h:Lhu1;

    new-instance v3, Lhu1;

    invoke-virtual {v0}, Lhu1;->g()F

    move-result v4

    invoke-virtual {v2}, Lhu1;->g()F

    move-result v5

    mul-float/2addr v4, v5

    invoke-virtual {v0}, Lhu1;->h()F

    move-result v5

    invoke-virtual {v2}, Lhu1;->h()F

    move-result v6

    mul-float/2addr v5, v6

    invoke-virtual {v0}, Lhu1;->i()F

    move-result v0

    invoke-virtual {v2}, Lhu1;->i()F

    move-result v2

    mul-float/2addr v0, v2

    invoke-direct {v3, v4, v5, v0}, Lhu1;-><init>(FFF)V

    new-instance v0, Lhu1;

    invoke-virtual {v1}, Lhu1;->g()F

    move-result v2

    invoke-virtual {v3}, Lhu1;->g()F

    move-result v4

    add-float/2addr v2, v4

    invoke-virtual {v1}, Lhu1;->h()F

    move-result v4

    invoke-virtual {v3}, Lhu1;->h()F

    move-result v5

    add-float/2addr v4, v5

    invoke-virtual {v1}, Lhu1;->i()F

    move-result v1

    invoke-virtual {v3}, Lhu1;->i()F

    move-result v3

    add-float/2addr v1, v3

    invoke-direct {v0, v2, v4, v1}, Lhu1;-><init>(FFF)V

    invoke-virtual {v0}, Lhu1;->n()Lhu1;

    move-result-object v0

    iget-object v1, p0, Lio/github/sceneview/node/ModelNode$c;->g:Lio/github/sceneview/node/ModelNode;

    invoke-virtual {v1}, Lio/github/sceneview/node/ModelNode;->V0()Lhu1;

    move-result-object v1

    new-instance v2, Lhu1;

    invoke-virtual {v0}, Lhu1;->g()F

    move-result v3

    invoke-virtual {v1}, Lhu1;->g()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {v0}, Lhu1;->h()F

    move-result v4

    invoke-virtual {v1}, Lhu1;->h()F

    move-result v5

    mul-float/2addr v4, v5

    invoke-virtual {v0}, Lhu1;->i()F

    move-result v0

    invoke-virtual {v1}, Lhu1;->i()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-direct {v2, v3, v4, v0}, Lhu1;-><init>(FFF)V

    invoke-virtual {p1, v2}, Lio/github/sceneview/node/ModelNode;->j1(Lhu1;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/filament/gltfio/FilamentInstance;

    invoke-virtual {p0, p1}, Lio/github/sceneview/node/ModelNode$c;->a(Lcom/google/android/filament/gltfio/FilamentInstance;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
