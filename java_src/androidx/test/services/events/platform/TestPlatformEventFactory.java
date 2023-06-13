package androidx.test.services.events.platform;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.services.events.platform.TestPlatformEvent;
/* loaded from: classes.dex */
public final class TestPlatformEventFactory implements Parcelable.Creator<TestPlatformEvent> {

    /* renamed from: androidx.test.services.events.platform.TestPlatformEventFactory$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C120041 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55775a;

        static {
            int[] iArr = new int[TestPlatformEvent.EventType.values().length];
            f55775a = iArr;
            try {
                iArr[TestPlatformEvent.EventType.TEST_RUN_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55775a[TestPlatformEvent.EventType.TEST_RUN_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55775a[TestPlatformEvent.EventType.TEST_CASE_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55775a[TestPlatformEvent.EventType.TEST_CASE_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55775a[TestPlatformEvent.EventType.TEST_CASE_FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55775a[TestPlatformEvent.EventType.TEST_RUN_FINISHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TestPlatformEvent createFromParcel(Parcel parcel) {
        TestPlatformEvent.EventType valueOf = TestPlatformEvent.EventType.valueOf(parcel.readString());
        switch (C120041.f55775a[valueOf.ordinal()]) {
            case 1:
                return new TestRunStartedEvent(parcel);
            case 2:
                return new TestRunErrorEvent(parcel);
            case 3:
                return new TestCaseStartedEvent(parcel);
            case 4:
                return new TestCaseErrorEvent(parcel);
            case 5:
                return new TestCaseFinishedEvent(parcel);
            case 6:
                return new TestRunFinishedEvent(parcel);
            default:
                String valueOf2 = String.valueOf(valueOf);
                throw new IllegalArgumentException("Unhandled event type: " + valueOf2);
        }
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public TestPlatformEvent[] newArray(int i) {
        return new TestPlatformEvent[i];
    }
}
