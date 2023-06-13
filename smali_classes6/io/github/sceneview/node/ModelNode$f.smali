.class public final Lio/github/sceneview/node/ModelNode$f;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/node/ModelNode;->Y0(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "io.github.sceneview.node.ModelNode$loadModelGlb$2$1"
    f = "ModelNode.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Lio/github/sceneview/node/ModelNode;

.field public final synthetic j:Lcom/google/android/filament/gltfio/FilamentAsset;

.field public final synthetic k:Z

.field public final synthetic l:Ljava/lang/Float;

.field public final synthetic m:Lhu1;


# direct methods
.method public constructor <init>(Lio/github/sceneview/node/ModelNode;Lcom/google/android/filament/gltfio/FilamentAsset;ZLjava/lang/Float;Lhu1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/sceneview/node/ModelNode;",
            "Lcom/google/android/filament/gltfio/FilamentAsset;",
            "Z",
            "Ljava/lang/Float;",
            "Lhu1;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lio/github/sceneview/node/ModelNode$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/github/sceneview/node/ModelNode$f;->i:Lio/github/sceneview/node/ModelNode;

    iput-object p2, p0, Lio/github/sceneview/node/ModelNode$f;->j:Lcom/google/android/filament/gltfio/FilamentAsset;

    iput-boolean p3, p0, Lio/github/sceneview/node/ModelNode$f;->k:Z

    iput-object p4, p0, Lio/github/sceneview/node/ModelNode$f;->l:Ljava/lang/Float;

    iput-object p5, p0, Lio/github/sceneview/node/ModelNode$f;->m:Lhu1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance p1, Lio/github/sceneview/node/ModelNode$f;

    iget-object v1, p0, Lio/github/sceneview/node/ModelNode$f;->i:Lio/github/sceneview/node/ModelNode;

    iget-object v2, p0, Lio/github/sceneview/node/ModelNode$f;->j:Lcom/google/android/filament/gltfio/FilamentAsset;

    iget-boolean v3, p0, Lio/github/sceneview/node/ModelNode$f;->k:Z

    iget-object v4, p0, Lio/github/sceneview/node/ModelNode$f;->l:Ljava/lang/Float;

    iget-object v5, p0, Lio/github/sceneview/node/ModelNode$f;->m:Lhu1;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lio/github/sceneview/node/ModelNode$f;-><init>(Lio/github/sceneview/node/ModelNode;Lcom/google/android/filament/gltfio/FilamentAsset;ZLjava/lang/Float;Lhu1;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lio/github/sceneview/node/ModelNode$f;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lio/github/sceneview/node/ModelNode$f;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lio/github/sceneview/node/ModelNode$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lio/github/sceneview/node/ModelNode$f;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lio/github/sceneview/node/ModelNode$f;->h:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/github/sceneview/node/ModelNode$f;->i:Lio/github/sceneview/node/ModelNode;

    iget-object v0, p0, Lio/github/sceneview/node/ModelNode$f;->j:Lcom/google/android/filament/gltfio/FilamentAsset;

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->getInstance()Lcom/google/android/filament/gltfio/FilamentInstance;

    move-result-object v0

    iget-boolean v1, p0, Lio/github/sceneview/node/ModelNode$f;->k:Z

    iget-object v2, p0, Lio/github/sceneview/node/ModelNode$f;->l:Ljava/lang/Float;

    iget-object v3, p0, Lio/github/sceneview/node/ModelNode$f;->m:Lhu1;

    invoke-virtual {p1, v0, v1, v2, v3}, Lio/github/sceneview/node/ModelNode;->h1(Lcom/google/android/filament/gltfio/FilamentInstance;ZLjava/lang/Float;Lhu1;)V

    iget-object p1, p0, Lio/github/sceneview/node/ModelNode$f;->i:Lio/github/sceneview/node/ModelNode;

    iget-object v0, p0, Lio/github/sceneview/node/ModelNode$f;->j:Lcom/google/android/filament/gltfio/FilamentAsset;

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->getInstance()Lcom/google/android/filament/gltfio/FilamentInstance;

    move-result-object v0

    const-string v1, "model.instance"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lio/github/sceneview/node/ModelNode;->c1(Lcom/google/android/filament/gltfio/FilamentInstance;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
