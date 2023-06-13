package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
/* renamed from: OP5 */
/* loaded from: classes6.dex */
public final class OP5 {

    /* renamed from: n */
    public static final int f26536n = 1;

    /* renamed from: a */
    public CharSequence f26537a;

    /* renamed from: b */
    public final TextPaint f26538b;

    /* renamed from: c */
    public final int f26539c;

    /* renamed from: e */
    public int f26541e;

    /* renamed from: l */
    public boolean f26548l;

    /* renamed from: d */
    public int f26540d = 0;

    /* renamed from: f */
    public Layout.Alignment f26542f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    public int f26543g = Integer.MAX_VALUE;

    /* renamed from: h */
    public float f26544h = 0.0f;

    /* renamed from: i */
    public float f26545i = 1.0f;

    /* renamed from: j */
    public int f26546j = f26536n;

    /* renamed from: k */
    public boolean f26547k = true;

    /* renamed from: m */
    public TextUtils.TruncateAt f26549m = null;

    /* renamed from: OP5$a */
    /* loaded from: classes6.dex */
    public static class C5994a extends Exception {
    }

    public OP5(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f26537a = charSequence;
        this.f26538b = textPaint;
        this.f26539c = i;
        this.f26541e = charSequence.length();
    }

    /* renamed from: b */
    public static OP5 m92330b(CharSequence charSequence, TextPaint textPaint, int i) {
        return new OP5(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout m92331a() throws C5994a {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f26537a == null) {
            this.f26537a = "";
        }
        int max = Math.max(0, this.f26539c);
        CharSequence charSequence = this.f26537a;
        if (this.f26543g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f26538b, max, this.f26549m);
        }
        int min = Math.min(charSequence.length(), this.f26541e);
        this.f26541e = min;
        if (this.f26548l && this.f26543g == 1) {
            this.f26542f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f26540d, min, this.f26538b, max);
        obtain.setAlignment(this.f26542f);
        obtain.setIncludePad(this.f26547k);
        if (this.f26548l) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f26549m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f26543g);
        float f = this.f26544h;
        if (f != 0.0f || this.f26545i != 1.0f) {
            obtain.setLineSpacing(f, this.f26545i);
        }
        if (this.f26543g > 1) {
            obtain.setHyphenationFrequency(this.f26546j);
        }
        return obtain.build();
    }

    /* renamed from: c */
    public OP5 m92329c(Layout.Alignment alignment) {
        this.f26542f = alignment;
        return this;
    }

    /* renamed from: d */
    public OP5 m92328d(TextUtils.TruncateAt truncateAt) {
        this.f26549m = truncateAt;
        return this;
    }

    /* renamed from: e */
    public OP5 m92327e(int i) {
        this.f26546j = i;
        return this;
    }

    /* renamed from: f */
    public OP5 m92326f(boolean z) {
        this.f26547k = z;
        return this;
    }

    /* renamed from: g */
    public OP5 m92325g(boolean z) {
        this.f26548l = z;
        return this;
    }

    /* renamed from: h */
    public OP5 m92324h(float f, float f2) {
        this.f26544h = f;
        this.f26545i = f2;
        return this;
    }

    /* renamed from: i */
    public OP5 m92323i(int i) {
        this.f26543g = i;
        return this;
    }

    /* renamed from: j */
    public OP5 m92322j(PP5 pp5) {
        return this;
    }
}
