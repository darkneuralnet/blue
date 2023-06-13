package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\bHÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/AvailableDeliveries;", "Landroid/os/Parcelable;", "showActiveDrops", "", "deliveries", "", "Lco/bird/android/model/Delivery;", "minDeliveriesRequired", "", "currentRoute", "Lco/bird/android/model/DeliveryRoute;", "(ZLjava/util/List;ILco/bird/android/model/DeliveryRoute;)V", "getCurrentRoute", "()Lco/bird/android/model/DeliveryRoute;", "getDeliveries", "()Ljava/util/List;", "getMinDeliveriesRequired", "()I", "getShowActiveDrops", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AvailableDeliveries implements Parcelable {
    public static final Parcelable.Creator<AvailableDeliveries> CREATOR = new Creator();
    @JsonProperty("current_route")
    @InterfaceC41208ft5("current_route")
    private final DeliveryRoute currentRoute;
    @JsonProperty("deliveries")
    @InterfaceC41208ft5("deliveries")
    private final List<Delivery> deliveries;
    @JsonProperty("min_deliveries_required")
    @InterfaceC41208ft5("min_deliveries_required")
    private final int minDeliveriesRequired;
    @JsonProperty("show_active_drops")
    @InterfaceC41208ft5("show_active_drops")
    private final boolean showActiveDrops;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<AvailableDeliveries> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableDeliveries createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Delivery.CREATOR.createFromParcel(parcel));
            }
            return new AvailableDeliveries(z, arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : DeliveryRoute.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvailableDeliveries[] newArray(int i) {
            return new AvailableDeliveries[i];
        }
    }

    public AvailableDeliveries() {
        this(false, null, 0, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableDeliveries copy$default(AvailableDeliveries availableDeliveries, boolean z, List list, int i, DeliveryRoute deliveryRoute, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = availableDeliveries.showActiveDrops;
        }
        if ((i2 & 2) != 0) {
            list = availableDeliveries.deliveries;
        }
        if ((i2 & 4) != 0) {
            i = availableDeliveries.minDeliveriesRequired;
        }
        if ((i2 & 8) != 0) {
            deliveryRoute = availableDeliveries.currentRoute;
        }
        return availableDeliveries.copy(z, list, i, deliveryRoute);
    }

    public final boolean component1() {
        return this.showActiveDrops;
    }

    public final List<Delivery> component2() {
        return this.deliveries;
    }

    public final int component3() {
        return this.minDeliveriesRequired;
    }

    public final DeliveryRoute component4() {
        return this.currentRoute;
    }

    public final AvailableDeliveries copy(boolean z, List<Delivery> deliveries, int i, DeliveryRoute deliveryRoute) {
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        return new AvailableDeliveries(z, deliveries, i, deliveryRoute);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AvailableDeliveries) {
            AvailableDeliveries availableDeliveries = (AvailableDeliveries) obj;
            return this.showActiveDrops == availableDeliveries.showActiveDrops && Intrinsics.areEqual(this.deliveries, availableDeliveries.deliveries) && this.minDeliveriesRequired == availableDeliveries.minDeliveriesRequired && Intrinsics.areEqual(this.currentRoute, availableDeliveries.currentRoute);
        }
        return false;
    }

    public final DeliveryRoute getCurrentRoute() {
        return this.currentRoute;
    }

    public final List<Delivery> getDeliveries() {
        return this.deliveries;
    }

    public final int getMinDeliveriesRequired() {
        return this.minDeliveriesRequired;
    }

    public final boolean getShowActiveDrops() {
        return this.showActiveDrops;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.showActiveDrops;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((((r0 * 31) + this.deliveries.hashCode()) * 31) + Integer.hashCode(this.minDeliveriesRequired)) * 31;
        DeliveryRoute deliveryRoute = this.currentRoute;
        return hashCode + (deliveryRoute == null ? 0 : deliveryRoute.hashCode());
    }

    public String toString() {
        boolean z = this.showActiveDrops;
        List<Delivery> list = this.deliveries;
        int i = this.minDeliveriesRequired;
        DeliveryRoute deliveryRoute = this.currentRoute;
        return "AvailableDeliveries(showActiveDrops=" + z + ", deliveries=" + list + ", minDeliveriesRequired=" + i + ", currentRoute=" + deliveryRoute + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.showActiveDrops ? 1 : 0);
        List<Delivery> list = this.deliveries;
        out.writeInt(list.size());
        for (Delivery delivery : list) {
            delivery.writeToParcel(out, i);
        }
        out.writeInt(this.minDeliveriesRequired);
        DeliveryRoute deliveryRoute = this.currentRoute;
        if (deliveryRoute == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        deliveryRoute.writeToParcel(out, i);
    }

    public AvailableDeliveries(boolean z, List<Delivery> deliveries, int i, DeliveryRoute deliveryRoute) {
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        this.showActiveDrops = z;
        this.deliveries = deliveries;
        this.minDeliveriesRequired = i;
        this.currentRoute = deliveryRoute;
    }

    public /* synthetic */ AvailableDeliveries(boolean z, List list, int i, DeliveryRoute deliveryRoute, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : deliveryRoute);
    }
}
