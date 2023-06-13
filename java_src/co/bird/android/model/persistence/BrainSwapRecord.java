package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.Part;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010 \u001a\u00020\fHÆ\u0003JX\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, m28432d2 = {"Lco/bird/android/model/persistence/BrainSwapRecord;", "", "birdId", "", "partId", "imei", "birdCode", "brainPart", "Lco/bird/android/model/persistence/nestedstructures/Part;", "status", "", "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Part;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V", "getBirdCode", "()Ljava/lang/String;", "getBirdId", "getBrainPart", "()Lco/bird/android/model/persistence/nestedstructures/Part;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getImei", "getPartId", "getStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Part;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/BrainSwapRecord;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BrainSwapRecord {
    private final String birdCode;
    private final String birdId;
    private final Part brainPart;
    private final DateTime createdAt;
    private final String imei;
    private final String partId;
    private final Boolean status;

    public BrainSwapRecord(String birdId, String str, String imei, String birdCode, Part brainPart, Boolean bool, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(brainPart, "brainPart");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.birdId = birdId;
        this.partId = str;
        this.imei = imei;
        this.birdCode = birdCode;
        this.brainPart = brainPart;
        this.status = bool;
        this.createdAt = createdAt;
    }

    public static /* synthetic */ BrainSwapRecord copy$default(BrainSwapRecord brainSwapRecord, String str, String str2, String str3, String str4, Part part, Boolean bool, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = brainSwapRecord.birdId;
        }
        if ((i & 2) != 0) {
            str2 = brainSwapRecord.partId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = brainSwapRecord.imei;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = brainSwapRecord.birdCode;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            part = brainSwapRecord.brainPart;
        }
        Part part2 = part;
        if ((i & 32) != 0) {
            bool = brainSwapRecord.status;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            dateTime = brainSwapRecord.createdAt;
        }
        return brainSwapRecord.copy(str, str5, str6, str7, part2, bool2, dateTime);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.partId;
    }

    public final String component3() {
        return this.imei;
    }

    public final String component4() {
        return this.birdCode;
    }

    public final Part component5() {
        return this.brainPart;
    }

    public final Boolean component6() {
        return this.status;
    }

    public final DateTime component7() {
        return this.createdAt;
    }

    public final BrainSwapRecord copy(String birdId, String str, String imei, String birdCode, Part brainPart, Boolean bool, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(brainPart, "brainPart");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new BrainSwapRecord(birdId, str, imei, birdCode, brainPart, bool, createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrainSwapRecord) {
            BrainSwapRecord brainSwapRecord = (BrainSwapRecord) obj;
            return Intrinsics.areEqual(this.birdId, brainSwapRecord.birdId) && Intrinsics.areEqual(this.partId, brainSwapRecord.partId) && Intrinsics.areEqual(this.imei, brainSwapRecord.imei) && Intrinsics.areEqual(this.birdCode, brainSwapRecord.birdCode) && Intrinsics.areEqual(this.brainPart, brainSwapRecord.brainPart) && Intrinsics.areEqual(this.status, brainSwapRecord.status) && Intrinsics.areEqual(this.createdAt, brainSwapRecord.createdAt);
        }
        return false;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final Part getBrainPart() {
        return this.brainPart;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getImei() {
        return this.imei;
    }

    public final String getPartId() {
        return this.partId;
    }

    public final Boolean getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.birdId.hashCode() * 31;
        String str = this.partId;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.imei.hashCode()) * 31) + this.birdCode.hashCode()) * 31) + this.brainPart.hashCode()) * 31;
        Boolean bool = this.status;
        return ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.partId;
        String str3 = this.imei;
        String str4 = this.birdCode;
        Part part = this.brainPart;
        Boolean bool = this.status;
        DateTime dateTime = this.createdAt;
        return "BrainSwapRecord(birdId=" + str + ", partId=" + str2 + ", imei=" + str3 + ", birdCode=" + str4 + ", brainPart=" + part + ", status=" + bool + ", createdAt=" + dateTime + ")";
    }
}
