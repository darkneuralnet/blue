.class final Lio/github/sceneview/SceneView$parentLifecycleObserver$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/SceneView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/google/ar/sceneform/CameraNode;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"
    }
    d2 = {
        "LLifecycleOwner;",
        "<anonymous parameter 0>",
        "Landroidx/lifecycle/f$a;",
        "event",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/github/sceneview/SceneView;


# direct methods
.method public constructor <init>(Lio/github/sceneview/SceneView;)V
    .locals 0

    iput-object p1, p0, Lio/github/sceneview/SceneView$parentLifecycleObserver$1;->b:Lio/github/sceneview/SceneView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStateChanged(LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 1

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/github/sceneview/SceneView$parentLifecycleObserver$1;->b:Lio/github/sceneview/SceneView;

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object p1

    invoke-virtual {p2}, Landroidx/lifecycle/f$a;->c()Landroidx/lifecycle/f$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/lifecycle/j;->o(Landroidx/lifecycle/f$b;)V

    return-void
.end method
