package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m28432d2 = {"Lco/bird/api/request/BleDeviceBody;", "", "rssi", "", "name", "", "serviceIds", "", "Ljava/util/UUID;", "manufacturerData", "macAddress", "location", "Lco/bird/android/model/wire/WireLocation;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;)V", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getMacAddress", "()Ljava/lang/String;", "getManufacturerData", "getName", "getRssi", "()I", "getServiceIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BleDeviceBody {
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("mac_address")
    @InterfaceC41208ft5("mac_address")
    private final String macAddress;
    @JsonProperty("manufacturer_data")
    @InterfaceC41208ft5("manufacturer_data")
    private final String manufacturerData;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("rssi")
    @InterfaceC41208ft5("rssi")
    private final int rssi;
    @JsonProperty("service_ids")
    @InterfaceC41208ft5("service_ids")
    private final List<UUID> serviceIds;

    public BleDeviceBody(int i, String str, List<UUID> serviceIds, String str2, String str3, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(serviceIds, "serviceIds");
        this.rssi = i;
        this.name = str;
        this.serviceIds = serviceIds;
        this.manufacturerData = str2;
        this.macAddress = str3;
        this.location = wireLocation;
    }

    public static /* synthetic */ BleDeviceBody copy$default(BleDeviceBody bleDeviceBody, int i, String str, List list, String str2, String str3, WireLocation wireLocation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleDeviceBody.rssi;
        }
        if ((i2 & 2) != 0) {
            str = bleDeviceBody.name;
        }
        String str4 = str;
        List<UUID> list2 = list;
        if ((i2 & 4) != 0) {
            list2 = bleDeviceBody.serviceIds;
        }
        List list3 = list2;
        if ((i2 & 8) != 0) {
            str2 = bleDeviceBody.manufacturerData;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = bleDeviceBody.macAddress;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            wireLocation = bleDeviceBody.location;
        }
        return bleDeviceBody.copy(i, str4, list3, str5, str6, wireLocation);
    }

    public final int component1() {
        return this.rssi;
    }

    public final String component2() {
        return this.name;
    }

    public final List<UUID> component3() {
        return this.serviceIds;
    }

    public final String component4() {
        return this.manufacturerData;
    }

    public final String component5() {
        return this.macAddress;
    }

    public final WireLocation component6() {
        return this.location;
    }

    public final BleDeviceBody copy(int i, String str, List<UUID> serviceIds, String str2, String str3, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(serviceIds, "serviceIds");
        return new BleDeviceBody(i, str, serviceIds, str2, str3, wireLocation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleDeviceBody) {
            BleDeviceBody bleDeviceBody = (BleDeviceBody) obj;
            return this.rssi == bleDeviceBody.rssi && Intrinsics.areEqual(this.name, bleDeviceBody.name) && Intrinsics.areEqual(this.serviceIds, bleDeviceBody.serviceIds) && Intrinsics.areEqual(this.manufacturerData, bleDeviceBody.manufacturerData) && Intrinsics.areEqual(this.macAddress, bleDeviceBody.macAddress) && Intrinsics.areEqual(this.location, bleDeviceBody.location);
        }
        return false;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final String getManufacturerData() {
        return this.manufacturerData;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRssi() {
        return this.rssi;
    }

    public final List<UUID> getServiceIds() {
        return this.serviceIds;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.rssi) * 31;
        String str = this.name;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.serviceIds.hashCode()) * 31;
        String str2 = this.manufacturerData;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.macAddress;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WireLocation wireLocation = this.location;
        return hashCode4 + (wireLocation != null ? wireLocation.hashCode() : 0);
    }

    public String toString() {
        int i = this.rssi;
        String str = this.name;
        List<UUID> list = this.serviceIds;
        String str2 = this.manufacturerData;
        String str3 = this.macAddress;
        WireLocation wireLocation = this.location;
        return "BleDeviceBody(rssi=" + i + ", name=" + str + ", serviceIds=" + list + ", manufacturerData=" + str2 + ", macAddress=" + str3 + ", location=" + wireLocation + ")";
    }

    public /* synthetic */ BleDeviceBody(int i, String str, List list, String str2, String str3, WireLocation wireLocation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) == 0 ? wireLocation : null);
    }
}
