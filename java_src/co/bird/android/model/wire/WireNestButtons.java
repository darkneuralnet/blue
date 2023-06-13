package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.NestButton;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/wire/WireNestButtons;", "Lco/bird/android/model/wire/WireNestFlightSheetSection;", "idx", "", "availableFavoritePartners", "", "Lco/bird/android/model/wire/WireNestFavoritePartner;", "buttons", "Lco/bird/android/model/constant/NestButton;", "(ILjava/util/List;Ljava/util/List;)V", "getAvailableFavoritePartners", "()Ljava/util/List;", "getButtons", "getIdx", "()I", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireNestButtons implements WireNestFlightSheetSection {
    @JsonProperty("available_favorite_partners")
    @InterfaceC41208ft5("available_favorite_partners")
    private final List<WireNestFavoritePartner> availableFavoritePartners;
    @JsonProperty("buttons")
    @InterfaceC41208ft5("buttons")
    private final List<NestButton> buttons;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;

    /* JADX WARN: Multi-variable type inference failed */
    public WireNestButtons(int i, List<WireNestFavoritePartner> list, List<? extends NestButton> buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.idx = i;
        this.availableFavoritePartners = list;
        this.buttons = buttons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireNestButtons copy$default(WireNestButtons wireNestButtons, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wireNestButtons.idx;
        }
        if ((i2 & 2) != 0) {
            list = wireNestButtons.availableFavoritePartners;
        }
        if ((i2 & 4) != 0) {
            list2 = wireNestButtons.buttons;
        }
        return wireNestButtons.copy(i, list, list2);
    }

    public final int component1() {
        return this.idx;
    }

    public final List<WireNestFavoritePartner> component2() {
        return this.availableFavoritePartners;
    }

    public final List<NestButton> component3() {
        return this.buttons;
    }

    public final WireNestButtons copy(int i, List<WireNestFavoritePartner> list, List<? extends NestButton> buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new WireNestButtons(i, list, buttons);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireNestButtons) {
            WireNestButtons wireNestButtons = (WireNestButtons) obj;
            return this.idx == wireNestButtons.idx && Intrinsics.areEqual(this.availableFavoritePartners, wireNestButtons.availableFavoritePartners) && Intrinsics.areEqual(this.buttons, wireNestButtons.buttons);
        }
        return false;
    }

    public final List<WireNestFavoritePartner> getAvailableFavoritePartners() {
        return this.availableFavoritePartners;
    }

    public final List<NestButton> getButtons() {
        return this.buttons;
    }

    @Override // co.bird.android.model.wire.WireNestFlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.idx) * 31;
        List<WireNestFavoritePartner> list = this.availableFavoritePartners;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.buttons.hashCode();
    }

    public String toString() {
        int i = this.idx;
        List<WireNestFavoritePartner> list = this.availableFavoritePartners;
        List<NestButton> list2 = this.buttons;
        return "WireNestButtons(idx=" + i + ", availableFavoritePartners=" + list + ", buttons=" + list2 + ")";
    }

    public /* synthetic */ WireNestButtons(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
