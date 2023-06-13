.class public final LWy4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUy4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013JN\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u00040\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "LWy4;",
        "LUy4;",
        "Lco/bird/android/model/Issue;",
        "supertype",
        "",
        "Lco/bird/android/model/RepairTypeLock;",
        "selectedRepairs",
        "Lco/bird/android/model/RepairType;",
        "repairTypes",
        "",
        "",
        "originalStatuses",
        "Lio/reactivex/F;",
        "LH6;",
        "a",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "repair_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRepairIssueSubtypesConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesConverter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n766#2:118\n857#2,2:119\n1549#2:121\n1620#2,2:122\n766#2:124\n857#2,2:125\n766#2:127\n857#2,2:128\n1549#2:130\n1620#2,2:131\n288#2,2:133\n1622#2:135\n1747#2,3:136\n1549#2:139\n1620#2,3:140\n1549#2:143\n1620#2,3:144\n1622#2:147\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesConverter.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesConverterImpl\n*L\n31#1:118\n31#1:119,2\n34#1:121\n34#1:122,2\n35#1:124\n35#1:125,2\n36#1:127\n36#1:128,2\n42#1:130\n42#1:131,2\n43#1:133,2\n42#1:135\n68#1:136,3\n96#1:139\n96#1:140,3\n97#1:143\n97#1:144,3\n34#1:147\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWy4;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic b(Lco/bird/android/model/Issue;Ljava/util/List;Ljava/util/List;Ljava/util/Map;LWy4;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LWy4;->c(Lco/bird/android/model/Issue;Ljava/util/List;Ljava/util/List;Ljava/util/Map;LWy4;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lco/bird/android/model/Issue;Ljava/util/List;Ljava/util/List;Ljava/util/Map;LWy4;)Ljava/util/List;
    .locals 33

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const-string v4, "$supertype"

    move-object/from16 v5, p0

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "$selectedRepairs"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "$repairTypes"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "$originalStatuses"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "this$0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Issue;->getSubtypes()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Lco/bird/android/model/Issue;

    invoke-virtual {v9}, Lco/bird/android/model/Issue;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v9

    xor-int/2addr v8, v9

    if-eqz v8, :cond_0

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v8

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Issue;->getSubtypes()Ljava/util/List;

    move-result-object v6

    :goto_1
    check-cast v6, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v6, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/Issue;

    move-object v15, v0

    check-cast v15, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_3
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lco/bird/android/model/RepairTypeLock;

    invoke-virtual {v11}, Lco/bird/android/model/RepairTypeLock;->component1()Lco/bird/android/model/RepairType;

    move-result-object v11

    invoke-virtual {v11}, Lco/bird/android/model/RepairType;->getIssueTypeId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lco/bird/android/model/Issue;->getIssueTypeId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v14, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    move-object v9, v1

    check-cast v9, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_5
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lco/bird/android/model/RepairType;

    invoke-virtual {v11}, Lco/bird/android/model/RepairType;->getIssueTypeId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lco/bird/android/model/Issue;->getIssueTypeId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v13, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v9

    sget-object v10, Lco/bird/android/model/IssueStatus;->ABANDONED:Lco/bird/android/model/IssueStatus;

    const/16 v16, 0x0

    if-eq v9, v10, :cond_8

    invoke-virtual {v7}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v9

    invoke-static {v9}, Lco/bird/android/model/extension/IssueStatus_Kt;->isPassedStatus(Lco/bird/android/model/IssueStatus;)Z

    move-result v9

    if-nez v9, :cond_7

    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    xor-int/2addr v9, v8

    if-eqz v9, :cond_8

    :cond_7
    move v9, v8

    goto :goto_5

    :cond_8
    move/from16 v9, v16

    :goto_5
    new-instance v23, LG6;

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v18

    sget v19, LEj4;->item_repair_v2_subtype:I

    const/16 v20, 0x0

    const/16 v21, 0x4

    const/16 v22, 0x0

    move-object/from16 v17, v23

    invoke-direct/range {v17 .. v22}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v13, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/16 v17, 0x0

    if-eqz v11, :cond_10

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lco/bird/android/model/RepairType;

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_a

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v18

    check-cast v19, Lco/bird/android/model/RepairTypeLock;

    invoke-virtual/range {v19 .. v19}, Lco/bird/android/model/RepairTypeLock;->component1()Lco/bird/android/model/RepairType;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lco/bird/android/model/RepairType;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v11}, Lco/bird/android/model/RepairType;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    move-object/from16 v17, v18

    goto :goto_8

    :cond_9
    const/16 v5, 0xa

    const/4 v8, 0x1

    goto :goto_7

    :cond_a
    :goto_8
    check-cast v17, Lco/bird/android/model/RepairTypeLock;

    new-instance v5, LG6;

    new-instance v8, LTD4;

    if-eqz v17, :cond_b

    const/4 v12, 0x1

    goto :goto_9

    :cond_b
    move/from16 v12, v16

    :goto_9
    invoke-virtual {v7}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/IssueStatus;->DISPUTED:Lco/bird/android/model/IssueStatus;

    if-ne v0, v1, :cond_c

    move/from16 v0, v16

    const/4 v1, 0x1

    goto :goto_b

    :cond_c
    if-eqz v17, :cond_d

    invoke-virtual/range {v17 .. v17}, Lco/bird/android/model/RepairTypeLock;->getLocked()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_e

    move/from16 v24, v1

    goto :goto_a

    :cond_d
    const/4 v1, 0x1

    :cond_e
    move/from16 v24, v16

    :goto_a
    if-nez v24, :cond_f

    move v0, v1

    goto :goto_b

    :cond_f
    move/from16 v0, v16

    :goto_b
    invoke-direct {v8, v11, v12, v0, v1}, LTD4;-><init>(Lco/bird/android/model/RepairType;ZZZ)V

    sget v27, LEj4;->item_repair_v2_subtype_repair_type:I

    const/16 v28, 0x0

    const/16 v29, 0x4

    const/16 v30, 0x0

    move-object/from16 v25, v5

    move-object/from16 v26, v8

    invoke-direct/range {v25 .. v30}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v9, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const/16 v5, 0xa

    const/4 v8, 0x1

    goto/16 :goto_6

    :cond_10
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7}, Lco/bird/android/model/Issue;->getIssueTypeId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Issue;

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v5

    new-instance v8, LG6;

    new-instance v26, Lya2;

    sget-object v11, Lco/bird/android/model/IssueStatus;->DISPUTED:Lco/bird/android/model/IssueStatus;

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v9

    move-object v12, v9

    goto :goto_c

    :cond_11
    move-object/from16 v12, v17

    :goto_c
    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lco/bird/android/model/Issue;->getStatusReason()Lco/bird/android/model/constant/IssueStatusReason;

    move-result-object v9

    move-object/from16 v18, v9

    goto :goto_d

    :cond_12
    move-object/from16 v18, v17

    :goto_d
    iget-object v9, v3, LWy4;->a:Landroid/content/Context;

    sget v10, Lnl4;->general_dot_item:I

    move-object/from16 v31, v6

    const/4 v2, 0x1

    new-array v6, v2, [Ljava/lang/Object;

    sget v2, Lnl4;->repair_no_repair_needed:I

    invoke-virtual {v9, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v6, v16

    invoke-virtual {v9, v10, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "context.getString(L.stri\u2026repair_no_repair_needed))"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, v26

    move-object v10, v7

    move-object v6, v13

    move-object/from16 v13, v18

    move-object/from16 v32, v4

    move-object v4, v14

    move v14, v5

    move-object v5, v15

    move-object v15, v2

    invoke-direct/range {v9 .. v15}, Lya2;-><init>(Lco/bird/android/model/Issue;Lco/bird/android/model/IssueStatus;Lco/bird/android/model/IssueStatus;Lco/bird/android/model/constant/IssueStatusReason;ZLjava/lang/String;)V

    sget v27, LEj4;->item_repair_v2_subtype_status:I

    const/16 v28, 0x0

    const/16 v29, 0x4

    const/16 v30, 0x0

    move-object/from16 v25, v8

    invoke-direct/range {v25 .. v30}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    instance-of v2, v5, Ljava/util/Collection;

    if-eqz v2, :cond_14

    move-object v15, v5

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_14

    :cond_13
    move/from16 v2, v16

    goto :goto_f

    :cond_14
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/RepairTypeLock;

    invoke-virtual {v5}, Lco/bird/android/model/RepairTypeLock;->component1()Lco/bird/android/model/RepairType;

    move-result-object v8

    invoke-virtual {v5}, Lco/bird/android/model/RepairTypeLock;->component2()Z

    move-result v5

    invoke-virtual {v8}, Lco/bird/android/model/RepairType;->getIssueTypeId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Lco/bird/android/model/Issue;->getIssueTypeId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    if-nez v5, :cond_16

    const/4 v5, 0x1

    goto :goto_e

    :cond_16
    move/from16 v5, v16

    :goto_e
    if-eqz v5, :cond_15

    const/4 v2, 0x1

    :goto_f
    if-eqz v2, :cond_17

    sget-object v1, Lco/bird/android/model/IssueStatus;->RESOLVED:Lco/bird/android/model/IssueStatus;

    :goto_10
    move-object v12, v1

    :goto_11
    move-object/from16 v13, v17

    goto :goto_14

    :cond_17
    if-eqz v1, :cond_18

    invoke-virtual {v1}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v2

    goto :goto_12

    :cond_18
    move-object/from16 v2, v17

    :goto_12
    sget-object v5, Lco/bird/android/model/IssueStatus;->CANT_REPAIR:Lco/bird/android/model/IssueStatus;

    if-eq v2, v5, :cond_1b

    if-eqz v1, :cond_19

    invoke-virtual {v1}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v2

    goto :goto_13

    :cond_19
    move-object/from16 v2, v17

    :goto_13
    if-eqz v1, :cond_1a

    invoke-virtual {v1}, Lco/bird/android/model/Issue;->getStatusReason()Lco/bird/android/model/constant/IssueStatusReason;

    move-result-object v17

    :cond_1a
    move-object v12, v2

    goto :goto_11

    :cond_1b
    sget-object v1, Lco/bird/android/model/IssueStatus;->OPEN:Lco/bird/android/model/IssueStatus;

    goto :goto_10

    :goto_14
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v6, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/RepairType;

    invoke-virtual {v5}, Lco/bird/android/model/RepairType;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_1c
    new-instance v2, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/RepairTypeLock;

    invoke-virtual {v6}, Lco/bird/android/model/RepairTypeLock;->component1()Lco/bird/android/model/RepairType;

    move-result-object v6

    invoke-virtual {v6}, Lco/bird/android/model/RepairType;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_1d
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->minus(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    new-instance v2, LG6;

    sget-object v11, Lco/bird/android/model/IssueStatus;->CANT_REPAIR:Lco/bird/android/model/IssueStatus;

    iget-object v4, v3, LWy4;->a:Landroid/content/Context;

    sget v6, Lnl4;->general_dot_item:I

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    sget v10, Lnl4;->repair_cant_repair:I

    invoke-virtual {v4, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v16

    invoke-virtual {v4, v6, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    xor-int/lit8 v14, v1, 0x1

    new-instance v18, Lya2;

    const-string v1, "getString(L.string.gener\u2026ring.repair_cant_repair))"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, v18

    move-object v10, v7

    invoke-direct/range {v9 .. v15}, Lya2;-><init>(Lco/bird/android/model/Issue;Lco/bird/android/model/IssueStatus;Lco/bird/android/model/IssueStatus;Lco/bird/android/model/constant/IssueStatusReason;ZLjava/lang/String;)V

    sget v19, LEj4;->item_repair_v2_subtype_status:I

    const/16 v20, 0x0

    const/16 v21, 0x4

    const/16 v22, 0x0

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v22}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, LH6;

    const/16 v20, 0x0

    move-object/from16 v17, v1

    move-object/from16 v18, v0

    move-object/from16 v19, v23

    invoke-direct/range {v17 .. v22}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v32

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object v4, v0

    move-object/from16 v6, v31

    move-object/from16 v0, p1

    goto/16 :goto_2

    :cond_1e
    move-object v0, v4

    return-object v0
.end method


# virtual methods
.method public a(Lco/bird/android/model/Issue;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lio/reactivex/F;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Issue;",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairTypeLock;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/RepairType;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/Issue;",
            ">;)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "supertype"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedRepairs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repairTypes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalStatuses"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LVy4;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, LVy4;-><init>(Lco/bird/android/model/Issue;Ljava/util/List;Ljava/util/List;Ljava/util/Map;LWy4;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "fromCallable {\n      // \u2026Schedulers.computation())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
