.class public final Lio/github/sceneview/node/ModelNode$g$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/node/ModelNode$g;->a(Lio/github/sceneview/SceneView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LZC0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "io.github.sceneview.node.ModelNode$loadModelGlbAsync$1$1"
    f = "ModelNode.kt"
    i = {}
    l = {
        0x172
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Lio/github/sceneview/node/ModelNode;

.field public final synthetic j:Lio/github/sceneview/SceneView;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Z

.field public final synthetic m:Ljava/lang/Float;

.field public final synthetic n:Lhu1;

.field public final synthetic o:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic p:Lkotlin/jvm/functions/Function1;
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
.method public constructor <init>(Lio/github/sceneview/node/ModelNode;Lio/github/sceneview/SceneView;Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/sceneview/node/ModelNode;",
            "Lio/github/sceneview/SceneView;",
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
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lio/github/sceneview/node/ModelNode$g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/github/sceneview/node/ModelNode$g$a;->i:Lio/github/sceneview/node/ModelNode;

    iput-object p2, p0, Lio/github/sceneview/node/ModelNode$g$a;->j:Lio/github/sceneview/SceneView;

    iput-object p3, p0, Lio/github/sceneview/node/ModelNode$g$a;->k:Ljava/lang/String;

    iput-boolean p4, p0, Lio/github/sceneview/node/ModelNode$g$a;->l:Z

    iput-object p5, p0, Lio/github/sceneview/node/ModelNode$g$a;->m:Ljava/lang/Float;

    iput-object p6, p0, Lio/github/sceneview/node/ModelNode$g$a;->n:Lhu1;

    iput-object p7, p0, Lio/github/sceneview/node/ModelNode$g$a;->o:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lio/github/sceneview/node/ModelNode$g$a;->p:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/github/sceneview/node/ModelNode$g$a;

    iget-object v1, p0, Lio/github/sceneview/node/ModelNode$g$a;->i:Lio/github/sceneview/node/ModelNode;

    iget-object v2, p0, Lio/github/sceneview/node/ModelNode$g$a;->j:Lio/github/sceneview/SceneView;

    iget-object v3, p0, Lio/github/sceneview/node/ModelNode$g$a;->k:Ljava/lang/String;

    iget-boolean v4, p0, Lio/github/sceneview/node/ModelNode$g$a;->l:Z

    iget-object v5, p0, Lio/github/sceneview/node/ModelNode$g$a;->m:Ljava/lang/Float;

    iget-object v6, p0, Lio/github/sceneview/node/ModelNode$g$a;->n:Lhu1;

    iget-object v7, p0, Lio/github/sceneview/node/ModelNode$g$a;->o:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lio/github/sceneview/node/ModelNode$g$a;->p:Lkotlin/jvm/functions/Function1;

    move-object v0, p1

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lio/github/sceneview/node/ModelNode$g$a;-><init>(Lio/github/sceneview/node/ModelNode;Lio/github/sceneview/SceneView;Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lio/github/sceneview/node/ModelNode$g$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/github/sceneview/node/ModelNode$g$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/github/sceneview/node/ModelNode$g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/github/sceneview/node/ModelNode$g$a;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lio/github/sceneview/node/ModelNode$g$a;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, p0, Lio/github/sceneview/node/ModelNode$g$a;->i:Lio/github/sceneview/node/ModelNode;

    iget-object p1, p0, Lio/github/sceneview/node/ModelNode$g$a;->j:Lio/github/sceneview/SceneView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v3, "sceneView.context"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lio/github/sceneview/node/ModelNode$g$a;->k:Ljava/lang/String;

    iget-boolean v4, p0, Lio/github/sceneview/node/ModelNode$g$a;->l:Z

    iget-object v5, p0, Lio/github/sceneview/node/ModelNode$g$a;->m:Ljava/lang/Float;

    iget-object v6, p0, Lio/github/sceneview/node/ModelNode$g$a;->n:Lhu1;

    iget-object v7, p0, Lio/github/sceneview/node/ModelNode$g$a;->o:Lkotlin/jvm/functions/Function1;

    iput v2, p0, Lio/github/sceneview/node/ModelNode$g$a;->h:I

    move-object v2, p1

    move-object v8, p0

    invoke-virtual/range {v1 .. v8}, Lio/github/sceneview/node/ModelNode;->Y0(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/google/android/filament/gltfio/FilamentInstance;

    if-eqz p1, :cond_3

    iget-object v0, p0, Lio/github/sceneview/node/ModelNode$g$a;->p:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
