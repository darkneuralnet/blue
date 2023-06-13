.class public final Lio/github/sceneview/SceneView$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/SceneView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/google/ar/sceneform/CameraNode;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/google/android/filament/utils/Manipulator;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lcom/google/android/filament/utils/Manipulator;",
        "b",
        "()Lcom/google/android/filament/utils/Manipulator;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:Lio/github/sceneview/SceneView;

.field public final synthetic h:Lcom/google/ar/sceneform/CameraNode;


# direct methods
.method public constructor <init>(Lio/github/sceneview/SceneView;Lcom/google/ar/sceneform/CameraNode;)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/SceneView$g;->g:Lio/github/sceneview/SceneView;

    iput-object p2, p0, Lio/github/sceneview/SceneView$g;->h:Lcom/google/ar/sceneform/CameraNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lcom/google/android/filament/utils/Manipulator;
    .locals 5

    new-instance v0, Lcom/google/android/filament/utils/Manipulator$Builder;

    invoke-direct {v0}, Lcom/google/android/filament/utils/Manipulator$Builder;-><init>()V

    iget-object v1, p0, Lio/github/sceneview/SceneView$g;->h:Lcom/google/ar/sceneform/CameraNode;

    iget-object v2, p0, Lio/github/sceneview/SceneView$g;->g:Lio/github/sceneview/SceneView;

    invoke-virtual {v1}, Lio/github/sceneview/node/Node;->g0()Lhu1;

    move-result-object v1

    invoke-virtual {v1}, Lhu1;->a()F

    move-result v3

    invoke-virtual {v1}, Lhu1;->b()F

    move-result v4

    invoke-virtual {v1}, Lhu1;->c()F

    move-result v1

    invoke-virtual {v0, v3, v4, v1}, Lcom/google/android/filament/utils/Manipulator$Builder;->orbitHomePosition(FFF)Lcom/google/android/filament/utils/Manipulator$Builder;

    invoke-virtual {v2}, Lio/github/sceneview/SceneView;->P()Lio/github/sceneview/node/Node;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/github/sceneview/node/Node;->g0()Lhu1;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhu1;->a()F

    move-result v2

    invoke-virtual {v1}, Lhu1;->b()F

    move-result v3

    invoke-virtual {v1}, Lhu1;->c()F

    move-result v1

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/filament/utils/Manipulator$Builder;->targetPosition(FFF)Lcom/google/android/filament/utils/Manipulator$Builder;

    :cond_0
    iget-object v1, p0, Lio/github/sceneview/SceneView$g;->g:Lio/github/sceneview/SceneView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iget-object v2, p0, Lio/github/sceneview/SceneView$g;->g:Lio/github/sceneview/SceneView;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/filament/utils/Manipulator$Builder;->viewport(II)Lcom/google/android/filament/utils/Manipulator$Builder;

    move-result-object v0

    const v1, 0x3d4ccccd    # 0.05f

    invoke-virtual {v0, v1}, Lcom/google/android/filament/utils/Manipulator$Builder;->zoomSpeed(F)Lcom/google/android/filament/utils/Manipulator$Builder;

    move-result-object v0

    sget-object v1, Lcom/google/android/filament/utils/Manipulator$Mode;->ORBIT:Lcom/google/android/filament/utils/Manipulator$Mode;

    invoke-virtual {v0, v1}, Lcom/google/android/filament/utils/Manipulator$Builder;->build(Lcom/google/android/filament/utils/Manipulator$Mode;)Lcom/google/android/filament/utils/Manipulator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/SceneView$g;->b()Lcom/google/android/filament/utils/Manipulator;

    move-result-object v0

    return-object v0
.end method
