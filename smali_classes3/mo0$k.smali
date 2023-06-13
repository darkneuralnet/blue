.class public final Lmo0$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmo0;->a(Lco/bird/android/model/wire/WireBird;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmo0$k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/CommandCenterButton;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Unit;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/CommandCenterButton;",
        "button",
        "Lio/reactivex/K;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/CommandCenterButton;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lmo0;


# direct methods
.method public constructor <init>(Lmo0;)V
    .locals 0

    iput-object p1, p0, Lmo0$k;->g:Lmo0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/CommandCenterButton;)Lio/reactivex/K;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/CommandCenterButton;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "button"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/android/model/InspectButton;

    const-string v1, "{\n            when (reac\u2026le.just(Unit)\n          }"

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmo0$k;->g:Lmo0;

    invoke-static {v0}, Lmo0;->access$getReactiveConfig$p(Lmo0;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getWorkOrders()Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->getInspectionFlow()Lco/bird/android/model/constant/InspectionFlow;

    move-result-object v0

    sget-object v3, Lmo0$k$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lmo0$k;->g:Lmo0;

    invoke-static {v0}, Lmo0;->access$getNavigator$p(Lmo0;)Le13;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    check-cast p1, Lco/bird/android/model/InspectButton;

    invoke-virtual {p1}, Lco/bird/android/model/InspectButton;->getWorkOrder()Lco/bird/android/model/WorkOrder;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Le13$a;->goToWorkOrderInspection$default(Le13;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lmo0$k;->g:Lmo0;

    invoke-static {v0}, Lmo0;->access$getNavigator$p(Lmo0;)Le13;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    check-cast p1, Lco/bird/android/model/InspectButton;

    invoke-virtual {p1}, Lco/bird/android/model/InspectButton;->getWorkOrder()Lco/bird/android/model/WorkOrder;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Le13$a;->goToLegacyWorkOrderInspection$default(Le13;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;ZZILjava/lang/Object;)V

    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/RepairButton;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lmo0$k;->g:Lmo0;

    invoke-static {v0}, Lmo0;->access$getReactiveConfig$p(Lmo0;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getWorkOrders()Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorWorkOrderConfig;->getRepairFlow()Lco/bird/android/model/constant/RepairFlow;

    move-result-object v0

    sget-object v3, Lmo0$k$a;->$EnumSwitchMapping$1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lmo0$k;->g:Lmo0;

    invoke-static {v0}, Lmo0;->access$getNavigator$p(Lmo0;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    invoke-interface {v0, p1}, Le13;->E3(Lco/bird/android/model/wire/WireBird;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lmo0$k;->g:Lmo0;

    invoke-static {v0}, Lmo0;->access$getNavigator$p(Lmo0;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    invoke-interface {v0, p1}, Le13;->j4(Lco/bird/android/model/wire/WireBird;)V

    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_3
    instance-of v0, p1, Lco/bird/android/model/ScrapInspectionButton;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lmo0$k;->g:Lmo0;

    invoke-static {v0}, Lmo0;->access$getNavigator$p(Lmo0;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    check-cast p1, Lco/bird/android/model/ScrapInspectionButton;

    invoke-virtual {p1}, Lco/bird/android/model/ScrapInspectionButton;->getScrapRequest()Lco/bird/android/model/VehicleScrapRequest;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Le13;->G3(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/VehicleScrapRequest;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "{\n            navigator.\u2026le.just(Unit)\n          }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_4
    instance-of v0, p1, Lco/bird/android/model/QualityControlButton;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lmo0$k;->g:Lmo0;

    invoke-static {v0}, Lmo0;->access$getReactiveConfig$p(Lmo0;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getServiceCenterConfig()Lco/bird/android/model/wire/configs/ServiceCenterConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ServiceCenterConfig;->getQualityControl()Lco/bird/android/model/wire/configs/ServiceCenterQualityControlConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ServiceCenterQualityControlConfig;->getFlow()Lco/bird/android/model/constant/QualityControlFlow;

    move-result-object v0

    sget-object v3, Lmo0$k$a;->$EnumSwitchMapping$2:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    if-ne v0, v2, :cond_5

    iget-object v0, p0, Lmo0$k;->g:Lmo0;

    invoke-static {v0}, Lmo0;->access$getNavigator$p(Lmo0;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    check-cast p1, Lco/bird/android/model/QualityControlButton;

    invoke-virtual {p1}, Lco/bird/android/model/QualityControlButton;->getWorkOrder()Lco/bird/android/model/WorkOrder;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Le13;->M(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lmo0$k;->g:Lmo0;

    invoke-static {v0}, Lmo0;->access$getNavigator$p(Lmo0;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    check-cast p1, Lco/bird/android/model/QualityControlButton;

    invoke-virtual {p1}, Lco/bird/android/model/QualityControlButton;->getWorkOrder()Lco/bird/android/model/WorkOrder;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Le13;->E1(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)V

    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    instance-of v0, p1, Lco/bird/android/model/ScrapCompletionButton;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lmo0$k;->g:Lmo0;

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    check-cast p1, Lco/bird/android/model/ScrapCompletionButton;

    invoke-virtual {p1}, Lco/bird/android/model/ScrapCompletionButton;->getScrapRequest()Lco/bird/android/model/VehicleScrapRequest;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lmo0;->access$completeScrap(Lmo0;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/VehicleScrapRequest;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :cond_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "just(Unit)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/CommandCenterButton;

    invoke-virtual {p0, p1}, Lmo0$k;->a(Lco/bird/android/model/CommandCenterButton;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
