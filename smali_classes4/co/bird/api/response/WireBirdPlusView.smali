.class public final Lco/bird/api/response/WireBirdPlusView;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J-\u0010\u0016\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/api/response/WireBirdPlusView;",
        "",
        "subscriptionPlan",
        "Lco/bird/api/response/WireBirdPlusSubscriptionPlan;",
        "userSubscription",
        "Lco/bird/api/response/WireBirdPlusUserSubscription;",
        "ineligibleReason",
        "Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;",
        "(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;Lco/bird/api/response/WireBirdPlusUserSubscription;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;)V",
        "getIneligibleReason",
        "()Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;",
        "status",
        "Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;",
        "getStatus",
        "()Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;",
        "getSubscriptionPlan",
        "()Lco/bird/api/response/WireBirdPlusSubscriptionPlan;",
        "getUserSubscription",
        "()Lco/bird/api/response/WireBirdPlusUserSubscription;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "co.bird.android.api"
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
.field private final ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ineligible_reason"
    .end annotation

    .annotation runtime Lft5;
        value = "ineligible_reason"
    .end annotation
.end field

.field private final subscriptionPlan:Lco/bird/api/response/WireBirdPlusSubscriptionPlan;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "subscription_plan"
    .end annotation

    .annotation runtime Lft5;
        value = "subscription_plan"
    .end annotation
.end field

.field private final userSubscription:Lco/bird/api/response/WireBirdPlusUserSubscription;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "user_subscription"
    .end annotation

    .annotation runtime Lft5;
        value = "user_subscription"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/api/response/WireBirdPlusView;-><init>(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;Lco/bird/api/response/WireBirdPlusUserSubscription;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;Lco/bird/api/response/WireBirdPlusUserSubscription;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/WireBirdPlusView;->subscriptionPlan:Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    iput-object p2, p0, Lco/bird/api/response/WireBirdPlusView;->userSubscription:Lco/bird/api/response/WireBirdPlusUserSubscription;

    iput-object p3, p0, Lco/bird/api/response/WireBirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;Lco/bird/api/response/WireBirdPlusUserSubscription;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/api/response/WireBirdPlusView;-><init>(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;Lco/bird/api/response/WireBirdPlusUserSubscription;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/WireBirdPlusView;Lco/bird/api/response/WireBirdPlusSubscriptionPlan;Lco/bird/api/response/WireBirdPlusUserSubscription;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;ILjava/lang/Object;)Lco/bird/api/response/WireBirdPlusView;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/api/response/WireBirdPlusView;->subscriptionPlan:Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/api/response/WireBirdPlusView;->userSubscription:Lco/bird/api/response/WireBirdPlusUserSubscription;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/api/response/WireBirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/response/WireBirdPlusView;->copy(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;Lco/bird/api/response/WireBirdPlusUserSubscription;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;)Lco/bird/api/response/WireBirdPlusView;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/api/response/WireBirdPlusSubscriptionPlan;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusView;->subscriptionPlan:Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    return-object v0
.end method

.method public final component2()Lco/bird/api/response/WireBirdPlusUserSubscription;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusView;->userSubscription:Lco/bird/api/response/WireBirdPlusUserSubscription;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    return-object v0
.end method

.method public final copy(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;Lco/bird/api/response/WireBirdPlusUserSubscription;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;)Lco/bird/api/response/WireBirdPlusView;
    .locals 1

    new-instance v0, Lco/bird/api/response/WireBirdPlusView;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/api/response/WireBirdPlusView;-><init>(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;Lco/bird/api/response/WireBirdPlusUserSubscription;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/WireBirdPlusView;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/WireBirdPlusView;

    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusView;->subscriptionPlan:Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    iget-object v3, p1, Lco/bird/api/response/WireBirdPlusView;->subscriptionPlan:Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusView;->userSubscription:Lco/bird/api/response/WireBirdPlusUserSubscription;

    iget-object v3, p1, Lco/bird/api/response/WireBirdPlusView;->userSubscription:Lco/bird/api/response/WireBirdPlusUserSubscription;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    iget-object p1, p1, Lco/bird/api/response/WireBirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getIneligibleReason()Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    return-object v0
.end method

.method public final getStatus()Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    if-eqz v0, :cond_0

    sget-object v0, Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;->INELIGIBLE:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusView;->userSubscription:Lco/bird/api/response/WireBirdPlusUserSubscription;

    if-eqz v0, :cond_1

    sget-object v0, Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;->ACTIVE:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusView;->subscriptionPlan:Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    if-eqz v0, :cond_2

    sget-object v0, Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;->AVAILABLE:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    goto :goto_0

    :cond_2
    sget-object v0, Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;->UNKNOWN:Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;

    :goto_0
    return-object v0
.end method

.method public final getSubscriptionPlan()Lco/bird/api/response/WireBirdPlusSubscriptionPlan;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusView;->subscriptionPlan:Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    return-object v0
.end method

.method public final getUserSubscription()Lco/bird/api/response/WireBirdPlusUserSubscription;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusView;->userSubscription:Lco/bird/api/response/WireBirdPlusUserSubscription;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusView;->subscriptionPlan:Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusView;->userSubscription:Lco/bird/api/response/WireBirdPlusUserSubscription;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lco/bird/api/response/WireBirdPlusUserSubscription;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusView;->subscriptionPlan:Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusView;->userSubscription:Lco/bird/api/response/WireBirdPlusUserSubscription;

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusView;->ineligibleReason:Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WireBirdPlusView(subscriptionPlan="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userSubscription="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ineligibleReason="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
