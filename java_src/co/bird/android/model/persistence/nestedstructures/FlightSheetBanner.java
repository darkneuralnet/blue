package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;", "", Entry.TYPE_TEXT, "", "textColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "backgroundColor", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V", "getBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconColor", "getText", "()Ljava/lang/String;", "getTextColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetBanner {
    @JsonProperty("background_color")
    @InterfaceC41208ft5("background_color")
    private final ThemedColors backgroundColor;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final ThemedColors iconColor;
    @JsonProperty(Entry.TYPE_TEXT)
    @InterfaceC41208ft5(Entry.TYPE_TEXT)
    private final String text;
    @JsonProperty("text_color")
    @InterfaceC41208ft5("text_color")
    private final ThemedColors textColor;

    public FlightSheetBanner(String text, ThemedColors textColor, ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.text = text;
        this.textColor = textColor;
        this.icon = clientIcon;
        this.iconColor = themedColors;
        this.backgroundColor = themedColors2;
    }

    public static /* synthetic */ FlightSheetBanner copy$default(FlightSheetBanner flightSheetBanner, String str, ThemedColors themedColors, ClientIcon clientIcon, ThemedColors themedColors2, ThemedColors themedColors3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightSheetBanner.text;
        }
        if ((i & 2) != 0) {
            themedColors = flightSheetBanner.textColor;
        }
        ThemedColors themedColors4 = themedColors;
        if ((i & 4) != 0) {
            clientIcon = flightSheetBanner.icon;
        }
        ClientIcon clientIcon2 = clientIcon;
        if ((i & 8) != 0) {
            themedColors2 = flightSheetBanner.iconColor;
        }
        ThemedColors themedColors5 = themedColors2;
        if ((i & 16) != 0) {
            themedColors3 = flightSheetBanner.backgroundColor;
        }
        return flightSheetBanner.copy(str, themedColors4, clientIcon2, themedColors5, themedColors3);
    }

    public final String component1() {
        return this.text;
    }

    public final ThemedColors component2() {
        return this.textColor;
    }

    public final ClientIcon component3() {
        return this.icon;
    }

    public final ThemedColors component4() {
        return this.iconColor;
    }

    public final ThemedColors component5() {
        return this.backgroundColor;
    }

    public final FlightSheetBanner copy(String text, ThemedColors textColor, ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        return new FlightSheetBanner(text, textColor, clientIcon, themedColors, themedColors2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetBanner) {
            FlightSheetBanner flightSheetBanner = (FlightSheetBanner) obj;
            return Intrinsics.areEqual(this.text, flightSheetBanner.text) && Intrinsics.areEqual(this.textColor, flightSheetBanner.textColor) && this.icon == flightSheetBanner.icon && Intrinsics.areEqual(this.iconColor, flightSheetBanner.iconColor) && Intrinsics.areEqual(this.backgroundColor, flightSheetBanner.backgroundColor);
        }
        return false;
    }

    public final ThemedColors getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final ThemedColors getIconColor() {
        return this.iconColor;
    }

    public final String getText() {
        return this.text;
    }

    public final ThemedColors getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = ((this.text.hashCode() * 31) + this.textColor.hashCode()) * 31;
        ClientIcon clientIcon = this.icon;
        int hashCode2 = (hashCode + (clientIcon == null ? 0 : clientIcon.hashCode())) * 31;
        ThemedColors themedColors = this.iconColor;
        int hashCode3 = (hashCode2 + (themedColors == null ? 0 : themedColors.hashCode())) * 31;
        ThemedColors themedColors2 = this.backgroundColor;
        return hashCode3 + (themedColors2 != null ? themedColors2.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        ThemedColors themedColors = this.textColor;
        ClientIcon clientIcon = this.icon;
        ThemedColors themedColors2 = this.iconColor;
        ThemedColors themedColors3 = this.backgroundColor;
        return "FlightSheetBanner(text=" + str + ", textColor=" + themedColors + ", icon=" + clientIcon + ", iconColor=" + themedColors2 + ", backgroundColor=" + themedColors3 + ")";
    }
}
