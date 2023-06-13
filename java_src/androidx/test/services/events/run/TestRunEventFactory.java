package androidx.test.services.events.run;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.services.events.run.TestRunEvent;
/* loaded from: classes.dex */
final class TestRunEventFactory implements Parcelable.Creator<TestRunEvent> {

    /* renamed from: androidx.test.services.events.run.TestRunEventFactory$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C120051 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55793a;

        static {
            int[] iArr = new int[TestRunEvent.EventType.values().length];
            f55793a = iArr;
            try {
                iArr[TestRunEvent.EventType.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55793a[TestRunEvent.EventType.TEST_STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55793a[TestRunEvent.EventType.TEST_FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55793a[TestRunEvent.EventType.TEST_ASSUMPTION_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55793a[TestRunEvent.EventType.TEST_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55793a[TestRunEvent.EventType.TEST_IGNORED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55793a[TestRunEvent.EventType.FINISHED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TestRunEvent createFromParcel(Parcel parcel) {
        TestRunEvent.EventType valueOf = TestRunEvent.EventType.valueOf(parcel.readString());
        switch (C120051.f55793a[valueOf.ordinal()]) {
            case 1:
                return new TestRunStartedEvent(parcel);
            case 2:
                return new TestStartedEvent(parcel);
            case 3:
                return new TestFinishedEvent(parcel);
            case 4:
                return new TestAssumptionFailureEvent(parcel);
            case 5:
                return new TestFailureEvent(parcel);
            case 6:
                return new TestIgnoredEvent(parcel);
            case 7:
                return new TestRunFinishedEvent(parcel);
            default:
                String valueOf2 = String.valueOf(valueOf);
                throw new IllegalArgumentException("Unhandled event type: " + valueOf2);
        }
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public TestRunEvent[] newArray(int i) {
        return new TestRunEvent[i];
    }
}
