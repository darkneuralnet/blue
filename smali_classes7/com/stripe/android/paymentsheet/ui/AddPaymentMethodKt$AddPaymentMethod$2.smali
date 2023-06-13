.class final Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;II)V
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
    c = "com.stripe.android.paymentsheet.ui.AddPaymentMethodKt$AddPaymentMethod$2"
    f = "AddPaymentMethod.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $linkInlineSelection$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $linkSignupState$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $paymentSelection$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

.field label:I


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LEX2;LsP5;LsP5;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
            "LEX2<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;",
            "LsP5<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;",
            ">;",
            "LsP5<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$linkSignupState$delegate:LEX2;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$linkInlineSelection$delegate:LsP5;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$paymentSelection$delegate:LsP5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance p1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$linkSignupState$delegate:LEX2;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$linkInlineSelection$delegate:LsP5;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$paymentSelection$delegate:LsP5;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LEX2;LsP5;LsP5;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->label:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$linkSignupState$delegate:LEX2;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->access$AddPaymentMethod$lambda$13(LEX2;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$linkInlineSelection$delegate:LsP5;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->access$AddPaymentMethod$lambda$11(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$paymentSelection$delegate:LsP5;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->access$AddPaymentMethod$lambda$10(LsP5;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v0

    instance-of v0, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updatePrimaryButtonForLinkSignup(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$2;->$sheetViewModel:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updatePrimaryButtonForLinkInline()V

    :cond_2
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
