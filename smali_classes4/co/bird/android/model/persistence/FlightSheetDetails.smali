.class public final Lco/bird/android/model/persistence/FlightSheetDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\r\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010\u0017J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\tH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000f\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u000f\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00100\rH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0083\u0001\u00105\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\r2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001J\u0013\u00106\u001a\u0002072\u0008\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020:H\u00d6\u0001J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*\u00a8\u0006<"
    }
    d2 = {
        "Lco/bird/android/model/persistence/FlightSheetDetails;",
        "",
        "vehicleId",
        "",
        "context",
        "Lco/bird/android/model/constant/FlightSheetContext;",
        "banner",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;",
        "vehicleSummary",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;",
        "commands",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;",
        "actionSections",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActions;",
        "infoSections",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;",
        "rideHistory",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;",
        "taskOrderInfo",
        "Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;",
        "rideRatings",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;",
        "(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;)V",
        "getActionSections",
        "()Ljava/util/List;",
        "getBanner",
        "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;",
        "getCommands",
        "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;",
        "getContext",
        "()Lco/bird/android/model/constant/FlightSheetContext;",
        "getInfoSections",
        "getRideHistory",
        "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;",
        "getRideRatings",
        "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;",
        "getTaskOrderInfo",
        "()Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;",
        "getVehicleId",
        "()Ljava/lang/String;",
        "getVehicleSummary",
        "()Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;",
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
.field private final actionSections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActions;",
            ">;"
        }
    .end annotation
.end field

.field private final banner:Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

.field private final commands:Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;

.field private final context:Lco/bird/android/model/constant/FlightSheetContext;

.field private final infoSections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;",
            ">;"
        }
    .end annotation
.end field

.field private final rideHistory:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;

.field private final rideRatings:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;

.field private final taskOrderInfo:Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

.field private final vehicleId:Ljava/lang/String;

.field private final vehicleSummary:Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/FlightSheetContext;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActions;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;",
            ">;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;",
            "Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;",
            ")V"
        }
    .end annotation

    const-string v0, "vehicleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vehicleSummary"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionSections"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "infoSections"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->context:Lco/bird/android/model/constant/FlightSheetContext;

    iput-object p3, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->banner:Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    iput-object p4, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleSummary:Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;

    iput-object p5, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->commands:Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;

    iput-object p6, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->actionSections:Ljava/util/List;

    iput-object p7, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->infoSections:Ljava/util/List;

    iput-object p8, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideHistory:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;

    iput-object p9, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    iput-object p10, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideRatings:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    move-object v9, v1

    goto :goto_1

    :cond_1
    move-object/from16 v9, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    move-object v10, v1

    goto :goto_2

    :cond_2
    move-object/from16 v10, p7

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p8

    :goto_3
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    move-object v12, v2

    goto :goto_4

    :cond_4
    move-object/from16 v12, p9

    :goto_4
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_5

    move-object v13, v2

    goto :goto_5

    :cond_5
    move-object/from16 v13, p10

    :goto_5
    move-object v3, p0

    move-object v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v3 .. v13}, Lco/bird/android/model/persistence/FlightSheetDetails;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/FlightSheetDetails;Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;ILjava/lang/Object;)Lco/bird/android/model/persistence/FlightSheetDetails;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/persistence/FlightSheetDetails;->context:Lco/bird/android/model/constant/FlightSheetContext;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/persistence/FlightSheetDetails;->banner:Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleSummary:Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/persistence/FlightSheetDetails;->commands:Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/persistence/FlightSheetDetails;->actionSections:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/persistence/FlightSheetDetails;->infoSections:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideHistory:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/persistence/FlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideRatings:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;

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

    invoke-virtual/range {p0 .. p10}, Lco/bird/android/model/persistence/FlightSheetDetails;->copy(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;)Lco/bird/android/model/persistence/FlightSheetDetails;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideRatings:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/constant/FlightSheetContext;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->context:Lco/bird/android/model/constant/FlightSheetContext;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->banner:Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleSummary:Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->commands:Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->actionSections:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->infoSections:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideHistory:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;

    return-object v0
.end method

.method public final component9()Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;)Lco/bird/android/model/persistence/FlightSheetDetails;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/FlightSheetContext;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActions;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;",
            ">;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;",
            "Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;",
            ")",
            "Lco/bird/android/model/persistence/FlightSheetDetails;"
        }
    .end annotation

    const-string v0, "vehicleId"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vehicleSummary"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionSections"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "infoSections"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/FlightSheetDetails;

    move-object v1, v0

    move-object v4, p3

    move-object/from16 v6, p5

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lco/bird/android/model/persistence/FlightSheetDetails;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/FlightSheetDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/FlightSheetDetails;

    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->context:Lco/bird/android/model/constant/FlightSheetContext;

    iget-object v3, p1, Lco/bird/android/model/persistence/FlightSheetDetails;->context:Lco/bird/android/model/constant/FlightSheetContext;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->banner:Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    iget-object v3, p1, Lco/bird/android/model/persistence/FlightSheetDetails;->banner:Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleSummary:Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;

    iget-object v3, p1, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleSummary:Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->commands:Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;

    iget-object v3, p1, Lco/bird/android/model/persistence/FlightSheetDetails;->commands:Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->actionSections:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/persistence/FlightSheetDetails;->actionSections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->infoSections:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/persistence/FlightSheetDetails;->infoSections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideHistory:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;

    iget-object v3, p1, Lco/bird/android/model/persistence/FlightSheetDetails;->rideHistory:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    iget-object v3, p1, Lco/bird/android/model/persistence/FlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideRatings:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;

    iget-object p1, p1, Lco/bird/android/model/persistence/FlightSheetDetails;->rideRatings:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getActionSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetActions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->actionSections:Ljava/util/List;

    return-object v0
.end method

.method public final getBanner()Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->banner:Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    return-object v0
.end method

.method public final getCommands()Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->commands:Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;

    return-object v0
.end method

.method public final getContext()Lco/bird/android/model/constant/FlightSheetContext;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->context:Lco/bird/android/model/constant/FlightSheetContext;

    return-object v0
.end method

.method public final getInfoSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FlightSheetInfoSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->infoSections:Ljava/util/List;

    return-object v0
.end method

.method public final getRideHistory()Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideHistory:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;

    return-object v0
.end method

.method public final getRideRatings()Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideRatings:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;

    return-object v0
.end method

.method public final getTaskOrderInfo()Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    return-object v0
.end method

.method public final getVehicleId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleId:Ljava/lang/String;

    return-object v0
.end method

.method public final getVehicleSummary()Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleSummary:Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->context:Lco/bird/android/model/constant/FlightSheetContext;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->banner:Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleSummary:Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->commands:Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->actionSections:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->infoSections:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideHistory:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideRatings:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->context:Lco/bird/android/model/constant/FlightSheetContext;

    iget-object v2, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->banner:Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    iget-object v3, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->vehicleSummary:Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;

    iget-object v4, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->commands:Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;

    iget-object v5, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->actionSections:Ljava/util/List;

    iget-object v6, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->infoSections:Ljava/util/List;

    iget-object v7, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideHistory:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;

    iget-object v8, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->taskOrderInfo:Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    iget-object v9, p0, Lco/bird/android/model/persistence/FlightSheetDetails;->rideRatings:Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "FlightSheetDetails(vehicleId="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", context="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", banner="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vehicleSummary="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", commands="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", actionSections="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", infoSections="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rideHistory="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", taskOrderInfo="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rideRatings="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
