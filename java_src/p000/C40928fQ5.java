package p000;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020\b\u0012\b\u0010+\u001a\u0004\u0018\u00010'\u0012\u0006\u0010-\u001a\u00020\b\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u00105\u001a\u00020.\u0012\u0006\u00106\u001a\u00020\b\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010<\u001a\u000207\u0012\u0006\u0010>\u001a\u00020\b\u0012\u0006\u0010?\u001a\u00020\b\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010A\u001a\u00020\b\u0012\b\u0010E\u001a\u0004\u0018\u00010B\u0012\b\u0010F\u001a\u0004\u0018\u00010B¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0003\u0010\"R\u0017\u0010&\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b%\u0010\fR\u0019\u0010+\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u000e\u0010*R\u0017\u0010-\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00105\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b4\u00102R\u0017\u00106\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b$\u0010\fR\u0017\u0010:\u001a\u0002078\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b \u00109R\u0017\u0010<\u001a\u0002078\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b;\u00109R\u0017\u0010>\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010?\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b,\u0010\fR\u0017\u0010@\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b/\u0010\fR\u0017\u0010A\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001a\u0010\fR\u0019\u0010E\u001a\u0004\u0018\u00010B8\u0006¢\u0006\f\n\u0004\b;\u0010C\u001a\u0004\b(\u0010DR\u0019\u0010F\u001a\u0004\u0018\u00010B8\u0006¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\b=\u0010D¨\u0006I"}, m28432d2 = {"LfQ5;", "", "", C17296a.f69688o, "Ljava/lang/CharSequence;", "r", "()Ljava/lang/CharSequence;", Entry.TYPE_TEXT, "", "b", "I", "q", "()I", "start", "c", "e", "end", "Landroid/text/TextPaint;", DateTokenConverter.CONVERTER_KEY, "Landroid/text/TextPaint;", "o", "()Landroid/text/TextPaint;", "paint", "u", "width", "Landroid/text/TextDirectionHeuristic;", "f", "Landroid/text/TextDirectionHeuristic;", "s", "()Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "g", "Landroid/text/Layout$Alignment;", "()Landroid/text/Layout$Alignment;", "alignment", "h", "n", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "i", "Landroid/text/TextUtils$TruncateAt;", "()Landroid/text/TextUtils$TruncateAt;", "ellipsize", "j", "ellipsizedWidth", "", "k", "F", "m", "()F", "lineSpacingMultiplier", "l", "lineSpacingExtra", "justificationMode", "", "Z", "()Z", "includePadding", "t", "useFallbackLineSpacing", "p", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "[I", "()[I", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fQ5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40928fQ5 {

    /* renamed from: a */
    public final CharSequence f80086a;

    /* renamed from: b */
    public final int f80087b;

    /* renamed from: c */
    public final int f80088c;

    /* renamed from: d */
    public final TextPaint f80089d;

    /* renamed from: e */
    public final int f80090e;

    /* renamed from: f */
    public final TextDirectionHeuristic f80091f;

    /* renamed from: g */
    public final Layout.Alignment f80092g;

    /* renamed from: h */
    public final int f80093h;

    /* renamed from: i */
    public final TextUtils.TruncateAt f80094i;

    /* renamed from: j */
    public final int f80095j;

    /* renamed from: k */
    public final float f80096k;

    /* renamed from: l */
    public final float f80097l;

    /* renamed from: m */
    public final int f80098m;

    /* renamed from: n */
    public final boolean f80099n;

    /* renamed from: o */
    public final boolean f80100o;

    /* renamed from: p */
    public final int f80101p;

    /* renamed from: q */
    public final int f80102q;

    /* renamed from: r */
    public final int f80103r;

    /* renamed from: s */
    public final int f80104s;

    /* renamed from: t */
    public final int[] f80105t;

    /* renamed from: u */
    public final int[] f80106u;

    public C40928fQ5(CharSequence text, int i, int i2, TextPaint paint, int i3, TextDirectionHeuristic textDir, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f80086a = text;
        this.f80087b = i;
        this.f80088c = i2;
        this.f80089d = paint;
        this.f80090e = i3;
        this.f80091f = textDir;
        this.f80092g = alignment;
        this.f80093h = i4;
        this.f80094i = truncateAt;
        this.f80095j = i5;
        this.f80096k = f;
        this.f80097l = f2;
        this.f80098m = i6;
        this.f80099n = z;
        this.f80100o = z2;
        this.f80101p = i7;
        this.f80102q = i8;
        this.f80103r = i9;
        this.f80104s = i10;
        this.f80105t = iArr;
        this.f80106u = iArr2;
        if (!(i >= 0 && i <= i2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i2 >= 0 && i2 <= text.length())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(f >= 0.0f)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: a */
    public final Layout.Alignment m41407a() {
        return this.f80092g;
    }

    /* renamed from: b */
    public final int m41406b() {
        return this.f80101p;
    }

    /* renamed from: c */
    public final TextUtils.TruncateAt m41405c() {
        return this.f80094i;
    }

    /* renamed from: d */
    public final int m41404d() {
        return this.f80095j;
    }

    /* renamed from: e */
    public final int m41403e() {
        return this.f80088c;
    }

    /* renamed from: f */
    public final int m41402f() {
        return this.f80104s;
    }

    /* renamed from: g */
    public final boolean m41401g() {
        return this.f80099n;
    }

    /* renamed from: h */
    public final int m41400h() {
        return this.f80098m;
    }

    /* renamed from: i */
    public final int[] m41399i() {
        return this.f80105t;
    }

    /* renamed from: j */
    public final int m41398j() {
        return this.f80102q;
    }

    /* renamed from: k */
    public final int m41397k() {
        return this.f80103r;
    }

    /* renamed from: l */
    public final float m41396l() {
        return this.f80097l;
    }

    /* renamed from: m */
    public final float m41395m() {
        return this.f80096k;
    }

    /* renamed from: n */
    public final int m41394n() {
        return this.f80093h;
    }

    /* renamed from: o */
    public final TextPaint m41393o() {
        return this.f80089d;
    }

    /* renamed from: p */
    public final int[] m41392p() {
        return this.f80106u;
    }

    /* renamed from: q */
    public final int m41391q() {
        return this.f80087b;
    }

    /* renamed from: r */
    public final CharSequence m41390r() {
        return this.f80086a;
    }

    /* renamed from: s */
    public final TextDirectionHeuristic m41389s() {
        return this.f80091f;
    }

    /* renamed from: t */
    public final boolean m41388t() {
        return this.f80100o;
    }

    /* renamed from: u */
    public final int m41387u() {
        return this.f80090e;
    }
}
