.class final Lcom/stripe/android/uicore/elements/AddressElement$fields$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/AddressElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressType;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function5<",
        "Ljava/lang/String;",
        "Ljava/util/List<",
        "+",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        ">;",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/util/List<",
        "+",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u008a@"
    }
    d2 = {
        "",
        "country",
        "",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "otherFields",
        "",
        "<anonymous parameter 2>",
        "<anonymous parameter 3>",
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
    c = "com.stripe.android.uicore.elements.AddressElement$fields$1"
    f = "AddressElement.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/uicore/elements/AddressElement;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/AddressElement;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/AddressElement;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/elements/AddressElement$fields$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lkotlin/Unit;

    check-cast p4, Lkotlin/Unit;

    check-cast p5, Lkotlin/coroutines/Continuation;

    invoke-virtual/range {p0 .. p5}, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->invoke(Ljava/lang/String;Ljava/util/List;Lkotlin/Unit;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Ljava/util/List;Lkotlin/Unit;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;",
            "Lkotlin/Unit;",
            "Lkotlin/Unit;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p3, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;

    iget-object p4, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-direct {p3, p4, p5}, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;-><init>(Lcom/stripe/android/uicore/elements/AddressElement;Lkotlin/coroutines/Continuation;)V

    iput-object p1, p3, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->L$0:Ljava/lang/Object;

    iput-object p2, p3, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->L$1:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p3, p1}, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->label:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x3

    new-array v1, v1, [Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {v2}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getNameElement$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/AddressElement;->getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {v2}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getAddressAutoCompleteElement$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/AddressTextFieldElement;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v1, v5

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-array v2, v5, [Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    iget-object v5, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {v5}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getNameElement$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object v5

    aput-object v5, v2, v3

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/AddressElement;->getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {v3}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getAddressType$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/AddressType;

    move-result-object v3

    instance-of v4, v3, Lcom/stripe/android/uicore/elements/AddressType$ShippingCondensed;

    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getAddressType$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/AddressType;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/AddressType$ShippingCondensed;

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {v3}, Lcom/stripe/android/uicore/elements/AddressElement;->access$isPlacesAvailable$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/IsPlacesAvailable;

    move-result-object v3

    invoke-virtual {v0, p1, v3}, Lcom/stripe/android/uicore/elements/AddressType$ShippingCondensed;->supportsAutoComplete(Ljava/lang/String;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_0
    instance-of p1, v3, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;

    if-eqz p1, :cond_2

    :cond_1
    move-object v1, v2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AddressElement;->getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    :goto_0
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {p1}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getAddressType$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/AddressType;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AddressType;->getPhoneNumberState()Lcom/stripe/android/uicore/elements/PhoneNumberState;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberState;->HIDDEN:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    if-eq p1, v0, :cond_3

    check-cast v1, Ljava/util/Collection;

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {p1}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getPhoneNumberElement$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_3
    return-object v1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
