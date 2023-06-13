.class public final Ldr1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u0012\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005H\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
        "",
        "Lco/bird/android/model/persistence/OperatorFilter;",
        "availableOperatorFilters",
        "a",
        "Lco/bird/android/model/Polygon;",
        "Lco/bird/android/model/Point;",
        "c",
        "co.bird.android.feature.fleet-status"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFleetStatusPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1549#2:299\n1620#2,2:300\n288#2,2:302\n1549#2:304\n1620#2,3:305\n766#2:308\n857#2:309\n2624#2,3:310\n858#2:313\n1549#2:314\n1620#2,3:315\n1549#2:318\n1620#2,3:319\n1622#2:322\n1603#2,9:323\n1855#2:332\n288#2,2:333\n350#2,7:335\n378#2,7:342\n1559#2:349\n1590#2,4:350\n1856#2:355\n1612#2:356\n1603#2,9:357\n1855#2:366\n288#2,2:367\n1856#2:370\n1612#2:371\n1549#2:372\n1620#2,3:373\n1#3:354\n1#3:369\n*S KotlinDebug\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenterKt\n*L\n252#1:299\n252#1:300,2\n255#1:302,2\n257#1:304\n257#1:305,3\n262#1:308\n262#1:309\n263#1:310,3\n262#1:313\n265#1:314\n265#1:315,3\n273#1:318\n273#1:319,3\n252#1:322\n275#1:323,9\n275#1:332\n278#1:333,2\n280#1:335,7\n281#1:342,7\n283#1:349\n283#1:350,4\n275#1:355\n275#1:356\n287#1:357,9\n287#1:366\n290#1:367,2\n287#1:370\n287#1:371\n296#1:372\n296#1:373,3\n275#1:354\n287#1:369\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;Ljava/util/List;)Ljava/util/List;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/persistence/OperatorFilter;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorFilter;",
            ">;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;->getMultiSelectFilters()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-class v4, Lco/bird/android/model/persistence/OperatorOptionFilter;

    const/4 v7, 0x0

    if-eqz v3, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;

    move-object/from16 v8, p1

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v8, v4}, Lkotlin/collections/CollectionsKt;->filterIsInstance(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v9}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move-object v7, v8

    :cond_1
    move-object v8, v7

    check-cast v8, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;->getOptions()Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;

    move-result-object v9

    invoke-virtual {v9}, Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;->getSelections()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v10}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v9, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x37

    const/16 v18, 0x0

    invoke-static/range {v10 .. v18}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->copy$default(Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;ZLco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    move-result-object v9

    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;->getOptions()Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;->getSelections()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v8}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    instance-of v13, v12, Ljava/util/Collection;

    if-eqz v13, :cond_5

    move-object v13, v12

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_5

    :cond_4
    const/4 v11, 0x1

    goto :goto_3

    :cond_5
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v13}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    const/4 v11, 0x0

    :goto_3
    if-eqz v11, :cond_3

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v9, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ldr1;->b(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static {v7, v4}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x7df

    const/16 v21, 0x0

    invoke-static/range {v8 .. v21}, Lco/bird/android/model/persistence/OperatorOptionFilter;->copy$default(Lco/bird/android/model/persistence/OperatorOptionFilter;Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILjava/lang/Object;)Lco/bird/android/model/persistence/OperatorOptionFilter;

    move-result-object v4

    if-eqz v4, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;->getId()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v9, Lco/bird/android/model/constant/OperatorFilterType;->MULTI_SELECT:Lco/bird/android/model/constant/OperatorFilterType;

    const/4 v10, 0x0

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;->getOptions()Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;->getSelections()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v11, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ldr1;->b(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    move-result-object v4

    invoke-interface {v11, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x7d6

    const/16 v18, 0x0

    new-instance v4, Lco/bird/android/model/persistence/OperatorOptionFilter;

    move-object v5, v4

    invoke-direct/range {v5 .. v18}, Lco/bird/android/model/persistence/OperatorOptionFilter;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_6
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;->getRangeSelectFilters()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lco/bird/android/model/persistence/nestedstructures/OperatorMapRangeSelectFilter;

    move-object/from16 v9, p1

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {v9, v4}, Lkotlin/collections/CollectionsKt;->filterIsInstance(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v11}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapRangeSelectFilter;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    goto :goto_8

    :cond_e
    move-object v10, v7

    :goto_8
    move-object v11, v10

    check-cast v11, Lco/bird/android/model/persistence/OperatorOptionFilter;

    if-eqz v11, :cond_16

    invoke-virtual {v11}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const/4 v13, -0x1

    if-eqz v12, :cond_10

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v12}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapRangeSelectFilter;->getOptions()Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;

    move-result-object v14

    invoke-virtual {v14}, Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;->getStart()Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    goto :goto_a

    :cond_f
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_10
    move v10, v13

    :goto_a
    invoke-virtual {v11}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v12

    invoke-interface {v9, v12}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v9

    :cond_11
    invoke-interface {v9}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v12

    if-eqz v12, :cond_12

    invoke-interface {v9}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v12}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapRangeSelectFilter;->getOptions()Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;

    move-result-object v14

    invoke-virtual {v14}, Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;->getEnd()Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_11

    invoke-interface {v9}, Ljava/util/ListIterator;->nextIndex()I

    move-result v13

    :cond_12
    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual {v11}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v9, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v9, 0x0

    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    add-int/lit8 v18, v9, 0x1

    if-gez v9, :cond_13

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_13
    move-object/from16 v25, v17

    check-cast v25, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    if-gt v10, v9, :cond_14

    if-gt v9, v13, :cond_14

    const/16 v29, 0x1

    goto :goto_c

    :cond_14
    const/16 v29, 0x0

    :goto_c
    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x37

    const/16 v33, 0x0

    invoke-static/range {v25 .. v33}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->copy$default(Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;ZLco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    move-result-object v9

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v9, v18

    goto :goto_b

    :cond_15
    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x7df

    const/16 v24, 0x0

    move-object v13, v8

    move-object/from16 v17, v5

    invoke-static/range {v11 .. v24}, Lco/bird/android/model/persistence/OperatorOptionFilter;->copy$default(Lco/bird/android/model/persistence/OperatorOptionFilter;Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/FilterLogicToggleOption;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILjava/lang/Object;)Lco/bird/android/model/persistence/OperatorOptionFilter;

    move-result-object v5

    goto :goto_d

    :cond_16
    move-object v5, v7

    :goto_d
    if-eqz v5, :cond_c

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_17
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;->getToggleFilters()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_18
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v4, p1

    check-cast v4, Ljava/lang/Iterable;

    const-class v5, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->filterIsInstance(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_19
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_19

    goto :goto_f

    :cond_1a
    move-object v5, v7

    :goto_f
    move-object v8, v5

    check-cast v8, Lco/bird/android/model/persistence/OperatorToggleFilter;

    if-eqz v8, :cond_1b

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x7bf

    const/16 v21, 0x0

    invoke-static/range {v8 .. v21}, Lco/bird/android/model/persistence/OperatorToggleFilter;->copy$default(Lco/bird/android/model/persistence/OperatorToggleFilter;Ljava/lang/String;Lco/bird/android/model/constant/OperatorMapKind;ILco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ILjava/lang/Object;)Lco/bird/android/model/persistence/OperatorToggleFilter;

    move-result-object v3

    goto :goto_10

    :cond_1b
    move-object v3, v7

    :goto_10
    if-eqz v3, :cond_18

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1c
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$toOperatorFilter(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Ldr1;->a(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toPoints(Lco/bird/android/model/Polygon;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Ldr1;->c(Lco/bird/android/model/Polygon;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;
    .locals 10

    new-instance v9, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x32

    const/4 v8, 0x0

    move-object v0, v9

    move-object v3, p0

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/OperatorFilterType;Ljava/lang/String;ZLco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/constant/ColoredIcon;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method public static final c(Lco/bird/android/model/Polygon;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Polygon;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/model/Point;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/model/ComposedGeom;->numPoints()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    invoke-virtual {p0, v2}, Lco/bird/android/model/ComposedGeom;->getPoint(I)Lco/bird/android/model/Point;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method
