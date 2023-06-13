package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C17766b;
/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes6.dex */
public class C17789e extends RecyclerView.AbstractC11843h<C17791b> {

    /* renamed from: b */
    public final CalendarConstraints f72789b;

    /* renamed from: c */
    public final DateSelector<?> f72790c;

    /* renamed from: d */
    public final DayViewDecorator f72791d;

    /* renamed from: e */
    public final C17766b.InterfaceC17779m f72792e;

    /* renamed from: f */
    public final int f72793f;

    /* renamed from: com.google.android.material.datepicker.e$a */
    /* loaded from: classes6.dex */
    public class C17790a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final /* synthetic */ MaterialCalendarGridView f72794b;

        public C17790a(MaterialCalendarGridView materialCalendarGridView) {
            this.f72794b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f72794b.getAdapter2().m49597r(i)) {
                C17789e.this.f72792e.mo49650a(this.f72794b.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$b */
    /* loaded from: classes6.dex */
    public static class C17791b extends RecyclerView.AbstractC11834D {

        /* renamed from: b */
        public final TextView f72796b;

        /* renamed from: c */
        public final MaterialCalendarGridView f72797c;

        public C17791b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C33795Ji4.month_title);
            this.f72796b = textView;
            C38790bq6.m62450w0(textView, true);
            this.f72797c = (MaterialCalendarGridView) linearLayout.findViewById(C33795Ji4.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public C17789e(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, C17766b.InterfaceC17779m interfaceC17779m) {
        int i;
        Month m49762m = calendarConstraints.m49762m();
        Month m49766i = calendarConstraints.m49766i();
        Month m49763l = calendarConstraints.m49763l();
        if (m49762m.compareTo(m49763l) <= 0) {
            if (m49763l.compareTo(m49766i) <= 0) {
                int m49661fa = C17788d.f72781h * C17766b.m49661fa(context);
                if (C17780c.m49625oa(context)) {
                    i = C17766b.m49661fa(context);
                } else {
                    i = 0;
                }
                this.f72793f = m49661fa + i;
                this.f72789b = calendarConstraints;
                this.f72790c = dateSelector;
                this.f72791d = dayViewDecorator;
                this.f72792e = interfaceC17779m;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f72789b.m49764k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public long getItemId(int i) {
        return this.f72789b.m49762m().m49719k(i).m49720j();
    }

    /* renamed from: p */
    public Month m49595p(int i) {
        return this.f72789b.m49762m().m49719k(i);
    }

    /* renamed from: q */
    public CharSequence m49594q(int i) {
        return m49595p(i).m49721i();
    }

    /* renamed from: r */
    public int m49593r(Month month) {
        return this.f72789b.m49762m().m49718l(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: t */
    public void onBindViewHolder(C17791b c17791b, int i) {
        Month m49719k = this.f72789b.m49762m().m49719k(i);
        c17791b.f72796b.setText(m49719k.m49721i());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c17791b.f72797c.findViewById(C33795Ji4.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && m49719k.equals(materialCalendarGridView.getAdapter2().f72783b)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m49598q(materialCalendarGridView);
        } else {
            C17788d c17788d = new C17788d(m49719k, this.f72790c, this.f72789b, this.f72791d);
            materialCalendarGridView.setNumColumns(m49719k.f72660e);
            materialCalendarGridView.setAdapter((ListAdapter) c17788d);
        }
        materialCalendarGridView.setOnItemClickListener(new C17790a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: u */
    public C17791b onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C50603vk4.mtrl_calendar_month_labeled, viewGroup, false);
        if (C17780c.m49625oa(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f72793f));
            return new C17791b(linearLayout, true);
        }
        return new C17791b(linearLayout, false);
    }
}
