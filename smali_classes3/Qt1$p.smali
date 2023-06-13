.class public final LQt1$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQt1;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/FlightSheetButton;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/FlightSheetButton;",
        "kotlin.jvm.PlatformType",
        "button",
        "",
        "a",
        "(Lco/bird/android/model/FlightSheetButton;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LQt1;


# direct methods
.method public constructor <init>(LQt1;)V
    .locals 0

    iput-object p1, p0, LQt1$p;->g:LQt1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/FlightSheetButton;)V
    .locals 10

    instance-of v0, p1, Lco/bird/android/model/FlightSheetActionButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, LQt1$p;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getAnalyticsManager$p(LQt1;)LEa;

    move-result-object v0

    new-instance v9, Lms1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    check-cast v1, Lco/bird/android/model/FlightSheetActionButton;

    invoke-interface {v1}, Lco/bird/android/model/FlightSheetActionButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1}, Lco/bird/android/model/FlightSheetActionButton;->getAction()Lco/bird/android/model/constant/FlightSheetAction;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lms1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v9}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/BatterySwapButton;

    if-eqz v0, :cond_1

    iget-object v0, p0, LQt1$p;->g:LQt1;

    check-cast p1, Lco/bird/android/model/BatterySwapButton;

    invoke-virtual {p1}, Lco/bird/android/model/BatterySwapButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {p1}, LBT;->f(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    invoke-static {v0, p1}, LQt1;->access$swapBattery(LQt1;Lco/bird/android/model/wire/WireBird;)V

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/SearchNearbyButton;

    if-eqz v0, :cond_2

    iget-object v0, p0, LQt1$p;->g:LQt1;

    check-cast p1, Lco/bird/android/model/SearchNearbyButton;

    invoke-virtual {p1}, Lco/bird/android/model/SearchNearbyButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {v0, p1}, LQt1;->access$searchNearby(LQt1;Lco/bird/android/model/persistence/Bird;)V

    goto/16 :goto_0

    :cond_2
    instance-of v0, p1, Lco/bird/android/model/CannotAccessButton;

    if-eqz v0, :cond_3

    iget-object v0, p0, LQt1$p;->g:LQt1;

    check-cast p1, Lco/bird/android/model/CannotAccessButton;

    invoke-virtual {p1}, Lco/bird/android/model/CannotAccessButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {v0, p1}, LQt1;->access$cannotAccess(LQt1;Lco/bird/android/model/persistence/Bird;)V

    goto/16 :goto_0

    :cond_3
    instance-of v0, p1, Lco/bird/android/model/CannotCaptureReports;

    if-eqz v0, :cond_4

    iget-object v0, p0, LQt1$p;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getUi$p(LQt1;)LWs1;

    move-result-object v0

    check-cast p1, Lco/bird/android/model/CannotCaptureReports;

    invoke-virtual {p1}, Lco/bird/android/model/CannotCaptureReports;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LWs1;->K5(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_4
    instance-of v0, p1, Lco/bird/android/model/OtherPossibleLocationsButton;

    if-eqz v0, :cond_5

    iget-object v0, p0, LQt1$p;->g:LQt1;

    check-cast p1, Lco/bird/android/model/OtherPossibleLocationsButton;

    invoke-virtual {p1}, Lco/bird/android/model/OtherPossibleLocationsButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {v0, p1}, LQt1;->access$otherPossibleLocation(LQt1;Lco/bird/android/model/persistence/Bird;)V

    goto/16 :goto_0

    :cond_5
    instance-of v0, p1, Lco/bird/android/model/LastRideInfoButton;

    if-nez v0, :cond_c

    instance-of v0, p1, Lco/bird/android/model/PrivatePropertyButton;

    if-eqz v0, :cond_6

    iget-object v0, p0, LQt1$p;->g:LQt1;

    check-cast p1, Lco/bird/android/model/PrivatePropertyButton;

    invoke-virtual {p1}, Lco/bird/android/model/PrivatePropertyButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {v0, p1}, LQt1;->access$showPrivatePropertyOption(LQt1;Lco/bird/android/model/persistence/Bird;)V

    goto/16 :goto_0

    :cond_6
    instance-of v0, p1, Lco/bird/android/model/LocateBirdButton;

    if-eqz v0, :cond_7

    iget-object v0, p0, LQt1$p;->g:LQt1;

    check-cast p1, Lco/bird/android/model/LocateBirdButton;

    invoke-virtual {p1}, Lco/bird/android/model/LocateBirdButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {v0, p1}, LQt1;->access$locateBird(LQt1;Lco/bird/android/model/persistence/Bird;)V

    goto/16 :goto_0

    :cond_7
    instance-of v0, p1, Lco/bird/android/model/RideHistoryButton;

    if-eqz v0, :cond_8

    iget-object v0, p0, LQt1$p;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getNavigator$p(LQt1;)Le13;

    move-result-object v0

    check-cast p1, Lco/bird/android/model/RideHistoryButton;

    invoke-virtual {p1}, Lco/bird/android/model/RideHistoryButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {p1}, LBT;->f(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    invoke-interface {v0, p1}, Le13;->o3(Lco/bird/android/model/wire/WireBird;)V

    goto/16 :goto_0

    :cond_8
    instance-of v0, p1, Lco/bird/android/model/DiagnosticsButton;

    if-eqz v0, :cond_9

    iget-object v0, p0, LQt1$p;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getNavigator$p(LQt1;)Le13;

    move-result-object v0

    check-cast p1, Lco/bird/android/model/DiagnosticsButton;

    invoke-virtual {p1}, Lco/bird/android/model/DiagnosticsButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {p1}, LBT;->f(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    invoke-interface {v0, p1}, Le13;->y2(Lco/bird/android/model/wire/WireBird;)V

    goto/16 :goto_0

    :cond_9
    instance-of v0, p1, Lco/bird/android/model/PastRepairsButton;

    if-eqz v0, :cond_a

    iget-object v0, p0, LQt1$p;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getNavigator$p(LQt1;)Le13;

    move-result-object v0

    check-cast p1, Lco/bird/android/model/PastRepairsButton;

    invoke-virtual {p1}, Lco/bird/android/model/PastRepairsButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Le13;->K(Ljava/lang/String;)V

    goto :goto_0

    :cond_a
    instance-of v0, p1, Lco/bird/android/model/CampaignButton;

    if-eqz v0, :cond_b

    iget-object v0, p0, LQt1$p;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getReactiveConfig$p(LQt1;)LTq4;

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

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getRepair()Lco/bird/android/model/wire/configs/OperatorRepairConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->getEnableRepairV3()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, LQt1$p;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getAnalyticsManager$p(LQt1;)LEa;

    move-result-object v0

    new-instance v9, Lvs1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    check-cast p1, Lco/bird/android/model/CampaignButton;

    invoke-virtual {p1}, Lco/bird/android/model/CampaignButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lco/bird/android/model/CampaignButton;->getCampaignName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lvs1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v9}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object v0, p0, LQt1$p;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getNavigator$p(LQt1;)Le13;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/CampaignButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/InspectionContext;->FLIGHT_SHEET:Lco/bird/android/model/constant/InspectionContext;

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Le13$a;->goToInspectionV3$default(Le13;Ljava/lang/String;Lco/bird/android/model/constant/InspectionContext;Ljava/lang/Integer;ILjava/lang/Object;)V

    goto :goto_0

    :cond_b
    instance-of v0, p1, Lco/bird/android/model/AllReviewsButton;

    if-eqz v0, :cond_c

    iget-object v0, p0, LQt1$p;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getNavigator$p(LQt1;)Le13;

    move-result-object v0

    check-cast p1, Lco/bird/android/model/AllReviewsButton;

    invoke-virtual {p1}, Lco/bird/android/model/AllReviewsButton;->getBirdId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Le13;->n1(Ljava/lang/String;)V

    :cond_c
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/FlightSheetButton;

    invoke-virtual {p0, p1}, LQt1$p;->a(Lco/bird/android/model/FlightSheetButton;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
