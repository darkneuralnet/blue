package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/wire/WireVehicleModel;", "Landroid/os/Parcelable;", Action.CLASS_ATTRIBUTE, "", RequestHeadersFactory.MODEL, "pricing", "Lco/bird/android/model/wire/WireRidePrice;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireRidePrice;)V", "getClass", "()Ljava/lang/String;", "getModel", "getPricing", "()Lco/bird/android/model/wire/WireRidePrice;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireVehicleModel implements Parcelable {
    public static final Parcelable.Creator<WireVehicleModel> CREATOR = new Creator();
    @JsonProperty(Action.CLASS_ATTRIBUTE)
    @InterfaceC41208ft5(Action.CLASS_ATTRIBUTE)

    /* renamed from: class  reason: not valid java name */
    private final String f122579class;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final String model;
    @JsonProperty("pricing")
    @InterfaceC41208ft5("pricing")
    private final WireRidePrice pricing;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireVehicleModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireVehicleModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireVehicleModel(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : WireRidePrice.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireVehicleModel[] newArray(int i) {
            return new WireVehicleModel[i];
        }
    }

    public WireVehicleModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireVehicleModel copy$default(WireVehicleModel wireVehicleModel, String str, String str2, WireRidePrice wireRidePrice, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireVehicleModel.f122579class;
        }
        if ((i & 2) != 0) {
            str2 = wireVehicleModel.model;
        }
        if ((i & 4) != 0) {
            wireRidePrice = wireVehicleModel.pricing;
        }
        return wireVehicleModel.copy(str, str2, wireRidePrice);
    }

    public final String component1() {
        return this.f122579class;
    }

    public final String component2() {
        return this.model;
    }

    public final WireRidePrice component3() {
        return this.pricing;
    }

    public final WireVehicleModel copy(String str, String str2, WireRidePrice wireRidePrice) {
        return new WireVehicleModel(str, str2, wireRidePrice);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireVehicleModel) {
            WireVehicleModel wireVehicleModel = (WireVehicleModel) obj;
            return Intrinsics.areEqual(this.f122579class, wireVehicleModel.f122579class) && Intrinsics.areEqual(this.model, wireVehicleModel.model) && Intrinsics.areEqual(this.pricing, wireVehicleModel.pricing);
        }
        return false;
    }

    public final String getClass() {
        return this.f122579class;
    }

    public final String getModel() {
        return this.model;
    }

    public final WireRidePrice getPricing() {
        return this.pricing;
    }

    public int hashCode() {
        String str = this.f122579class;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.model;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WireRidePrice wireRidePrice = this.pricing;
        return hashCode2 + (wireRidePrice != null ? wireRidePrice.hashCode() : 0);
    }

    public String toString() {
        String str = this.f122579class;
        String str2 = this.model;
        WireRidePrice wireRidePrice = this.pricing;
        return "WireVehicleModel(class=" + str + ", model=" + str2 + ", pricing=" + wireRidePrice + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f122579class);
        out.writeString(this.model);
        WireRidePrice wireRidePrice = this.pricing;
        if (wireRidePrice == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        wireRidePrice.writeToParcel(out, i);
    }

    public WireVehicleModel(String str, String str2, WireRidePrice wireRidePrice) {
        this.f122579class = str;
        this.model = str2;
        this.pricing = wireRidePrice;
    }

    public /* synthetic */ WireVehicleModel(String str, String str2, WireRidePrice wireRidePrice, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : wireRidePrice);
    }
}
