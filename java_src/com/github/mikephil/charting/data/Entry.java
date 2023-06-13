package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public class Entry extends AbstractC0045AA implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new C17435a();

    /* renamed from: e */
    public float f70117e;

    /* renamed from: com.github.mikephil.charting.data.Entry$a */
    /* loaded from: classes5.dex */
    public static class C17435a implements Parcelable.Creator<Entry> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Entry[] newArray(int i) {
            return new Entry[i];
        }
    }

    public Entry() {
        this.f70117e = 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public float mo51930g() {
        return this.f70117e;
    }

    public String toString() {
        return "Entry, x: " + this.f70117e + " y: " + mo51938c();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f70117e);
        parcel.writeFloat(mo51938c());
        if (m116048a() != null) {
            if (m116048a() instanceof Parcelable) {
                parcel.writeInt(1);
                parcel.writeParcelable((Parcelable) m116048a(), i);
                return;
            }
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
        parcel.writeInt(0);
    }

    public Entry(float f, float f2) {
        super(f2);
        this.f70117e = f;
    }

    public Entry(float f, float f2, Drawable drawable) {
        super(f2, drawable);
        this.f70117e = f;
    }

    public Entry(Parcel parcel) {
        this.f70117e = 0.0f;
        this.f70117e = parcel.readFloat();
        m116045e(parcel.readFloat());
        if (parcel.readInt() == 1) {
            m116046d(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }
}
