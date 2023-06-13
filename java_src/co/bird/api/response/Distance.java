package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/api/response/Distance;", "", Entry.TYPE_TEXT, "", "value", "", "(Ljava/lang/String;I)V", "getText", "()Ljava/lang/String;", "getValue", "()I", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Distance {
    @JsonProperty(Entry.TYPE_TEXT)
    @InterfaceC41208ft5(Entry.TYPE_TEXT)
    private final String text;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final int value;

    public Distance() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ Distance copy$default(Distance distance, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = distance.text;
        }
        if ((i2 & 2) != 0) {
            i = distance.value;
        }
        return distance.copy(str, i);
    }

    public final String component1() {
        return this.text;
    }

    public final int component2() {
        return this.value;
    }

    public final Distance copy(String str, int i) {
        return new Distance(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Distance) {
            Distance distance = (Distance) obj;
            return Intrinsics.areEqual(this.text, distance.text) && this.value == distance.value;
        }
        return false;
    }

    public final String getText() {
        return this.text;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.text;
        return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.value);
    }

    public String toString() {
        String str = this.text;
        int i = this.value;
        return "Distance(text=" + str + ", value=" + i + ")";
    }

    public Distance(String str, int i) {
        this.text = str;
        this.value = i;
    }

    public /* synthetic */ Distance(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i);
    }
}
