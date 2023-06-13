package androidx.test.services.events.platform;

import android.os.Parcel;
import androidx.test.services.events.TestCaseInfo;
import androidx.test.services.events.TestStatus;
import androidx.test.services.events.TimeStamp;
import androidx.test.services.events.platform.TestPlatformEvent;
/* loaded from: classes.dex */
public class TestCaseFinishedEvent extends TestPlatformEvent {

    /* renamed from: b */
    public final TestCaseInfo f55763b;

    /* renamed from: c */
    public final TestStatus f55764c;

    /* renamed from: d */
    public final TimeStamp f55765d;

    public TestCaseFinishedEvent(Parcel parcel) {
        this.f55763b = new TestCaseInfo(parcel);
        this.f55764c = new TestStatus(parcel);
        this.f55765d = new TimeStamp(parcel);
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent
    /* renamed from: a */
    public TestPlatformEvent.EventType mo65976a() {
        return TestPlatformEvent.EventType.TEST_CASE_FINISHED;
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        this.f55763b.writeToParcel(parcel, i);
        this.f55764c.writeToParcel(parcel, i);
        this.f55765d.writeToParcel(parcel, i);
    }
}
