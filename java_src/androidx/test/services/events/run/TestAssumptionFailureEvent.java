package androidx.test.services.events.run;

import android.os.Parcel;
import androidx.test.services.events.run.TestRunEvent;
/* loaded from: classes.dex */
public class TestAssumptionFailureEvent extends TestFailureEvent {
    public TestAssumptionFailureEvent(Parcel parcel) {
        super(parcel);
    }

    @Override // androidx.test.services.events.run.TestFailureEvent, androidx.test.services.events.run.TestRunEvent
    /* renamed from: a */
    public TestRunEvent.EventType mo65972a() {
        return TestRunEvent.EventType.TEST_ASSUMPTION_FAILURE;
    }
}
