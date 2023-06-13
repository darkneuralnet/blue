package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C17942a();

    /* renamed from: b */
    public final C38518bO2 f73647b;

    /* renamed from: c */
    public final C38518bO2 f73648c;

    /* renamed from: d */
    public final int f73649d;

    /* renamed from: e */
    public int f73650e;

    /* renamed from: f */
    public int f73651f;

    /* renamed from: g */
    public int f73652g;

    /* renamed from: h */
    public int f73653h;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    /* loaded from: classes6.dex */
    public class C17942a implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    /* renamed from: a */
    public static String m48511a(Resources resources, CharSequence charSequence) {
        return m48510b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m48510b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static int m48509c(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f73650e == timeModel.f73650e && this.f73651f == timeModel.f73651f && this.f73649d == timeModel.f73649d && this.f73652g == timeModel.f73652g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f73649d), Integer.valueOf(this.f73650e), Integer.valueOf(this.f73651f), Integer.valueOf(this.f73652g)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f73650e);
        parcel.writeInt(this.f73651f);
        parcel.writeInt(this.f73652g);
        parcel.writeInt(this.f73649d);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f73650e = i;
        this.f73651f = i2;
        this.f73652g = i3;
        this.f73649d = i4;
        this.f73653h = m48509c(i);
        this.f73647b = new C38518bO2(59);
        this.f73648c = new C38518bO2(i4 == 1 ? 24 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
