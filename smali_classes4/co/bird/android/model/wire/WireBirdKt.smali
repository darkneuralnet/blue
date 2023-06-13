.class public final Lco/bird/android/model/wire/WireBirdKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008;\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\n\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u000b\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u000c\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\r\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u000e\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u000f\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0010\u0010\u0010\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0011\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u0012\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u0013\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0016\u001a\u0012\u0010\u0017\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\n\u0010\u001a\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\u001b\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\u001c\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\u001d\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\u001e\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\u001f\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010 \u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010!\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\"\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010#\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010$\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010%\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010&\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\'\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010(\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010)\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010*\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010+\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010,\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010-\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010.\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010/\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00100\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00101\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00102\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00103\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00104\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00105\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00106\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00107\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00108\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00109\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010:\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010;\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010<\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010=\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010>\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010?\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010@\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010A\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010B\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010C\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010D\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010E\u001a\u00020\u0007*\u00020\u0016\u001a\u0012\u0010F\u001a\u00020\u0007*\u00020\u00162\u0006\u0010G\u001a\u00020\u0016\u001a\n\u0010H\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010I\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010J\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010K\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010L\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010M\u001a\u00020\u0007*\u00020\u0016\u001a\u0012\u0010N\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010O\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010P\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010Q\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010R\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u000c\u0010S\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\n\u0010T\u001a\u00020U*\u00020\u0016\u00a8\u0006V"
    }
    d2 = {
        "getDisplayName",
        "",
        "context",
        "Landroid/content/Context;",
        "partnerName",
        "vehicleModel",
        "vehicleIsB2Model",
        "",
        "model",
        "serialNumber",
        "vehicleIsB2_1Model",
        "vehicleIsB3Model",
        "vehicleIsBikeShare",
        "vehicleIsCruiserModel",
        "vehicleIsEsModel",
        "vehicleIsFlex",
        "vehicleIsM365Model",
        "vehicleIsOKBModel",
        "vehicleIsRfModel",
        "vehicleIsSModel",
        "birdModel",
        "Lco/bird/android/model/constant/BirdModel;",
        "Lco/bird/android/model/wire/WireBird;",
        "canTreatAsBluetooth",
        "config",
        "Lco/bird/android/model/wire/configs/Config;",
        "hasAvailableBrainState",
        "hasAvailableSpecialCondition",
        "hasCannotAccessReport",
        "isAsleep",
        "isAvailable",
        "isB2Model",
        "isB2_1Model",
        "isB3Model",
        "isB4Model",
        "isBdCompatible",
        "isBikeShare",
        "isBikeType",
        "isBirdAir",
        "isBirdBike",
        "isBirdBikePairable",
        "isBirdBikeUnpaired",
        "isBirdFlex",
        "isChargeTask",
        "isCollect",
        "isCruiserModel",
        "isDamaged",
        "isDebug",
        "isEsModel",
        "isImpounded",
        "isInFacility",
        "isInTransit",
        "isLost",
        "isM365Model",
        "isMotoType",
        "isMoveTask",
        "isNotAsleep",
        "isNotAvailable",
        "isNotCollect",
        "isNotDamaged",
        "isNotDebug",
        "isNotImpounded",
        "isNotInFacility",
        "isNotInTransit",
        "isNotLost",
        "isNotTotaled",
        "isOKBModel",
        "isOffline",
        "isPlacedInMarket",
        "isPrivateBird",
        "isProbablySameBird",
        "bird",
        "isRecalled",
        "isRfModel",
        "isSModel",
        "isSpecialTaskDispatch",
        "isSwappable",
        "isTotaled",
        "shouldConnectViaBTInRide",
        "shouldSubmitTrackEventsWhenConnected",
        "shouldTrackInRideBluetooth",
        "shouldTrackOutOfRideBluetooth",
        "shouldUpdateMaxSpeedOverBT",
        "stripObfuscatedCharacters",
        "taskBirdStatus",
        "Lco/bird/android/model/wire/TaskBirdStatus;",
        "model-wire_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWireBird.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WireBird.kt\nco/bird/android/model/wire/WireBirdKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,672:1\n151#2,6:673\n1#3:679\n*S KotlinDebug\n*F\n+ 1 WireBird.kt\nco/bird/android/model/wire/WireBirdKt\n*L\n669#1:673,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final birdModel(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/constant/BirdModel;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/constant/BirdModel;->Companion:Lco/bird/android/model/constant/BirdModel$Companion;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lco/bird/android/model/constant/BirdModel$Companion;->fromString(Ljava/lang/String;)Lco/bird/android/model/constant/BirdModel;

    move-result-object v0

    if-nez v0, :cond_e

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isM365Model(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->M365:Lco/bird/android/model/constant/BirdModel;

    :goto_0
    move-object v0, p0

    goto/16 :goto_1

    :cond_0
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isEsModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->ES:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isOKBModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->BD:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_2
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isRfModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->RF:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_3
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isB2Model(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->B2:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_4
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isB3Model(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->B3:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_5
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isB4Model(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->B4:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_6
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isCruiserModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->BC:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_7
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isBirdAir(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->BIRDAIR:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_8
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isBirdBikeUnpaired(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->BIRDBIKE_UNPAIRED:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_9
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isBirdBikePairable(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->BIRDBIKE_PAIRABLE:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_a
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isBikeShare(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->EB100:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_b
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isSModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->ES400:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_c
    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isBirdFlex(Lco/bird/android/model/wire/WireBird;)Z

    move-result p0

    if-eqz p0, :cond_d

    sget-object p0, Lco/bird/android/model/constant/BirdModel;->ES500:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_d
    sget-object p0, Lco/bird/android/model/constant/BirdModel;->UNKNOWN:Lco/bird/android/model/constant/BirdModel;

    goto :goto_0

    :cond_e
    :goto_1
    return-object v0
.end method

.method public static final canTreatAsBluetooth(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getBluetooth()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isOKBModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getEnableBdBluetoothOverride()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final getDisplayName(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bc"

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget p2, LXk4;->partner_moped_name:I

    goto :goto_0

    :cond_0
    sget p2, LXk4;->partner_scooter_name:I

    :goto_0
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    invoke-virtual {p0, p2, v1, v0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "{\n    context.resources.\u2026name, 1, partnerName)\n  }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget p1, LXk4;->bird_moped_name:I

    goto :goto_1

    :cond_2
    sget p1, LXk4;->bird_scooter_name:I

    :goto_1
    invoke-virtual {p0, p1, v1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, "{\n    context.resources.\u2026bird_scooter_name, 1)\n  }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-object p0
.end method

.method public static final hasAvailableBrainState(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getBrainState()Lco/bird/android/model/constant/BrainState;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/BrainState;->AVAILABLE:Lco/bird/android/model/constant/BrainState;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final hasAvailableSpecialCondition(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getSpecialCondition()Lco/bird/android/model/constant/SpecialCondition;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/SpecialCondition;->AVAILABLE:Lco/bird/android/model/constant/SpecialCondition;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final hasCannotAccessReport(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getBadgeType()Lco/bird/android/model/constant/MapPinBadge;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/MapPinBadge;->CANNOT_ACCESS_REPORT:Lco/bird/android/model/constant/MapPinBadge;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isAsleep(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getBrainState()Lco/bird/android/model/constant/BrainState;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/BrainState;->ASLEEP:Lco/bird/android/model/constant/BrainState;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isAvailable(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getCondition()Lco/bird/android/model/constant/Condition;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Condition;->AVAILABLE:Lco/bird/android/model/constant/Condition;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isB2Model(Lco/bird/android/model/wire/WireBird;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsB2Model(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isB2_1Model(Lco/bird/android/model/wire/WireBird;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final isB2_1Model(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsB2_1Model(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isB3Model(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsB3Model(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isB4Model(Lco/bird/android/model/wire/WireBird;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const-string p0, "b4"

    invoke-static {v0, p0, v1}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    const-string v0, "B7"

    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final isBdCompatible(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isOKBModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isBikeShare(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isSModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final isBikeShare(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsBikeShare(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isBikeType(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isMotoType(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isBirdBike(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isBikeShare(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isCruiserModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final isBirdAir(Lco/bird/android/model/wire/WireBird;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "birdair"

    const/4 v2, 0x1

    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-ne p0, v2, :cond_0

    move v0, v2

    :cond_0
    return v0
.end method

.method public static final isBirdBike(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isBirdBikeUnpaired(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isBirdBikePairable(Lco/bird/android/model/wire/WireBird;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final isBirdBikePairable(Lco/bird/android/model/wire/WireBird;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "hje"

    const/4 v2, 0x1

    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-ne p0, v2, :cond_0

    move v0, v2

    :cond_0
    return v0
.end method

.method public static final isBirdBikeUnpaired(Lco/bird/android/model/wire/WireBird;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "rb1"

    const/4 v2, 0x1

    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-ne p0, v2, :cond_0

    move v0, v2

    :cond_0
    return v0
.end method

.method public static final isBirdFlex(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsFlex(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isChargeTask(Lco/bird/android/model/wire/WireBird;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/model/constant/BirdTaskKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->CHARGE:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->DAMAGED_CHARGE:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getTaskKind()Lco/bird/android/model/constant/BirdTaskKind;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isCollect(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getSpecialCondition()Lco/bird/android/model/constant/SpecialCondition;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/SpecialCondition;->ACCIDENT:Lco/bird/android/model/constant/SpecialCondition;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isCruiserModel(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsCruiserModel(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isDamaged(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getCondition()Lco/bird/android/model/constant/Condition;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Condition;->NEEDS_SERVICE:Lco/bird/android/model/constant/Condition;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isDebug(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getBrainState()Lco/bird/android/model/constant/BrainState;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/BrainState;->DEBUG:Lco/bird/android/model/constant/BrainState;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isEsModel(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsEsModel(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isImpounded(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Placement;->IMPOUND:Lco/bird/android/model/constant/Placement;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isInFacility(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Placement;->FACILITY:Lco/bird/android/model/constant/Placement;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isInTransit(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Placement;->TRANSIT:Lco/bird/android/model/constant/Placement;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isLost(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Placement;->LOST:Lco/bird/android/model/constant/Placement;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isM365Model(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsM365Model(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isMotoType(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isCruiserModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result p0

    return p0
.end method

.method public static final isMoveTask(Lco/bird/android/model/wire/WireBird;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/model/constant/BirdTaskKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->REBALANCE:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->DAMAGED_TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getTaskKind()Lco/bird/android/model/constant/BirdTaskKind;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isNotAsleep(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getBrainState()Lco/bird/android/model/constant/BrainState;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/BrainState;->ASLEEP:Lco/bird/android/model/constant/BrainState;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isNotAvailable(Lco/bird/android/model/wire/WireBird;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLifecycle;->getCondition()Lco/bird/android/model/constant/Condition;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/Condition;->AVAILABLE:Lco/bird/android/model/constant/Condition;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLifecycle;->getSpecialCondition()Lco/bird/android/model/constant/SpecialCondition;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/SpecialCondition;->AVAILABLE:Lco/bird/android/model/constant/SpecialCondition;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLifecycle;->getBrainState()Lco/bird/android/model/constant/BrainState;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/BrainState;->AVAILABLE:Lco/bird/android/model/constant/BrainState;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Placement;->IN_MARKET:Lco/bird/android/model/constant/Placement;

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final isNotCollect(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getSpecialCondition()Lco/bird/android/model/constant/SpecialCondition;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/SpecialCondition;->ACCIDENT:Lco/bird/android/model/constant/SpecialCondition;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isNotDamaged(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getCondition()Lco/bird/android/model/constant/Condition;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Condition;->NEEDS_SERVICE:Lco/bird/android/model/constant/Condition;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isNotDebug(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getBrainState()Lco/bird/android/model/constant/BrainState;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/BrainState;->DEBUG:Lco/bird/android/model/constant/BrainState;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isNotImpounded(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Placement;->IMPOUND:Lco/bird/android/model/constant/Placement;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isNotInFacility(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Placement;->FACILITY:Lco/bird/android/model/constant/Placement;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isNotInTransit(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Placement;->TRANSIT:Lco/bird/android/model/constant/Placement;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isNotLost(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Placement;->LOST:Lco/bird/android/model/constant/Placement;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isNotTotaled(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getCondition()Lco/bird/android/model/constant/Condition;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Condition;->TOTALED:Lco/bird/android/model/constant/Condition;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isOKBModel(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsOKBModel(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isOffline(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getOffline()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getBrainState()Lco/bird/android/model/constant/BrainState;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/BrainState;->OFFLINE:Lco/bird/android/model/constant/BrainState;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final isPlacedInMarket(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getPlacement()Lco/bird/android/model/constant/Placement;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Placement;->IN_MARKET:Lco/bird/android/model/constant/Placement;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isPrivateBird(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isProbablySameBird(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WireBird;)Z
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->stripObfuscatedCharacters(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->stripObfuscatedCharacters(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ge v0, v1, :cond_1

    invoke-static {p1, p0, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, v4, v3, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final isRecalled(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getSpecialCondition()Lco/bird/android/model/constant/SpecialCondition;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/SpecialCondition;->RECALL:Lco/bird/android/model/constant/SpecialCondition;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isRfModel(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsRfModel(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isSModel(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lco/bird/android/model/wire/WireBirdKt;->vehicleIsSModel(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isSpecialTaskDispatch(Lco/bird/android/model/wire/WireBird;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/model/constant/BountyKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/BountyKind;->SPECIAL_TASK_DISPATCH_CHARGE:Lco/bird/android/model/constant/BountyKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/BountyKind;->SPECIAL_TASK_DISPATCH_REBALANCE:Lco/bird/android/model/constant/BountyKind;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getBountyKind()Lco/bird/android/model/constant/BountyKind;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isSwappable(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isBikeShare(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isSModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isB4Model(Lco/bird/android/model/wire/WireBird;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final isTotaled(Lco/bird/android/model/wire/WireBird;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getLifecycle()Lco/bird/android/model/wire/WireLifecycle;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLifecycle;->getCondition()Lco/bird/android/model/constant/Condition;

    move-result-object p0

    sget-object v0, Lco/bird/android/model/constant/Condition;->TOTALED:Lco/bird/android/model/constant/Condition;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final shouldConnectViaBTInRide(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->isOKBModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getEnableInRideBdTracks()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getForceClientTracksByModel()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getForceClientTracks()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {p0}, Lco/bird/android/model/wire/WireBirdKt;->birdModel(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/constant/BirdModel;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/constant/BirdModel;->isScanOnly()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final shouldSubmitTrackEventsWhenConnected(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getCellular()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getBluetooth()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getForceClientTracksByModel()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/wire/configs/RideConfig;->getForceClientTracks()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final shouldTrackInRideBluetooth(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lco/bird/android/model/wire/WireBirdKt;->canTreatAsBluetooth(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lco/bird/android/model/wire/WireBirdKt;->shouldConnectViaBTInRide(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final shouldTrackOutOfRideBluetooth(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lco/bird/android/model/wire/WireBirdKt;->canTreatAsBluetooth(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z

    move-result p0

    return p0
.end method

.method public static final shouldUpdateMaxSpeedOverBT(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getBluetooth()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getUpdateBtMaxSpeedByModel()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final stripObfuscatedCharacters(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_2

    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v5, 0x2022

    if-ne v4, v5, :cond_0

    move v4, v3

    goto :goto_1

    :cond_0
    move v4, v1

    :goto_1
    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, -0x1

    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-ltz v2, :cond_3

    goto :goto_3

    :cond_3
    move v3, v1

    :goto_3
    if-eqz v3, :cond_4

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/text/StringsKt;->substring(Ljava/lang/String;Lkotlin/ranges/IntRange;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    move-object p0, v0

    :cond_6
    :goto_5
    return-object p0
.end method

.method public static final taskBirdStatus(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/TaskBirdStatus;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireBird;->getDueAt()Lorg/joda/time/DateTime;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, LpT0;->e(Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/joda/time/base/AbstractInstant;->isBefore(Lorg/joda/time/ReadableInstant;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lco/bird/android/model/wire/TaskBirdStatus;->OVERDUE:Lco/bird/android/model/wire/TaskBirdStatus;

    goto :goto_0

    :cond_0
    sget-object p0, Lco/bird/android/model/wire/TaskBirdStatus;->DUE_FUTURE:Lco/bird/android/model/wire/TaskBirdStatus;

    :goto_0
    return-object p0

    :cond_1
    sget-object p0, Lco/bird/android/model/wire/TaskBirdStatus;->DUE_FUTURE:Lco/bird/android/model/wire/TaskBirdStatus;

    return-object p0
.end method

.method public static final vehicleIsB2Model(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    const-string p1, "b2"

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    const/4 v0, 0x0

    const-string v1, "B2"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, p0, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final vehicleIsB2_1Model(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    const-string p1, "b2"

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    const/4 v0, 0x0

    const-string v1, "B3"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, p0, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final vehicleIsB3Model(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    const-string p1, "b3"

    invoke-static {p0, p1, v0}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    goto :goto_0

    :cond_0
    const-string p0, "B4"

    invoke-static {p1, p0, v0}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final vehicleIsBikeShare(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    const-string v0, "eb100"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-ne p0, v1, :cond_0

    move p1, v1

    :cond_0
    return p1
.end method

.method public static final vehicleIsCruiserModel(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    const-string p1, "bc"

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    const/4 v0, 0x0

    const-string v1, "BC"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, p0, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final vehicleIsEsModel(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    const-string p1, "es"

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    const/4 v0, 0x0

    const-string v1, "N"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, p0, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final vehicleIsFlex(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    const-string v0, "es500"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-ne p0, v1, :cond_0

    move p1, v1

    :cond_0
    return p1
.end method

.method public static final vehicleIsM365Model(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    const-string v1, "m365"

    invoke-static {p0, v1, v0}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    :cond_0
    return v0
.end method

.method public static final vehicleIsOKBModel(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    const-string p1, "bd"

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    const/4 v0, 0x0

    const-string v1, "BD"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, p0, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final vehicleIsRfModel(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    const-string p1, "rf"

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    const/4 v0, 0x0

    const-string v1, "RF"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, p0, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final vehicleIsSModel(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    const-string v0, "es400"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-ne p0, v1, :cond_0

    move p1, v1

    :cond_0
    return p1
.end method
