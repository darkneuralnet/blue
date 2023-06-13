package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/wire/WireDisplayValue;", "", "title", "", "description", "value", "textColor", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getDescription", "()Ljava/lang/String;", "getTextColor", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTitle", "getValue", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lco/bird/android/model/wire/WireDisplayValue;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireDisplayValue {
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("text_color")
    @InterfaceC41208ft5("text_color")
    private final Long textColor;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final String value;

    public WireDisplayValue() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WireDisplayValue copy$default(WireDisplayValue wireDisplayValue, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireDisplayValue.title;
        }
        if ((i & 2) != 0) {
            str2 = wireDisplayValue.description;
        }
        if ((i & 4) != 0) {
            str3 = wireDisplayValue.value;
        }
        if ((i & 8) != 0) {
            l = wireDisplayValue.textColor;
        }
        return wireDisplayValue.copy(str, str2, str3, l);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.value;
    }

    public final Long component4() {
        return this.textColor;
    }

    public final WireDisplayValue copy(String title, String str, String str2, Long l) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new WireDisplayValue(title, str, str2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireDisplayValue) {
            WireDisplayValue wireDisplayValue = (WireDisplayValue) obj;
            return Intrinsics.areEqual(this.title, wireDisplayValue.title) && Intrinsics.areEqual(this.description, wireDisplayValue.description) && Intrinsics.areEqual(this.value, wireDisplayValue.value) && Intrinsics.areEqual(this.textColor, wireDisplayValue.textColor);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getTextColor() {
        return this.textColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.textColor;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.value;
        Long l = this.textColor;
        return "WireDisplayValue(title=" + str + ", description=" + str2 + ", value=" + str3 + ", textColor=" + l + ")";
    }

    public WireDisplayValue(String title, String str, String str2, Long l) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.description = str;
        this.value = str2;
        this.textColor = l;
    }

    public /* synthetic */ WireDisplayValue(String str, String str2, String str3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l);
    }
}
