.class public final Lio/github/sceneview/SceneView$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/filament/android/UiHelper$RendererCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/sceneview/SceneView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016\u00a8\u0006\r"
    }
    d2 = {
        "Lio/github/sceneview/SceneView$d;",
        "Lcom/google/android/filament/android/UiHelper$RendererCallback;",
        "Landroid/view/Surface;",
        "surface",
        "",
        "onNativeWindowChanged",
        "onDetachedFromSurface",
        "",
        "width",
        "height",
        "onResized",
        "<init>",
        "(Lio/github/sceneview/SceneView;)V",
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
.field public final synthetic a:Lio/github/sceneview/SceneView;


# direct methods
.method public constructor <init>(Lio/github/sceneview/SceneView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDetachedFromSurface()V
    .locals 3

    iget-object v0, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    invoke-static {v0}, Lio/github/sceneview/SceneView;->access$getDisplayHelper$p(Lio/github/sceneview/SceneView;)Lcom/google/android/filament/android/DisplayHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/android/DisplayHelper;->detach()V

    iget-object v0, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    invoke-static {v0}, Lio/github/sceneview/SceneView;->access$getSwapChain$p(Lio/github/sceneview/SceneView;)Lcom/google/android/filament/SwapChain;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/filament/Engine;->destroySwapChain(Lcom/google/android/filament/SwapChain;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/Engine;->flushAndWait()V

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lio/github/sceneview/SceneView;->access$setSwapChain$p(Lio/github/sceneview/SceneView;Lcom/google/android/filament/SwapChain;)V

    :cond_0
    return-void
.end method

.method public onNativeWindowChanged(Landroid/view/Surface;)V
    .locals 2

    const-string v0, "surface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    invoke-static {v0}, Lio/github/sceneview/SceneView;->access$getSwapChain$p(Lio/github/sceneview/SceneView;)Lcom/google/android/filament/SwapChain;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/filament/Engine;->destroySwapChain(Lcom/google/android/filament/SwapChain;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    :cond_0
    iget-object v0, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/filament/Engine;->createSwapChain(Ljava/lang/Object;)Lcom/google/android/filament/SwapChain;

    move-result-object p1

    invoke-static {v0, p1}, Lio/github/sceneview/SceneView;->access$setSwapChain$p(Lio/github/sceneview/SceneView;Lcom/google/android/filament/SwapChain;)V

    iget-object p1, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    invoke-static {p1}, Lio/github/sceneview/SceneView;->access$getDisplayHelper$p(Lio/github/sceneview/SceneView;)Lcom/google/android/filament/android/DisplayHelper;

    move-result-object p1

    iget-object v0, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->X()Lcom/google/android/filament/Renderer;

    move-result-object v0

    iget-object v1, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    invoke-virtual {v1}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/filament/android/DisplayHelper;->attach(Lcom/google/android/filament/Renderer;Landroid/view/Display;)V

    return-void
.end method

.method public onResized(II)V
    .locals 3

    iget-object v0, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->d0()Lcom/google/android/filament/View;

    move-result-object v0

    new-instance v1, Lcom/google/android/filament/Viewport;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, p1, p2}, Lcom/google/android/filament/Viewport;-><init>(IIII)V

    invoke-virtual {v0, v1}, Lcom/google/android/filament/View;->setViewport(Lcom/google/android/filament/Viewport;)V

    iget-object v0, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->getCameraManipulator()Lcom/google/android/filament/utils/Manipulator;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/filament/utils/Manipulator;->setViewport(II)V

    :cond_0
    iget-object p1, p0, Lio/github/sceneview/SceneView$d;->a:Lio/github/sceneview/SceneView;

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->getCameraNode()Lcom/google/ar/sceneform/CameraNode;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/ar/sceneform/CameraNode;->U0()V

    return-void
.end method
