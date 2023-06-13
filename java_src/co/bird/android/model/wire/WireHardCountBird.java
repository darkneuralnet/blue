package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/WireHardCountBird;", "Landroid/os/Parcelable;", "id", "", RequestHeadersFactory.MODEL, PaymentMethodOptionsParams.Blik.PARAM_CODE, "scanDate", "modelVersionTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getId", "getModel", "getModelVersionTitle", "getScanDate", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireHardCountBird implements Parcelable {
    public static final Parcelable.Creator<WireHardCountBird> CREATOR = new Creator();
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66728id;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final String model;
    @JsonProperty("model_version_title")
    @InterfaceC41208ft5("model_version_title")
    private final String modelVersionTitle;
    @JsonProperty("scan_date")
    @InterfaceC41208ft5("scan_date")
    private final String scanDate;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireHardCountBird> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireHardCountBird createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireHardCountBird(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireHardCountBird[] newArray(int i) {
            return new WireHardCountBird[i];
        }
    }

    public WireHardCountBird() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WireHardCountBird copy$default(WireHardCountBird wireHardCountBird, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireHardCountBird.f66728id;
        }
        if ((i & 2) != 0) {
            str2 = wireHardCountBird.model;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = wireHardCountBird.code;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = wireHardCountBird.scanDate;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = wireHardCountBird.modelVersionTitle;
        }
        return wireHardCountBird.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.f66728id;
    }

    public final String component2() {
        return this.model;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.scanDate;
    }

    public final String component5() {
        return this.modelVersionTitle;
    }

    public final WireHardCountBird copy(String id, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new WireHardCountBird(id, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireHardCountBird) {
            WireHardCountBird wireHardCountBird = (WireHardCountBird) obj;
            return Intrinsics.areEqual(this.f66728id, wireHardCountBird.f66728id) && Intrinsics.areEqual(this.model, wireHardCountBird.model) && Intrinsics.areEqual(this.code, wireHardCountBird.code) && Intrinsics.areEqual(this.scanDate, wireHardCountBird.scanDate) && Intrinsics.areEqual(this.modelVersionTitle, wireHardCountBird.modelVersionTitle);
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.f66728id;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getModelVersionTitle() {
        return this.modelVersionTitle;
    }

    public final String getScanDate() {
        return this.scanDate;
    }

    public int hashCode() {
        int hashCode = this.f66728id.hashCode() * 31;
        String str = this.model;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scanDate;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.modelVersionTitle;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66728id;
        String str2 = this.model;
        String str3 = this.code;
        String str4 = this.scanDate;
        String str5 = this.modelVersionTitle;
        return "WireHardCountBird(id=" + str + ", model=" + str2 + ", code=" + str3 + ", scanDate=" + str4 + ", modelVersionTitle=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66728id);
        out.writeString(this.model);
        out.writeString(this.code);
        out.writeString(this.scanDate);
        out.writeString(this.modelVersionTitle);
    }

    public WireHardCountBird(String id, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66728id = id;
        this.model = str;
        this.code = str2;
        this.scanDate = str3;
        this.modelVersionTitle = str4;
    }

    public /* synthetic */ WireHardCountBird(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
