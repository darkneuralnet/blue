.class public final Lco/bird/android/model/wire/WireFlightSheetDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bk\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000f\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\tH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003Jo\u0010+\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001R\u001c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"\u00a8\u00063"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireFlightSheetDetails;",
        "",
        "banner",
        "Lco/bird/android/model/wire/WireFlightSheetBanner;",
        "vehicleSummary",
        "Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;",
        "commands",
        "Lco/bird/android/model/wire/WireFlightSheetCommands;",
        "actionSections",
        "",
        "Lco/bird/android/model/wire/WireFlightSheetActions;",
        "infoSections",
        "Lco/bird/android/model/wire/WireFlightSheetInfoSection;",
        "rideHistory",
        "Lco/bird/android/model/wire/WireFlightSheetRideHistory;",
        "taskOrderInfo",
        "Lco/bird/android/model/wire/WireTaskOrderInfo;",
        "rideRatings",
        "Lco/bird/android/model/wire/WireFlightSheetRideRatings;",
        "(Lco/bird/android/model/wire/WireFlightSheetBanner;Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;Lco/bird/android/model/wire/WireFlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireFlightSheetRideHistory;Lco/bird/android/model/wire/WireTaskOrderInfo;Lco/bird/android/model/wire/WireFlightSheetRideRatings;)V",
        "getActionSections",
        "()Ljava/util/List;",
        "getBanner",
        "()Lco/bird/android/model/wire/WireFlightSheetBanner;",
        "getCommands",
        "()Lco/bird/android/model/wire/WireFlightSheetCommands;",
        "getInfoSections",
        "getRideHistory",
        "()Lco/bird/android/model/wire/WireFlightSheetRideHistory;",
        "getRideRatings",
        "()Lco/bird/android/model/wire/WireFlightSheetRideRatings;",
        "getTaskOrderInfo",
        "()Lco/bird/android/model/wire/WireTaskOrderInfo;",
        "getVehicleSummary",
        "()Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;",
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
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final actionSections:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "action_sections"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetActions;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "action_sections"
    .end annotation
.end field

.field private final banner:Lco/bird/android/model/wire/WireFlightSheetBanner;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "banner"
    .end annotation

    .annotation runtime Lft5;
        value = "banner"
    .end annotation
.end field

.field private final commands:Lco/bird/android/model/wire/WireFlightSheetCommands;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "commands"
    .end annotation

    .annotation runtime Lft5;
        value = "commands"
    .end annotation
.end field

.field private final infoSections:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "info_sections"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetInfoSection;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "info_sections"
    .end annotation
.end field

.field private final rideHistory:Lco/bird/android/model/wire/WireFlightSheetRideHistory;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ride_history"
    .end annotation

    .annotation runtime Lft5;
        value = "ride_history"
    .end annotation
.end field

.field private final rideRatings:Lco/bird/android/model/wire/WireFlightSheetRideRatings;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ride_ratings"
    .end annotation

    .annotation runtime Lft5;
        value = "ride_ratings"
    .end annotation
.end field

.field private final taskOrderInfo:Lco/bird/android/model/wire/WireTaskOrderInfo;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "task_order_info"
    .end annotation

    .annotation runtime Lft5;
        value = "task_order_info"
    .end annotation
.end field

.field private final vehicleSummary:Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "vehicle_summary"
    .end annotation

    .annotation runtime Lft5;
        value = "vehicle_summary"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 11

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xff

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lco/bird/android/model/wire/WireFlightSheetDetails;-><init>(Lco/bird/android/model/wire/WireFlightSheetBanner;Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;Lco/bird/android/model/wire/WireFlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireFlightSheetRideHistory;Lco/bird/android/model/wire/WireTaskOrderInfo;Lco/bird/android/model/wire/WireFlightSheetRideRatings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireFlightSheetBanner;Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;Lco/bird/android/model/wire/WireFlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireFlightSheetRideHistory;Lco/bird/android/model/wire/WireTaskOrderInfo;Lco/bird/android/model/wire/WireFlightSheetRideRatings;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireFlightSheetBanner;",
            "Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;",
            "Lco/bird/android/model/wire/WireFlightSheetCommands;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetActions;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetInfoSection;",
            ">;",
            "Lco/bird/android/model/wire/WireFlightSheetRideHistory;",
            "Lco/bird/android/model/wire/WireTaskOrderInfo;",
            "Lco/bird/android/model/wire/WireFlightSheetRideRatings;",
            ")V"
        }
    .end annotation

    const-string v0, "vehicleSummary"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionSections"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "infoSections"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->banner:Lco/bird/android/model/wire/WireFlightSheetBanner;

    iput-object p2, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->vehicleSummary:Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    iput-object p3, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->commands:Lco/bird/android/model/wire/WireFlightSheetCommands;

    iput-object p4, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->actionSections:Ljava/util/List;

    iput-object p5, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->infoSections:Ljava/util/List;

    iput-object p6, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideHistory:Lco/bird/android/model/wire/WireFlightSheetRideHistory;

    iput-object p7, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/wire/WireTaskOrderInfo;

    iput-object p8, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideRatings:Lco/bird/android/model/wire/WireFlightSheetRideRatings;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireFlightSheetBanner;Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;Lco/bird/android/model/wire/WireFlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireFlightSheetRideHistory;Lco/bird/android/model/wire/WireTaskOrderInfo;Lco/bird/android/model/wire/WireFlightSheetRideRatings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    move/from16 v0, p9

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

    new-instance v3, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    move-object v4, v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0x3ffff

    const/16 v24, 0x0

    invoke-direct/range {v4 .. v24}, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;-><init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v6

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
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    goto :goto_7

    :cond_7
    move-object/from16 v2, p8

    :goto_7
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v2

    invoke-direct/range {p1 .. p9}, Lco/bird/android/model/wire/WireFlightSheetDetails;-><init>(Lco/bird/android/model/wire/WireFlightSheetBanner;Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;Lco/bird/android/model/wire/WireFlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireFlightSheetRideHistory;Lco/bird/android/model/wire/WireTaskOrderInfo;Lco/bird/android/model/wire/WireFlightSheetRideRatings;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireFlightSheetDetails;Lco/bird/android/model/wire/WireFlightSheetBanner;Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;Lco/bird/android/model/wire/WireFlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireFlightSheetRideHistory;Lco/bird/android/model/wire/WireTaskOrderInfo;Lco/bird/android/model/wire/WireFlightSheetRideRatings;ILjava/lang/Object;)Lco/bird/android/model/wire/WireFlightSheetDetails;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/wire/WireFlightSheetDetails;->banner:Lco/bird/android/model/wire/WireFlightSheetBanner;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/wire/WireFlightSheetDetails;->vehicleSummary:Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/wire/WireFlightSheetDetails;->commands:Lco/bird/android/model/wire/WireFlightSheetCommands;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/wire/WireFlightSheetDetails;->actionSections:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/wire/WireFlightSheetDetails;->infoSections:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideHistory:Lco/bird/android/model/wire/WireFlightSheetRideHistory;

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/wire/WireFlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/wire/WireTaskOrderInfo;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideRatings:Lco/bird/android/model/wire/WireFlightSheetRideRatings;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p8

    :goto_7
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lco/bird/android/model/wire/WireFlightSheetDetails;->copy(Lco/bird/android/model/wire/WireFlightSheetBanner;Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;Lco/bird/android/model/wire/WireFlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireFlightSheetRideHistory;Lco/bird/android/model/wire/WireTaskOrderInfo;Lco/bird/android/model/wire/WireFlightSheetRideRatings;)Lco/bird/android/model/wire/WireFlightSheetDetails;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireFlightSheetBanner;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->banner:Lco/bird/android/model/wire/WireFlightSheetBanner;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->vehicleSummary:Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/WireFlightSheetCommands;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->commands:Lco/bird/android/model/wire/WireFlightSheetCommands;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetActions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->actionSections:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetInfoSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->infoSections:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/wire/WireFlightSheetRideHistory;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideHistory:Lco/bird/android/model/wire/WireFlightSheetRideHistory;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/wire/WireTaskOrderInfo;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/wire/WireTaskOrderInfo;

    return-object v0
.end method

.method public final component8()Lco/bird/android/model/wire/WireFlightSheetRideRatings;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideRatings:Lco/bird/android/model/wire/WireFlightSheetRideRatings;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireFlightSheetBanner;Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;Lco/bird/android/model/wire/WireFlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireFlightSheetRideHistory;Lco/bird/android/model/wire/WireTaskOrderInfo;Lco/bird/android/model/wire/WireFlightSheetRideRatings;)Lco/bird/android/model/wire/WireFlightSheetDetails;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireFlightSheetBanner;",
            "Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;",
            "Lco/bird/android/model/wire/WireFlightSheetCommands;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetActions;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetInfoSection;",
            ">;",
            "Lco/bird/android/model/wire/WireFlightSheetRideHistory;",
            "Lco/bird/android/model/wire/WireTaskOrderInfo;",
            "Lco/bird/android/model/wire/WireFlightSheetRideRatings;",
            ")",
            "Lco/bird/android/model/wire/WireFlightSheetDetails;"
        }
    .end annotation

    const-string v0, "vehicleSummary"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionSections"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "infoSections"

    move-object v6, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireFlightSheetDetails;

    move-object v1, v0

    move-object v2, p1

    move-object v4, p3

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/wire/WireFlightSheetDetails;-><init>(Lco/bird/android/model/wire/WireFlightSheetBanner;Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;Lco/bird/android/model/wire/WireFlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireFlightSheetRideHistory;Lco/bird/android/model/wire/WireTaskOrderInfo;Lco/bird/android/model/wire/WireFlightSheetRideRatings;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireFlightSheetDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireFlightSheetDetails;

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->banner:Lco/bird/android/model/wire/WireFlightSheetBanner;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetDetails;->banner:Lco/bird/android/model/wire/WireFlightSheetBanner;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->vehicleSummary:Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetDetails;->vehicleSummary:Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->commands:Lco/bird/android/model/wire/WireFlightSheetCommands;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetDetails;->commands:Lco/bird/android/model/wire/WireFlightSheetCommands;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->actionSections:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetDetails;->actionSections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->infoSections:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetDetails;->infoSections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideHistory:Lco/bird/android/model/wire/WireFlightSheetRideHistory;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideHistory:Lco/bird/android/model/wire/WireFlightSheetRideHistory;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/wire/WireTaskOrderInfo;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/wire/WireTaskOrderInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideRatings:Lco/bird/android/model/wire/WireFlightSheetRideRatings;

    iget-object p1, p1, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideRatings:Lco/bird/android/model/wire/WireFlightSheetRideRatings;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getActionSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetActions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->actionSections:Ljava/util/List;

    return-object v0
.end method

.method public final getBanner()Lco/bird/android/model/wire/WireFlightSheetBanner;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->banner:Lco/bird/android/model/wire/WireFlightSheetBanner;

    return-object v0
.end method

.method public final getCommands()Lco/bird/android/model/wire/WireFlightSheetCommands;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->commands:Lco/bird/android/model/wire/WireFlightSheetCommands;

    return-object v0
.end method

.method public final getInfoSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetInfoSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->infoSections:Ljava/util/List;

    return-object v0
.end method

.method public final getRideHistory()Lco/bird/android/model/wire/WireFlightSheetRideHistory;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideHistory:Lco/bird/android/model/wire/WireFlightSheetRideHistory;

    return-object v0
.end method

.method public final getRideRatings()Lco/bird/android/model/wire/WireFlightSheetRideRatings;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideRatings:Lco/bird/android/model/wire/WireFlightSheetRideRatings;

    return-object v0
.end method

.method public final getTaskOrderInfo()Lco/bird/android/model/wire/WireTaskOrderInfo;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/wire/WireTaskOrderInfo;

    return-object v0
.end method

.method public final getVehicleSummary()Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->vehicleSummary:Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->banner:Lco/bird/android/model/wire/WireFlightSheetBanner;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireFlightSheetBanner;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->vehicleSummary:Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->commands:Lco/bird/android/model/wire/WireFlightSheetCommands;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireFlightSheetCommands;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->actionSections:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->infoSections:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideHistory:Lco/bird/android/model/wire/WireFlightSheetRideHistory;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireFlightSheetRideHistory;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/wire/WireTaskOrderInfo;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireTaskOrderInfo;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideRatings:Lco/bird/android/model/wire/WireFlightSheetRideRatings;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireFlightSheetRideRatings;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->banner:Lco/bird/android/model/wire/WireFlightSheetBanner;

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->vehicleSummary:Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    iget-object v2, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->commands:Lco/bird/android/model/wire/WireFlightSheetCommands;

    iget-object v3, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->actionSections:Ljava/util/List;

    iget-object v4, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->infoSections:Ljava/util/List;

    iget-object v5, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideHistory:Lco/bird/android/model/wire/WireFlightSheetRideHistory;

    iget-object v6, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/wire/WireTaskOrderInfo;

    iget-object v7, p0, Lco/bird/android/model/wire/WireFlightSheetDetails;->rideRatings:Lco/bird/android/model/wire/WireFlightSheetRideRatings;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "WireFlightSheetDetails(banner="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vehicleSummary="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", commands="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", actionSections="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", infoSections="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rideHistory="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", taskOrderInfo="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rideRatings="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
