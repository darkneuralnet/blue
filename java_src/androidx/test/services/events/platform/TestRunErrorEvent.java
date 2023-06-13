package androidx.test.services.events.platform;

import android.os.Parcel;
import androidx.test.services.events.ErrorInfo;
import androidx.test.services.events.TestRunInfo;
import androidx.test.services.events.TimeStamp;
import androidx.test.services.events.platform.TestPlatformEvent;
/* loaded from: classes.dex */
public class TestRunErrorEvent extends TestPlatformEvent {

    /* renamed from: b */
    public final TestRunInfo f55776b;

    /* renamed from: c */
    public final ErrorInfo f55777c;

    /* renamed from: d */
    public final TimeStamp f55778d;

    public TestRunErrorEvent(Parcel parcel) {
        this.f55776b = new TestRunInfo(parcel);
        this.f55777c = new ErrorInfo(parcel);
        this.f55778d = new TimeStamp(parcel);
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent
    /* renamed from: a */
    public TestPlatformEvent.EventType mo65976a() {
        return TestPlatformEvent.EventType.TEST_RUN_ERROR;
    }

    @Override // androidx.test.services.events.platform.TestPlatformEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        this.f55776b.writeToParcel(parcel, i);
        this.f55777c.writeToParcel(parcel, i);
        this.f55778d.writeToParcel(parcel, i);
    }
}
