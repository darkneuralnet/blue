package co.bird.android.model;

import co.bird.android.model.constant.FlightSheetAction;
import co.bird.android.model.persistence.Bird;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/LastRideInfoButton;", "Lco/bird/android/model/FlightSheetButton;", "Lco/bird/android/model/FlightSheetActionButton;", "action", "Lco/bird/android/model/constant/FlightSheetAction;", Entry.TYPE_TEXT, "", "bird", "Lco/bird/android/model/persistence/Bird;", "(Lco/bird/android/model/constant/FlightSheetAction;Ljava/lang/String;Lco/bird/android/model/persistence/Bird;)V", "getAction", "()Lco/bird/android/model/constant/FlightSheetAction;", "getBird", "()Lco/bird/android/model/persistence/Bird;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LastRideInfoButton extends FlightSheetButton implements FlightSheetActionButton {
    private final FlightSheetAction action;
    private final Bird bird;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastRideInfoButton(FlightSheetAction action, String text, Bird bird) {
        super(null);
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.action = action;
        this.text = text;
        this.bird = bird;
    }

    public static /* synthetic */ LastRideInfoButton copy$default(LastRideInfoButton lastRideInfoButton, FlightSheetAction flightSheetAction, String str, Bird bird, int i, Object obj) {
        if ((i & 1) != 0) {
            flightSheetAction = lastRideInfoButton.action;
        }
        if ((i & 2) != 0) {
            str = lastRideInfoButton.text;
        }
        if ((i & 4) != 0) {
            bird = lastRideInfoButton.bird;
        }
        return lastRideInfoButton.copy(flightSheetAction, str, bird);
    }

    public final FlightSheetAction component1() {
        return this.action;
    }

    public final String component2() {
        return this.text;
    }

    public final Bird component3() {
        return this.bird;
    }

    public final LastRideInfoButton copy(FlightSheetAction action, String text, Bird bird) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new LastRideInfoButton(action, text, bird);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LastRideInfoButton) {
            LastRideInfoButton lastRideInfoButton = (LastRideInfoButton) obj;
            return this.action == lastRideInfoButton.action && Intrinsics.areEqual(this.text, lastRideInfoButton.text) && Intrinsics.areEqual(this.bird, lastRideInfoButton.bird);
        }
        return false;
    }

    @Override // co.bird.android.model.FlightSheetActionButton
    public FlightSheetAction getAction() {
        return this.action;
    }

    @Override // co.bird.android.model.FlightSheetActionButton
    public Bird getBird() {
        return this.bird;
    }

    @Override // co.bird.android.model.FlightSheetButton
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.action.hashCode() * 31) + this.text.hashCode()) * 31) + this.bird.hashCode();
    }

    public String toString() {
        FlightSheetAction flightSheetAction = this.action;
        String str = this.text;
        Bird bird = this.bird;
        return "LastRideInfoButton(action=" + flightSheetAction + ", text=" + str + ", bird=" + bird + ")";
    }
}
