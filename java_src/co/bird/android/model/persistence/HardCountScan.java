package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Ji\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u0006-"}, m28432d2 = {"Lco/bird/android/model/persistence/HardCountScan;", "", "id", "", "birdId", "", "sessionId", "scanIdentifier", RequestHeadersFactory.MODEL, "modelVersionTitle", "scannedAt", "Lorg/joda/time/DateTime;", "lapId", "", "completed", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;JZ)V", "getBirdId", "()Ljava/lang/String;", "getCompleted", "()Z", "getId", "()I", "getLapId", "()J", "getModel", "getModelVersionTitle", "getScanIdentifier", "getScannedAt", "()Lorg/joda/time/DateTime;", "getSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class HardCountScan {
    private final String birdId;
    private final boolean completed;

    /* renamed from: id */
    private final int f66679id;
    private final long lapId;
    private final String model;
    private final String modelVersionTitle;
    private final String scanIdentifier;
    private final DateTime scannedAt;
    private final String sessionId;

    public HardCountScan(int i, String str, String sessionId, String scanIdentifier, String str2, String str3, DateTime scannedAt, long j, boolean z) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(scannedAt, "scannedAt");
        this.f66679id = i;
        this.birdId = str;
        this.sessionId = sessionId;
        this.scanIdentifier = scanIdentifier;
        this.model = str2;
        this.modelVersionTitle = str3;
        this.scannedAt = scannedAt;
        this.lapId = j;
        this.completed = z;
    }

    public final int component1() {
        return this.f66679id;
    }

    public final String component2() {
        return this.birdId;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final String component4() {
        return this.scanIdentifier;
    }

    public final String component5() {
        return this.model;
    }

    public final String component6() {
        return this.modelVersionTitle;
    }

    public final DateTime component7() {
        return this.scannedAt;
    }

    public final long component8() {
        return this.lapId;
    }

    public final boolean component9() {
        return this.completed;
    }

    public final HardCountScan copy(int i, String str, String sessionId, String scanIdentifier, String str2, String str3, DateTime scannedAt, long j, boolean z) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(scannedAt, "scannedAt");
        return new HardCountScan(i, str, sessionId, scanIdentifier, str2, str3, scannedAt, j, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HardCountScan) {
            HardCountScan hardCountScan = (HardCountScan) obj;
            return this.f66679id == hardCountScan.f66679id && Intrinsics.areEqual(this.birdId, hardCountScan.birdId) && Intrinsics.areEqual(this.sessionId, hardCountScan.sessionId) && Intrinsics.areEqual(this.scanIdentifier, hardCountScan.scanIdentifier) && Intrinsics.areEqual(this.model, hardCountScan.model) && Intrinsics.areEqual(this.modelVersionTitle, hardCountScan.modelVersionTitle) && Intrinsics.areEqual(this.scannedAt, hardCountScan.scannedAt) && this.lapId == hardCountScan.lapId && this.completed == hardCountScan.completed;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final int getId() {
        return this.f66679id;
    }

    public final long getLapId() {
        return this.lapId;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getModelVersionTitle() {
        return this.modelVersionTitle;
    }

    public final String getScanIdentifier() {
        return this.scanIdentifier;
    }

    public final DateTime getScannedAt() {
        return this.scannedAt;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f66679id) * 31;
        String str = this.birdId;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sessionId.hashCode()) * 31) + this.scanIdentifier.hashCode()) * 31;
        String str2 = this.model;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.modelVersionTitle;
        int hashCode4 = (((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.scannedAt.hashCode()) * 31) + Long.hashCode(this.lapId)) * 31;
        boolean z = this.completed;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public String toString() {
        int i = this.f66679id;
        String str = this.birdId;
        String str2 = this.sessionId;
        String str3 = this.scanIdentifier;
        String str4 = this.model;
        String str5 = this.modelVersionTitle;
        DateTime dateTime = this.scannedAt;
        long j = this.lapId;
        boolean z = this.completed;
        return "HardCountScan(id=" + i + ", birdId=" + str + ", sessionId=" + str2 + ", scanIdentifier=" + str3 + ", model=" + str4 + ", modelVersionTitle=" + str5 + ", scannedAt=" + dateTime + ", lapId=" + j + ", completed=" + z + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HardCountScan(int i, String str, String str2, String str3, String str4, String str5, DateTime dateTime, long j, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, str2, str3, r7, r8, r9, (i2 & 128) != 0 ? 0L : j, (i2 & 256) != 0 ? true : z);
        DateTime dateTime2;
        int i3 = (i2 & 1) != 0 ? 0 : i;
        String str6 = (i2 & 2) != 0 ? null : str;
        String str7 = (i2 & 16) != 0 ? null : str4;
        String str8 = (i2 & 32) != 0 ? null : str5;
        if ((i2 & 64) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime2 = now;
        } else {
            dateTime2 = dateTime;
        }
    }
}
