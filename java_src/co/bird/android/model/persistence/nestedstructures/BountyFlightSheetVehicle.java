package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\rJF\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetVehicle;", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "iconBackgroundColor", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "battery", "", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/Integer;)V", "getBattery", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/String;", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getIconColor", "component1", "component2", "component3", "component4", "component5", "copy", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/Integer;)Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetVehicle;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BountyFlightSheetVehicle {
    @JsonProperty("battery")
    @InterfaceC41208ft5("battery")
    private final Integer battery;
    @JsonProperty(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    @InterfaceC41208ft5(PaymentMethodOptionsParams.Blik.PARAM_CODE)
    private final String code;
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_background_color")
    @InterfaceC41208ft5("icon_background_color")
    private final ThemedColors iconBackgroundColor;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final ThemedColors iconColor;

    public BountyFlightSheetVehicle(ClientIcon clientIcon, ThemedColors themedColors, ThemedColors iconBackgroundColor, String code, Integer num) {
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        Intrinsics.checkNotNullParameter(code, "code");
        this.icon = clientIcon;
        this.iconColor = themedColors;
        this.iconBackgroundColor = iconBackgroundColor;
        this.code = code;
        this.battery = num;
    }

    public static /* synthetic */ BountyFlightSheetVehicle copy$default(BountyFlightSheetVehicle bountyFlightSheetVehicle, ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            clientIcon = bountyFlightSheetVehicle.icon;
        }
        if ((i & 2) != 0) {
            themedColors = bountyFlightSheetVehicle.iconColor;
        }
        ThemedColors themedColors3 = themedColors;
        if ((i & 4) != 0) {
            themedColors2 = bountyFlightSheetVehicle.iconBackgroundColor;
        }
        ThemedColors themedColors4 = themedColors2;
        if ((i & 8) != 0) {
            str = bountyFlightSheetVehicle.code;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            num = bountyFlightSheetVehicle.battery;
        }
        return bountyFlightSheetVehicle.copy(clientIcon, themedColors3, themedColors4, str2, num);
    }

    public final ClientIcon component1() {
        return this.icon;
    }

    public final ThemedColors component2() {
        return this.iconColor;
    }

    public final ThemedColors component3() {
        return this.iconBackgroundColor;
    }

    public final String component4() {
        return this.code;
    }

    public final Integer component5() {
        return this.battery;
    }

    public final BountyFlightSheetVehicle copy(ClientIcon clientIcon, ThemedColors themedColors, ThemedColors iconBackgroundColor, String code, Integer num) {
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        Intrinsics.checkNotNullParameter(code, "code");
        return new BountyFlightSheetVehicle(clientIcon, themedColors, iconBackgroundColor, code, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BountyFlightSheetVehicle) {
            BountyFlightSheetVehicle bountyFlightSheetVehicle = (BountyFlightSheetVehicle) obj;
            return this.icon == bountyFlightSheetVehicle.icon && Intrinsics.areEqual(this.iconColor, bountyFlightSheetVehicle.iconColor) && Intrinsics.areEqual(this.iconBackgroundColor, bountyFlightSheetVehicle.iconBackgroundColor) && Intrinsics.areEqual(this.code, bountyFlightSheetVehicle.code) && Intrinsics.areEqual(this.battery, bountyFlightSheetVehicle.battery);
        }
        return false;
    }

    public final Integer getBattery() {
        return this.battery;
    }

    public final String getCode() {
        return this.code;
    }

    public final ClientIcon getIcon() {
        return this.icon;
    }

    public final ThemedColors getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final ThemedColors getIconColor() {
        return this.iconColor;
    }

    public int hashCode() {
        ClientIcon clientIcon = this.icon;
        int hashCode = (clientIcon == null ? 0 : clientIcon.hashCode()) * 31;
        ThemedColors themedColors = this.iconColor;
        int hashCode2 = (((((hashCode + (themedColors == null ? 0 : themedColors.hashCode())) * 31) + this.iconBackgroundColor.hashCode()) * 31) + this.code.hashCode()) * 31;
        Integer num = this.battery;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        ClientIcon clientIcon = this.icon;
        ThemedColors themedColors = this.iconColor;
        ThemedColors themedColors2 = this.iconBackgroundColor;
        String str = this.code;
        Integer num = this.battery;
        return "BountyFlightSheetVehicle(icon=" + clientIcon + ", iconColor=" + themedColors + ", iconBackgroundColor=" + themedColors2 + ", code=" + str + ", battery=" + num + ")";
    }

    public /* synthetic */ BountyFlightSheetVehicle(ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 2) != 0 ? null : themedColors, (i & 4) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors2, str, (i & 16) != 0 ? null : num);
    }
}
