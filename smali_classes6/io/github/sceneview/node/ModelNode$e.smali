.class public final Lio/github/sceneview/node/ModelNode$e;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/node/ModelNode;->Y0(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "io.github.sceneview.node.ModelNode"
    f = "ModelNode.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0x141,
        0x143
    }
    m = "loadModelGlb"
    n = {
        "this",
        "scaleToUnits",
        "centerOrigin",
        "onError",
        "autoAnimate",
        "this",
        "onError"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "Z$0",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Z

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lio/github/sceneview/node/ModelNode;

.field public o:I


# direct methods
.method public constructor <init>(Lio/github/sceneview/node/ModelNode;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/sceneview/node/ModelNode;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lio/github/sceneview/node/ModelNode$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/github/sceneview/node/ModelNode$e;->n:Lio/github/sceneview/node/ModelNode;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Lio/github/sceneview/node/ModelNode$e;->m:Ljava/lang/Object;

    iget p1, p0, Lio/github/sceneview/node/ModelNode$e;->o:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/github/sceneview/node/ModelNode$e;->o:I

    iget-object v0, p0, Lio/github/sceneview/node/ModelNode$e;->n:Lio/github/sceneview/node/ModelNode;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p0

    invoke-virtual/range {v0 .. v7}, Lio/github/sceneview/node/ModelNode;->Y0(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
