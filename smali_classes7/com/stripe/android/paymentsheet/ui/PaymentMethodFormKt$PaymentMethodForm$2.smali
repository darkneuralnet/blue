.class final Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt;->PaymentMethodForm(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;LEu1;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;LgV2;LEt0;II)V
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
    c = "com.stripe.android.paymentsheet.ui.PaymentMethodFormKt$PaymentMethodForm$2"
    f = "PaymentMethodForm.kt"
    i = {}
    l = {
        0x41
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $completeFormValues:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;->$completeFormValues:LEu1;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;->$onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;

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

    new-instance p1, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;->$completeFormValues:LEu1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;->$onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;-><init>(LEu1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;->label:I

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

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;->$completeFormValues:LEu1;

    new-instance v1, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2$1;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;->$onFormFieldValuesChanged:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v3}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodFormKt$PaymentMethodForm$2;->label:I

    invoke-interface {p1, v1, p0}, LEu1;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method