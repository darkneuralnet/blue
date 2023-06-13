package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneSummary;", "", "idx", "", "title", "", "(ILjava/lang/String;)V", "getIdx", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneSummary {
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireZoneSummary() {
        this(0, null, 3, null);
    }

    public static /* synthetic */ WireZoneSummary copy$default(WireZoneSummary wireZoneSummary, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireZoneSummary.idx;
        }
        if ((i2 & 2) != 0) {
            str = wireZoneSummary.title;
        }
        return wireZoneSummary.copy(i, str);
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final WireZoneSummary copy(int i, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new WireZoneSummary(i, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneSummary) {
            WireZoneSummary wireZoneSummary = (WireZoneSummary) obj;
            return this.idx == wireZoneSummary.idx && Intrinsics.areEqual(this.title, wireZoneSummary.title);
        }
        return false;
    }

    public final int getIdx() {
        return this.idx;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (Integer.hashCode(this.idx) * 31) + this.title.hashCode();
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        return "WireZoneSummary(idx=" + i + ", title=" + str + ")";
    }

    public WireZoneSummary(int i, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.idx = i;
        this.title = title;
    }

    public /* synthetic */ WireZoneSummary(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
