package co.bird.android.model;

import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/AreaDirectionsButton;", "Lco/bird/android/model/AreaBottomSheetButton;", Entry.TYPE_TEXT, "", "location", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Geolocation;)V", "getLocation", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AreaDirectionsButton extends AreaBottomSheetButton {
    private final Geolocation location;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreaDirectionsButton(String text, Geolocation location) {
        super(null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(location, "location");
        this.text = text;
        this.location = location;
    }

    public static /* synthetic */ AreaDirectionsButton copy$default(AreaDirectionsButton areaDirectionsButton, String str, Geolocation geolocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = areaDirectionsButton.text;
        }
        if ((i & 2) != 0) {
            geolocation = areaDirectionsButton.location;
        }
        return areaDirectionsButton.copy(str, geolocation);
    }

    public final String component1() {
        return this.text;
    }

    public final Geolocation component2() {
        return this.location;
    }

    public final AreaDirectionsButton copy(String text, Geolocation location) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(location, "location");
        return new AreaDirectionsButton(text, location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AreaDirectionsButton) {
            AreaDirectionsButton areaDirectionsButton = (AreaDirectionsButton) obj;
            return Intrinsics.areEqual(this.text, areaDirectionsButton.text) && Intrinsics.areEqual(this.location, areaDirectionsButton.location);
        }
        return false;
    }

    public final Geolocation getLocation() {
        return this.location;
    }

    @Override // co.bird.android.model.AreaBottomSheetButton
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.location.hashCode();
    }

    public String toString() {
        String str = this.text;
        Geolocation geolocation = this.location;
        return "AreaDirectionsButton(text=" + str + ", location=" + geolocation + ")";
    }
}
