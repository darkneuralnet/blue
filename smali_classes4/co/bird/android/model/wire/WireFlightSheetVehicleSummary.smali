.class public final Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/wire/WireFlightSheetSection;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u00083\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00dd\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0010\u0008\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001a\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0008\u0002\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u001a\u00a2\u0006\u0002\u0010!J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u00105J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u00c6\u0003J\u000f\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001aH\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010H\u001a\u0008\u0012\u0004\u0012\u00020 0\u001aH\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0008H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010O\u001a\u00020\u000fH\u00c6\u0003J\t\u0010P\u001a\u00020\u0011H\u00c6\u0003J\u00e6\u0001\u0010Q\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0010\u0008\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001a2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u001aH\u00c6\u0001\u00a2\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020T2\u0008\u0010U\u001a\u0004\u0018\u00010VH\u00d6\u0003J\t\u0010W\u001a\u00020\u0003H\u00d6\u0001J\t\u0010X\u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u001c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010#R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010&R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010(R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00106\u001a\u0004\u00084\u00105R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010(R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00109R\u0016\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010;R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010;R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010(R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010(\u00a8\u0006Y"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;",
        "Lco/bird/android/model/wire/WireFlightSheetSection;",
        "idx",
        "",
        "title",
        "",
        "birdCode",
        "model",
        "Lco/bird/android/model/constant/BirdModel;",
        "battery",
        "lastLocatedAt",
        "Lorg/joda/time/DateTime;",
        "lastLocatedSource",
        "Lco/bird/android/model/constant/BirdLocationSource;",
        "statusIcon",
        "Lco/bird/android/model/constant/ClientIcon;",
        "statusIconColor",
        "Lco/bird/android/model/wire/WireThemedColors;",
        "statusIconBackgroundColor",
        "statusTitle",
        "statusDescription",
        "marker",
        "Lco/bird/android/model/wire/WireMapMarker;",
        "ratingAverage",
        "",
        "campaigns",
        "",
        "Lco/bird/android/model/wire/WireFlightSheetCampaign;",
        "actions",
        "Lco/bird/android/model/constant/FlightSheetSummaryAction;",
        "markerLabel",
        "badges",
        "Lco/bird/android/model/constant/FlightSheetBadge;",
        "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V",
        "getActions",
        "()Ljava/util/List;",
        "getBadges",
        "getBattery",
        "()I",
        "getBirdCode",
        "()Ljava/lang/String;",
        "getCampaigns",
        "getIdx",
        "getLastLocatedAt",
        "()Lorg/joda/time/DateTime;",
        "getLastLocatedSource",
        "()Lco/bird/android/model/constant/BirdLocationSource;",
        "getMarker",
        "()Lco/bird/android/model/wire/WireMapMarker;",
        "getMarkerLabel",
        "getModel",
        "()Lco/bird/android/model/constant/BirdModel;",
        "getRatingAverage",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getStatusDescription",
        "getStatusIcon",
        "()Lco/bird/android/model/constant/ClientIcon;",
        "getStatusIconBackgroundColor",
        "()Lco/bird/android/model/wire/WireThemedColors;",
        "getStatusIconColor",
        "getStatusTitle",
        "getTitle",
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
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;",
        "equals",
        "",
        "other",
        "",
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
.field private final actions:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "actions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/FlightSheetSummaryAction;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "actions"
    .end annotation
.end field

.field private final badges:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "badges"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/FlightSheetBadge;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "badges"
    .end annotation
.end field

.field private final battery:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "battery"
    .end annotation

    .annotation runtime Lft5;
        value = "battery"
    .end annotation
.end field

.field private final birdCode:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_code"
    .end annotation

    .annotation runtime Lft5;
        value = "bird_code"
    .end annotation
.end field

.field private final campaigns:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "campaigns"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetCampaign;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "campaigns"
    .end annotation
.end field

.field private final idx:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "idx"
    .end annotation

    .annotation runtime Lft5;
        value = "idx"
    .end annotation
.end field

.field private final lastLocatedAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "last_located_at"
    .end annotation

    .annotation runtime Lft5;
        value = "last_located_at"
    .end annotation
.end field

.field private final lastLocatedSource:Lco/bird/android/model/constant/BirdLocationSource;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "last_located_source"
    .end annotation

    .annotation runtime Lft5;
        value = "last_located_source"
    .end annotation
.end field

.field private final marker:Lco/bird/android/model/wire/WireMapMarker;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "marker"
    .end annotation

    .annotation runtime Lft5;
        value = "marker"
    .end annotation
.end field

.field private final markerLabel:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "marker_label"
    .end annotation

    .annotation runtime Lft5;
        value = "marker_label"
    .end annotation
.end field

.field private final model:Lco/bird/android/model/constant/BirdModel;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "model"
    .end annotation

    .annotation runtime Lft5;
        value = "model"
    .end annotation
.end field

.field private final ratingAverage:Ljava/lang/Double;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "_rating_average"
    .end annotation

    .annotation runtime Lft5;
        value = "_rating_average"
    .end annotation
.end field

.field private final statusDescription:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status_description"
    .end annotation

    .annotation runtime Lft5;
        value = "status_description"
    .end annotation
.end field

.field private final statusIcon:Lco/bird/android/model/constant/ClientIcon;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status_icon_value"
    .end annotation

    .annotation runtime Lft5;
        value = "status_icon_value"
    .end annotation
.end field

.field private final statusIconBackgroundColor:Lco/bird/android/model/wire/WireThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status_icon_background_color"
    .end annotation

    .annotation runtime Lft5;
        value = "status_icon_background_color"
    .end annotation
.end field

.field private final statusIconColor:Lco/bird/android/model/wire/WireThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status_icon_color"
    .end annotation

    .annotation runtime Lft5;
        value = "status_icon_color"
    .end annotation
.end field

.field private final statusTitle:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status_title"
    .end annotation

    .annotation runtime Lft5;
        value = "status_title"
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
.method public constructor <init>()V
    .locals 21

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v19, 0x3ffff

    const/16 v20, 0x0

    invoke-direct/range {v0 .. v20}, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;-><init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/BirdModel;",
            "I",
            "Lorg/joda/time/DateTime;",
            "Lco/bird/android/model/constant/BirdLocationSource;",
            "Lco/bird/android/model/constant/ClientIcon;",
            "Lco/bird/android/model/wire/WireThemedColors;",
            "Lco/bird/android/model/wire/WireThemedColors;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireMapMarker;",
            "Ljava/lang/Double;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetCampaign;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/FlightSheetSummaryAction;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/FlightSheetBadge;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p3

    move-object v2, p4

    move-object/from16 v3, p8

    move-object/from16 v4, p9

    move-object/from16 v5, p10

    move-object/from16 v6, p16

    move-object/from16 v7, p18

    const-string v8, "birdCode"

    invoke-static {p3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "model"

    invoke-static {p4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "statusIcon"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "statusIconColor"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "statusIconBackgroundColor"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "actions"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "badges"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v8, p1

    iput v8, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->idx:I

    move-object v8, p2

    iput-object v8, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->title:Ljava/lang/String;

    iput-object v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->birdCode:Ljava/lang/String;

    iput-object v2, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->model:Lco/bird/android/model/constant/BirdModel;

    move v1, p5

    iput v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->battery:I

    move-object v1, p6

    iput-object v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p7

    iput-object v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedSource:Lco/bird/android/model/constant/BirdLocationSource;

    iput-object v3, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIcon:Lco/bird/android/model/constant/ClientIcon;

    iput-object v4, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconColor:Lco/bird/android/model/wire/WireThemedColors;

    iput-object v5, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconBackgroundColor:Lco/bird/android/model/wire/WireThemedColors;

    move-object/from16 v1, p11

    iput-object v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusTitle:Ljava/lang/String;

    move-object/from16 v1, p12

    iput-object v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusDescription:Ljava/lang/String;

    move-object/from16 v1, p13

    iput-object v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->marker:Lco/bird/android/model/wire/WireMapMarker;

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->ratingAverage:Ljava/lang/Double;

    move-object/from16 v1, p15

    iput-object v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->campaigns:Ljava/util/List;

    iput-object v6, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->actions:Ljava/util/List;

    move-object/from16 v1, p17

    iput-object v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->markerLabel:Ljava/lang/String;

    iput-object v7, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->badges:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const v1, 0x7fffffff

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const-string v4, ""

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    sget-object v5, Lco/bird/android/model/constant/BirdModel;->M365:Lco/bird/android/model/constant/BirdModel;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    const/4 v7, 0x0

    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    move-object v8, v3

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    move-object v9, v3

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    sget-object v10, Lco/bird/android/model/constant/ClientIcon;->UNKNOWN:Lco/bird/android/model/constant/ClientIcon;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    const/4 v12, 0x3

    if-eqz v11, :cond_8

    new-instance v11, Lco/bird/android/model/wire/WireThemedColors;

    invoke-direct {v11, v7, v7, v12, v3}, Lco/bird/android/model/wire/WireThemedColors;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    new-instance v13, Lco/bird/android/model/wire/WireThemedColors;

    invoke-direct {v13, v7, v7, v12, v3}, Lco/bird/android/model/wire/WireThemedColors;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v7, v0, 0x400

    if-eqz v7, :cond_a

    move-object v7, v3

    goto :goto_a

    :cond_a
    move-object/from16 v7, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    move-object v12, v3

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    move-object v14, v3

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    move-object v15, v3

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v3, v0, 0x4000

    if-eqz v3, :cond_e

    const/4 v3, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v3, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v16

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v0, v0, v18

    if-eqz v0, :cond_11

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_11

    :cond_11
    move-object/from16 v0, p18

    :goto_11
    move-object/from16 p1, p0

    move/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v13

    move-object/from16 p12, v7

    move-object/from16 p13, v12

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p16, v3

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v0

    invoke-direct/range {p1 .. p19}, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;-><init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->idx:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->birdCode:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->model:Lco/bird/android/model/constant/BirdModel;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->battery:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedAt:Lorg/joda/time/DateTime;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedSource:Lco/bird/android/model/constant/BirdLocationSource;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIcon:Lco/bird/android/model/constant/ClientIcon;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconColor:Lco/bird/android/model/wire/WireThemedColors;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconBackgroundColor:Lco/bird/android/model/wire/WireThemedColors;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusTitle:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusDescription:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->marker:Lco/bird/android/model/wire/WireMapMarker;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->ratingAverage:Ljava/lang/Double;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->campaigns:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->actions:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->markerLabel:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v1, v1, v16

    if-eqz v1, :cond_11

    iget-object v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->badges:Ljava/util/List;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    move/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p17, v15

    move-object/from16 p18, v1

    invoke-virtual/range {p0 .. p18}, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->copy(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->idx:I

    return v0
.end method

.method public final component10()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconBackgroundColor:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Lco/bird/android/model/wire/WireMapMarker;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->marker:Lco/bird/android/model/wire/WireMapMarker;

    return-object v0
.end method

.method public final component14()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->ratingAverage:Ljava/lang/Double;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetCampaign;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->campaigns:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/FlightSheetSummaryAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->actions:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->markerLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/FlightSheetBadge;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->badges:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->birdCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/BirdModel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->model:Lco/bird/android/model/constant/BirdModel;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->battery:I

    return v0
.end method

.method public final component6()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component7()Lco/bird/android/model/constant/BirdLocationSource;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedSource:Lco/bird/android/model/constant/BirdLocationSource;

    return-object v0
.end method

.method public final component8()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIcon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final component9()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconColor:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/BirdModel;",
            "I",
            "Lorg/joda/time/DateTime;",
            "Lco/bird/android/model/constant/BirdLocationSource;",
            "Lco/bird/android/model/constant/ClientIcon;",
            "Lco/bird/android/model/wire/WireThemedColors;",
            "Lco/bird/android/model/wire/WireThemedColors;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireMapMarker;",
            "Ljava/lang/Double;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetCampaign;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/FlightSheetSummaryAction;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/FlightSheetBadge;",
            ">;)",
            "Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;"
        }
    .end annotation

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

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

    const-string v0, "birdCode"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statusIcon"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statusIconColor"

    move-object/from16 v1, p9

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statusIconBackgroundColor"

    move-object/from16 v1, p10

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actions"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "badges"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v19, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    move-object/from16 v0, v19

    move/from16 v1, p1

    invoke-direct/range {v0 .. v18}, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;-><init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILorg/joda/time/DateTime;Lco/bird/android/model/constant/BirdLocationSource;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMapMarker;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    return-object v19
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;

    iget v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->idx:I

    iget v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->idx:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->birdCode:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->birdCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->model:Lco/bird/android/model/constant/BirdModel;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->model:Lco/bird/android/model/constant/BirdModel;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->battery:I

    iget v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->battery:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedSource:Lco/bird/android/model/constant/BirdLocationSource;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedSource:Lco/bird/android/model/constant/BirdLocationSource;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIcon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIcon:Lco/bird/android/model/constant/ClientIcon;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconColor:Lco/bird/android/model/wire/WireThemedColors;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconColor:Lco/bird/android/model/wire/WireThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconBackgroundColor:Lco/bird/android/model/wire/WireThemedColors;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconBackgroundColor:Lco/bird/android/model/wire/WireThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusDescription:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->marker:Lco/bird/android/model/wire/WireMapMarker;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->marker:Lco/bird/android/model/wire/WireMapMarker;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->ratingAverage:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->ratingAverage:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->campaigns:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->campaigns:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->actions:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->actions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->markerLabel:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->markerLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->badges:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->badges:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getActions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/FlightSheetSummaryAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->actions:Ljava/util/List;

    return-object v0
.end method

.method public final getBadges()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/FlightSheetBadge;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->badges:Ljava/util/List;

    return-object v0
.end method

.method public final getBattery()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->battery:I

    return v0
.end method

.method public final getBirdCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->birdCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getCampaigns()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFlightSheetCampaign;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->campaigns:Ljava/util/List;

    return-object v0
.end method

.method public getIdx()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->idx:I

    return v0
.end method

.method public final getLastLocatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getLastLocatedSource()Lco/bird/android/model/constant/BirdLocationSource;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedSource:Lco/bird/android/model/constant/BirdLocationSource;

    return-object v0
.end method

.method public final getMarker()Lco/bird/android/model/wire/WireMapMarker;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->marker:Lco/bird/android/model/wire/WireMapMarker;

    return-object v0
.end method

.method public final getMarkerLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->markerLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getModel()Lco/bird/android/model/constant/BirdModel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->model:Lco/bird/android/model/constant/BirdModel;

    return-object v0
.end method

.method public final getRatingAverage()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->ratingAverage:Ljava/lang/Double;

    return-object v0
.end method

.method public final getStatusDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatusIcon()Lco/bird/android/model/constant/ClientIcon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIcon:Lco/bird/android/model/constant/ClientIcon;

    return-object v0
.end method

.method public final getStatusIconBackgroundColor()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconBackgroundColor:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public final getStatusIconColor()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconColor:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public final getStatusTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->idx:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->title:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->birdCode:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->model:Lco/bird/android/model/constant/BirdModel;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->battery:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedAt:Lorg/joda/time/DateTime;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedSource:Lco/bird/android/model/constant/BirdLocationSource;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIcon:Lco/bird/android/model/constant/ClientIcon;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconColor:Lco/bird/android/model/wire/WireThemedColors;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireThemedColors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconBackgroundColor:Lco/bird/android/model/wire/WireThemedColors;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireThemedColors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusTitle:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusDescription:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->marker:Lco/bird/android/model/wire/WireMapMarker;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireMapMarker;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->ratingAverage:Ljava/lang/Double;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->campaigns:Ljava/util/List;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->actions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->markerLabel:Ljava/lang/String;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->badges:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->idx:I

    iget-object v2, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->title:Ljava/lang/String;

    iget-object v3, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->birdCode:Ljava/lang/String;

    iget-object v4, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->model:Lco/bird/android/model/constant/BirdModel;

    iget v5, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->battery:I

    iget-object v6, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedAt:Lorg/joda/time/DateTime;

    iget-object v7, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->lastLocatedSource:Lco/bird/android/model/constant/BirdLocationSource;

    iget-object v8, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIcon:Lco/bird/android/model/constant/ClientIcon;

    iget-object v9, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconColor:Lco/bird/android/model/wire/WireThemedColors;

    iget-object v10, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusIconBackgroundColor:Lco/bird/android/model/wire/WireThemedColors;

    iget-object v11, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusTitle:Ljava/lang/String;

    iget-object v12, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->statusDescription:Ljava/lang/String;

    iget-object v13, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->marker:Lco/bird/android/model/wire/WireMapMarker;

    iget-object v14, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->ratingAverage:Ljava/lang/Double;

    iget-object v15, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->campaigns:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->actions:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->markerLabel:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireFlightSheetVehicleSummary;->badges:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v19, v15

    const-string v15, "WireFlightSheetVehicleSummary(idx="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", birdCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", model="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", battery="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", lastLocatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastLocatedSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", statusIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", statusIconColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", statusIconBackgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", statusTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", statusDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", marker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ratingAverage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", campaigns="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", actions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", markerLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", badges="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
