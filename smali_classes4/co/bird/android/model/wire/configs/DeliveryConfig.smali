.class public final Lco/bird/android/model/wire/configs/DeliveryConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008*\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0011H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\u0016H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\nH\u00c6\u0003J\t\u00109\u001a\u00020\u000cH\u00c6\u0003J\t\u0010:\u001a\u00020\u000cH\u00c6\u0003J\t\u0010;\u001a\u00020\u000cH\u00c6\u0003J\t\u0010<\u001a\u00020\u000cH\u00c6\u0003J\u0097\u0001\u0010=\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0016H\u00c6\u0001J\t\u0010>\u001a\u00020\u000cH\u00d6\u0001J\u0013\u0010?\u001a\u00020\u00052\u0008\u0010@\u001a\u0004\u0018\u00010AH\u00d6\u0003J\t\u0010B\u001a\u00020\u000cH\u00d6\u0001J\t\u0010C\u001a\u00020\nH\u00d6\u0001J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u000cH\u00d6\u0001R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0016\u0010\u000e\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010%R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0016\u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010%R\u0016\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010%R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\u001bR\u0016\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010\u001b\u00a8\u0006I"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/DeliveryConfig;",
        "Landroid/os/Parcelable;",
        "launchDate",
        "Lorg/joda/time/LocalDate;",
        "enabled",
        "",
        "weekdayPrice",
        "",
        "weekendPrice",
        "currency",
        "",
        "releaseWindowStartHour",
        "",
        "releaseWindowEndHour",
        "lockedRideEndHour",
        "forceRideEndHour",
        "releaseRadius",
        "",
        "deliveryMapV2",
        "enableDeliveryMenuItem",
        "cancellationFee",
        "activeRequestKind",
        "Lco/bird/android/model/wire/configs/DeliveryRequestKind;",
        "(Lorg/joda/time/LocalDate;ZJJLjava/lang/String;IIIIDZZJLco/bird/android/model/wire/configs/DeliveryRequestKind;)V",
        "getActiveRequestKind",
        "()Lco/bird/android/model/wire/configs/DeliveryRequestKind;",
        "getCancellationFee",
        "()J",
        "getCurrency",
        "()Ljava/lang/String;",
        "getDeliveryMapV2",
        "()Z",
        "getEnableDeliveryMenuItem",
        "getEnabled$annotations",
        "()V",
        "getEnabled",
        "getForceRideEndHour",
        "()I",
        "getLaunchDate",
        "()Lorg/joda/time/LocalDate;",
        "getLockedRideEndHour",
        "getReleaseRadius",
        "()D",
        "getReleaseWindowEndHour",
        "getReleaseWindowStartHour",
        "getWeekdayPrice",
        "getWeekendPrice",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/wire/configs/DeliveryConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final activeRequestKind:Lco/bird/android/model/wire/configs/DeliveryRequestKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "active_request_kind"
    .end annotation

    .annotation runtime Lft5;
        value = "active_request_kind"
    .end annotation
.end field

.field private final cancellationFee:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "cancellation_fee"
    .end annotation

    .annotation runtime Lft5;
        value = "cancellation_fee"
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

.field private final deliveryMapV2:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "use_new_merged_delivery_screen"
    .end annotation

    .annotation runtime Lft5;
        value = "use_new_merged_delivery_screen"
    .end annotation
.end field

.field private final enableDeliveryMenuItem:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_delivery_menu_item"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_delivery_menu_item"
    .end annotation
.end field

.field private final enabled:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enabled"
    .end annotation

    .annotation runtime Lft5;
        value = "enabled"
    .end annotation
.end field

.field private final forceRideEndHour:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "force_ride_end_hour"
    .end annotation

    .annotation runtime Lft5;
        value = "force_ride_end_hour"
    .end annotation
.end field

.field private final launchDate:Lorg/joda/time/LocalDate;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "delivery_launch_date"
    .end annotation

    .annotation runtime Lft5;
        value = "delivery_launch_date"
    .end annotation
.end field

.field private final lockedRideEndHour:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "locked_ride_end_hour"
    .end annotation

    .annotation runtime Lft5;
        value = "locked_ride_end_hour"
    .end annotation
.end field

.field private final releaseRadius:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "release_radius"
    .end annotation

    .annotation runtime Lft5;
        value = "release_radius"
    .end annotation
.end field

.field private final releaseWindowEndHour:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "release_window_end_hour"
    .end annotation

    .annotation runtime Lft5;
        value = "release_window_end_hour"
    .end annotation
.end field

.field private final releaseWindowStartHour:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "release_window_start_hour"
    .end annotation

    .annotation runtime Lft5;
        value = "release_window_start_hour"
    .end annotation
.end field

.field private final weekdayPrice:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "weekday_price"
    .end annotation

    .annotation runtime Lft5;
        value = "weekday_price"
    .end annotation
.end field

.field private final weekendPrice:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "weekend_price"
    .end annotation

    .annotation runtime Lft5;
        value = "weekend_price"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/configs/DeliveryConfig$Creator;

    invoke-direct {v0}, Lco/bird/android/model/wire/configs/DeliveryConfig$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 21

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x3fff

    const/16 v20, 0x0

    invoke-direct/range {v0 .. v20}, Lco/bird/android/model/wire/configs/DeliveryConfig;-><init>(Lorg/joda/time/LocalDate;ZJJLjava/lang/String;IIIIDZZJLco/bird/android/model/wire/configs/DeliveryRequestKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/LocalDate;ZJJLjava/lang/String;IIIIDZZJLco/bird/android/model/wire/configs/DeliveryRequestKind;)V
    .locals 5

    move-object v0, p0

    move-object v1, p7

    move-object/from16 v2, p18

    const-string v3, "currency"

    invoke-static {p7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "activeRequestKind"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v3, p1

    iput-object v3, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->launchDate:Lorg/joda/time/LocalDate;

    move v3, p2

    iput-boolean v3, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enabled:Z

    move-wide v3, p3

    iput-wide v3, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekdayPrice:J

    move-wide v3, p5

    iput-wide v3, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekendPrice:J

    iput-object v1, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->currency:Ljava/lang/String;

    move v1, p8

    iput v1, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowStartHour:I

    move v1, p9

    iput v1, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowEndHour:I

    move v1, p10

    iput v1, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->lockedRideEndHour:I

    move/from16 v1, p11

    iput v1, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->forceRideEndHour:I

    move-wide/from16 v3, p12

    iput-wide v3, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseRadius:D

    move/from16 v1, p14

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->deliveryMapV2:Z

    move/from16 v1, p15

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enableDeliveryMenuItem:Z

    move-wide/from16 v3, p16

    iput-wide v3, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->cancellationFee:J

    iput-object v2, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->activeRequestKind:Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/joda/time/LocalDate;ZJJLjava/lang/String;IIIIDZZJLco/bird/android/model/wire/configs/DeliveryRequestKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const-wide/16 v4, 0x5dc

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    const-wide/16 v6, 0x7d0

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p5

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    const-string v8, "usd"

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    const/4 v9, 0x4

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    const/4 v10, 0x7

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    const/16 v11, 0x15

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    const/16 v12, 0x16

    goto :goto_8

    :cond_8
    move/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    const-wide/high16 v13, 0x4034000000000000L    # 20.0

    goto :goto_9

    :cond_9
    move-wide/from16 v13, p12

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    goto :goto_a

    :cond_a
    move/from16 v15, p14

    :goto_a
    and-int/lit16 v3, v0, 0x800

    if-eqz v3, :cond_b

    const/4 v3, 0x0

    goto :goto_b

    :cond_b
    move/from16 v3, p15

    :goto_b
    move/from16 p20, v3

    and-int/lit16 v3, v0, 0x1000

    if-eqz v3, :cond_c

    const-wide/16 v16, 0x0

    goto :goto_c

    :cond_c
    move-wide/from16 v16, p16

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    sget-object v0, Lco/bird/android/model/wire/configs/DeliveryRequestKind;->BASIC:Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    goto :goto_d

    :cond_d
    move-object/from16 v0, p18

    :goto_d
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move/from16 p3, v2

    move-wide/from16 p4, v4

    move-wide/from16 p6, v6

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move-wide/from16 p13, v13

    move/from16 p15, v15

    move/from16 p16, p20

    move-wide/from16 p17, v16

    move-object/from16 p19, v0

    invoke-direct/range {p1 .. p19}, Lco/bird/android/model/wire/configs/DeliveryConfig;-><init>(Lorg/joda/time/LocalDate;ZJJLjava/lang/String;IIIIDZZJLco/bird/android/model/wire/configs/DeliveryRequestKind;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/DeliveryConfig;Lorg/joda/time/LocalDate;ZJJLjava/lang/String;IIIIDZZJLco/bird/android/model/wire/configs/DeliveryRequestKind;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/DeliveryConfig;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->launchDate:Lorg/joda/time/LocalDate;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enabled:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekdayPrice:J

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekendPrice:J

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p5

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-object v8, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->currency:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget v9, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowStartHour:I

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget v10, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowEndHour:I

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget v11, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->lockedRideEndHour:I

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget v12, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->forceRideEndHour:I

    goto :goto_8

    :cond_8
    move/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-wide v13, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseRadius:D

    goto :goto_9

    :cond_9
    move-wide/from16 v13, p12

    :goto_9
    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->deliveryMapV2:Z

    goto :goto_a

    :cond_a
    move/from16 v15, p14

    :goto_a
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enableDeliveryMenuItem:Z

    goto :goto_b

    :cond_b
    move/from16 v15, p15

    :goto_b
    move/from16 p15, v15

    and-int/lit16 v15, v1, 0x1000

    move-wide/from16 p12, v13

    if-eqz v15, :cond_c

    iget-wide v13, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->cancellationFee:J

    goto :goto_c

    :cond_c
    move-wide/from16 v13, p16

    :goto_c
    and-int/lit16 v1, v1, 0x2000

    if-eqz v1, :cond_d

    iget-object v1, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->activeRequestKind:Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    goto :goto_d

    :cond_d
    move-object/from16 v1, p18

    :goto_d
    move-object/from16 p1, v2

    move/from16 p2, v3

    move-wide/from16 p3, v4

    move-wide/from16 p5, v6

    move-object/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move-wide/from16 p16, v13

    move-object/from16 p18, v1

    invoke-virtual/range {p0 .. p18}, Lco/bird/android/model/wire/configs/DeliveryConfig;->copy(Lorg/joda/time/LocalDate;ZJJLjava/lang/String;IIIIDZZJLco/bird/android/model/wire/configs/DeliveryRequestKind;)Lco/bird/android/model/wire/configs/DeliveryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getEnabled$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Deprecated. Use presence of launchDate instead."
    .end annotation

    return-void
.end method


# virtual methods
.method public final component1()Lorg/joda/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->launchDate:Lorg/joda/time/LocalDate;

    return-object v0
.end method

.method public final component10()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseRadius:D

    return-wide v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->deliveryMapV2:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enableDeliveryMenuItem:Z

    return v0
.end method

.method public final component13()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->cancellationFee:J

    return-wide v0
.end method

.method public final component14()Lco/bird/android/model/wire/configs/DeliveryRequestKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->activeRequestKind:Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enabled:Z

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekdayPrice:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekendPrice:J

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowStartHour:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowEndHour:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->lockedRideEndHour:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->forceRideEndHour:I

    return v0
.end method

.method public final copy(Lorg/joda/time/LocalDate;ZJJLjava/lang/String;IIIIDZZJLco/bird/android/model/wire/configs/DeliveryRequestKind;)Lco/bird/android/model/wire/configs/DeliveryConfig;
    .locals 20

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move-wide/from16 v12, p12

    move/from16 v14, p14

    move/from16 v15, p15

    move-wide/from16 v16, p16

    move-object/from16 v18, p18

    const-string v0, "currency"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeRequestKind"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v19, Lco/bird/android/model/wire/configs/DeliveryConfig;

    move-object/from16 v0, v19

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v18}, Lco/bird/android/model/wire/configs/DeliveryConfig;-><init>(Lorg/joda/time/LocalDate;ZJJLjava/lang/String;IIIIDZZJLco/bird/android/model/wire/configs/DeliveryRequestKind;)V

    return-object v19
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/DeliveryConfig;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->launchDate:Lorg/joda/time/LocalDate;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->launchDate:Lorg/joda/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enabled:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->enabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekdayPrice:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekdayPrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekendPrice:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekendPrice:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowStartHour:I

    iget v3, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowStartHour:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowEndHour:I

    iget v3, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowEndHour:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->lockedRideEndHour:I

    iget v3, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->lockedRideEndHour:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->forceRideEndHour:I

    iget v3, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->forceRideEndHour:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseRadius:D

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseRadius:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->deliveryMapV2:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->deliveryMapV2:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enableDeliveryMenuItem:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->enableDeliveryMenuItem:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->cancellationFee:J

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->cancellationFee:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->activeRequestKind:Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    iget-object p1, p1, Lco/bird/android/model/wire/configs/DeliveryConfig;->activeRequestKind:Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    if-eq v1, p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getActiveRequestKind()Lco/bird/android/model/wire/configs/DeliveryRequestKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->activeRequestKind:Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    return-object v0
.end method

.method public final getCancellationFee()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->cancellationFee:J

    return-wide v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeliveryMapV2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->deliveryMapV2:Z

    return v0
.end method

.method public final getEnableDeliveryMenuItem()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enableDeliveryMenuItem:Z

    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enabled:Z

    return v0
.end method

.method public final getForceRideEndHour()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->forceRideEndHour:I

    return v0
.end method

.method public final getLaunchDate()Lorg/joda/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->launchDate:Lorg/joda/time/LocalDate;

    return-object v0
.end method

.method public final getLockedRideEndHour()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->lockedRideEndHour:I

    return v0
.end method

.method public final getReleaseRadius()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseRadius:D

    return-wide v0
.end method

.method public final getReleaseWindowEndHour()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowEndHour:I

    return v0
.end method

.method public final getReleaseWindowStartHour()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowStartHour:I

    return v0
.end method

.method public final getWeekdayPrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekdayPrice:J

    return-wide v0
.end method

.method public final getWeekendPrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekendPrice:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->launchDate:Lorg/joda/time/LocalDate;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lorg/joda/time/LocalDate;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enabled:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekdayPrice:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekendPrice:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->currency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowStartHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowEndHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->lockedRideEndHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->forceRideEndHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseRadius:D

    invoke-static {v3, v4}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->deliveryMapV2:Z

    if-eqz v1, :cond_2

    move v1, v2

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enableDeliveryMenuItem:Z

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->cancellationFee:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->activeRequestKind:Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->launchDate:Lorg/joda/time/LocalDate;

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enabled:Z

    iget-wide v3, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekdayPrice:J

    iget-wide v5, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekendPrice:J

    iget-object v7, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->currency:Ljava/lang/String;

    iget v8, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowStartHour:I

    iget v9, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowEndHour:I

    iget v10, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->lockedRideEndHour:I

    iget v11, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->forceRideEndHour:I

    iget-wide v12, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseRadius:D

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->deliveryMapV2:Z

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enableDeliveryMenuItem:Z

    move/from16 v16, v14

    move/from16 v17, v15

    iget-wide v14, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->cancellationFee:J

    move-wide/from16 v18, v14

    iget-object v14, v0, Lco/bird/android/model/wire/configs/DeliveryConfig;->activeRequestKind:Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DeliveryConfig(launchDate="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enabled="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", weekdayPrice="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", weekendPrice="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", currency="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", releaseWindowStartHour="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", releaseWindowEndHour="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", lockedRideEndHour="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", forceRideEndHour="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", releaseRadius="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", deliveryMapV2="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v16

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableDeliveryMenuItem="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", cancellationFee="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v0, v18

    invoke-virtual {v15, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", activeRequestKind="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->launchDate:Lorg/joda/time/LocalDate;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enabled:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekdayPrice:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->weekendPrice:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->currency:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowStartHour:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseWindowEndHour:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->lockedRideEndHour:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->forceRideEndHour:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->releaseRadius:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->deliveryMapV2:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->enableDeliveryMenuItem:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->cancellationFee:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lco/bird/android/model/wire/configs/DeliveryConfig;->activeRequestKind:Lco/bird/android/model/wire/configs/DeliveryRequestKind;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
