.class public final Lio/github/sceneview/utils/SurfaceMirrorer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/sceneview/utils/SurfaceMirrorer$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/github/sceneview/utils/SurfaceMirrorer;",
        "Lrm5;",
        "LPy1;",
        "frameTime",
        "",
        "g",
        "Lcom/google/android/filament/Viewport;",
        "srcViewport",
        "destViewport",
        "a",
        "Lqm5;",
        "b",
        "Lqm5;",
        "lifecycle",
        "",
        "Lio/github/sceneview/utils/SurfaceMirrorer$a;",
        "c",
        "Ljava/util/List;",
        "surfaceMirrors",
        "Lio/github/sceneview/SceneView;",
        "()Lio/github/sceneview/SceneView;",
        "sceneView",
        "<init>",
        "(Lqm5;)V",
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
.field public final b:Lqm5;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/sceneview/utils/SurfaceMirrorer$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lqm5;)V
    .locals 1

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/sceneview/utils/SurfaceMirrorer;->b:Lqm5;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/github/sceneview/utils/SurfaceMirrorer;->c:Ljava/util/List;

    invoke-virtual {p1, p0}, LTX0;->a(LFq2;)V

    return-void
.end method


# virtual methods
.method public I(II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lrm5$a;->b(Lrm5;II)V

    return-void
.end method

.method public final a(Lcom/google/android/filament/Viewport;Lcom/google/android/filament/Viewport;)Lcom/google/android/filament/Viewport;
    .locals 5

    iget v0, p2, Lcom/google/android/filament/Viewport;->width:I

    int-to-float v1, v0

    iget p2, p2, Lcom/google/android/filament/Viewport;->height:I

    int-to-float v2, p2

    div-float/2addr v1, v2

    iget v2, p1, Lcom/google/android/filament/Viewport;->width:I

    int-to-float v3, v2

    iget p1, p1, Lcom/google/android/filament/Viewport;->height:I

    int-to-float v4, p1

    div-float/2addr v3, v4

    cmpl-float v1, v1, v3

    if-lez v1, :cond_0

    int-to-float v1, p2

    int-to-float v3, p1

    goto :goto_0

    :cond_0
    int-to-float v1, v0

    int-to-float v3, v2

    :goto_0
    div-float/2addr v1, v3

    int-to-float v2, v2

    mul-float/2addr v2, v1

    float-to-int v2, v2

    int-to-float p1, p1

    mul-float/2addr p1, v1

    float-to-int p1, p1

    new-instance v1, Lcom/google/android/filament/Viewport;

    sub-int/2addr v0, v2

    div-int/lit8 v0, v0, 0x2

    sub-int/2addr p2, p1

    div-int/lit8 p2, p2, 0x2

    invoke-direct {v1, v0, p2, v2, p1}, Lcom/google/android/filament/Viewport;-><init>(IIII)V

    return-object v1
.end method

.method public final b()Lio/github/sceneview/SceneView;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/utils/SurfaceMirrorer;->b:Lqm5;

    invoke-virtual {v0}, Lqm5;->r()Lio/github/sceneview/SceneView;

    move-result-object v0

    return-object v0
.end method

.method public g(LPy1;)V
    .locals 5

    const-string v0, "frameTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lrm5$a;->a(Lrm5;LPy1;)V

    iget-object p1, p0, Lio/github/sceneview/utils/SurfaceMirrorer;->c:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/sceneview/utils/SurfaceMirrorer$a;

    invoke-virtual {v0}, Lio/github/sceneview/utils/SurfaceMirrorer$a;->a()Lcom/google/android/filament/SwapChain;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lio/github/sceneview/utils/SurfaceMirrorer;->b()Lio/github/sceneview/SceneView;

    move-result-object v1

    invoke-virtual {v1}, Lio/github/sceneview/SceneView;->X()Lcom/google/android/filament/Renderer;

    move-result-object v1

    invoke-virtual {v0}, Lio/github/sceneview/utils/SurfaceMirrorer$a;->a()Lcom/google/android/filament/SwapChain;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/github/sceneview/utils/SurfaceMirrorer;->b()Lio/github/sceneview/SceneView;

    move-result-object v3

    invoke-virtual {v3}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/filament/View;->getViewport()Lcom/google/android/filament/Viewport;

    move-result-object v3

    const-string v4, "sceneView.view.viewport"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/github/sceneview/utils/SurfaceMirrorer$a;->b()Lcom/google/android/filament/Viewport;

    move-result-object v0

    invoke-virtual {p0, v3, v0}, Lio/github/sceneview/utils/SurfaceMirrorer;->a(Lcom/google/android/filament/Viewport;Lcom/google/android/filament/Viewport;)Lcom/google/android/filament/Viewport;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/sceneview/utils/SurfaceMirrorer;->b()Lio/github/sceneview/SceneView;

    move-result-object v3

    invoke-virtual {v3}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/filament/View;->getViewport()Lcom/google/android/filament/Viewport;

    move-result-object v3

    const/4 v4, 0x7

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/google/android/filament/Renderer;->copyFrame(Lcom/google/android/filament/SwapChain;Lcom/google/android/filament/Viewport;Lcom/google/android/filament/Viewport;I)V

    goto :goto_0

    :cond_1
    return-void
.end method
