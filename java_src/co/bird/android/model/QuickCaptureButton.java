package co.bird.android.model;

import co.bird.android.model.constant.QuickCaptureState;
import co.bird.android.model.persistence.Bird;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/QuickCaptureButton;", "Lco/bird/android/model/FlightSheetButton;", Entry.TYPE_TEXT, "", "bird", "Lco/bird/android/model/persistence/Bird;", TransferTable.COLUMN_STATE, "Lco/bird/android/model/constant/QuickCaptureState;", "timeout", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/constant/QuickCaptureState;Lorg/joda/time/DateTime;)V", "getBird", "()Lco/bird/android/model/persistence/Bird;", "getState", "()Lco/bird/android/model/constant/QuickCaptureState;", "getText", "()Ljava/lang/String;", "getTimeout", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class QuickCaptureButton extends FlightSheetButton {
    private final Bird bird;
    private final QuickCaptureState state;
    private final String text;
    private final DateTime timeout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickCaptureButton(String text, Bird bird, QuickCaptureState state, DateTime timeout) {
        super(null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.text = text;
        this.bird = bird;
        this.state = state;
        this.timeout = timeout;
    }

    public static /* synthetic */ QuickCaptureButton copy$default(QuickCaptureButton quickCaptureButton, String str, Bird bird, QuickCaptureState quickCaptureState, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quickCaptureButton.text;
        }
        if ((i & 2) != 0) {
            bird = quickCaptureButton.bird;
        }
        if ((i & 4) != 0) {
            quickCaptureState = quickCaptureButton.state;
        }
        if ((i & 8) != 0) {
            dateTime = quickCaptureButton.timeout;
        }
        return quickCaptureButton.copy(str, bird, quickCaptureState, dateTime);
    }

    public final String component1() {
        return this.text;
    }

    public final Bird component2() {
        return this.bird;
    }

    public final QuickCaptureState component3() {
        return this.state;
    }

    public final DateTime component4() {
        return this.timeout;
    }

    public final QuickCaptureButton copy(String text, Bird bird, QuickCaptureState state, DateTime timeout) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        return new QuickCaptureButton(text, bird, state, timeout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickCaptureButton) {
            QuickCaptureButton quickCaptureButton = (QuickCaptureButton) obj;
            return Intrinsics.areEqual(this.text, quickCaptureButton.text) && Intrinsics.areEqual(this.bird, quickCaptureButton.bird) && this.state == quickCaptureButton.state && Intrinsics.areEqual(this.timeout, quickCaptureButton.timeout);
        }
        return false;
    }

    public final Bird getBird() {
        return this.bird;
    }

    public final QuickCaptureState getState() {
        return this.state;
    }

    @Override // co.bird.android.model.FlightSheetButton
    public String getText() {
        return this.text;
    }

    public final DateTime getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.bird.hashCode()) * 31) + this.state.hashCode()) * 31) + this.timeout.hashCode();
    }

    public String toString() {
        String str = this.text;
        Bird bird = this.bird;
        QuickCaptureState quickCaptureState = this.state;
        DateTime dateTime = this.timeout;
        return "QuickCaptureButton(text=" + str + ", bird=" + bird + ", state=" + quickCaptureState + ", timeout=" + dateTime + ")";
    }
}
