package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 42\u00020\u0001:\u0001'B7\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u000e\u0012\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J4\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017JR\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016R\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\u0018\u0010\"R$\u0010)\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u0010+\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b\u001b\u0010\"R$\u0010-\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010\u0019\u001a\u0004\b\u0015\u0010\"R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00065"}, m28432d2 = {"LVU3;", "Landroid/text/style/ReplacementSpan;", "Landroid/graphics/Paint;", "paint", "", Entry.TYPE_TEXT, "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "Landroid/graphics/Canvas;", "canvas", "", "x", "top", "y", "bottom", "", "draw", "b", "F", "width", "c", "I", "widthUnit", DateTokenConverter.CONVERTER_KEY, "height", "e", "heightUnit", "f", "pxPerSp", "g", "()I", "verticalAlign", "<set-?>", "h", "Landroid/graphics/Paint$FontMetricsInt;", C17296a.f69688o, "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "i", "widthPx", "j", "heightPx", "", "k", "Z", "isLaidOut", "<init>", "(FIFIFI)V", "l", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlaceholderSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
/* renamed from: VU3 */
/* loaded from: classes.dex */
public final class VU3 extends ReplacementSpan {

    /* renamed from: l */
    public static final C8659a f39147l = new C8659a(null);

    /* renamed from: m */
    public static final int f39148m = 8;

    /* renamed from: b */
    public final float f39149b;

    /* renamed from: c */
    public final int f39150c;

    /* renamed from: d */
    public final float f39151d;

    /* renamed from: e */
    public final int f39152e;

    /* renamed from: f */
    public final float f39153f;

    /* renamed from: g */
    public final int f39154g;

    /* renamed from: h */
    public Paint.FontMetricsInt f39155h;

    /* renamed from: i */
    public int f39156i;

    /* renamed from: j */
    public int f39157j;

    /* renamed from: k */
    public boolean f39158k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, m28432d2 = {"LVU3$a;", "", "", "ALIGN_ABOVE_BASELINE", "I", "ALIGN_BOTTOM", "ALIGN_CENTER", "ALIGN_TEXT_BOTTOM", "ALIGN_TEXT_CENTER", "ALIGN_TEXT_TOP", "ALIGN_TOP", "UNIT_EM", "UNIT_SP", "UNIT_UNSPECIFIED", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: VU3$a */
    /* loaded from: classes.dex */
    public static final class C8659a {
        public /* synthetic */ C8659a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8659a() {
        }
    }

    public VU3(float f, int i, float f2, int i2, float f3, int i3) {
        this.f39149b = f;
        this.f39150c = i;
        this.f39151d = f2;
        this.f39152e = i2;
        this.f39153f = f3;
        this.f39154g = i3;
    }

    /* renamed from: a */
    public final Paint.FontMetricsInt m79845a() {
        Paint.FontMetricsInt fontMetricsInt = this.f39155h;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    /* renamed from: b */
    public final int m79844b() {
        if (this.f39158k) {
            return this.f39157j;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    /* renamed from: c */
    public final int m79843c() {
        return this.f39154g;
    }

    /* renamed from: d */
    public final int m79842d() {
        if (this.f39158k) {
            return this.f39156i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        float f;
        int m78319a;
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f39158k = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        Intrinsics.checkNotNullExpressionValue(fontMetricsInt2, "paint.fontMetricsInt");
        this.f39155h = fontMetricsInt2;
        if (m79845a().descent > m79845a().ascent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = this.f39150c;
            if (i3 != 0) {
                if (i3 == 1) {
                    f = this.f39149b * textSize;
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                f = this.f39149b * this.f39153f;
            }
            this.f39156i = WU3.m78319a(f);
            int i4 = this.f39152e;
            if (i4 != 0) {
                if (i4 == 1) {
                    m78319a = WU3.m78319a(this.f39151d * textSize);
                } else {
                    throw new IllegalArgumentException("Unsupported unit.");
                }
            } else {
                m78319a = WU3.m78319a(this.f39151d * this.f39153f);
            }
            this.f39157j = m78319a;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = m79845a().ascent;
                fontMetricsInt.descent = m79845a().descent;
                fontMetricsInt.leading = m79845a().leading;
                switch (this.f39154g) {
                    case 0:
                        if (fontMetricsInt.ascent > (-m79844b())) {
                            fontMetricsInt.ascent = -m79844b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + m79844b() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + m79844b();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - m79844b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - m79844b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < m79844b()) {
                            int m79844b = fontMetricsInt.ascent - ((m79844b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = m79844b;
                            fontMetricsInt.descent = m79844b + m79844b();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(m79845a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(m79845a().bottom, fontMetricsInt.descent);
            }
            return m79842d();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
