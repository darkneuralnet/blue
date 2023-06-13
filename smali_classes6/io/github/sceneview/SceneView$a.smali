.class public final Lio/github/sceneview/SceneView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHb0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/sceneview/SceneView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\r\u001a\u00020\u0007H\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/github/sceneview/SceneView$a;",
        "LHb0$b;",
        "",
        "x",
        "y",
        "",
        "scrollDelta",
        "",
        "onScroll",
        "",
        "strafe",
        "b",
        "c",
        "a",
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

    iput-object p1, p0, Lio/github/sceneview/SceneView$a;->a:Lio/github/sceneview/SceneView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView$a;->a:Lio/github/sceneview/SceneView;

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->getCameraManipulator()Lcom/google/android/filament/utils/Manipulator;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Manipulator;->grabEnd()V

    :cond_0
    return-void
.end method

.method public b(IIZ)V
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView$a;->a:Lio/github/sceneview/SceneView;

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->getCameraManipulator()Lcom/google/android/filament/utils/Manipulator;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/filament/utils/Manipulator;->grabBegin(IIZ)V

    :cond_0
    return-void
.end method

.method public c(II)V
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView$a;->a:Lio/github/sceneview/SceneView;

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->getCameraManipulator()Lcom/google/android/filament/utils/Manipulator;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/filament/utils/Manipulator;->grabUpdate(II)V

    :cond_0
    return-void
.end method

.method public onScroll(IIF)V
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/SceneView$a;->a:Lio/github/sceneview/SceneView;

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->getCameraManipulator()Lcom/google/android/filament/utils/Manipulator;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/filament/utils/Manipulator;->scroll(IIF)V

    :cond_0
    return-void
.end method
