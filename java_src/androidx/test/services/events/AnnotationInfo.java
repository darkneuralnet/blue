package androidx.test.services.events;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class AnnotationInfo implements Parcelable {
    public static final Parcelable.Creator<AnnotationInfo> CREATOR = new Parcelable.Creator<AnnotationInfo>() { // from class: androidx.test.services.events.AnnotationInfo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AnnotationInfo createFromParcel(Parcel parcel) {
            return new AnnotationInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AnnotationInfo[] newArray(int i) {
            return new AnnotationInfo[i];
        }
    };

    /* renamed from: b */
    public final String f55723b;

    /* renamed from: c */
    public final List<AnnotationValue> f55724c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55723b);
        parcel.writeTypedList(this.f55724c);
    }

    public AnnotationInfo(Parcel parcel) {
        this.f55723b = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f55724c = arrayList;
        parcel.readTypedList(arrayList, AnnotationValue.CREATOR);
    }
}
