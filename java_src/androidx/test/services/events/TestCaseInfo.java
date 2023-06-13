package androidx.test.services.events;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.internal.util.Checks;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class TestCaseInfo implements Parcelable {
    public static final Parcelable.Creator<TestCaseInfo> CREATOR = new Parcelable.Creator<TestCaseInfo>() { // from class: androidx.test.services.events.TestCaseInfo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TestCaseInfo createFromParcel(Parcel parcel) {
            return new TestCaseInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TestCaseInfo[] newArray(int i) {
            return new TestCaseInfo[i];
        }
    };

    /* renamed from: b */
    public final String f55735b;

    /* renamed from: c */
    public final String f55736c;

    /* renamed from: d */
    public final List<AnnotationInfo> f55737d;

    /* renamed from: e */
    public final List<AnnotationInfo> f55738e;

    public TestCaseInfo(Parcel parcel) {
        Checks.m66010b(parcel, "source cannot be null");
        this.f55735b = (String) Checks.m66010b(parcel.readString(), "className cannot be null");
        this.f55736c = (String) Checks.m66010b(parcel.readString(), "methodName cannot be null");
        ArrayList arrayList = new ArrayList();
        this.f55737d = arrayList;
        Parcelable.Creator<AnnotationInfo> creator = AnnotationInfo.CREATOR;
        parcel.readTypedList(arrayList, creator);
        ArrayList arrayList2 = new ArrayList();
        this.f55738e = arrayList2;
        parcel.readTypedList(arrayList2, creator);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55735b);
        parcel.writeString(this.f55736c);
        parcel.writeTypedList(this.f55737d);
        parcel.writeTypedList(this.f55738e);
    }
}
