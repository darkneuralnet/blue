.class public final LVD6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTD6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J0\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0008\u0010\u000c\u001a\u00020\nH\u0002J$\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0016\u0010\u0010\u001a\u00020\n2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\tH\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "LVD6;",
        "LTD6;",
        "Lco/bird/android/model/constant/BirdModel;",
        "model",
        "Lco/bird/android/model/WorkOrder;",
        "workOrder",
        "Lco/bird/android/model/constant/ServiceCenterRoute;",
        "route",
        "Lio/reactivex/F;",
        "",
        "LH6;",
        "a",
        "e",
        "f",
        "Lco/bird/android/model/Issue;",
        "failedIssues",
        "d",
        "Landroid/content/Context;",
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
        "SMAP\nWorkOrderInspectionCompleteConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionCompleteConverter.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/adapters/WorkOrderInspectionCompleteConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1549#2:106\n1620#2,3:107\n766#2:110\n857#2,2:111\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionCompleteConverter.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/adapters/WorkOrderInspectionCompleteConverterImpl\n*L\n94#1:106\n94#1:107,3\n32#1:110\n32#1:111,2\n*E\n"
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

    iput-object p1, p0, LVD6;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic b(Lco/bird/android/model/WorkOrder;LVD6;Lco/bird/android/model/constant/BirdModel;Lco/bird/android/model/constant/ServiceCenterRoute;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LVD6;->c(Lco/bird/android/model/WorkOrder;LVD6;Lco/bird/android/model/constant/BirdModel;Lco/bird/android/model/constant/ServiceCenterRoute;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lco/bird/android/model/WorkOrder;LVD6;Lco/bird/android/model/constant/BirdModel;Lco/bird/android/model/constant/ServiceCenterRoute;)Ljava/util/List;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$model"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lco/bird/android/model/WorkOrder;->getIssues()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lco/bird/android/model/Issue;

    invoke-virtual {v5}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/IssueStatus;->OPEN:Lco/bird/android/model/IssueStatus;

    if-ne v5, v6, :cond_1

    move v5, v0

    goto :goto_1

    :cond_1
    move v5, v1

    :goto_1
    if-eqz v5, :cond_0

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :cond_3
    const/4 v2, 0x3

    new-array v2, v2, [LH6;

    invoke-virtual {p1}, LVD6;->e()LH6;

    move-result-object v4

    aput-object v4, v2, v1

    invoke-virtual {p1, p2, p0, p3}, LVD6;->f(Lco/bird/android/model/constant/BirdModel;Lco/bird/android/model/WorkOrder;Lco/bird/android/model/constant/ServiceCenterRoute;)LH6;

    move-result-object p0

    aput-object p0, v2, v0

    if-nez v3, :cond_4

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    :cond_4
    invoke-virtual {p1, v3}, LVD6;->d(Ljava/util/List;)LH6;

    move-result-object p0

    const/4 p1, 0x2

    aput-object p0, v2, p1

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/model/constant/BirdModel;Lco/bird/android/model/WorkOrder;Lco/bird/android/model/constant/ServiceCenterRoute;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/BirdModel;",
            "Lco/bird/android/model/WorkOrder;",
            "Lco/bird/android/model/constant/ServiceCenterRoute;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LUD6;

    invoke-direct {v0, p2, p0, p1, p3}, LUD6;-><init>(Lco/bird/android/model/WorkOrder;LVD6;Lco/bird/android/model/constant/BirdModel;Lco/bird/android/model/constant/ServiceCenterRoute;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "fromCallable {\n      val\u2026Schedulers.computation())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final d(Ljava/util/List;)LH6;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/Issue;",
            ">;)",
            "LH6;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lco/bird/android/model/Issue;

    new-instance v1, LG6;

    sget v4, LXj4;->item_issue_header:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v9

    new-instance p1, LH6;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v8, p1

    invoke-direct/range {v8 .. v13}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final e()LH6;
    .locals 13

    new-instance v6, LG6;

    const/4 v1, 0x0

    sget v2, LXj4;->item_inspection_complete:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, LH6;

    const/4 v1, 0x1

    new-array v1, v1, [LG6;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final f(Lco/bird/android/model/constant/BirdModel;Lco/bird/android/model/WorkOrder;Lco/bird/android/model/constant/ServiceCenterRoute;)LH6;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterRoute;->CHARGE:Lco/bird/android/model/constant/ServiceCenterRoute;

    if-ne v1, v2, :cond_0

    iget-object v1, v0, LVD6;->a:Landroid/content/Context;

    sget v2, Lnl4;->work_order_inspection_dialog_charge_only:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "context.getString(L.stri\u2026ction_dialog_charge_only)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, LVD6;->a:Landroid/content/Context;

    sget v3, Lnl4;->work_order_inspection_dialog_instruction_charge_only:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "context.getString(L.stri\u2026_instruction_charge_only)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, LVD6;->a:Landroid/content/Context;

    sget v4, LDf4;->green:I

    invoke-static {v3, v4}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    goto/16 :goto_1

    :cond_0
    sget-object v2, Lco/bird/android/model/constant/ServiceCenterRoute;->SERVICE_COMPLETE:Lco/bird/android/model/constant/ServiceCenterRoute;

    if-ne v1, v2, :cond_1

    iget-object v1, v0, LVD6;->a:Landroid/content/Context;

    sget v2, Lnl4;->work_order_inspection_dialog_service_complete:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "context.getString(L.stri\u2026_dialog_service_complete)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, LVD6;->a:Landroid/content/Context;

    sget v3, Lnl4;->work_order_inspection_dialog_instruction_service_complete:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "context.getString(L.stri\u2026ruction_service_complete)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, LVD6;->a:Landroid/content/Context;

    sget v4, LDf4;->green:I

    invoke-static {v3, v4}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/WorkOrder;->getStatus()Lco/bird/android/model/WorkOrderStatus;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    sget-object v2, Lco/bird/android/model/WorkOrderStatus;->QUALITY_CONTROL:Lco/bird/android/model/WorkOrderStatus;

    if-ne v1, v2, :cond_3

    iget-object v1, v0, LVD6;->a:Landroid/content/Context;

    sget v2, Lnl4;->work_order_inspection_dialog_quality_control:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "context.getString(L.stri\u2026n_dialog_quality_control)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, LVD6;->a:Landroid/content/Context;

    sget v3, Lnl4;->work_order_inspection_dialog_instruction_quality_control:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "context.getString(L.stri\u2026truction_quality_control)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, LVD6;->a:Landroid/content/Context;

    sget v4, LDf4;->green:I

    invoke-static {v3, v4}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    goto :goto_1

    :cond_3
    iget-object v1, v0, LVD6;->a:Landroid/content/Context;

    sget v2, Lnl4;->work_order_inspection_dialog_awaiting_repair:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "context.getString(L.stri\u2026n_dialog_awaiting_repair)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, LVD6;->a:Landroid/content/Context;

    sget v3, Lnl4;->work_order_inspection_dialog_instruction_awaiting_repair:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "context.getString(L.stri\u2026truction_awaiting_repair)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, LVD6;->a:Landroid/content/Context;

    sget v4, LDf4;->yellow:I

    invoke-static {v3, v4}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    :goto_1
    new-instance v10, LG6;

    new-instance v5, LS32;

    move-object/from16 v4, p1

    invoke-direct {v5, v1, v2, v4, v3}, LS32;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;I)V

    sget v6, LXj4;->item_inspection_complete_instructions:I

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, LH6;

    const/4 v2, 0x1

    new-array v2, v2, [LG6;

    const/4 v3, 0x0

    aput-object v10, v2, v3

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x6

    const/16 v16, 0x0

    move-object v11, v1

    invoke-direct/range {v11 .. v16}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
