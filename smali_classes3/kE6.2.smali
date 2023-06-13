.class public final LkE6;
.super LtA;
.source "SourceFile"

# interfaces
.implements LfE6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0008\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJX\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\t0\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0008H\u0016J\u0008\u0010\u0012\u001a\u00020\u0010H\u0002J6\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00100\t2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00072\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\tH\u0002J\u0012\u0010\u0016\u001a\u00020\u00102\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0008H\u0002\u00a8\u0006\u001b"
    }
    d2 = {
        "LkE6;",
        "LtA;",
        "LfE6;",
        "Lco/bird/android/model/BirdSummaryBody;",
        "birdSummary",
        "Lco/bird/android/model/MobilePartner;",
        "partner",
        "",
        "",
        "",
        "Lco/bird/android/model/IssueType;",
        "categoriesIssuesMap",
        "Lco/bird/android/model/IssueTypeLock;",
        "issues",
        "notes",
        "Lio/reactivex/F;",
        "LH6;",
        "b",
        "t",
        "categoryIssues",
        "selectedIssues",
        "u",
        "v",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "workorders_release"
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
        "SMAP\nLegacyWorkOrderInspectionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionConverter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/WorkOrderInspectionConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,131:1\n1549#2:132\n1620#2,2:133\n766#2:135\n857#2,2:136\n1549#2:138\n1620#2,3:139\n1774#2,4:142\n1622#2:146\n1747#2,3:147\n766#2:150\n857#2,2:151\n1726#2,3:153\n766#2:156\n857#2,2:157\n819#2:159\n847#2:160\n1747#2,3:161\n848#2:164\n1549#2:165\n1620#2,2:166\n1747#2,3:168\n1622#2:171\n1726#2,3:172\n1549#2:175\n1620#2,2:176\n1747#2,3:178\n1622#2:181\n1726#2,3:182\n37#3,2:185\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionConverter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/WorkOrderInspectionConverterImpl\n*L\n55#1:132\n55#1:133,2\n56#1:135\n56#1:136,2\n66#1:138\n66#1:139,3\n73#1:142,4\n55#1:146\n91#1:147,3\n92#1:150\n92#1:151,2\n100#1:153,3\n104#1:156\n104#1:157,2\n106#1:159\n106#1:160\n106#1:161,3\n106#1:164\n107#1:165\n107#1:166,2\n108#1:168,3\n107#1:171\n110#1:172,3\n115#1:175\n115#1:176,2\n116#1:178,3\n115#1:181\n118#1:182,3\n37#1:185,2\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LtA;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic r(LkE6;Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/MobilePartner;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static/range {p0 .. p5}, LkE6;->s(LkE6;Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/MobilePartner;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final s(LkE6;Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/MobilePartner;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$birdSummary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$categoriesIssuesMap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$issues"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    invoke-static/range {v1 .. v6}, LtA;->generateVehicleSummarySection$default(LtA;Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/MobilePartner;ILjava/lang/Object;)LH6;

    move-result-object p1

    invoke-virtual {p0}, LkE6;->t()LH6;

    move-result-object p2

    invoke-virtual {p0, p3, p4}, LkE6;->u(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p5}, LkE6;->v(Ljava/lang/String;)LH6;

    move-result-object p0

    new-instance p4, Lkotlin/jvm/internal/SpreadBuilder;

    const/4 p5, 0x4

    invoke-direct {p4, p5}, Lkotlin/jvm/internal/SpreadBuilder;-><init>(I)V

    invoke-virtual {p4, p1}, Lkotlin/jvm/internal/SpreadBuilder;->add(Ljava/lang/Object;)V

    invoke-virtual {p4, p2}, Lkotlin/jvm/internal/SpreadBuilder;->add(Ljava/lang/Object;)V

    check-cast p3, Ljava/util/Collection;

    const/4 p1, 0x0

    new-array p1, p1, [LH6;

    invoke-interface {p3, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p4, p1}, Lkotlin/jvm/internal/SpreadBuilder;->addSpread(Ljava/lang/Object;)V

    invoke-virtual {p4, p0}, Lkotlin/jvm/internal/SpreadBuilder;->add(Ljava/lang/Object;)V

    invoke-virtual {p4}, Lkotlin/jvm/internal/SpreadBuilder;->size()I

    move-result p0

    new-array p0, p0, [LH6;

    invoke-virtual {p4, p0}, Lkotlin/jvm/internal/SpreadBuilder;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b(Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/MobilePartner;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/BirdSummaryBody;",
            "Lco/bird/android/model/MobilePartner;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/IssueType;",
            ">;>;",
            "Ljava/util/List<",
            "Lco/bird/android/model/IssueTypeLock;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "birdSummary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categoriesIssuesMap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "issues"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LhE6;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, LhE6;-><init>(LkE6;Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/MobilePartner;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "fromCallable {\n      val\u2026ay(), notesSection)\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final t()LH6;
    .locals 13

    new-instance v6, LG6;

    invoke-virtual {p0}, LtA;->m()Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->work_order_inspect_command:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lmk4;->item_button_secondary:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, LG6;

    const/4 v8, 0x0

    sget v9, LXj4;->item_inspect_instructions:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, LH6;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v1, v2, v6, v0}, LH6;-><init>(Ljava/util/List;LG6;LG6;)V

    return-object v1
.end method

.method public final u(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/IssueType;",
            ">;>;",
            "Ljava/util/List<",
            "Lco/bird/android/model/IssueTypeLock;",
            ">;)",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

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

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v4, p2

    check-cast v4, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lco/bird/android/model/IssueTypeLock;

    invoke-virtual {v6}, Lco/bird/android/model/IssueTypeLock;->component1()Lco/bird/android/model/IssueType;

    move-result-object v6

    invoke-virtual {v6}, Lco/bird/android/model/IssueType;->getCategory()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v10, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v12, LMg0;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    const/4 v9, 0x1

    xor-int/2addr v4, v9

    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/collections/CollectionsKt;->indexOf(Ljava/lang/Iterable;Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v9

    invoke-direct {v12, v3, v4, v5}, LMg0;-><init>(Ljava/lang/String;ZI)V

    new-instance v8, LG6;

    sget v13, LXj4;->item_category_header:I

    const/4 v14, 0x0

    const/4 v15, 0x4

    const/16 v16, 0x0

    move-object v11, v8

    invoke-direct/range {v11 .. v16}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v9

    const/4 v11, 0x0

    if-eqz v4, :cond_3

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v10, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/IssueTypeLock;

    invoke-virtual {v6}, Lco/bird/android/model/IssueTypeLock;->component1()Lco/bird/android/model/IssueType;

    move-result-object v13

    new-instance v6, LG6;

    sget v14, LXj4;->item_issue_header:I

    const/4 v15, 0x0

    const/16 v16, 0x4

    const/16 v17, 0x0

    move-object v12, v6

    invoke-direct/range {v12 .. v17}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    move-object v15, v8

    move v13, v9

    goto :goto_3

    :cond_3
    new-instance v12, LG6;

    sget v6, LXj4;->item_issue_empty:I

    const/4 v7, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object v4, v12

    move-object v5, v3

    move-object v15, v8

    move v8, v13

    move v13, v9

    move-object v9, v14

    invoke-direct/range {v4 .. v9}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v4, v13, [LG6;

    aput-object v12, v4, v11

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :goto_3
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    move v6, v11

    goto :goto_5

    :cond_4
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v11

    :cond_5
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/IssueTypeLock;

    invoke-virtual {v7}, Lco/bird/android/model/IssueTypeLock;->component1()Lco/bird/android/model/IssueType;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/IssueType;->isNoIssue()Z

    move-result v7

    xor-int/2addr v7, v13

    if-eqz v7, :cond_5

    add-int/lit8 v6, v6, 0x1

    if-gez v6, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_4

    :cond_6
    :goto_5
    new-instance v5, LG6;

    invoke-virtual/range {p0 .. p0}, LtA;->m()Landroid/content/Context;

    move-result-object v7

    sget v8, Lnl4;->work_order_inspect_issue_count:I

    new-array v9, v13, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v9, v11

    invoke-virtual {v7, v8, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v17

    sget v18, LXj4;->item_dropdown_button:I

    const/16 v19, 0x0

    const/16 v20, 0x4

    const/16 v21, 0x0

    move-object/from16 v16, v5

    invoke-direct/range {v16 .. v21}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, LH6;

    invoke-direct {v3, v4, v15, v5}, LH6;-><init>(Ljava/util/List;LG6;LG6;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    return-object v1
.end method

.method public final v(Ljava/lang/String;)LH6;
    .locals 13

    new-instance v6, LG6;

    sget v2, LXj4;->item_work_order_notes:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, LH6;

    const/4 v0, 0x1

    new-array v0, v0, [LG6;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v7, p1

    invoke-direct/range {v7 .. v12}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
