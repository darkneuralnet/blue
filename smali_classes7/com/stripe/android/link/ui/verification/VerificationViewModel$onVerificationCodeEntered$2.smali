.class final Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/verification/VerificationViewModel;->onVerificationCodeEntered(Ljava/lang/String;)V
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
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.link.ui.verification.VerificationViewModel$onVerificationCodeEntered$2"
    f = "VerificationViewModel.kt"
    i = {}
    l = {
        0x5d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $code:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/ui/verification/VerificationViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/verification/VerificationViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/verification/VerificationViewModel;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->this$0:Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    iput-object p2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->$code:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->this$0:Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->$code:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;-><init>(Lcom/stripe/android/link/ui/verification/VerificationViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->this$0:Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    invoke-static {p1}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/verification/VerificationViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->$code:Ljava/lang/String;

    iput v2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->label:I

    invoke-virtual {p1, v1, p0}, Lcom/stripe/android/link/account/LinkAccountManager;->confirmVerification-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;->this$0:Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_3

    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    sget-object p1, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2$1$1;->INSTANCE:Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2$1$1;

    invoke-static {v0, p1}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->access$updateViewState(Lcom/stripe/android/link/ui/verification/VerificationViewModel;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->access$getLinkEventsReporter$p(Lcom/stripe/android/link/ui/verification/VerificationViewModel;)Lcom/stripe/android/link/analytics/LinkEventsReporter;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->on2FAComplete()V

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->getOnVerificationCompleted()Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->access$getLinkEventsReporter$p(Lcom/stripe/android/link/ui/verification/VerificationViewModel;)Lcom/stripe/android/link/analytics/LinkEventsReporter;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->on2FAFailure()V

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->getOtpElement()Lcom/stripe/android/uicore/elements/OTPElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/OTPController;->getOtpLength()I

    move-result p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_4

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->getOtpElement()Lcom/stripe/android/uicore/elements/OTPElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v2, v4}, Lcom/stripe/android/uicore/elements/OTPController;->onValueChanged(ILjava/lang/String;)I

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    invoke-static {v0, v1}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->access$onError(Lcom/stripe/android/link/ui/verification/VerificationViewModel;Ljava/lang/Throwable;)V

    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
