.class public final Lyt5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyt5$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u0005*\u0008\u0012\u0004\u0012\u00020\u00040\u0000\u001a\u0012\u0010\t\u001a\u00020\u0008*\u0008\u0012\u0004\u0012\u00020\u00070\u0000H\u0002\u001a\u0012\u0010\u000b\u001a\u00020\n*\u0008\u0012\u0004\u0012\u00020\u00070\u0000H\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "Lco/bird/android/model/persistence/OperatorOptionFilter;",
        "LHm3;",
        "a",
        "Lco/bird/android/model/persistence/OperatorFilter;",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
        "c",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
        "Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;",
        "d",
        "Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;",
        "b",
        "core-interface_release"
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
        "SMAP\nServerDrivenFilterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerDrivenFilterManager.kt\nco/bird/android/coreinterface/manager/ServerDrivenFilterManagerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1855#2:170\n766#2:172\n857#2,2:173\n1549#2:175\n1620#2,3:176\n766#2:179\n857#2,2:180\n1549#2:182\n1620#2,3:183\n1856#2:186\n766#2:187\n857#2,2:188\n1549#2:190\n1620#2,3:191\n766#2:194\n857#2,2:195\n800#2,11:197\n800#2,11:208\n1549#2:219\n1620#2,3:220\n288#2,2:223\n533#2,6:225\n766#2:231\n857#2,2:232\n1549#2:234\n1620#2,3:235\n1#3:171\n*S KotlinDebug\n*F\n+ 1 ServerDrivenFilterManager.kt\nco/bird/android/coreinterface/manager/ServerDrivenFilterManagerKt\n*L\n78#1:170\n96#1:172\n96#1:173,2\n96#1:175\n96#1:176,3\n97#1:179\n97#1:180,2\n97#1:182\n97#1:183,3\n78#1:186\n123#1:187\n123#1:188,2\n124#1:190\n124#1:191,3\n148#1:194\n148#1:195,2\n151#1:197,11\n152#1:208,11\n153#1:219\n153#1:220,3\n159#1:223,2\n160#1:225,6\n166#1:231\n166#1:232,2\n166#1:234\n166#1:235,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Ljava/util/List;)LHm3;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorOptionFilter;",
            ">;)",
            "LHm3;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LHm3;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LHm3;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getType()Lco/bird/android/model/constant/OperatorFilterType;

    move-result-object v3

    sget-object v4, Lyt5$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v5, :cond_9

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v10, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v10, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v8}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v8

    xor-int/2addr v8, v5

    if-eqz v8, :cond_5

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v6, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v5

    if-eqz v3, :cond_8

    invoke-virtual {v1}, LHm3;->d()Ljava/util/List;

    move-result-object v3

    new-instance v6, LFm3;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v13}, LFm3;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v5

    if-eqz v3, :cond_0

    invoke-virtual {v1}, LHm3;->b()Ljava/util/List;

    move-result-object v3

    new-instance v5, LFm3;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x0

    const/4 v15, 0x4

    const/16 v16, 0x0

    move-object v11, v5

    move-object v13, v4

    invoke-direct/range {v11 .. v16}, LFm3;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_9
    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->isSet()Z

    move-result v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_b

    invoke-virtual {v1}, LHm3;->e()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v9

    invoke-static {v9}, Lyt5;->d(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;

    move-result-object v9

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v9}, Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;->getStart()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v4, v7

    invoke-virtual {v9}, Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;->getEnd()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v5

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLogicOperator()Lco/bird/android/model/constant/FilterLogicToggleOption;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_a
    new-instance v2, LFm3;

    invoke-direct {v2, v8, v4, v6}, LFm3;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_b
    invoke-virtual {v1}, LHm3;->c()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v9

    invoke-static {v9}, Lyt5;->d(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;

    move-result-object v9

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v9}, Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;->getStart()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v4, v7

    invoke-virtual {v9}, Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;->getEnd()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v4, v5

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLogicOperator()Lco/bird/android/model/constant/FilterLogicToggleOption;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_c
    new-instance v2, LFm3;

    invoke-direct {v2, v8, v4, v6}, LFm3;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_d
    return-object v1
.end method

.method public static final b(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
            ">;)",
            "Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;

    invoke-direct {v0, p0}, Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static final c(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/persistence/OperatorFilter;",
            ">;)",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    const-class v0, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->filterIsInstance(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/OperatorOptionFilter;->isSet()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getType()Lco/bird/android/model/constant/OperatorFilterType;

    move-result-object v4

    sget-object v5, Lyt5$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    invoke-virtual {v3}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getType()Lco/bird/android/model/constant/OperatorFilterType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Filter \'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\' of type "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " passed to toOperatorMapRequest is not yet implemented, ignoring for now"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3

    :cond_2
    new-instance v4, Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lyt5;->b(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/MultiSelectFilterOption;)V

    goto :goto_2

    :cond_3
    new-instance v4, Lco/bird/android/model/persistence/nestedstructures/OperatorMapRangeSelectFilter;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lyt5;->d(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;

    move-result-object v6

    invoke-virtual {v3}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLogicOperator()Lco/bird/android/model/constant/FilterLogicToggleOption;

    move-result-object v3

    invoke-direct {v4, v5, v6, v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapRangeSelectFilter;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;Lco/bird/android/model/constant/FilterLogicToggleOption;)V

    :goto_2
    move-object v3, v4

    :goto_3
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const-class v1, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->filterIsInstance(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_5
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getEnabled()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lco/bird/android/model/persistence/nestedstructures/OperatorMapMultiSelectFilter;

    if-eqz v5, :cond_7

    invoke-interface {p0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lco/bird/android/model/persistence/nestedstructures/OperatorMapRangeSelectFilter;

    if-eqz v5, :cond_9

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/OperatorToggleFilter;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_b
    new-instance v1, Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;

    invoke-direct {v1, p0, v3, v0}, Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public static final d(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;",
            ">;)",
            "Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v0

    :cond_3
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getEnabled()Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v2, v3

    :cond_5
    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    :cond_6
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;->getValue()Ljava/lang/String;

    move-result-object v1

    :cond_7
    new-instance p0, Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;

    invoke-direct {p0, v0, v1}, Lco/bird/android/model/persistence/nestedstructures/RangeSelectFilterOption;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
