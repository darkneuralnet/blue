package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001%BÇ\u0001\u0012\u0006\u0010a\u001a\u00020\\\u0012\b\b\u0002\u0010b\u001a\u00020\u0004\u0012\u0006\u0010d\u001a\u00020c\u0012\b\b\u0002\u0010e\u001a\u00020\u0002\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010f\u0012\b\b\u0002\u0010h\u001a\u00020\u0002\u0012\b\b\u0002\u0010i\u001a\u00020\u0004\u0012\b\b\u0003\u0010j\u001a\u00020\u0004\u0012\b\b\u0002\u0010-\u001a\u00020\u0017\u0012\b\b\u0002\u00100\u001a\u00020\u0017\u0012\b\b\u0002\u0010k\u001a\u00020\u0002\u0012\b\b\u0002\u0010l\u001a\u00020\u0002\u0012\b\b\u0002\u0010m\u001a\u00020\u0002\u0012\b\b\u0002\u0010n\u001a\u00020\u0002\u0012\b\b\u0002\u0010o\u001a\u00020\u0002\u0012\b\b\u0002\u0010p\u001a\u00020\u0002\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010q\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010q\u0012\b\b\u0002\u00105\u001a\u000201¢\u0006\u0004\bt\u0010uJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u0016\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0017J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 J\u000e\u0010%\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\u0002J\u000e\u0010(\u001a\u00020\"2\u0006\u0010'\u001a\u00020&J\u000f\u0010)\u001a\u00020\u0017H\u0000¢\u0006\u0004\b)\u0010*R\u0017\u0010-\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b,\u0010*R\u0017\u00100\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010*R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b3\u00104R\u0017\u00107\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b.\u0010*R \u0010>\u001a\u0002088\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R\u0017\u0010B\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010?\u001a\u0004\b@\u0010AR \u0010E\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b:\u0010?\u0012\u0004\bD\u0010=\u001a\u0004\bC\u0010AR \u0010I\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bF\u0010?\u0012\u0004\bH\u0010=\u001a\u0004\bG\u0010AR\u0014\u0010J\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010K\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010L\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010+R\u0016\u0010O\u001a\u0004\u0018\u00010M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010NR\u0014\u0010P\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010?R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010SR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010VR\u001b\u0010[\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\bF\u0010ZR\u0011\u0010_\u001a\u00020\\8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0011\u0010`\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b6\u0010A¨\u0006v"}, m28432d2 = {"Le26;", "", "", "line", "", "e", "lineIndex", "r", "s", "u", "j", "i", "q", "t", "n", "v", "m", "l", "vertical", "p", "horizontal", "w", "offset", "", "upstream", "y", "A", "o", "F", "x", "start", "end", "Landroid/graphics/Path;", "dest", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Landroid/graphics/RectF;", C17296a.f69688o, "Landroid/graphics/Canvas;", "canvas", "G", "E", "()Z", "Z", "f", "includePadding", "b", "c", "fallbackLineSpacing", "Lwm2;", "Lwm2;", "getLayoutIntrinsics", "()Lwm2;", "layoutIntrinsics", DateTokenConverter.CONVERTER_KEY, "didExceedMaxLines", "Landroid/text/Layout;", "Landroid/text/Layout;", "g", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "layout", "I", "k", "()I", "lineCount", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "topPadding", "h", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "bottomPadding", "leftPadding", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "lastLineExtra", "", "Lpr2;", "[Lpr2;", "lineHeightSpans", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "rect", "Lqm2;", "Lkotlin/Lazy;", "()Lqm2;", "layoutHelper", "", "D", "()Ljava/lang/CharSequence;", Entry.TYPE_TEXT, "height", "charSequence", "width", "Landroid/text/TextPaint;", "textPaint", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILwm2;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1035:1\n1#2:1036\n*E\n"})
/* renamed from: e26 */
/* loaded from: classes.dex */
public final class C40112e26 {

    /* renamed from: q */
    public static final C19951a f77599q = new C19951a(null);

    /* renamed from: r */
    public static final int f77600r = 8;

    /* renamed from: a */
    public final boolean f77601a;

    /* renamed from: b */
    public final boolean f77602b;

    /* renamed from: c */
    public final C51214wm2 f77603c;

    /* renamed from: d */
    public final boolean f77604d;

    /* renamed from: e */
    public final Layout f77605e;

    /* renamed from: f */
    public final int f77606f;

    /* renamed from: g */
    public final int f77607g;

    /* renamed from: h */
    public final int f77608h;

    /* renamed from: i */
    public final float f77609i;

    /* renamed from: j */
    public final float f77610j;

    /* renamed from: k */
    public final boolean f77611k;

    /* renamed from: l */
    public final Paint.FontMetricsInt f77612l;

    /* renamed from: m */
    public final int f77613m;

    /* renamed from: n */
    public final C47115pr2[] f77614n;

    /* renamed from: o */
    public final Rect f77615o;

    /* renamed from: p */
    public final Lazy f77616p;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Le26$a;", "", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: e26$a */
    /* loaded from: classes.dex */
    public static final class C19951a {
        public /* synthetic */ C19951a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C19951a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lqm2;", "b", "()Lqm2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: e26$b */
    /* loaded from: classes.dex */
    public static final class C19952b extends Lambda implements Function0<C47658qm2> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19952b() {
            super(0);
            C40112e26.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C47658qm2 invoke() {
            return new C47658qm2(C40112e26.this.m43340g());
        }
    }

    public C40112e26(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, C51214wm2 layoutIntrinsics) {
        boolean z3;
        boolean z4;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout m44299a;
        Pair m36885j;
        C47115pr2[] m36887h;
        Pair m36888g;
        Pair m36889f;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(layoutIntrinsics, "layoutIntrinsics");
        this.f77601a = z;
        this.f77602b = z2;
        this.f77603c = layoutIntrinsics;
        this.f77615o = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic m36886i = C41891h26.m36886i(i2);
        Layout.Alignment m13253a = C48986t06.f109682a.m13253a(i);
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, C3938JE.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics m6380a = layoutIntrinsics.m6380a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (m6380a != null && layoutIntrinsics.m6379b() <= f && !z5) {
                this.f77611k = true;
                z3 = true;
                m44299a = C26114mZ.f98333a.m25435a(charSequence, textPaint, ceil, m6380a, m13253a, z, z2, truncateAt, ceil);
                z4 = false;
                textDirectionHeuristic = m36886i;
            } else {
                z3 = true;
                this.f77611k = false;
                z4 = false;
                textDirectionHeuristic = m36886i;
                m44299a = C39743dQ5.f76579a.m44299a(charSequence, 0, charSequence.length(), textPaint, ceil, m36886i, m13253a, i3, truncateAt, (int) Math.ceil(d), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            }
            this.f77605e = m44299a;
            Trace.endSection();
            int min = Math.min(m44299a.getLineCount(), i3);
            this.f77606f = min;
            this.f77604d = (min >= i3 && (m44299a.getEllipsisCount(min + (-1)) > 0 || m44299a.getLineEnd(min + (-1)) != charSequence.length())) ? z3 : z4;
            m36885j = C41891h26.m36885j(this);
            m36887h = C41891h26.m36887h(this);
            this.f77614n = m36887h;
            m36888g = C41891h26.m36888g(this, m36887h);
            this.f77607g = Math.max(((Number) m36885j.getFirst()).intValue(), ((Number) m36888g.getFirst()).intValue());
            this.f77608h = Math.max(((Number) m36885j.getSecond()).intValue(), ((Number) m36888g.getSecond()).intValue());
            m36889f = C41891h26.m36889f(this, textPaint, textDirectionHeuristic, m36887h);
            this.f77612l = (Paint.FontMetricsInt) m36889f.getFirst();
            this.f77613m = ((Number) m36889f.getSecond()).intValue();
            this.f77609i = C45435n12.m24580b(m44299a, min - 1, null, 2, null);
            this.f77610j = C45435n12.m24578d(m44299a, min - 1, null, 2, null);
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C19952b());
            this.f77616p = lazy;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: B */
    public static /* synthetic */ float m43352B(C40112e26 c40112e26, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c40112e26.m43353A(i, z);
    }

    /* renamed from: z */
    public static /* synthetic */ float m43321z(C40112e26 c40112e26, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c40112e26.m43322y(i, z);
    }

    /* renamed from: A */
    public final float m43353A(int i, boolean z) {
        return m43339h().m17106c(i, false, z) + m43342e(m43332o(i));
    }

    /* renamed from: C */
    public final void m43351C(int i, int i2, Path dest) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f77605e.getSelectionPath(i, i2, dest);
        if (this.f77607g != 0 && !dest.isEmpty()) {
            dest.offset(0.0f, this.f77607g);
        }
    }

    /* renamed from: D */
    public final CharSequence m43350D() {
        CharSequence text = this.f77605e.getText();
        Intrinsics.checkNotNullExpressionValue(text, "layout.text");
        return text;
    }

    /* renamed from: E */
    public final boolean m43349E() {
        if (this.f77611k) {
            C26114mZ c26114mZ = C26114mZ.f98333a;
            Layout layout = this.f77605e;
            Intrinsics.checkNotNull(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return c26114mZ.m25434b((BoringLayout) layout);
        }
        C39743dQ5 c39743dQ5 = C39743dQ5.f76579a;
        Layout layout2 = this.f77605e;
        Intrinsics.checkNotNull(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return c39743dQ5.m44297c((StaticLayout) layout2, this.f77602b);
    }

    /* renamed from: F */
    public final boolean m43348F(int i) {
        return this.f77605e.isRtlCharAt(i);
    }

    /* renamed from: G */
    public final void m43347G(Canvas canvas) {
        L06 l06;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!canvas.getClipBounds(this.f77615o)) {
            return;
        }
        int i = this.f77607g;
        if (i != 0) {
            canvas.translate(0.0f, i);
        }
        l06 = C41891h26.f84642a;
        l06.m97936a(canvas);
        this.f77605e.draw(l06);
        int i2 = this.f77607g;
        if (i2 != 0) {
            canvas.translate(0.0f, (-1) * i2);
        }
    }

    /* renamed from: a */
    public final RectF m43346a(int i) {
        boolean z;
        float m43353A;
        float m43353A2;
        float m43322y;
        float m43322y2;
        int m43332o = m43332o(i);
        float m43326u = m43326u(m43332o);
        float m43337j = m43337j(m43332o);
        if (m43323x(m43332o) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = this.f77605e.isRtlCharAt(i);
        if (z && !isRtlCharAt) {
            m43353A = m43322y(i, false);
            m43353A2 = m43322y(i + 1, true);
        } else {
            if (z && isRtlCharAt) {
                m43322y = m43353A(i, false);
                m43322y2 = m43353A(i + 1, true);
            } else if (isRtlCharAt) {
                m43322y = m43322y(i, false);
                m43322y2 = m43322y(i + 1, true);
            } else {
                m43353A = m43353A(i, false);
                m43353A2 = m43353A(i + 1, true);
            }
            float f = m43322y;
            m43353A = m43322y2;
            m43353A2 = f;
        }
        return new RectF(m43353A, m43326u, m43353A2, m43337j);
    }

    /* renamed from: b */
    public final boolean m43345b() {
        return this.f77604d;
    }

    /* renamed from: c */
    public final boolean m43344c() {
        return this.f77602b;
    }

    /* renamed from: d */
    public final int m43343d() {
        int height;
        if (this.f77604d) {
            height = this.f77605e.getLineBottom(this.f77606f - 1);
        } else {
            height = this.f77605e.getHeight();
        }
        return height + this.f77607g + this.f77608h + this.f77613m;
    }

    /* renamed from: e */
    public final float m43342e(int i) {
        if (i == this.f77606f - 1) {
            return this.f77609i + this.f77610j;
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final boolean m43341f() {
        return this.f77601a;
    }

    /* renamed from: g */
    public final Layout m43340g() {
        return this.f77605e;
    }

    /* renamed from: h */
    public final C47658qm2 m43339h() {
        return (C47658qm2) this.f77616p.getValue();
    }

    /* renamed from: i */
    public final float m43338i(int i) {
        float lineBaseline;
        float f = this.f77607g;
        if (i == this.f77606f - 1 && this.f77612l != null) {
            lineBaseline = m43326u(i) - this.f77612l.ascent;
        } else {
            lineBaseline = this.f77605e.getLineBaseline(i);
        }
        return f + lineBaseline;
    }

    /* renamed from: j */
    public final float m43337j(int i) {
        int i2;
        if (i == this.f77606f - 1 && this.f77612l != null) {
            return this.f77605e.getLineBottom(i - 1) + this.f77612l.bottom;
        }
        float lineBottom = this.f77607g + this.f77605e.getLineBottom(i);
        if (i == this.f77606f - 1) {
            i2 = this.f77608h;
        } else {
            i2 = 0;
        }
        return lineBottom + i2;
    }

    /* renamed from: k */
    public final int m43336k() {
        return this.f77606f;
    }

    /* renamed from: l */
    public final int m43335l(int i) {
        return this.f77605e.getEllipsisCount(i);
    }

    /* renamed from: m */
    public final int m43334m(int i) {
        return this.f77605e.getEllipsisStart(i);
    }

    /* renamed from: n */
    public final int m43333n(int i) {
        if (this.f77605e.getEllipsisStart(i) == 0) {
            return this.f77605e.getLineEnd(i);
        }
        return this.f77605e.getText().length();
    }

    /* renamed from: o */
    public final int m43332o(int i) {
        return this.f77605e.getLineForOffset(i);
    }

    /* renamed from: p */
    public final int m43331p(int i) {
        return this.f77605e.getLineForVertical(this.f77607g + i);
    }

    /* renamed from: q */
    public final float m43330q(int i) {
        return m43337j(i) - m43326u(i);
    }

    /* renamed from: r */
    public final float m43329r(int i) {
        float f;
        float lineLeft = this.f77605e.getLineLeft(i);
        if (i == this.f77606f - 1) {
            f = this.f77609i;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    /* renamed from: s */
    public final float m43328s(int i) {
        float f;
        float lineRight = this.f77605e.getLineRight(i);
        if (i == this.f77606f - 1) {
            f = this.f77610j;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    /* renamed from: t */
    public final int m43327t(int i) {
        return this.f77605e.getLineStart(i);
    }

    /* renamed from: u */
    public final float m43326u(int i) {
        int i2;
        float lineTop = this.f77605e.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.f77607g;
        }
        return lineTop + i2;
    }

    /* renamed from: v */
    public final int m43325v(int i) {
        if (this.f77605e.getEllipsisStart(i) == 0) {
            return this.f77605e.getLineVisibleEnd(i);
        }
        return this.f77605e.getEllipsisStart(i) + this.f77605e.getLineStart(i);
    }

    /* renamed from: w */
    public final int m43324w(int i, float f) {
        return this.f77605e.getOffsetForHorizontal(i, f + ((-1) * m43342e(i)));
    }

    /* renamed from: x */
    public final int m43323x(int i) {
        return this.f77605e.getParagraphDirection(i);
    }

    /* renamed from: y */
    public final float m43322y(int i, boolean z) {
        return m43339h().m17106c(i, true, z) + m43342e(m43332o(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C40112e26(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, C51214wm2 c51214wm2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, r5, textPaint, r7, r8, r9, (i9 & 64) != 0 ? 1.0f : f2, (i9 & 128) != 0 ? 0.0f : f3, (i9 & 256) != 0 ? false : z, (i9 & 512) != 0 ? true : z2, (i9 & 1024) != 0 ? Integer.MAX_VALUE : i3, (i9 & 2048) != 0 ? 0 : i4, (i9 & 4096) != 0 ? 0 : i5, (i9 & 8192) != 0 ? 0 : i6, (i9 & 16384) != 0 ? 0 : i7, (32768 & i9) != 0 ? 0 : i8, (65536 & i9) != 0 ? null : iArr, (131072 & i9) != 0 ? null : iArr2, (i9 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? new C51214wm2(charSequence, textPaint, r9) : c51214wm2);
        float f4 = (i9 & 2) != 0 ? 0.0f : f;
        int i10 = (i9 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i9 & 16) != 0 ? null : truncateAt;
        int i11 = (i9 & 32) != 0 ? 2 : i2;
    }
}
