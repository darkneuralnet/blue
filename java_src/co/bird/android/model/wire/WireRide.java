package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.RideType;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0014\u0012\b\b\u0002\u0010 \u001a\u00020\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0002\u0010$J\u0006\u0010J\u001a\u00020\u0014J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010O\u001a\u00020\u0014HÆ\u0003J\t\u0010P\u001a\u00020\u0014HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010CJ\u000b\u0010R\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0014HÆ\u0003J\t\u0010Z\u001a\u00020\u0014HÆ\u0003J\t\u0010[\u001a\u00020\u0014HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u000bHÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u000eHÆ\u0003J´\u0002\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#HÆ\u0001¢\u0006\u0002\u0010fJ\t\u0010g\u001a\u00020\u000bHÖ\u0001J\u0006\u0010h\u001a\u00020\u000bJ\u0013\u0010i\u001a\u00020\u00142\b\u0010j\u001a\u0004\u0018\u00010kHÖ\u0003J\t\u0010l\u001a\u00020\u000bHÖ\u0001J\u0006\u0010m\u001a\u00020\u0014J\u0006\u0010n\u001a\u00020\u0014J\u0006\u0010o\u001a\u00020\u0014J\b\u0010p\u001a\u00020\u0003H\u0016J\u0019\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0016\u0010 \u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u00105R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0016\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u0016\u0010\u001e\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0016\u0010\u001f\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010+R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010+R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010+¨\u0006v"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "Landroid/os/Parcelable;", "id", "", "distance", "", "birdId", "bird", "Lco/bird/android/model/wire/WireBird;", "birdEphemeralId", "cost", "", "currency", "startedAt", "Lorg/joda/time/DateTime;", "deliveryUnlockedAt", "completedAt", "continuedAt", "canceledAt", "delivery", "", "payAsYouGo", "successfulTest", "type", "Lco/bird/android/model/constant/RideType;", "partnerId", "billedMinutes", "privateBirdId", "vehicleModel", "tipId", "startedInNoRideZone", "startedOutsideOperatingArea", "isBadAreaRideEnabled", "userGuestId", "rideDetail", "Lco/bird/android/model/wire/WireRideDetail;", "(Ljava/lang/String;DLjava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;ILjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/Boolean;Lco/bird/android/model/constant/RideType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Lco/bird/android/model/wire/WireRideDetail;)V", "getBilledMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBird", "()Lco/bird/android/model/wire/WireBird;", "getBirdEphemeralId", "()Ljava/lang/String;", "getBirdId", "getCanceledAt", "()Lorg/joda/time/DateTime;", "getCompletedAt", "getContinuedAt", "getCost", "()I", "getCurrency", "getDelivery", "()Z", "getDeliveryUnlockedAt", "getDistance", "()D", "getId", "getPartnerId", "getPayAsYouGo", "getPrivateBirdId", "getRideDetail", "()Lco/bird/android/model/wire/WireRideDetail;", "getStartedAt", "getStartedInNoRideZone", "getStartedOutsideOperatingArea", "getSuccessfulTest", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTipId", "getType", "()Lco/bird/android/model/constant/RideType;", "getUserGuestId", "getVehicleModel", "canEnd", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;DLjava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;ILjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/Boolean;Lco/bird/android/model/constant/RideType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRide;", "describeContents", "durationSeconds", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "isActive", "isGuestRide", "isPrimaryRide", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRide implements Parcelable {
    public static final Parcelable.Creator<WireRide> CREATOR = new Creator();
    @JsonProperty("billed_minutes")
    @InterfaceC41208ft5("billed_minutes")
    private final Integer billedMinutes;
    @JsonProperty("bird")
    @InterfaceC41208ft5("bird")
    private final WireBird bird;
    @JsonProperty("bird_ephemeral_id")
    @InterfaceC41208ft5("bird_ephemeral_id")
    private final String birdEphemeralId;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("canceled_at")
    @InterfaceC41208ft5("canceled_at")
    private final DateTime canceledAt;
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final DateTime completedAt;
    @JsonProperty("continued_at")
    @InterfaceC41208ft5("continued_at")
    private final DateTime continuedAt;
    @JsonProperty("cost")
    @InterfaceC41208ft5("cost")
    private final int cost;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("delivery")
    @InterfaceC41208ft5("delivery")
    private final boolean delivery;
    @JsonProperty("delivery_unlocked_at")
    @InterfaceC41208ft5("delivery_unlocked_at")
    private final DateTime deliveryUnlockedAt;
    @JsonProperty("distance")
    @InterfaceC41208ft5("distance")
    private final double distance;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66754id;
    @JsonProperty("bad_area_ride_enabled")
    @JsonAlias({"is_bad_area_ride_enabled"})
    @InterfaceC41208ft5(alternate = {"is_bad_area_ride_enabled"}, value = "bad_area_ride_enabled")
    private final boolean isBadAreaRideEnabled;
    @JsonProperty("partner_id")
    @InterfaceC41208ft5("partner_id")
    private final String partnerId;
    @JsonProperty("pay_as_you_go")
    @InterfaceC41208ft5("pay_as_you_go")
    private final boolean payAsYouGo;
    @JsonProperty("private_bird_id")
    @InterfaceC41208ft5("private_bird_id")
    private final String privateBirdId;
    private final WireRideDetail rideDetail;
    @JsonProperty("started_at")
    @InterfaceC41208ft5("started_at")
    private final DateTime startedAt;
    @JsonProperty("started_in_no_ride_zone")
    @InterfaceC41208ft5("started_in_no_ride_zone")
    private final boolean startedInNoRideZone;
    @JsonProperty("started_outside_operating_area")
    @InterfaceC41208ft5("started_outside_operating_area")
    private final boolean startedOutsideOperatingArea;
    @JsonProperty("success")
    @InterfaceC41208ft5("success")
    private final Boolean successfulTest;
    @JsonProperty("tip_id")
    @InterfaceC41208ft5("tip_id")
    private final String tipId;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final RideType type;
    @JsonProperty("user_guest_id")
    @InterfaceC41208ft5("user_guest_id")
    private final String userGuestId;
    @JsonProperty("vehicle_model")
    @InterfaceC41208ft5("vehicle_model")
    private final String vehicleModel;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireRide> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRide createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            double readDouble = parcel.readDouble();
            String readString2 = parcel.readString();
            WireBird createFromParcel = parcel.readInt() == 0 ? null : WireBird.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            String readString4 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            DateTime dateTime4 = (DateTime) parcel.readSerializable();
            DateTime dateTime5 = (DateTime) parcel.readSerializable();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WireRide(readString, readDouble, readString2, createFromParcel, readString3, readInt, readString4, dateTime, dateTime2, dateTime3, dateTime4, dateTime5, z, z2, valueOf, parcel.readInt() == 0 ? null : RideType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? WireRideDetail.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRide[] newArray(int i) {
            return new WireRide[i];
        }
    }

    public WireRide() {
        this(null, 0.0d, null, null, null, 0, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, false, false, null, null, 67108863, null);
    }

    public final boolean canEnd() {
        return !this.delivery || this.payAsYouGo;
    }

    public final String component1() {
        return this.f66754id;
    }

    public final DateTime component10() {
        return this.completedAt;
    }

    public final DateTime component11() {
        return this.continuedAt;
    }

    public final DateTime component12() {
        return this.canceledAt;
    }

    public final boolean component13() {
        return this.delivery;
    }

    public final boolean component14() {
        return this.payAsYouGo;
    }

    public final Boolean component15() {
        return this.successfulTest;
    }

    public final RideType component16() {
        return this.type;
    }

    public final String component17() {
        return this.partnerId;
    }

    public final Integer component18() {
        return this.billedMinutes;
    }

    public final String component19() {
        return this.privateBirdId;
    }

    public final double component2() {
        return this.distance;
    }

    public final String component20() {
        return this.vehicleModel;
    }

    public final String component21() {
        return this.tipId;
    }

    public final boolean component22() {
        return this.startedInNoRideZone;
    }

    public final boolean component23() {
        return this.startedOutsideOperatingArea;
    }

    public final boolean component24() {
        return this.isBadAreaRideEnabled;
    }

    public final String component25() {
        return this.userGuestId;
    }

    public final WireRideDetail component26() {
        return this.rideDetail;
    }

    public final String component3() {
        return this.birdId;
    }

    public final WireBird component4() {
        return this.bird;
    }

    public final String component5() {
        return this.birdEphemeralId;
    }

    public final int component6() {
        return this.cost;
    }

    public final String component7() {
        return this.currency;
    }

    public final DateTime component8() {
        return this.startedAt;
    }

    public final DateTime component9() {
        return this.deliveryUnlockedAt;
    }

    public final WireRide copy(String id, double d, String str, WireBird wireBird, String str2, int i, String currency, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, boolean z, boolean z2, Boolean bool, RideType rideType, String str3, Integer num, String str4, String str5, String str6, boolean z3, boolean z4, boolean z5, String str7, WireRideDetail wireRideDetail) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new WireRide(id, d, str, wireBird, str2, i, currency, dateTime, dateTime2, dateTime3, dateTime4, dateTime5, z, z2, bool, rideType, str3, num, str4, str5, str6, z3, z4, z5, str7, wireRideDetail);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int durationSeconds() {
        DateTime dateTime;
        if (this.delivery && this.payAsYouGo) {
            dateTime = this.deliveryUnlockedAt;
        } else {
            dateTime = this.startedAt;
        }
        if (dateTime != null) {
            DateTime dateTime2 = this.completedAt;
            if (dateTime2 == null) {
                dateTime2 = DateTime.now();
            }
            return Math.abs(Seconds.secondsBetween(dateTime, dateTime2).getSeconds());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRide) {
            WireRide wireRide = (WireRide) obj;
            return Intrinsics.areEqual(this.f66754id, wireRide.f66754id) && Double.compare(this.distance, wireRide.distance) == 0 && Intrinsics.areEqual(this.birdId, wireRide.birdId) && Intrinsics.areEqual(this.bird, wireRide.bird) && Intrinsics.areEqual(this.birdEphemeralId, wireRide.birdEphemeralId) && this.cost == wireRide.cost && Intrinsics.areEqual(this.currency, wireRide.currency) && Intrinsics.areEqual(this.startedAt, wireRide.startedAt) && Intrinsics.areEqual(this.deliveryUnlockedAt, wireRide.deliveryUnlockedAt) && Intrinsics.areEqual(this.completedAt, wireRide.completedAt) && Intrinsics.areEqual(this.continuedAt, wireRide.continuedAt) && Intrinsics.areEqual(this.canceledAt, wireRide.canceledAt) && this.delivery == wireRide.delivery && this.payAsYouGo == wireRide.payAsYouGo && Intrinsics.areEqual(this.successfulTest, wireRide.successfulTest) && this.type == wireRide.type && Intrinsics.areEqual(this.partnerId, wireRide.partnerId) && Intrinsics.areEqual(this.billedMinutes, wireRide.billedMinutes) && Intrinsics.areEqual(this.privateBirdId, wireRide.privateBirdId) && Intrinsics.areEqual(this.vehicleModel, wireRide.vehicleModel) && Intrinsics.areEqual(this.tipId, wireRide.tipId) && this.startedInNoRideZone == wireRide.startedInNoRideZone && this.startedOutsideOperatingArea == wireRide.startedOutsideOperatingArea && this.isBadAreaRideEnabled == wireRide.isBadAreaRideEnabled && Intrinsics.areEqual(this.userGuestId, wireRide.userGuestId) && Intrinsics.areEqual(this.rideDetail, wireRide.rideDetail);
        }
        return false;
    }

    public final Integer getBilledMinutes() {
        return this.billedMinutes;
    }

    public final WireBird getBird() {
        return this.bird;
    }

    public final String getBirdEphemeralId() {
        return this.birdEphemeralId;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final DateTime getCanceledAt() {
        return this.canceledAt;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final DateTime getContinuedAt() {
        return this.continuedAt;
    }

    public final int getCost() {
        return this.cost;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getDelivery() {
        return this.delivery;
    }

    public final DateTime getDeliveryUnlockedAt() {
        return this.deliveryUnlockedAt;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final String getId() {
        return this.f66754id;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final boolean getPayAsYouGo() {
        return this.payAsYouGo;
    }

    public final String getPrivateBirdId() {
        return this.privateBirdId;
    }

    public final WireRideDetail getRideDetail() {
        return this.rideDetail;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    public final boolean getStartedInNoRideZone() {
        return this.startedInNoRideZone;
    }

    public final boolean getStartedOutsideOperatingArea() {
        return this.startedOutsideOperatingArea;
    }

    public final Boolean getSuccessfulTest() {
        return this.successfulTest;
    }

    public final String getTipId() {
        return this.tipId;
    }

    public final RideType getType() {
        return this.type;
    }

    public final String getUserGuestId() {
        return this.userGuestId;
    }

    public final String getVehicleModel() {
        return this.vehicleModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f66754id.hashCode() * 31) + Double.hashCode(this.distance)) * 31;
        String str = this.birdId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        WireBird wireBird = this.bird;
        int hashCode3 = (hashCode2 + (wireBird == null ? 0 : wireBird.hashCode())) * 31;
        String str2 = this.birdEphemeralId;
        int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.cost)) * 31) + this.currency.hashCode()) * 31;
        DateTime dateTime = this.startedAt;
        int hashCode5 = (hashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.deliveryUnlockedAt;
        int hashCode6 = (hashCode5 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.completedAt;
        int hashCode7 = (hashCode6 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.continuedAt;
        int hashCode8 = (hashCode7 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        DateTime dateTime5 = this.canceledAt;
        int hashCode9 = (hashCode8 + (dateTime5 == null ? 0 : dateTime5.hashCode())) * 31;
        boolean z = this.delivery;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode9 + i) * 31;
        boolean z2 = this.payAsYouGo;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        Boolean bool = this.successfulTest;
        int hashCode10 = (i4 + (bool == null ? 0 : bool.hashCode())) * 31;
        RideType rideType = this.type;
        int hashCode11 = (hashCode10 + (rideType == null ? 0 : rideType.hashCode())) * 31;
        String str3 = this.partnerId;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.billedMinutes;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.privateBirdId;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.vehicleModel;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tipId;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z3 = this.startedInNoRideZone;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode16 + i5) * 31;
        boolean z4 = this.startedOutsideOperatingArea;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.isBadAreaRideEnabled;
        int i9 = (i8 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        String str7 = this.userGuestId;
        int hashCode17 = (i9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        WireRideDetail wireRideDetail = this.rideDetail;
        return hashCode17 + (wireRideDetail != null ? wireRideDetail.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.startedAt != null && this.completedAt == null && this.canceledAt == null;
    }

    public final boolean isBadAreaRideEnabled() {
        return this.isBadAreaRideEnabled;
    }

    public final boolean isGuestRide() {
        return this.userGuestId != null;
    }

    public final boolean isPrimaryRide() {
        return this.userGuestId == null;
    }

    public String toString() {
        String str = this.f66754id;
        double d = this.distance;
        String str2 = this.birdId;
        WireBird wireBird = this.bird;
        String str3 = this.birdEphemeralId;
        int i = this.cost;
        String str4 = this.currency;
        DateTime dateTime = this.startedAt;
        DateTime dateTime2 = this.deliveryUnlockedAt;
        DateTime dateTime3 = this.completedAt;
        DateTime dateTime4 = this.continuedAt;
        DateTime dateTime5 = this.canceledAt;
        boolean z = this.delivery;
        boolean z2 = this.payAsYouGo;
        String str5 = this.partnerId;
        Integer num = this.billedMinutes;
        String str6 = this.privateBirdId;
        String str7 = this.vehicleModel;
        String str8 = this.tipId;
        boolean z3 = this.startedInNoRideZone;
        boolean z4 = this.startedOutsideOperatingArea;
        boolean z5 = this.isBadAreaRideEnabled;
        String str9 = this.userGuestId;
        WireRideDetail wireRideDetail = this.rideDetail;
        return "WireRide(id=" + str + ", distance=" + d + ", birdId=" + str2 + ", bird=" + wireBird + ", birdEphemeralId=" + str3 + ", cost=" + i + ", currency=" + str4 + ", startedAt=" + dateTime + ", deliveryUnlockedAt=" + dateTime2 + ", completedAt=" + dateTime3 + ", continuedAt=" + dateTime4 + ", canceledAt=" + dateTime5 + ", delivery=" + z + ", payAsYouGo=" + z2 + ", partnerId=" + str5 + ", billedMinutes=" + num + ", privateBirdId=" + str6 + ", vehicleModel=" + str7 + ", tipId=" + str8 + ", startedInNoRideZone=" + z3 + ", startedOutsideOperatingArea=" + z4 + ", isBadAreaRideEnabled=" + z5 + ", userGuestId=" + str9 + ", rideDetail=" + wireRideDetail + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66754id);
        out.writeDouble(this.distance);
        out.writeString(this.birdId);
        WireBird wireBird = this.bird;
        if (wireBird == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wireBird.writeToParcel(out, i);
        }
        out.writeString(this.birdEphemeralId);
        out.writeInt(this.cost);
        out.writeString(this.currency);
        out.writeSerializable(this.startedAt);
        out.writeSerializable(this.deliveryUnlockedAt);
        out.writeSerializable(this.completedAt);
        out.writeSerializable(this.continuedAt);
        out.writeSerializable(this.canceledAt);
        out.writeInt(this.delivery ? 1 : 0);
        out.writeInt(this.payAsYouGo ? 1 : 0);
        Boolean bool = this.successfulTest;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        RideType rideType = this.type;
        if (rideType == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(rideType.name());
        }
        out.writeString(this.partnerId);
        Integer num = this.billedMinutes;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.privateBirdId);
        out.writeString(this.vehicleModel);
        out.writeString(this.tipId);
        out.writeInt(this.startedInNoRideZone ? 1 : 0);
        out.writeInt(this.startedOutsideOperatingArea ? 1 : 0);
        out.writeInt(this.isBadAreaRideEnabled ? 1 : 0);
        out.writeString(this.userGuestId);
        WireRideDetail wireRideDetail = this.rideDetail;
        if (wireRideDetail == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        wireRideDetail.writeToParcel(out, i);
    }

    public WireRide(String id, double d, String str, WireBird wireBird, String str2, int i, String currency, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, boolean z, boolean z2, Boolean bool, RideType rideType, String str3, Integer num, String str4, String str5, String str6, boolean z3, boolean z4, boolean z5, String str7, WireRideDetail wireRideDetail) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f66754id = id;
        this.distance = d;
        this.birdId = str;
        this.bird = wireBird;
        this.birdEphemeralId = str2;
        this.cost = i;
        this.currency = currency;
        this.startedAt = dateTime;
        this.deliveryUnlockedAt = dateTime2;
        this.completedAt = dateTime3;
        this.continuedAt = dateTime4;
        this.canceledAt = dateTime5;
        this.delivery = z;
        this.payAsYouGo = z2;
        this.successfulTest = bool;
        this.type = rideType;
        this.partnerId = str3;
        this.billedMinutes = num;
        this.privateBirdId = str4;
        this.vehicleModel = str5;
        this.tipId = str6;
        this.startedInNoRideZone = z3;
        this.startedOutsideOperatingArea = z4;
        this.isBadAreaRideEnabled = z5;
        this.userGuestId = str7;
        this.rideDetail = wireRideDetail;
    }

    public /* synthetic */ WireRide(String str, double d, String str2, WireBird wireBird, String str3, int i, String str4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, boolean z, boolean z2, Boolean bool, RideType rideType, String str5, Integer num, String str6, String str7, String str8, boolean z3, boolean z4, boolean z5, String str9, WireRideDetail wireRideDetail, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : wireBird, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? Source.USD : str4, (i2 & 128) != 0 ? null : dateTime, (i2 & 256) != 0 ? null : dateTime2, (i2 & 512) != 0 ? null : dateTime3, (i2 & 1024) != 0 ? null : dateTime4, (i2 & 2048) != 0 ? null : dateTime5, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? false : z2, (i2 & 16384) != 0 ? null : bool, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : rideType, (i2 & 65536) != 0 ? null : str5, (i2 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : num, (i2 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : str6, (i2 & 524288) != 0 ? null : str7, (i2 & 1048576) != 0 ? null : str8, (i2 & 2097152) != 0 ? false : z3, (i2 & 4194304) != 0 ? false : z4, (i2 & 8388608) != 0 ? false : z5, (i2 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str9, (i2 & 33554432) != 0 ? null : wireRideDetail);
    }
}
