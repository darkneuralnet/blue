package co.bird.android.model;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/FlagNestButton;", "Lco/bird/android/model/NestFlightSheetGenericButton;", "Lco/bird/android/model/NestFlightSheetButton;", "buttonText", "", "textColor", "", "icon", "Landroid/graphics/drawable/Drawable;", "nestId", "(Ljava/lang/String;ILandroid/graphics/drawable/Drawable;Ljava/lang/String;)V", "getButtonText", "()Ljava/lang/String;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getNestId", "getTextColor", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlagNestButton extends NestFlightSheetGenericButton implements NestFlightSheetButton {
    private final String buttonText;
    private final Drawable icon;
    private final String nestId;
    private final int textColor;

    public FlagNestButton(String buttonText, int i, Drawable drawable, String nestId) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        this.buttonText = buttonText;
        this.textColor = i;
        this.icon = drawable;
        this.nestId = nestId;
    }

    public static /* synthetic */ FlagNestButton copy$default(FlagNestButton flagNestButton, String str, int i, Drawable drawable, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = flagNestButton.buttonText;
        }
        if ((i2 & 2) != 0) {
            i = flagNestButton.textColor;
        }
        if ((i2 & 4) != 0) {
            drawable = flagNestButton.icon;
        }
        if ((i2 & 8) != 0) {
            str2 = flagNestButton.nestId;
        }
        return flagNestButton.copy(str, i, drawable, str2);
    }

    public final String component1() {
        return this.buttonText;
    }

    public final int component2() {
        return this.textColor;
    }

    public final Drawable component3() {
        return this.icon;
    }

    public final String component4() {
        return this.nestId;
    }

    public final FlagNestButton copy(String buttonText, int i, Drawable drawable, String nestId) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        return new FlagNestButton(buttonText, i, drawable, nestId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlagNestButton) {
            FlagNestButton flagNestButton = (FlagNestButton) obj;
            return Intrinsics.areEqual(this.buttonText, flagNestButton.buttonText) && this.textColor == flagNestButton.textColor && Intrinsics.areEqual(this.icon, flagNestButton.icon) && Intrinsics.areEqual(this.nestId, flagNestButton.nestId);
        }
        return false;
    }

    @Override // co.bird.android.model.NestFlightSheetGenericButton
    public String getButtonText() {
        return this.buttonText;
    }

    @Override // co.bird.android.model.NestFlightSheetGenericButton
    public Drawable getIcon() {
        return this.icon;
    }

    public final String getNestId() {
        return this.nestId;
    }

    @Override // co.bird.android.model.NestFlightSheetGenericButton
    public int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = ((this.buttonText.hashCode() * 31) + Integer.hashCode(this.textColor)) * 31;
        Drawable drawable = this.icon;
        return ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.nestId.hashCode();
    }

    public String toString() {
        String str = this.buttonText;
        int i = this.textColor;
        Drawable drawable = this.icon;
        String str2 = this.nestId;
        return "FlagNestButton(buttonText=" + str + ", textColor=" + i + ", icon=" + drawable + ", nestId=" + str2 + ")";
    }
}
