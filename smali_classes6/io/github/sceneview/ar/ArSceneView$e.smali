.class public final Lio/github/sceneview/ar/ArSceneView$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/ar/ArSceneView;->m(Lio/github/sceneview/ar/arcore/ArSession;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/ar/core/Config;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/google/ar/core/Config;",
        "config",
        "",
        "a",
        "(Lcom/google/ar/core/Config;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Lio/github/sceneview/ar/ArSceneView;


# direct methods
.method public constructor <init>(Lio/github/sceneview/ar/ArSceneView;)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/ar/ArSceneView$e;->g:Lio/github/sceneview/ar/ArSceneView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/Config;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/ar/ArSceneView$e;->g:Lio/github/sceneview/ar/ArSceneView;

    invoke-static {v0}, Lio/github/sceneview/ar/ArSceneView;->access$get_planeFindingMode$p(Lio/github/sceneview/ar/ArSceneView;)Lcom/google/ar/core/Config$PlaneFindingMode;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/ar/core/Config;->setPlaneFindingMode(Lcom/google/ar/core/Config$PlaneFindingMode;)Lcom/google/ar/core/Config;

    iget-object v0, p0, Lio/github/sceneview/ar/ArSceneView$e;->g:Lio/github/sceneview/ar/ArSceneView;

    invoke-static {v0}, Lio/github/sceneview/ar/ArSceneView;->access$get_depthMode$p(Lio/github/sceneview/ar/ArSceneView;)Lcom/google/ar/core/Config$DepthMode;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/ar/core/Config;->setDepthMode(Lcom/google/ar/core/Config$DepthMode;)Lcom/google/ar/core/Config;

    iget-object v0, p0, Lio/github/sceneview/ar/ArSceneView$e;->g:Lio/github/sceneview/ar/ArSceneView;

    invoke-static {v0}, Lio/github/sceneview/ar/ArSceneView;->access$get_instantPlacementEnabled$p(Lio/github/sceneview/ar/ArSceneView;)Z

    move-result v0

    invoke-static {p1, v0}, LAm;->g(Lcom/google/ar/core/Config;Z)V

    iget-object v0, p0, Lio/github/sceneview/ar/ArSceneView$e;->g:Lio/github/sceneview/ar/ArSceneView;

    invoke-static {v0}, Lio/github/sceneview/ar/ArSceneView;->access$get_cloudAnchorEnabled$p(Lio/github/sceneview/ar/ArSceneView;)Z

    move-result v0

    invoke-static {p1, v0}, LAm;->e(Lcom/google/ar/core/Config;Z)V

    iget-object v0, p0, Lio/github/sceneview/ar/ArSceneView$e;->g:Lio/github/sceneview/ar/ArSceneView;

    invoke-static {v0}, Lio/github/sceneview/ar/ArSceneView;->access$get_sessionLightEstimationMode$p(Lio/github/sceneview/ar/ArSceneView;)Lcom/google/ar/core/Config$LightEstimationMode;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/ar/core/Config;->setLightEstimationMode(Lcom/google/ar/core/Config$LightEstimationMode;)Lcom/google/ar/core/Config;

    iget-object v0, p0, Lio/github/sceneview/ar/ArSceneView$e;->g:Lio/github/sceneview/ar/ArSceneView;

    invoke-static {v0}, Lio/github/sceneview/ar/ArSceneView;->access$get_geospatialEnabled$p(Lio/github/sceneview/ar/ArSceneView;)Z

    move-result v0

    invoke-static {p1, v0}, LAm;->f(Lcom/google/ar/core/Config;Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/ar/core/Config;

    invoke-virtual {p0, p1}, Lio/github/sceneview/ar/ArSceneView$e;->a(Lcom/google/ar/core/Config;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
