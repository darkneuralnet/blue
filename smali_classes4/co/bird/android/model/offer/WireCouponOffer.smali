.class public final Lco/bird/android/model/offer/WireCouponOffer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/offer/WireCouponOffer$Action;,
        Lco/bird/android/model/offer/WireCouponOffer$Reward;,
        Lco/bird/android/model/offer/WireCouponOffer$Ui;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0003-./BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003J\t\u0010$\u001a\u00020\rH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J_\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010(\u001a\u00020\u00052\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u000c\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u00060"
    }
    d2 = {
        "Lco/bird/android/model/offer/WireCouponOffer;",
        "",
        "id",
        "",
        "explicitAccept",
        "",
        "expiresAt",
        "Lorg/joda/time/DateTime;",
        "action",
        "Lco/bird/android/model/offer/WireCouponOffer$Action;",
        "reward",
        "Lco/bird/android/model/offer/WireCouponOffer$Reward;",
        "ui",
        "Lco/bird/android/model/offer/WireCouponOffer$Ui;",
        "campaignId",
        "completedAt",
        "(Ljava/lang/String;ZLorg/joda/time/DateTime;Lco/bird/android/model/offer/WireCouponOffer$Action;Lco/bird/android/model/offer/WireCouponOffer$Reward;Lco/bird/android/model/offer/WireCouponOffer$Ui;Ljava/lang/String;Lorg/joda/time/DateTime;)V",
        "getAction",
        "()Lco/bird/android/model/offer/WireCouponOffer$Action;",
        "getCampaignId",
        "()Ljava/lang/String;",
        "getCompletedAt",
        "()Lorg/joda/time/DateTime;",
        "getExpiresAt",
        "getExplicitAccept",
        "()Z",
        "getId",
        "getReward",
        "()Lco/bird/android/model/offer/WireCouponOffer$Reward;",
        "getUi",
        "()Lco/bird/android/model/offer/WireCouponOffer$Ui;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "Action",
        "Reward",
        "Ui",
        "model_release"
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
.field private final action:Lco/bird/android/model/offer/WireCouponOffer$Action;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "action"
    .end annotation

    .annotation runtime Lft5;
        value = "action"
    .end annotation
.end field

.field private final campaignId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "campaign_id"
    .end annotation

    .annotation runtime Lft5;
        value = "campaign_id"
    .end annotation
.end field

.field private final completedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "completed_at"
    .end annotation

    .annotation runtime Lft5;
        value = "completed_at"
    .end annotation
.end field

.field private final expiresAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "expires_at"
    .end annotation

    .annotation runtime Lft5;
        value = "expires_at"
    .end annotation
.end field

.field private final explicitAccept:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "needs_explicit_accept"
    .end annotation

    .annotation runtime Lft5;
        value = "needs_explicit_accept"
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

.field private final reward:Lco/bird/android/model/offer/WireCouponOffer$Reward;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "reward"
    .end annotation

    .annotation runtime Lft5;
        value = "reward"
    .end annotation
.end field

.field private final ui:Lco/bird/android/model/offer/WireCouponOffer$Ui;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonAlias;
        value = {
            "presentation"
        }
    .end annotation

    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ui"
    .end annotation

    .annotation runtime Lft5;
        alternate = {
            "presentation"
        }
        value = "ui"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLorg/joda/time/DateTime;Lco/bird/android/model/offer/WireCouponOffer$Action;Lco/bird/android/model/offer/WireCouponOffer$Reward;Lco/bird/android/model/offer/WireCouponOffer$Ui;Ljava/lang/String;Lorg/joda/time/DateTime;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reward"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/offer/WireCouponOffer;->id:Ljava/lang/String;

    iput-boolean p2, p0, Lco/bird/android/model/offer/WireCouponOffer;->explicitAccept:Z

    iput-object p3, p0, Lco/bird/android/model/offer/WireCouponOffer;->expiresAt:Lorg/joda/time/DateTime;

    iput-object p4, p0, Lco/bird/android/model/offer/WireCouponOffer;->action:Lco/bird/android/model/offer/WireCouponOffer$Action;

    iput-object p5, p0, Lco/bird/android/model/offer/WireCouponOffer;->reward:Lco/bird/android/model/offer/WireCouponOffer$Reward;

    iput-object p6, p0, Lco/bird/android/model/offer/WireCouponOffer;->ui:Lco/bird/android/model/offer/WireCouponOffer$Ui;

    iput-object p7, p0, Lco/bird/android/model/offer/WireCouponOffer;->campaignId:Ljava/lang/String;

    iput-object p8, p0, Lco/bird/android/model/offer/WireCouponOffer;->completedAt:Lorg/joda/time/DateTime;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLorg/joda/time/DateTime;Lco/bird/android/model/offer/WireCouponOffer$Action;Lco/bird/android/model/offer/WireCouponOffer$Reward;Lco/bird/android/model/offer/WireCouponOffer$Ui;Ljava/lang/String;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move v4, v1

    goto :goto_0

    :cond_0
    move v4, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object v5, p3

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p8

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v2 .. v10}, Lco/bird/android/model/offer/WireCouponOffer;-><init>(Ljava/lang/String;ZLorg/joda/time/DateTime;Lco/bird/android/model/offer/WireCouponOffer$Action;Lco/bird/android/model/offer/WireCouponOffer$Reward;Lco/bird/android/model/offer/WireCouponOffer$Ui;Ljava/lang/String;Lorg/joda/time/DateTime;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/offer/WireCouponOffer;Ljava/lang/String;ZLorg/joda/time/DateTime;Lco/bird/android/model/offer/WireCouponOffer$Action;Lco/bird/android/model/offer/WireCouponOffer$Reward;Lco/bird/android/model/offer/WireCouponOffer$Ui;Ljava/lang/String;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lco/bird/android/model/offer/WireCouponOffer;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/offer/WireCouponOffer;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lco/bird/android/model/offer/WireCouponOffer;->explicitAccept:Z

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/offer/WireCouponOffer;->expiresAt:Lorg/joda/time/DateTime;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/offer/WireCouponOffer;->action:Lco/bird/android/model/offer/WireCouponOffer$Action;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/offer/WireCouponOffer;->reward:Lco/bird/android/model/offer/WireCouponOffer$Reward;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/offer/WireCouponOffer;->ui:Lco/bird/android/model/offer/WireCouponOffer$Ui;

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/offer/WireCouponOffer;->campaignId:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lco/bird/android/model/offer/WireCouponOffer;->completedAt:Lorg/joda/time/DateTime;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p8

    :goto_7
    move-object p1, v2

    move p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lco/bird/android/model/offer/WireCouponOffer;->copy(Ljava/lang/String;ZLorg/joda/time/DateTime;Lco/bird/android/model/offer/WireCouponOffer$Action;Lco/bird/android/model/offer/WireCouponOffer$Reward;Lco/bird/android/model/offer/WireCouponOffer$Ui;Ljava/lang/String;Lorg/joda/time/DateTime;)Lco/bird/android/model/offer/WireCouponOffer;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->explicitAccept:Z

    return v0
.end method

.method public final component3()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->expiresAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/offer/WireCouponOffer$Action;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->action:Lco/bird/android/model/offer/WireCouponOffer$Action;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/offer/WireCouponOffer$Reward;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->reward:Lco/bird/android/model/offer/WireCouponOffer$Reward;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/offer/WireCouponOffer$Ui;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->ui:Lco/bird/android/model/offer/WireCouponOffer$Ui;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->campaignId:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->completedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZLorg/joda/time/DateTime;Lco/bird/android/model/offer/WireCouponOffer$Action;Lco/bird/android/model/offer/WireCouponOffer$Reward;Lco/bird/android/model/offer/WireCouponOffer$Ui;Ljava/lang/String;Lorg/joda/time/DateTime;)Lco/bird/android/model/offer/WireCouponOffer;
    .locals 10

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reward"

    move-object v6, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/offer/WireCouponOffer;

    move-object v1, v0

    move v3, p2

    move-object v4, p3

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/offer/WireCouponOffer;-><init>(Ljava/lang/String;ZLorg/joda/time/DateTime;Lco/bird/android/model/offer/WireCouponOffer$Action;Lco/bird/android/model/offer/WireCouponOffer$Reward;Lco/bird/android/model/offer/WireCouponOffer$Ui;Ljava/lang/String;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/offer/WireCouponOffer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/offer/WireCouponOffer;

    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/offer/WireCouponOffer;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->explicitAccept:Z

    iget-boolean v3, p1, Lco/bird/android/model/offer/WireCouponOffer;->explicitAccept:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->expiresAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/offer/WireCouponOffer;->expiresAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->action:Lco/bird/android/model/offer/WireCouponOffer$Action;

    iget-object v3, p1, Lco/bird/android/model/offer/WireCouponOffer;->action:Lco/bird/android/model/offer/WireCouponOffer$Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->reward:Lco/bird/android/model/offer/WireCouponOffer$Reward;

    iget-object v3, p1, Lco/bird/android/model/offer/WireCouponOffer;->reward:Lco/bird/android/model/offer/WireCouponOffer$Reward;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->ui:Lco/bird/android/model/offer/WireCouponOffer$Ui;

    iget-object v3, p1, Lco/bird/android/model/offer/WireCouponOffer;->ui:Lco/bird/android/model/offer/WireCouponOffer$Ui;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->campaignId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/offer/WireCouponOffer;->campaignId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->completedAt:Lorg/joda/time/DateTime;

    iget-object p1, p1, Lco/bird/android/model/offer/WireCouponOffer;->completedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAction()Lco/bird/android/model/offer/WireCouponOffer$Action;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->action:Lco/bird/android/model/offer/WireCouponOffer$Action;

    return-object v0
.end method

.method public final getCampaignId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->campaignId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCompletedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->completedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getExpiresAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->expiresAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getExplicitAccept()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->explicitAccept:Z

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getReward()Lco/bird/android/model/offer/WireCouponOffer$Reward;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->reward:Lco/bird/android/model/offer/WireCouponOffer$Reward;

    return-object v0
.end method

.method public final getUi()Lco/bird/android/model/offer/WireCouponOffer$Ui;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->ui:Lco/bird/android/model/offer/WireCouponOffer$Ui;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->explicitAccept:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->expiresAt:Lorg/joda/time/DateTime;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->action:Lco/bird/android/model/offer/WireCouponOffer$Action;

    invoke-virtual {v1}, Lco/bird/android/model/offer/WireCouponOffer$Action;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->reward:Lco/bird/android/model/offer/WireCouponOffer$Reward;

    invoke-virtual {v1}, Lco/bird/android/model/offer/WireCouponOffer$Reward;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->ui:Lco/bird/android/model/offer/WireCouponOffer$Ui;

    invoke-virtual {v1}, Lco/bird/android/model/offer/WireCouponOffer$Ui;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->campaignId:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->completedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lco/bird/android/model/offer/WireCouponOffer;->id:Ljava/lang/String;

    iget-boolean v1, p0, Lco/bird/android/model/offer/WireCouponOffer;->explicitAccept:Z

    iget-object v2, p0, Lco/bird/android/model/offer/WireCouponOffer;->expiresAt:Lorg/joda/time/DateTime;

    iget-object v3, p0, Lco/bird/android/model/offer/WireCouponOffer;->action:Lco/bird/android/model/offer/WireCouponOffer$Action;

    iget-object v4, p0, Lco/bird/android/model/offer/WireCouponOffer;->reward:Lco/bird/android/model/offer/WireCouponOffer$Reward;

    iget-object v5, p0, Lco/bird/android/model/offer/WireCouponOffer;->ui:Lco/bird/android/model/offer/WireCouponOffer$Ui;

    iget-object v6, p0, Lco/bird/android/model/offer/WireCouponOffer;->campaignId:Ljava/lang/String;

    iget-object v7, p0, Lco/bird/android/model/offer/WireCouponOffer;->completedAt:Lorg/joda/time/DateTime;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "WireCouponOffer(id="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", explicitAccept="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", expiresAt="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", action="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reward="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ui="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", campaignId="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", completedAt="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
