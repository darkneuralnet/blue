.class public final Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u00084\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00a9\u0001\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010/\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u00100\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u000b\u00107\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010:\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010;\u001a\u00020\u000eH\u00c6\u0003J\u00b2\u0001\u0010<\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00032\u0008\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\u0008H\u00d6\u0001J\t\u0010A\u001a\u00020\nH\u00d6\u0001R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u001e\u0010\u0017R\u001a\u0010\u000c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u001f\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010!R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\'\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008(\u0010\u001aR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008)\u0010\u001aR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008*\u0010\u001aR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\u0008+\u0010,\u00a8\u0006B"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;",
        "",
        "enabled",
        "",
        "method",
        "Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;",
        "methodBlockedRideDialog",
        "timeoutSeconds",
        "",
        "helpArticle",
        "",
        "resultRequired",
        "locationServicesRequired",
        "requiredProximityToNestMeters",
        "",
        "requiredHorizontalAccuracyMeters",
        "horizontalAccuracyAllowanceMetersPerSecond",
        "allowDeviceLocationIfAccurateAfterSeconds",
        "skipBirdScan",
        "showArMarker",
        "mocked",
        "(Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V",
        "getAllowDeviceLocationIfAccurateAfterSeconds",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getEnabled",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getHelpArticle",
        "()Ljava/lang/String;",
        "getHorizontalAccuracyAllowanceMetersPerSecond",
        "getLocationServicesRequired",
        "getMethod",
        "()Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;",
        "getMethodBlockedRideDialog",
        "getMocked",
        "()Z",
        "getRequiredHorizontalAccuracyMeters",
        "()D",
        "getRequiredProximityToNestMeters",
        "getResultRequired",
        "getShowArMarker",
        "getSkipBirdScan",
        "getTimeoutSeconds",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
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
        "(Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;",
        "equals",
        "other",
        "hashCode",
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
.field private final allowDeviceLocationIfAccurateAfterSeconds:Ljava/lang/Double;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "allow_device_location_if_accurate_after_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "allow_device_location_if_accurate_after_seconds"
    .end annotation
.end field

.field private final enabled:Ljava/lang/Boolean;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enabled"
    .end annotation

    .annotation runtime Lft5;
        value = "enabled"
    .end annotation
.end field

.field private final helpArticle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "help_article"
    .end annotation

    .annotation runtime Lft5;
        value = "help_article"
    .end annotation
.end field

.field private final horizontalAccuracyAllowanceMetersPerSecond:Ljava/lang/Double;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "horizontal_accuracy_allowance_meters_per_second"
    .end annotation

    .annotation runtime Lft5;
        value = "horizontal_accuracy_allowance_meters_per_second"
    .end annotation
.end field

.field private final locationServicesRequired:Ljava/lang/Boolean;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "location_services_required"
    .end annotation

    .annotation runtime Lft5;
        value = "location_services_required"
    .end annotation
.end field

.field private final method:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "method"
    .end annotation

    .annotation runtime Lft5;
        value = "method"
    .end annotation
.end field

.field private final methodBlockedRideDialog:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "method_blocked_ride_dialog"
    .end annotation

    .annotation runtime Lft5;
        value = "method_blocked_ride_dialog"
    .end annotation
.end field

.field private final mocked:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mocked"
    .end annotation

    .annotation runtime Lft5;
        value = "mocked"
    .end annotation
.end field

.field private final requiredHorizontalAccuracyMeters:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "required_horizontal_accuracy_meters"
    .end annotation

    .annotation runtime Lft5;
        value = "required_horizontal_accuracy_meters"
    .end annotation
.end field

.field private final requiredProximityToNestMeters:Ljava/lang/Double;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "required_proximity_to_nest_meters"
    .end annotation

    .annotation runtime Lft5;
        value = "required_proximity_to_nest_meters"
    .end annotation
.end field

.field private final resultRequired:Ljava/lang/Boolean;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "result_required"
    .end annotation

    .annotation runtime Lft5;
        value = "result_required"
    .end annotation
.end field

.field private final showArMarker:Ljava/lang/Boolean;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "show_ar_marker"
    .end annotation

    .annotation runtime Lft5;
        value = "show_ar_marker"
    .end annotation
.end field

.field private final skipBirdScan:Ljava/lang/Boolean;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "skip_bird_scan"
    .end annotation

    .annotation runtime Lft5;
        value = "skip_bird_scan"
    .end annotation
.end field

.field private final timeoutSeconds:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "timeout_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "timeout_seconds"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 18

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x3fff

    const/16 v17, 0x0

    invoke-direct/range {v0 .. v17}, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;-><init>(Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->enabled:Ljava/lang/Boolean;

    iput-object p2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->method:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iput-object p3, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->methodBlockedRideDialog:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iput-object p4, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->timeoutSeconds:Ljava/lang/Integer;

    iput-object p5, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->helpArticle:Ljava/lang/String;

    iput-object p6, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->resultRequired:Ljava/lang/Boolean;

    iput-object p7, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->locationServicesRequired:Ljava/lang/Boolean;

    iput-object p8, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredProximityToNestMeters:Ljava/lang/Double;

    iput-wide p9, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredHorizontalAccuracyMeters:D

    iput-object p11, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->horizontalAccuracyAllowanceMetersPerSecond:Ljava/lang/Double;

    iput-object p12, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->allowDeviceLocationIfAccurateAfterSeconds:Ljava/lang/Double;

    iput-object p13, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->skipBirdScan:Ljava/lang/Boolean;

    iput-object p14, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->showArMarker:Ljava/lang/Boolean;

    iput-boolean p15, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->mocked:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    sget-object v3, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->NONE:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    sget-object v4, Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;->NONE:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/16 v5, 0x1e

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

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

    const-wide/high16 v10, 0x4008000000000000L    # 3.0

    goto :goto_8

    :cond_8
    move-wide/from16 v10, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    move-object v12, v2

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    move-object v13, v2

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    move-object v14, v2

    goto :goto_b

    :cond_b
    move-object/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    goto :goto_c

    :cond_c
    move-object/from16 v2, p14

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    const/4 v0, 0x0

    goto :goto_d

    :cond_d
    move/from16 v0, p15

    :goto_d
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-wide/from16 p10, v10

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v2

    move/from16 p16, v0

    invoke-direct/range {p1 .. p16}, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;-><init>(Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;ZILjava/lang/Object;)Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->enabled:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->method:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->methodBlockedRideDialog:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->timeoutSeconds:Ljava/lang/Integer;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->helpArticle:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->resultRequired:Ljava/lang/Boolean;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->locationServicesRequired:Ljava/lang/Boolean;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredProximityToNestMeters:Ljava/lang/Double;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-wide v10, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredHorizontalAccuracyMeters:D

    goto :goto_8

    :cond_8
    move-wide/from16 v10, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->horizontalAccuracyAllowanceMetersPerSecond:Ljava/lang/Double;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->allowDeviceLocationIfAccurateAfterSeconds:Ljava/lang/Double;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->skipBirdScan:Ljava/lang/Boolean;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->showArMarker:Ljava/lang/Boolean;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p14

    :goto_c
    and-int/lit16 v1, v1, 0x2000

    if-eqz v1, :cond_d

    iget-boolean v1, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->mocked:Z

    goto :goto_d

    :cond_d
    move/from16 v1, p15

    :goto_d
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-wide/from16 p9, v10

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move/from16 p15, v1

    invoke-virtual/range {p0 .. p15}, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->copy(Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->enabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component10()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->horizontalAccuracyAllowanceMetersPerSecond:Ljava/lang/Double;

    return-object v0
.end method

.method public final component11()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->allowDeviceLocationIfAccurateAfterSeconds:Ljava/lang/Double;

    return-object v0
.end method

.method public final component12()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->skipBirdScan:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component13()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->showArMarker:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->mocked:Z

    return v0
.end method

.method public final component2()Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->method:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->methodBlockedRideDialog:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->timeoutSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->helpArticle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->resultRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->locationServicesRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredProximityToNestMeters:Ljava/lang/Double;

    return-object v0
.end method

.method public final component9()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredHorizontalAccuracyMeters:D

    return-wide v0
.end method

.method public final copy(Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;
    .locals 17

    new-instance v16, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    move-object/from16 v0, v16

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-wide/from16 v9, p9

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;-><init>(Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V

    return-object v16
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->enabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->enabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->method:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->method:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->methodBlockedRideDialog:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->methodBlockedRideDialog:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->timeoutSeconds:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->timeoutSeconds:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->helpArticle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->helpArticle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->resultRequired:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->resultRequired:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->locationServicesRequired:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->locationServicesRequired:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredProximityToNestMeters:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredProximityToNestMeters:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredHorizontalAccuracyMeters:D

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredHorizontalAccuracyMeters:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->horizontalAccuracyAllowanceMetersPerSecond:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->horizontalAccuracyAllowanceMetersPerSecond:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->allowDeviceLocationIfAccurateAfterSeconds:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->allowDeviceLocationIfAccurateAfterSeconds:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->skipBirdScan:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->skipBirdScan:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->showArMarker:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->showArMarker:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->mocked:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->mocked:Z

    if-eq v1, p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getAllowDeviceLocationIfAccurateAfterSeconds()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->allowDeviceLocationIfAccurateAfterSeconds:Ljava/lang/Double;

    return-object v0
.end method

.method public final getEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->enabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getHelpArticle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->helpArticle:Ljava/lang/String;

    return-object v0
.end method

.method public final getHorizontalAccuracyAllowanceMetersPerSecond()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->horizontalAccuracyAllowanceMetersPerSecond:Ljava/lang/Double;

    return-object v0
.end method

.method public final getLocationServicesRequired()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->locationServicesRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getMethod()Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->method:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    return-object v0
.end method

.method public final getMethodBlockedRideDialog()Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->methodBlockedRideDialog:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    return-object v0
.end method

.method public final getMocked()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->mocked:Z

    return v0
.end method

.method public final getRequiredHorizontalAccuracyMeters()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredHorizontalAccuracyMeters:D

    return-wide v0
.end method

.method public final getRequiredProximityToNestMeters()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredProximityToNestMeters:Ljava/lang/Double;

    return-object v0
.end method

.method public final getResultRequired()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->resultRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getShowArMarker()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->showArMarker:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSkipBirdScan()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->skipBirdScan:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getTimeoutSeconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->timeoutSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->enabled:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->method:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->methodBlockedRideDialog:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->timeoutSeconds:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->helpArticle:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->resultRequired:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->locationServicesRequired:Ljava/lang/Boolean;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredProximityToNestMeters:Ljava/lang/Double;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredHorizontalAccuracyMeters:D

    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->horizontalAccuracyAllowanceMetersPerSecond:Ljava/lang/Double;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->allowDeviceLocationIfAccurateAfterSeconds:Ljava/lang/Double;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->skipBirdScan:Ljava/lang/Boolean;

    if-nez v2, :cond_a

    move v2, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->showArMarker:Ljava/lang/Boolean;

    if-nez v2, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->mocked:Z

    if-eqz v1, :cond_c

    const/4 v1, 0x1

    :cond_c
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->enabled:Ljava/lang/Boolean;

    iget-object v2, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->method:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v3, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->methodBlockedRideDialog:Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;

    iget-object v4, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->timeoutSeconds:Ljava/lang/Integer;

    iget-object v5, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->helpArticle:Ljava/lang/String;

    iget-object v6, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->resultRequired:Ljava/lang/Boolean;

    iget-object v7, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->locationServicesRequired:Ljava/lang/Boolean;

    iget-object v8, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredProximityToNestMeters:Ljava/lang/Double;

    iget-wide v9, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->requiredHorizontalAccuracyMeters:D

    iget-object v11, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->horizontalAccuracyAllowanceMetersPerSecond:Ljava/lang/Double;

    iget-object v12, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->allowDeviceLocationIfAccurateAfterSeconds:Ljava/lang/Double;

    iget-object v13, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->skipBirdScan:Ljava/lang/Boolean;

    iget-object v14, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->showArMarker:Ljava/lang/Boolean;

    iget-boolean v15, v0, Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;->mocked:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v16, v15

    const-string v15, "ParkingLocationVerificationConfig(enabled="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", methodBlockedRideDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeoutSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", helpArticle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", resultRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", locationServicesRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", requiredProximityToNestMeters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", requiredHorizontalAccuracyMeters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalAccuracyAllowanceMetersPerSecond="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowDeviceLocationIfAccurateAfterSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", skipBirdScan="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showArMarker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mocked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
