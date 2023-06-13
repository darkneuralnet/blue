package androidx.test.services.events;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class AnnotationValue implements Parcelable {
    public static final Parcelable.Creator<AnnotationValue> CREATOR = new Parcelable.Creator<AnnotationValue>() { // from class: androidx.test.services.events.AnnotationValue.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AnnotationValue createFromParcel(Parcel parcel) {
            return new AnnotationValue(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AnnotationValue[] newArray(int i) {
            return new AnnotationValue[i];
        }
    };

    /* renamed from: b */
    public final String f55725b;

    /* renamed from: c */
    public final List<String> f55726c;

    /* renamed from: d */
    public final String f55727d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55725b);
        parcel.writeStringList(this.f55726c);
        parcel.writeString(this.f55727d);
    }

    public AnnotationValue(Parcel parcel) {
        this.f55725b = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f55726c = arrayList;
        parcel.readStringList(arrayList);
        this.f55727d = parcel.readString();
    }
}
