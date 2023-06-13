package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.NotificationIconPinShape;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;", "", "icon", "Lco/bird/android/model/constant/ClientIcon;", "iconColor", "Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "iconBackgroundColor", "pinShape", "Lco/bird/android/model/constant/NotificationIconPinShape;", "(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NotificationIconPinShape;)V", "getIcon", "()Lco/bird/android/model/constant/ClientIcon;", "getIconBackgroundColor", "()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;", "getIconColor", "getPinShape", "()Lco/bird/android/model/constant/NotificationIconPinShape;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorNotificationIcon {
    @JsonProperty("icon")
    @InterfaceC41208ft5("icon")
    private final ClientIcon icon;
    @JsonProperty("icon_background_color")
    @InterfaceC41208ft5("icon_background_color")
    private final ThemedColors iconBackgroundColor;
    @JsonProperty("icon_color")
    @InterfaceC41208ft5("icon_color")
    private final ThemedColors iconColor;
    @JsonProperty("pin_shape")
    @InterfaceC41208ft5("pin_shape")
    private final NotificationIconPinShape pinShape;

    public OperatorNotificationIcon() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OperatorNotificationIcon copy$default(OperatorNotificationIcon operatorNotificationIcon, ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, NotificationIconPinShape notificationIconPinShape, int i, Object obj) {
        if ((i & 1) != 0) {
            clientIcon = operatorNotificationIcon.icon;
        }
        if ((i & 2) != 0) {
            themedColors = operatorNotificationIcon.iconColor;
        }
        if ((i & 4) != 0) {
            themedColors2 = operatorNotificationIcon.iconBackgroundColor;
        }
        if ((i & 8) != 0) {
            notificationIconPinShape = operatorNotificationIcon.pinShape;
        }
        return operatorNotificationIcon.copy(clientIcon, themedColors, themedColors2, notificationIconPinShape);
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

    public final NotificationIconPinShape component4() {
        return this.pinShape;
    }

    public final OperatorNotificationIcon copy(ClientIcon icon, ThemedColors iconColor, ThemedColors iconBackgroundColor, NotificationIconPinShape pinShape) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        Intrinsics.checkNotNullParameter(pinShape, "pinShape");
        return new OperatorNotificationIcon(icon, iconColor, iconBackgroundColor, pinShape);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorNotificationIcon) {
            OperatorNotificationIcon operatorNotificationIcon = (OperatorNotificationIcon) obj;
            return this.icon == operatorNotificationIcon.icon && Intrinsics.areEqual(this.iconColor, operatorNotificationIcon.iconColor) && Intrinsics.areEqual(this.iconBackgroundColor, operatorNotificationIcon.iconBackgroundColor) && this.pinShape == operatorNotificationIcon.pinShape;
        }
        return false;
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

    public final NotificationIconPinShape getPinShape() {
        return this.pinShape;
    }

    public int hashCode() {
        return (((((this.icon.hashCode() * 31) + this.iconColor.hashCode()) * 31) + this.iconBackgroundColor.hashCode()) * 31) + this.pinShape.hashCode();
    }

    public String toString() {
        ClientIcon clientIcon = this.icon;
        ThemedColors themedColors = this.iconColor;
        ThemedColors themedColors2 = this.iconBackgroundColor;
        NotificationIconPinShape notificationIconPinShape = this.pinShape;
        return "OperatorNotificationIcon(icon=" + clientIcon + ", iconColor=" + themedColors + ", iconBackgroundColor=" + themedColors2 + ", pinShape=" + notificationIconPinShape + ")";
    }

    public OperatorNotificationIcon(ClientIcon icon, ThemedColors iconColor, ThemedColors iconBackgroundColor, NotificationIconPinShape pinShape) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(iconBackgroundColor, "iconBackgroundColor");
        Intrinsics.checkNotNullParameter(pinShape, "pinShape");
        this.icon = icon;
        this.iconColor = iconColor;
        this.iconBackgroundColor = iconBackgroundColor;
        this.pinShape = pinShape;
    }

    public /* synthetic */ OperatorNotificationIcon(ClientIcon clientIcon, ThemedColors themedColors, ThemedColors themedColors2, NotificationIconPinShape notificationIconPinShape, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientIcon.UNKNOWN : clientIcon, (i & 2) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors, (i & 4) != 0 ? new ThemedColors(0, 0, 3, null) : themedColors2, (i & 8) != 0 ? NotificationIconPinShape.UNKNOWN : notificationIconPinShape);
    }
}
