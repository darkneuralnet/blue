package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/request/BleScanReportBody;", "", "scans", "", "Lco/bird/api/request/BleScan;", "trigger", "", "(Ljava/util/List;Ljava/lang/String;)V", "getScans", "()Ljava/util/List;", "getTrigger", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BleScanReportBody {
    @JsonProperty("scans")
    @InterfaceC41208ft5("scans")
    private final List<BleScan> scans;
    @JsonProperty("trigger")
    @InterfaceC41208ft5("trigger")
    private final String trigger;

    public BleScanReportBody(List<BleScan> scans, String str) {
        Intrinsics.checkNotNullParameter(scans, "scans");
        this.scans = scans;
        this.trigger = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleScanReportBody copy$default(BleScanReportBody bleScanReportBody, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bleScanReportBody.scans;
        }
        if ((i & 2) != 0) {
            str = bleScanReportBody.trigger;
        }
        return bleScanReportBody.copy(list, str);
    }

    public final List<BleScan> component1() {
        return this.scans;
    }

    public final String component2() {
        return this.trigger;
    }

    public final BleScanReportBody copy(List<BleScan> scans, String str) {
        Intrinsics.checkNotNullParameter(scans, "scans");
        return new BleScanReportBody(scans, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleScanReportBody) {
            BleScanReportBody bleScanReportBody = (BleScanReportBody) obj;
            return Intrinsics.areEqual(this.scans, bleScanReportBody.scans) && Intrinsics.areEqual(this.trigger, bleScanReportBody.trigger);
        }
        return false;
    }

    public final List<BleScan> getScans() {
        return this.scans;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        int hashCode = this.scans.hashCode() * 31;
        String str = this.trigger;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<BleScan> list = this.scans;
        String str = this.trigger;
        return "BleScanReportBody(scans=" + list + ", trigger=" + str + ")";
    }
}
