package com.tsongkha.spinnerdatepicker;

import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes7.dex */
public class DatePicker extends FrameLayout {

    /* renamed from: b */
    public NumberPicker f75483b;

    /* renamed from: c */
    public NumberPicker f75484c;

    /* renamed from: d */
    public NumberPicker f75485d;

    /* renamed from: e */
    public EditText f75486e;

    /* renamed from: f */
    public String[] f75487f;

    /* renamed from: g */
    public int f75488g;

    /* renamed from: h */
    public Calendar f75489h;

    /* renamed from: i */
    public Calendar f75490i;

    /* renamed from: j */
    public Calendar f75491j;

    /* renamed from: k */
    public Calendar f75492k;

    /* renamed from: l */
    public boolean f75493l;

    /* renamed from: m */
    public boolean f75494m;

    /* loaded from: classes7.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C19523a();

        /* renamed from: b */
        public final long f75495b;

        /* renamed from: c */
        public final long f75496c;

        /* renamed from: d */
        public final long f75497d;

        /* renamed from: e */
        public final boolean f75498e;

        /* renamed from: com.tsongkha.spinnerdatepicker.DatePicker$SavedState$a */
        /* loaded from: classes7.dex */
        public static class C19523a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, C42729iT0 c42729iT0) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f75495b);
            parcel.writeLong(this.f75496c);
            parcel.writeLong(this.f75497d);
            parcel.writeByte(this.f75498e ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable, Calendar calendar, Calendar calendar2, Calendar calendar3, boolean z) {
            super(parcelable);
            this.f75495b = calendar.getTimeInMillis();
            this.f75496c = calendar2.getTimeInMillis();
            this.f75497d = calendar3.getTimeInMillis();
            this.f75498e = z;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f75495b = parcel.readLong();
            this.f75496c = parcel.readLong();
            this.f75497d = parcel.readLong();
            this.f75498e = parcel.readByte() != 0;
        }
    }

    /* renamed from: a */
    public final Calendar m45248a(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    /* renamed from: b */
    public void m45247b(Locale locale) {
        this.f75489h = m45248a(this.f75489h, locale);
        this.f75490i = m45248a(this.f75490i, locale);
        this.f75491j = m45248a(this.f75491j, locale);
        this.f75492k = m45248a(this.f75492k, locale);
        this.f75488g = this.f75489h.getActualMaximum(2) + 1;
        this.f75487f = new DateFormatSymbols().getShortMonths();
        if (m45245d()) {
            this.f75487f = new String[this.f75488g];
            int i = 0;
            while (i < this.f75488g) {
                int i2 = i + 1;
                this.f75487f[i] = String.format("%d", Integer.valueOf(i2));
                i = i2;
            }
        }
    }

    /* renamed from: c */
    public final void m45246c() {
        int i;
        NumberPicker numberPicker = this.f75483b;
        if (this.f75494m) {
            i = 0;
        } else {
            i = 8;
        }
        numberPicker.setVisibility(i);
        if (this.f75492k.equals(this.f75490i)) {
            this.f75483b.setMinValue(this.f75492k.get(5));
            this.f75483b.setMaxValue(this.f75492k.getActualMaximum(5));
            this.f75483b.setWrapSelectorWheel(false);
            this.f75484c.setDisplayedValues(null);
            this.f75484c.setMinValue(this.f75492k.get(2));
            this.f75484c.setMaxValue(this.f75492k.getActualMaximum(2));
            this.f75484c.setWrapSelectorWheel(false);
        } else if (this.f75492k.equals(this.f75491j)) {
            this.f75483b.setMinValue(this.f75492k.getActualMinimum(5));
            this.f75483b.setMaxValue(this.f75492k.get(5));
            this.f75483b.setWrapSelectorWheel(false);
            this.f75484c.setDisplayedValues(null);
            this.f75484c.setMinValue(this.f75492k.getActualMinimum(2));
            this.f75484c.setMaxValue(this.f75492k.get(2));
            this.f75484c.setWrapSelectorWheel(false);
        } else {
            this.f75483b.setMinValue(1);
            this.f75483b.setMaxValue(this.f75492k.getActualMaximum(5));
            this.f75483b.setWrapSelectorWheel(true);
            this.f75484c.setDisplayedValues(null);
            this.f75484c.setMinValue(0);
            this.f75484c.setMaxValue(11);
            this.f75484c.setWrapSelectorWheel(true);
        }
        this.f75484c.setDisplayedValues((String[]) Arrays.copyOfRange(this.f75487f, this.f75484c.getMinValue(), this.f75484c.getMaxValue() + 1));
        this.f75485d.setMinValue(this.f75490i.get(1));
        this.f75485d.setMaxValue(this.f75491j.get(1));
        this.f75485d.setWrapSelectorWheel(false);
        this.f75485d.setValue(this.f75492k.get(1));
        this.f75484c.setValue(this.f75492k.get(2));
        this.f75483b.setValue(this.f75492k.get(5));
        if (m45245d()) {
            this.f75486e.setRawInputType(2);
        }
    }

    /* renamed from: d */
    public final boolean m45245d() {
        return Character.isDigit(this.f75487f[0].charAt(0));
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f75493l;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        m45247b(configuration.locale);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        Calendar calendar = Calendar.getInstance();
        this.f75492k = calendar;
        calendar.setTimeInMillis(savedState.f75495b);
        Calendar calendar2 = Calendar.getInstance();
        this.f75490i = calendar2;
        calendar2.setTimeInMillis(savedState.f75496c);
        Calendar calendar3 = Calendar.getInstance();
        this.f75491j = calendar3;
        calendar3.setTimeInMillis(savedState.f75497d);
        m45246c();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f75492k, this.f75490i, this.f75491j, this.f75494m);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.f75483b.setEnabled(z);
        this.f75484c.setEnabled(z);
        this.f75485d.setEnabled(z);
        this.f75493l = z;
    }
}
