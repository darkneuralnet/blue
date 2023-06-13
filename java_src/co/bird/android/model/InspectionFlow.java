package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.wire.WireMapMarker;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001J\u0013\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u00060"}, m28432d2 = {"Lco/bird/android/model/InspectionFlow;", "Landroid/os/Parcelable;", "vehicleId", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, RequestHeadersFactory.MODEL, "Lco/bird/android/model/constant/BirdModel;", "batteryLevel", "", "marker", "Lco/bird/android/model/wire/WireMapMarker;", "categories", "", "Lco/bird/android/model/InspectionCategory;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;ILco/bird/android/model/wire/WireMapMarker;Ljava/util/List;)V", "getBatteryLevel", "()I", "getCategories", "()Ljava/util/List;", "getCode", "()Ljava/lang/String;", "getMarker", "()Lco/bird/android/model/wire/WireMapMarker;", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "passed", "", "getPassed", "()Z", "getVehicleId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nInspectionFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionFlow.kt\nco/bird/android/model/InspectionFlow\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1360#2:48\n1446#2,5:49\n2624#2,3:54\n2624#2,3:57\n*S KotlinDebug\n*F\n+ 1 InspectionFlow.kt\nco/bird/android/model/InspectionFlow\n*L\n42#1:48\n42#1:49,5\n43#1:54,3\n44#1:57,3\n*E\n"})
/* loaded from: classes4.dex */
public final class InspectionFlow implements Parcelable {
    public static final Parcelable.Creator<InspectionFlow> CREATOR = new Creator();
    @JsonProperty("battery_level")
    @InterfaceC41208ft5("battery_level")
    private final int batteryLevel;
    @JsonProperty("categories")
    @InterfaceC41208ft5("categories")
    private final List<InspectionCategory> categories;
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("marker")
    @InterfaceC41208ft5("marker")
    private final WireMapMarker marker;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final BirdModel model;
    @JsonProperty("vehicle_id")
    @InterfaceC41208ft5("vehicle_id")
    private final String vehicleId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<InspectionFlow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InspectionFlow createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BirdModel valueOf = parcel.readInt() == 0 ? null : BirdModel.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            WireMapMarker wireMapMarker = (WireMapMarker) parcel.readParcelable(InspectionFlow.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(InspectionCategory.CREATOR.createFromParcel(parcel));
            }
            return new InspectionFlow(readString, readString2, valueOf, readInt, wireMapMarker, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InspectionFlow[] newArray(int i) {
            return new InspectionFlow[i];
        }
    }

    public InspectionFlow() {
        this(null, null, null, 0, null, null, 63, null);
    }

    public static /* synthetic */ InspectionFlow copy$default(InspectionFlow inspectionFlow, String str, String str2, BirdModel birdModel, int i, WireMapMarker wireMapMarker, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = inspectionFlow.vehicleId;
        }
        if ((i2 & 2) != 0) {
            str2 = inspectionFlow.code;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            birdModel = inspectionFlow.model;
        }
        BirdModel birdModel2 = birdModel;
        if ((i2 & 8) != 0) {
            i = inspectionFlow.batteryLevel;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            wireMapMarker = inspectionFlow.marker;
        }
        WireMapMarker wireMapMarker2 = wireMapMarker;
        List<InspectionCategory> list2 = list;
        if ((i2 & 32) != 0) {
            list2 = inspectionFlow.categories;
        }
        return inspectionFlow.copy(str, str3, birdModel2, i3, wireMapMarker2, list2);
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

    public final List<InspectionCategory> component6() {
        return this.categories;
    }

    public final InspectionFlow copy(String vehicleId, String code, BirdModel birdModel, int i, WireMapMarker wireMapMarker, List<InspectionCategory> categories) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(categories, "categories");
        return new InspectionFlow(vehicleId, code, birdModel, i, wireMapMarker, categories);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InspectionFlow) {
            InspectionFlow inspectionFlow = (InspectionFlow) obj;
            return Intrinsics.areEqual(this.vehicleId, inspectionFlow.vehicleId) && Intrinsics.areEqual(this.code, inspectionFlow.code) && this.model == inspectionFlow.model && this.batteryLevel == inspectionFlow.batteryLevel && Intrinsics.areEqual(this.marker, inspectionFlow.marker) && Intrinsics.areEqual(this.categories, inspectionFlow.categories);
        }
        return false;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final List<InspectionCategory> getCategories() {
        return this.categories;
    }

    public final String getCode() {
        return this.code;
    }

    public final WireMapMarker getMarker() {
        return this.marker;
    }

    public final BirdModel getModel() {
        return this.model;
    }

    public final boolean getPassed() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList<InspectionIssue> arrayList = new ArrayList();
        for (InspectionCategory inspectionCategory : this.categories) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, inspectionCategory.getIssues());
        }
        List<InspectionCategory> list = this.categories;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (InspectionCategory inspectionCategory2 : list) {
                if (inspectionCategory2.getStatus() == InspectionCategoryStatus.FAILED) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        if (!z2) {
            return false;
        }
        if (!arrayList.isEmpty()) {
            for (InspectionIssue inspectionIssue : arrayList) {
                if (inspectionIssue.getSelected()) {
                    z3 = false;
                    break;
                }
            }
        }
        z3 = true;
        if (!z3) {
            return false;
        }
        return true;
    }

    public final String getVehicleId() {
        return this.vehicleId;
    }

    public int hashCode() {
        int hashCode = ((this.vehicleId.hashCode() * 31) + this.code.hashCode()) * 31;
        BirdModel birdModel = this.model;
        int hashCode2 = (((hashCode + (birdModel == null ? 0 : birdModel.hashCode())) * 31) + Integer.hashCode(this.batteryLevel)) * 31;
        WireMapMarker wireMapMarker = this.marker;
        return ((hashCode2 + (wireMapMarker != null ? wireMapMarker.hashCode() : 0)) * 31) + this.categories.hashCode();
    }

    public String toString() {
        String str = this.vehicleId;
        String str2 = this.code;
        BirdModel birdModel = this.model;
        int i = this.batteryLevel;
        WireMapMarker wireMapMarker = this.marker;
        List<InspectionCategory> list = this.categories;
        return "InspectionFlow(vehicleId=" + str + ", code=" + str2 + ", model=" + birdModel + ", batteryLevel=" + i + ", marker=" + wireMapMarker + ", categories=" + list + ")";
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
        List<InspectionCategory> list = this.categories;
        out.writeInt(list.size());
        for (InspectionCategory inspectionCategory : list) {
            inspectionCategory.writeToParcel(out, i);
        }
    }

    public InspectionFlow(String vehicleId, String code, BirdModel birdModel, int i, WireMapMarker wireMapMarker, List<InspectionCategory> categories) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.vehicleId = vehicleId;
        this.code = code;
        this.model = birdModel;
        this.batteryLevel = i;
        this.marker = wireMapMarker;
        this.categories = categories;
    }

    public /* synthetic */ InspectionFlow(String str, String str2, BirdModel birdModel, int i, WireMapMarker wireMapMarker, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? null : birdModel, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : wireMapMarker, (i2 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
