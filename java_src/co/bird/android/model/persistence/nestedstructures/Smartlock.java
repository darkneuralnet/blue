package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.SmartlockVendor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/Smartlock;", "", "id", "", "physicalLockId", "macAddress", "tokenRequest", "tokenRequests", "", "vendor", "Lco/bird/android/model/constant/SmartlockVendor;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/constant/SmartlockVendor;)V", "getId", "()Ljava/lang/String;", "getMacAddress", "getPhysicalLockId", "getTokenRequest", "getTokenRequests", "()Ljava/util/List;", "getVendor", "()Lco/bird/android/model/constant/SmartlockVendor;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Smartlock {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66703id;
    @JsonProperty("mac_address")
    @InterfaceC41208ft5("mac_address")
    private final String macAddress;
    @JsonProperty("physical_lock_id")
    @InterfaceC41208ft5("physical_lock_id")
    private final String physicalLockId;
    @JsonProperty("token_request")
    @InterfaceC41208ft5("token_request")
    private final String tokenRequest;
    @JsonProperty("token_requests")
    @InterfaceC41208ft5("token_requests")
    private final List<String> tokenRequests;
    @JsonProperty("vendor")
    @InterfaceC41208ft5("vendor")
    private final SmartlockVendor vendor;

    public Smartlock(String id, String str, String macAddress, String str2, List<String> list, SmartlockVendor vendor) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        this.f66703id = id;
        this.physicalLockId = str;
        this.macAddress = macAddress;
        this.tokenRequest = str2;
        this.tokenRequests = list;
        this.vendor = vendor;
    }

    public static /* synthetic */ Smartlock copy$default(Smartlock smartlock, String str, String str2, String str3, String str4, List list, SmartlockVendor smartlockVendor, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartlock.f66703id;
        }
        if ((i & 2) != 0) {
            str2 = smartlock.physicalLockId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = smartlock.macAddress;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = smartlock.tokenRequest;
        }
        String str7 = str4;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = smartlock.tokenRequests;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            smartlockVendor = smartlock.vendor;
        }
        return smartlock.copy(str, str5, str6, str7, list3, smartlockVendor);
    }

    public final String component1() {
        return this.f66703id;
    }

    public final String component2() {
        return this.physicalLockId;
    }

    public final String component3() {
        return this.macAddress;
    }

    public final String component4() {
        return this.tokenRequest;
    }

    public final List<String> component5() {
        return this.tokenRequests;
    }

    public final SmartlockVendor component6() {
        return this.vendor;
    }

    public final Smartlock copy(String id, String str, String macAddress, String str2, List<String> list, SmartlockVendor vendor) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        return new Smartlock(id, str, macAddress, str2, list, vendor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Smartlock) {
            Smartlock smartlock = (Smartlock) obj;
            return Intrinsics.areEqual(this.f66703id, smartlock.f66703id) && Intrinsics.areEqual(this.physicalLockId, smartlock.physicalLockId) && Intrinsics.areEqual(this.macAddress, smartlock.macAddress) && Intrinsics.areEqual(this.tokenRequest, smartlock.tokenRequest) && Intrinsics.areEqual(this.tokenRequests, smartlock.tokenRequests) && this.vendor == smartlock.vendor;
        }
        return false;
    }

    public final String getId() {
        return this.f66703id;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final String getPhysicalLockId() {
        return this.physicalLockId;
    }

    public final String getTokenRequest() {
        return this.tokenRequest;
    }

    public final List<String> getTokenRequests() {
        return this.tokenRequests;
    }

    public final SmartlockVendor getVendor() {
        return this.vendor;
    }

    public int hashCode() {
        int hashCode = this.f66703id.hashCode() * 31;
        String str = this.physicalLockId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.macAddress.hashCode()) * 31;
        String str2 = this.tokenRequest;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.tokenRequests;
        return ((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.vendor.hashCode();
    }

    public String toString() {
        String str = this.f66703id;
        String str2 = this.physicalLockId;
        String str3 = this.macAddress;
        String str4 = this.tokenRequest;
        List<String> list = this.tokenRequests;
        SmartlockVendor smartlockVendor = this.vendor;
        return "Smartlock(id=" + str + ", physicalLockId=" + str2 + ", macAddress=" + str3 + ", tokenRequest=" + str4 + ", tokenRequests=" + list + ", vendor=" + smartlockVendor + ")";
    }

    public /* synthetic */ Smartlock(String str, String str2, String str3, String str4, List list, SmartlockVendor smartlockVendor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, smartlockVendor);
    }
}
