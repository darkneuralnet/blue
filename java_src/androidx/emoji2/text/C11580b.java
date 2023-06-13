package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.C11581c;
/* renamed from: androidx.emoji2.text.b */
/* loaded from: classes.dex */
public class C11580b implements C11581c.InterfaceC11587e {

    /* renamed from: b */
    public static final ThreadLocal<StringBuilder> f54407b = new ThreadLocal<>();

    /* renamed from: a */
    public final TextPaint f54408a;

    public C11580b() {
        TextPaint textPaint = new TextPaint();
        this.f54408a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    public static StringBuilder m67532b() {
        ThreadLocal<StringBuilder> threadLocal = f54407b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.C11581c.InterfaceC11587e
    /* renamed from: a */
    public boolean mo67499a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder m67532b = m67532b();
        m67532b.setLength(0);
        while (i < i2) {
            m67532b.append(charSequence.charAt(i));
            i++;
        }
        return C44376lE3.m27644a(this.f54408a, m67532b.toString());
    }
}
