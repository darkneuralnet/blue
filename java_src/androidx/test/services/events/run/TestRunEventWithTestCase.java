package androidx.test.services.events.run;

import android.os.Parcel;
import androidx.test.services.events.TestCaseInfo;
/* loaded from: classes.dex */
public abstract class TestRunEventWithTestCase extends TestRunEvent {

    /* renamed from: b */
    public final TestCaseInfo f55794b;

    public TestRunEventWithTestCase(Parcel parcel) {
        this.f55794b = new TestCaseInfo(parcel);
    }

    @Override // androidx.test.services.events.run.TestRunEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        this.f55794b.writeToParcel(parcel, i);
    }
}
