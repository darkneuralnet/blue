package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/FlightSheetEUTag;", "Landroid/os/Parcelable;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "gpsAt", "Lorg/joda/time/DateTime;", "profileOptions", "", "Lco/bird/android/model/RadarProfileOption;", "(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "getGpsAt", "()Lorg/joda/time/DateTime;", "getProfileOptions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetEUTag implements Parcelable {
    public static final Parcelable.Creator<FlightSheetEUTag> CREATOR = new Creator();
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("gps_at")
    @InterfaceC41208ft5("gps_at")
    private final DateTime gpsAt;
    @JsonProperty("profile_options")
    @InterfaceC41208ft5("profile_options")
    private final List<RadarProfileOption> profileOptions;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<FlightSheetEUTag> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlightSheetEUTag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(RadarProfileOption.CREATOR.createFromParcel(parcel));
            }
            return new FlightSheetEUTag(readString, dateTime, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlightSheetEUTag[] newArray(int i) {
            return new FlightSheetEUTag[i];
        }
    }

    public FlightSheetEUTag() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightSheetEUTag copy$default(FlightSheetEUTag flightSheetEUTag, String str, DateTime dateTime, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightSheetEUTag.code;
        }
        if ((i & 2) != 0) {
            dateTime = flightSheetEUTag.gpsAt;
        }
        if ((i & 4) != 0) {
            list = flightSheetEUTag.profileOptions;
        }
        return flightSheetEUTag.copy(str, dateTime, list);
    }

    public final String component1() {
        return this.code;
    }

    public final DateTime component2() {
        return this.gpsAt;
    }

    public final List<RadarProfileOption> component3() {
        return this.profileOptions;
    }

    public final FlightSheetEUTag copy(String code, DateTime dateTime, List<RadarProfileOption> profileOptions) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(profileOptions, "profileOptions");
        return new FlightSheetEUTag(code, dateTime, profileOptions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetEUTag) {
            FlightSheetEUTag flightSheetEUTag = (FlightSheetEUTag) obj;
            return Intrinsics.areEqual(this.code, flightSheetEUTag.code) && Intrinsics.areEqual(this.gpsAt, flightSheetEUTag.gpsAt) && Intrinsics.areEqual(this.profileOptions, flightSheetEUTag.profileOptions);
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final DateTime getGpsAt() {
        return this.gpsAt;
    }

    public final List<RadarProfileOption> getProfileOptions() {
        return this.profileOptions;
    }

    public int hashCode() {
        int hashCode = this.code.hashCode() * 31;
        DateTime dateTime = this.gpsAt;
        return ((hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31) + this.profileOptions.hashCode();
    }

    public String toString() {
        String str = this.code;
        DateTime dateTime = this.gpsAt;
        List<RadarProfileOption> list = this.profileOptions;
        return "FlightSheetEUTag(code=" + str + ", gpsAt=" + dateTime + ", profileOptions=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.code);
        out.writeSerializable(this.gpsAt);
        List<RadarProfileOption> list = this.profileOptions;
        out.writeInt(list.size());
        for (RadarProfileOption radarProfileOption : list) {
            radarProfileOption.writeToParcel(out, i);
        }
    }

    public FlightSheetEUTag(String code, DateTime dateTime, List<RadarProfileOption> profileOptions) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(profileOptions, "profileOptions");
        this.code = code;
        this.gpsAt = dateTime;
        this.profileOptions = profileOptions;
    }

    public /* synthetic */ FlightSheetEUTag(String str, DateTime dateTime, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : dateTime, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
