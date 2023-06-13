.class public final Lcom/airbnb/mvrx/FlowExtensionsKt$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/mvrx/FlowExtensionsKt;->b(LEu1;LLifecycleOwner;Ljava/util/Set;Ljava/lang/String;)LEu1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LGu1<",
        "-TT;>;",
        "Ljava/lang/Throwable;",
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
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"
    }
    d2 = {
        "T",
        "LGu1;",
        "",
        "it",
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
    c = "com.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$1"
    f = "FlowExtensions.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:LLifecycleOwner;

.field public final synthetic l:Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ljava/lang/String;LLifecycleOwner;Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "LLifecycleOwner;",
            "Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/airbnb/mvrx/FlowExtensionsKt$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->i:Ljava/util/Set;

    iput-object p2, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->j:Ljava/lang/String;

    iput-object p3, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->k:LLifecycleOwner;

    iput-object p4, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->l:Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final e(LGu1;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGu1<",
            "-TT;>;",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lcom/airbnb/mvrx/FlowExtensionsKt$a;

    iget-object v1, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->i:Ljava/util/Set;

    iget-object v2, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->j:Ljava/lang/String;

    iget-object v3, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->k:LLifecycleOwner;

    iget-object v4, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->l:Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;

    move-object v0, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/airbnb/mvrx/FlowExtensionsKt$a;-><init>(Ljava/util/Set;Ljava/lang/String;LLifecycleOwner;Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;Lkotlin/coroutines/Continuation;)V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LGu1;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->e(LGu1;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->h:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->i:Ljava/util/Set;

    iget-object v0, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->j:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->k:LLifecycleOwner;

    invoke-interface {p1}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    iget-object v0, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;->l:Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/f;->d(LFq2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
