.class public final Lcom/airbnb/mvrx/FlowExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001az\u0010\u0011\u001a\u00020\u0010\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u000f\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000cH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a<\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u0013\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0016"
    }
    d2 = {
        "T",
        "LEu1;",
        "LLifecycleOwner;",
        "lifecycleOwner",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "",
        "",
        "lastDeliveredStates",
        "",
        "activeSubscriptions",
        "La01;",
        "deliveryMode",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "action",
        "Lzh2;",
        "c",
        "(LEu1;LLifecycleOwner;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/Set;La01;Lkotlin/jvm/functions/Function2;)Lzh2;",
        "subscriptionId",
        "b",
        "d",
        "mvrx_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/airbnb/mvrx/FlowExtensionsKt;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LEu1;LLifecycleOwner;Ljava/util/Set;Ljava/lang/String;)LEu1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LEu1<",
            "+TT;>;",
            "LLifecycleOwner;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "LEu1<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeSubscriptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subscriptionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;

    invoke-direct {v5, p2, p3}, Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;-><init>(Ljava/util/Set;Ljava/lang/String;)V

    invoke-interface {p1}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroidx/lifecycle/f;->a(LFq2;)V

    new-instance v0, Lcom/airbnb/mvrx/FlowExtensionsKt$a;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Lcom/airbnb/mvrx/FlowExtensionsKt$a;-><init>(Ljava/util/Set;Ljava/lang/String;LLifecycleOwner;Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v0}, LVu1;->K(LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LEu1;LLifecycleOwner;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/Set;La01;Lkotlin/jvm/functions/Function2;)Lzh2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LEu1<",
            "+TT;>;",
            "LLifecycleOwner;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "La01;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzh2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastDeliveredStates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeSubscriptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deliveryMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LFN2;->a:Ljava/lang/Boolean;

    const-string v1, "FORCE_DISABLE_LIFECYCLE_AWARE_OBSERVER"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p4, LRd6;

    if-eqz v0, :cond_1

    invoke-virtual {p4}, La01;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, p3, v0}, Lcom/airbnb/mvrx/FlowExtensionsKt;->b(LEu1;LLifecycleOwner;Ljava/util/Set;Ljava/lang/String;)LEu1;

    move-result-object p0

    new-instance p3, Lcom/airbnb/mvrx/FlowExtensionsKt$c;

    invoke-direct {p3, p2, p4, v1}, Lcom/airbnb/mvrx/FlowExtensionsKt$c;-><init>(Ljava/util/concurrent/ConcurrentHashMap;La01;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, p3}, LVu1;->r(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt;->b(LEu1;LLifecycleOwner;)LEu1;

    move-result-object p0

    invoke-static {p0}, LVu1;->p(LEu1;)LEu1;

    move-result-object p0

    new-instance p3, Lcom/airbnb/mvrx/FlowExtensionsKt$d;

    invoke-direct {p3, p2, p4, v1}, Lcom/airbnb/mvrx/FlowExtensionsKt$d;-><init>(Ljava/util/concurrent/ConcurrentHashMap;La01;Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, p3}, LVu1;->L(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Lcom/airbnb/mvrx/MavericksLifecycleAwareFlowKt;->b(LEu1;LLifecycleOwner;)LEu1;

    move-result-object p0

    :goto_0
    invoke-static {p1}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object p1

    sget-object p2, LrN2;->a:LrN2;

    invoke-virtual {p2}, LrN2;->a()LTN2;

    move-result-object p2

    invoke-virtual {p2}, LTN2;->c()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    invoke-static {p1, p2}, LaD0;->g(LZC0;Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v2

    const/4 v3, 0x0

    sget-object v4, LbD0;->e:LbD0;

    new-instance v5, Lcom/airbnb/mvrx/FlowExtensionsKt$b;

    invoke-direct {v5, p0, p5, v1}, Lcom/airbnb/mvrx/FlowExtensionsKt$b;-><init>(LEu1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n        Subscribing with a duplicate subscription id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".\n        If you have multiple uniqueOnly subscriptions in a Mavericks view that listen to the same properties\n        you must use a custom subscription id. If you are using a custom MavericksView, make sure you are using the proper\n        lifecycle owner. See BaseMvRxFragment for an example.\n"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
