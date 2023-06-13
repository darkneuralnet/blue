package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
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
public class RangeDateSelector implements DateSelector<C48526sE3<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C17762c();

    /* renamed from: b */
    public CharSequence f72664b;

    /* renamed from: c */
    public String f72665c;

    /* renamed from: d */
    public final String f72666d = " ";

    /* renamed from: e */
    public Long f72667e = null;

    /* renamed from: f */
    public Long f72668f = null;

    /* renamed from: g */
    public Long f72669g = null;

    /* renamed from: h */
    public Long f72670h = null;

    /* renamed from: i */
    public SimpleDateFormat f72671i;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    /* loaded from: classes6.dex */
    public class C17760a extends AbstractC17765a {

        /* renamed from: h */
        public final /* synthetic */ TextInputLayout f72672h;

        /* renamed from: i */
        public final /* synthetic */ TextInputLayout f72673i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC43458jh3 f72674j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17760a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AbstractC43458jh3 abstractC43458jh3) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f72672h = textInputLayout2;
            this.f72673i = textInputLayout3;
            this.f72674j = abstractC43458jh3;
        }

        @Override // com.google.android.material.datepicker.AbstractC17765a
        /* renamed from: f */
        public void mo49677f() {
            RangeDateSelector.this.f72669g = null;
            RangeDateSelector.this.m49704m(this.f72672h, this.f72673i, this.f72674j);
        }

        @Override // com.google.android.material.datepicker.AbstractC17765a
        /* renamed from: g */
        public void mo49676g(Long l) {
            RangeDateSelector.this.f72669g = l;
            RangeDateSelector.this.m49704m(this.f72672h, this.f72673i, this.f72674j);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$b */
    /* loaded from: classes6.dex */
    public class C17761b extends AbstractC17765a {

        /* renamed from: h */
        public final /* synthetic */ TextInputLayout f72676h;

        /* renamed from: i */
        public final /* synthetic */ TextInputLayout f72677i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC43458jh3 f72678j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17761b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AbstractC43458jh3 abstractC43458jh3) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f72676h = textInputLayout2;
            this.f72677i = textInputLayout3;
            this.f72678j = abstractC43458jh3;
        }

        @Override // com.google.android.material.datepicker.AbstractC17765a
        /* renamed from: f */
        public void mo49677f() {
            RangeDateSelector.this.f72670h = null;
            RangeDateSelector.this.m49704m(this.f72676h, this.f72677i, this.f72678j);
        }

        @Override // com.google.android.material.datepicker.AbstractC17765a
        /* renamed from: g */
        public void mo49676g(Long l) {
            RangeDateSelector.this.f72670h = l;
            RangeDateSelector.this.m49704m(this.f72676h, this.f72677i, this.f72678j);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$c */
    /* loaded from: classes6.dex */
    public class C17762c implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f72667e = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f72668f = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: E2 */
    public String mo49701E2(Context context) {
        Resources resources = context.getResources();
        Long l = this.f72667e;
        if (l == null && this.f72668f == null) {
            return resources.getString(C40534el4.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f72668f;
        if (l2 == null) {
            return resources.getString(C40534el4.mtrl_picker_range_header_only_start_selected, C43915kT0.m28949c(l.longValue()));
        }
        if (l == null) {
            return resources.getString(C40534el4.mtrl_picker_range_header_only_end_selected, C43915kT0.m28949c(l2.longValue()));
        }
        C48526sE3<String, String> m28951a = C43915kT0.m28951a(l, l2);
        return resources.getString(C40534el4.mtrl_picker_range_header_selected, m28951a.f108491a, m28951a.f108492b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: I2 */
    public Collection<C48526sE3<Long, Long>> mo49700I2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C48526sE3(this.f72667e, this.f72668f));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: K1 */
    public View mo49698K1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, AbstractC43458jh3<C48526sE3<Long, Long>> abstractC43458jh3) {
        boolean z;
        String m30054g;
        View inflate = layoutInflater.inflate(C50603vk4.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C33795Ji4.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(C33795Ji4.mtrl_picker_text_input_range_end);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        textInputLayout2.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (UJ2.m81640a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f72665c = inflate.getResources().getString(C40534el4.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormat = this.f72671i;
        if (simpleDateFormat != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            simpleDateFormat = C43471ji6.m30055f();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        Long l = this.f72667e;
        if (l != null) {
            editText.setText(simpleDateFormat2.format(l));
            this.f72669g = this.f72667e;
        }
        Long l2 = this.f72668f;
        if (l2 != null) {
            editText2.setText(simpleDateFormat2.format(l2));
            this.f72670h = this.f72668f;
        }
        if (z) {
            m30054g = simpleDateFormat2.toPattern();
        } else {
            m30054g = C43471ji6.m30054g(inflate.getResources(), simpleDateFormat2);
        }
        String str = m30054g;
        textInputLayout.setPlaceholderText(str);
        textInputLayout2.setPlaceholderText(str);
        editText.addTextChangedListener(new C17760a(str, simpleDateFormat2, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, abstractC43458jh3));
        editText2.addTextChangedListener(new C17761b(str, simpleDateFormat2, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, abstractC43458jh3));
        DateSelector.m49748b3(editText, editText2);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: c0 */
    public int mo49694c0() {
        return C40534el4.mtrl_picker_range_header_title;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public final void m49710g(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f72665c.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError(null);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getError() {
        if (TextUtils.isEmpty(this.f72664b)) {
            return null;
        }
        return this.f72664b.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: h */
    public C48526sE3<Long, Long> mo49686t1() {
        return new C48526sE3<>(this.f72667e, this.f72668f);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: h2 */
    public String mo49690h2(Context context) {
        String str;
        String str2;
        Resources resources = context.getResources();
        C48526sE3<String, String> m28951a = C43915kT0.m28951a(this.f72667e, this.f72668f);
        String str3 = m28951a.f108491a;
        if (str3 == null) {
            str = resources.getString(C40534el4.mtrl_picker_announce_current_selection_none);
        } else {
            str = str3;
        }
        String str4 = m28951a.f108492b;
        if (str4 == null) {
            str2 = resources.getString(C40534el4.mtrl_picker_announce_current_selection_none);
        } else {
            str2 = str4;
        }
        return resources.getString(C40534el4.mtrl_picker_announce_current_range_selection, str, str2);
    }

    /* renamed from: i */
    public final boolean m49708i(long j, long j2) {
        return j <= j2;
    }

    /* renamed from: j */
    public final void m49707j(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f72665c);
        textInputLayout2.setError(" ");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: k */
    public void mo49699J0(C48526sE3<Long, Long> c48526sE3) {
        Long valueOf;
        Long l = c48526sE3.f108491a;
        if (l != null && c48526sE3.f108492b != null) {
            HZ3.m103737a(m49708i(l.longValue(), c48526sE3.f108492b.longValue()));
        }
        Long l2 = c48526sE3.f108491a;
        Long l3 = null;
        if (l2 == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(C43471ji6.m30060a(l2.longValue()));
        }
        this.f72667e = valueOf;
        Long l4 = c48526sE3.f108492b;
        if (l4 != null) {
            l3 = Long.valueOf(C43471ji6.m30060a(l4.longValue()));
        }
        this.f72668f = l3;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: k0 */
    public int mo49689k0(Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C35172Pf4.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i = C49961uf4.materialCalendarTheme;
        } else {
            i = C49961uf4.materialCalendarFullscreenTheme;
        }
        return BM2.m114082d(context, i, C17780c.class.getCanonicalName());
    }

    /* renamed from: l */
    public final void m49705l(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.f72664b = textInputLayout.getError();
        } else if (!TextUtils.isEmpty(textInputLayout2.getError())) {
            this.f72664b = textInputLayout2.getError();
        } else {
            this.f72664b = null;
        }
    }

    /* renamed from: m */
    public final void m49704m(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, AbstractC43458jh3<C48526sE3<Long, Long>> abstractC43458jh3) {
        Long l = this.f72669g;
        if (l != null && this.f72670h != null) {
            if (m49708i(l.longValue(), this.f72670h.longValue())) {
                this.f72667e = this.f72669g;
                this.f72668f = this.f72670h;
                abstractC43458jh3.mo30093b(mo49686t1());
            } else {
                m49707j(textInputLayout, textInputLayout2);
                abstractC43458jh3.mo30094a();
            }
        } else {
            m49710g(textInputLayout, textInputLayout2);
            abstractC43458jh3.mo30094a();
        }
        m49705l(textInputLayout, textInputLayout2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: n1 */
    public boolean mo49688n1() {
        Long l = this.f72667e;
        if (l != null && this.f72668f != null && m49708i(l.longValue(), this.f72668f.longValue())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: s1 */
    public Collection<Long> mo49687s1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f72667e;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f72668f;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f72667e);
        parcel.writeValue(this.f72668f);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: z1 */
    public void mo49685z1(long j) {
        Long l = this.f72667e;
        if (l == null) {
            this.f72667e = Long.valueOf(j);
        } else if (this.f72668f == null && m49708i(l.longValue(), j)) {
            this.f72668f = Long.valueOf(j);
        } else {
            this.f72668f = null;
            this.f72667e = Long.valueOf(j);
        }
    }
}
