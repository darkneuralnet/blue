.class final Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody(IIZLcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Lkotlin/jvm/functions/Function0;LEt0;II)V
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
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.link.ui.verification.VerificationScreenKt$VerificationBody$2"
    f = "VerificationScreen.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $focusManager:LBv1;

.field final synthetic $keyboardController:LnN5;

.field final synthetic $viewState$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(LBv1;LnN5;LsP5;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBv1;",
            "LnN5;",
            "LsP5<",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->$focusManager:LBv1;

    iput-object p2, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->$keyboardController:LnN5;

    iput-object p3, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->$viewState$delegate:LsP5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance p1, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->$focusManager:LBv1;

    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->$keyboardController:LnN5;

    iget-object v2, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->$viewState$delegate:LsP5;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;-><init>(LBv1;LnN5;LsP5;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->$viewState$delegate:LsP5;

    invoke-static {p1}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->access$VerificationBody$lambda$0(LsP5;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->$focusManager:LBv1;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, LBv1;->n(Z)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$2;->$keyboardController:LnN5;

    if-eqz p1, :cond_0

    invoke-interface {p1}, LnN5;->b()V

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
