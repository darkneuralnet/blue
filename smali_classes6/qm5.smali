.class public Lqm5;
.super LTX0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "Lqm5;",
        "LTX0;",
        "Lio/github/sceneview/SceneView;",
        "l",
        "Lio/github/sceneview/SceneView;",
        "r",
        "()Lio/github/sceneview/SceneView;",
        "sceneView",
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
.field public final l:Lio/github/sceneview/SceneView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lio/github/sceneview/SceneView;)V
    .locals 1

    const-string v0, "sceneView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LTX0;-><init>(LLifecycleOwner;)V

    iput-object p1, p0, Lqm5;->l:Lio/github/sceneview/SceneView;

    return-void
.end method


# virtual methods
.method public r()Lio/github/sceneview/SceneView;
    .locals 1

    iget-object v0, p0, Lqm5;->l:Lio/github/sceneview/SceneView;

    return-object v0
.end method
