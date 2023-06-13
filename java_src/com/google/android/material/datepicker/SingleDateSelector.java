package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
/* loaded from: classes6.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C17764b();

    /* renamed from: b */
    public CharSequence f72680b;

    /* renamed from: c */
    public Long f72681c;

    /* renamed from: d */
    public SimpleDateFormat f72682d;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    /* loaded from: classes6.dex */
    public class C17763a extends AbstractC17765a {

        /* renamed from: h */
        public final /* synthetic */ AbstractC43458jh3 f72683h;

        /* renamed from: i */
        public final /* synthetic */ TextInputLayout f72684i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17763a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, AbstractC43458jh3 abstractC43458jh3, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f72683h = abstractC43458jh3;
            this.f72684i = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.AbstractC17765a
        /* renamed from: f */
        public void mo49677f() {
            SingleDateSelector.this.f72680b = this.f72684i.getError();
            this.f72683h.mo30094a();
        }

        @Override // com.google.android.material.datepicker.AbstractC17765a
        /* renamed from: g */
        public void mo49676g(Long l) {
            if (l == null) {
                SingleDateSelector.this.m49693d();
            } else {
                SingleDateSelector.this.mo49685z1(l.longValue());
            }
            SingleDateSelector.this.f72680b = null;
            this.f72683h.mo30093b(SingleDateSelector.this.mo49686t1());
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$b */
    /* loaded from: classes6.dex */
    public class C17764b implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f72681c = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: E2 */
    public String mo49701E2(Context context) {
        Resources resources = context.getResources();
        Long l = this.f72681c;
        if (l == null) {
            return resources.getString(C40534el4.mtrl_picker_date_header_unselected);
        }
        return resources.getString(C40534el4.mtrl_picker_date_header_selected, C43915kT0.m28939m(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: I2 */
    public Collection<C48526sE3<Long, Long>> mo49700I2() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: K1 */
    public View mo49698K1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, AbstractC43458jh3<Long> abstractC43458jh3) {
        boolean z;
        String m30054g;
        View inflate = layoutInflater.inflate(C50603vk4.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C33795Ji4.mtrl_picker_text_input_date);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        if (UJ2.m81640a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormat = this.f72682d;
        if (simpleDateFormat != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            simpleDateFormat = C43471ji6.m30055f();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        if (z) {
            m30054g = simpleDateFormat2.toPattern();
        } else {
            m30054g = C43471ji6.m30054g(inflate.getResources(), simpleDateFormat2);
        }
        String str = m30054g;
        textInputLayout.setPlaceholderText(str);
        Long l = this.f72681c;
        if (l != null) {
            editText.setText(simpleDateFormat2.format(l));
        }
        editText.addTextChangedListener(new C17763a(str, simpleDateFormat2, textInputLayout, calendarConstraints, abstractC43458jh3, textInputLayout));
        DateSelector.m49748b3(editText);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: c0 */
    public int mo49694c0() {
        return C40534el4.mtrl_picker_date_header_title;
    }

    /* renamed from: d */
    public final void m49693d() {
        this.f72681c = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: e */
    public Long mo49686t1() {
        return this.f72681c;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: g */
    public void mo49699J0(Long l) {
        this.f72681c = l == null ? null : Long.valueOf(C43471ji6.m30060a(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getError() {
        if (TextUtils.isEmpty(this.f72680b)) {
            return null;
        }
        return this.f72680b.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: h2 */
    public String mo49690h2(Context context) {
        String m28939m;
        Resources resources = context.getResources();
        Long l = this.f72681c;
        if (l == null) {
            m28939m = resources.getString(C40534el4.mtrl_picker_announce_current_selection_none);
        } else {
            m28939m = C43915kT0.m28939m(l.longValue());
        }
        return resources.getString(C40534el4.mtrl_picker_announce_current_selection, m28939m);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: k0 */
    public int mo49689k0(Context context) {
        return BM2.m114082d(context, C49961uf4.materialCalendarTheme, C17780c.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: n1 */
    public boolean mo49688n1() {
        return this.f72681c != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: s1 */
    public Collection<Long> mo49687s1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f72681c;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f72681c);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: z1 */
    public void mo49685z1(long j) {
        this.f72681c = Long.valueOf(j);
    }
}
