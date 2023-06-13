.class final Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;
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
        "Ljava/lang/String;",
        "Ljava/util/List<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "+",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        ">;>;",
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
        "\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u008a@"
    }
    d2 = {
        "",
        "country",
        "",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "values",
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
    c = "com.stripe.android.uicore.elements.AddressElement$fieldsUpdatedFlow$2"
    f = "AddressElement.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAddressElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,263:1\n1179#2,2:264\n1253#2,4:266\n167#3,3:270\n*S KotlinDebug\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2\n*L\n137#1:264,2\n137#1:266,4\n141#1:270,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $sameAsShippingElement:Lcom/stripe/android/uicore/elements/SameAsShippingElement;

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
.method public constructor <init>(Lcom/stripe/android/uicore/elements/AddressElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/AddressElement;",
            "Lcom/stripe/android/uicore/elements/SameAsShippingElement;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->$sameAsShippingElement:Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->$shippingValuesMap:Ljava/util/Map;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->invoke(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->$sameAsShippingElement:Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->$shippingValuesMap:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v3, p3}, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;-><init>(Lcom/stripe/android/uicore/elements/AddressElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->L$1:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->label:I

    if-nez v0, :cond_8

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {v1}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getCurrentValuesMap$p(Lcom/stripe/android/uicore/elements/AddressElement;)Ljava/util/Map;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {p1}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getCurrentValuesMap$p(Lcom/stripe/android/uicore/elements/AddressElement;)Ljava/util/Map;

    move-result-object p1

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    new-instance v3, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {p1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {p1}, Lcom/stripe/android/uicore/elements/AddressElement;->access$getCurrentValuesMap$p(Lcom/stripe/android/uicore/elements/AddressElement;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->$shippingValuesMap:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_5

    :cond_4
    const-string v3, ""

    :cond_5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v2, 0x0

    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->this$0:Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/uicore/elements/AddressElement;->access$setLastSameAsShipping$p(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/lang/Boolean;)V

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;->$sameAsShippingElement:Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/SameAsShippingElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/uicore/elements/SameAsShippingElement;->setRawValue(Ljava/util/Map;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    :cond_7
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
