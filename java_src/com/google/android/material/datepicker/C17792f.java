package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C17766b;
import java.util.Calendar;
import java.util.Locale;
/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes6.dex */
public class C17792f extends RecyclerView.AbstractC11843h<C17794b> {

    /* renamed from: b */
    public final C17766b<?> f72798b;

    /* renamed from: com.google.android.material.datepicker.f$a */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC17793a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ int f72799b;

        public View$OnClickListenerC17793a(int i) {
            this.f72799b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C17792f.this.f72798b.m49656oa(C17792f.this.f72798b.m49665S9().m49768g(Month.m49727b(this.f72799b, C17792f.this.f72798b.m49663da().f72658c)));
            C17792f.this.f72798b.m49655sa(C17766b.EnumC17778l.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.f$b */
    /* loaded from: classes6.dex */
    public static class C17794b extends RecyclerView.AbstractC11834D {

        /* renamed from: b */
        public final TextView f72801b;

        public C17794b(TextView textView) {
            super(textView);
            this.f72801b = textView;
        }
    }

    public C17792f(C17766b<?> c17766b) {
        this.f72798b = c17766b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f72798b.m49665S9().m49761n();
    }

    /* renamed from: p */
    public final View.OnClickListener m49589p(int i) {
        return new View$OnClickListenerC17793a(i);
    }

    /* renamed from: q */
    public int m49588q(int i) {
        return i - this.f72798b.m49665S9().m49762m().f72659d;
    }

    /* renamed from: r */
    public int m49587r(int i) {
        return this.f72798b.m49665S9().m49762m().f72659d + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: t */
    public void onBindViewHolder(C17794b c17794b, int i) {
        C49653u80 c49653u80;
        int m49587r = m49587r(i);
        c17794b.f72801b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(m49587r)));
        TextView textView = c17794b.f72801b;
        textView.setContentDescription(C43915kT0.m28941k(textView.getContext(), m49587r));
        C50245v80 m49664T9 = this.f72798b.m49664T9();
        Calendar m30051j = C43471ji6.m30051j();
        if (m30051j.get(1) == m49587r) {
            c49653u80 = m49664T9.f113578f;
        } else {
            c49653u80 = m49664T9.f113576d;
        }
        for (Long l : this.f72798b.m49662ea().mo49687s1()) {
            m30051j.setTimeInMillis(l.longValue());
            if (m30051j.get(1) == m49587r) {
                c49653u80 = m49664T9.f113577e;
            }
        }
        c49653u80.m10821d(c17794b.f72801b);
        c17794b.f72801b.setOnClickListener(m49589p(m49587r));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: u */
    public C17794b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C17794b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C50603vk4.mtrl_calendar_year, viewGroup, false));
    }
}
