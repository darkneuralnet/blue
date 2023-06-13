package co.bird.android.model;

import android.graphics.drawable.Drawable;
import co.bird.android.model.persistence.nestedstructures.NestFavoritePartner;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/FavoriteNestButton;", "Lco/bird/android/model/NestFlightSheetGenericButton;", "Lco/bird/android/model/NestFlightSheetButton;", "buttonText", "", "textColor", "", "icon", "Landroid/graphics/drawable/Drawable;", "nestId", "availableFavoritePartners", "", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "(Ljava/lang/String;ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/util/List;)V", "getAvailableFavoritePartners", "()Ljava/util/List;", "getButtonText", "()Ljava/lang/String;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getNestId", "getTextColor", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FavoriteNestButton extends NestFlightSheetGenericButton implements NestFlightSheetButton {
    private final List<NestFavoritePartner> availableFavoritePartners;
    private final String buttonText;
    private final Drawable icon;
    private final String nestId;
    private final int textColor;

    public FavoriteNestButton(String buttonText, int i, Drawable drawable, String nestId, List<NestFavoritePartner> availableFavoritePartners) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(availableFavoritePartners, "availableFavoritePartners");
        this.buttonText = buttonText;
        this.textColor = i;
        this.icon = drawable;
        this.nestId = nestId;
        this.availableFavoritePartners = availableFavoritePartners;
    }

    public static /* synthetic */ FavoriteNestButton copy$default(FavoriteNestButton favoriteNestButton, String str, int i, Drawable drawable, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = favoriteNestButton.buttonText;
        }
        if ((i2 & 2) != 0) {
            i = favoriteNestButton.textColor;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            drawable = favoriteNestButton.icon;
        }
        Drawable drawable2 = drawable;
        if ((i2 & 8) != 0) {
            str2 = favoriteNestButton.nestId;
        }
        String str3 = str2;
        List<NestFavoritePartner> list2 = list;
        if ((i2 & 16) != 0) {
            list2 = favoriteNestButton.availableFavoritePartners;
        }
        return favoriteNestButton.copy(str, i3, drawable2, str3, list2);
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

    public final List<NestFavoritePartner> component5() {
        return this.availableFavoritePartners;
    }

    public final FavoriteNestButton copy(String buttonText, int i, Drawable drawable, String nestId, List<NestFavoritePartner> availableFavoritePartners) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Intrinsics.checkNotNullParameter(availableFavoritePartners, "availableFavoritePartners");
        return new FavoriteNestButton(buttonText, i, drawable, nestId, availableFavoritePartners);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FavoriteNestButton) {
            FavoriteNestButton favoriteNestButton = (FavoriteNestButton) obj;
            return Intrinsics.areEqual(this.buttonText, favoriteNestButton.buttonText) && this.textColor == favoriteNestButton.textColor && Intrinsics.areEqual(this.icon, favoriteNestButton.icon) && Intrinsics.areEqual(this.nestId, favoriteNestButton.nestId) && Intrinsics.areEqual(this.availableFavoritePartners, favoriteNestButton.availableFavoritePartners);
        }
        return false;
    }

    public final List<NestFavoritePartner> getAvailableFavoritePartners() {
        return this.availableFavoritePartners;
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
        return ((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.nestId.hashCode()) * 31) + this.availableFavoritePartners.hashCode();
    }

    public String toString() {
        String str = this.buttonText;
        int i = this.textColor;
        Drawable drawable = this.icon;
        String str2 = this.nestId;
        List<NestFavoritePartner> list = this.availableFavoritePartners;
        return "FavoriteNestButton(buttonText=" + str + ", textColor=" + i + ", icon=" + drawable + ", nestId=" + str2 + ", availableFavoritePartners=" + list + ")";
    }
}
