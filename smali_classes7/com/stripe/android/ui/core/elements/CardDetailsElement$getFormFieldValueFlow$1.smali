.class final Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getFormFieldValueFlow()LEu1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function5<",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "Lcom/stripe/android/model/CardBrand;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/util/List<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "+",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        ">;>;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00000\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"
    }
    d2 = {
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "number",
        "cvc",
        "expirationDate",
        "Lcom/stripe/android/model/CardBrand;",
        "brand",
        "",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
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
    c = "com.stripe.android.ui.core.elements.CardDetailsElement$getFormFieldValueFlow$1"
    f = "CardDetailsElement.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field synthetic L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/ui/core/elements/CardDetailsElement;


# direct methods
.method public constructor <init>(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/ui/core/elements/CardDetailsElement;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->this$0:Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/model/CardBrand;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            "Lcom/stripe/android/model/CardBrand;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->this$0:Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    invoke-direct {v0, v1, p5}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;-><init>(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->L$2:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->L$3:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    check-cast p2, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    check-cast p3, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    check-cast p4, Lcom/stripe/android/model/CardBrand;

    check-cast p5, Lkotlin/coroutines/Continuation;

    invoke-virtual/range {p0 .. p5}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->invoke(Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/model/CardBrand;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/model/CardBrand;

    const/4 v3, 0x3

    new-array v3, v3, [Lkotlin/Pair;

    iget-object v4, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->this$0:Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    invoke-virtual {v4}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getController()Lcom/stripe/android/ui/core/elements/CardDetailsController;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;->this$0:Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getController()Lcom/stripe/android/ui/core/elements/CardDetailsController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getCvcElement()Lcom/stripe/android/ui/core/elements/CvcElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v0, 0x1

    aput-object p1, v3, v0

    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardBrand()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    new-instance v4, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v2}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, v0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;Z)V

    invoke-static {p1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v0, 0x2

    aput-object p1, v3, v0

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsElementKt;->createExpiryDateFormFieldValues(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->toList(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
