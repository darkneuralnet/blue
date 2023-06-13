package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: IN5 */
/* loaded from: classes.dex */
public final class IN5 extends SpannableStringBuilder {

    /* renamed from: b */
    public final Class<?> f15418b;

    /* renamed from: c */
    public final List<C3521a> f15419c;

    /* renamed from: IN5$a */
    /* loaded from: classes.dex */
    public static class C3521a implements TextWatcher, SpanWatcher {

        /* renamed from: b */
        public final Object f15420b;

        /* renamed from: c */
        public final AtomicInteger f15421c = new AtomicInteger(0);

        public C3521a(Object obj) {
            this.f15420b = obj;
        }

        /* renamed from: a */
        public final void m102432a() {
            this.f15421c.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f15420b).afterTextChanged(editable);
        }

        /* renamed from: b */
        public final boolean m102431b(Object obj) {
            return obj instanceof AbstractC33018Ga1;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f15420b).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* renamed from: c */
        public final void m102430c() {
            this.f15421c.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f15421c.get() > 0 && m102431b(obj)) {
                return;
            }
            ((SpanWatcher) this.f15420b).onSpanAdded(spannable, obj, i, i2);
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f15421c.get() > 0 && m102431b(obj)) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                    ((SpanWatcher) this.f15420b).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                }
            }
            i5 = i;
            i6 = i3;
            ((SpanWatcher) this.f15420b).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f15421c.get() > 0 && m102431b(obj)) {
                return;
            }
            ((SpanWatcher) this.f15420b).onSpanRemoved(spannable, obj, i, i2);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f15420b).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public IN5(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f15419c = new ArrayList();
        HZ3.m103730h(cls, "watcherClass cannot be null");
        this.f15418b = cls;
    }

    /* renamed from: c */
    public static IN5 m102439c(Class<?> cls, CharSequence charSequence) {
        return new IN5(cls, charSequence);
    }

    /* renamed from: a */
    public void m102441a() {
        m102440b();
    }

    /* renamed from: b */
    public final void m102440b() {
        for (int i = 0; i < this.f15419c.size(); i++) {
            this.f15419c.get(i).m102432a();
        }
    }

    /* renamed from: d */
    public void m102438d() {
        m102433i();
        m102437e();
    }

    /* renamed from: e */
    public final void m102437e() {
        for (int i = 0; i < this.f15419c.size(); i++) {
            this.f15419c.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    public final C3521a m102436f(Object obj) {
        for (int i = 0; i < this.f15419c.size(); i++) {
            C3521a c3521a = this.f15419c.get(i);
            if (c3521a.f15420b == obj) {
                return c3521a;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean m102435g(Class<?> cls) {
        return this.f15418b == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        C3521a m102436f;
        if (m102434h(obj) && (m102436f = m102436f(obj)) != null) {
            obj = m102436f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        C3521a m102436f;
        if (m102434h(obj) && (m102436f = m102436f(obj)) != null) {
            obj = m102436f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        C3521a m102436f;
        if (m102434h(obj) && (m102436f = m102436f(obj)) != null) {
            obj = m102436f;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (m102435g(cls)) {
            C3521a[] c3521aArr = (C3521a[]) super.getSpans(i, i2, C3521a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c3521aArr.length));
            for (int i3 = 0; i3 < c3521aArr.length; i3++) {
                tArr[i3] = c3521aArr[i3].f15420b;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    /* renamed from: h */
    public final boolean m102434h(Object obj) {
        return obj != null && m102435g(obj.getClass());
    }

    /* renamed from: i */
    public final void m102433i() {
        for (int i = 0; i < this.f15419c.size(); i++) {
            this.f15419c.get(i).m102430c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return super.nextSpanTransition(i, i2, (cls == null || m102435g(cls)) ? C3521a.class : C3521a.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        C3521a c3521a;
        if (m102434h(obj)) {
            c3521a = m102436f(obj);
            if (c3521a != null) {
                obj = c3521a;
            }
        } else {
            c3521a = null;
        }
        super.removeSpan(obj);
        if (c3521a != null) {
            this.f15419c.remove(c3521a);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m102434h(obj)) {
            C3521a c3521a = new C3521a(obj);
            this.f15419c.add(c3521a);
            obj = c3521a;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new IN5(this.f15418b, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m102440b();
        super.replace(i, i2, charSequence);
        m102433i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public IN5(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f15419c = new ArrayList();
        HZ3.m103730h(cls, "watcherClass cannot be null");
        this.f15418b = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m102440b();
        super.replace(i, i2, charSequence, i3, i4);
        m102433i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
