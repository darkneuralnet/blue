package co.bird.android.model.persistence.nestedstructures;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/NestBirdle;", "Lco/bird/android/model/persistence/nestedstructures/NestFlightSheetSection;", "idx", "", "icons", "", "Lco/bird/android/model/persistence/nestedstructures/NestBirdleIcon;", "(ILjava/util/List;)V", "getIcons", "()Ljava/util/List;", "getIdx", "()I", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NestBirdle implements NestFlightSheetSection {
    @JsonProperty("icons")
    @InterfaceC41208ft5("icons")
    private final List<NestBirdleIcon> icons;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;

    public NestBirdle(int i, List<NestBirdleIcon> icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.idx = i;
        this.icons = icons;
    }

    public final List<NestBirdleIcon> getIcons() {
        return this.icons;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.NestFlightSheetSection
    public int getIdx() {
        return this.idx;
    }
}
