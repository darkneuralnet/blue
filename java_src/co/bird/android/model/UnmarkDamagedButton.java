package co.bird.android.model;

import co.bird.android.model.wire.WireBird;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/UnmarkDamagedButton;", "Lco/bird/android/model/CommandCenterButton;", Entry.TYPE_TEXT, "", "bird", "Lco/bird/android/model/wire/WireBird;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;)V", "getBird", "()Lco/bird/android/model/wire/WireBird;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UnmarkDamagedButton extends CommandCenterButton {
    private final WireBird bird;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmarkDamagedButton(String str, WireBird bird) {
        super(null);
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.text = str;
        this.bird = bird;
    }

    public static /* synthetic */ UnmarkDamagedButton copy$default(UnmarkDamagedButton unmarkDamagedButton, String str, WireBird wireBird, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unmarkDamagedButton.text;
        }
        if ((i & 2) != 0) {
            wireBird = unmarkDamagedButton.bird;
        }
        return unmarkDamagedButton.copy(str, wireBird);
    }

    public final String component1() {
        return this.text;
    }

    public final WireBird component2() {
        return this.bird;
    }

    public final UnmarkDamagedButton copy(String str, WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new UnmarkDamagedButton(str, bird);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnmarkDamagedButton) {
            UnmarkDamagedButton unmarkDamagedButton = (UnmarkDamagedButton) obj;
            return Intrinsics.areEqual(this.text, unmarkDamagedButton.text) && Intrinsics.areEqual(this.bird, unmarkDamagedButton.bird);
        }
        return false;
    }

    @Override // co.bird.android.model.CommandCenterButton
    public WireBird getBird() {
        return this.bird;
    }

    @Override // co.bird.android.model.CommandCenterButton
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.bird.hashCode();
    }

    public String toString() {
        String str = this.text;
        WireBird wireBird = this.bird;
        return "UnmarkDamagedButton(text=" + str + ", bird=" + wireBird + ")";
    }
}
