.class public final Lml6$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lml6;->u1(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lml6$k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/CommandCenterButton;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/CommandCenterButton;",
        "kotlin.jvm.PlatformType",
        "commandButton",
        "",
        "a",
        "(Lco/bird/android/model/CommandCenterButton;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lml6;


# direct methods
.method public constructor <init>(Lml6;)V
    .locals 0

    iput-object p1, p0, Lml6$k;->g:Lml6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/CommandCenterButton;)V
    .locals 8

    instance-of v0, p1, Lco/bird/android/model/InspectButton;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getReactiveConfig$p(Lml6;)LTq4;

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

    sget-object v2, Lml6$k$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getNavigator$p(Lml6;)Le13;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Le13$a;->goToWorkOrderInspection$default(Le13;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;ZILjava/lang/Object;)V

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getNavigator$p(Lml6;)Le13;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Le13$a;->goToLegacyWorkOrderInspection$default(Le13;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;ZZILjava/lang/Object;)V

    goto/16 :goto_0

    :cond_2
    instance-of v0, p1, Lco/bird/android/model/ActiveWorkOrderButton;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getNavigator$p(Lml6;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lco/bird/android/model/ActiveWorkOrderButton;

    invoke-virtual {v2}, Lco/bird/android/model/ActiveWorkOrderButton;->getWorkOrder()Lco/bird/android/model/WorkOrder;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Le13;->o4(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)V

    goto/16 :goto_0

    :cond_3
    instance-of v0, p1, Lco/bird/android/model/PastWorkOrderButton;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getNavigator$p(Lml6;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lco/bird/android/model/PastWorkOrderButton;

    invoke-virtual {v2}, Lco/bird/android/model/PastWorkOrderButton;->getWorkOrder()Lco/bird/android/model/WorkOrder;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Le13;->o4(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)V

    goto/16 :goto_0

    :cond_4
    instance-of v0, p1, Lco/bird/android/model/UpdateServiceProgressButton;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getNavigator$p(Lml6;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    invoke-interface {v0, v1}, Le13;->X3(Lco/bird/android/model/wire/WireBird;)V

    goto/16 :goto_0

    :cond_5
    instance-of v0, p1, Lco/bird/android/model/EntryRoutingButton;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getNavigator$p(Lml6;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    invoke-interface {v0, v1}, Le13;->s3(Lco/bird/android/model/wire/WireBird;)V

    goto/16 :goto_0

    :cond_6
    instance-of v0, p1, Lco/bird/android/model/ScrapInspectionButton;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getNavigator$p(Lml6;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lco/bird/android/model/ScrapInspectionButton;

    invoke-virtual {v2}, Lco/bird/android/model/ScrapInspectionButton;->getScrapRequest()Lco/bird/android/model/VehicleScrapRequest;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Le13;->G3(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/VehicleScrapRequest;)V

    goto :goto_0

    :cond_7
    instance-of v0, p1, Lco/bird/android/model/ScrapCompletionButton;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lco/bird/android/model/ScrapCompletionButton;

    invoke-virtual {v2}, Lco/bird/android/model/ScrapCompletionButton;->getScrapRequest()Lco/bird/android/model/VehicleScrapRequest;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lml6;->access$completeScrap(Lml6;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/VehicleScrapRequest;)V

    goto :goto_0

    :cond_8
    instance-of v0, p1, Lco/bird/android/model/RepairButton;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getReactiveConfig$p(Lml6;)LTq4;

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

    sget-object v2, Lml6$k$a;->$EnumSwitchMapping$1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    if-ne v0, v1, :cond_9

    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getNavigator$p(Lml6;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    invoke-interface {v0, v1}, Le13;->E3(Lco/bird/android/model/wire/WireBird;)V

    goto :goto_0

    :cond_9
    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getNavigator$p(Lml6;)Le13;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/CommandCenterButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    invoke-interface {v0, v1}, Le13;->j4(Lco/bird/android/model/wire/WireBird;)V

    :cond_a
    :goto_0
    iget-object v0, p0, Lml6$k;->g:Lml6;

    invoke-static {v0}, Lml6;->access$getCommandCenterAnalyticsManager$p(Lml6;)Len0;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Len0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/CommandCenterButton;

    invoke-virtual {p0, p1}, Lml6$k;->a(Lco/bird/android/model/CommandCenterButton;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
