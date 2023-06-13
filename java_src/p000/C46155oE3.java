package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import p000.InterfaceC41563gV2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010*\u001a\u00020#\u0012\u0006\u00101\u001a\u00020\u001f\u0012\b\b\u0002\u00109\u001a\u000202\u0012\b\b\u0002\u0010A\u001a\u00020:\u0012\b\b\u0002\u0010I\u001a\u00020B\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010J¢\u0006\u0004\bT\u0010UJ)\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0011\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001d\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f*\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u001f*\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010Q\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006V"}, m28432d2 = {"LoE3;", "LDm2;", "LgV2$c;", "LE61;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "LZ62;", "LX62;", "", "height", "c", "i", "width", "e", DateTokenConverter.CONVERTER_KEY, "LiA0;", "", "y", "", "toString", "LxB5;", "dstSize", "e0", "(J)J", "k0", "", "j0", "(J)Z", "i0", "LnE3;", "l", "LnE3;", "f0", "()LnE3;", "p0", "(LnE3;)V", "painter", "m", "Z", "g0", "()Z", "q0", "(Z)V", "sizeToIntrinsics", "LK9;", "n", "LK9;", "getAlignment", "()LK9;", "l0", "(LK9;)V", "alignment", "LBA0;", "o", "LBA0;", "getContentScale", "()LBA0;", "o0", "(LBA0;)V", "contentScale", "", "p", "F", "getAlpha", "()F", "m0", "(F)V", "alpha", "Lsm0;", "q", "Lsm0;", "getColorFilter", "()Lsm0;", "n0", "(Lsm0;)V", "colorFilter", "h0", "useIntrinsicSize", "<init>", "(LnE3;ZLK9;LBA0;FLsm0;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterModifierNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,366:1\n152#2:367\n120#3,4:368\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterModifierNode\n*L\n170#1:367\n345#1:368,4\n*E\n"})
/* renamed from: oE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46155oE3 extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC32425Dm2, E61 {

    /* renamed from: l */
    public AbstractC45562nE3 f101661l;

    /* renamed from: m */
    public boolean f101662m;

    /* renamed from: n */
    public InterfaceC4360K9 f101663n;

    /* renamed from: o */
    public BA0 f101664o;

    /* renamed from: p */
    public float f101665p;

    /* renamed from: q */
    public C48841sm0 f101666q;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oE3$a */
    /* loaded from: classes.dex */
    public static final class C26873a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3 f101667g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26873a(OU3 ou3) {
            super(1);
            this.f101667g = ou3;
        }

        /* renamed from: a */
        public final void m21510a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            OU3.AbstractC6015a.m92205r(layout, this.f101667g, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m21510a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    public C46155oE3(AbstractC45562nE3 painter, boolean z, InterfaceC4360K9 alignment, BA0 contentScale, float f, C48841sm0 c48841sm0) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        this.f101661l = painter;
        this.f101662m = z;
        this.f101663n = alignment;
        this.f101664o = contentScale;
        this.f101665p = f;
        this.f101666q = c48841sm0;
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: c */
    public int mo21528c(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (m21521h0()) {
            long m21517k0 = m21517k0(C46007nz0.m22042b(0, 0, 0, i, 7, null));
            return Math.max(C44228kz0.m28061p(m21517k0), measurable.mo77399p0(i));
        }
        return measurable.mo77399p0(i);
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: d */
    public int mo21527d(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (m21521h0()) {
            long m21517k0 = m21517k0(C46007nz0.m22042b(0, i, 0, 0, 13, null));
            return Math.max(C44228kz0.m28062o(m21517k0), measurable.mo77402B(i));
        }
        return measurable.mo77402B(i);
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: e */
    public int mo21526e(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (m21521h0()) {
            long m21517k0 = m21517k0(C46007nz0.m22042b(0, i, 0, 0, 13, null));
            return Math.max(C44228kz0.m28062o(m21517k0), measurable.mo77400g0(i));
        }
        return measurable.mo77400g0(i);
    }

    /* renamed from: e0 */
    public final long m21525e0(long j) {
        float m5730i;
        float m5732g;
        boolean z;
        if (m21521h0()) {
            if (!m21518j0(this.f101661l.mo116236getIntrinsicSizeNHjbRc())) {
                m5730i = C51465xB5.m5730i(j);
            } else {
                m5730i = C51465xB5.m5730i(this.f101661l.mo116236getIntrinsicSizeNHjbRc());
            }
            if (!m21519i0(this.f101661l.mo116236getIntrinsicSizeNHjbRc())) {
                m5732g = C51465xB5.m5732g(j);
            } else {
                m5732g = C51465xB5.m5732g(this.f101661l.mo116236getIntrinsicSizeNHjbRc());
            }
            long m112663a = CB5.m112663a(m5730i, m5732g);
            boolean z2 = true;
            if (C51465xB5.m5730i(j) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (C51465xB5.m5732g(j) != 0.0f) {
                    z2 = false;
                }
                if (!z2) {
                    return C38126aj5.m70822b(m112663a, this.f101664o.mo37464a(m112663a, j));
                }
            }
            return C51465xB5.f117175b.m5723b();
        }
        return j;
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo21524f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        OU3 mo8763P0 = measurable.mo8763P0(m21517k0(j));
        return InterfaceC52765zO2.m1430Y(measure, mo8763P0.m92226i1(), mo8763P0.m92229d1(), null, new C26873a(mo8763P0), 4, null);
    }

    /* renamed from: f0 */
    public final AbstractC45562nE3 m21523f0() {
        return this.f101661l;
    }

    /* renamed from: g0 */
    public final boolean m21522g0() {
        return this.f101662m;
    }

    /* renamed from: h0 */
    public final boolean m21521h0() {
        boolean z;
        if (!this.f101662m) {
            return false;
        }
        if (this.f101661l.mo116236getIntrinsicSizeNHjbRc() != C51465xB5.f117175b.m5724a()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: i */
    public int mo21520i(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (m21521h0()) {
            long m21517k0 = m21517k0(C46007nz0.m22042b(0, 0, 0, i, 7, null));
            return Math.max(C44228kz0.m28061p(m21517k0), measurable.mo77398t0(i));
        }
        return measurable.mo77398t0(i);
    }

    /* renamed from: i0 */
    public final boolean m21519i0(long j) {
        if (C51465xB5.m5733f(j, C51465xB5.f117175b.m5724a())) {
            return false;
        }
        float m5732g = C51465xB5.m5732g(j);
        return !Float.isInfinite(m5732g) && !Float.isNaN(m5732g);
    }

    /* renamed from: j0 */
    public final boolean m21518j0(long j) {
        if (C51465xB5.m5733f(j, C51465xB5.f117175b.m5724a())) {
            return false;
        }
        float m5730i = C51465xB5.m5730i(j);
        return !Float.isInfinite(m5730i) && !Float.isNaN(m5730i);
    }

    /* renamed from: k0 */
    public final long m21517k0(long j) {
        boolean z;
        int m28061p;
        int m28062o;
        int roundToInt;
        int roundToInt2;
        boolean z2 = true;
        if (C44228kz0.m28067j(j) && C44228kz0.m28068i(j)) {
            z = true;
        } else {
            z = false;
        }
        if (!C44228kz0.m28065l(j) || !C44228kz0.m28066k(j)) {
            z2 = false;
        }
        if ((!m21521h0() && z) || z2) {
            return C44228kz0.m28072e(j, C44228kz0.m28063n(j), 0, C44228kz0.m28064m(j), 0, 10, null);
        }
        long mo116236getIntrinsicSizeNHjbRc = this.f101661l.mo116236getIntrinsicSizeNHjbRc();
        if (m21518j0(mo116236getIntrinsicSizeNHjbRc)) {
            m28061p = MathKt__MathJVMKt.roundToInt(C51465xB5.m5730i(mo116236getIntrinsicSizeNHjbRc));
        } else {
            m28061p = C44228kz0.m28061p(j);
        }
        if (m21519i0(mo116236getIntrinsicSizeNHjbRc)) {
            m28062o = MathKt__MathJVMKt.roundToInt(C51465xB5.m5732g(mo116236getIntrinsicSizeNHjbRc));
        } else {
            m28062o = C44228kz0.m28062o(j);
        }
        long m21525e0 = m21525e0(CB5.m112663a(C46007nz0.m22037g(j, m28061p), C46007nz0.m22038f(j, m28062o)));
        roundToInt = MathKt__MathJVMKt.roundToInt(C51465xB5.m5730i(m21525e0));
        int m22037g = C46007nz0.m22037g(j, roundToInt);
        roundToInt2 = MathKt__MathJVMKt.roundToInt(C51465xB5.m5732g(m21525e0));
        return C44228kz0.m28072e(j, m22037g, 0, C46007nz0.m22038f(j, roundToInt2), 0, 10, null);
    }

    /* renamed from: l0 */
    public final void m21516l0(InterfaceC4360K9 interfaceC4360K9) {
        Intrinsics.checkNotNullParameter(interfaceC4360K9, "<set-?>");
        this.f101663n = interfaceC4360K9;
    }

    /* renamed from: m0 */
    public final void m21515m0(float f) {
        this.f101665p = f;
    }

    /* renamed from: n0 */
    public final void m21514n0(C48841sm0 c48841sm0) {
        this.f101666q = c48841sm0;
    }

    /* renamed from: o0 */
    public final void m21513o0(BA0 ba0) {
        Intrinsics.checkNotNullParameter(ba0, "<set-?>");
        this.f101664o = ba0;
    }

    /* renamed from: p0 */
    public final void m21512p0(AbstractC45562nE3 abstractC45562nE3) {
        Intrinsics.checkNotNullParameter(abstractC45562nE3, "<set-?>");
        this.f101661l = abstractC45562nE3;
    }

    /* renamed from: q0 */
    public final void m21511q0(boolean z) {
        this.f101662m = z;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f101661l + ", sizeToIntrinsics=" + this.f101662m + ", alignment=" + this.f101663n + ", alpha=" + this.f101665p + ", colorFilter=" + this.f101666q + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.E61
    /* renamed from: y */
    public void mo4144y(InterfaceC42558iA0 interfaceC42558iA0) {
        float m5730i;
        float m5732g;
        boolean z;
        long m5723b;
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        Intrinsics.checkNotNullParameter(interfaceC42558iA0, "<this>");
        long mo116236getIntrinsicSizeNHjbRc = this.f101661l.mo116236getIntrinsicSizeNHjbRc();
        if (m21518j0(mo116236getIntrinsicSizeNHjbRc)) {
            m5730i = C51465xB5.m5730i(mo116236getIntrinsicSizeNHjbRc);
        } else {
            m5730i = C51465xB5.m5730i(interfaceC42558iA0.mo96360h());
        }
        if (m21519i0(mo116236getIntrinsicSizeNHjbRc)) {
            m5732g = C51465xB5.m5732g(mo116236getIntrinsicSizeNHjbRc);
        } else {
            m5732g = C51465xB5.m5732g(interfaceC42558iA0.mo96360h());
        }
        long m112663a = CB5.m112663a(m5730i, m5732g);
        boolean z2 = true;
        if (C51465xB5.m5730i(interfaceC42558iA0.mo96360h()) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (C51465xB5.m5732g(interfaceC42558iA0.mo96360h()) != 0.0f) {
                z2 = false;
            }
            if (!z2) {
                m5723b = C38126aj5.m70822b(m112663a, this.f101664o.mo37464a(m112663a, interfaceC42558iA0.mo96360h()));
                long j = m5723b;
                InterfaceC4360K9 interfaceC4360K9 = this.f101663n;
                roundToInt = MathKt__MathJVMKt.roundToInt(C51465xB5.m5730i(j));
                roundToInt2 = MathKt__MathJVMKt.roundToInt(C51465xB5.m5732g(j));
                long m104430a = H52.m104430a(roundToInt, roundToInt2);
                roundToInt3 = MathKt__MathJVMKt.roundToInt(C51465xB5.m5730i(interfaceC42558iA0.mo96360h()));
                roundToInt4 = MathKt__MathJVMKt.roundToInt(C51465xB5.m5732g(interfaceC42558iA0.mo96360h()));
                long mo99146a = interfaceC4360K9.mo99146a(m104430a, H52.m104430a(roundToInt3, roundToInt4), interfaceC42558iA0.getLayoutDirection());
                float m116111j = A52.m116111j(mo99146a);
                float m116110k = A52.m116110k(mo99146a);
                interfaceC42558iA0.mo20750d0().mo20722c().mo19027b(m116111j, m116110k);
                this.f101661l.m118306drawx_KDEd0(interfaceC42558iA0, j, this.f101665p, this.f101666q);
                interfaceC42558iA0.mo20750d0().mo20722c().mo19027b(-m116111j, -m116110k);
                interfaceC42558iA0.mo34387n0();
            }
        }
        m5723b = C51465xB5.f117175b.m5723b();
        long j2 = m5723b;
        InterfaceC4360K9 interfaceC4360K92 = this.f101663n;
        roundToInt = MathKt__MathJVMKt.roundToInt(C51465xB5.m5730i(j2));
        roundToInt2 = MathKt__MathJVMKt.roundToInt(C51465xB5.m5732g(j2));
        long m104430a2 = H52.m104430a(roundToInt, roundToInt2);
        roundToInt3 = MathKt__MathJVMKt.roundToInt(C51465xB5.m5730i(interfaceC42558iA0.mo96360h()));
        roundToInt4 = MathKt__MathJVMKt.roundToInt(C51465xB5.m5732g(interfaceC42558iA0.mo96360h()));
        long mo99146a2 = interfaceC4360K92.mo99146a(m104430a2, H52.m104430a(roundToInt3, roundToInt4), interfaceC42558iA0.getLayoutDirection());
        float m116111j2 = A52.m116111j(mo99146a2);
        float m116110k2 = A52.m116110k(mo99146a2);
        interfaceC42558iA0.mo20750d0().mo20722c().mo19027b(m116111j2, m116110k2);
        this.f101661l.m118306drawx_KDEd0(interfaceC42558iA0, j2, this.f101665p, this.f101666q);
        interfaceC42558iA0.mo20750d0().mo20722c().mo19027b(-m116111j2, -m116110k2);
        interfaceC42558iA0.mo34387n0();
    }
}
