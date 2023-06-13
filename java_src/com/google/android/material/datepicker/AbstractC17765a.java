package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.datepicker.AbstractC17765a;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import kotlin.text.Typography;
/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes6.dex */
public abstract class AbstractC17765a extends C38326b36 {

    /* renamed from: b */
    public final TextInputLayout f72686b;

    /* renamed from: c */
    public final DateFormat f72687c;

    /* renamed from: d */
    public final CalendarConstraints f72688d;

    /* renamed from: e */
    public final String f72689e;

    /* renamed from: f */
    public final Runnable f72690f;

    /* renamed from: g */
    public Runnable f72691g;

    public AbstractC17765a(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f72687c = dateFormat;
        this.f72686b = textInputLayout;
        this.f72688d = calendarConstraints;
        this.f72689e = textInputLayout.getContext().getString(C40534el4.mtrl_picker_out_of_range);
        this.f72690f = new Runnable() { // from class: gT0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC17765a.this.m49678e(str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m49679d(long j) {
        this.f72686b.setError(String.format(this.f72689e, m49674i(C43915kT0.m28949c(j))));
        mo49677f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m49678e(String str) {
        TextInputLayout textInputLayout = this.f72686b;
        DateFormat dateFormat = this.f72687c;
        Context context = textInputLayout.getContext();
        String string = context.getString(C40534el4.mtrl_picker_invalid_format);
        String format = String.format(context.getString(C40534el4.mtrl_picker_invalid_format_use), m49674i(str));
        String format2 = String.format(context.getString(C40534el4.mtrl_picker_invalid_format_example), m49674i(dateFormat.format(new Date(C43471ji6.m30051j().getTimeInMillis()))));
        textInputLayout.setError(string + "\n" + format + "\n" + format2);
        mo49677f();
    }

    /* renamed from: c */
    public final Runnable m49680c(final long j) {
        return new Runnable() { // from class: hT0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC17765a.this.m49679d(j);
            }
        };
    }

    /* renamed from: f */
    public void mo49677f() {
    }

    /* renamed from: g */
    public abstract void mo49676g(Long l);

    /* renamed from: h */
    public void m49675h(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }

    /* renamed from: i */
    public final String m49674i(String str) {
        return str.replace(' ', Typography.nbsp);
    }

    @Override // p000.C38326b36, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f72686b.removeCallbacks(this.f72690f);
        this.f72686b.removeCallbacks(this.f72691g);
        this.f72686b.setError(null);
        mo49676g(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date parse = this.f72687c.parse(charSequence.toString());
            this.f72686b.setError(null);
            long time = parse.getTime();
            if (this.f72688d.m49767h().mo49743l0(time) && this.f72688d.m49760o(time)) {
                mo49676g(Long.valueOf(parse.getTime()));
                return;
            }
            Runnable m49680c = m49680c(time);
            this.f72691g = m49680c;
            m49675h(this.f72686b, m49680c);
        } catch (ParseException unused) {
            m49675h(this.f72686b, this.f72690f);
        }
    }
}
