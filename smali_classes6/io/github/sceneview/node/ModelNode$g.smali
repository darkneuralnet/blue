.class public final Lio/github/sceneview/node/ModelNode$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/node/ModelNode;->Z0(Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lio/github/sceneview/node/ModelNode;
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
.field public final synthetic g:Lio/github/sceneview/node/ModelNode;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Float;

.field public final synthetic k:Lhu1;

.field public final synthetic l:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/google/android/filament/gltfio/FilamentInstance;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/github/sceneview/node/ModelNode;Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/sceneview/node/ModelNode;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Float;",
            "Lhu1;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/google/android/filament/gltfio/FilamentInstance;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/github/sceneview/node/ModelNode$g;->g:Lio/github/sceneview/node/ModelNode;

    iput-object p2, p0, Lio/github/sceneview/node/ModelNode$g;->h:Ljava/lang/String;

    iput-boolean p3, p0, Lio/github/sceneview/node/ModelNode$g;->i:Z

    iput-object p4, p0, Lio/github/sceneview/node/ModelNode$g;->j:Ljava/lang/Float;

    iput-object p5, p0, Lio/github/sceneview/node/ModelNode$g;->k:Lhu1;

    iput-object p6, p0, Lio/github/sceneview/node/ModelNode$g;->l:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lio/github/sceneview/node/ModelNode$g;->m:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/github/sceneview/SceneView;)V
    .locals 12

    const-string v0, "sceneView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/github/sceneview/SceneView;->getLifecycle()Lqm5;

    move-result-object v0

    invoke-static {v0}, LBq2;->a(Landroidx/lifecycle/f;)Lzq2;

    move-result-object v0

    new-instance v11, Lio/github/sceneview/node/ModelNode$g$a;

    iget-object v2, p0, Lio/github/sceneview/node/ModelNode$g;->g:Lio/github/sceneview/node/ModelNode;

    iget-object v4, p0, Lio/github/sceneview/node/ModelNode$g;->h:Ljava/lang/String;

    iget-boolean v5, p0, Lio/github/sceneview/node/ModelNode$g;->i:Z

    iget-object v6, p0, Lio/github/sceneview/node/ModelNode$g;->j:Ljava/lang/Float;

    iget-object v7, p0, Lio/github/sceneview/node/ModelNode$g;->k:Lhu1;

    iget-object v8, p0, Lio/github/sceneview/node/ModelNode$g;->l:Lkotlin/jvm/functions/Function1;

    iget-object v9, p0, Lio/github/sceneview/node/ModelNode$g;->m:Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    move-object v1, v11

    move-object v3, p1

    invoke-direct/range {v1 .. v10}, Lio/github/sceneview/node/ModelNode$g$a;-><init>(Lio/github/sceneview/node/ModelNode;Lio/github/sceneview/SceneView;Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {v0, v11}, Lzq2;->b(Lkotlin/jvm/functions/Function2;)Lzh2;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/github/sceneview/SceneView;

    invoke-virtual {p0, p1}, Lio/github/sceneview/node/ModelNode$g;->a(Lio/github/sceneview/SceneView;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
