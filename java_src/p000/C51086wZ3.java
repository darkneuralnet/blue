package p000;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
/* renamed from: wZ3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C51086wZ3 implements Spannable {

    /* renamed from: e */
    public static final Object f116179e = new Object();

    /* renamed from: b */
    public final Spannable f116180b;

    /* renamed from: c */
    public final C29915a f116181c;

    /* renamed from: d */
    public final PrecomputedText f116182d;

    /* renamed from: a */
    public C29915a m6648a() {
        return this.f116181c;
    }

    /* renamed from: b */
    public PrecomputedText m6647b() {
        if (C41600gZ3.m39167a(this.f116180b)) {
            return C42193hZ3.m36181a(this.f116180b);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f116180b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f116180b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f116180b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f116180b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT >= 29) {
            spans = this.f116182d.getSpans(i, i2, cls);
            return (T[]) spans;
        }
        return (T[]) this.f116180b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f116180b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f116180b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f116182d.removeSpan(obj);
                return;
            } else {
                this.f116180b.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f116182d.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.f116180b.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f116180b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f116180b.toString();
    }

    /* renamed from: wZ3$a */
    /* loaded from: classes.dex */
    public static final class C29915a {

        /* renamed from: a */
        public final TextPaint f116183a;

        /* renamed from: b */
        public final TextDirectionHeuristic f116184b;

        /* renamed from: c */
        public final int f116185c;

        /* renamed from: d */
        public final int f116186d;

        /* renamed from: e */
        public final PrecomputedText.Params f116187e;

        /* renamed from: wZ3$a$a */
        /* loaded from: classes.dex */
        public static class C29916a {

            /* renamed from: a */
            public final TextPaint f116188a;

            /* renamed from: c */
            public int f116190c = 1;

            /* renamed from: d */
            public int f116191d = 1;

            /* renamed from: b */
            public TextDirectionHeuristic f116189b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C29916a(TextPaint textPaint) {
                this.f116188a = textPaint;
            }

            /* renamed from: a */
            public C29915a m6641a() {
                return new C29915a(this.f116188a, this.f116189b, this.f116190c, this.f116191d);
            }

            /* renamed from: b */
            public C29916a m6640b(int i) {
                this.f116190c = i;
                return this;
            }

            /* renamed from: c */
            public C29916a m6639c(int i) {
                this.f116191d = i;
                return this;
            }

            /* renamed from: d */
            public C29916a m6638d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f116189b = textDirectionHeuristic;
                return this;
            }
        }

        public C29915a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                C45158mZ3.m25428a();
                breakStrategy = C50493vZ3.m8443a(textPaint).setBreakStrategy(i);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f116187e = build;
            } else {
                this.f116187e = null;
            }
            this.f116183a = textPaint;
            this.f116184b = textDirectionHeuristic;
            this.f116185c = i;
            this.f116186d = i2;
        }

        /* renamed from: a */
        public boolean m6646a(C29915a c29915a) {
            if (this.f116185c != c29915a.m6645b() || this.f116186d != c29915a.m6644c() || this.f116183a.getTextSize() != c29915a.m6642e().getTextSize() || this.f116183a.getTextScaleX() != c29915a.m6642e().getTextScaleX() || this.f116183a.getTextSkewX() != c29915a.m6642e().getTextSkewX() || this.f116183a.getLetterSpacing() != c29915a.m6642e().getLetterSpacing() || !TextUtils.equals(this.f116183a.getFontFeatureSettings(), c29915a.m6642e().getFontFeatureSettings()) || this.f116183a.getFlags() != c29915a.m6642e().getFlags() || !this.f116183a.getTextLocales().equals(c29915a.m6642e().getTextLocales())) {
                return false;
            }
            if (this.f116183a.getTypeface() == null) {
                if (c29915a.m6642e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f116183a.getTypeface().equals(c29915a.m6642e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public int m6645b() {
            return this.f116185c;
        }

        /* renamed from: c */
        public int m6644c() {
            return this.f116186d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m6643d() {
            return this.f116184b;
        }

        /* renamed from: e */
        public TextPaint m6642e() {
            return this.f116183a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C29915a)) {
                return false;
            }
            C29915a c29915a = (C29915a) obj;
            if (m6646a(c29915a) && this.f116184b == c29915a.m6643d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C37259Yd3.m74779b(Float.valueOf(this.f116183a.getTextSize()), Float.valueOf(this.f116183a.getTextScaleX()), Float.valueOf(this.f116183a.getTextSkewX()), Float.valueOf(this.f116183a.getLetterSpacing()), Integer.valueOf(this.f116183a.getFlags()), this.f116183a.getTextLocales(), this.f116183a.getTypeface(), Boolean.valueOf(this.f116183a.isElegantTextHeight()), this.f116184b, Integer.valueOf(this.f116185c), Integer.valueOf(this.f116186d));
        }

        public String toString() {
            String fontVariationSettings;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f116183a.getTextSize());
            sb.append(", textScaleX=" + this.f116183a.getTextScaleX());
            sb.append(", textSkewX=" + this.f116183a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f116183a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f116183a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f116183a.getTextLocales());
            sb.append(", typeface=" + this.f116183a.getTypeface());
            if (i >= 26) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", variationSettings=");
                fontVariationSettings = this.f116183a.getFontVariationSettings();
                sb2.append(fontVariationSettings);
                sb.append(sb2.toString());
            }
            sb.append(", textDir=" + this.f116184b);
            sb.append(", breakStrategy=" + this.f116185c);
            sb.append(", hyphenationFrequency=" + this.f116186d);
            sb.append("}");
            return sb.toString();
        }

        public C29915a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f116183a = textPaint;
            textDirection = params.getTextDirection();
            this.f116184b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f116185c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f116186d = hyphenationFrequency;
            this.f116187e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
