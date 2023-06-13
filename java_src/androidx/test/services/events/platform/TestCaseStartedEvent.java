package androidx.test.services.events.platform;

import android.os.Parcel;
import androidx.test.services.events.TestCaseInfo;
import androidx.test.services.events.TimeStamp;
import androidx.test.services.events.platform.TestPlatformEvent;
/* loaded from: classes.dex */
public final class TestCaseStartedEvent extends TestPlatformEvent {

    /* renamed from: b */
    public final TestCaseInfo f55766b;

    /* renamed from: c */
    public final TimeStamp f55767c;

    public TestCaseStartedEvent(Parcel parcel) {
        this.f55766b = new TestCaseInfo(parcel);
        this.f55767c = new TimeStamp(parcel);
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent
    /* renamed from: a */
    public TestPlatformEvent.EventType mo65976a() {
        return TestPlatformEvent.EventType.TEST_CASE_STARTED;
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        this.f55766b.writeToParcel(parcel, i);
        this.f55767c.writeToParcel(parcel, i);
    }
}
