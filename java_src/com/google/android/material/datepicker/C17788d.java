package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes6.dex */
public class C17788d extends BaseAdapter {

    /* renamed from: h */
    public static final int f72781h = C43471ji6.m30049l().getMaximum(4);

    /* renamed from: i */
    public static final int f72782i = (C43471ji6.m30049l().getMaximum(5) + C43471ji6.m30049l().getMaximum(7)) - 1;

    /* renamed from: b */
    public final Month f72783b;

    /* renamed from: c */
    public final DateSelector<?> f72784c;

    /* renamed from: d */
    public Collection<Long> f72785d;

    /* renamed from: e */
    public C50245v80 f72786e;

    /* renamed from: f */
    public final CalendarConstraints f72787f;

    /* renamed from: g */
    public final DayViewDecorator f72788g;

    public C17788d(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f72783b = month;
        this.f72784c = dateSelector;
        this.f72787f = calendarConstraints;
        this.f72788g = dayViewDecorator;
        this.f72785d = dateSelector.mo49687s1();
    }

    /* renamed from: a */
    public int m49614a(int i) {
        return m49613b() + (i - 1);
    }

    /* renamed from: b */
    public int m49613b() {
        return this.f72783b.m49724e(this.f72787f.m49765j());
    }

    /* renamed from: c */
    public final String m49612c(Context context, long j) {
        return C43915kT0.m28947e(context, j, m49603l(j), m49604k(j), m49608g(j));
    }

    @Override // android.widget.Adapter
    /* renamed from: d */
    public Long getItem(int i) {
        if (i >= m49613b() && i <= m49602m()) {
            return Long.valueOf(this.f72783b.m49723g(m49601n(i)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    @Override // android.widget.Adapter
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        Long item;
        m49609f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C50603vk4.mtrl_calendar_day, viewGroup, false);
        }
        int m49613b = i - m49613b();
        if (m49613b >= 0) {
            Month month = this.f72783b;
            if (m49613b < month.f72661f) {
                i2 = m49613b + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i);
                if (item != null) {
                    return textView;
                }
                m49600o(textView, item.longValue(), i2);
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        i2 = -1;
        item = getItem(i);
        if (item != null) {
        }
    }

    /* renamed from: f */
    public final void m49609f(Context context) {
        if (this.f72786e == null) {
            this.f72786e = new C50245v80(context);
        }
    }

    /* renamed from: g */
    public boolean m49608g(long j) {
        for (C48526sE3<Long, Long> c48526sE3 : this.f72784c.mo49700I2()) {
            Long l = c48526sE3.f108492b;
            if (l != null && l.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f72782i;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f72783b.f72660e;
    }

    /* renamed from: h */
    public boolean m49607h(int i) {
        return i % this.f72783b.f72660e == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    public boolean m49606i(int i) {
        return (i + 1) % this.f72783b.f72660e == 0;
    }

    /* renamed from: j */
    public final boolean m49605j(long j) {
        Iterator<Long> it = this.f72784c.mo49687s1().iterator();
        while (it.hasNext()) {
            if (C43471ji6.m30060a(j) == C43471ji6.m30060a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public boolean m49604k(long j) {
        for (C48526sE3<Long, Long> c48526sE3 : this.f72784c.mo49700I2()) {
            Long l = c48526sE3.f108491a;
            if (l != null && l.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m49603l(long j) {
        return C43471ji6.m30051j().getTimeInMillis() == j;
    }

    /* renamed from: m */
    public int m49602m() {
        return (m49613b() + this.f72783b.f72661f) - 1;
    }

    /* renamed from: n */
    public int m49601n(int i) {
        return (i - m49613b()) + 1;
    }

    /* renamed from: o */
    public final void m49600o(TextView textView, long j, int i) {
        boolean z;
        C49653u80 c49653u80;
        C49653u80 c49653u802;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String m49612c = m49612c(context, j);
        textView.setContentDescription(m49612c);
        boolean mo49743l0 = this.f72787f.m49767h().mo49743l0(j);
        if (mo49743l0) {
            textView.setEnabled(true);
            boolean m49605j = m49605j(j);
            textView.setSelected(m49605j);
            if (m49605j) {
                c49653u802 = this.f72786e.f113574b;
            } else if (m49603l(j)) {
                c49653u802 = this.f72786e.f113575c;
            } else {
                c49653u802 = this.f72786e.f113573a;
            }
            c49653u80 = c49653u802;
            z = m49605j;
        } else {
            textView.setEnabled(false);
            z = false;
            c49653u80 = this.f72786e.f113579g;
        }
        DayViewDecorator dayViewDecorator = this.f72788g;
        if (dayViewDecorator != null && i != -1) {
            Month month = this.f72783b;
            int i2 = month.f72659d;
            int i3 = month.f72658c;
            boolean z2 = z;
            c49653u80.m10820e(textView, dayViewDecorator.m49740a(context, i2, i3, i, mo49743l0, z2));
            Drawable m49738c = this.f72788g.m49738c(context, i2, i3, i, mo49743l0, z2);
            Drawable m49736e = this.f72788g.m49736e(context, i2, i3, i, mo49743l0, z2);
            Drawable m49737d = this.f72788g.m49737d(context, i2, i3, i, mo49743l0, z);
            boolean z3 = z;
            textView.setCompoundDrawables(m49738c, m49736e, m49737d, this.f72788g.m49739b(context, i2, i3, i, mo49743l0, z3));
            textView.setContentDescription(this.f72788g.m49735g(context, i2, i3, i, mo49743l0, z3, m49612c));
            return;
        }
        c49653u80.m10821d(textView);
    }

    /* renamed from: p */
    public final void m49599p(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m49726c(j).equals(this.f72783b)) {
            int m49722h = this.f72783b.m49722h(j);
            m49600o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().m49614a(m49722h) - materialCalendarGridView.getFirstVisiblePosition()), j, m49722h);
        }
    }

    /* renamed from: q */
    public void m49598q(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.f72785d) {
            m49599p(materialCalendarGridView, l.longValue());
        }
        DateSelector<?> dateSelector = this.f72784c;
        if (dateSelector != null) {
            for (Long l2 : dateSelector.mo49687s1()) {
                m49599p(materialCalendarGridView, l2.longValue());
            }
            this.f72785d = this.f72784c.mo49687s1();
        }
    }

    /* renamed from: r */
    public boolean m49597r(int i) {
        return i >= m49613b() && i <= m49602m();
    }
}
