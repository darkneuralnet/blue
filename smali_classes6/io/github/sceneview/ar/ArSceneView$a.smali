.class public final Lio/github/sceneview/ar/ArSceneView$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/ar/ArSceneView;->setCameraFacingDirection(Lcom/google/ar/core/CameraConfig$FacingDirection;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "Lcom/google/ar/core/Config;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "arSession",
        "Lcom/google/ar/core/Config;",
        "config",
        "",
        "a",
        "(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Lcom/google/ar/core/CameraConfig$FacingDirection;


# direct methods
.method public constructor <init>(Lcom/google/ar/core/CameraConfig$FacingDirection;)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/ar/ArSceneView$a;->g:Lcom/google/ar/core/CameraConfig$FacingDirection;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V
    .locals 1

    const-string v0, "arSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/google/ar/core/CameraConfigFilter;

    invoke-direct {p2, p1}, Lcom/google/ar/core/CameraConfigFilter;-><init>(Lcom/google/ar/core/Session;)V

    iget-object v0, p0, Lio/github/sceneview/ar/ArSceneView$a;->g:Lcom/google/ar/core/CameraConfig$FacingDirection;

    invoke-virtual {p2, v0}, Lcom/google/ar/core/CameraConfigFilter;->setFacingDirection(Lcom/google/ar/core/CameraConfig$FacingDirection;)Lcom/google/ar/core/CameraConfigFilter;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/google/ar/core/Session;->getSupportedCameraConfigs(Lcom/google/ar/core/CameraConfigFilter;)Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/ar/core/CameraConfig;

    invoke-virtual {p1, p2}, Lcom/google/ar/core/Session;->setCameraConfig(Lcom/google/ar/core/CameraConfig;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/github/sceneview/ar/arcore/ArSession;

    check-cast p2, Lcom/google/ar/core/Config;

    invoke-virtual {p0, p1, p2}, Lio/github/sceneview/ar/ArSceneView$a;->a(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
