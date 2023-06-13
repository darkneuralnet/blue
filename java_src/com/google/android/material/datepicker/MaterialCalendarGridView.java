package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    public final Calendar f72654b;

    /* renamed from: c */
    public final boolean f72655c;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    /* loaded from: classes6.dex */
    public class C17758a extends C5148M1 {
        public C17758a() {
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            c27125p2.m20076h0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    public static int m49730d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: e */
    public static boolean m49729e(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: a */
    public final void m49733a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter2().m49602m());
        } else if (i == 130) {
            setSelection(getAdapter2().m49613b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public C17788d getAdapter2() {
        return (C17788d) super.getAdapter();
    }

    /* renamed from: c */
    public final View m49731c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int m49614a;
        int m49730d;
        int m49614a2;
        int m49730d2;
        int i;
        int i2;
        int i3;
        int i4;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C17788d adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.f72784c;
        C50245v80 c50245v80 = adapter2.f72786e;
        int max = Math.max(adapter2.m49613b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.m49602m(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<C48526sE3<Long, Long>> it = dateSelector.mo49700I2().iterator();
        while (it.hasNext()) {
            C48526sE3<Long, Long> next = it.next();
            Long l = next.f108491a;
            if (l != null) {
                if (next.f108492b != null) {
                    long longValue = l.longValue();
                    long longValue2 = next.f108492b.longValue();
                    if (!m49729e(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean m79294n = C36704Vt6.m79294n(this);
                        if (longValue < item.longValue()) {
                            if (adapter2.m49607h(max)) {
                                left2 = 0;
                            } else if (!m79294n) {
                                left2 = materialCalendarGridView.m49731c(max - 1).getRight();
                            } else {
                                left2 = materialCalendarGridView.m49731c(max - 1).getLeft();
                            }
                            m49730d = left2;
                            m49614a = max;
                        } else {
                            materialCalendarGridView.f72654b.setTimeInMillis(longValue);
                            m49614a = adapter2.m49614a(materialCalendarGridView.f72654b.get(5));
                            m49730d = m49730d(materialCalendarGridView.m49731c(m49614a));
                        }
                        if (longValue2 > item2.longValue()) {
                            if (adapter2.m49606i(min)) {
                                left = getWidth();
                            } else if (!m79294n) {
                                left = materialCalendarGridView.m49731c(min).getRight();
                            } else {
                                left = materialCalendarGridView.m49731c(min).getLeft();
                            }
                            m49730d2 = left;
                            m49614a2 = min;
                        } else {
                            materialCalendarGridView.f72654b.setTimeInMillis(longValue2);
                            m49614a2 = adapter2.m49614a(materialCalendarGridView.f72654b.get(5));
                            m49730d2 = m49730d(materialCalendarGridView.m49731c(m49614a2));
                        }
                        int itemId = (int) adapter2.getItemId(m49614a);
                        int i5 = max;
                        int i6 = min;
                        int itemId2 = (int) adapter2.getItemId(m49614a2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (numColumns + getNumColumns()) - 1;
                            View m49731c = materialCalendarGridView.m49731c(numColumns);
                            int top = m49731c.getTop() + c50245v80.f113573a.m10822c();
                            C17788d c17788d = adapter2;
                            int bottom = m49731c.getBottom() - c50245v80.f113573a.m10823b();
                            if (!m79294n) {
                                if (numColumns > m49614a) {
                                    i4 = 0;
                                } else {
                                    i4 = m49730d;
                                }
                                if (m49614a2 > numColumns2) {
                                    i3 = getWidth();
                                } else {
                                    i3 = m49730d2;
                                }
                            } else {
                                if (m49614a2 > numColumns2) {
                                    i = 0;
                                } else {
                                    i = m49730d2;
                                }
                                if (numColumns > m49614a) {
                                    i2 = getWidth();
                                } else {
                                    i2 = m49730d;
                                }
                                int i7 = i;
                                i3 = i2;
                                i4 = i7;
                            }
                            canvas.drawRect(i4, top, i3, bottom, c50245v80.f113580h);
                            itemId++;
                            materialCalendarGridView = this;
                            it = it;
                            adapter2 = c17788d;
                        }
                        materialCalendarGridView = this;
                        max = i5;
                        min = i6;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m49733a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().m49613b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().m49613b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f72655c) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().m49613b()) {
            super.setSelection(getAdapter2().m49613b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72654b = C43471ji6.m30049l();
        if (C17780c.m49625oa(getContext())) {
            setNextFocusLeftId(C33795Ji4.cancel_button);
            setNextFocusRightId(C33795Ji4.confirm_button);
        }
        this.f72655c = C17780c.m49622va(getContext());
        C38790bq6.m62452v0(this, new C17758a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C17788d) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C17788d.class.getCanonicalName()));
    }
}
