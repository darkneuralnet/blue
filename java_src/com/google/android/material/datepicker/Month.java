package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C17759a();

    /* renamed from: b */
    public final Calendar f72657b;

    /* renamed from: c */
    public final int f72658c;

    /* renamed from: d */
    public final int f72659d;

    /* renamed from: e */
    public final int f72660e;

    /* renamed from: f */
    public final int f72661f;

    /* renamed from: g */
    public final long f72662g;

    /* renamed from: h */
    public String f72663h;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    /* loaded from: classes6.dex */
    public class C17759a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.m49727b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m30056e = C43471ji6.m30056e(calendar);
        this.f72657b = m30056e;
        this.f72658c = m30056e.get(2);
        this.f72659d = m30056e.get(1);
        this.f72660e = m30056e.getMaximum(7);
        this.f72661f = m30056e.getActualMaximum(5);
        this.f72662g = m30056e.getTimeInMillis();
    }

    /* renamed from: b */
    public static Month m49727b(int i, int i2) {
        Calendar m30049l = C43471ji6.m30049l();
        m30049l.set(1, i);
        m30049l.set(2, i2);
        return new Month(m30049l);
    }

    /* renamed from: c */
    public static Month m49726c(long j) {
        Calendar m30049l = C43471ji6.m30049l();
        m30049l.setTimeInMillis(j);
        return new Month(m30049l);
    }

    /* renamed from: d */
    public static Month m49725d() {
        return new Month(C43471ji6.m30051j());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(Month month) {
        return this.f72657b.compareTo(month.f72657b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m49724e(int i) {
        int i2 = this.f72657b.get(7);
        if (i <= 0) {
            i = this.f72657b.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + this.f72660e;
        }
        return i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f72658c == month.f72658c && this.f72659d == month.f72659d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public long m49723g(int i) {
        Calendar m30056e = C43471ji6.m30056e(this.f72657b);
        m30056e.set(5, i);
        return m30056e.getTimeInMillis();
    }

    /* renamed from: h */
    public int m49722h(long j) {
        Calendar m30056e = C43471ji6.m30056e(this.f72657b);
        m30056e.setTimeInMillis(j);
        return m30056e.get(5);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f72658c), Integer.valueOf(this.f72659d)});
    }

    /* renamed from: i */
    public String m49721i() {
        if (this.f72663h == null) {
            this.f72663h = C43915kT0.m28940l(this.f72657b.getTimeInMillis());
        }
        return this.f72663h;
    }

    /* renamed from: j */
    public long m49720j() {
        return this.f72657b.getTimeInMillis();
    }

    /* renamed from: k */
    public Month m49719k(int i) {
        Calendar m30056e = C43471ji6.m30056e(this.f72657b);
        m30056e.add(2, i);
        return new Month(m30056e);
    }

    /* renamed from: l */
    public int m49718l(Month month) {
        if (this.f72657b instanceof GregorianCalendar) {
            return ((month.f72659d - this.f72659d) * 12) + (month.f72658c - this.f72658c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f72659d);
        parcel.writeInt(this.f72658c);
    }
}
