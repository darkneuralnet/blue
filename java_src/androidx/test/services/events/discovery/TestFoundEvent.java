package androidx.test.services.events.discovery;

import android.os.Parcel;
import androidx.test.services.events.TestCaseInfo;
import androidx.test.services.events.discovery.TestDiscoveryEvent;
/* loaded from: classes.dex */
public class TestFoundEvent extends TestDiscoveryEvent {

    /* renamed from: b */
    public final TestCaseInfo f55759b;

    public TestFoundEvent(Parcel parcel) {
        this.f55759b = new TestCaseInfo(parcel);
    }

    @Override // androidx.test.services.events.discovery.TestDiscoveryEvent
    /* renamed from: a */
    public TestDiscoveryEvent.EventType mo65980a() {
        return TestDiscoveryEvent.EventType.TEST_FOUND;
    }

    @Override // androidx.test.services.events.discovery.TestDiscoveryEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        this.f55759b.writeToParcel(parcel, i);
    }
}
