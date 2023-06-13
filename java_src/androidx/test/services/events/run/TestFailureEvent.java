package androidx.test.services.events.run;

import android.os.Parcel;
import androidx.test.services.events.FailureInfo;
import androidx.test.services.events.run.TestRunEvent;
/* loaded from: classes.dex */
public class TestFailureEvent extends TestRunEventWithTestCase {

    /* renamed from: c */
    public final FailureInfo f55784c;

    public TestFailureEvent(Parcel parcel) {
        super(parcel);
        this.f55784c = new FailureInfo(parcel);
    }

    @Override // androidx.test.services.events.run.TestRunEvent
    /* renamed from: a */
    public TestRunEvent.EventType mo65972a() {
        return TestRunEvent.EventType.TEST_FAILURE;
    }

    @Override // androidx.test.services.events.run.TestRunEventWithTestCase, androidx.test.services.events.run.TestRunEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, 0);
        this.f55784c.writeToParcel(parcel, 0);
    }
}
