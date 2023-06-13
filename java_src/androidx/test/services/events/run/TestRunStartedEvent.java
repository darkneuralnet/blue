package androidx.test.services.events.run;

import android.os.Parcel;
import androidx.test.services.events.run.TestRunEvent;
/* loaded from: classes.dex */
public class TestRunStartedEvent extends TestRunEventWithTestCase {
    public TestRunStartedEvent(Parcel parcel) {
        super(parcel);
    }

    @Override // androidx.test.services.events.run.TestRunEvent
    /* renamed from: a */
    public TestRunEvent.EventType mo65972a() {
        return TestRunEvent.EventType.STARTED;
    }
}
