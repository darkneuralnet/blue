package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes6.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C17750a();

    /* renamed from: b */
    public final Month f72634b;

    /* renamed from: c */
    public final Month f72635c;

    /* renamed from: d */
    public final DateValidator f72636d;

    /* renamed from: e */
    public Month f72637e;

    /* renamed from: f */
    public final int f72638f;

    /* renamed from: g */
    public final int f72639g;

    /* renamed from: h */
    public final int f72640h;

    /* loaded from: classes6.dex */
    public interface DateValidator extends Parcelable {
        /* renamed from: l0 */
        boolean mo49743l0(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    /* loaded from: classes6.dex */
    public class C17750a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i, C17750a c17750a) {
        this(month, month2, dateValidator, month3, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (this.f72634b.equals(calendarConstraints.f72634b) && this.f72635c.equals(calendarConstraints.f72635c) && C37259Yd3.m74780a(this.f72637e, calendarConstraints.f72637e) && this.f72638f == calendarConstraints.f72638f && this.f72636d.equals(calendarConstraints.f72636d)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public Month m49768g(Month month) {
        if (month.compareTo(this.f72634b) < 0) {
            return this.f72634b;
        }
        if (month.compareTo(this.f72635c) > 0) {
            return this.f72635c;
        }
        return month;
    }

    /* renamed from: h */
    public DateValidator m49767h() {
        return this.f72636d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f72634b, this.f72635c, this.f72637e, Integer.valueOf(this.f72638f), this.f72636d});
    }

    /* renamed from: i */
    public Month m49766i() {
        return this.f72635c;
    }

    /* renamed from: j */
    public int m49765j() {
        return this.f72638f;
    }

    /* renamed from: k */
    public int m49764k() {
        return this.f72640h;
    }

    /* renamed from: l */
    public Month m49763l() {
        return this.f72637e;
    }

    /* renamed from: m */
    public Month m49762m() {
        return this.f72634b;
    }

    /* renamed from: n */
    public int m49761n() {
        return this.f72639g;
    }

    /* renamed from: o */
    public boolean m49760o(long j) {
        if (this.f72634b.m49723g(1) <= j) {
            Month month = this.f72635c;
            if (j <= month.m49723g(month.f72661f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public void m49759p(Month month) {
        this.f72637e = month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f72634b, 0);
        parcel.writeParcelable(this.f72635c, 0);
        parcel.writeParcelable(this.f72637e, 0);
        parcel.writeParcelable(this.f72636d, 0);
        parcel.writeInt(this.f72638f);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f72634b = month;
        this.f72635c = month2;
        this.f72637e = month3;
        this.f72638f = i;
        this.f72636d = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0 && i <= C43471ji6.m30049l().getMaximum(7)) {
            this.f72640h = month.m49718l(month2) + 1;
            this.f72639g = (month2.f72659d - month.f72659d) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    /* loaded from: classes6.dex */
    public static final class C17751b {

        /* renamed from: f */
        public static final long f72641f = C43471ji6.m30060a(Month.m49727b(1900, 0).f72662g);

        /* renamed from: g */
        public static final long f72642g = C43471ji6.m30060a(Month.m49727b(2100, 11).f72662g);

        /* renamed from: a */
        public long f72643a;

        /* renamed from: b */
        public long f72644b;

        /* renamed from: c */
        public Long f72645c;

        /* renamed from: d */
        public int f72646d;

        /* renamed from: e */
        public DateValidator f72647e;

        public C17751b() {
            this.f72643a = f72641f;
            this.f72644b = f72642g;
            this.f72647e = DateValidatorPointForward.m49744a(Long.MIN_VALUE);
        }

        /* renamed from: a */
        public CalendarConstraints m49756a() {
            Month m49726c;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f72647e);
            Month m49726c2 = Month.m49726c(this.f72643a);
            Month m49726c3 = Month.m49726c(this.f72644b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f72645c;
            if (l == null) {
                m49726c = null;
            } else {
                m49726c = Month.m49726c(l.longValue());
            }
            return new CalendarConstraints(m49726c2, m49726c3, dateValidator, m49726c, this.f72646d, null);
        }

        /* renamed from: b */
        public C17751b m49755b(long j) {
            this.f72645c = Long.valueOf(j);
            return this;
        }

        public C17751b(CalendarConstraints calendarConstraints) {
            this.f72643a = f72641f;
            this.f72644b = f72642g;
            this.f72647e = DateValidatorPointForward.m49744a(Long.MIN_VALUE);
            this.f72643a = calendarConstraints.f72634b.f72662g;
            this.f72644b = calendarConstraints.f72635c.f72662g;
            this.f72645c = Long.valueOf(calendarConstraints.f72637e.f72662g);
            this.f72646d = calendarConstraints.f72638f;
            this.f72647e = calendarConstraints.f72636d;
        }
    }
}
