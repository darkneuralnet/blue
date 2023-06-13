.class final Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/forms/FormViewModel;-><init>(Landroid/content/Context;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/uicore/address/AddressRepository;LEu1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Ljava/lang/Boolean;",
        "Ljava/util/Set<",
        "+",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        ">;",
        "Ljava/util/Set<",
        "+",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/util/Set<",
        "+",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"
    }
    d2 = {
        "",
        "showFutureUse",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "cardBillingIdentifiers",
        "saveFutureUseIdentifiers",
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
    c = "com.stripe.android.paymentsheet.forms.FormViewModel$hiddenIdentifiers$2"
    f = "FormViewModel.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x74
    }
    m = "invokeSuspend"
    n = {
        "hiddenIdentifiers",
        "showFutureUse"
    }
    s = {
        "L$0",
        "Z$0"
    }
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/forms/FormViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/forms/FormViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/forms/FormViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->this$0:Lcom/stripe/android/paymentsheet/forms/FormViewModel;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/util/Set;

    check-cast p3, Ljava/util/Set;

    check-cast p4, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->invoke(ZLjava/util/Set;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLjava/util/Set;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->this$0:Lcom/stripe/android/paymentsheet/forms/FormViewModel;

    invoke-direct {v0, v1, p4}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;-><init>(Lcom/stripe/android/paymentsheet/forms/FormViewModel;Lkotlin/coroutines/Continuation;)V

    iput-boolean p1, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->Z$0:Z

    iput-object p2, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->L$1:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->Z$0:Z

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->Z$0:Z

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/Set;

    invoke-static {v3, v1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->this$0:Lcom/stripe/android/paymentsheet/forms/FormViewModel;

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->access$getSaveForFutureUseElement$p(Lcom/stripe/android/paymentsheet/forms/FormViewModel;)LEu1;

    move-result-object v3

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->L$0:Ljava/lang/Object;

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->Z$0:Z

    iput v2, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;->label:I

    invoke-static {v3, p0}, LVu1;->y(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    move v0, p1

    move-object p1, v2

    :goto_0
    check-cast p1, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    if-nez v0, :cond_3

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    :cond_3
    return-object v1
.end method
