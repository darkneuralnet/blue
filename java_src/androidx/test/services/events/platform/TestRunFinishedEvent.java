package androidx.test.services.events.platform;

import android.os.Parcel;
import androidx.test.services.events.TestRunInfo;
import androidx.test.services.events.TestStatus;
import androidx.test.services.events.TimeStamp;
import androidx.test.services.events.platform.TestPlatformEvent;
/* loaded from: classes.dex */
public class TestRunFinishedEvent extends TestPlatformEvent {

    /* renamed from: b */
    public final TestRunInfo f55779b;

    /* renamed from: c */
    public final TestStatus f55780c;

    /* renamed from: d */
    public final TimeStamp f55781d;

    public TestRunFinishedEvent(Parcel parcel) {
        this.f55779b = new TestRunInfo(parcel);
        this.f55780c = new TestStatus(parcel);
        this.f55781d = new TimeStamp(parcel);
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent
    /* renamed from: a */
    public TestPlatformEvent.EventType mo65976a() {
        return TestPlatformEvent.EventType.TEST_RUN_FINISHED;
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        this.f55779b.writeToParcel(parcel, i);
        this.f55780c.writeToParcel(parcel, i);
        this.f55781d.writeToParcel(parcel, i);
    }
}
