package androidx.test.services.events.platform;

import android.os.Parcel;
import androidx.test.services.events.TestRunInfo;
import androidx.test.services.events.TimeStamp;
import androidx.test.services.events.platform.TestPlatformEvent;
/* loaded from: classes.dex */
public class TestRunStartedEvent extends TestPlatformEvent {

    /* renamed from: b */
    public final TestRunInfo f55782b;

    /* renamed from: c */
    public final TimeStamp f55783c;

    public TestRunStartedEvent(Parcel parcel) {
        this.f55782b = new TestRunInfo(parcel);
        this.f55783c = new TimeStamp(parcel);
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent
    /* renamed from: a */
    public TestPlatformEvent.EventType mo65976a() {
        return TestPlatformEvent.EventType.TEST_RUN_STARTED;
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        this.f55782b.writeToParcel(parcel, i);
        this.f55783c.writeToParcel(parcel, i);
    }
}
