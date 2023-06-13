package co.bird.android.model;

import co.bird.android.model.constant.FlightSheetAction;
import co.bird.android.model.persistence.Bird;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/CannotCaptureReports;", "Lco/bird/android/model/FlightSheetButton;", "Lco/bird/android/model/FlightSheetActionButton;", "bird", "Lco/bird/android/model/persistence/Bird;", "(Lco/bird/android/model/persistence/Bird;)V", "action", "Lco/bird/android/model/constant/FlightSheetAction;", "getAction", "()Lco/bird/android/model/constant/FlightSheetAction;", "getBird", "()Lco/bird/android/model/persistence/Bird;", Entry.TYPE_TEXT, "", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CannotCaptureReports extends FlightSheetButton implements FlightSheetActionButton {
    private final FlightSheetAction action;
    private final Bird bird;
    private final String text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CannotCaptureReports(Bird bird) {
        super(null);
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.bird = bird;
        this.text = "";
        this.action = FlightSheetAction.CANNOT_CAPTURE_REPORTS;
    }

    public static /* synthetic */ CannotCaptureReports copy$default(CannotCaptureReports cannotCaptureReports, Bird bird, int i, Object obj) {
        if ((i & 1) != 0) {
            bird = cannotCaptureReports.bird;
        }
        return cannotCaptureReports.copy(bird);
    }

    public final Bird component1() {
        return this.bird;
    }

    public final CannotCaptureReports copy(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new CannotCaptureReports(bird);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CannotCaptureReports) && Intrinsics.areEqual(this.bird, ((CannotCaptureReports) obj).bird);
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
        return this.bird.hashCode();
    }

    public String toString() {
        Bird bird = this.bird;
        return "CannotCaptureReports(bird=" + bird + ")";
    }
}
