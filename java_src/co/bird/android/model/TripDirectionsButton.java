package co.bird.android.model;

import co.bird.android.model.wire.WireLocation;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/TripDirectionsButton;", "Lco/bird/android/model/TripBottomSheetButton;", Entry.TYPE_TEXT, "", "stopId", "location", "Lco/bird/android/model/wire/WireLocation;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;)V", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getStopId", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TripDirectionsButton extends TripBottomSheetButton {
    private final WireLocation location;
    private final String stopId;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripDirectionsButton(String text, String stopId, WireLocation location) {
        super(null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(stopId, "stopId");
        Intrinsics.checkNotNullParameter(location, "location");
        this.text = text;
        this.stopId = stopId;
        this.location = location;
    }

    public static /* synthetic */ TripDirectionsButton copy$default(TripDirectionsButton tripDirectionsButton, String str, String str2, WireLocation wireLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tripDirectionsButton.text;
        }
        if ((i & 2) != 0) {
            str2 = tripDirectionsButton.stopId;
        }
        if ((i & 4) != 0) {
            wireLocation = tripDirectionsButton.location;
        }
        return tripDirectionsButton.copy(str, str2, wireLocation);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.stopId;
    }

    public final WireLocation component3() {
        return this.location;
    }

    public final TripDirectionsButton copy(String text, String stopId, WireLocation location) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(stopId, "stopId");
        Intrinsics.checkNotNullParameter(location, "location");
        return new TripDirectionsButton(text, stopId, location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TripDirectionsButton) {
            TripDirectionsButton tripDirectionsButton = (TripDirectionsButton) obj;
            return Intrinsics.areEqual(this.text, tripDirectionsButton.text) && Intrinsics.areEqual(this.stopId, tripDirectionsButton.stopId) && Intrinsics.areEqual(this.location, tripDirectionsButton.location);
        }
        return false;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    @Override // co.bird.android.model.TripBottomSheetButton
    public String getStopId() {
        return this.stopId;
    }

    @Override // co.bird.android.model.TripBottomSheetButton
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.stopId.hashCode()) * 31) + this.location.hashCode();
    }

    public String toString() {
        String str = this.text;
        String str2 = this.stopId;
        WireLocation wireLocation = this.location;
        return "TripDirectionsButton(text=" + str + ", stopId=" + str2 + ", location=" + wireLocation + ")";
    }
}
