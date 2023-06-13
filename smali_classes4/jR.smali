.class public final LjR;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0010\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u001a\u001e\u0010\t\u001a\u00020\u0002*\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u001a\n\u0010\u000c\u001a\u00020\u000b*\u00020\n\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\r\u001a\n\u0010\u0011\u001a\u00020\u0010*\u00020\u0005\u001a\n\u0010\u0014\u001a\u00020\u0013*\u00020\u0012\u001a\n\u0010\u0017\u001a\u00020\u0016*\u00020\u0015\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0018\u001a\n\u0010\u001d\u001a\u00020\u001c*\u00020\u001b\u001a\n\u0010 \u001a\u00020\u001f*\u00020\u001e\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/api/response/BirdPlusViewResponse;",
        "",
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "j",
        "Lco/bird/api/response/WireBirdPlusView;",
        "Lco/bird/api/response/WireBirdPlusDisplay;",
        "display",
        "",
        "zendeskArticleId",
        "g",
        "Lco/bird/api/response/WireBirdPlusSubscriptionPlan;",
        "Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;",
        "e",
        "Lco/bird/api/response/WireBirdPlusUserSubscription;",
        "Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;",
        "f",
        "Lco/bird/android/model/persistence/BirdPlusDisplayView;",
        "b",
        "Lco/bird/android/model/wire/WireLegacyAsset;",
        "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;",
        "i",
        "Lco/bird/android/model/wire/WireAssetMedia;",
        "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;",
        "h",
        "Lco/bird/api/response/WireSubscriptionPlanTrial;",
        "Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;",
        "d",
        "Lco/bird/api/response/WireBirdPlusPerk;",
        "Lco/bird/android/model/persistence/BirdPlusPerkView;",
        "c",
        "Lco/bird/api/response/WireBirdPlusActivity;",
        "Lco/bird/android/model/persistence/BirdPlusActivityView;",
        "a",
        "co.bird.android.repository.birdplus"
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
        "SMAP\nBirdPlusViewConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusViewConversion.kt\nco/bird/android/repository/birdplus/converters/BirdPlusViewConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1549#2:132\n1620#2,3:133\n1549#2:136\n1620#2,3:137\n1549#2:140\n1620#2,3:141\n1549#2:144\n1620#2,3:145\n*S KotlinDebug\n*F\n+ 1 BirdPlusViewConversion.kt\nco/bird/android/repository/birdplus/converters/BirdPlusViewConversionKt\n*L\n25#1:132\n25#1:133,3\n26#1:136\n26#1:137,3\n27#1:140\n27#1:141,3\n59#1:144\n59#1:145,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/api/response/WireBirdPlusActivity;)Lco/bird/android/model/persistence/BirdPlusActivityView;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lco/bird/android/model/persistence/BirdPlusActivityView;

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0, v0, v0}, Lco/bird/android/model/persistence/BirdPlusActivityView;-><init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object p0
.end method

.method public static final b(Lco/bird/api/response/WireBirdPlusDisplay;)Lco/bird/android/model/persistence/BirdPlusDisplayView;
    .locals 20

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/BirdPlusDisplayView;

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getHeroImage()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-static {v2}, LjR;->i(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v2

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getHeroAnimation()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, LjR;->i(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v2

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getHeroPillLabel()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getHeroMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getBannerIcon()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, LjR;->i(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object v8, v3

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getBannerTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getBannerMessage()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getPlanPreviewTitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getPlanPreviewMessage()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getPlanName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getPurchasedHeroTopImage()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2}, LjR;->i(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v2

    move-object v14, v2

    goto :goto_3

    :cond_3
    move-object v14, v3

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getPurchasedMessage()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getPurchasedHeroBottomImage()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2}, LjR;->i(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_4

    :cond_4
    move-object/from16 v16, v3

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getPurchasedHeroAnimation()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, LjR;->i(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v2

    move-object/from16 v19, v2

    goto :goto_5

    :cond_5
    move-object/from16 v19, v3

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getPurchasedHeroTopColor()Ljava/lang/Integer;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lco/bird/api/response/WireBirdPlusDisplay;->getPurchasedHeroBottomColor()Ljava/lang/Integer;

    move-result-object v18

    move-object v2, v0

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v19

    invoke-direct/range {v2 .. v18}, Lco/bird/android/model/persistence/BirdPlusDisplayView;-><init>(Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public static final c(Lco/bird/api/response/WireBirdPlusPerk;)Lco/bird/android/model/persistence/BirdPlusPerkView;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/BirdPlusPerkView;

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusPerk;->getIcon()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, LjR;->i(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusPerk;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusPerk;->getDescription()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lco/bird/android/model/persistence/BirdPlusPerkView;-><init>(Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final d(Lco/bird/api/response/WireSubscriptionPlanTrial;)Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    invoke-virtual {p0}, Lco/bird/api/response/WireSubscriptionPlanTrial;->getDescription()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final e(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;)Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getCodename()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getPriceAmount()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getPriceAmountTax()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getCurrency()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getZendeskArticleId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getLegalMessage()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getDisplay()Lco/bird/api/response/WireBirdPlusDisplay;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, LjR;->b(Lco/bird/api/response/WireBirdPlusDisplay;)Lco/bird/android/model/persistence/BirdPlusDisplayView;

    move-result-object v0

    move-object v9, v0

    goto :goto_0

    :cond_0
    move-object v9, v1

    :goto_0
    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getTrial()Lco/bird/api/response/WireSubscriptionPlanTrial;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LjR;->d(Lco/bird/api/response/WireSubscriptionPlanTrial;)Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    move-result-object v0

    move-object v10, v0

    goto :goto_1

    :cond_1
    move-object v10, v1

    :goto_1
    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getPerks()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_3

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/api/response/WireBirdPlusPerk;

    invoke-static {v1}, LjR;->c(Lco/bird/api/response/WireBirdPlusPerk;)Lco/bird/android/model/persistence/BirdPlusPerkView;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    move-object v11, v0

    goto :goto_3

    :cond_3
    move-object v11, v1

    :goto_3
    new-instance p0, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-object v1, p0

    invoke-direct/range {v1 .. v11}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusDisplayView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;Ljava/util/List;)V

    return-object p0
.end method

.method public static final f(Lco/bird/api/response/WireBirdPlusUserSubscription;)Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusUserSubscription;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusUserSubscription;->getRecurringCanceledAt()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusUserSubscription;->getActivity()Lco/bird/api/response/WireBirdPlusActivity;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-static {v3}, LjR;->a(Lco/bird/api/response/WireBirdPlusActivity;)Lco/bird/android/model/persistence/BirdPlusActivityView;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusUserSubscription;->getTrial()Lco/bird/api/response/WireSubscriptionPlanTrial;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, LjR;->d(Lco/bird/api/response/WireSubscriptionPlanTrial;)Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    move-result-object v4

    :cond_1
    invoke-direct {v0, v1, v2, v3, v4}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/BirdPlusActivityView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;)V

    return-object v0
.end method

.method public static final g(Lco/bird/api/response/WireBirdPlusView;Lco/bird/api/response/WireBirdPlusDisplay;Ljava/lang/String;)Lco/bird/android/model/persistence/BirdPlusView;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusView;->getStatus()Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusView;->getSubscriptionPlan()Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    move-result-object v1

    const-string v3, ""

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v4, v3

    :goto_1
    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusView;->getUserSubscription()Lco/bird/api/response/WireBirdPlusUserSubscription;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/api/response/WireBirdPlusUserSubscription;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    move-object v5, v1

    goto :goto_3

    :cond_3
    :goto_2
    move-object v5, v3

    :goto_3
    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusView;->getSubscriptionPlan()Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->getCodename()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    move-object v6, v1

    goto :goto_5

    :cond_5
    :goto_4
    move-object v6, v3

    :goto_5
    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusView;->getSubscriptionPlan()Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    invoke-static {v1}, LjR;->e(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;)Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v1

    move-object v7, v1

    goto :goto_6

    :cond_6
    move-object v7, v3

    :goto_6
    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusView;->getUserSubscription()Lco/bird/api/response/WireBirdPlusUserSubscription;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1}, LjR;->f(Lco/bird/api/response/WireBirdPlusUserSubscription;)Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    move-result-object v1

    move-object v8, v1

    goto :goto_7

    :cond_7
    move-object v8, v3

    :goto_7
    invoke-virtual {p0}, Lco/bird/api/response/WireBirdPlusView;->getIneligibleReason()Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    move-result-object p0

    if-eqz p1, :cond_8

    invoke-static {p1}, LjR;->b(Lco/bird/api/response/WireBirdPlusDisplay;)Lco/bird/android/model/persistence/BirdPlusDisplayView;

    move-result-object p1

    move-object v9, p1

    goto :goto_8

    :cond_8
    move-object v9, v3

    :goto_8
    move-object v1, v0

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, p0

    move-object v10, p2

    invoke-direct/range {v1 .. v10}, Lco/bird/android/model/persistence/BirdPlusView;-><init>(Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;Lco/bird/android/model/persistence/BirdPlusDisplayView;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final h(Lco/bird/android/model/wire/WireAssetMedia;)Lco/bird/android/model/persistence/nestedstructures/AssetMedia;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAssetMedia;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaType()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final i(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLegacyAsset;->getKind()Lco/bird/android/model/constant/AssetKind;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLegacyAsset;->getMedia()Lco/bird/android/model/wire/WireAssetMedia;

    move-result-object p0

    invoke-static {p0}, LjR;->h(Lco/bird/android/model/wire/WireAssetMedia;)Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;-><init>(Lco/bird/android/model/constant/AssetKind;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V

    return-object v0
.end method

.method public static final j(Lco/bird/api/response/BirdPlusViewResponse;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/BirdPlusViewResponse;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BirdPlusView;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/util/List;

    invoke-virtual {p0}, Lco/bird/api/response/BirdPlusViewResponse;->getAvailable()Ljava/util/List;

    move-result-object v1

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/api/response/WireBirdPlusView;

    invoke-virtual {p0}, Lco/bird/api/response/BirdPlusViewResponse;->getDisplay()Lco/bird/api/response/WireBirdPlusDisplay;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/api/response/BirdPlusViewResponse;->getZendeskArticleId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v6, v7}, LjR;->g(Lco/bird/api/response/WireBirdPlusView;Lco/bird/api/response/WireBirdPlusDisplay;Ljava/lang/String;)Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v4, v3

    :cond_1
    const/4 v1, 0x0

    aput-object v4, v0, v1

    invoke-virtual {p0}, Lco/bird/api/response/BirdPlusViewResponse;->getActive()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/api/response/WireBirdPlusView;

    invoke-virtual {p0}, Lco/bird/api/response/BirdPlusViewResponse;->getDisplay()Lco/bird/api/response/WireBirdPlusDisplay;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/api/response/BirdPlusViewResponse;->getZendeskArticleId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v6, v7}, LjR;->g(Lco/bird/api/response/WireBirdPlusView;Lco/bird/api/response/WireBirdPlusDisplay;Ljava/lang/String;)Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object v4, v3

    :cond_3
    const/4 v1, 0x1

    aput-object v4, v0, v1

    invoke-virtual {p0}, Lco/bird/api/response/BirdPlusViewResponse;->getIneligible()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/api/response/WireBirdPlusView;

    invoke-virtual {p0}, Lco/bird/api/response/BirdPlusViewResponse;->getDisplay()Lco/bird/api/response/WireBirdPlusDisplay;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/api/response/BirdPlusViewResponse;->getZendeskArticleId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v4, v5}, LjR;->g(Lco/bird/api/response/WireBirdPlusView;Lco/bird/api/response/WireBirdPlusDisplay;Ljava/lang/String;)Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    const/4 p0, 0x2

    aput-object v3, v0, p0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
