package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.wire.WireMapMarker;
import co.bird.android.model.wire.WireQuickLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003Ji\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\bHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018¨\u00065"}, m28432d2 = {"Lco/bird/android/model/RepairFlow;", "Landroid/os/Parcelable;", "vehicleId", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, RequestHeadersFactory.MODEL, "Lco/bird/android/model/constant/BirdModel;", "batteryLevel", "", "marker", "Lco/bird/android/model/wire/WireMapMarker;", "completed", "", "categories", "", "Lco/bird/android/model/RepairCategory;", "quickLinks", "Lco/bird/android/model/wire/WireQuickLink;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILco/bird/android/model/wire/WireMapMarker;ZLjava/util/List;Ljava/util/List;)V", "getBatteryLevel", "()I", "getCategories", "()Ljava/util/List;", "getCode", "()Ljava/lang/String;", "getCompleted", "()Z", "getMarker", "()Lco/bird/android/model/wire/WireMapMarker;", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "getQuickLinks", "getVehicleId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RepairFlow implements Parcelable {
    public static final Parcelable.Creator<RepairFlow> CREATOR = new Creator();
    @JsonProperty("battery_level")
    @InterfaceC41208ft5("battery_level")
    private final int batteryLevel;
    @JsonProperty("categories")
    @InterfaceC41208ft5("categories")
    private final List<RepairCategory> categories;
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("completed")
    @InterfaceC41208ft5("completed")
    private final boolean completed;
    @JsonProperty("marker")
    @InterfaceC41208ft5("marker")
    private final WireMapMarker marker;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final BirdModel model;
    @JsonProperty("quick_links")
    @InterfaceC41208ft5("quick_links")
    private final List<WireQuickLink> quickLinks;
    @JsonProperty("vehicle_id")
    @InterfaceC41208ft5("vehicle_id")
    private final String vehicleId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RepairFlow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepairFlow createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BirdModel valueOf = parcel.readInt() == 0 ? null : BirdModel.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            WireMapMarker wireMapMarker = (WireMapMarker) parcel.readParcelable(RepairFlow.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(RepairCategory.CREATOR.createFromParcel(parcel));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            for (int i2 = 0; i2 != readInt3; i2++) {
                arrayList2.add(parcel.readParcelable(RepairFlow.class.getClassLoader()));
            }
            return new RepairFlow(readString, readString2, valueOf, readInt, wireMapMarker, z, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RepairFlow[] newArray(int i) {
            return new RepairFlow[i];
        }
    }

    public RepairFlow() {
        this(null, null, null, 0, null, false, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.vehicleId;
    }

    public final String component2() {
        return this.code;
    }

    public final BirdModel component3() {
        return this.model;
    }

    public final int component4() {
        return this.batteryLevel;
    }

    public final WireMapMarker component5() {
        return this.marker;
    }

    public final boolean component6() {
        return this.completed;
    }

    public final List<RepairCategory> component7() {
        return this.categories;
    }

    public final List<WireQuickLink> component8() {
        return this.quickLinks;
    }

    public final RepairFlow copy(String vehicleId, String code, BirdModel birdModel, int i, WireMapMarker wireMapMarker, boolean z, List<RepairCategory> categories, List<WireQuickLink> quickLinks) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(quickLinks, "quickLinks");
        return new RepairFlow(vehicleId, code, birdModel, i, wireMapMarker, z, categories, quickLinks);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RepairFlow) {
            RepairFlow repairFlow = (RepairFlow) obj;
            return Intrinsics.areEqual(this.vehicleId, repairFlow.vehicleId) && Intrinsics.areEqual(this.code, repairFlow.code) && this.model == repairFlow.model && this.batteryLevel == repairFlow.batteryLevel && Intrinsics.areEqual(this.marker, repairFlow.marker) && this.completed == repairFlow.completed && Intrinsics.areEqual(this.categories, repairFlow.categories) && Intrinsics.areEqual(this.quickLinks, repairFlow.quickLinks);
        }
        return false;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final List<RepairCategory> getCategories() {
        return this.categories;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final WireMapMarker getMarker() {
        return this.marker;
    }

    public final BirdModel getModel() {
        return this.model;
    }

    public final List<WireQuickLink> getQuickLinks() {
        return this.quickLinks;
    }

    public final String getVehicleId() {
        return this.vehicleId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.vehicleId.hashCode() * 31) + this.code.hashCode()) * 31;
        BirdModel birdModel = this.model;
        int hashCode2 = (((hashCode + (birdModel == null ? 0 : birdModel.hashCode())) * 31) + Integer.hashCode(this.batteryLevel)) * 31;
        WireMapMarker wireMapMarker = this.marker;
        int hashCode3 = (hashCode2 + (wireMapMarker != null ? wireMapMarker.hashCode() : 0)) * 31;
        boolean z = this.completed;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode3 + i) * 31) + this.categories.hashCode()) * 31) + this.quickLinks.hashCode();
    }

    public String toString() {
        String str = this.vehicleId;
        String str2 = this.code;
        BirdModel birdModel = this.model;
        int i = this.batteryLevel;
        WireMapMarker wireMapMarker = this.marker;
        boolean z = this.completed;
        List<RepairCategory> list = this.categories;
        List<WireQuickLink> list2 = this.quickLinks;
        return "RepairFlow(vehicleId=" + str + ", code=" + str2 + ", model=" + birdModel + ", batteryLevel=" + i + ", marker=" + wireMapMarker + ", completed=" + z + ", categories=" + list + ", quickLinks=" + list2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.vehicleId);
        out.writeString(this.code);
        BirdModel birdModel = this.model;
        if (birdModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(birdModel.name());
        }
        out.writeInt(this.batteryLevel);
        out.writeParcelable(this.marker, i);
        out.writeInt(this.completed ? 1 : 0);
        List<RepairCategory> list = this.categories;
        out.writeInt(list.size());
        for (RepairCategory repairCategory : list) {
            repairCategory.writeToParcel(out, i);
        }
        List<WireQuickLink> list2 = this.quickLinks;
        out.writeInt(list2.size());
        for (WireQuickLink wireQuickLink : list2) {
            out.writeParcelable(wireQuickLink, i);
        }
    }

    public RepairFlow(String vehicleId, String code, BirdModel birdModel, int i, WireMapMarker wireMapMarker, boolean z, List<RepairCategory> categories, List<WireQuickLink> quickLinks) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(quickLinks, "quickLinks");
        this.vehicleId = vehicleId;
        this.code = code;
        this.model = birdModel;
        this.batteryLevel = i;
        this.marker = wireMapMarker;
        this.completed = z;
        this.categories = categories;
        this.quickLinks = quickLinks;
    }

    public /* synthetic */ RepairFlow(String str, String str2, BirdModel birdModel, int i, WireMapMarker wireMapMarker, boolean z, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? null : birdModel, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? wireMapMarker : null, (i2 & 32) == 0 ? z : false, (i2 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
