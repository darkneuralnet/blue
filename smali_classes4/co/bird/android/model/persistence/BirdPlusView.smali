.class public final Lco/bird/android/model/persistence/BirdPlusView;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u001c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Be\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jo\u00102\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u00103\u001a\u00020\u00192\u0008\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u0013R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0013\u00a8\u00068"
    }
    d2 = {
        "Lco/bird/android/model/persistence/BirdPlusView;",
        "",
        "status",
        "Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;",
        "subscriptionPlanId",
        "",
        "userSubscriptionId",
        "codename",
        "subscriptionPlan",
        "Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;",
        "userSubscription",
        "Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;",
        "ineligibleReason",
        "Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;",
        "display",
        "Lco/bird/android/model/persistence/BirdPlusDisplayView;",
        "zendeskArticleId",
        "(Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;Lco/bird/android/model/persistence/BirdPlusDisplayView;Ljava/lang/String;)V",
        "getCodename",
        "()Ljava/lang/String;",
        "getDisplay",
        "()Lco/bird/android/model/persistence/BirdPlusDisplayView;",
        "getIneligibleReason",
        "()Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;",
        "isActive",
        "",
        "()Z",
        "isAvailable",
        "isIneligible",
        "isPurchased",
        "needsDeviceTransfer",
        "getNeedsDeviceTransfer",
        "getStatus",
        "()Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;",
        "getSubscriptionPlan",
        "()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;",
        "getSubscriptionPlanId",
        "getUserSubscription",
        "()Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;",
        "getUserSubscriptionId",
        "getZendeskArticleId",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "model-persistence_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final codename:Ljava/lang/String;

.field private final display:Lco/bird/android/model/persistence/BirdPlusDisplayView;

.field private final ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

.field private final status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

.field private final subscriptionPlan:Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

.field private final subscriptionPlanId:Ljava/lang/String;

.field private final userSubscription:Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

.field private final userSubscriptionId:Ljava/lang/String;

.field private final zendeskArticleId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;Lco/bird/android/model/persistence/BirdPlusDisplayView;Ljava/lang/String;)V
    .locals 1

    const-string v0, "subscriptionPlanId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSubscriptionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codename"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/BirdPlusView;->status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    iput-object p2, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlanId:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscriptionId:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/model/persistence/BirdPlusView;->codename:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlan:Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    iput-object p6, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscription:Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    iput-object p7, p0, Lco/bird/android/model/persistence/BirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    iput-object p8, p0, Lco/bird/android/model/persistence/BirdPlusView;->display:Lco/bird/android/model/persistence/BirdPlusDisplayView;

    iput-object p9, p0, Lco/bird/android/model/persistence/BirdPlusView;->zendeskArticleId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;Lco/bird/android/model/persistence/BirdPlusDisplayView;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_5

    move-object v12, v2

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    move-object v3, p0

    move-object v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v3 .. v12}, Lco/bird/android/model/persistence/BirdPlusView;-><init>(Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;Lco/bird/android/model/persistence/BirdPlusDisplayView;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/BirdPlusView;Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;Lco/bird/android/model/persistence/BirdPlusDisplayView;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/persistence/BirdPlusView;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/persistence/BirdPlusView;->status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlanId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscriptionId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/persistence/BirdPlusView;->codename:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlan:Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscription:Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/persistence/BirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/persistence/BirdPlusView;->display:Lco/bird/android/model/persistence/BirdPlusDisplayView;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lco/bird/android/model/persistence/BirdPlusView;->zendeskArticleId:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p9

    :goto_8
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lco/bird/android/model/persistence/BirdPlusView;->copy(Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;Lco/bird/android/model/persistence/BirdPlusDisplayView;Ljava/lang/String;)Lco/bird/android/model/persistence/BirdPlusView;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlanId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscriptionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->codename:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlan:Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscription:Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    return-object v0
.end method

.method public final component8()Lco/bird/android/model/persistence/BirdPlusDisplayView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->display:Lco/bird/android/model/persistence/BirdPlusDisplayView;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->zendeskArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;Lco/bird/android/model/persistence/BirdPlusDisplayView;Ljava/lang/String;)Lco/bird/android/model/persistence/BirdPlusView;
    .locals 11

    const-string v0, "subscriptionPlanId"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSubscriptionId"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codename"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/BirdPlusView;

    move-object v1, v0

    move-object v2, p1

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lco/bird/android/model/persistence/BirdPlusView;-><init>(Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;Lco/bird/android/model/persistence/BirdPlusDisplayView;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/BirdPlusView;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/BirdPlusView;

    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusView;->status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    iget-object v3, p1, Lco/bird/android/model/persistence/BirdPlusView;->status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlanId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlanId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscriptionId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/BirdPlusView;->userSubscriptionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusView;->codename:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/BirdPlusView;->codename:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlan:Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    iget-object v3, p1, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlan:Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscription:Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    iget-object v3, p1, Lco/bird/android/model/persistence/BirdPlusView;->userSubscription:Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    iget-object v3, p1, Lco/bird/android/model/persistence/BirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusView;->display:Lco/bird/android/model/persistence/BirdPlusDisplayView;

    iget-object v3, p1, Lco/bird/android/model/persistence/BirdPlusView;->display:Lco/bird/android/model/persistence/BirdPlusDisplayView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusView;->zendeskArticleId:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/persistence/BirdPlusView;->zendeskArticleId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getCodename()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->codename:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplay()Lco/bird/android/model/persistence/BirdPlusDisplayView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->display:Lco/bird/android/model/persistence/BirdPlusDisplayView;

    return-object v0
.end method

.method public final getIneligibleReason()Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    return-object v0
.end method

.method public final getNeedsDeviceTransfer()Z
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/BirdPlusView;->isIneligible()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    sget-object v1, Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;->INELIGIBLE_DEVICE:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getStatus()Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    return-object v0
.end method

.method public final getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlan:Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    return-object v0
.end method

.method public final getSubscriptionPlanId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlanId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserSubscription()Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscription:Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    return-object v0
.end method

.method public final getUserSubscriptionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscriptionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getZendeskArticleId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->zendeskArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlanId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscriptionId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusView;->codename:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlan:Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscription:Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusView;->display:Lco/bird/android/model/persistence/BirdPlusDisplayView;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusDisplayView;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusView;->zendeskArticleId:Ljava/lang/String;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public final isActive()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    sget-object v1, Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;->ACTIVE:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isAvailable()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    sget-object v1, Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;->AVAILABLE:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isIneligible()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    sget-object v1, Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;->INELIGIBLE:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isPurchased()Z
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/BirdPlusView;->isActive()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/BirdPlusView;->isIneligible()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusView;->status:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlanId:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscriptionId:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/android/model/persistence/BirdPlusView;->codename:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/android/model/persistence/BirdPlusView;->subscriptionPlan:Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    iget-object v5, p0, Lco/bird/android/model/persistence/BirdPlusView;->userSubscription:Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    iget-object v6, p0, Lco/bird/android/model/persistence/BirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    iget-object v7, p0, Lco/bird/android/model/persistence/BirdPlusView;->display:Lco/bird/android/model/persistence/BirdPlusDisplayView;

    iget-object v8, p0, Lco/bird/android/model/persistence/BirdPlusView;->zendeskArticleId:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "BirdPlusView(status="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subscriptionPlanId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userSubscriptionId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", codename="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subscriptionPlan="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userSubscription="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ineligibleReason="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", display="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", zendeskArticleId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
