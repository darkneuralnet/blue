.class public final Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J9\u0010\u0017\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;",
        "",
        "id",
        "",
        "recurringCanceledAt",
        "Lorg/joda/time/DateTime;",
        "activity",
        "Lco/bird/android/model/persistence/BirdPlusActivityView;",
        "trial",
        "Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;",
        "(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/BirdPlusActivityView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;)V",
        "getActivity",
        "()Lco/bird/android/model/persistence/BirdPlusActivityView;",
        "getId",
        "()Ljava/lang/String;",
        "getRecurringCanceledAt",
        "()Lorg/joda/time/DateTime;",
        "getTrial",
        "()Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
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
.field private final activity:Lco/bird/android/model/persistence/BirdPlusActivityView;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "activity"
    .end annotation

    .annotation runtime Lft5;
        value = "activity"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "id"
    .end annotation

    .annotation runtime Lft5;
        value = "id"
    .end annotation
.end field

.field private final recurringCanceledAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "recurring_canceled_at"
    .end annotation

    .annotation runtime Lft5;
        value = "recurring_canceled_at"
    .end annotation
.end field

.field private final trial:Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "trial"
    .end annotation

    .annotation runtime Lft5;
        value = "trial"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/BirdPlusActivityView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/BirdPlusActivityView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->recurringCanceledAt:Lorg/joda/time/DateTime;

    iput-object p3, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->activity:Lco/bird/android/model/persistence/BirdPlusActivityView;

    iput-object p4, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->trial:Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/BirdPlusActivityView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/BirdPlusActivityView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/BirdPlusActivityView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;ILjava/lang/Object;)Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->recurringCanceledAt:Lorg/joda/time/DateTime;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->activity:Lco/bird/android/model/persistence/BirdPlusActivityView;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->trial:Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->copy(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/BirdPlusActivityView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;)Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->recurringCanceledAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/persistence/BirdPlusActivityView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->activity:Lco/bird/android/model/persistence/BirdPlusActivityView;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->trial:Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/BirdPlusActivityView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;)Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;
    .locals 1

    new-instance v0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/BirdPlusActivityView;Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;

    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->recurringCanceledAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->recurringCanceledAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->activity:Lco/bird/android/model/persistence/BirdPlusActivityView;

    iget-object v3, p1, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->activity:Lco/bird/android/model/persistence/BirdPlusActivityView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->trial:Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    iget-object p1, p1, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->trial:Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getActivity()Lco/bird/android/model/persistence/BirdPlusActivityView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->activity:Lco/bird/android/model/persistence/BirdPlusActivityView;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecurringCanceledAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->recurringCanceledAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getTrial()Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->trial:Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->recurringCanceledAt:Lorg/joda/time/DateTime;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->activity:Lco/bird/android/model/persistence/BirdPlusActivityView;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusActivityView;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->trial:Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->id:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->recurringCanceledAt:Lorg/joda/time/DateTime;

    iget-object v2, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->activity:Lco/bird/android/model/persistence/BirdPlusActivityView;

    iget-object v3, p0, Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;->trial:Lco/bird/android/model/persistence/BirdPlusSubcriptionPlanTrialView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "BirdPlusUserSubscriptionView(id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", recurringCanceledAt="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", activity="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trial="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
