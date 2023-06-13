.class public final Lco/bird/api/response/WireBirdPlusSubscriptionPlan;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010\'\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u008c\u0001\u0010-\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0006H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0014R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0014\u00a8\u00064"
    }
    d2 = {
        "Lco/bird/api/response/WireBirdPlusSubscriptionPlan;",
        "",
        "id",
        "",
        "codename",
        "priceAmount",
        "",
        "priceAmountTax",
        "currency",
        "zendeskArticleId",
        "legalMessage",
        "display",
        "Lco/bird/api/response/WireBirdPlusDisplay;",
        "trial",
        "Lco/bird/api/response/WireSubscriptionPlanTrial;",
        "perks",
        "",
        "Lco/bird/api/response/WireBirdPlusPerk;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/response/WireBirdPlusDisplay;Lco/bird/api/response/WireSubscriptionPlanTrial;Ljava/util/List;)V",
        "getCodename",
        "()Ljava/lang/String;",
        "getCurrency",
        "getDisplay",
        "()Lco/bird/api/response/WireBirdPlusDisplay;",
        "getId",
        "getLegalMessage",
        "getPerks",
        "()Ljava/util/List;",
        "getPriceAmount",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getPriceAmountTax",
        "getTrial",
        "()Lco/bird/api/response/WireSubscriptionPlanTrial;",
        "getZendeskArticleId",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/response/WireBirdPlusDisplay;Lco/bird/api/response/WireSubscriptionPlanTrial;Ljava/util/List;)Lco/bird/api/response/WireBirdPlusSubscriptionPlan;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field private final codename:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "codename"
    .end annotation

    .annotation runtime Lft5;
        value = "codename"
    .end annotation
.end field

.field private final currency:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "currency"
    .end annotation

    .annotation runtime Lft5;
        value = "currency"
    .end annotation
.end field

.field private final display:Lco/bird/api/response/WireBirdPlusDisplay;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "display"
    .end annotation

    .annotation runtime Lft5;
        value = "display"
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

.field private final legalMessage:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "legal_message"
    .end annotation

    .annotation runtime Lft5;
        value = "legal_message"
    .end annotation
.end field

.field private final perks:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "perks"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/api/response/WireBirdPlusPerk;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "perks"
    .end annotation
.end field

.field private final priceAmount:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "price_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "price_amount"
    .end annotation
.end field

.field private final priceAmountTax:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "price_amount_tax"
    .end annotation

    .annotation runtime Lft5;
        value = "price_amount_tax"
    .end annotation
.end field

.field private final trial:Lco/bird/api/response/WireSubscriptionPlanTrial;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "trial"
    .end annotation

    .annotation runtime Lft5;
        value = "trial"
    .end annotation
.end field

.field private final zendeskArticleId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "zendesk_article_id"
    .end annotation

    .annotation runtime Lft5;
        value = "zendesk_article_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 13

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3ff

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/response/WireBirdPlusDisplay;Lco/bird/api/response/WireSubscriptionPlanTrial;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/response/WireBirdPlusDisplay;Lco/bird/api/response/WireSubscriptionPlanTrial;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/api/response/WireBirdPlusDisplay;",
            "Lco/bird/api/response/WireSubscriptionPlanTrial;",
            "Ljava/util/List<",
            "Lco/bird/api/response/WireBirdPlusPerk;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->id:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->codename:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmount:Ljava/lang/Integer;

    iput-object p4, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmountTax:Ljava/lang/Integer;

    iput-object p5, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->currency:Ljava/lang/String;

    iput-object p6, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->zendeskArticleId:Ljava/lang/String;

    iput-object p7, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->legalMessage:Ljava/lang/String;

    iput-object p8, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->display:Lco/bird/api/response/WireBirdPlusDisplay;

    iput-object p9, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->trial:Lco/bird/api/response/WireSubscriptionPlanTrial;

    iput-object p10, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->perks:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/response/WireBirdPlusDisplay;Lco/bird/api/response/WireSubscriptionPlanTrial;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move-object v7, v2

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move-object v8, v2

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move-object v9, v2

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move-object v10, v2

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    goto :goto_9

    :cond_9
    move-object/from16 v2, p10

    :goto_9
    move-object p1, p0

    move-object p2, v1

    move-object p3, v3

    move-object p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v2

    invoke-direct/range {p1 .. p11}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/response/WireBirdPlusDisplay;Lco/bird/api/response/WireSubscriptionPlanTrial;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/response/WireBirdPlusDisplay;Lco/bird/api/response/WireSubscriptionPlanTrial;Ljava/util/List;ILjava/lang/Object;)Lco/bird/api/response/WireBirdPlusSubscriptionPlan;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->codename:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmount:Ljava/lang/Integer;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmountTax:Ljava/lang/Integer;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->currency:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->zendeskArticleId:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->legalMessage:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->display:Lco/bird/api/response/WireBirdPlusDisplay;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->trial:Lco/bird/api/response/WireSubscriptionPlanTrial;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->perks:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v1, p10

    :goto_9
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/response/WireBirdPlusDisplay;Lco/bird/api/response/WireSubscriptionPlanTrial;Ljava/util/List;)Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/WireBirdPlusPerk;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->perks:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->codename:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmountTax:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->zendeskArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->legalMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lco/bird/api/response/WireBirdPlusDisplay;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->display:Lco/bird/api/response/WireBirdPlusDisplay;

    return-object v0
.end method

.method public final component9()Lco/bird/api/response/WireSubscriptionPlanTrial;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->trial:Lco/bird/api/response/WireSubscriptionPlanTrial;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/response/WireBirdPlusDisplay;Lco/bird/api/response/WireSubscriptionPlanTrial;Ljava/util/List;)Lco/bird/api/response/WireBirdPlusSubscriptionPlan;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/api/response/WireBirdPlusDisplay;",
            "Lco/bird/api/response/WireSubscriptionPlanTrial;",
            "Ljava/util/List<",
            "Lco/bird/api/response/WireBirdPlusPerk;",
            ">;)",
            "Lco/bird/api/response/WireBirdPlusSubscriptionPlan;"
        }
    .end annotation

    new-instance v11, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    move-object v0, v11

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/response/WireBirdPlusDisplay;Lco/bird/api/response/WireSubscriptionPlanTrial;Ljava/util/List;)V

    return-object v11
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;

    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->codename:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->codename:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmount:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmountTax:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmountTax:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->zendeskArticleId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->zendeskArticleId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->legalMessage:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->legalMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->display:Lco/bird/api/response/WireBirdPlusDisplay;

    iget-object v3, p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->display:Lco/bird/api/response/WireBirdPlusDisplay;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->trial:Lco/bird/api/response/WireSubscriptionPlanTrial;

    iget-object v3, p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->trial:Lco/bird/api/response/WireSubscriptionPlanTrial;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->perks:Ljava/util/List;

    iget-object p1, p1, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->perks:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getCodename()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->codename:Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplay()Lco/bird/api/response/WireBirdPlusDisplay;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->display:Lco/bird/api/response/WireBirdPlusDisplay;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLegalMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->legalMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getPerks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/WireBirdPlusPerk;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->perks:Ljava/util/List;

    return-object v0
.end method

.method public final getPriceAmount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPriceAmountTax()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmountTax:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTrial()Lco/bird/api/response/WireSubscriptionPlanTrial;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->trial:Lco/bird/api/response/WireSubscriptionPlanTrial;

    return-object v0
.end method

.method public final getZendeskArticleId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->zendeskArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->codename:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmount:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmountTax:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->currency:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->zendeskArticleId:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->legalMessage:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->display:Lco/bird/api/response/WireBirdPlusDisplay;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lco/bird/api/response/WireBirdPlusDisplay;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->trial:Lco/bird/api/response/WireSubscriptionPlanTrial;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lco/bird/api/response/WireSubscriptionPlanTrial;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->perks:Ljava/util/List;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->id:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->codename:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmount:Ljava/lang/Integer;

    iget-object v3, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->priceAmountTax:Ljava/lang/Integer;

    iget-object v4, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->currency:Ljava/lang/String;

    iget-object v5, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->zendeskArticleId:Ljava/lang/String;

    iget-object v6, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->legalMessage:Ljava/lang/String;

    iget-object v7, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->display:Lco/bird/api/response/WireBirdPlusDisplay;

    iget-object v8, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->trial:Lco/bird/api/response/WireSubscriptionPlanTrial;

    iget-object v9, p0, Lco/bird/api/response/WireBirdPlusSubscriptionPlan;->perks:Ljava/util/List;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "WireBirdPlusSubscriptionPlan(id="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", codename="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", priceAmount="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", priceAmountTax="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currency="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", zendeskArticleId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", legalMessage="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", display="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trial="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", perks="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
