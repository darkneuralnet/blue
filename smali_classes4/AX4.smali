.class public final LAX4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRidePassView;",
        "Lco/bird/android/model/constant/RidePassViewStatus;",
        "status",
        "Lco/bird/android/model/persistence/RidePassView;",
        "a",
        "Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;",
        "Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;",
        "b",
        "Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;",
        "Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;",
        "c",
        "co.bird.android.repository.ride-pass-view"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireRidePassView;Lco/bird/android/model/constant/RidePassViewStatus;)Lco/bird/android/model/persistence/RidePassView;
    .locals 33

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v15, p1

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getUserRidePassId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getLinkCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getPrice()J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getPriceTax()Ljava/lang/Long;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getPreviousPrice()Ljava/lang/Long;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getCurrency()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getBannerImageUrl()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getBannerAction()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getTitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getZendeskArticleId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getDetailAction()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getConfirmationToast()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v28

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getExpiresAt()Lorg/joda/time/DateTime;

    move-result-object v29

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getIneligibleReason()Lco/bird/android/model/constant/RidePassViewIneligibleReason;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getRemainingDeviceTransferCount()Ljava/lang/Integer;

    move-result-object v18

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getCancelArticleId()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getFooter()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getDetailBody()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getDetailImageUrl()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getDetailBodyList()Ljava/util/List;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getDetailFooter()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getSubscriptionPlan()Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;

    move-result-object v2

    const/16 v16, 0x0

    if-eqz v2, :cond_0

    invoke-static {v2}, LAX4;->b(Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;)Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    move-result-object v2

    move-object/from16 v26, v2

    goto :goto_0

    :cond_0
    move-object/from16 v26, v16

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireRidePassView;->getUserSubscription()Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, LAX4;->c(Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;)Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;

    move-result-object v1

    move-object/from16 v27, v1

    goto :goto_1

    :cond_1
    move-object/from16 v27, v16

    :goto_1
    new-instance v32, Lco/bird/android/model/persistence/RidePassView;

    move-object/from16 v1, v32

    const/4 v2, 0x0

    const/16 v30, 0x1

    const/16 v31, 0x0

    move-object v15, v0

    move-object/from16 v16, p1

    invoke-direct/range {v1 .. v31}, Lco/bird/android/model/persistence/RidePassView;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v32
.end method

.method public static final b(Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;)Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;->getBillingIntervalDescription()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;)Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;->getNextRenewalAt()Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;)V

    return-object v0
.end method
