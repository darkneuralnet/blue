.class public final Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/account/LinkAccountManager;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/repositories/LinkRepository;Lcom/stripe/android/link/account/CookieStore;Lcom/stripe/android/link/analytics/LinkEventsReporter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LGu1<",
        "-",
        "Lcom/stripe/android/link/model/AccountStatus;",
        ">;",
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
        "\u0000\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"
    }
    d2 = {
        "T",
        "R",
        "LGu1;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.link.account.LinkAccountManager$special$$inlined$transform$1"
    f = "LinkAccountManager.kt"
    i = {}
    l = {
        0x28
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,222:1\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_transform:LEu1;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/account/LinkAccountManager;


# direct methods
.method public constructor <init>(LEu1;Lkotlin/coroutines/Continuation;Lcom/stripe/android/link/account/LinkAccountManager;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->$this_transform:LEu1;

    iput-object p3, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;

    iget-object v1, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->$this_transform:LEu1;

    iget-object v2, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-direct {v0, v1, p2, v2}, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;-><init>(LEu1;Lkotlin/coroutines/Continuation;Lcom/stripe/android/link/account/LinkAccountManager;)V

    iput-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGu1<",
            "-",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LGu1;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->invoke(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->label:I

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

    iget-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->L$0:Ljava/lang/Object;

    check-cast p1, LGu1;

    iget-object v1, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->$this_transform:LEu1;

    new-instance v3, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;

    iget-object v4, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-direct {v3, p1, v4}, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;-><init>(LGu1;Lcom/stripe/android/link/account/LinkAccountManager;)V

    iput v2, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->label:I

    invoke-interface {v1, v3, p0}, LEu1;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
