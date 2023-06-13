package co.bird.android.model;

import co.bird.android.model.wire.WireLocation;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/TripStopBirdButton;", "Lco/bird/android/model/TripBottomSheetButton;", "birdId", "", "location", "Lco/bird/android/model/wire/WireLocation;", Entry.TYPE_TEXT, "stopId", "(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getStopId", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TripStopBirdButton extends TripBottomSheetButton {
    private final String birdId;
    private final WireLocation location;
    private final String stopId;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripStopBirdButton(String birdId, WireLocation location, String text, String stopId) {
        super(null);
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(stopId, "stopId");
        this.birdId = birdId;
        this.location = location;
        this.text = text;
        this.stopId = stopId;
    }

    public static /* synthetic */ TripStopBirdButton copy$default(TripStopBirdButton tripStopBirdButton, String str, WireLocation wireLocation, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tripStopBirdButton.birdId;
        }
        if ((i & 2) != 0) {
            wireLocation = tripStopBirdButton.location;
        }
        if ((i & 4) != 0) {
            str2 = tripStopBirdButton.text;
        }
        if ((i & 8) != 0) {
            str3 = tripStopBirdButton.stopId;
        }
        return tripStopBirdButton.copy(str, wireLocation, str2, str3);
    }

    public final String component1() {
        return this.birdId;
    }

    public final WireLocation component2() {
        return this.location;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.stopId;
    }

    public final TripStopBirdButton copy(String birdId, WireLocation location, String text, String stopId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(stopId, "stopId");
        return new TripStopBirdButton(birdId, location, text, stopId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TripStopBirdButton) {
            TripStopBirdButton tripStopBirdButton = (TripStopBirdButton) obj;
            return Intrinsics.areEqual(this.birdId, tripStopBirdButton.birdId) && Intrinsics.areEqual(this.location, tripStopBirdButton.location) && Intrinsics.areEqual(this.text, tripStopBirdButton.text) && Intrinsics.areEqual(this.stopId, tripStopBirdButton.stopId);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
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
        return (((((this.birdId.hashCode() * 31) + this.location.hashCode()) * 31) + this.text.hashCode()) * 31) + this.stopId.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        WireLocation wireLocation = this.location;
        String str2 = this.text;
        String str3 = this.stopId;
        return "TripStopBirdButton(birdId=" + str + ", location=" + wireLocation + ", text=" + str2 + ", stopId=" + str3 + ")";
    }
}
