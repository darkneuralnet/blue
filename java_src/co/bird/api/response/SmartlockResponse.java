package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m28432d2 = {"Lco/bird/api/response/SmartlockResponse;", "", "id", "", "macAddress", "keysList", "", "Lco/bird/api/response/SmartlockKey;", "needsRekey", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getId", "()Ljava/lang/String;", "getKeysList", "()Ljava/util/List;", "getMacAddress", "getNeedsRekey", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SmartlockResponse {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68229id;
    @JsonProperty(UserMetadata.KEYDATA_FILENAME)
    @InterfaceC41208ft5(UserMetadata.KEYDATA_FILENAME)
    private final List<SmartlockKey> keysList;
    @JsonProperty("mac_address")
    @InterfaceC41208ft5("mac_address")
    private final String macAddress;
    @JsonProperty("needs_rekey")
    @InterfaceC41208ft5("needs_rekey")
    private final boolean needsRekey;

    public SmartlockResponse() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartlockResponse copy$default(SmartlockResponse smartlockResponse, String str, String str2, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartlockResponse.f68229id;
        }
        if ((i & 2) != 0) {
            str2 = smartlockResponse.macAddress;
        }
        if ((i & 4) != 0) {
            list = smartlockResponse.keysList;
        }
        if ((i & 8) != 0) {
            z = smartlockResponse.needsRekey;
        }
        return smartlockResponse.copy(str, str2, list, z);
    }

    public final String component1() {
        return this.f68229id;
    }

    public final String component2() {
        return this.macAddress;
    }

    public final List<SmartlockKey> component3() {
        return this.keysList;
    }

    public final boolean component4() {
        return this.needsRekey;
    }

    public final SmartlockResponse copy(String id, String macAddress, List<SmartlockKey> keysList, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(keysList, "keysList");
        return new SmartlockResponse(id, macAddress, keysList, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SmartlockResponse) {
            SmartlockResponse smartlockResponse = (SmartlockResponse) obj;
            return Intrinsics.areEqual(this.f68229id, smartlockResponse.f68229id) && Intrinsics.areEqual(this.macAddress, smartlockResponse.macAddress) && Intrinsics.areEqual(this.keysList, smartlockResponse.keysList) && this.needsRekey == smartlockResponse.needsRekey;
        }
        return false;
    }

    public final String getId() {
        return this.f68229id;
    }

    public final List<SmartlockKey> getKeysList() {
        return this.keysList;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final boolean getNeedsRekey() {
        return this.needsRekey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f68229id.hashCode() * 31) + this.macAddress.hashCode()) * 31) + this.keysList.hashCode()) * 31;
        boolean z = this.needsRekey;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f68229id;
        String str2 = this.macAddress;
        List<SmartlockKey> list = this.keysList;
        boolean z = this.needsRekey;
        return "SmartlockResponse(id=" + str + ", macAddress=" + str2 + ", keysList=" + list + ", needsRekey=" + z + ")";
    }

    public SmartlockResponse(String id, String macAddress, List<SmartlockKey> keysList, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(keysList, "keysList");
        this.f68229id = id;
        this.macAddress = macAddress;
        this.keysList = keysList;
        this.needsRekey = z;
    }

    public /* synthetic */ SmartlockResponse(String str, String str2, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 8) != 0 ? false : z);
    }
}
