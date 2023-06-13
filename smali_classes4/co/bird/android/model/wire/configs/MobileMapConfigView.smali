.class public final Lco/bird/android/model/wire/configs/MobileMapConfigView;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u00082\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00bb\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010\u001cJ\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\t\u0010C\u001a\u00020\u000cH\u00c6\u0003J\t\u0010D\u001a\u00020\u000eH\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u00c4\u0001\u0010G\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00032\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u00c6\u0001\u00a2\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00032\u0008\u0010J\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010K\u001a\u00020LH\u00d6\u0001J\t\u0010M\u001a\u00020\u0008H\u00d6\u0001R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010$R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\u0008&\u0010\'R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010$R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0016\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010$R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010$R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106\u00a8\u0006N"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/MobileMapConfigView;",
        "",
        "showBatteryPercent",
        "",
        "showRangeInsteadOfBatteryPercentage",
        "enableUserLocationV2",
        "poiAnnotations",
        "",
        "",
        "maxAutoselectMerchantDistance",
        "",
        "scanButtonStyle",
        "Lco/bird/android/model/constant/ScanButtonStyle;",
        "scanButtonShape",
        "Lco/bird/android/model/constant/ScanButtonShape;",
        "showGroupRideButton",
        "clustering",
        "Lco/bird/android/model/wire/configs/ClusteringConfig;",
        "operationalZoneInversion",
        "Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;",
        "zoneColorOverride",
        "Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;",
        "enableOptimizedMapRenderer",
        "riderShowAreasBeforeSelectingVehicle",
        "clientBirdGeocacheConfig",
        "Lco/bird/android/model/wire/configs/MapGeocacheConfig;",
        "clientZoneGeocacheConfig",
        "clientNestGeocacheConfig",
        "(ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;)V",
        "getClientBirdGeocacheConfig",
        "()Lco/bird/android/model/wire/configs/MapGeocacheConfig;",
        "getClientNestGeocacheConfig",
        "getClientZoneGeocacheConfig",
        "getClustering",
        "()Lco/bird/android/model/wire/configs/ClusteringConfig;",
        "getEnableOptimizedMapRenderer",
        "()Z",
        "getEnableUserLocationV2",
        "getMaxAutoselectMerchantDistance",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getOperationalZoneInversion",
        "()Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;",
        "getPoiAnnotations",
        "()Ljava/util/List;",
        "getRiderShowAreasBeforeSelectingVehicle",
        "getScanButtonShape",
        "()Lco/bird/android/model/constant/ScanButtonShape;",
        "getScanButtonStyle",
        "()Lco/bird/android/model/constant/ScanButtonStyle;",
        "getShowBatteryPercent",
        "getShowGroupRideButton",
        "getShowRangeInsteadOfBatteryPercentage",
        "getZoneColorOverride",
        "()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;)Lco/bird/android/model/wire/configs/MobileMapConfigView;",
        "equals",
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
.field private final clientBirdGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "client_bird_geocache_config"
    .end annotation

    .annotation runtime Lft5;
        value = "client_bird_geocache_config"
    .end annotation
.end field

.field private final clientNestGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "client_nest_geocache_config"
    .end annotation

    .annotation runtime Lft5;
        value = "client_nest_geocache_config"
    .end annotation
.end field

.field private final clientZoneGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "client_zone_geocache_config"
    .end annotation

    .annotation runtime Lft5;
        value = "client_zone_geocache_config"
    .end annotation
.end field

.field private final clustering:Lco/bird/android/model/wire/configs/ClusteringConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "clustering"
    .end annotation

    .annotation runtime Lft5;
        value = "clustering"
    .end annotation
.end field

.field private final enableOptimizedMapRenderer:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_optimized_map_renderer"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_optimized_map_renderer"
    .end annotation
.end field

.field private final enableUserLocationV2:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_user_location_v2"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_user_location_v2"
    .end annotation
.end field

.field private final maxAutoselectMerchantDistance:Ljava/lang/Double;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "max_autoselect_merchant_distance"
    .end annotation

    .annotation runtime Lft5;
        value = "max_autoselect_merchant_distance"
    .end annotation
.end field

.field private final operationalZoneInversion:Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "operational_zone_inversion"
    .end annotation

    .annotation runtime Lft5;
        value = "operational_zone_inversion"
    .end annotation
.end field

.field private final poiAnnotations:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "native_poi_annotations"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "native_poi_annotations"
    .end annotation
.end field

.field private final riderShowAreasBeforeSelectingVehicle:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rider_show_areas_before_selecting_vehicle"
    .end annotation

    .annotation runtime Lft5;
        value = "rider_show_areas_before_selecting_vehicle"
    .end annotation
.end field

.field private final scanButtonShape:Lco/bird/android/model/constant/ScanButtonShape;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scan_button_shape"
    .end annotation

    .annotation runtime Lft5;
        value = "scan_button_shape"
    .end annotation
.end field

.field private final scanButtonStyle:Lco/bird/android/model/constant/ScanButtonStyle;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "scan_button_style"
    .end annotation

    .annotation runtime Lft5;
        value = "scan_button_style"
    .end annotation
.end field

.field private final showBatteryPercent:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "show_battery_percentage"
    .end annotation

    .annotation runtime Lft5;
        value = "show_battery_percentage"
    .end annotation
.end field

.field private final showGroupRideButton:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "show_group_ride_button"
    .end annotation

    .annotation runtime Lft5;
        value = "show_group_ride_button"
    .end annotation
.end field

.field private final showRangeInsteadOfBatteryPercentage:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "show_range_instead_of_battery_percentage"
    .end annotation

    .annotation runtime Lft5;
        value = "show_range_instead_of_battery_percentage"
    .end annotation
.end field

.field private final zoneColorOverride:Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "zone_color_override"
    .end annotation

    .annotation runtime Lft5;
        value = "zone_color_override"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 19

    move-object/from16 v0, p0

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

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, 0xffff

    const/16 v18, 0x0

    invoke-direct/range {v0 .. v18}, Lco/bird/android/model/wire/configs/MobileMapConfigView;-><init>(ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZ",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Double;",
            "Lco/bird/android/model/constant/ScanButtonStyle;",
            "Lco/bird/android/model/constant/ScanButtonShape;",
            "Z",
            "Lco/bird/android/model/wire/configs/ClusteringConfig;",
            "Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;",
            "Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;",
            "ZZ",
            "Lco/bird/android/model/wire/configs/MapGeocacheConfig;",
            "Lco/bird/android/model/wire/configs/MapGeocacheConfig;",
            "Lco/bird/android/model/wire/configs/MapGeocacheConfig;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p6

    move-object v2, p7

    const-string v3, "scanButtonStyle"

    invoke-static {p6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "scanButtonShape"

    invoke-static {p7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v3, p1

    iput-boolean v3, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showBatteryPercent:Z

    move v3, p2

    iput-boolean v3, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showRangeInsteadOfBatteryPercentage:Z

    move v3, p3

    iput-boolean v3, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableUserLocationV2:Z

    move-object v3, p4

    iput-object v3, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->poiAnnotations:Ljava/util/List;

    move-object v3, p5

    iput-object v3, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->maxAutoselectMerchantDistance:Ljava/lang/Double;

    iput-object v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonStyle:Lco/bird/android/model/constant/ScanButtonStyle;

    iput-object v2, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonShape:Lco/bird/android/model/constant/ScanButtonShape;

    move v1, p8

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showGroupRideButton:Z

    move-object v1, p9

    iput-object v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clustering:Lco/bird/android/model/wire/configs/ClusteringConfig;

    move-object v1, p10

    iput-object v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->operationalZoneInversion:Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;

    move-object v1, p11

    iput-object v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->zoneColorOverride:Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    move/from16 v1, p12

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableOptimizedMapRenderer:Z

    move/from16 v1, p13

    iput-boolean v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->riderShowAreasBeforeSelectingVehicle:Z

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientBirdGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    move-object/from16 v1, p15

    iput-object v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientZoneGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    move-object/from16 v1, p16

    iput-object v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientNestGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    return-void
.end method

.method public synthetic constructor <init>(ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    move-object v5, v6

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    move-object v7, v6

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    sget-object v8, Lco/bird/android/model/constant/ScanButtonStyle;->RIDE:Lco/bird/android/model/constant/ScanButtonStyle;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    sget-object v9, Lco/bird/android/model/constant/ScanButtonShape;->CIRCLE:Lco/bird/android/model/constant/ScanButtonShape;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    move v10, v2

    goto :goto_7

    :cond_7
    move/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    const/4 v12, 0x3

    if-eqz v11, :cond_8

    new-instance v11, Lco/bird/android/model/wire/configs/ClusteringConfig;

    invoke-direct {v11, v6, v6, v12, v6}, Lco/bird/android/model/wire/configs/ClusteringConfig;-><init>(Lco/bird/android/model/wire/configs/ClusteringParametersConfig;Lco/bird/android/model/wire/configs/ClusteringParametersConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    new-instance v13, Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;

    invoke-direct {v13, v6, v6, v12, v6}, Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v6, v0, 0x400

    if-eqz v6, :cond_a

    new-instance v6, Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x3f

    const/16 v20, 0x0

    move-object/from16 p1, v6

    move-object/from16 p2, v12

    move-object/from16 p3, v14

    move-object/from16 p4, v15

    move-object/from16 p5, v16

    move-object/from16 p6, v17

    move-object/from16 p7, v18

    move/from16 p8, v19

    move-object/from16 p9, v20

    invoke-direct/range {p1 .. p9}, Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;-><init>(Lco/bird/android/model/wire/configs/ZoneColorConfig;Lco/bird/android/model/wire/configs/ZoneColorConfig;Lco/bird/android/model/wire/configs/ZoneColorConfig;Lco/bird/android/model/wire/configs/ZoneColorConfig;Lco/bird/android/model/wire/configs/ZoneColorConfig;Lco/bird/android/model/wire/configs/ZoneColorConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_a
    move-object/from16 v6, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    goto :goto_b

    :cond_b
    move/from16 v2, p12

    :goto_b
    and-int/lit16 v12, v0, 0x1000

    if-eqz v12, :cond_c

    const/4 v12, 0x1

    goto :goto_c

    :cond_c
    move/from16 v12, p13

    :goto_c
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_d

    new-instance v14, Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xf

    const/16 v20, 0x0

    move-object/from16 p1, v14

    move-object/from16 p2, v15

    move-object/from16 p3, v16

    move-object/from16 p4, v17

    move-object/from16 p5, v18

    move/from16 p6, v19

    move-object/from16 p7, v20

    invoke-direct/range {p1 .. p7}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_d

    :cond_d
    move-object/from16 v14, p14

    :goto_d
    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_e

    new-instance v15, Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xf

    const/16 v21, 0x0

    move-object/from16 p1, v15

    move-object/from16 p2, v16

    move-object/from16 p3, v17

    move-object/from16 p4, v18

    move-object/from16 p5, v19

    move/from16 p6, v20

    move-object/from16 p7, v21

    invoke-direct/range {p1 .. p7}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v0, v0, v16

    if-eqz v0, :cond_f

    new-instance v0, Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xf

    const/16 v21, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v16

    move-object/from16 p3, v17

    move-object/from16 p4, v18

    move-object/from16 p5, v19

    move/from16 p6, v20

    move-object/from16 p7, v21

    invoke-direct/range {p1 .. p7}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_f

    :cond_f
    move-object/from16 v0, p16

    :goto_f
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p3, v3

    move/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v13

    move-object/from16 p12, v6

    move/from16 p13, v2

    move/from16 p14, v12

    move-object/from16 p15, v14

    move-object/from16 p16, v15

    move-object/from16 p17, v0

    invoke-direct/range {p1 .. p17}, Lco/bird/android/model/wire/configs/MobileMapConfigView;-><init>(ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/MobileMapConfigView;ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/MobileMapConfigView;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showBatteryPercent:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showRangeInsteadOfBatteryPercentage:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableUserLocationV2:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->poiAnnotations:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->maxAutoselectMerchantDistance:Ljava/lang/Double;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonStyle:Lco/bird/android/model/constant/ScanButtonStyle;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonShape:Lco/bird/android/model/constant/ScanButtonShape;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showGroupRideButton:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clustering:Lco/bird/android/model/wire/configs/ClusteringConfig;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->operationalZoneInversion:Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->zoneColorOverride:Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableOptimizedMapRenderer:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->riderShowAreasBeforeSelectingVehicle:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientBirdGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientZoneGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientNestGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    move/from16 p1, v2

    move/from16 p2, v3

    move/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move-object/from16 p15, v15

    move-object/from16 p16, v1

    invoke-virtual/range {p0 .. p16}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->copy(ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;)Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showBatteryPercent:Z

    return v0
.end method

.method public final component10()Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->operationalZoneInversion:Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;

    return-object v0
.end method

.method public final component11()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->zoneColorOverride:Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableOptimizedMapRenderer:Z

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->riderShowAreasBeforeSelectingVehicle:Z

    return v0
.end method

.method public final component14()Lco/bird/android/model/wire/configs/MapGeocacheConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientBirdGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    return-object v0
.end method

.method public final component15()Lco/bird/android/model/wire/configs/MapGeocacheConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientZoneGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    return-object v0
.end method

.method public final component16()Lco/bird/android/model/wire/configs/MapGeocacheConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientNestGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showRangeInsteadOfBatteryPercentage:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableUserLocationV2:Z

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->poiAnnotations:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->maxAutoselectMerchantDistance:Ljava/lang/Double;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/constant/ScanButtonStyle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonStyle:Lco/bird/android/model/constant/ScanButtonStyle;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/constant/ScanButtonShape;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonShape:Lco/bird/android/model/constant/ScanButtonShape;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showGroupRideButton:Z

    return v0
.end method

.method public final component9()Lco/bird/android/model/wire/configs/ClusteringConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clustering:Lco/bird/android/model/wire/configs/ClusteringConfig;

    return-object v0
.end method

.method public final copy(ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;)Lco/bird/android/model/wire/configs/MobileMapConfigView;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZ",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Double;",
            "Lco/bird/android/model/constant/ScanButtonStyle;",
            "Lco/bird/android/model/constant/ScanButtonShape;",
            "Z",
            "Lco/bird/android/model/wire/configs/ClusteringConfig;",
            "Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;",
            "Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;",
            "ZZ",
            "Lco/bird/android/model/wire/configs/MapGeocacheConfig;",
            "Lco/bird/android/model/wire/configs/MapGeocacheConfig;",
            "Lco/bird/android/model/wire/configs/MapGeocacheConfig;",
            ")",
            "Lco/bird/android/model/wire/configs/MobileMapConfigView;"
        }
    .end annotation

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    const-string v0, "scanButtonStyle"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanButtonShape"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v17, Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-object/from16 v0, v17

    move/from16 v1, p1

    invoke-direct/range {v0 .. v16}, Lco/bird/android/model/wire/configs/MobileMapConfigView;-><init>(ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;)V

    return-object v17
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showBatteryPercent:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showBatteryPercent:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showRangeInsteadOfBatteryPercentage:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showRangeInsteadOfBatteryPercentage:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableUserLocationV2:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableUserLocationV2:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->poiAnnotations:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->poiAnnotations:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->maxAutoselectMerchantDistance:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->maxAutoselectMerchantDistance:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonStyle:Lco/bird/android/model/constant/ScanButtonStyle;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonStyle:Lco/bird/android/model/constant/ScanButtonStyle;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonShape:Lco/bird/android/model/constant/ScanButtonShape;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonShape:Lco/bird/android/model/constant/ScanButtonShape;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showGroupRideButton:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showGroupRideButton:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clustering:Lco/bird/android/model/wire/configs/ClusteringConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clustering:Lco/bird/android/model/wire/configs/ClusteringConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->operationalZoneInversion:Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->operationalZoneInversion:Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->zoneColorOverride:Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->zoneColorOverride:Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableOptimizedMapRenderer:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableOptimizedMapRenderer:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->riderShowAreasBeforeSelectingVehicle:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->riderShowAreasBeforeSelectingVehicle:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientBirdGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientBirdGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientZoneGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientZoneGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientNestGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    iget-object p1, p1, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientNestGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getClientBirdGeocacheConfig()Lco/bird/android/model/wire/configs/MapGeocacheConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientBirdGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    return-object v0
.end method

.method public final getClientNestGeocacheConfig()Lco/bird/android/model/wire/configs/MapGeocacheConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientNestGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    return-object v0
.end method

.method public final getClientZoneGeocacheConfig()Lco/bird/android/model/wire/configs/MapGeocacheConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientZoneGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    return-object v0
.end method

.method public final getClustering()Lco/bird/android/model/wire/configs/ClusteringConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clustering:Lco/bird/android/model/wire/configs/ClusteringConfig;

    return-object v0
.end method

.method public final getEnableOptimizedMapRenderer()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableOptimizedMapRenderer:Z

    return v0
.end method

.method public final getEnableUserLocationV2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableUserLocationV2:Z

    return v0
.end method

.method public final getMaxAutoselectMerchantDistance()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->maxAutoselectMerchantDistance:Ljava/lang/Double;

    return-object v0
.end method

.method public final getOperationalZoneInversion()Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->operationalZoneInversion:Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;

    return-object v0
.end method

.method public final getPoiAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->poiAnnotations:Ljava/util/List;

    return-object v0
.end method

.method public final getRiderShowAreasBeforeSelectingVehicle()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->riderShowAreasBeforeSelectingVehicle:Z

    return v0
.end method

.method public final getScanButtonShape()Lco/bird/android/model/constant/ScanButtonShape;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonShape:Lco/bird/android/model/constant/ScanButtonShape;

    return-object v0
.end method

.method public final getScanButtonStyle()Lco/bird/android/model/constant/ScanButtonStyle;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonStyle:Lco/bird/android/model/constant/ScanButtonStyle;

    return-object v0
.end method

.method public final getShowBatteryPercent()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showBatteryPercent:Z

    return v0
.end method

.method public final getShowGroupRideButton()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showGroupRideButton:Z

    return v0
.end method

.method public final getShowRangeInsteadOfBatteryPercentage()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showRangeInsteadOfBatteryPercentage:Z

    return v0
.end method

.method public final getZoneColorOverride()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->zoneColorOverride:Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showBatteryPercent:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showRangeInsteadOfBatteryPercentage:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableUserLocationV2:Z

    if-eqz v2, :cond_2

    move v2, v1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->poiAnnotations:Ljava/util/List;

    const/4 v3, 0x0

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->maxAutoselectMerchantDistance:Ljava/lang/Double;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonStyle:Lco/bird/android/model/constant/ScanButtonStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonShape:Lco/bird/android/model/constant/ScanButtonShape;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showGroupRideButton:Z

    if-eqz v2, :cond_5

    move v2, v1

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clustering:Lco/bird/android/model/wire/configs/ClusteringConfig;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/ClusteringConfig;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->operationalZoneInversion:Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_3

    :cond_7
    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->zoneColorOverride:Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_4

    :cond_8
    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableOptimizedMapRenderer:Z

    if-eqz v2, :cond_9

    move v2, v1

    :cond_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->riderShowAreasBeforeSelectingVehicle:Z

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    move v1, v2

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientBirdGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    if-nez v1, :cond_b

    move v1, v3

    goto :goto_6

    :cond_b
    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientZoneGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    if-nez v1, :cond_c

    move v1, v3

    goto :goto_7

    :cond_c
    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientNestGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    if-nez v1, :cond_d

    goto :goto_8

    :cond_d
    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showBatteryPercent:Z

    iget-boolean v2, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showRangeInsteadOfBatteryPercentage:Z

    iget-boolean v3, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableUserLocationV2:Z

    iget-object v4, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->poiAnnotations:Ljava/util/List;

    iget-object v5, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->maxAutoselectMerchantDistance:Ljava/lang/Double;

    iget-object v6, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonStyle:Lco/bird/android/model/constant/ScanButtonStyle;

    iget-object v7, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->scanButtonShape:Lco/bird/android/model/constant/ScanButtonShape;

    iget-boolean v8, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->showGroupRideButton:Z

    iget-object v9, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clustering:Lco/bird/android/model/wire/configs/ClusteringConfig;

    iget-object v10, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->operationalZoneInversion:Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;

    iget-object v11, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->zoneColorOverride:Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    iget-boolean v12, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->enableOptimizedMapRenderer:Z

    iget-boolean v13, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->riderShowAreasBeforeSelectingVehicle:Z

    iget-object v14, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientBirdGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    iget-object v15, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientZoneGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    move-object/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/model/wire/configs/MobileMapConfigView;->clientNestGeocacheConfig:Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v15

    const-string v15, "MobileMapConfigView(showBatteryPercent="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", showRangeInsteadOfBatteryPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", enableUserLocationV2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", poiAnnotations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxAutoselectMerchantDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scanButtonStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scanButtonShape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showGroupRideButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", clustering="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", operationalZoneInversion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", zoneColorOverride="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enableOptimizedMapRenderer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", riderShowAreasBeforeSelectingVehicle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", clientBirdGeocacheConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clientZoneGeocacheConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clientNestGeocacheConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
