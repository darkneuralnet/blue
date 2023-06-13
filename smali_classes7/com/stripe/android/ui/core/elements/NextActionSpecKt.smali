.class public final Lcom/stripe/android/ui/core/elements/NextActionSpecKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\t\u001a0\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u000c\u0012\u0004\u0012\u0002H\r0\u000b\"\u0004\u0008\u0000\u0010\u000c\"\u0004\u0008\u0001\u0010\r*\u0010\u0012\u0004\u0012\u0002H\u000c\u0012\u0006\u0012\u0004\u0018\u0001H\r0\u000b\u001a\u000c\u0010\u000e\u001a\u00020\u000f*\u0004\u0018\u00010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "getNextActionFromSpec",
        "Lcom/stripe/android/model/LuxePostConfirmActionCreator;",
        "confirmResponseStatusSpecs",
        "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;",
        "mapToOutcome",
        "",
        "spec",
        "(Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;)Ljava/lang/Integer;",
        "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;",
        "(Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;)Ljava/lang/Integer;",
        "filterNotNullValues",
        "",
        "K",
        "V",
        "transform",
        "Lcom/stripe/android/model/LuxePostConfirmActionRepository$LuxeAction;",
        "Lcom/stripe/android/ui/core/elements/NextActionSpec;",
        "payments-ui-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNextActionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NextActionSpec.kt\ncom/stripe/android/ui/core/elements/NextActionSpecKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n135#2,9:198\n215#2:207\n216#2:210\n144#2:211\n1#3:208\n1#3:209\n442#4:212\n392#4:213\n442#4:218\n392#4:219\n442#4:224\n392#4:225\n1238#5,4:214\n1238#5,4:220\n1238#5,4:226\n*S KotlinDebug\n*F\n+ 1 NextActionSpec.kt\ncom/stripe/android/ui/core/elements/NextActionSpecKt\n*L\n73#1:198,9\n73#1:207\n73#1:210\n73#1:211\n73#1:209\n149#1:212\n149#1:213\n156#1:218\n156#1:219\n163#1:224\n163#1:225\n149#1:214,4\n156#1:220,4\n163#1:226,4\n*E\n"
    }
.end annotation


# direct methods
.method public static final filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;+TV;>;)",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final getNextActionFromSpec(Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;)Lcom/stripe/android/model/LuxePostConfirmActionCreator;
    .locals 2

    const-string v0, "confirmResponseStatusSpecs"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/stripe/android/model/LuxePostConfirmActionCreator$RedirectActionCreator;

    check-cast p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->getUrlPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->getReturnUrlPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/stripe/android/model/LuxePostConfirmActionCreator$RedirectActionCreator;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;->INSTANCE:Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;

    goto :goto_0

    :cond_1
    instance-of p0, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$FinishedSpec;

    if-eqz p0, :cond_2

    sget-object v0, Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;->INSTANCE:Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;

    :goto_0
    return-object v0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final mapToOutcome(Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;)Ljava/lang/Integer;
    .locals 2

    sget-object v0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$FinishedSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$FinishedSpec;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_1

    :cond_1
    instance-of v0, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    :goto_0
    move-object p0, v1

    goto :goto_1

    :cond_2
    if-nez p0, :cond_3

    goto :goto_0

    :goto_1
    return-object p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final mapToOutcome(Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;)Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$FinishedSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$FinishedSpec;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_1
    if-nez p0, :cond_2

    const/4 p0, 0x0

    :goto_0
    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final transform(Lcom/stripe/android/ui/core/elements/NextActionSpec;)Lcom/stripe/android/model/LuxePostConfirmActionRepository$LuxeAction;
    .locals 5

    if-nez p0, :cond_0

    new-instance p0, Lcom/stripe/android/model/LuxePostConfirmActionRepository$LuxeAction;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/model/LuxePostConfirmActionRepository$LuxeAction;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/NextActionSpec;->getPostConfirmHandlingPiStatusSpecs()Lcom/stripe/android/ui/core/elements/PostConfirmStatusSpecAssociation;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/PostConfirmStatusSpecAssociation;->getMap()Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;

    invoke-static {v3}, Lcom/stripe/android/ui/core/elements/NextActionSpecKt;->mapToOutcome(Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lcom/stripe/android/ui/core/elements/NextActionSpecKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/NextActionSpec;->getConfirmResponseStatusSpecs()Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;->getMap()Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;

    invoke-static {v3}, Lcom/stripe/android/ui/core/elements/NextActionSpecKt;->mapToOutcome(Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lcom/stripe/android/ui/core/elements/NextActionSpecKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_4
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/NextActionSpec;->getConfirmResponseStatusSpecs()Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;->getMap()Ljava/util/Map;

    move-result-object p0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;

    invoke-static {v2}, Lcom/stripe/android/ui/core/elements/NextActionSpecKt;->getNextActionFromSpec(Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;)Lcom/stripe/android/model/LuxePostConfirmActionCreator;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    :cond_6
    new-instance p0, Lcom/stripe/android/model/LuxePostConfirmActionRepository$LuxeAction;

    invoke-direct {p0, v1, v0}, Lcom/stripe/android/model/LuxePostConfirmActionRepository$LuxeAction;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    :goto_3
    return-object p0
.end method
