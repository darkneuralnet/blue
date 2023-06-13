package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneAnnotationLabel;", "", Entry.TYPE_TEXT, "", "color", "Lco/bird/android/model/wire/WireThemedColors;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireThemedColors;)V", "getColor", "()Lco/bird/android/model/wire/WireThemedColors;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneAnnotationLabel {
    @JsonProperty("color")
    @InterfaceC41208ft5("color")
    private final WireThemedColors color;
    @JsonProperty(Entry.TYPE_TEXT)
    @InterfaceC41208ft5(Entry.TYPE_TEXT)
    private final String text;

    public WireZoneAnnotationLabel() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WireZoneAnnotationLabel copy$default(WireZoneAnnotationLabel wireZoneAnnotationLabel, String str, WireThemedColors wireThemedColors, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireZoneAnnotationLabel.text;
        }
        if ((i & 2) != 0) {
            wireThemedColors = wireZoneAnnotationLabel.color;
        }
        return wireZoneAnnotationLabel.copy(str, wireThemedColors);
    }

    public final String component1() {
        return this.text;
    }

    public final WireThemedColors component2() {
        return this.color;
    }

    public final WireZoneAnnotationLabel copy(String text, WireThemedColors color) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        return new WireZoneAnnotationLabel(text, color);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneAnnotationLabel) {
            WireZoneAnnotationLabel wireZoneAnnotationLabel = (WireZoneAnnotationLabel) obj;
            return Intrinsics.areEqual(this.text, wireZoneAnnotationLabel.text) && Intrinsics.areEqual(this.color, wireZoneAnnotationLabel.color);
        }
        return false;
    }

    public final WireThemedColors getColor() {
        return this.color;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.color.hashCode();
    }

    public String toString() {
        String str = this.text;
        WireThemedColors wireThemedColors = this.color;
        return "WireZoneAnnotationLabel(text=" + str + ", color=" + wireThemedColors + ")";
    }

    public WireZoneAnnotationLabel(String text, WireThemedColors color) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        this.text = text;
        this.color = color;
    }

    public /* synthetic */ WireZoneAnnotationLabel(String str, WireThemedColors wireThemedColors, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new WireThemedColors(0, 0, 3, null) : wireThemedColors);
    }
}
