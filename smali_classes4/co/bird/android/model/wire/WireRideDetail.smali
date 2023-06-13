.class public final Lco/bird/android/model/wire/WireRideDetail;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\n\u0002\u0010\u000b\n\u0002\u0008\u0017\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00fb\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0002\u0010#J\u0006\u0010E\u001a\u00020FJ\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u000f\u0010R\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u000f\u0010T\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005H\u00c6\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00105J\t\u0010V\u001a\u00020\u000cH\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0088\u0002\u0010[\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00052\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u00c6\u0001\u00a2\u0006\u0002\u0010\\J\t\u0010]\u001a\u00020^H\u00d6\u0001J\u0013\u0010_\u001a\u00020F2\u0008\u0010`\u001a\u0004\u0018\u00010aH\u00d6\u0003J\t\u0010b\u001a\u00020^H\u00d6\u0001J\u0008\u0010c\u001a\u00020\u0012H\u0016J\u0019\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020^H\u00d6\u0001R\u001c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010%R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010(R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010(R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010(R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010(R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107R\u0016\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<R\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010>R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010BR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010(R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010(\u00a8\u0006i"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRideDetail;",
        "Landroid/os/Parcelable;",
        "ride",
        "Lco/bird/android/model/wire/WireRide;",
        "birdTracks",
        "",
        "Lco/bird/android/model/wire/WireBirdTrack;",
        "birdEvents",
        "Lco/bird/android/model/wire/WireBirdEvent;",
        "rating",
        "",
        "receipt",
        "Lco/bird/android/model/wire/WireReceipt;",
        "rideEndRidePhotoParkingEvaluation",
        "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;",
        "coupons",
        "Lco/bird/android/model/wire/WireCoupon;",
        "distance",
        "",
        "duration",
        "cost",
        "costWithoutCoupon",
        "subtext",
        "title",
        "detail",
        "imageUrl",
        "costImageUrl",
        "frequentFlyerView",
        "Lco/bird/android/model/wire/WireFrequentFlyerView;",
        "dispute",
        "Lco/bird/android/model/wire/WireDisputeView;",
        "reportStatus",
        "Lco/bird/android/model/constant/RideReportStatus;",
        "report",
        "Lco/bird/android/model/wire/WireRideReport;",
        "(Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;)V",
        "getBirdEvents",
        "()Ljava/util/List;",
        "getBirdTracks",
        "getCost",
        "()Ljava/lang/String;",
        "getCostImageUrl",
        "getCostWithoutCoupon",
        "getCoupons",
        "getDetail",
        "getDispute",
        "()Lco/bird/android/model/wire/WireDisputeView;",
        "getDistance",
        "getDuration",
        "getFrequentFlyerView",
        "()Lco/bird/android/model/wire/WireFrequentFlyerView;",
        "getImageUrl",
        "getRating",
        "()Ljava/lang/Float;",
        "setRating",
        "(Ljava/lang/Float;)V",
        "Ljava/lang/Float;",
        "getReceipt",
        "()Lco/bird/android/model/wire/WireReceipt;",
        "getReport",
        "()Lco/bird/android/model/wire/WireRideReport;",
        "getReportStatus",
        "()Lco/bird/android/model/constant/RideReportStatus;",
        "getRide",
        "()Lco/bird/android/model/wire/WireRide;",
        "getRideEndRidePhotoParkingEvaluation",
        "()Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;",
        "getSubtext",
        "getTitle",
        "cancelled",
        "",
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
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;)Lco/bird/android/model/wire/WireRideDetail;",
        "describeContents",
        "",
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
            "Lco/bird/android/model/wire/WireRideDetail;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final birdEvents:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_events"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdEvent;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "bird_events"
    .end annotation
.end field

.field private final birdTracks:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_tracks"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdTrack;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "bird_tracks"
    .end annotation
.end field

.field private final cost:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "cost"
    .end annotation

    .annotation runtime Lft5;
        value = "cost"
    .end annotation
.end field

.field private final costImageUrl:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "cost_image_url"
    .end annotation

    .annotation runtime Lft5;
        value = "cost_image_url"
    .end annotation
.end field

.field private final costWithoutCoupon:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "cost_without_coupon"
    .end annotation

    .annotation runtime Lft5;
        value = "cost_without_coupon"
    .end annotation
.end field

.field private final coupons:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "coupons"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "coupons"
    .end annotation
.end field

.field private final detail:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "detail"
    .end annotation

    .annotation runtime Lft5;
        value = "detail"
    .end annotation
.end field

.field private final dispute:Lco/bird/android/model/wire/WireDisputeView;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "dispute"
    .end annotation

    .annotation runtime Lft5;
        value = "dispute"
    .end annotation
.end field

.field private final distance:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "distance"
    .end annotation

    .annotation runtime Lft5;
        value = "distance"
    .end annotation
.end field

.field private final duration:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "duration"
    .end annotation

    .annotation runtime Lft5;
        value = "duration"
    .end annotation
.end field

.field private final frequentFlyerView:Lco/bird/android/model/wire/WireFrequentFlyerView;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "frequent_flyer_view"
    .end annotation

    .annotation runtime Lft5;
        value = "frequent_flyer_view"
    .end annotation
.end field

.field private final imageUrl:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "image_url"
    .end annotation

    .annotation runtime Lft5;
        value = "image_url"
    .end annotation
.end field

.field private rating:Ljava/lang/Float;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rating"
    .end annotation

    .annotation runtime Lft5;
        value = "rating"
    .end annotation
.end field

.field private final receipt:Lco/bird/android/model/wire/WireReceipt;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "receipt"
    .end annotation

    .annotation runtime Lft5;
        value = "receipt"
    .end annotation
.end field

.field private final report:Lco/bird/android/model/wire/WireRideReport;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "report"
    .end annotation

    .annotation runtime Lft5;
        value = "report"
    .end annotation
.end field

.field private final reportStatus:Lco/bird/android/model/constant/RideReportStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "report_status"
    .end annotation

    .annotation runtime Lft5;
        value = "report_status"
    .end annotation
.end field

.field private final ride:Lco/bird/android/model/wire/WireRide;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ride"
    .end annotation

    .annotation runtime Lft5;
        value = "ride"
    .end annotation
.end field

.field private final rideEndRidePhotoParkingEvaluation:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "ride_end_photo_parking_evaluation"
    .end annotation

    .annotation runtime Lft5;
        value = "ride_end_photo_parking_evaluation"
    .end annotation
.end field

.field private final subtext:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "subtext"
    .end annotation

    .annotation runtime Lft5;
        value = "subtext"
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
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/WireRideDetail$Creator;

    invoke-direct {v0}, Lco/bird/android/model/wire/WireRideDetail$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/wire/WireRideDetail;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireRide;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdTrack;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdEvent;",
            ">;",
            "Ljava/lang/Float;",
            "Lco/bird/android/model/wire/WireReceipt;",
            "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireFrequentFlyerView;",
            "Lco/bird/android/model/wire/WireDisputeView;",
            "Lco/bird/android/model/constant/RideReportStatus;",
            "Lco/bird/android/model/wire/WireRideReport;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    const-string v5, "ride"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "birdTracks"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "birdEvents"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "receipt"

    invoke-static {p5, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->ride:Lco/bird/android/model/wire/WireRide;

    iput-object v2, v0, Lco/bird/android/model/wire/WireRideDetail;->birdTracks:Ljava/util/List;

    iput-object v3, v0, Lco/bird/android/model/wire/WireRideDetail;->birdEvents:Ljava/util/List;

    move-object v1, p4

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->rating:Ljava/lang/Float;

    iput-object v4, v0, Lco/bird/android/model/wire/WireRideDetail;->receipt:Lco/bird/android/model/wire/WireReceipt;

    move-object v1, p6

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->rideEndRidePhotoParkingEvaluation:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    move-object v1, p7

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->coupons:Ljava/util/List;

    move-object v1, p8

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->distance:Ljava/lang/String;

    move-object v1, p9

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->duration:Ljava/lang/String;

    move-object/from16 v1, p10

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->cost:Ljava/lang/String;

    move-object/from16 v1, p11

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->costWithoutCoupon:Ljava/lang/String;

    move-object/from16 v1, p12

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->subtext:Ljava/lang/String;

    move-object/from16 v1, p13

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->title:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->detail:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->imageUrl:Ljava/lang/String;

    move-object/from16 v1, p16

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->costImageUrl:Ljava/lang/String;

    move-object/from16 v1, p17

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->frequentFlyerView:Lco/bird/android/model/wire/WireFrequentFlyerView;

    move-object/from16 v1, p18

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->dispute:Lco/bird/android/model/wire/WireDisputeView;

    move-object/from16 v1, p19

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->reportStatus:Lco/bird/android/model/constant/RideReportStatus;

    move-object/from16 v1, p20

    iput-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->report:Lco/bird/android/model/wire/WireRideReport;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object/from16 v4, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v6, v2

    goto :goto_2

    :cond_2
    move-object/from16 v6, p4

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v10, v2

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-object v11, v2

    goto :goto_6

    :cond_6
    move-object/from16 v11, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move-object v12, v2

    goto :goto_7

    :cond_7
    move-object/from16 v12, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    move-object v13, v2

    goto :goto_8

    :cond_8
    move-object/from16 v13, p11

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move-object v14, v2

    goto :goto_9

    :cond_9
    move-object/from16 v14, p12

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    move-object v15, v2

    goto :goto_a

    :cond_a
    move-object/from16 v15, p13

    :goto_a
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_b

    move-object/from16 v16, v2

    goto :goto_b

    :cond_b
    move-object/from16 v16, p14

    :goto_b
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_c

    move-object/from16 v17, v2

    goto :goto_c

    :cond_c
    move-object/from16 v17, p15

    :goto_c
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v18, v2

    goto :goto_d

    :cond_d
    move-object/from16 v18, p16

    :goto_d
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v19, v2

    goto :goto_e

    :cond_e
    move-object/from16 v19, p17

    :goto_e
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v20, v2

    goto :goto_f

    :cond_f
    move-object/from16 v20, p18

    :goto_f
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v21, v2

    goto :goto_10

    :cond_10
    move-object/from16 v21, p19

    :goto_10
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_11

    move-object/from16 v22, v2

    goto :goto_11

    :cond_11
    move-object/from16 v22, p20

    :goto_11
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v7, p5

    invoke-direct/range {v2 .. v22}, Lco/bird/android/model/wire/WireRideDetail;-><init>(Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireRideDetail;Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;ILjava/lang/Object;)Lco/bird/android/model/wire/WireRideDetail;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/wire/WireRideDetail;->ride:Lco/bird/android/model/wire/WireRide;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/wire/WireRideDetail;->birdTracks:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/wire/WireRideDetail;->birdEvents:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/bird/android/model/wire/WireRideDetail;->rating:Ljava/lang/Float;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/bird/android/model/wire/WireRideDetail;->receipt:Lco/bird/android/model/wire/WireReceipt;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/bird/android/model/wire/WireRideDetail;->rideEndRidePhotoParkingEvaluation:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/bird/android/model/wire/WireRideDetail;->coupons:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/bird/android/model/wire/WireRideDetail;->distance:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/bird/android/model/wire/WireRideDetail;->duration:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lco/bird/android/model/wire/WireRideDetail;->cost:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lco/bird/android/model/wire/WireRideDetail;->costWithoutCoupon:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lco/bird/android/model/wire/WireRideDetail;->subtext:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lco/bird/android/model/wire/WireRideDetail;->title:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/wire/WireRideDetail;->detail:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/wire/WireRideDetail;->imageUrl:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lco/bird/android/model/wire/WireRideDetail;->costImageUrl:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lco/bird/android/model/wire/WireRideDetail;->frequentFlyerView:Lco/bird/android/model/wire/WireFrequentFlyerView;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lco/bird/android/model/wire/WireRideDetail;->dispute:Lco/bird/android/model/wire/WireDisputeView;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_12

    iget-object v15, v0, Lco/bird/android/model/wire/WireRideDetail;->reportStatus:Lco/bird/android/model/constant/RideReportStatus;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v1, v1, v16

    if-eqz v1, :cond_13

    iget-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->report:Lco/bird/android/model/wire/WireRideReport;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
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

    move-object/from16 p19, v15

    move-object/from16 p20, v1

    invoke-virtual/range {p0 .. p20}, Lco/bird/android/model/wire/WireRideDetail;->copy(Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;)Lco/bird/android/model/wire/WireRideDetail;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final cancelled()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getCost()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final component1()Lco/bird/android/model/wire/WireRide;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->ride:Lco/bird/android/model/wire/WireRide;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->cost:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->costWithoutCoupon:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->subtext:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->detail:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->costImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Lco/bird/android/model/wire/WireFrequentFlyerView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->frequentFlyerView:Lco/bird/android/model/wire/WireFrequentFlyerView;

    return-object v0
.end method

.method public final component18()Lco/bird/android/model/wire/WireDisputeView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->dispute:Lco/bird/android/model/wire/WireDisputeView;

    return-object v0
.end method

.method public final component19()Lco/bird/android/model/constant/RideReportStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->reportStatus:Lco/bird/android/model/constant/RideReportStatus;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdTrack;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->birdTracks:Ljava/util/List;

    return-object v0
.end method

.method public final component20()Lco/bird/android/model/wire/WireRideReport;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->report:Lco/bird/android/model/wire/WireRideReport;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->birdEvents:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->rating:Ljava/lang/Float;

    return-object v0
.end method

.method public final component5()Lco/bird/android/model/wire/WireReceipt;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->receipt:Lco/bird/android/model/wire/WireReceipt;

    return-object v0
.end method

.method public final component6()Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->rideEndRidePhotoParkingEvaluation:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->coupons:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->distance:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;)Lco/bird/android/model/wire/WireRideDetail;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireRide;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdTrack;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdEvent;",
            ">;",
            "Ljava/lang/Float;",
            "Lco/bird/android/model/wire/WireReceipt;",
            "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireFrequentFlyerView;",
            "Lco/bird/android/model/wire/WireDisputeView;",
            "Lco/bird/android/model/constant/RideReportStatus;",
            "Lco/bird/android/model/wire/WireRideReport;",
            ")",
            "Lco/bird/android/model/wire/WireRideDetail;"
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

    const-string v0, "ride"

    move-object/from16 v21, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdTracks"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdEvents"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receipt"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v22, Lco/bird/android/model/wire/WireRideDetail;

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-direct/range {v0 .. v20}, Lco/bird/android/model/wire/WireRideDetail;-><init>(Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;)V

    return-object v22
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireRideDetail;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireRideDetail;

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->ride:Lco/bird/android/model/wire/WireRide;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->birdTracks:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->birdTracks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->birdEvents:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->birdEvents:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->rating:Ljava/lang/Float;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->rating:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->receipt:Lco/bird/android/model/wire/WireReceipt;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->receipt:Lco/bird/android/model/wire/WireReceipt;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->rideEndRidePhotoParkingEvaluation:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->rideEndRidePhotoParkingEvaluation:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->coupons:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->coupons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->distance:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->distance:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->duration:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->duration:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->cost:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->cost:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->costWithoutCoupon:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->costWithoutCoupon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->subtext:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->subtext:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->detail:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->detail:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->costImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->costImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->frequentFlyerView:Lco/bird/android/model/wire/WireFrequentFlyerView;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->frequentFlyerView:Lco/bird/android/model/wire/WireFrequentFlyerView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->dispute:Lco/bird/android/model/wire/WireDisputeView;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->dispute:Lco/bird/android/model/wire/WireDisputeView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->reportStatus:Lco/bird/android/model/constant/RideReportStatus;

    iget-object v3, p1, Lco/bird/android/model/wire/WireRideDetail;->reportStatus:Lco/bird/android/model/constant/RideReportStatus;

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->report:Lco/bird/android/model/wire/WireRideReport;

    iget-object p1, p1, Lco/bird/android/model/wire/WireRideDetail;->report:Lco/bird/android/model/wire/WireRideReport;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getBirdEvents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->birdEvents:Ljava/util/List;

    return-object v0
.end method

.method public final getBirdTracks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBirdTrack;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->birdTracks:Ljava/util/List;

    return-object v0
.end method

.method public final getCost()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->cost:Ljava/lang/String;

    return-object v0
.end method

.method public final getCostImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->costImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCostWithoutCoupon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->costWithoutCoupon:Ljava/lang/String;

    return-object v0
.end method

.method public final getCoupons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->coupons:Ljava/util/List;

    return-object v0
.end method

.method public final getDetail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->detail:Ljava/lang/String;

    return-object v0
.end method

.method public final getDispute()Lco/bird/android/model/wire/WireDisputeView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->dispute:Lco/bird/android/model/wire/WireDisputeView;

    return-object v0
.end method

.method public final getDistance()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->distance:Ljava/lang/String;

    return-object v0
.end method

.method public final getDuration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final getFrequentFlyerView()Lco/bird/android/model/wire/WireFrequentFlyerView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->frequentFlyerView:Lco/bird/android/model/wire/WireFrequentFlyerView;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getRating()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->rating:Ljava/lang/Float;

    return-object v0
.end method

.method public final getReceipt()Lco/bird/android/model/wire/WireReceipt;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->receipt:Lco/bird/android/model/wire/WireReceipt;

    return-object v0
.end method

.method public final getReport()Lco/bird/android/model/wire/WireRideReport;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->report:Lco/bird/android/model/wire/WireRideReport;

    return-object v0
.end method

.method public final getReportStatus()Lco/bird/android/model/constant/RideReportStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->reportStatus:Lco/bird/android/model/constant/RideReportStatus;

    return-object v0
.end method

.method public final getRide()Lco/bird/android/model/wire/WireRide;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->ride:Lco/bird/android/model/wire/WireRide;

    return-object v0
.end method

.method public final getRideEndRidePhotoParkingEvaluation()Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->rideEndRidePhotoParkingEvaluation:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    return-object v0
.end method

.method public final getSubtext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->subtext:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->birdTracks:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->birdEvents:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->rating:Ljava/lang/Float;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->receipt:Lco/bird/android/model/wire/WireReceipt;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireReceipt;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->rideEndRidePhotoParkingEvaluation:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->coupons:Ljava/util/List;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->distance:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->duration:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->cost:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->costWithoutCoupon:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->subtext:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->title:Ljava/lang/String;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->detail:Ljava/lang/String;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->imageUrl:Ljava/lang/String;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->costImageUrl:Ljava/lang/String;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->frequentFlyerView:Lco/bird/android/model/wire/WireFrequentFlyerView;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireFrequentFlyerView;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->dispute:Lco/bird/android/model/wire/WireDisputeView;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_d

    :cond_d
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireDisputeView;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->reportStatus:Lco/bird/android/model/constant/RideReportStatus;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireRideDetail;->report:Lco/bird/android/model/wire/WireRideReport;

    if-nez v1, :cond_f

    goto :goto_f

    :cond_f
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRideReport;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    return v0
.end method

.method public final setRating(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/wire/WireRideDetail;->rating:Ljava/lang/Float;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/wire/WireRideDetail;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lco/bird/android/model/wire/WireRideDetail;->rating:Ljava/lang/Float;

    iget-object v3, v0, Lco/bird/android/model/wire/WireRideDetail;->receipt:Lco/bird/android/model/wire/WireReceipt;

    iget-object v4, v0, Lco/bird/android/model/wire/WireRideDetail;->rideEndRidePhotoParkingEvaluation:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    iget-object v5, v0, Lco/bird/android/model/wire/WireRideDetail;->coupons:Ljava/util/List;

    iget-object v6, v0, Lco/bird/android/model/wire/WireRideDetail;->distance:Ljava/lang/String;

    iget-object v7, v0, Lco/bird/android/model/wire/WireRideDetail;->duration:Ljava/lang/String;

    iget-object v8, v0, Lco/bird/android/model/wire/WireRideDetail;->cost:Ljava/lang/String;

    iget-object v9, v0, Lco/bird/android/model/wire/WireRideDetail;->costWithoutCoupon:Ljava/lang/String;

    iget-object v10, v0, Lco/bird/android/model/wire/WireRideDetail;->subtext:Ljava/lang/String;

    iget-object v11, v0, Lco/bird/android/model/wire/WireRideDetail;->title:Ljava/lang/String;

    iget-object v12, v0, Lco/bird/android/model/wire/WireRideDetail;->detail:Ljava/lang/String;

    iget-object v13, v0, Lco/bird/android/model/wire/WireRideDetail;->imageUrl:Ljava/lang/String;

    iget-object v14, v0, Lco/bird/android/model/wire/WireRideDetail;->costImageUrl:Ljava/lang/String;

    iget-object v15, v0, Lco/bird/android/model/wire/WireRideDetail;->frequentFlyerView:Lco/bird/android/model/wire/WireFrequentFlyerView;

    move-object/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/model/wire/WireRideDetail;->dispute:Lco/bird/android/model/wire/WireDisputeView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v15

    const-string v15, "WireRideDetail(rideId = "

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", rating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", receipt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rideEndRidePhotoParkingEvaluation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", coupons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", costWithoutCoupon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subtext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", detail="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", costImageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", frequentFlyerView="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dispute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->ride:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireRide;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->birdTracks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBirdTrack;

    invoke-virtual {v1, p1, p2}, Lco/bird/android/model/wire/WireBirdTrack;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->birdEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBirdEvent;

    invoke-virtual {v1, p1, p2}, Lco/bird/android/model/wire/WireBirdEvent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->rating:Ljava/lang/Float;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    :goto_2
    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->receipt:Lco/bird/android/model/wire/WireReceipt;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireReceipt;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->rideEndRidePhotoParkingEvaluation:Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->coupons:Ljava/util/List;

    if-nez v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v3, p1, p2}, Lco/bird/android/model/wire/WireCoupon;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_4

    :cond_5
    :goto_5
    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->distance:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->duration:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->cost:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->costWithoutCoupon:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->subtext:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->detail:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->imageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->costImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->frequentFlyerView:Lco/bird/android/model/wire/WireFrequentFlyerView;

    if-nez v0, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireFrequentFlyerView;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_6
    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->dispute:Lco/bird/android/model/wire/WireDisputeView;

    if-nez v0, :cond_7

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireDisputeView;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_7
    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->reportStatus:Lco/bird/android/model/constant/RideReportStatus;

    if-nez v0, :cond_8

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_8
    iget-object v0, p0, Lco/bird/android/model/wire/WireRideDetail;->report:Lco/bird/android/model/wire/WireRideReport;

    if-nez v0, :cond_9

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/wire/WireRideReport;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_9
    return-void
.end method
