package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/wire/WireFailedScannedItem;", "", "scanIdentifiers", "", "", "serialNumber", "createdAt", "Lorg/joda/time/DateTime;", "updatedAt", "(Ljava/util/List;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getScanIdentifiers", "()Ljava/util/List;", "getSerialNumber", "()Ljava/lang/String;", "getUpdatedAt", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFailedScannedItem {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("scan_identifiers")
    @InterfaceC41208ft5("scan_identifiers")
    private final List<String> scanIdentifiers;
    @JsonProperty("serial_number")
    @InterfaceC41208ft5("serial_number")
    private final String serialNumber;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;

    public WireFailedScannedItem() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireFailedScannedItem copy$default(WireFailedScannedItem wireFailedScannedItem, List list, String str, DateTime dateTime, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wireFailedScannedItem.scanIdentifiers;
        }
        if ((i & 2) != 0) {
            str = wireFailedScannedItem.serialNumber;
        }
        if ((i & 4) != 0) {
            dateTime = wireFailedScannedItem.createdAt;
        }
        if ((i & 8) != 0) {
            dateTime2 = wireFailedScannedItem.updatedAt;
        }
        return wireFailedScannedItem.copy(list, str, dateTime, dateTime2);
    }

    public final List<String> component1() {
        return this.scanIdentifiers;
    }

    public final String component2() {
        return this.serialNumber;
    }

    public final DateTime component3() {
        return this.createdAt;
    }

    public final DateTime component4() {
        return this.updatedAt;
    }

    public final WireFailedScannedItem copy(List<String> scanIdentifiers, String str, DateTime createdAt, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(scanIdentifiers, "scanIdentifiers");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new WireFailedScannedItem(scanIdentifiers, str, createdAt, updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireFailedScannedItem) {
            WireFailedScannedItem wireFailedScannedItem = (WireFailedScannedItem) obj;
            return Intrinsics.areEqual(this.scanIdentifiers, wireFailedScannedItem.scanIdentifiers) && Intrinsics.areEqual(this.serialNumber, wireFailedScannedItem.serialNumber) && Intrinsics.areEqual(this.createdAt, wireFailedScannedItem.createdAt) && Intrinsics.areEqual(this.updatedAt, wireFailedScannedItem.updatedAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final List<String> getScanIdentifiers() {
        return this.scanIdentifiers;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = this.scanIdentifiers.hashCode() * 31;
        String str = this.serialNumber;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    public String toString() {
        List<String> list = this.scanIdentifiers;
        String str = this.serialNumber;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.updatedAt;
        return "WireFailedScannedItem(scanIdentifiers=" + list + ", serialNumber=" + str + ", createdAt=" + dateTime + ", updatedAt=" + dateTime2 + ")";
    }

    public WireFailedScannedItem(List<String> scanIdentifiers, String str, DateTime createdAt, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(scanIdentifiers, "scanIdentifiers");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.scanIdentifiers = scanIdentifiers;
        this.serialNumber = str;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireFailedScannedItem(List list, String str, DateTime dateTime, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, dateTime, dateTime2);
        list = (i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        str = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        if ((i & 8) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
