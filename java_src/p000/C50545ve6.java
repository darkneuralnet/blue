package p000;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
/* renamed from: ve6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C50545ve6 implements Spannable {

    /* renamed from: b */
    public boolean f114450b = false;

    /* renamed from: c */
    public Spannable f114451c;

    /* renamed from: ve6$a */
    /* loaded from: classes.dex */
    public static class C29604a {
        private C29604a() {
        }

        /* renamed from: a */
        public static IntStream m8299a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        public static IntStream m8298b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* renamed from: ve6$b */
    /* loaded from: classes.dex */
    public static class C29605b {
        /* renamed from: a */
        public boolean mo8297a(CharSequence charSequence) {
            return charSequence instanceof C51086wZ3;
        }
    }

    /* renamed from: ve6$c */
    /* loaded from: classes.dex */
    public static class C29606c extends C29605b {
        @Override // p000.C50545ve6.C29605b
        /* renamed from: a */
        public boolean mo8297a(CharSequence charSequence) {
            return C41600gZ3.m39167a(charSequence) || (charSequence instanceof C51086wZ3);
        }
    }

    public C50545ve6(Spannable spannable) {
        this.f114451c = spannable;
    }

    /* renamed from: c */
    public static C29605b m8300c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new C29605b();
        }
        return new C29606c();
    }

    /* renamed from: a */
    public final void m8302a() {
        Spannable spannable = this.f114451c;
        if (!this.f114450b && m8300c().mo8297a(spannable)) {
            this.f114451c = new SpannableString(spannable);
        }
        this.f114450b = true;
    }

    /* renamed from: b */
    public Spannable m8301b() {
        return this.f114451c;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f114451c.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return C29604a.m8299a(this.f114451c);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return C29604a.m8298b(this.f114451c);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f114451c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f114451c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f114451c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f114451c.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f114451c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f114451c.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m8302a();
        this.f114451c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        m8302a();
        this.f114451c.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f114451c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f114451c.toString();
    }

    public C50545ve6(CharSequence charSequence) {
        this.f114451c = new SpannableString(charSequence);
    }
}
