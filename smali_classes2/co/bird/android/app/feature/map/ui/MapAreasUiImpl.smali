.class public final Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;
.super LxE;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapAreasUi;
.implements Lco/bird/android/app/feature/map/ui/MapZonesUi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$Companion;,
        Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u008f\u0001BE\u0012\u0008\u0010\u008a\u0001\u001a\u00030\u0089\u0001\u0012\u0006\u0010A\u001a\u00020!\u0012\u0008\u0010\u008c\u0001\u001a\u00030\u008b\u0001\u0012\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010C\u0012\n\u0008\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\u0006\u0010J\u001a\u00020I\u00a2\u0006\u0006\u0008\u008d\u0001\u0010\u008e\u0001J\u001e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J2\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\rH\u0002J\u0014\u0010\u001b\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J7\u0010\u001f\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0014\u0010$\u001a\u00020\u0007*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010)\u001a\u00020\u00072\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00040\'H\u0002J\u0008\u0010*\u001a\u00020\u0007H\u0002J\u001c\u0010\u0008\u001a\u00020\u0007*\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\"H\u0002J\u0016\u0010-\u001a\u00020\u00072\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\n0\'H\u0016J\u000e\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\n0.H\u0016J\u0016\u00100\u001a\u00020\u00072\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00040\'H\u0016J\u001e\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u001c2\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00040\'H\u0016J,\u00104\u001a&\u0012\u000c\u0012\n 3*\u0004\u0018\u00010\u00070\u0007 3*\u0012\u0012\u000c\u0012\n 3*\u0004\u0018\u00010\u00070\u0007\u0018\u00010.0.H\u0016J\u0010\u00105\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0016J\u001a\u00107\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u00106\u001a\u0004\u0018\u00010\"H\u0016J\u0008\u00108\u001a\u00020\u0007H\u0016J \u0010:\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\'H\u0016J\u0014\u0010<\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040;0.H\u0016J)\u0010?\u001a\u00020\u0004*\u00020\u00042\n\u0008\u0002\u0010=\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008?\u0010@R\u0014\u0010A\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0016\u0010D\u001a\u0004\u0018\u00010C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0016\u0010G\u001a\u0004\u0018\u00010F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\"\u00104\u001a\u0010\u0012\u000c\u0012\n 3*\u0004\u0018\u00010\u00070\u00070L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u0010MR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u00040N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR.\u0010S\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 3*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010;0;0R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR \u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020Z0N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010QR\u001b\u0010a\u001a\u00020\\8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008]\u0010^\u001a\u0004\u0008_\u0010`R\u001b\u0010d\u001a\u00020\\8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008b\u0010^\u001a\u0004\u0008c\u0010`R\u001b\u0010g\u001a\u00020\\8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008e\u0010^\u001a\u0004\u0008f\u0010`R\u0016\u0010h\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR \u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00120j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR\u001a\u0010n\u001a\u0008\u0012\u0004\u0012\u00020O0m8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008n\u0010oR \u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010lRF\u0010s\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\' 3*\u0016\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\'\u0018\u00010r0r0q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008s\u0010tR.\u0010u\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 3*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\'0\'0L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010MR\"\u0010v\u001a\u0010\u0012\u000c\u0012\n 3*\u0004\u0018\u00010\u00040\u00040L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008v\u0010MR\"\u0010w\u001a\u0010\u0012\u000c\u0012\n 3*\u0004\u0018\u00010\n0\n0L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010MR\u001b\u0010=\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008x\u0010^\u001a\u0004\u0008y\u0010zR\u001b\u0010>\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008{\u0010^\u001a\u0004\u0008|\u0010zR\u001d\u0010\u0081\u0001\u001a\u00020}8BX\u0082\u0084\u0002\u00a2\u0006\r\n\u0004\u0008~\u0010^\u001a\u0005\u0008\u007f\u0010\u0080\u0001R\u001a\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u0004\u0018\u00010\r8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0086\u0001\u0010\u0087\u0001\u00a8\u0006\u0092\u0001\u00b2\u0006\u000e\u0010\u0091\u0001\u001a\u00030\u0090\u00018\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;",
        "LxE;",
        "Lco/bird/android/app/feature/map/ui/MapAreasUi;",
        "Lco/bird/android/app/feature/map/ui/MapZonesUi;",
        "Lco/bird/android/model/persistence/Area;",
        "area",
        "Lkotlin/Function0;",
        "",
        "showInfoWindow",
        "handleAreaClick",
        "Lco/bird/android/model/persistence/ZonePolygonable;",
        "zone",
        "handleZoneClick",
        "",
        "isDemandAreaWithSelectedOverlay",
        "",
        "zoomLevel",
        "maybeFlipAreaLabels",
        "LPT;",
        "bitmapDescriptor",
        "selected",
        "visible",
        "Lio/reactivex/p;",
        "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
        "getGroundOverlayOptions",
        "",
        "alpha",
        "updateAlpha",
        "",
        "iconRes",
        "color",
        "toBitmapDescriptor",
        "(Ljava/lang/String;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)LPT;",
        "LcD1;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "point",
        "showInfoWindowForOutsideAreas",
        "toolTipMarkerIcon",
        "getCapZoneAreaMarkerIcon",
        "",
        "areas",
        "setAreaMarkers",
        "removeAllAreaMarkers",
        "at",
        "zones",
        "setZones",
        "Lio/reactivex/Observable;",
        "zoneClicks",
        "setAreas",
        "key",
        "setAdditionalAreas",
        "kotlin.jvm.PlatformType",
        "setAreasCompleteChanges",
        "showInfoWindowForNonOperationalArea",
        "closestTo",
        "showInfoWindowForArea",
        "hideInfoWindow",
        "viewport",
        "updateAreasUi",
        "Lco/bird/android/buava/Optional;",
        "selectedAreaMarker",
        "operationalAreaFillColorOverride",
        "operationalAreaBorderColorOverride",
        "flavorAdjustedArea",
        "(Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/persistence/Area;",
        "map",
        "LcD1;",
        "LTq4;",
        "reactiveConfig",
        "LTq4;",
        "LOh;",
        "appBuildConfig",
        "LOh;",
        "Ldr4;",
        "locationManager",
        "Ldr4;",
        "Lma4;",
        "Lma4;",
        "",
        "LfM2;",
        "areaMarkers",
        "Ljava/util/Map;",
        "Lio/reactivex/subjects/a;",
        "currentlySelectedMarkerArea",
        "Lio/reactivex/subjects/a;",
        "LDp6;",
        "areaMarkerView",
        "LDp6;",
        "invisibleInfoWindowMarker",
        "LfM2;",
        "LfE1;",
        "areaGroundOverlay",
        "Landroidx/appcompat/widget/AppCompatTextView;",
        "demandAreaLabelTextView$delegate",
        "Lkotlin/Lazy;",
        "getDemandAreaLabelTextView",
        "()Landroidx/appcompat/widget/AppCompatTextView;",
        "demandAreaLabelTextView",
        "areaLabelTextView$delegate",
        "getAreaLabelTextView",
        "areaLabelTextView",
        "rebalanceLabelTextView$delegate",
        "getRebalanceLabelTextView",
        "rebalanceLabelTextView",
        "labelsVisible",
        "Z",
        "Landroid/util/LruCache;",
        "bitmapCache",
        "Landroid/util/LruCache;",
        "",
        "areaLabelMarkers",
        "Ljava/util/List;",
        "groundOverlayOptionsCache",
        "LAG;",
        "",
        "additionalAreasToRender",
        "LAG;",
        "addLabelsToAreasRelay",
        "demandAreaClickRelay",
        "zonePolygonableClicks",
        "operationalAreaFillColorOverride$delegate",
        "getOperationalAreaFillColorOverride",
        "()I",
        "operationalAreaBorderColorOverride$delegate",
        "getOperationalAreaBorderColorOverride",
        "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;",
        "polygonableRenderer$delegate",
        "getPolygonableRenderer",
        "()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;",
        "polygonableRenderer",
        "Lco/bird/android/model/wire/configs/MobileMapConfigView;",
        "getMapConfig",
        "()Lco/bird/android/model/wire/configs/MobileMapConfigView;",
        "mapConfig",
        "getEnableOptimizedMapRenderer",
        "()Ljava/lang/Boolean;",
        "enableOptimizedMapRenderer",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;LOh;Ldr4;)V",
        "Companion",
        "Landroid/location/Location;",
        "center",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMapAreasUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,681:1\n180#2:682\n180#2:683\n180#2:684\n180#2:686\n237#2:687\n44#3:685\n1549#4:688\n1620#4,3:689\n1549#4:697\n1620#4,3:698\n1855#4,2:703\n766#4:705\n857#4,2:706\n1#5:692\n125#6:693\n152#6,3:694\n215#6,2:710\n1295#7,2:701\n1295#7,2:708\n*S KotlinDebug\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiImpl\n*L\n160#1:682\n172#1:683\n177#1:684\n215#1:686\n275#1:687\n215#1:685\n309#1:688\n309#1:689,3\n334#1:697\n334#1:698,3\n407#1:703,2\n528#1:705\n528#1:706,2\n329#1:693\n329#1:694,3\n546#1:710,2\n397#1:701,2\n530#1:708,2\n*E\n"
    }
.end annotation


# static fields
.field private static final ANIMATION_DURATION:I = 0x190

.field public static final Companion:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$Companion;

.field private static final DEFAULT_AREA_FILL_ALPHA:F = 0.2f

.field private static final DEMAND_AREA_LABEL_VISIBLE_ZOOM_LEVEL_THRESHOLD:F = 16.0f

.field private static final VARIABLE_FEE_AREA_LABEL_VISIBLE_ZOOM_THRESHOLD:F = 13.0f


# instance fields
.field private final addLabelsToAreasRelay:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;>;"
        }
    .end annotation
.end field

.field private final additionalAreasToRender:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final appBuildConfig:LOh;

.field private final areaGroundOverlay:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lco/bird/android/model/persistence/Area;",
            "LfE1;",
            ">;"
        }
    .end annotation
.end field

.field private final areaLabelMarkers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LfM2;",
            ">;"
        }
    .end annotation
.end field

.field private final areaLabelTextView$delegate:Lkotlin/Lazy;

.field private areaMarkerView:LDp6;

.field private final areaMarkers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LfM2;",
            "Lco/bird/android/model/persistence/Area;",
            ">;"
        }
    .end annotation
.end field

.field private final bitmapCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "LPT;",
            ">;"
        }
    .end annotation
.end field

.field private final currentlySelectedMarkerArea:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/Area;",
            ">;>;"
        }
    .end annotation
.end field

.field private final demandAreaClickRelay:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/model/persistence/Area;",
            ">;"
        }
    .end annotation
.end field

.field private final demandAreaLabelTextView$delegate:Lkotlin/Lazy;

.field private final groundOverlayOptionsCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
            ">;"
        }
    .end annotation
.end field

.field private invisibleInfoWindowMarker:LfM2;

.field private labelsVisible:Z

.field private final locationManager:Ldr4;

.field private final map:LcD1;

.field private final operationalAreaBorderColorOverride$delegate:Lkotlin/Lazy;

.field private final operationalAreaFillColorOverride$delegate:Lkotlin/Lazy;

.field private final polygonableRenderer$delegate:Lkotlin/Lazy;

.field private final reactiveConfig:LTq4;

.field private final rebalanceLabelTextView$delegate:Lkotlin/Lazy;

.field private final setAreasCompleteChanges:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final zonePolygonableClicks:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lco/bird/android/model/persistence/ZonePolygonable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->Companion:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$Companion;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;LOh;Ldr4;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveMapEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->map:LcD1;

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->reactiveConfig:LTq4;

    iput-object p5, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->appBuildConfig:LOh;

    iput-object p6, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->locationManager:Ldr4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p2

    const-string p4, "create<Unit>()"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->setAreasCompleteChanges:Lma4;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaMarkers:Ljava/util/Map;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p2

    const-string p4, "create<Optional<Area>>()"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->currentlySelectedMarkerArea:Lio/reactivex/subjects/a;

    new-instance p4, Ljava/util/LinkedHashMap;

    invoke-direct {p4}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaGroundOverlay:Ljava/util/Map;

    new-instance p4, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$demandAreaLabelTextView$2;

    invoke-direct {p4, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$demandAreaLabelTextView$2;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-static {p4}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p4

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->demandAreaLabelTextView$delegate:Lkotlin/Lazy;

    new-instance p4, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$areaLabelTextView$2;

    invoke-direct {p4, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$areaLabelTextView$2;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-static {p4}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p4

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaLabelTextView$delegate:Lkotlin/Lazy;

    new-instance p4, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$rebalanceLabelTextView$2;

    invoke-direct {p4, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$rebalanceLabelTextView$2;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-static {p4}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p4

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->rebalanceLabelTextView$delegate:Lkotlin/Lazy;

    new-instance p4, Landroid/util/LruCache;

    const/16 p5, 0x80

    invoke-direct {p4, p5}, Landroid/util/LruCache;-><init>(I)V

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->bitmapCache:Landroid/util/LruCache;

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaLabelMarkers:Ljava/util/List;

    new-instance p4, Landroid/util/LruCache;

    invoke-direct {p4, p5}, Landroid/util/LruCache;-><init>(I)V

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->groundOverlayOptionsCache:Landroid/util/LruCache;

    invoke-static {}, LAG;->g()LAG;

    move-result-object p4

    const-string p5, "create<Map<String, List<Area>>>()"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->additionalAreasToRender:LAG;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p4

    const-string p5, "create<List<Area>>()"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->addLabelsToAreasRelay:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p5

    const-string p6, "create<Area>()"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->demandAreaClickRelay:Lma4;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object p6

    const-string v0, "create<ZonePolygonable>()"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p6, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->zonePolygonableClicks:Lma4;

    new-instance p6, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$operationalAreaFillColorOverride$2;

    invoke-direct {p6, p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$operationalAreaFillColorOverride$2;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-static {p6}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p6

    iput-object p6, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->operationalAreaFillColorOverride$delegate:Lkotlin/Lazy;

    new-instance p6, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$operationalAreaBorderColorOverride$2;

    invoke-direct {p6, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$operationalAreaBorderColorOverride$2;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-static {p6}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p6

    iput-object p6, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->operationalAreaBorderColorOverride$delegate:Lkotlin/Lazy;

    new-instance p6, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;

    invoke-direct {p6, p0, p3, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$polygonableRenderer$2;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-static {p6}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p6

    iput-object p6, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->polygonableRenderer$delegate:Lkotlin/Lazy;

    invoke-interface {p3}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->infoWindowCloses()Lio/reactivex/Observable;

    move-result-object p6

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p6, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p6

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p6, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$1;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$1;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V

    new-instance v2, LXJ2;

    invoke-direct {v2, v1}, LXJ2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p6, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p3}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->markerClicks()Lio/reactivex/Observable;

    move-result-object p3

    new-instance p6, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$2;

    invoke-direct {p6, p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$2;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V

    invoke-static {p3, p6}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object p3

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p6

    invoke-virtual {p3, p6}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p6, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$3;

    invoke-direct {p6, p2}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$3;-><init>(Ljava/lang/Object;)V

    new-instance p2, LbK2;

    invoke-direct {p2, p6}, LbK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p3, p2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getPolygonableRenderer()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->polygonClicks()Lio/reactivex/Observable;

    move-result-object p2

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p2

    const-string p3, "polygonableRenderer.poly\u2026dSchedulers.mainThread())"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p3, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4;

    invoke-direct {p3, p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$4;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V

    new-instance p6, LcK2;

    invoke-direct {p6, p3}, LcK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p2, p6}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    new-instance p2, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$5;

    invoke-direct {p2, p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$5;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V

    new-instance p3, LdK2;

    invoke-direct {p3, p2}, LdK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p5, p3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p2

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p2

    new-instance p3, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$6;

    invoke-direct {p3, p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$6;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V

    new-instance p5, LeK2;

    invoke-direct {p5, p3}, LeK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p2

    new-instance p3, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$7;

    invoke-direct {p3, p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$7;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V

    new-instance p5, LfK2;

    invoke-direct {p5, p3}, LfK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p5}, Lio/reactivex/Observable;->flatMapMaybe(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p2

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p2

    const-string p3, "demandAreaClickRelay\n   \u2026dSchedulers.mainThread())"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p3

    const-string p5, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p3, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$8;

    invoke-direct {p3, p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$8;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V

    new-instance p5, LgK2;

    invoke-direct {p5, p3}, LgK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p2, p5}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    sget-object p2, Lio/reactivex/b;->f:Lio/reactivex/b;

    invoke-virtual {p4, p2}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object p2

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/k;->s0(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object p2

    new-instance p3, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$9;

    invoke-direct {p3, p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$9;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V

    new-instance p4, LhK2;

    invoke-direct {p4, p3}, LhK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p4}, Lio/reactivex/k;->K(Lio/reactivex/functions/g;)Lio/reactivex/k;

    move-result-object p2

    new-instance p3, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$10;

    invoke-direct {p3, p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$10;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V

    new-instance p4, LiK2;

    invoke-direct {p4, p3}, LiK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p4}, Lio/reactivex/k;->W(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p2

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/reactivex/k;->s0(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object p2

    new-instance p3, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$11;

    invoke-direct {p3, p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$11;-><init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V

    new-instance p4, LYJ2;

    invoke-direct {p4, p3}, LYJ2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p4}, Lio/reactivex/k;->K(Lio/reactivex/functions/g;)Lio/reactivex/k;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/k;->k0()Lio/reactivex/c;

    move-result-object p2

    sget-object p3, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$12;->INSTANCE:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$12;

    new-instance p4, LaK2;

    invoke-direct {p4, p3}, LaK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p4}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/c;->T()Lio/reactivex/c;

    move-result-object p2

    const-string p3, "addLabelsToAreasRelay\n  \u2026request\")}\n      .retry()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;LOh;Ldr4;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p4

    :goto_0
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, p5

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v8, p6

    invoke-direct/range {v2 .. v8}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;LOh;Ldr4;)V

    return-void
.end method

.method public static synthetic Pl(LPT;Lco/bird/android/model/persistence/Area;ZZLco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Lcom/google/android/gms/maps/model/GroundOverlayOptions;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getGroundOverlayOptions$lambda$21(LPT;Lco/bird/android/model/persistence/Area;ZZLco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Lcom/google/android/gms/maps/model/GroundOverlayOptions;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ql(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->_init_$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Rl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->_init_$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Sl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->_init_$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic Tl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->_init_$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Ul(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->_init_$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Vl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->_init_$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Wl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->_init_$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Xl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->_init_$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Yl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->_init_$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Zl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->_init_$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final _init_$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method private static final _init_$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lna4;

    return-object p0
.end method

.method private static final _init_$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getAreaGroundOverlay$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaGroundOverlay:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getAreaLabelMarkers$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaLabelMarkers:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getAreaMarkers$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaMarkers:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getCurrentlySelectedMarkerArea$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->currentlySelectedMarkerArea:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$getGroundOverlayOptions(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/model/persistence/Area;LPT;ZZ)Lio/reactivex/p;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getGroundOverlayOptions(Lco/bird/android/model/persistence/Area;LPT;ZZ)Lio/reactivex/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getInvisibleInfoWindowMarker$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)LfM2;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->invisibleInfoWindowMarker:LfM2;

    return-object p0
.end method

.method public static final synthetic access$getLocationManager$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Ldr4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->locationManager:Ldr4;

    return-object p0
.end method

.method public static final synthetic access$getMap$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)LcD1;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->map:LcD1;

    return-object p0
.end method

.method public static final synthetic access$getMapConfig(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Lco/bird/android/model/wire/configs/MobileMapConfigView;
    .locals 0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)LTq4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->reactiveConfig:LTq4;

    return-object p0
.end method

.method public static final synthetic access$handleAreaClick(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/model/persistence/Area;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->handleAreaClick(Lco/bird/android/model/persistence/Area;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final synthetic access$handleZoneClick(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/model/persistence/ZonePolygonable;)V
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->handleZoneClick(Lco/bird/android/model/persistence/ZonePolygonable;)V

    return-void
.end method

.method public static final synthetic access$setLabelsVisible$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->labelsVisible:Z

    return-void
.end method

.method public static final synthetic access$showInfoWindow(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;LcD1;Lco/bird/android/model/persistence/Area;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->showInfoWindow(LcD1;Lco/bird/android/model/persistence/Area;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public static final synthetic access$toBitmapDescriptor(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Ljava/lang/String;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)LPT;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->toBitmapDescriptor(Ljava/lang/String;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)LPT;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateAlpha(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;IF)I
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->updateAlpha(IF)I

    move-result p0

    return p0
.end method

.method public static synthetic am(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->_init_$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic flavorAdjustedArea$default(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lco/bird/android/model/persistence/Area;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->flavorAdjustedArea(Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/persistence/Area;

    move-result-object p0

    return-object p0
.end method

.method private final getAreaLabelTextView()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaLabelTextView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatTextView;

    return-object v0
.end method

.method private final getCapZoneAreaMarkerIcon(Lco/bird/android/model/persistence/Area;)LPT;
    .locals 10

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaMarkerView:LDp6;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, LDp6;->c(Landroid/view/LayoutInflater;)LDp6;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaMarkerView:LDp6;

    const-string v1, "inflate(activity.layoutI\u2026areaMarkerView = it\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iget-object v1, v0, LDp6;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getReleaseCapacity()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, ""

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p1}, Lio;->d(Lco/bird/android/model/persistence/Area;)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "view.icon"

    if-eqz v1, :cond_2

    iget-object v3, v0, LDp6;->c:Landroid/widget/ImageView;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_2
    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    invoke-static {p1, v1}, Lio;->e(Lco/bird/android/model/persistence/Area;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v4, v0, LDp6;->c:Landroid/widget/ImageView;

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_3
    move-object v1, v3

    :goto_1
    if-nez v1, :cond_4

    iget-object v1, v0, LDp6;->c:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_4
    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    invoke-static {p1, v1}, Lio;->c(Lco/bird/android/model/persistence/Area;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v1, v0, LDp6;->c:Landroid/widget/ImageView;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    :cond_5
    move-object p1, v3

    :goto_2
    if-nez p1, :cond_6

    iget-object p1, v0, LDp6;->c:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_6
    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v4

    invoke-virtual {v0}, LDp6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v5

    const-string p1, "view.root"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LfB0;->iconBitmapDescriptor$default(Landroid/content/Context;Landroid/view/View;Landroid/graphics/drawable/Drawable;LAP1;ILjava/lang/Object;)LPT;

    move-result-object p1

    return-object p1
.end method

.method private final getDemandAreaLabelTextView()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->demandAreaLabelTextView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatTextView;

    return-object v0
.end method

.method private final getEnableOptimizedMapRenderer()Ljava/lang/Boolean;
    .locals 3

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/core/mvp/BaseActivity;->Q()LJy;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->reactiveConfig:LTq4;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getMap()Lco/bird/android/model/wire/configs/OperatorMapConfig;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorMapConfig;->getEnableOptimizedMapRenderer()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->reactiveConfig:LTq4;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getEnableOptimizedMapRenderer()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    :cond_2
    :goto_0
    return-object v2
.end method

.method private final getGroundOverlayOptions(Lco/bird/android/model/persistence/Area;LPT;ZZ)Lio/reactivex/p;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/Area;",
            "LPT;",
            "ZZ)",
            "Lio/reactivex/p<",
            "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
            ">;"
        }
    .end annotation

    new-instance v6, LZJ2;

    move-object v0, v6

    move-object v1, p2

    move-object v2, p1

    move v3, p3

    move v4, p4

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, LZJ2;-><init>(LPT;Lco/bird/android/model/persistence/Area;ZZLco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V

    invoke-static {v6}, Lio/reactivex/p;->D(Ljava/util/concurrent/Callable;)Lio/reactivex/p;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/p;->T(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object p1

    const-string p2, "fromCallable<GroundOverl\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic getGroundOverlayOptions$default(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/model/persistence/Area;LPT;ZZILjava/lang/Object;)Lio/reactivex/p;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getGroundOverlayOptions(Lco/bird/android/model/persistence/Area;LPT;ZZ)Lio/reactivex/p;

    move-result-object p0

    return-object p0
.end method

.method private static final getGroundOverlayOptions$lambda$21(LPT;Lco/bird/android/model/persistence/Area;ZZLco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Lcom/google/android/gms/maps/model/GroundOverlayOptions;
    .locals 3

    const-string v0, "$area"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p4, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->groundOverlayOptionsCache:Landroid/util/LruCache;

    invoke-virtual {v2, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/maps/model/GroundOverlayOptions;

    if-nez v2, :cond_2

    invoke-static {p1, p0, p2, p3}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->groundOverLayOptions(Lco/bird/android/model/persistence/Area;LPT;ZZ)Lcom/google/android/gms/maps/model/GroundOverlayOptions;

    move-result-object p0

    if-eqz p0, :cond_1

    iget-object p1, p4, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->groundOverlayOptionsCache:Landroid/util/LruCache;

    invoke-virtual {p1, v1, p0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p0

    :cond_1
    move-object v2, v0

    :cond_2
    return-object v2
.end method

.method private final getMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;
    .locals 3

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/core/mvp/BaseActivity;->Q()LJy;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->reactiveConfig:LTq4;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getChargerMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->reactiveConfig:LTq4;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v2

    :cond_2
    :goto_0
    return-object v2
.end method

.method private final getOperationalAreaBorderColorOverride()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->operationalAreaBorderColorOverride$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private final getOperationalAreaFillColorOverride()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->operationalAreaFillColorOverride$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private final getPolygonableRenderer()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->polygonableRenderer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    return-object v0
.end method

.method private final getRebalanceLabelTextView()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->rebalanceLabelTextView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatTextView;

    return-object v0
.end method

.method private final handleAreaClick(Lco/bird/android/model/persistence/Area;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/Area;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->isDemandAreaWithSelectedOverlay(Lco/bird/android/model/persistence/Area;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->demandAreaClickRelay:Lma4;

    invoke-virtual {p2, p1}, Lma4;->accept(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->currentlySelectedMarkerArea:Lio/reactivex/subjects/a;

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->reactiveConfig:LTq4;

    invoke-static {p1, v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiKt;->access$canShowBottomSheetViaPolygonTap(Lco/bird/android/model/persistence/Area;LTq4;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->currentlySelectedMarkerArea:Lio/reactivex/subjects/a;

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method private final handleZoneClick(Lco/bird/android/model/persistence/ZonePolygonable;)V
    .locals 2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ZonePolygonable;->getSelectability()Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/OperatorMapZoneSelectability;->SELECTABLE_OVERLAY:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->zonePolygonableClicks:Lma4;

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final isDemandAreaWithSelectedOverlay(Lco/bird/android/model/persistence/Area;)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->isDemandArea()Z

    move-result v2

    if-ne v2, v0, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getSelectedOverlayLabel()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    return v0
.end method

.method private final maybeFlipAreaLabels(F)V
    .locals 6

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaGroundOverlay:Ljava/util/Map;

    invoke-static {v0}, Lkotlin/collections/MapsKt;->asSequence(Ljava/util/Map;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/Area;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LfE1;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/Area;->getOverlayMinZoomLevel()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    int-to-float v5, v5

    cmpl-float v5, p1, v5

    if-lez v5, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    invoke-virtual {v1, v5}, LfE1;->i(Z)V

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_0

    invoke-virtual {v4}, Lco/bird/android/model/persistence/Area;->isDemandArea()Z

    move-result v4

    if-eqz v4, :cond_0

    const/high16 v4, 0x41800000    # 16.0f

    cmpl-float v4, p1, v4

    if-lez v4, :cond_3

    goto :goto_3

    :cond_3
    move v2, v3

    :goto_3
    invoke-virtual {v1, v2}, LfE1;->i(Z)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaLabelMarkers:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LfM2;

    const/high16 v4, 0x41500000    # 13.0f

    cmpl-float v4, p1, v4

    if-lez v4, :cond_5

    move v4, v2

    goto :goto_5

    :cond_5
    move v4, v3

    :goto_5
    invoke-virtual {v1, v4}, LfM2;->r(Z)V

    goto :goto_4

    :cond_6
    return-void
.end method

.method private final removeAllAreaMarkers()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaMarkers:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LfM2;

    invoke-virtual {v1}, LfM2;->f()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaMarkers:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method private final setAreaMarkers(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->removeAllAreaMarkers()V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/Area;->popupInvocationMethod()Lco/bird/android/model/constant/PopupInvocationMethod;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/PopupInvocationMethod;->MAP_MARKER:Lco/bird/android/model/constant/PopupInvocationMethod;

    if-ne v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Area;->getCenterPoint()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Lco/bird/android/model/persistence/Area;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v1

    invoke-static {v1}, LJX3;->a(Lco/bird/android/model/Polygon;)Lco/bird/android/model/Point;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v3, v1, Lco/bird/android/model/Point;->y:D

    iget-wide v5, v1, Lco/bird/android/model/Point;->x:D

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    :goto_3
    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->map:LcD1;

    new-instance v3, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v3}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->toolTipMarkerIcon(Lco/bird/android/model/persistence/Area;)LPT;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    const/high16 v4, 0x3f000000    # 0.5f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    invoke-virtual {v1, v2}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, LfM2;->p(Ljava/lang/Object;)V

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->areaMarkers:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    return-void
.end method

.method private final showInfoWindow(LcD1;Lco/bird/android/model/persistence/Area;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 5

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->reactiveConfig:LTq4;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getZoneColorOverride()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {p2, v0}, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTagKt;->toPolygonTag(Lco/bird/android/model/persistence/Area;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;)Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->invisibleInfoWindowMarker:LfM2;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LfM2;->e()Z

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    move v3, v4

    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->hideInfoWindow()V

    iput-object v1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->invisibleInfoWindowMarker:LfM2;

    return-void

    :cond_2
    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v2

    sget v3, Lrg4;->ic_hidden_marker:I

    invoke-static {v2, v3}, LfB0;->e(Landroid/content/Context;I)LPT;

    move-result-object v2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Area;->getNotes()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v4}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Area;->toolTipTitle()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Lcom/google/android/gms/maps/model/MarkerOptions;->L1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p2

    invoke-virtual {p2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->J1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p2

    invoke-virtual {p1, p2}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1, v0}, LfM2;->p(Ljava/lang/Object;)V

    :goto_1
    if-eqz p1, :cond_4

    invoke-virtual {p1}, LfM2;->t()V

    :cond_4
    iget-object p2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->map:LcD1;

    invoke-static {p3}, Lrc0;->b(Lcom/google/android/gms/maps/model/LatLng;)Lqc0;

    move-result-object p3

    const/16 v0, 0x190

    invoke-virtual {p2, p3, v0, v1}, LcD1;->g(Lqc0;ILcD1$a;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->invisibleInfoWindowMarker:LfM2;

    return-void
.end method

.method private final showInfoWindowForOutsideAreas(LcD1;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->invisibleInfoWindowMarker:LfM2;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LfM2;->e()Z

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    move v2, v3

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->hideInfoWindow()V

    const/4 v1, 0x0

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->invisibleInfoWindowMarker:LfM2;

    return-void

    :cond_1
    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lrg4;->ic_hidden_marker:I

    invoke-static {v1, v2}, LfB0;->e(Landroid/content/Context;I)LPT;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v3

    sget v4, Lnl4;->outside_service_area_tooltip_title:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->L1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v3

    sget v5, Lnl4;->outside_service_area_tooltip_body:I

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->J1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    move-object/from16 v2, p2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;

    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xfec

    const/16 v20, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v20}, Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v2}, LfM2;->p(Ljava/lang/Object;)V

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {v1}, LfM2;->t()V

    :cond_3
    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->invisibleInfoWindowMarker:LfM2;

    return-void
.end method

.method private final toBitmapDescriptor(Ljava/lang/String;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)LPT;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    const/4 v3, 0x0

    if-eqz v2, :cond_2

    return-object v3

    :cond_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Area;->isDemandArea()Z

    move-result v2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Area;->getOverlayIcon()Lco/bird/android/model/constant/AreaIconType;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/AreaIconType;->REBALANCE:Lco/bird/android/model/constant/AreaIconType;

    if-ne v4, v5, :cond_3

    move v0, v1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->bitmapCache:Landroid/util/LruCache;

    invoke-virtual {v1, v0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LPT;

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Area;->isDemandArea()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getDemandAreaLabelTextView()Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object p2

    if-eqz p4, :cond_6

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-static {p4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Area;->getOverlayIcon()Lco/bird/android/model/constant/AreaIconType;

    move-result-object p2

    if-ne p2, v5, :cond_7

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getRebalanceLabelTextView()Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object p2

    :cond_6
    :goto_2
    move-object v5, p2

    goto :goto_3

    :cond_7
    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getAreaLabelTextView()Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object p2

    if-eqz p4, :cond_6

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-static {p4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_2

    :goto_3
    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p3, :cond_8

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v5, p1, v3, v3, v3}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_8
    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LfB0;->iconBitmapDescriptor$default(Landroid/content/Context;Landroid/view/View;Landroid/graphics/drawable/Drawable;LAP1;ILjava/lang/Object;)LPT;

    move-result-object v1

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->bitmapCache:Landroid/util/LruCache;

    invoke-virtual {p1, v0, v1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4
    return-object v1
.end method

.method public static synthetic toBitmapDescriptor$default(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Ljava/lang/String;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    move-object p4, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->toBitmapDescriptor(Ljava/lang/String;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)LPT;

    move-result-object p0

    return-object p0
.end method

.method private final toolTipMarkerIcon(Lco/bird/android/model/persistence/Area;)LPT;
    .locals 1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->isReleaseConstrained()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getCapZoneAreaMarkerIcon(Lco/bird/android/model/persistence/Area;)LPT;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final updateAlpha(IF)I
    .locals 1

    const/16 v0, 0xff

    int-to-float v0, v0

    mul-float/2addr p2, v0

    float-to-int p2, p2

    const v0, 0xffffff

    and-int/2addr p1, v0

    shl-int/lit8 p2, p2, 0x18

    or-int/2addr p1, p2

    return p1
.end method

.method private static final updateAreasUi$lambda$14(Lkotlin/Lazy;)Landroid/location/Location;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "+",
            "Landroid/location/Location;",
            ">;)",
            "Landroid/location/Location;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/location/Location;

    return-object p0
.end method


# virtual methods
.method public final flavorAdjustedArea(Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/persistence/Area;
    .locals 57

    const-string v0, "<this>"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->appBuildConfig:LOh;

    if-eqz v2, :cond_0

    invoke-interface {v2}, LOh;->f()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "bird"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/Area;->isOperationalInverse()Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/Area;->getOperational()Z

    move-result v2

    if-eqz v2, :cond_5

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    if-eqz p2, :cond_3

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    move-result v21

    goto :goto_1

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/Area;->getColor()I

    move-result v21

    :goto_1
    const/16 v22, 0x0

    if-eqz p3, :cond_4

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Integer;->intValue()I

    move-result v23

    goto :goto_2

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/Area;->getBorderColor()I

    move-result v23

    :goto_2
    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const v54, -0x280001

    const v55, 0xfffff

    const/16 v56, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v56}, Lco/bird/android/model/persistence/Area;->copy$default(Lco/bird/android/model/persistence/Area;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;IILjava/lang/Object;)Lco/bird/android/model/persistence/Area;

    move-result-object v1

    :cond_5
    :goto_3
    return-object v1
.end method

.method public hideInfoWindow()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->invisibleInfoWindowMarker:LfM2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LfM2;->d()V

    :cond_0
    return-void
.end method

.method public selectedAreaMarker()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/Area;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->currentlySelectedMarkerArea:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "currentlySelectedMarkerArea.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public setAdditionalAreas(Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getEnableOptimizedMapRenderer()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getPolygonableRenderer()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->setAdditionalPolygonable(Ljava/lang/String;Ljava/util/List;)V

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->additionalAreasToRender:LAG;

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :cond_1
    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->additionalAreasToRender:LAG;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v3, p2

    :cond_2
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {v2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :cond_5
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v1, p1}, LAG;->accept(Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public declared-synchronized setAreas(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "areas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setAreas called for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " areas"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/Area;

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getOperationalAreaFillColorOverride()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getOperationalAreaBorderColorOverride()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0, v2, v3, v4}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->flavorAdjustedArea(Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/persistence/Area;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getPolygonableRenderer()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    move-result-object v0

    invoke-virtual {v0, v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->setPolygonables(Ljava/util/List;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->setAreaMarkers(Ljava/util/List;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->addLabelsToAreasRelay:Lma4;

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setAreasCompleteChanges()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->setAreasCompleteChanges:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public setZones(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/ZonePolygonable;",
            ">;)V"
        }
    .end annotation

    const-string v0, "zones"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getPolygonableRenderer()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->setPolygonables(Ljava/util/List;)V

    return-void
.end method

.method public showInfoWindowForArea(Lco/bird/android/model/persistence/Area;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    const-string p2, "area"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->popupType()Lco/bird/android/model/constant/PopupType;

    move-result-object p2

    sget-object v0, Lco/bird/android/model/constant/PopupType;->BOTTOM_SHEET:Lco/bird/android/model/constant/PopupType;

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->currentlySelectedMarkerArea:Lio/reactivex/subjects/a;

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v0, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->currentlySelectedMarkerArea:Lio/reactivex/subjects/a;

    sget-object p2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public showInfoWindowForNonOperationalArea(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    const-string v0, "point"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->map:LcD1;

    invoke-direct {p0, v0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->showInfoWindowForOutsideAreas(LcD1;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public updateAreasUi(FLjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$updateAreasUi$center$2;

    invoke-direct {v0, p2}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$updateAreasUi$center$2;-><init>(Ljava/util/List;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    invoke-static {p2}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->updateAreasUi$lambda$14(Lkotlin/Lazy;)Landroid/location/Location;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateAreasUi with zoom level "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " and center "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->maybeFlipAreaLabels(F)V

    return-void
.end method

.method public zoneClicks()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/ZonePolygonable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->zonePolygonableClicks:Lma4;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "zonePolygonableClicks.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
