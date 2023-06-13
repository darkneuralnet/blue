package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestSummary;", "Lco/bird/android/model/wire/WireNestFlightSheetSection;", "idx", "", "title", "", "capacity", "claimExpiresAt", "Lorg/joda/time/DateTime;", "(ILjava/lang/String;ILorg/joda/time/DateTime;)V", "getCapacity", "()I", "getClaimExpiresAt", "()Lorg/joda/time/DateTime;", "getIdx", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestSummary implements WireNestFlightSheetSection {
    @JsonProperty("capacity")
    @InterfaceC41208ft5("capacity")
    private final int capacity;
    @JsonProperty("claim_expires_at")
    @InterfaceC41208ft5("claim_expires_at")
    private final DateTime claimExpiresAt;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireNestSummary(int i, String title, int i2, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.idx = i;
        this.title = title;
        this.capacity = i2;
        this.claimExpiresAt = dateTime;
    }

    public static /* synthetic */ WireNestSummary copy$default(WireNestSummary wireNestSummary, int i, String str, int i2, DateTime dateTime, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wireNestSummary.idx;
        }
        if ((i3 & 2) != 0) {
            str = wireNestSummary.title;
        }
        if ((i3 & 4) != 0) {
            i2 = wireNestSummary.capacity;
        }
        if ((i3 & 8) != 0) {
            dateTime = wireNestSummary.claimExpiresAt;
        }
        return wireNestSummary.copy(i, str, i2, dateTime);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.capacity;
    }

    public final DateTime component4() {
        return this.claimExpiresAt;
    }

    public final WireNestSummary copy(int i, String title, int i2, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new WireNestSummary(i, title, i2, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestSummary) {
            WireNestSummary wireNestSummary = (WireNestSummary) obj;
            return this.idx == wireNestSummary.idx && Intrinsics.areEqual(this.title, wireNestSummary.title) && this.capacity == wireNestSummary.capacity && Intrinsics.areEqual(this.claimExpiresAt, wireNestSummary.claimExpiresAt);
        }
        return false;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final DateTime getClaimExpiresAt() {
        return this.claimExpiresAt;
    }

    @Override // co.bird.android.model.wire.WireNestFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.idx) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.capacity)) * 31;
        DateTime dateTime = this.claimExpiresAt;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        int i2 = this.capacity;
        DateTime dateTime = this.claimExpiresAt;
        return "WireNestSummary(idx=" + i + ", title=" + str + ", capacity=" + i2 + ", claimExpiresAt=" + dateTime + ")";
    }

    public /* synthetic */ WireNestSummary(int i, String str, int i2, DateTime dateTime, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : dateTime);
    }
}
