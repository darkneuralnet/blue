.class final Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


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
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/util/List<",
        "+",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        ">;",
        "Ljava/lang/Boolean;",
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
        "\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"
    }
    d2 = {
        "",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "fields",
        "",
        "sameAsShippingValue",
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
    c = "com.stripe.android.uicore.elements.AddressElement$sameAsShippingUpdatedFlow$1"
    f = "AddressElement.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAddressElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n442#2:264\n392#2:265\n1238#3,4:266\n1855#3,2:270\n*S KotlinDebug\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1\n*L\n105#1:264\n105#1:265\n105#1:266,4\n113#1:270,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $shippingValuesMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/uicore/elements/AddressElement;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/AddressElement;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->$shippingValuesMap:Ljava/util/Map;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->invoke(Ljava/util/List;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/List;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;",
            "Ljava/lang/Boolean;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->$shippingValuesMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, p3}, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;-><init>(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->L$1:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->label:I

    if-nez v0, :cond_7

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {v1}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getLastSameAsShipping$p(Lcom/stripe/android/uicore/elements/AddressElement;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {v1, v0}, Lcom/stripe/android/uicore/elements/AddressElement;->access$setLastSameAsShipping$p(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/lang/Boolean;)V

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/AddressElement;->getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->$shippingValuesMap:Ljava/util/Map;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez v1, :cond_4

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_3

    :cond_1
    invoke-static {v2}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getCurrentValuesMap$p(Lcom/stripe/android/uicore/elements/AddressElement;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_2

    :cond_2
    invoke-static {v2}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getRawValuesMap$p(Lcom/stripe/android/uicore/elements/AddressElement;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_3

    const-string v3, ""

    :cond_3
    :goto_2
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    :goto_3
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    invoke-interface {v0, v1}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->setRawValue(Ljava/util/Map;)V

    goto :goto_4

    :cond_5
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_6
    return-object v2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
