package androidx.test.services.events.platform;

import android.os.Parcel;
import androidx.test.services.events.ErrorInfo;
import androidx.test.services.events.TestCaseInfo;
import androidx.test.services.events.TimeStamp;
import androidx.test.services.events.platform.TestPlatformEvent;
/* loaded from: classes.dex */
public class TestCaseErrorEvent extends TestPlatformEvent {

    /* renamed from: b */
    public final TestCaseInfo f55760b;

    /* renamed from: c */
    public final ErrorInfo f55761c;

    /* renamed from: d */
    public final TimeStamp f55762d;

    public TestCaseErrorEvent(Parcel parcel) {
        this.f55760b = new TestCaseInfo(parcel);
        this.f55761c = new ErrorInfo(parcel);
        this.f55762d = new TimeStamp(parcel);
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent
    /* renamed from: a */
    public TestPlatformEvent.EventType mo65976a() {
        return TestPlatformEvent.EventType.TEST_CASE_ERROR;
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        this.f55760b.writeToParcel(parcel, i);
        this.f55761c.writeToParcel(parcel, i);
        this.f55762d.writeToParcel(parcel, i);
    }
}
