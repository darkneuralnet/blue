package co.bird.android.model;

import co.bird.android.model.persistence.Bird;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/LocateBirdButton;", "Lco/bird/android/model/FlightSheetButton;", Entry.TYPE_TEXT, "", "bird", "Lco/bird/android/model/persistence/Bird;", "(Ljava/lang/String;Lco/bird/android/model/persistence/Bird;)V", "getBird", "()Lco/bird/android/model/persistence/Bird;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LocateBirdButton extends FlightSheetButton {
    private final Bird bird;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocateBirdButton(String text, Bird bird) {
        super(null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.text = text;
        this.bird = bird;
    }

    public static /* synthetic */ LocateBirdButton copy$default(LocateBirdButton locateBirdButton, String str, Bird bird, int i, Object obj) {
        if ((i & 1) != 0) {
            str = locateBirdButton.text;
        }
        if ((i & 2) != 0) {
            bird = locateBirdButton.bird;
        }
        return locateBirdButton.copy(str, bird);
    }

    public final String component1() {
        return this.text;
    }

    public final Bird component2() {
        return this.bird;
    }

    public final LocateBirdButton copy(String text, Bird bird) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new LocateBirdButton(text, bird);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocateBirdButton) {
            LocateBirdButton locateBirdButton = (LocateBirdButton) obj;
            return Intrinsics.areEqual(this.text, locateBirdButton.text) && Intrinsics.areEqual(this.bird, locateBirdButton.bird);
        }
        return false;
    }

    public final Bird getBird() {
        return this.bird;
    }

    @Override // co.bird.android.model.FlightSheetButton
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.bird.hashCode();
    }

    public String toString() {
        String str = this.text;
        Bird bird = this.bird;
        return "LocateBirdButton(text=" + str + ", bird=" + bird + ")";
    }
}
