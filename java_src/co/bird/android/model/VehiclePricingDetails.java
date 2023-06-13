package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\u001a\u0010\u0016\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u0012J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/VehiclePricingDetails;", "Landroid/os/Parcelable;", "emptyState", "Lco/bird/android/model/VehiclePricingDetailsEmptyState;", "vehiclePrices", "", "Lco/bird/android/model/VehiclePricing;", "(Lco/bird/android/model/VehiclePricingDetailsEmptyState;Ljava/util/List;)V", "getEmptyState", "()Lco/bird/android/model/VehiclePricingDetailsEmptyState;", "getVehiclePrices", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "pricingChanged", "ignoreEmptyState", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nVehiclePricingDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclePricingDetails.kt\nco/bird/android/model/VehiclePricingDetails\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1855#2,2:34\n*S KotlinDebug\n*F\n+ 1 VehiclePricingDetails.kt\nco/bird/android/model/VehiclePricingDetails\n*L\n24#1:34,2\n*E\n"})
/* loaded from: classes4.dex */
public final class VehiclePricingDetails implements Parcelable {
    public static final Parcelable.Creator<VehiclePricingDetails> CREATOR = new Creator();
    @JsonProperty("empty_state")
    @InterfaceC41208ft5("empty_state")
    private final VehiclePricingDetailsEmptyState emptyState;
    @JsonProperty("vehicle_prices")
    @InterfaceC41208ft5("vehicle_prices")
    private final List<VehiclePricing> vehiclePrices;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<VehiclePricingDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehiclePricingDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            VehiclePricingDetailsEmptyState createFromParcel = parcel.readInt() == 0 ? null : VehiclePricingDetailsEmptyState.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(VehiclePricing.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new VehiclePricingDetails(createFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VehiclePricingDetails[] newArray(int i) {
            return new VehiclePricingDetails[i];
        }
    }

    public VehiclePricingDetails() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VehiclePricingDetails copy$default(VehiclePricingDetails vehiclePricingDetails, VehiclePricingDetailsEmptyState vehiclePricingDetailsEmptyState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            vehiclePricingDetailsEmptyState = vehiclePricingDetails.emptyState;
        }
        if ((i & 2) != 0) {
            list = vehiclePricingDetails.vehiclePrices;
        }
        return vehiclePricingDetails.copy(vehiclePricingDetailsEmptyState, list);
    }

    public static /* synthetic */ boolean pricingChanged$default(VehiclePricingDetails vehiclePricingDetails, VehiclePricingDetails vehiclePricingDetails2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return vehiclePricingDetails.pricingChanged(vehiclePricingDetails2, z);
    }

    public final VehiclePricingDetailsEmptyState component1() {
        return this.emptyState;
    }

    public final List<VehiclePricing> component2() {
        return this.vehiclePrices;
    }

    public final VehiclePricingDetails copy(VehiclePricingDetailsEmptyState vehiclePricingDetailsEmptyState, List<VehiclePricing> list) {
        return new VehiclePricingDetails(vehiclePricingDetailsEmptyState, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehiclePricingDetails) {
            VehiclePricingDetails vehiclePricingDetails = (VehiclePricingDetails) obj;
            return Intrinsics.areEqual(this.emptyState, vehiclePricingDetails.emptyState) && Intrinsics.areEqual(this.vehiclePrices, vehiclePricingDetails.vehiclePrices);
        }
        return false;
    }

    public final VehiclePricingDetailsEmptyState getEmptyState() {
        return this.emptyState;
    }

    public final List<VehiclePricing> getVehiclePrices() {
        return this.vehiclePrices;
    }

    public int hashCode() {
        VehiclePricingDetailsEmptyState vehiclePricingDetailsEmptyState = this.emptyState;
        int hashCode = (vehiclePricingDetailsEmptyState == null ? 0 : vehiclePricingDetailsEmptyState.hashCode()) * 31;
        List<VehiclePricing> list = this.vehiclePrices;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final boolean pricingChanged(VehiclePricingDetails vehiclePricingDetails, boolean z) {
        Integer num;
        boolean z2;
        if (vehiclePricingDetails != null && (z || Intrinsics.areEqual(this.emptyState, vehiclePricingDetails.emptyState))) {
            List<VehiclePricing> list = vehiclePricingDetails.vehiclePrices;
            Integer num2 = null;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            List<VehiclePricing> list2 = this.vehiclePrices;
            if (list2 != null) {
                num2 = Integer.valueOf(list2.size());
            }
            if (Intrinsics.areEqual(num, num2)) {
                List<VehiclePricing> list3 = this.vehiclePrices;
                if (list3 != null) {
                    for (VehiclePricing vehiclePricing : list3) {
                        List<VehiclePricing> list4 = vehiclePricingDetails.vehiclePrices;
                        if (list4 != null && list4.indexOf(vehiclePricing) == -1) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public String toString() {
        VehiclePricingDetailsEmptyState vehiclePricingDetailsEmptyState = this.emptyState;
        List<VehiclePricing> list = this.vehiclePrices;
        return "VehiclePricingDetails(emptyState=" + vehiclePricingDetailsEmptyState + ", vehiclePrices=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        VehiclePricingDetailsEmptyState vehiclePricingDetailsEmptyState = this.emptyState;
        if (vehiclePricingDetailsEmptyState == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            vehiclePricingDetailsEmptyState.writeToParcel(out, i);
        }
        List<VehiclePricing> list = this.vehiclePrices;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (VehiclePricing vehiclePricing : list) {
            vehiclePricing.writeToParcel(out, i);
        }
    }

    public VehiclePricingDetails(VehiclePricingDetailsEmptyState vehiclePricingDetailsEmptyState, List<VehiclePricing> list) {
        this.emptyState = vehiclePricingDetailsEmptyState;
        this.vehiclePrices = list;
    }

    public /* synthetic */ VehiclePricingDetails(VehiclePricingDetailsEmptyState vehiclePricingDetailsEmptyState, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : vehiclePricingDetailsEmptyState, (i & 2) != 0 ? null : list);
    }
}
