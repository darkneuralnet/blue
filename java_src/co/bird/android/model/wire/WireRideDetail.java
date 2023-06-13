package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.RideReportStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0002\u0010#J\u0006\u0010E\u001a\u00020FJ\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010 HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u00105J\t\u0010V\u001a\u00020\fHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0088\u0002\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"HÆ\u0001¢\u0006\u0002\u0010\\J\t\u0010]\u001a\u00020^HÖ\u0001J\u0013\u0010_\u001a\u00020F2\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\t\u0010b\u001a\u00020^HÖ\u0001J\b\u0010c\u001a\u00020\u0012H\u0016J\u0019\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020^HÖ\u0001R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010(R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010(¨\u0006i"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "Landroid/os/Parcelable;", "ride", "Lco/bird/android/model/wire/WireRide;", "birdTracks", "", "Lco/bird/android/model/wire/WireBirdTrack;", "birdEvents", "Lco/bird/android/model/wire/WireBirdEvent;", "rating", "", "receipt", "Lco/bird/android/model/wire/WireReceipt;", "rideEndRidePhotoParkingEvaluation", "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "coupons", "Lco/bird/android/model/wire/WireCoupon;", "distance", "", "duration", "cost", "costWithoutCoupon", "subtext", "title", "detail", "imageUrl", "costImageUrl", "frequentFlyerView", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "dispute", "Lco/bird/android/model/wire/WireDisputeView;", "reportStatus", "Lco/bird/android/model/constant/RideReportStatus;", "report", "Lco/bird/android/model/wire/WireRideReport;", "(Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;)V", "getBirdEvents", "()Ljava/util/List;", "getBirdTracks", "getCost", "()Ljava/lang/String;", "getCostImageUrl", "getCostWithoutCoupon", "getCoupons", "getDetail", "getDispute", "()Lco/bird/android/model/wire/WireDisputeView;", "getDistance", "getDuration", "getFrequentFlyerView", "()Lco/bird/android/model/wire/WireFrequentFlyerView;", "getImageUrl", "getRating", "()Ljava/lang/Float;", "setRating", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getReceipt", "()Lco/bird/android/model/wire/WireReceipt;", "getReport", "()Lco/bird/android/model/wire/WireRideReport;", "getReportStatus", "()Lco/bird/android/model/constant/RideReportStatus;", "getRide", "()Lco/bird/android/model/wire/WireRide;", "getRideEndRidePhotoParkingEvaluation", "()Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "getSubtext", "getTitle", "cancelled", "", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lco/bird/android/model/wire/WireRide;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lco/bird/android/model/wire/WireReceipt;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireFrequentFlyerView;Lco/bird/android/model/wire/WireDisputeView;Lco/bird/android/model/constant/RideReportStatus;Lco/bird/android/model/wire/WireRideReport;)Lco/bird/android/model/wire/WireRideDetail;", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRideDetail implements Parcelable {
    public static final Parcelable.Creator<WireRideDetail> CREATOR = new Creator();
    @JsonProperty("bird_events")
    @InterfaceC41208ft5("bird_events")
    private final List<WireBirdEvent> birdEvents;
    @JsonProperty("bird_tracks")
    @InterfaceC41208ft5("bird_tracks")
    private final List<WireBirdTrack> birdTracks;
    @JsonProperty("cost")
    @InterfaceC41208ft5("cost")
    private final String cost;
    @JsonProperty("cost_image_url")
    @InterfaceC41208ft5("cost_image_url")
    private final String costImageUrl;
    @JsonProperty("cost_without_coupon")
    @InterfaceC41208ft5("cost_without_coupon")
    private final String costWithoutCoupon;
    @JsonProperty("coupons")
    @InterfaceC41208ft5("coupons")
    private final List<WireCoupon> coupons;
    @JsonProperty("detail")
    @InterfaceC41208ft5("detail")
    private final String detail;
    @JsonProperty("dispute")
    @InterfaceC41208ft5("dispute")
    private final WireDisputeView dispute;
    @JsonProperty("distance")
    @InterfaceC41208ft5("distance")
    private final String distance;
    @JsonProperty("duration")
    @InterfaceC41208ft5("duration")
    private final String duration;
    @JsonProperty("frequent_flyer_view")
    @InterfaceC41208ft5("frequent_flyer_view")
    private final WireFrequentFlyerView frequentFlyerView;
    @JsonProperty("image_url")
    @InterfaceC41208ft5("image_url")
    private final String imageUrl;
    @JsonProperty("rating")
    @InterfaceC41208ft5("rating")
    private Float rating;
    @JsonProperty("receipt")
    @InterfaceC41208ft5("receipt")
    private final WireReceipt receipt;
    @JsonProperty("report")
    @InterfaceC41208ft5("report")
    private final WireRideReport report;
    @JsonProperty("report_status")
    @InterfaceC41208ft5("report_status")
    private final RideReportStatus reportStatus;
    @JsonProperty("ride")
    @InterfaceC41208ft5("ride")
    private final WireRide ride;
    @JsonProperty("ride_end_photo_parking_evaluation")
    @InterfaceC41208ft5("ride_end_photo_parking_evaluation")
    private final WireEndRidePhotoParkingEvaluation rideEndRidePhotoParkingEvaluation;
    @JsonProperty("subtext")
    @InterfaceC41208ft5("subtext")
    private final String subtext;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireRideDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRideDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            WireRide createFromParcel = WireRide.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList2.add(WireBirdTrack.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList3.add(WireBirdEvent.CREATOR.createFromParcel(parcel));
            }
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            WireReceipt createFromParcel2 = WireReceipt.CREATOR.createFromParcel(parcel);
            WireEndRidePhotoParkingEvaluation createFromParcel3 = parcel.readInt() == 0 ? null : WireEndRidePhotoParkingEvaluation.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList4.add(WireCoupon.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList4;
            }
            return new WireRideDetail(createFromParcel, arrayList2, arrayList3, valueOf, createFromParcel2, createFromParcel3, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WireFrequentFlyerView.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WireDisputeView.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RideReportStatus.valueOf(parcel.readString()), parcel.readInt() != 0 ? WireRideReport.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRideDetail[] newArray(int i) {
            return new WireRideDetail[i];
        }
    }

    public WireRideDetail(WireRide ride, List<WireBirdTrack> birdTracks, List<WireBirdEvent> birdEvents, Float f, WireReceipt receipt, WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation, List<WireCoupon> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, WireFrequentFlyerView wireFrequentFlyerView, WireDisputeView wireDisputeView, RideReportStatus rideReportStatus, WireRideReport wireRideReport) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(birdTracks, "birdTracks");
        Intrinsics.checkNotNullParameter(birdEvents, "birdEvents");
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        this.ride = ride;
        this.birdTracks = birdTracks;
        this.birdEvents = birdEvents;
        this.rating = f;
        this.receipt = receipt;
        this.rideEndRidePhotoParkingEvaluation = wireEndRidePhotoParkingEvaluation;
        this.coupons = list;
        this.distance = str;
        this.duration = str2;
        this.cost = str3;
        this.costWithoutCoupon = str4;
        this.subtext = str5;
        this.title = str6;
        this.detail = str7;
        this.imageUrl = str8;
        this.costImageUrl = str9;
        this.frequentFlyerView = wireFrequentFlyerView;
        this.dispute = wireDisputeView;
        this.reportStatus = rideReportStatus;
        this.report = wireRideReport;
    }

    public final boolean cancelled() {
        if (this.ride.getCost() == 0) {
            WireBird bird = this.ride.getBird();
            if ((bird != null ? bird.getPrivateBird() : null) == null) {
                return true;
            }
        }
        return false;
    }

    public final WireRide component1() {
        return this.ride;
    }

    public final String component10() {
        return this.cost;
    }

    public final String component11() {
        return this.costWithoutCoupon;
    }

    public final String component12() {
        return this.subtext;
    }

    public final String component13() {
        return this.title;
    }

    public final String component14() {
        return this.detail;
    }

    public final String component15() {
        return this.imageUrl;
    }

    public final String component16() {
        return this.costImageUrl;
    }

    public final WireFrequentFlyerView component17() {
        return this.frequentFlyerView;
    }

    public final WireDisputeView component18() {
        return this.dispute;
    }

    public final RideReportStatus component19() {
        return this.reportStatus;
    }

    public final List<WireBirdTrack> component2() {
        return this.birdTracks;
    }

    public final WireRideReport component20() {
        return this.report;
    }

    public final List<WireBirdEvent> component3() {
        return this.birdEvents;
    }

    public final Float component4() {
        return this.rating;
    }

    public final WireReceipt component5() {
        return this.receipt;
    }

    public final WireEndRidePhotoParkingEvaluation component6() {
        return this.rideEndRidePhotoParkingEvaluation;
    }

    public final List<WireCoupon> component7() {
        return this.coupons;
    }

    public final String component8() {
        return this.distance;
    }

    public final String component9() {
        return this.duration;
    }

    public final WireRideDetail copy(WireRide ride, List<WireBirdTrack> birdTracks, List<WireBirdEvent> birdEvents, Float f, WireReceipt receipt, WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation, List<WireCoupon> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, WireFrequentFlyerView wireFrequentFlyerView, WireDisputeView wireDisputeView, RideReportStatus rideReportStatus, WireRideReport wireRideReport) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(birdTracks, "birdTracks");
        Intrinsics.checkNotNullParameter(birdEvents, "birdEvents");
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        return new WireRideDetail(ride, birdTracks, birdEvents, f, receipt, wireEndRidePhotoParkingEvaluation, list, str, str2, str3, str4, str5, str6, str7, str8, str9, wireFrequentFlyerView, wireDisputeView, rideReportStatus, wireRideReport);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRideDetail) {
            WireRideDetail wireRideDetail = (WireRideDetail) obj;
            return Intrinsics.areEqual(this.ride, wireRideDetail.ride) && Intrinsics.areEqual(this.birdTracks, wireRideDetail.birdTracks) && Intrinsics.areEqual(this.birdEvents, wireRideDetail.birdEvents) && Intrinsics.areEqual((Object) this.rating, (Object) wireRideDetail.rating) && Intrinsics.areEqual(this.receipt, wireRideDetail.receipt) && Intrinsics.areEqual(this.rideEndRidePhotoParkingEvaluation, wireRideDetail.rideEndRidePhotoParkingEvaluation) && Intrinsics.areEqual(this.coupons, wireRideDetail.coupons) && Intrinsics.areEqual(this.distance, wireRideDetail.distance) && Intrinsics.areEqual(this.duration, wireRideDetail.duration) && Intrinsics.areEqual(this.cost, wireRideDetail.cost) && Intrinsics.areEqual(this.costWithoutCoupon, wireRideDetail.costWithoutCoupon) && Intrinsics.areEqual(this.subtext, wireRideDetail.subtext) && Intrinsics.areEqual(this.title, wireRideDetail.title) && Intrinsics.areEqual(this.detail, wireRideDetail.detail) && Intrinsics.areEqual(this.imageUrl, wireRideDetail.imageUrl) && Intrinsics.areEqual(this.costImageUrl, wireRideDetail.costImageUrl) && Intrinsics.areEqual(this.frequentFlyerView, wireRideDetail.frequentFlyerView) && Intrinsics.areEqual(this.dispute, wireRideDetail.dispute) && this.reportStatus == wireRideDetail.reportStatus && Intrinsics.areEqual(this.report, wireRideDetail.report);
        }
        return false;
    }

    public final List<WireBirdEvent> getBirdEvents() {
        return this.birdEvents;
    }

    public final List<WireBirdTrack> getBirdTracks() {
        return this.birdTracks;
    }

    public final String getCost() {
        return this.cost;
    }

    public final String getCostImageUrl() {
        return this.costImageUrl;
    }

    public final String getCostWithoutCoupon() {
        return this.costWithoutCoupon;
    }

    public final List<WireCoupon> getCoupons() {
        return this.coupons;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final WireDisputeView getDispute() {
        return this.dispute;
    }

    public final String getDistance() {
        return this.distance;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final WireFrequentFlyerView getFrequentFlyerView() {
        return this.frequentFlyerView;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final WireReceipt getReceipt() {
        return this.receipt;
    }

    public final WireRideReport getReport() {
        return this.report;
    }

    public final RideReportStatus getReportStatus() {
        return this.reportStatus;
    }

    public final WireRide getRide() {
        return this.ride;
    }

    public final WireEndRidePhotoParkingEvaluation getRideEndRidePhotoParkingEvaluation() {
        return this.rideEndRidePhotoParkingEvaluation;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((this.ride.hashCode() * 31) + this.birdTracks.hashCode()) * 31) + this.birdEvents.hashCode()) * 31;
        Float f = this.rating;
        int hashCode2 = (((hashCode + (f == null ? 0 : f.hashCode())) * 31) + this.receipt.hashCode()) * 31;
        WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation = this.rideEndRidePhotoParkingEvaluation;
        int hashCode3 = (hashCode2 + (wireEndRidePhotoParkingEvaluation == null ? 0 : wireEndRidePhotoParkingEvaluation.hashCode())) * 31;
        List<WireCoupon> list = this.coupons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.distance;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.duration;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cost;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.costWithoutCoupon;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subtext;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.title;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.detail;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.imageUrl;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.costImageUrl;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        WireFrequentFlyerView wireFrequentFlyerView = this.frequentFlyerView;
        int hashCode14 = (hashCode13 + (wireFrequentFlyerView == null ? 0 : wireFrequentFlyerView.hashCode())) * 31;
        WireDisputeView wireDisputeView = this.dispute;
        int hashCode15 = (hashCode14 + (wireDisputeView == null ? 0 : wireDisputeView.hashCode())) * 31;
        RideReportStatus rideReportStatus = this.reportStatus;
        int hashCode16 = (hashCode15 + (rideReportStatus == null ? 0 : rideReportStatus.hashCode())) * 31;
        WireRideReport wireRideReport = this.report;
        return hashCode16 + (wireRideReport != null ? wireRideReport.hashCode() : 0);
    }

    public final void setRating(Float f) {
        this.rating = f;
    }

    public String toString() {
        String id = this.ride.getId();
        Float f = this.rating;
        WireReceipt wireReceipt = this.receipt;
        WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation = this.rideEndRidePhotoParkingEvaluation;
        List<WireCoupon> list = this.coupons;
        String str = this.distance;
        String str2 = this.duration;
        String str3 = this.cost;
        String str4 = this.costWithoutCoupon;
        String str5 = this.subtext;
        String str6 = this.title;
        String str7 = this.detail;
        String str8 = this.imageUrl;
        String str9 = this.costImageUrl;
        WireFrequentFlyerView wireFrequentFlyerView = this.frequentFlyerView;
        WireDisputeView wireDisputeView = this.dispute;
        return "WireRideDetail(rideId = " + id + ", rating=" + f + ", receipt=" + wireReceipt + ", rideEndRidePhotoParkingEvaluation=" + wireEndRidePhotoParkingEvaluation + ", coupons=" + list + ", distance=" + str + ", duration=" + str2 + ", cost=" + str3 + ", costWithoutCoupon=" + str4 + ", subtext=" + str5 + ", title=" + str6 + ", detail=" + str7 + ", imageUrl=" + str8 + ", costImageUrl=" + str9 + ", frequentFlyerView=" + wireFrequentFlyerView + ", dispute=" + wireDisputeView + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.ride.writeToParcel(out, i);
        List<WireBirdTrack> list = this.birdTracks;
        out.writeInt(list.size());
        for (WireBirdTrack wireBirdTrack : list) {
            wireBirdTrack.writeToParcel(out, i);
        }
        List<WireBirdEvent> list2 = this.birdEvents;
        out.writeInt(list2.size());
        for (WireBirdEvent wireBirdEvent : list2) {
            wireBirdEvent.writeToParcel(out, i);
        }
        Float f = this.rating;
        if (f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f.floatValue());
        }
        this.receipt.writeToParcel(out, i);
        WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation = this.rideEndRidePhotoParkingEvaluation;
        if (wireEndRidePhotoParkingEvaluation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireEndRidePhotoParkingEvaluation.writeToParcel(out, i);
        }
        List<WireCoupon> list3 = this.coupons;
        if (list3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list3.size());
            for (WireCoupon wireCoupon : list3) {
                wireCoupon.writeToParcel(out, i);
            }
        }
        out.writeString(this.distance);
        out.writeString(this.duration);
        out.writeString(this.cost);
        out.writeString(this.costWithoutCoupon);
        out.writeString(this.subtext);
        out.writeString(this.title);
        out.writeString(this.detail);
        out.writeString(this.imageUrl);
        out.writeString(this.costImageUrl);
        WireFrequentFlyerView wireFrequentFlyerView = this.frequentFlyerView;
        if (wireFrequentFlyerView == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireFrequentFlyerView.writeToParcel(out, i);
        }
        WireDisputeView wireDisputeView = this.dispute;
        if (wireDisputeView == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireDisputeView.writeToParcel(out, i);
        }
        RideReportStatus rideReportStatus = this.reportStatus;
        if (rideReportStatus == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(rideReportStatus.name());
        }
        WireRideReport wireRideReport = this.report;
        if (wireRideReport == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        wireRideReport.writeToParcel(out, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireRideDetail(WireRide wireRide, List list, List list2, Float f, WireReceipt wireReceipt, WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation, List list3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, WireFrequentFlyerView wireFrequentFlyerView, WireDisputeView wireDisputeView, RideReportStatus rideReportStatus, WireRideReport wireRideReport, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireRide, r4, r5, (i & 8) != 0 ? null : f, wireReceipt, (i & 32) != 0 ? null : wireEndRidePhotoParkingEvaluation, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : str8, (32768 & i) != 0 ? null : str9, (65536 & i) != 0 ? null : wireFrequentFlyerView, (131072 & i) != 0 ? null : wireDisputeView, (262144 & i) != 0 ? null : rideReportStatus, (i & 524288) != 0 ? null : wireRideReport);
        List list4;
        List list5;
        List emptyList;
        List emptyList2;
        if ((i & 2) != 0) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            list4 = emptyList2;
        } else {
            list4 = list;
        }
        if ((i & 4) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list5 = emptyList;
        } else {
            list5 = list2;
        }
    }
}
