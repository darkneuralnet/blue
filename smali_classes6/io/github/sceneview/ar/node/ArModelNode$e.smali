.class public final Lio/github/sceneview/ar/node/ArModelNode$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/ar/node/ArModelNode;->I1(LYU3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/github/sceneview/SceneView;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/github/sceneview/SceneView;",
        "sceneView",
        "",
        "a",
        "(Lio/github/sceneview/SceneView;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:LYU3;


# direct methods
.method public constructor <init>(LYU3;)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/ar/node/ArModelNode$e;->g:LYU3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/github/sceneview/SceneView;)V
    .locals 2

    const-string v0, "sceneView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/github/sceneview/ar/ArSceneView;

    if-eqz v0, :cond_0

    check-cast p1, Lio/github/sceneview/ar/ArSceneView;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/github/sceneview/ar/node/ArModelNode$e;->g:LYU3;

    invoke-virtual {v0}, LYU3;->e()Lcom/google/ar/core/Config$PlaneFindingMode;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/github/sceneview/ar/ArSceneView;->setPlaneFindingMode(Lcom/google/ar/core/Config$PlaneFindingMode;)V

    invoke-virtual {v0}, LYU3;->b()Z

    move-result v1

    invoke-virtual {p1, v1}, Lio/github/sceneview/ar/ArSceneView;->setDepthEnabled(Z)V

    invoke-virtual {v0}, LYU3;->c()Z

    move-result v0

    invoke-virtual {p1, v0}, Lio/github/sceneview/ar/ArSceneView;->setInstantPlacementEnabled(Z)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/github/sceneview/SceneView;

    invoke-virtual {p0, p1}, Lio/github/sceneview/ar/node/ArModelNode$e;->a(Lio/github/sceneview/SceneView;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
