package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.NestButton;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/NestButtons;", "Lco/bird/android/model/persistence/nestedstructures/NestFlightSheetSection;", "idx", "", "availableFavoritePartners", "", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "buttons", "Lco/bird/android/model/constant/NestButton;", "(ILjava/util/List;Ljava/util/List;)V", "getAvailableFavoritePartners", "()Ljava/util/List;", "getButtons", "getIdx", "()I", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestButtons implements NestFlightSheetSection {
    @JsonProperty("available_favorite_partners")
    @InterfaceC41208ft5("available_favorite_partners")
    private final List<NestFavoritePartner> availableFavoritePartners;
    @JsonProperty("buttons")
    @InterfaceC41208ft5("buttons")
    private final List<NestButton> buttons;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;

    /* JADX WARN: Multi-variable type inference failed */
    public NestButtons(int i, List<NestFavoritePartner> availableFavoritePartners, List<? extends NestButton> buttons) {
        Intrinsics.checkNotNullParameter(availableFavoritePartners, "availableFavoritePartners");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.idx = i;
        this.availableFavoritePartners = availableFavoritePartners;
        this.buttons = buttons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NestButtons copy$default(NestButtons nestButtons, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nestButtons.idx;
        }
        if ((i2 & 2) != 0) {
            list = nestButtons.availableFavoritePartners;
        }
        if ((i2 & 4) != 0) {
            list2 = nestButtons.buttons;
        }
        return nestButtons.copy(i, list, list2);
    }

    public final int component1() {
        return this.idx;
    }

    public final List<NestFavoritePartner> component2() {
        return this.availableFavoritePartners;
    }

    public final List<NestButton> component3() {
        return this.buttons;
    }

    public final NestButtons copy(int i, List<NestFavoritePartner> availableFavoritePartners, List<? extends NestButton> buttons) {
        Intrinsics.checkNotNullParameter(availableFavoritePartners, "availableFavoritePartners");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new NestButtons(i, availableFavoritePartners, buttons);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestButtons) {
            NestButtons nestButtons = (NestButtons) obj;
            return this.idx == nestButtons.idx && Intrinsics.areEqual(this.availableFavoritePartners, nestButtons.availableFavoritePartners) && Intrinsics.areEqual(this.buttons, nestButtons.buttons);
        }
        return false;
    }

    public final List<NestFavoritePartner> getAvailableFavoritePartners() {
        return this.availableFavoritePartners;
    }

    public final List<NestButton> getButtons() {
        return this.buttons;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.NestFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.idx) * 31) + this.availableFavoritePartners.hashCode()) * 31) + this.buttons.hashCode();
    }

    public String toString() {
        int i = this.idx;
        List<NestFavoritePartner> list = this.availableFavoritePartners;
        List<NestButton> list2 = this.buttons;
        return "NestButtons(idx=" + i + ", availableFavoritePartners=" + list + ", buttons=" + list2 + ")";
    }
}
