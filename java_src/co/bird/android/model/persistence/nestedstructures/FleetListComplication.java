package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;", "", "()V", "BatteryComplication", "IconComplication", "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;", "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$IconComplication;", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class FleetListComplication {

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;", "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;", "battery", "", "(I)V", "getBattery", "()I", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class BatteryComplication extends FleetListComplication {
        @JsonProperty("battery")
        @InterfaceC41208ft5("battery")
        private final int battery;

        public BatteryComplication() {
            this(0, 1, null);
        }

        public static /* synthetic */ BatteryComplication copy$default(BatteryComplication batteryComplication, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = batteryComplication.battery;
            }
            return batteryComplication.copy(i);
        }

        public final int component1() {
            return this.battery;
        }

        public final BatteryComplication copy(int i) {
            return new BatteryComplication(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BatteryComplication) && this.battery == ((BatteryComplication) obj).battery;
        }

        public final int getBattery() {
            return this.battery;
        }

        public int hashCode() {
            return Integer.hashCode(this.battery);
        }

        public String toString() {
            int i = this.battery;
            return "BatteryComplication(battery=" + i + ")";
        }

        public /* synthetic */ BatteryComplication(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public BatteryComplication(int i) {
            super(null);
            this.battery = i;
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$IconComplication;", "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;", "icon", "Lco/bird/android/model/constant/ClientIcon;", "numIcons", "", "numFilled", "unfilledColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "filledColor", "(Lco/bird/android/model/constant/ClientIcon;IILco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V", "getFilledColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getNumFilled", "()I", "getNumIcons", "getUnfilledColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class IconComplication extends FleetListComplication {
        @JsonProperty("filled_color")
        @InterfaceC41208ft5("filled_color")
        private final ThemedColors filledColor;
        @JsonProperty("icon")
        @InterfaceC41208ft5("icon")
        private final ClientIcon icon;
        @JsonProperty("num_filled")
        @InterfaceC41208ft5("num_filled")
        private final int numFilled;
        @JsonProperty("num_icons")
        @InterfaceC41208ft5("num_icons")
        private final int numIcons;
        @JsonProperty("unfilled_color")
        @InterfaceC41208ft5("unfilled_color")
        private final ThemedColors unfilledColor;

        public IconComplication() {
            this(null, 0, 0, null, null, 31, null);
        }

        public static /* synthetic */ IconComplication copy$default(IconComplication iconComplication, ClientIcon clientIcon, int i, int i2, ThemedColors themedColors, ThemedColors themedColors2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                clientIcon = iconComplication.icon;
            }
            if ((i3 & 2) != 0) {
                i = iconComplication.numIcons;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = iconComplication.numFilled;
            }
            int i5 = i2;
            if ((i3 & 8) != 0) {
                themedColors = iconComplication.unfilledColor;
            }
            ThemedColors themedColors3 = themedColors;
            if ((i3 & 16) != 0) {
                themedColors2 = iconComplication.filledColor;
            }
            return iconComplication.copy(clientIcon, i4, i5, themedColors3, themedColors2);
        }

        public final ClientIcon component1() {
            return this.icon;
        }

        public final int component2() {
            return this.numIcons;
        }

        public final int component3() {
            return this.numFilled;
        }

        public final ThemedColors component4() {
            return this.unfilledColor;
        }

        public final ThemedColors component5() {
            return this.filledColor;
        }

        public final IconComplication copy(ClientIcon icon, int i, int i2, ThemedColors unfilledColor, ThemedColors filledColor) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(unfilledColor, "unfilledColor");
            Intrinsics.checkNotNullParameter(filledColor, "filledColor");
            return new IconComplication(icon, i, i2, unfilledColor, filledColor);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof IconComplication) {
                IconComplication iconComplication = (IconComplication) obj;
                return this.icon == iconComplication.icon && this.numIcons == iconComplication.numIcons && this.numFilled == iconComplication.numFilled && Intrinsics.areEqual(this.unfilledColor, iconComplication.unfilledColor) && Intrinsics.areEqual(this.filledColor, iconComplication.filledColor);
            }
            return false;
        }

        public final ThemedColors getFilledColor() {
            return this.filledColor;
        }

        public final ClientIcon getIcon() {
            return this.icon;
        }

        public final int getNumFilled() {
            return this.numFilled;
        }

        public final int getNumIcons() {
            return this.numIcons;
        }

        public final ThemedColors getUnfilledColor() {
            return this.unfilledColor;
        }

        public int hashCode() {
            return (((((((this.icon.hashCode() * 31) + Integer.hashCode(this.numIcons)) * 31) + Integer.hashCode(this.numFilled)) * 31) + this.unfilledColor.hashCode()) * 31) + this.filledColor.hashCode();
        }

        public String toString() {
            ClientIcon clientIcon = this.icon;
            int i = this.numIcons;
            int i2 = this.numFilled;
            ThemedColors themedColors = this.unfilledColor;
            ThemedColors themedColors2 = this.filledColor;
            return "IconComplication(icon=" + clientIcon + ", numIcons=" + i + ", numFilled=" + i2 + ", unfilledColor=" + themedColors + ", filledColor=" + themedColors2 + ")";
        }

        public /* synthetic */ IconComplication(ClientIcon clientIcon, int i, int i2, ThemedColors themedColors, ThemedColors themedColors2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors, (i3 & 16) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconComplication(ClientIcon icon, int i, int i2, ThemedColors unfilledColor, ThemedColors filledColor) {
            super(null);
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(unfilledColor, "unfilledColor");
            Intrinsics.checkNotNullParameter(filledColor, "filledColor");
            this.icon = icon;
            this.numIcons = i;
            this.numFilled = i2;
            this.unfilledColor = unfilledColor;
            this.filledColor = filledColor;
        }
    }

    public /* synthetic */ FleetListComplication(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FleetListComplication() {
    }
}
