.class public final Lco/bird/android/model/wire/WireCouponDisplayView;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008!\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bk\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\t\u0010*\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jz\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0016R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\u0008 \u0010!R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0016\u00a8\u00066"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireCouponDisplayView;",
        "",
        "couponId",
        "",
        "title",
        "body",
        "icon",
        "Lco/bird/android/model/constant/CouponDisplayIcon;",
        "tag",
        "Lco/bird/android/model/constant/CouponDisplayTag;",
        "activatedStatus",
        "Lco/bird/android/model/constant/CouponDisplayActivatedStatus;",
        "expiresAt",
        "Lorg/joda/time/DateTime;",
        "timerThreshold",
        "",
        "flagText",
        "ridePassId",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/CouponDisplayIcon;Lco/bird/android/model/constant/CouponDisplayTag;Lco/bird/android/model/constant/CouponDisplayActivatedStatus;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V",
        "getActivatedStatus",
        "()Lco/bird/android/model/constant/CouponDisplayActivatedStatus;",
        "getBody",
        "()Ljava/lang/String;",
        "getCouponId",
        "getExpiresAt",
        "()Lorg/joda/time/DateTime;",
        "getFlagText",
        "getIcon",
        "()Lco/bird/android/model/constant/CouponDisplayIcon;",
        "getRidePassId",
        "getTag",
        "()Lco/bird/android/model/constant/CouponDisplayTag;",
        "getTimerThreshold",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getTitle",
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
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/CouponDisplayIcon;Lco/bird/android/model/constant/CouponDisplayTag;Lco/bird/android/model/constant/CouponDisplayActivatedStatus;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireCouponDisplayView;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "model-wire_release"
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
.field private final activatedStatus:Lco/bird/android/model/constant/CouponDisplayActivatedStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "activated_status"
    .end annotation

    .annotation runtime Lft5;
        value = "activated_status"
    .end annotation
.end field

.field private final body:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "body"
    .end annotation

    .annotation runtime Lft5;
        value = "body"
    .end annotation
.end field

.field private final couponId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "coupon_id"
    .end annotation

    .annotation runtime Lft5;
        value = "coupon_id"
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

.field private final flagText:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "flag_text"
    .end annotation

    .annotation runtime Lft5;
        value = "flag_text"
    .end annotation
.end field

.field private final icon:Lco/bird/android/model/constant/CouponDisplayIcon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "icon"
    .end annotation

    .annotation runtime Lft5;
        value = "icon"
    .end annotation
.end field

.field private final ridePassId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ride_pass_id"
    .end annotation

    .annotation runtime Lft5;
        value = "ride_pass_id"
    .end annotation
.end field

.field private final tag:Lco/bird/android/model/constant/CouponDisplayTag;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "tag"
    .end annotation

    .annotation runtime Lft5;
        value = "tag"
    .end annotation
.end field

.field private final timerThreshold:Ljava/lang/Double;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "timer_threshold"
    .end annotation

    .annotation runtime Lft5;
        value = "timer_threshold"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "title"
    .end annotation

    .annotation runtime Lft5;
        value = "title"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/CouponDisplayIcon;Lco/bird/android/model/constant/CouponDisplayTag;Lco/bird/android/model/constant/CouponDisplayActivatedStatus;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "couponId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activatedStatus"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->couponId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->title:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->body:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->icon:Lco/bird/android/model/constant/CouponDisplayIcon;

    iput-object p5, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->tag:Lco/bird/android/model/constant/CouponDisplayTag;

    iput-object p6, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->activatedStatus:Lco/bird/android/model/constant/CouponDisplayActivatedStatus;

    iput-object p7, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->expiresAt:Lorg/joda/time/DateTime;

    iput-object p8, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->timerThreshold:Ljava/lang/Double;

    iput-object p9, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->flagText:Ljava/lang/String;

    iput-object p10, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->ridePassId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/CouponDisplayIcon;Lco/bird/android/model/constant/CouponDisplayTag;Lco/bird/android/model/constant/CouponDisplayActivatedStatus;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    move-object v6, v2

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

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
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v12, v2

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_6

    move-object v13, v2

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    move-object v3, p0

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v3 .. v13}, Lco/bird/android/model/wire/WireCouponDisplayView;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/CouponDisplayIcon;Lco/bird/android/model/constant/CouponDisplayTag;Lco/bird/android/model/constant/CouponDisplayActivatedStatus;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireCouponDisplayView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/CouponDisplayIcon;Lco/bird/android/model/constant/CouponDisplayTag;Lco/bird/android/model/constant/CouponDisplayActivatedStatus;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WireCouponDisplayView;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/wire/WireCouponDisplayView;->couponId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/wire/WireCouponDisplayView;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/wire/WireCouponDisplayView;->body:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/wire/WireCouponDisplayView;->icon:Lco/bird/android/model/constant/CouponDisplayIcon;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/wire/WireCouponDisplayView;->tag:Lco/bird/android/model/constant/CouponDisplayTag;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/wire/WireCouponDisplayView;->activatedStatus:Lco/bird/android/model/constant/CouponDisplayActivatedStatus;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/wire/WireCouponDisplayView;->expiresAt:Lorg/joda/time/DateTime;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/wire/WireCouponDisplayView;->timerThreshold:Ljava/lang/Double;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/wire/WireCouponDisplayView;->flagText:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lco/bird/android/model/wire/WireCouponDisplayView;->ridePassId:Ljava/lang/String;

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

    invoke-virtual/range {p0 .. p10}, Lco/bird/android/model/wire/WireCouponDisplayView;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/CouponDisplayIcon;Lco/bird/android/model/constant/CouponDisplayTag;Lco/bird/android/model/constant/CouponDisplayActivatedStatus;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireCouponDisplayView;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->couponId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->ridePassId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/CouponDisplayIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->icon:Lco/bird/android/model/constant/CouponDisplayIcon;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/constant/CouponDisplayTag;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->tag:Lco/bird/android/model/constant/CouponDisplayTag;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/constant/CouponDisplayActivatedStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->activatedStatus:Lco/bird/android/model/constant/CouponDisplayActivatedStatus;

    return-object v0
.end method

.method public final component7()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->expiresAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component8()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->timerThreshold:Ljava/lang/Double;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->flagText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/CouponDisplayIcon;Lco/bird/android/model/constant/CouponDisplayTag;Lco/bird/android/model/constant/CouponDisplayActivatedStatus;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/WireCouponDisplayView;
    .locals 12

    const-string v0, "couponId"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activatedStatus"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireCouponDisplayView;

    move-object v1, v0

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lco/bird/android/model/wire/WireCouponDisplayView;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/CouponDisplayIcon;Lco/bird/android/model/constant/CouponDisplayTag;Lco/bird/android/model/constant/CouponDisplayActivatedStatus;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireCouponDisplayView;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireCouponDisplayView;

    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->couponId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireCouponDisplayView;->couponId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireCouponDisplayView;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->body:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireCouponDisplayView;->body:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->icon:Lco/bird/android/model/constant/CouponDisplayIcon;

    iget-object v3, p1, Lco/bird/android/model/wire/WireCouponDisplayView;->icon:Lco/bird/android/model/constant/CouponDisplayIcon;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->tag:Lco/bird/android/model/constant/CouponDisplayTag;

    iget-object v3, p1, Lco/bird/android/model/wire/WireCouponDisplayView;->tag:Lco/bird/android/model/constant/CouponDisplayTag;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->activatedStatus:Lco/bird/android/model/constant/CouponDisplayActivatedStatus;

    iget-object v3, p1, Lco/bird/android/model/wire/WireCouponDisplayView;->activatedStatus:Lco/bird/android/model/constant/CouponDisplayActivatedStatus;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->expiresAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireCouponDisplayView;->expiresAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->timerThreshold:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/wire/WireCouponDisplayView;->timerThreshold:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->flagText:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireCouponDisplayView;->flagText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->ridePassId:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/wire/WireCouponDisplayView;->ridePassId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getActivatedStatus()Lco/bird/android/model/constant/CouponDisplayActivatedStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->activatedStatus:Lco/bird/android/model/constant/CouponDisplayActivatedStatus;

    return-object v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final getCouponId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->couponId:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpiresAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->expiresAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getFlagText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->flagText:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()Lco/bird/android/model/constant/CouponDisplayIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->icon:Lco/bird/android/model/constant/CouponDisplayIcon;

    return-object v0
.end method

.method public final getRidePassId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->ridePassId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Lco/bird/android/model/constant/CouponDisplayTag;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->tag:Lco/bird/android/model/constant/CouponDisplayTag;

    return-object v0
.end method

.method public final getTimerThreshold()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->timerThreshold:Ljava/lang/Double;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->couponId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->body:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->icon:Lco/bird/android/model/constant/CouponDisplayIcon;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->tag:Lco/bird/android/model/constant/CouponDisplayTag;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->activatedStatus:Lco/bird/android/model/constant/CouponDisplayActivatedStatus;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->expiresAt:Lorg/joda/time/DateTime;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->timerThreshold:Ljava/lang/Double;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->flagText:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->ridePassId:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->couponId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->title:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->body:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->icon:Lco/bird/android/model/constant/CouponDisplayIcon;

    iget-object v4, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->tag:Lco/bird/android/model/constant/CouponDisplayTag;

    iget-object v5, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->activatedStatus:Lco/bird/android/model/constant/CouponDisplayActivatedStatus;

    iget-object v6, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->expiresAt:Lorg/joda/time/DateTime;

    iget-object v7, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->timerThreshold:Ljava/lang/Double;

    iget-object v8, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->flagText:Ljava/lang/String;

    iget-object v9, p0, Lco/bird/android/model/wire/WireCouponDisplayView;->ridePassId:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "WireCouponDisplayView(couponId="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", body="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tag="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", activatedStatus="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", expiresAt="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timerThreshold="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", flagText="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ridePassId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
