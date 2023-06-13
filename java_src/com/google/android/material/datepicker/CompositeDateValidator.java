package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* renamed from: b */
    public final InterfaceC17755d f72650b;

    /* renamed from: c */
    public final List<CalendarConstraints.DateValidator> f72651c;

    /* renamed from: d */
    public static final InterfaceC17755d f72648d = new C17752a();

    /* renamed from: e */
    public static final InterfaceC17755d f72649e = new C17753b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C17754c();

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    /* loaded from: classes6.dex */
    public class C17752a implements InterfaceC17755d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC17755d
        /* renamed from: a */
        public boolean mo49750a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.mo49743l0(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC17755d
        public int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    /* loaded from: classes6.dex */
    public class C17753b implements InterfaceC17755d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC17755d
        /* renamed from: a */
        public boolean mo49750a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.mo49743l0(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC17755d
        public int getId() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    /* loaded from: classes6.dex */
    public class C17754c implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            InterfaceC17755d interfaceC17755d;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                interfaceC17755d = CompositeDateValidator.f72649e;
            } else if (readInt == 1) {
                interfaceC17755d = CompositeDateValidator.f72648d;
            } else {
                interfaceC17755d = CompositeDateValidator.f72649e;
            }
            return new CompositeDateValidator((List) HZ3.m103731g(readArrayList), interfaceC17755d, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC17755d {
        /* renamed from: a */
        boolean mo49750a(List<CalendarConstraints.DateValidator> list, long j);

        int getId();
    }

    public /* synthetic */ CompositeDateValidator(List list, InterfaceC17755d interfaceC17755d, C17752a c17752a) {
        this(list, interfaceC17755d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (this.f72651c.equals(compositeDateValidator.f72651c) && this.f72650b.getId() == compositeDateValidator.f72650b.getId()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f72651c.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* renamed from: l0 */
    public boolean mo49743l0(long j) {
        return this.f72650b.mo49750a(this.f72651c, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f72651c);
        parcel.writeInt(this.f72650b.getId());
    }

    public CompositeDateValidator(List<CalendarConstraints.DateValidator> list, InterfaceC17755d interfaceC17755d) {
        this.f72651c = list;
        this.f72650b = interfaceC17755d;
    }
}
