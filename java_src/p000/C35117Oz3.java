package p000;

import android.graphics.Outline;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import p000.AbstractC34649Mz3;
import p000.C51465xB5;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\bS\u0010TJ6\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012J\u001b\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0002J3\u0010&\u001a\u00020\u0006*\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001f\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0018\u00104\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00103R\u0018\u00105\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00103R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0018\u00108\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00103R\u0018\u0010:\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00109R\u0016\u0010<\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010;R\u001f\u0010>\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b=\u00101R\u001f\u0010@\u001a\u00020\u00168\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b?\u00101R\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010*R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00103R\u0018\u0010H\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00103R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0013\u0010N\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010MR\u0011\u0010P\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b0\u0010OR\u0013\u0010R\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b)\u0010Q\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006U"}, m28432d2 = {"LOz3;", "", "Lhy5;", "shape", "", "alpha", "", "clipToOutline", "elevation", "Lpm2;", "layoutDirection", "Lg01;", "density", "g", "LCe3;", "position", "e", "(J)Z", "Lme0;", "canvas", "", C17296a.f69688o, "LxB5;", "size", "h", "(J)V", "i", "LOs4;", "rect", "k", "LWb5;", "roundRect", "l", "LcJ3;", "composePath", "j", "offset", "radius", "f", "(LWb5;JJF)Z", "Lg01;", "b", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", "c", "Landroid/graphics/Outline;", "cachedOutline", DateTokenConverter.CONVERTER_KEY, "J", "Lhy5;", "LcJ3;", "cachedRrectPath", "outlinePath", "cacheIsDirty", "usePathForClip", "tmpPath", "LWb5;", "tmpRoundRect", "F", "roundedCornerRadius", "m", "rectTopLeft", "n", "rectSize", "o", "outlineNeeded", "p", "Lpm2;", "q", "tmpTouchPointPath", "r", "tmpOpPath", "LMz3;", "s", "LMz3;", "calculatedOutline", "()Landroid/graphics/Outline;", "outline", "()Z", "outlineClipSupported", "()LcJ3;", "clipPath", "<init>", "(Lg01;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,356:1\n1#2:357\n35#3,5:358\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n330#1:358,5\n*E\n"})
/* renamed from: Oz3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35117Oz3 {

    /* renamed from: a */
    public InterfaceC41273g01 f27636a;

    /* renamed from: b */
    public boolean f27637b;

    /* renamed from: c */
    public final Outline f27638c;

    /* renamed from: d */
    public long f27639d;

    /* renamed from: e */
    public InterfaceC42444hy5 f27640e;

    /* renamed from: f */
    public InterfaceC39067cJ3 f27641f;

    /* renamed from: g */
    public InterfaceC39067cJ3 f27642g;

    /* renamed from: h */
    public boolean f27643h;

    /* renamed from: i */
    public boolean f27644i;

    /* renamed from: j */
    public InterfaceC39067cJ3 f27645j;

    /* renamed from: k */
    public C36775Wb5 f27646k;

    /* renamed from: l */
    public float f27647l;

    /* renamed from: m */
    public long f27648m;

    /* renamed from: n */
    public long f27649n;

    /* renamed from: o */
    public boolean f27650o;

    /* renamed from: p */
    public EnumC47065pm2 f27651p;

    /* renamed from: q */
    public InterfaceC39067cJ3 f27652q;

    /* renamed from: r */
    public InterfaceC39067cJ3 f27653r;

    /* renamed from: s */
    public AbstractC34649Mz3 f27654s;

    public C35117Oz3(InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f27636a = density;
        this.f27637b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f27638c = outline;
        C51465xB5.C30059a c30059a = C51465xB5.f117175b;
        this.f27639d = c30059a.m5723b();
        this.f27640e = C37629Zs4.m72365a();
        this.f27648m = C32120Ce3.f4427b.m111932c();
        this.f27649n = c30059a.m5723b();
        this.f27651p = EnumC47065pm2.Ltr;
    }

    /* renamed from: a */
    public final void m91131a(InterfaceC45204me0 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        InterfaceC39067cJ3 m91130b = m91130b();
        if (m91130b != null) {
            InterfaceC45204me0.m25261f(canvas, m91130b, 0, 2, null);
            return;
        }
        float f = this.f27647l;
        if (f > 0.0f) {
            InterfaceC39067cJ3 interfaceC39067cJ3 = this.f27645j;
            C36775Wb5 c36775Wb5 = this.f27646k;
            if (interfaceC39067cJ3 == null || !m91126f(c36775Wb5, this.f27648m, this.f27649n, f)) {
                C36775Wb5 m72900c = C37477Zb5.m72900c(C32120Ce3.m111944o(this.f27648m), C32120Ce3.m111943p(this.f27648m), C32120Ce3.m111944o(this.f27648m) + C51465xB5.m5730i(this.f27649n), C32120Ce3.m111943p(this.f27648m) + C51465xB5.m5732g(this.f27649n), MC0.m95598b(this.f27647l, 0.0f, 2, null));
                if (interfaceC39067cJ3 == null) {
                    interfaceC39067cJ3 = C28793td.m12007a();
                } else {
                    interfaceC39067cJ3.reset();
                }
                interfaceC39067cJ3.mo20784g(m72900c);
                this.f27646k = m72900c;
                this.f27645j = interfaceC39067cJ3;
            }
            InterfaceC45204me0.m25261f(canvas, interfaceC39067cJ3, 0, 2, null);
            return;
        }
        InterfaceC45204me0.m25253n(canvas, C32120Ce3.m111944o(this.f27648m), C32120Ce3.m111943p(this.f27648m), C32120Ce3.m111944o(this.f27648m) + C51465xB5.m5730i(this.f27649n), C32120Ce3.m111943p(this.f27648m) + C51465xB5.m5732g(this.f27649n), 0, 16, null);
    }

    /* renamed from: b */
    public final InterfaceC39067cJ3 m91130b() {
        m91123i();
        return this.f27642g;
    }

    /* renamed from: c */
    public final Outline m91129c() {
        m91123i();
        if (this.f27650o && this.f27637b) {
            return this.f27638c;
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m91128d() {
        return !this.f27644i;
    }

    /* renamed from: e */
    public final boolean m91127e(long j) {
        AbstractC34649Mz3 abstractC34649Mz3;
        if (!this.f27650o || (abstractC34649Mz3 = this.f27654s) == null) {
            return true;
        }
        return C44223ky5.m28082b(abstractC34649Mz3, C32120Ce3.m111944o(j), C32120Ce3.m111943p(j), this.f27652q, this.f27653r);
    }

    /* renamed from: f */
    public final boolean m91126f(C36775Wb5 c36775Wb5, long j, long j2, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (c36775Wb5 == null || !C37477Zb5.m72899d(c36775Wb5)) {
            return false;
        }
        if (c36775Wb5.m78155e() == C32120Ce3.m111944o(j)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (c36775Wb5.m78153g() == C32120Ce3.m111943p(j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (c36775Wb5.m78154f() == C32120Ce3.m111944o(j) + C51465xB5.m5730i(j2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (c36775Wb5.m78159a() == C32120Ce3.m111943p(j) + C51465xB5.m5732g(j2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (LC0.m97601d(c36775Wb5.m78152h()) == f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m91125g(InterfaceC42444hy5 shape, float f, boolean z, float f2, EnumC47065pm2 layoutDirection, InterfaceC41273g01 density) {
        boolean z2;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f27638c.setAlpha(f);
        boolean z3 = !Intrinsics.areEqual(this.f27640e, shape);
        if (z3) {
            this.f27640e = shape;
            this.f27643h = true;
        }
        if (!z && f2 <= 0.0f) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f27650o != z2) {
            this.f27650o = z2;
            this.f27643h = true;
        }
        if (this.f27651p != layoutDirection) {
            this.f27651p = layoutDirection;
            this.f27643h = true;
        }
        if (!Intrinsics.areEqual(this.f27636a, density)) {
            this.f27636a = density;
            this.f27643h = true;
        }
        return z3;
    }

    /* renamed from: h */
    public final void m91124h(long j) {
        if (!C51465xB5.m5733f(this.f27639d, j)) {
            this.f27639d = j;
            this.f27643h = true;
        }
    }

    /* renamed from: i */
    public final void m91123i() {
        if (this.f27643h) {
            this.f27648m = C32120Ce3.f4427b.m111932c();
            long j = this.f27639d;
            this.f27649n = j;
            this.f27647l = 0.0f;
            this.f27642g = null;
            this.f27643h = false;
            this.f27644i = false;
            if (this.f27650o && C51465xB5.m5730i(j) > 0.0f && C51465xB5.m5732g(this.f27639d) > 0.0f) {
                this.f27637b = true;
                AbstractC34649Mz3 mo35430a = this.f27640e.mo35430a(this.f27639d, this.f27651p, this.f27636a);
                this.f27654s = mo35430a;
                if (mo35430a instanceof AbstractC34649Mz3.C5446b) {
                    m91121k(((AbstractC34649Mz3.C5446b) mo35430a).m94527a());
                    return;
                } else if (mo35430a instanceof AbstractC34649Mz3.C5447c) {
                    m91120l(((AbstractC34649Mz3.C5447c) mo35430a).m94526a());
                    return;
                } else if (mo35430a instanceof AbstractC34649Mz3.C5445a) {
                    m91122j(((AbstractC34649Mz3.C5445a) mo35430a).m94528a());
                    return;
                } else {
                    return;
                }
            }
            this.f27638c.setEmpty();
        }
    }

    /* renamed from: j */
    public final void m91122j(InterfaceC39067cJ3 interfaceC39067cJ3) {
        if (Build.VERSION.SDK_INT <= 28 && !interfaceC39067cJ3.mo20779l()) {
            this.f27637b = false;
            this.f27638c.setEmpty();
            this.f27644i = true;
        } else {
            Outline outline = this.f27638c;
            if (interfaceC39067cJ3 instanceof C27014od) {
                outline.setConvexPath(((C27014od) interfaceC39067cJ3).m20773r());
                this.f27644i = !this.f27638c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        this.f27642g = interfaceC39067cJ3;
    }

    /* renamed from: k */
    public final void m91121k(C35055Os4 c35055Os4) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        this.f27648m = C33056Ge3.m104938a(c35055Os4.m91258i(), c35055Os4.m91255l());
        this.f27649n = CB5.m112663a(c35055Os4.m91252o(), c35055Os4.m91259h());
        Outline outline = this.f27638c;
        roundToInt = MathKt__MathJVMKt.roundToInt(c35055Os4.m91258i());
        roundToInt2 = MathKt__MathJVMKt.roundToInt(c35055Os4.m91255l());
        roundToInt3 = MathKt__MathJVMKt.roundToInt(c35055Os4.m91257j());
        roundToInt4 = MathKt__MathJVMKt.roundToInt(c35055Os4.m91262e());
        outline.setRect(roundToInt, roundToInt2, roundToInt3, roundToInt4);
    }

    /* renamed from: l */
    public final void m91120l(C36775Wb5 c36775Wb5) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        float m97601d = LC0.m97601d(c36775Wb5.m78152h());
        this.f27648m = C33056Ge3.m104938a(c36775Wb5.m78155e(), c36775Wb5.m78153g());
        this.f27649n = CB5.m112663a(c36775Wb5.m78150j(), c36775Wb5.m78156d());
        if (C37477Zb5.m72899d(c36775Wb5)) {
            Outline outline = this.f27638c;
            roundToInt = MathKt__MathJVMKt.roundToInt(c36775Wb5.m78155e());
            roundToInt2 = MathKt__MathJVMKt.roundToInt(c36775Wb5.m78153g());
            roundToInt3 = MathKt__MathJVMKt.roundToInt(c36775Wb5.m78154f());
            roundToInt4 = MathKt__MathJVMKt.roundToInt(c36775Wb5.m78159a());
            outline.setRoundRect(roundToInt, roundToInt2, roundToInt3, roundToInt4, m97601d);
            this.f27647l = m97601d;
            return;
        }
        InterfaceC39067cJ3 interfaceC39067cJ3 = this.f27641f;
        if (interfaceC39067cJ3 == null) {
            interfaceC39067cJ3 = C28793td.m12007a();
            this.f27641f = interfaceC39067cJ3;
        }
        interfaceC39067cJ3.reset();
        interfaceC39067cJ3.mo20784g(c36775Wb5);
        m91122j(interfaceC39067cJ3);
    }
}
