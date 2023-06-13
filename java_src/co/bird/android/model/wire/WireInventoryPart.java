package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.HealthStatus;
import co.bird.android.model.constant.PartKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011¢\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u00101\u001a\u00020\u0011HÆ\u0003J\t\u00102\u001a\u00020\u0016HÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J±\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0011HÆ\u0001J\t\u0010=\u001a\u00020\u0011HÖ\u0001J\u0006\u0010>\u001a\u00020\u0003J\u0013\u0010?\u001a\u00020\u00162\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\u0011HÖ\u0001J\u0010\u0010C\u001a\u0004\u0018\u00010\u00132\u0006\u0010D\u001a\u00020\u0011J\u0006\u0010E\u001a\u00020FJ\t\u0010G\u001a\u00020\u0003HÖ\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0011HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0017\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001a¨\u0006M"}, m28432d2 = {"Lco/bird/android/model/wire/WireInventoryPart;", "Landroid/os/Parcelable;", "id", "", "sku", "createdAt", "Lorg/joda/time/DateTime;", "name", "description", "defaultImageUrl", "metadata", "", "updatedAt", "relatedLinks", "", "Lco/bird/android/model/wire/WireQuickLink;", "quantity", "", "healthStatus", "Lco/bird/android/model/constant/HealthStatus;", "healthyThreshold", "healthy", "", "defaultScanQuantity", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;Ljava/util/List;ILco/bird/android/model/constant/HealthStatus;IZI)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getDefaultImageUrl", "()Ljava/lang/String;", "getDefaultScanQuantity", "()I", "getDescription", "getHealthStatus", "()Lco/bird/android/model/constant/HealthStatus;", "getHealthy", "()Z", "getHealthyThreshold", "getId", "getMetadata", "()Ljava/util/Map;", "getName", "getQuantity", "getRelatedLinks", "()Ljava/util/List;", "getSku", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "displayName", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "healthyLevel", "currentQuantity", "toPart", "Lco/bird/android/model/wire/WirePart;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireInventoryPart implements Parcelable {
    public static final Parcelable.Creator<WireInventoryPart> CREATOR = new Creator();
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("default_image_url")
    @InterfaceC41208ft5("default_image_url")
    private final String defaultImageUrl;
    @JsonProperty("default_scan_quantity")
    @InterfaceC41208ft5("default_scan_quantity")
    private final int defaultScanQuantity;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("health_status")
    @InterfaceC41208ft5("health_status")
    private final HealthStatus healthStatus;
    @JsonProperty("healthy")
    @InterfaceC41208ft5("healthy")
    private final boolean healthy;
    @JsonProperty("healthy_threshold")
    @InterfaceC41208ft5("healthy_threshold")
    private final int healthyThreshold;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66730id;
    @JsonProperty("metadata")
    @InterfaceC41208ft5("metadata")
    private final Map<String, String> metadata;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("quantity")
    @InterfaceC41208ft5("quantity")
    private final int quantity;
    @JsonProperty("links")
    @InterfaceC41208ft5("links")
    private final List<WireQuickLink> relatedLinks;
    @JsonProperty("sku")
    @InterfaceC41208ft5("sku")
    private final String sku;
    @JsonProperty("updatedAt")
    @InterfaceC41208ft5("updatedAt")
    private final DateTime updatedAt;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireInventoryPart> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireInventoryPart createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList.add(WireQuickLink.CREATOR.createFromParcel(parcel));
            }
            return new WireInventoryPart(readString, readString2, dateTime, readString3, readString4, readString5, linkedHashMap, dateTime2, arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : HealthStatus.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireInventoryPart[] newArray(int i) {
            return new WireInventoryPart[i];
        }
    }

    public WireInventoryPart() {
        this(null, null, null, null, null, null, null, null, null, 0, null, 0, false, 0, 16383, null);
    }

    public final String component1() {
        return this.f66730id;
    }

    public final int component10() {
        return this.quantity;
    }

    public final HealthStatus component11() {
        return this.healthStatus;
    }

    public final int component12() {
        return this.healthyThreshold;
    }

    public final boolean component13() {
        return this.healthy;
    }

    public final int component14() {
        return this.defaultScanQuantity;
    }

    public final String component2() {
        return this.sku;
    }

    public final DateTime component3() {
        return this.createdAt;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.defaultImageUrl;
    }

    public final Map<String, String> component7() {
        return this.metadata;
    }

    public final DateTime component8() {
        return this.updatedAt;
    }

    public final List<WireQuickLink> component9() {
        return this.relatedLinks;
    }

    public final WireInventoryPart copy(String id, String sku, DateTime dateTime, String name, String str, String str2, Map<String, String> metadata, DateTime dateTime2, List<WireQuickLink> relatedLinks, int i, HealthStatus healthStatus, int i2, boolean z, int i3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(relatedLinks, "relatedLinks");
        return new WireInventoryPart(id, sku, dateTime, name, str, str2, metadata, dateTime2, relatedLinks, i, healthStatus, i2, z, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String displayName() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.name.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.name;
        }
        String str = this.description;
        if (str != null) {
            if (str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        z3 = false;
        if (z3) {
            return this.description;
        }
        return "";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireInventoryPart) {
            WireInventoryPart wireInventoryPart = (WireInventoryPart) obj;
            return Intrinsics.areEqual(this.f66730id, wireInventoryPart.f66730id) && Intrinsics.areEqual(this.sku, wireInventoryPart.sku) && Intrinsics.areEqual(this.createdAt, wireInventoryPart.createdAt) && Intrinsics.areEqual(this.name, wireInventoryPart.name) && Intrinsics.areEqual(this.description, wireInventoryPart.description) && Intrinsics.areEqual(this.defaultImageUrl, wireInventoryPart.defaultImageUrl) && Intrinsics.areEqual(this.metadata, wireInventoryPart.metadata) && Intrinsics.areEqual(this.updatedAt, wireInventoryPart.updatedAt) && Intrinsics.areEqual(this.relatedLinks, wireInventoryPart.relatedLinks) && this.quantity == wireInventoryPart.quantity && this.healthStatus == wireInventoryPart.healthStatus && this.healthyThreshold == wireInventoryPart.healthyThreshold && this.healthy == wireInventoryPart.healthy && this.defaultScanQuantity == wireInventoryPart.defaultScanQuantity;
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getDefaultImageUrl() {
        return this.defaultImageUrl;
    }

    public final int getDefaultScanQuantity() {
        return this.defaultScanQuantity;
    }

    public final String getDescription() {
        return this.description;
    }

    public final HealthStatus getHealthStatus() {
        return this.healthStatus;
    }

    public final boolean getHealthy() {
        return this.healthy;
    }

    public final int getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public final String getId() {
        return this.f66730id;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final List<WireQuickLink> getRelatedLinks() {
        return this.relatedLinks;
    }

    public final String getSku() {
        return this.sku;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f66730id.hashCode() * 31) + this.sku.hashCode()) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode2 = (((hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31) + this.name.hashCode()) * 31;
        String str = this.description;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultImageUrl;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.metadata.hashCode()) * 31;
        DateTime dateTime2 = this.updatedAt;
        int hashCode5 = (((((hashCode4 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31) + this.relatedLinks.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31;
        HealthStatus healthStatus = this.healthStatus;
        int hashCode6 = (((hashCode5 + (healthStatus != null ? healthStatus.hashCode() : 0)) * 31) + Integer.hashCode(this.healthyThreshold)) * 31;
        boolean z = this.healthy;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode6 + i) * 31) + Integer.hashCode(this.defaultScanQuantity);
    }

    public final HealthStatus healthyLevel(int i) {
        if (i == 0) {
            return HealthStatus.OUT_OF_STOCK;
        }
        if (i <= this.healthyThreshold) {
            return HealthStatus.RUNNING_LOW;
        }
        return null;
    }

    public final WirePart toPart() {
        String str = this.sku;
        return new WirePart(this.f66730id, PartKind.UNKNOWN, str);
    }

    public String toString() {
        String str = this.f66730id;
        String str2 = this.sku;
        DateTime dateTime = this.createdAt;
        String str3 = this.name;
        String str4 = this.description;
        String str5 = this.defaultImageUrl;
        Map<String, String> map = this.metadata;
        DateTime dateTime2 = this.updatedAt;
        List<WireQuickLink> list = this.relatedLinks;
        int i = this.quantity;
        HealthStatus healthStatus = this.healthStatus;
        int i2 = this.healthyThreshold;
        boolean z = this.healthy;
        int i3 = this.defaultScanQuantity;
        return "WireInventoryPart(id=" + str + ", sku=" + str2 + ", createdAt=" + dateTime + ", name=" + str3 + ", description=" + str4 + ", defaultImageUrl=" + str5 + ", metadata=" + map + ", updatedAt=" + dateTime2 + ", relatedLinks=" + list + ", quantity=" + i + ", healthStatus=" + healthStatus + ", healthyThreshold=" + i2 + ", healthy=" + z + ", defaultScanQuantity=" + i3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66730id);
        out.writeString(this.sku);
        out.writeSerializable(this.createdAt);
        out.writeString(this.name);
        out.writeString(this.description);
        out.writeString(this.defaultImageUrl);
        Map<String, String> map = this.metadata;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
        out.writeSerializable(this.updatedAt);
        List<WireQuickLink> list = this.relatedLinks;
        out.writeInt(list.size());
        for (WireQuickLink wireQuickLink : list) {
            wireQuickLink.writeToParcel(out, i);
        }
        out.writeInt(this.quantity);
        HealthStatus healthStatus = this.healthStatus;
        if (healthStatus == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(healthStatus.name());
        }
        out.writeInt(this.healthyThreshold);
        out.writeInt(this.healthy ? 1 : 0);
        out.writeInt(this.defaultScanQuantity);
    }

    public WireInventoryPart(String id, String sku, DateTime dateTime, String name, String str, String str2, Map<String, String> metadata, DateTime dateTime2, List<WireQuickLink> relatedLinks, int i, HealthStatus healthStatus, int i2, boolean z, int i3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(relatedLinks, "relatedLinks");
        this.f66730id = id;
        this.sku = sku;
        this.createdAt = dateTime;
        this.name = name;
        this.description = str;
        this.defaultImageUrl = str2;
        this.metadata = metadata;
        this.updatedAt = dateTime2;
        this.relatedLinks = relatedLinks;
        this.quantity = i;
        this.healthStatus = healthStatus;
        this.healthyThreshold = i2;
        this.healthy = z;
        this.defaultScanQuantity = i3;
    }

    public /* synthetic */ WireInventoryPart(String str, String str2, DateTime dateTime, String str3, String str4, String str5, Map map, DateTime dateTime2, List list, int i, HealthStatus healthStatus, int i2, boolean z, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? null : dateTime, (i4 & 8) == 0 ? str3 : "", (i4 & 16) != 0 ? null : str4, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i4 & 128) != 0 ? null : dateTime2, (i4 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 512) != 0 ? 0 : i, (i4 & 1024) == 0 ? healthStatus : null, (i4 & 2048) != 0 ? 0 : i2, (i4 & 4096) != 0 ? false : z, (i4 & 8192) == 0 ? i3 : 0);
    }
}
