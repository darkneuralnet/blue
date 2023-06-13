.class public final Lco/bird/android/model/wire/WireRiderMapZone;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008C\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00b1\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0008\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u0010\u0008\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u0010\u0008\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u00a2\u0006\u0002\u0010!J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00c4\u0002\u0010Y\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0010\u0008\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0010\u0008\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\\2\u0008\u0010]\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010^\u001a\u00020\u0011H\u00d6\u0001J\t\u0010_\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010#R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010*R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010*R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010#R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\u0008/\u00100R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010*R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\u00084\u00100R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010*R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010*R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010*R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010*R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010*R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010:R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010*R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010*\u00a8\u0006`"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRiderMapZone;",
        "",
        "id",
        "",
        "centerPoint",
        "Lco/bird/android/model/wire/WireLocation;",
        "label",
        "colors",
        "Lco/bird/android/model/wire/WireRiderMapZoneColors;",
        "zoomBehavior",
        "mapZoneKinds",
        "",
        "Lco/bird/android/model/constant/RiderMapZoneKind;",
        "notes",
        "title",
        "customTooltipTitle",
        "noParkingFineAmount",
        "",
        "noParkingFineCurrency",
        "noParkingFineAlertTitle",
        "noParkingFineAlertMessage",
        "riderBarInRideMessageTitle",
        "riderBarInRideMessageBody",
        "riderBarInRideMessageIconType",
        "Lco/bird/android/model/constant/AreaIconType;",
        "riderBarNotInRideMessageTitle",
        "riderBarNotInRideMessageBody",
        "riderBarNotInRideMessageIconType",
        "maxSpeed",
        "partnerId",
        "areasMerged",
        "fleetIds",
        "areaKeys",
        "(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireRiderMapZoneColors;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V",
        "getAreaKeys",
        "()Ljava/util/List;",
        "getAreasMerged",
        "getCenterPoint",
        "()Lco/bird/android/model/wire/WireLocation;",
        "getColors",
        "()Lco/bird/android/model/wire/WireRiderMapZoneColors;",
        "getCustomTooltipTitle",
        "()Ljava/lang/String;",
        "getFleetIds",
        "getId",
        "getLabel",
        "getMapZoneKinds",
        "getMaxSpeed",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getNoParkingFineAlertMessage",
        "getNoParkingFineAlertTitle",
        "getNoParkingFineAmount",
        "getNoParkingFineCurrency",
        "getNotes",
        "getPartnerId",
        "getRiderBarInRideMessageBody",
        "getRiderBarInRideMessageIconType",
        "()Lco/bird/android/model/constant/AreaIconType;",
        "getRiderBarInRideMessageTitle",
        "getRiderBarNotInRideMessageBody",
        "getRiderBarNotInRideMessageIconType",
        "getRiderBarNotInRideMessageTitle",
        "getTitle",
        "getZoomBehavior",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireRiderMapZoneColors;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lco/bird/android/model/wire/WireRiderMapZone;",
        "equals",
        "",
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
.field private final areaKeys:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "area_keys"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "area_keys"
    .end annotation
.end field

.field private final areasMerged:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "areas_merged"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "areas_merged"
    .end annotation
.end field

.field private final centerPoint:Lco/bird/android/model/wire/WireLocation;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "center_point"
    .end annotation

    .annotation runtime Lft5;
        value = "center_point"
    .end annotation
.end field

.field private final colors:Lco/bird/android/model/wire/WireRiderMapZoneColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "colors"
    .end annotation

    .annotation runtime Lft5;
        value = "colors"
    .end annotation
.end field

.field private final customTooltipTitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "custom_tooltip_title"
    .end annotation

    .annotation runtime Lft5;
        value = "custom_tooltip_title"
    .end annotation
.end field

.field private final fleetIds:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fleet_ids"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "fleet_ids"
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

.field private final label:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "label"
    .end annotation

    .annotation runtime Lft5;
        value = "label"
    .end annotation
.end field

.field private final mapZoneKinds:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "map_zone_kinds"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/RiderMapZoneKind;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "map_zone_kinds"
    .end annotation
.end field

.field private final maxSpeed:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "max_speed"
    .end annotation

    .annotation runtime Lft5;
        value = "max_speed"
    .end annotation
.end field

.field private final noParkingFineAlertMessage:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "no_parking_fine_alert_message"
    .end annotation

    .annotation runtime Lft5;
        value = "no_parking_fine_alert_message"
    .end annotation
.end field

.field private final noParkingFineAlertTitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "no_parking_fine_alert_title"
    .end annotation

    .annotation runtime Lft5;
        value = "no_parking_fine_alert_title"
    .end annotation
.end field

.field private final noParkingFineAmount:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "no_parking_fine_amount"
    .end annotation

    .annotation runtime Lft5;
        value = "no_parking_fine_amount"
    .end annotation
.end field

.field private final noParkingFineCurrency:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "no_parking_fine_currency"
    .end annotation

    .annotation runtime Lft5;
        value = "no_parking_fine_currency"
    .end annotation
.end field

.field private final notes:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "notes"
    .end annotation

    .annotation runtime Lft5;
        value = "notes"
    .end annotation
.end field

.field private final partnerId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "partner_id"
    .end annotation

    .annotation runtime Lft5;
        value = "partner_id"
    .end annotation
.end field

.field private final riderBarInRideMessageBody:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rider_bar_in_ride_message_body"
    .end annotation

    .annotation runtime Lft5;
        value = "rider_bar_in_ride_message_body"
    .end annotation
.end field

.field private final riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rider_bar_in_ride_message_icon_type"
    .end annotation

    .annotation runtime Lft5;
        value = "rider_bar_in_ride_message_icon_type"
    .end annotation
.end field

.field private final riderBarInRideMessageTitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rider_bar_in_ride_message_title"
    .end annotation

    .annotation runtime Lft5;
        value = "rider_bar_in_ride_message_title"
    .end annotation
.end field

.field private final riderBarNotInRideMessageBody:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rider_bar_not_in_ride_message_body"
    .end annotation

    .annotation runtime Lft5;
        value = "rider_bar_not_in_ride_message_body"
    .end annotation
.end field

.field private final riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rider_bar_not_in_ride_message_icon_type"
    .end annotation

    .annotation runtime Lft5;
        value = "rider_bar_not_in_ride_message_icon_type"
    .end annotation
.end field

.field private final riderBarNotInRideMessageTitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rider_bar_not_in_ride_message_title"
    .end annotation

    .annotation runtime Lft5;
        value = "rider_bar_not_in_ride_message_title"
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

.field private final zoomBehavior:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "zoom_behavior"
    .end annotation

    .annotation runtime Lft5;
        value = "zoom_behavior"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireRiderMapZoneColors;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireLocation;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireRiderMapZoneColors;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/RiderMapZoneKind;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    const-string v2, "id"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->id:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->centerPoint:Lco/bird/android/model/wire/WireLocation;

    move-object v1, p3

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->label:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->colors:Lco/bird/android/model/wire/WireRiderMapZoneColors;

    move-object v1, p5

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->zoomBehavior:Ljava/lang/String;

    move-object v1, p6

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->mapZoneKinds:Ljava/util/List;

    move-object v1, p7

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->notes:Ljava/lang/String;

    move-object v1, p8

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->title:Ljava/lang/String;

    move-object v1, p9

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->customTooltipTitle:Ljava/lang/String;

    move-object v1, p10

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAmount:Ljava/lang/Integer;

    move-object v1, p11

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineCurrency:Ljava/lang/String;

    move-object v1, p12

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertTitle:Ljava/lang/String;

    move-object/from16 v1, p13

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertMessage:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageTitle:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageBody:Ljava/lang/String;

    move-object/from16 v1, p16

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    move-object/from16 v1, p17

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    move-object/from16 v1, p18

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageBody:Ljava/lang/String;

    move-object/from16 v1, p19

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    move-object/from16 v1, p20

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->maxSpeed:Ljava/lang/Integer;

    move-object/from16 v1, p21

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->partnerId:Ljava/lang/String;

    move-object/from16 v1, p22

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->areasMerged:Ljava/util/List;

    move-object/from16 v1, p23

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->fleetIds:Ljava/util/List;

    move-object/from16 v1, p24

    iput-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->areaKeys:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireRiderMapZoneColors;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 28

    move/from16 v0, p25

    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v9, v2

    goto :goto_0

    :cond_0
    move-object/from16 v9, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    move-object v10, v2

    goto :goto_1

    :cond_1
    move-object/from16 v10, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    move-object v11, v2

    goto :goto_2

    :cond_2
    move-object/from16 v11, p8

    :goto_2
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_3

    move-object v12, v2

    goto :goto_3

    :cond_3
    move-object/from16 v12, p9

    :goto_3
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_4

    move-object v13, v2

    goto :goto_4

    :cond_4
    move-object/from16 v13, p10

    :goto_4
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_5

    move-object v14, v2

    goto :goto_5

    :cond_5
    move-object/from16 v14, p11

    :goto_5
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_6

    move-object v15, v2

    goto :goto_6

    :cond_6
    move-object/from16 v15, p12

    :goto_6
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_7

    move-object/from16 v16, v2

    goto :goto_7

    :cond_7
    move-object/from16 v16, p13

    :goto_7
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_8

    move-object/from16 v17, v2

    goto :goto_8

    :cond_8
    move-object/from16 v17, p14

    :goto_8
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_9

    move-object/from16 v18, v2

    goto :goto_9

    :cond_9
    move-object/from16 v18, p15

    :goto_9
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a

    move-object/from16 v19, v2

    goto :goto_a

    :cond_a
    move-object/from16 v19, p16

    :goto_a
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    move-object/from16 v20, v2

    goto :goto_b

    :cond_b
    move-object/from16 v20, p17

    :goto_b
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v21, v2

    goto :goto_c

    :cond_c
    move-object/from16 v21, p18

    :goto_c
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v22, v2

    goto :goto_d

    :cond_d
    move-object/from16 v22, p19

    :goto_d
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v23, v2

    goto :goto_e

    :cond_e
    move-object/from16 v23, p20

    :goto_e
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v24, v2

    goto :goto_f

    :cond_f
    move-object/from16 v24, p21

    :goto_f
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v25, v2

    goto :goto_10

    :cond_10
    move-object/from16 v25, p22

    :goto_10
    const/high16 v1, 0x400000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move-object/from16 v26, v2

    goto :goto_11

    :cond_11
    move-object/from16 v26, p23

    :goto_11
    const/high16 v1, 0x800000

    and-int/2addr v0, v1

    if-eqz v0, :cond_12

    move-object/from16 v27, v2

    goto :goto_12

    :cond_12
    move-object/from16 v27, p24

    :goto_12
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    invoke-direct/range {v3 .. v27}, Lco/bird/android/model/wire/WireRiderMapZone;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireRiderMapZoneColors;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireRiderMapZone;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireRiderMapZoneColors;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/wire/WireRiderMapZone;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p25

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/wire/WireRiderMapZone;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/wire/WireRiderMapZone;->centerPoint:Lco/bird/android/model/wire/WireLocation;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/wire/WireRiderMapZone;->label:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/wire/WireRiderMapZone;->colors:Lco/bird/android/model/wire/WireRiderMapZoneColors;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/wire/WireRiderMapZone;->zoomBehavior:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/wire/WireRiderMapZone;->mapZoneKinds:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/wire/WireRiderMapZone;->notes:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/wire/WireRiderMapZone;->title:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/wire/WireRiderMapZone;->customTooltipTitle:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAmount:Ljava/lang/Integer;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineCurrency:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertTitle:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertMessage:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageTitle:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageBody:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageBody:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_12

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-object/from16 p19, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->maxSpeed:Ljava/lang/Integer;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-object/from16 p20, v15

    if-eqz v16, :cond_14

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->partnerId:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move-object/from16 p21, v15

    if-eqz v16, :cond_15

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->areasMerged:Ljava/util/List;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-object/from16 p22, v15

    if-eqz v16, :cond_16

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->fleetIds:Ljava/util/List;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v1, v1, v16

    if-eqz v1, :cond_17

    iget-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->areaKeys:Ljava/util/List;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p23, v15

    move-object/from16 p24, v1

    invoke-virtual/range {p0 .. p24}, Lco/bird/android/model/wire/WireRiderMapZone;->copy(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireRiderMapZoneColors;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lco/bird/android/model/wire/WireRiderMapZone;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineCurrency:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->centerPoint:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final component20()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->maxSpeed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->areasMerged:Ljava/util/List;

    return-object v0
.end method

.method public final component23()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->fleetIds:Ljava/util/List;

    return-object v0
.end method

.method public final component24()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->areaKeys:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/wire/WireRiderMapZoneColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->colors:Lco/bird/android/model/wire/WireRiderMapZoneColors;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->zoomBehavior:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/RiderMapZoneKind;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->mapZoneKinds:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->customTooltipTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireRiderMapZoneColors;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lco/bird/android/model/wire/WireRiderMapZone;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireLocation;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireRiderMapZoneColors;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/RiderMapZoneKind;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lco/bird/android/model/wire/WireRiderMapZone;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    const-string v0, "id"

    move-object/from16 v25, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v26, Lco/bird/android/model/wire/WireRiderMapZone;

    move-object/from16 v0, v26

    invoke-direct/range {v0 .. v24}, Lco/bird/android/model/wire/WireRiderMapZone;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lco/bird/android/model/wire/WireRiderMapZoneColors;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v26
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireRiderMapZone;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireRiderMapZone;

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->centerPoint:Lco/bird/android/model/wire/WireLocation;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->centerPoint:Lco/bird/android/model/wire/WireLocation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->label:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->colors:Lco/bird/android/model/wire/WireRiderMapZoneColors;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->colors:Lco/bird/android/model/wire/WireRiderMapZoneColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->zoomBehavior:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->zoomBehavior:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->mapZoneKinds:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->mapZoneKinds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->notes:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->notes:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->customTooltipTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->customTooltipTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAmount:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAmount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineCurrency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineCurrency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertMessage:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageBody:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageBody:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->maxSpeed:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->maxSpeed:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->partnerId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->partnerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->areasMerged:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->areasMerged:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->fleetIds:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRiderMapZone;->fleetIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->areaKeys:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/wire/WireRiderMapZone;->areaKeys:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    return v2

    :cond_19
    return v0
.end method

.method public final getAreaKeys()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->areaKeys:Ljava/util/List;

    return-object v0
.end method

.method public final getAreasMerged()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->areasMerged:Ljava/util/List;

    return-object v0
.end method

.method public final getCenterPoint()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->centerPoint:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final getColors()Lco/bird/android/model/wire/WireRiderMapZoneColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->colors:Lco/bird/android/model/wire/WireRiderMapZoneColors;

    return-object v0
.end method

.method public final getCustomTooltipTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->customTooltipTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getFleetIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->fleetIds:Ljava/util/List;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMapZoneKinds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/RiderMapZoneKind;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->mapZoneKinds:Ljava/util/List;

    return-object v0
.end method

.method public final getMaxSpeed()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->maxSpeed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNoParkingFineAlertMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getNoParkingFineAlertTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getNoParkingFineAmount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNoParkingFineCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineCurrency:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final getPartnerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getRiderBarInRideMessageBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getRiderBarInRideMessageIconType()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final getRiderBarInRideMessageTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getRiderBarNotInRideMessageBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getRiderBarNotInRideMessageIconType()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final getRiderBarNotInRideMessageTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getZoomBehavior()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->zoomBehavior:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireRiderMapZone;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->centerPoint:Lco/bird/android/model/wire/WireLocation;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLocation;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->label:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->colors:Lco/bird/android/model/wire/WireRiderMapZoneColors;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRiderMapZoneColors;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->zoomBehavior:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->mapZoneKinds:Ljava/util/List;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->notes:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->title:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->customTooltipTitle:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAmount:Ljava/lang/Integer;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineCurrency:Ljava/lang/String;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertTitle:Ljava/lang/String;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertMessage:Ljava/lang/String;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageTitle:Ljava/lang/String;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageBody:Ljava/lang/String;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_d

    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_f

    :cond_f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageBody:Ljava/lang/String;

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_10

    :cond_10
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_11

    :cond_11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->maxSpeed:Ljava/lang/Integer;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_12

    :cond_12
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->partnerId:Ljava/lang/String;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_13

    :cond_13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->areasMerged:Ljava/util/List;

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_14

    :cond_14
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->fleetIds:Ljava/util/List;

    if-nez v1, :cond_15

    move v1, v2

    goto :goto_15

    :cond_15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRiderMapZone;->areaKeys:Ljava/util/List;

    if-nez v1, :cond_16

    goto :goto_16

    :cond_16
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_16
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/wire/WireRiderMapZone;->id:Ljava/lang/String;

    iget-object v2, v0, Lco/bird/android/model/wire/WireRiderMapZone;->centerPoint:Lco/bird/android/model/wire/WireLocation;

    iget-object v3, v0, Lco/bird/android/model/wire/WireRiderMapZone;->label:Ljava/lang/String;

    iget-object v4, v0, Lco/bird/android/model/wire/WireRiderMapZone;->colors:Lco/bird/android/model/wire/WireRiderMapZoneColors;

    iget-object v5, v0, Lco/bird/android/model/wire/WireRiderMapZone;->zoomBehavior:Ljava/lang/String;

    iget-object v6, v0, Lco/bird/android/model/wire/WireRiderMapZone;->mapZoneKinds:Ljava/util/List;

    iget-object v7, v0, Lco/bird/android/model/wire/WireRiderMapZone;->notes:Ljava/lang/String;

    iget-object v8, v0, Lco/bird/android/model/wire/WireRiderMapZone;->title:Ljava/lang/String;

    iget-object v9, v0, Lco/bird/android/model/wire/WireRiderMapZone;->customTooltipTitle:Ljava/lang/String;

    iget-object v10, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAmount:Ljava/lang/Integer;

    iget-object v11, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineCurrency:Ljava/lang/String;

    iget-object v12, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertTitle:Ljava/lang/String;

    iget-object v13, v0, Lco/bird/android/model/wire/WireRiderMapZone;->noParkingFineAlertMessage:Ljava/lang/String;

    iget-object v14, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageTitle:Ljava/lang/String;

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageBody:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    move-object/from16 v17, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageBody:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    move-object/from16 v20, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->maxSpeed:Ljava/lang/Integer;

    move-object/from16 v21, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->partnerId:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->areasMerged:Ljava/util/List;

    move-object/from16 v23, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->fleetIds:Ljava/util/List;

    move-object/from16 v24, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireRiderMapZone;->areaKeys:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v25, v15

    const-string v15, "WireRiderMapZone(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", centerPoint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", colors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", zoomBehavior="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mapZoneKinds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", notes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", customTooltipTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", noParkingFineAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", noParkingFineCurrency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", noParkingFineAlertTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", noParkingFineAlertMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarInRideMessageTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarInRideMessageBody="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarInRideMessageIconType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarNotInRideMessageTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarNotInRideMessageBody="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarNotInRideMessageIconType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", partnerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", areasMerged="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fleetIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", areaKeys="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
