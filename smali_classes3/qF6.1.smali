.class public final LqF6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LoF6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ@\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u00040\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\n\u001a\u00020\tH\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "LqF6;",
        "LoF6;",
        "",
        "category",
        "",
        "Lco/bird/android/model/IssueType;",
        "categoryIssues",
        "Lco/bird/android/model/IssueTypeLock;",
        "selectedIssues",
        "",
        "hideIssueDetails",
        "Lio/reactivex/F;",
        "LH6;",
        "a",
        "<init>",
        "()V",
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
        "SMAP\nWorkOrderIssuesConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssuesConverter.kt\nco/bird/android/feature/workorders/issues/adapters/WorkOrderIssuesConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,2:45\n288#2,2:47\n1747#2,3:49\n1747#2,3:52\n1622#2:55\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssuesConverter.kt\nco/bird/android/feature/workorders/issues/adapters/WorkOrderIssuesConverterImpl\n*L\n21#1:44\n21#1:45,2\n23#1:47,2\n24#1:49,3\n28#1:52,3\n21#1:55\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LqF6;->c(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Ljava/util/List;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    const-string v3, "$categoryIssues"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$selectedIssues"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$category"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/IssueType;

    move-object v5, v1

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lco/bird/android/model/IssueTypeLock;

    invoke-virtual {v8}, Lco/bird/android/model/IssueTypeLock;->component1()Lco/bird/android/model/IssueType;

    move-result-object v8

    invoke-virtual {v8}, Lco/bird/android/model/IssueType;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lco/bird/android/model/IssueType;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_1
    check-cast v7, Lco/bird/android/model/IssueTypeLock;

    const/4 v6, 0x0

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lco/bird/android/model/IssueTypeLock;->getLocked()Z

    move-result v7

    goto :goto_2

    :cond_2
    move v7, v6

    :goto_2
    instance-of v8, v5, Ljava/util/Collection;

    const/4 v9, 0x1

    if-eqz v8, :cond_4

    move-object v10, v5

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_4

    :cond_3
    move v10, v6

    goto :goto_4

    :cond_4
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lco/bird/android/model/IssueTypeLock;

    invoke-virtual {v11}, Lco/bird/android/model/IssueTypeLock;->getIssueType()Lco/bird/android/model/IssueType;

    move-result-object v12

    invoke-virtual {v12}, Lco/bird/android/model/IssueType;->isNoIssue()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-virtual {v11}, Lco/bird/android/model/IssueTypeLock;->getIssueType()Lco/bird/android/model/IssueType;

    move-result-object v11

    invoke-virtual {v11}, Lco/bird/android/model/IssueType;->getCategory()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    move v11, v9

    goto :goto_3

    :cond_6
    move v11, v6

    :goto_3
    if-eqz v11, :cond_5

    move v10, v9

    :goto_4
    if-nez v10, :cond_7

    if-eqz v7, :cond_8

    :cond_7
    invoke-virtual {v4}, Lco/bird/android/model/IssueType;->isNoIssue()Z

    move-result v7

    if-eqz v7, :cond_9

    :cond_8
    move v7, v9

    goto :goto_5

    :cond_9
    move v7, v6

    :goto_5
    if-eqz v8, :cond_a

    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lco/bird/android/model/IssueTypeLock;

    invoke-virtual {v8}, Lco/bird/android/model/IssueTypeLock;->component1()Lco/bird/android/model/IssueType;

    move-result-object v8

    invoke-virtual {v8}, Lco/bird/android/model/IssueType;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lco/bird/android/model/IssueType;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    move v6, v9

    :cond_c
    :goto_6
    new-instance v9, LFa2;

    move/from16 v5, p2

    invoke-direct {v9, v4, v5, v7, v6}, LFa2;-><init>(Lco/bird/android/model/IssueType;ZZZ)V

    new-instance v4, LG6;

    sget v10, LXj4;->item_checkable_work_order_item:I

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v8, v4

    invoke-direct/range {v8 .. v13}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_d
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v15

    new-instance v0, LH6;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x6

    const/16 v19, 0x0

    move-object v14, v0

    invoke-direct/range {v14 .. v19}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/IssueType;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/IssueTypeLock;",
            ">;Z)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categoryIssues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedIssues"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LpF6;

    invoke-direct {v0, p2, p3, p4, p1}, LpF6;-><init>(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "fromCallable {\n      val\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
