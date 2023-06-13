.class public final Lcl3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcl3;->G()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/api/response/OperatorFiltersResponse;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/persistence/OperatorFilter;",
        ">;>;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/api/response/OperatorFiltersResponse;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/persistence/OperatorFilter;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "invoke",
        "(Lkotlin/Pair;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorFilterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterRepositoryImpl.kt\nco/bird/android/repository/operatorfilter/OperatorFilterRepositoryImpl$fetchOperatorFilters$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1549#2:89\n1620#2,2:90\n288#2,2:92\n1603#2,9:94\n1855#2:103\n1856#2:105\n1612#2:106\n1622#2:107\n1549#2:108\n1620#2,2:109\n288#2,2:111\n1622#2:113\n1549#2:114\n1620#2,3:115\n1549#2:118\n1620#2,3:119\n1#3:104\n*S KotlinDebug\n*F\n+ 1 OperatorFilterRepositoryImpl.kt\nco/bird/android/repository/operatorfilter/OperatorFilterRepositoryImpl$fetchOperatorFilters$1\n*L\n29#1:89\n29#1:90,2\n31#1:92,2\n33#1:94,9\n33#1:103\n33#1:105\n33#1:106\n29#1:107\n40#1:108\n40#1:109,2\n42#1:111,2\n40#1:113\n51#1:114\n51#1:115,3\n53#1:118\n53#1:119,3\n33#1:104\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lcl3;


# direct methods
.method public constructor <init>(Lcl3;)V
    .locals 0

    iput-object p1, p0, Lcl3$a;->g:Lcl3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Lio/reactivex/h;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/api/response/OperatorFiltersResponse;",
            "+",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/persistence/OperatorFilter;",
            ">;>;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/api/response/OperatorFiltersResponse;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0}, Lco/bird/api/response/OperatorFiltersResponse;->getMultiSelectFilters()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0}, Lco/bird/api/response/OperatorFiltersResponse;->getRangeFilters()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, "existingFilters"

    const/4 v6, 0x0

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireOperatorOptionFilter;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p1

    check-cast v5, Ljava/lang/Iterable;

    const-class v7, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->filterIsInstance(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v8}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireOperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_1
    move-object v7, v6

    :goto_1
    check-cast v7, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_4

    check-cast v5, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v9}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-virtual {v9}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v9

    goto :goto_3

    :cond_3
    move-object v9, v6

    :goto_3
    if-eqz v9, :cond_2

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    :cond_5
    if-eqz v7, :cond_6

    invoke-virtual {v7}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLogicOperator()Lco/bird/android/model/constant/FilterLogicToggleOption;

    move-result-object v6

    :cond_6
    invoke-static {v4, v8, v6}, LWk3;->a(Lco/bird/android/model/wire/WireOperatorOptionFilter;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;)Lco/bird/android/model/persistence/OperatorOptionFilter;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v0}, Lco/bird/api/response/OperatorFiltersResponse;->getToggleFilters()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v7, 0x0

    if-eqz v4, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireOperatorToggleFilter;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p1

    check-cast v8, Ljava/lang/Iterable;

    const-class v9, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-static {v8, v9}, Lkotlin/collections/CollectionsKt;->filterIsInstance(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-virtual {v10}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireOperatorToggleFilter;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_5

    :cond_9
    move-object v9, v6

    :goto_5
    check-cast v9, Lco/bird/android/model/persistence/OperatorToggleFilter;

    if-eqz v9, :cond_a

    invoke-virtual {v9}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getEnabled()Z

    move-result v7

    :cond_a
    invoke-static {v4, v7}, LWk3;->b(Lco/bird/android/model/wire/WireOperatorToggleFilter;Z)Lco/bird/android/model/persistence/OperatorToggleFilter;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_b
    const/4 p1, 0x4

    new-array p1, p1, [Lio/reactivex/c;

    iget-object v0, p0, Lcl3$a;->g:Lcl3;

    invoke-static {v0}, Lcl3;->access$getOperatorOptionFilterDao$p(Lcl3;)Lwo3;

    move-result-object v0

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    invoke-virtual {v0, v4}, Lwo3;->d(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v0

    aput-object v0, p1, v7

    iget-object v0, p0, Lcl3$a;->g:Lcl3;

    invoke-static {v0}, Lcl3;->access$getOperatorOptionFilterDao$p(Lcl3;)Lwo3;

    move-result-object v0

    invoke-virtual {v0, v2}, Lwo3;->b(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, p1, v2

    iget-object v0, p0, Lcl3$a;->g:Lcl3;

    invoke-static {v0}, Lcl3;->access$getOperatorToggleFilterDao$p(Lcl3;)LAw3;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    invoke-virtual {v0, v2}, LAw3;->d(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v0

    const/4 v2, 0x2

    aput-object v0, p1, v2

    iget-object v0, p0, Lcl3$a;->g:Lcl3;

    invoke-static {v0}, Lcl3;->access$getOperatorToggleFilterDao$p(Lcl3;)LAw3;

    move-result-object v0

    invoke-virtual {v0, v1}, LAw3;->b(Ljava/util/List;)Lio/reactivex/c;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, p1, v1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lcl3$a;->invoke(Lkotlin/Pair;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
