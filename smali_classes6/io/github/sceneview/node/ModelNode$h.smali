.class public final Lio/github/sceneview/node/ModelNode$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/node/ModelNode;->f1(F)V
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

.field public final synthetic h:F


# direct methods
.method public constructor <init>(Lio/github/sceneview/node/ModelNode;F)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/node/ModelNode$h;->g:Lio/github/sceneview/node/ModelNode;

    iput p2, p0, Lio/github/sceneview/node/ModelNode$h;->h:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/filament/gltfio/FilamentInstance;)V
    .locals 5

    const-string v0, "modelInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LUU2;->a(Lcom/google/android/filament/gltfio/FilamentInstance;)Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getBoundingBox()Lcom/google/android/filament/Box;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/filament/Box;->getHalfExtent()[F

    move-result-object p1

    new-instance v0, Lhu1;

    const/4 v1, 0x0

    aget v1, p1, v1

    const/4 v2, 0x1

    aget v2, p1, v2

    const/4 v3, 0x2

    aget p1, p1, v3

    invoke-direct {v0, v1, v2, p1}, Lhu1;-><init>(FFF)V

    iget-object p1, p0, Lio/github/sceneview/node/ModelNode$h;->g:Lio/github/sceneview/node/ModelNode;

    new-instance v1, Lhu1;

    iget v2, p0, Lio/github/sceneview/node/ModelNode$h;->h:F

    invoke-virtual {v0}, Lhu1;->g()F

    move-result v3

    invoke-virtual {v0}, Lhu1;->h()F

    move-result v4

    invoke-virtual {v0}, Lhu1;->i()F

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v0, v3

    div-float/2addr v2, v0

    invoke-direct {v1, v2}, Lhu1;-><init>(F)V

    invoke-virtual {p1, v1}, Lio/github/sceneview/node/ModelNode;->k1(Lhu1;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/filament/gltfio/FilamentInstance;

    invoke-virtual {p0, p1}, Lio/github/sceneview/node/ModelNode$h;->a(Lcom/google/android/filament/gltfio/FilamentInstance;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
