.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1;->invoke(LEt0;I)V
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
    c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$4$1$1"
    f = "USBankAccountFormFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $currentScreenState$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;LsP5;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;",
            "LsP5<",
            "+",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;->$currentScreenState$delegate:LsP5;

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

    new-instance p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;->$currentScreenState$delegate:LsP5;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;LsP5;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1$1;->$currentScreenState$delegate:LsP5;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4$1;->access$invoke$lambda$0(LsP5;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->access$handleScreenStateChanged(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
