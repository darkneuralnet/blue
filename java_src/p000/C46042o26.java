package p000;

import android.graphics.Typeface;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.C44263l26;
import p000.C47063pm0;
import p000.O26;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aS\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000\u001a9\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0016\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000\u001a\f\u0010\u001b\u001a\u00020\f*\u00020\u0001H\u0000\u001a\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m28432d2 = {"LQd;", "LGN5;", "style", "Lkotlin/Function4;", "Lkw1;", "LJw1;", "LEw1;", "LFw1;", "Landroid/graphics/Typeface;", "resolveTypeface", "Lg01;", "density", "", "requiresLetterSpacing", C17296a.f69688o, "LM26;", "letterSpacing", "Lpm0;", "background", "LHE;", "baselineShift", "c", "(JZJLHE;)LGN5;", "Ll26;", "textMotion", "", "e", DateTokenConverter.CONVERTER_KEY, "", "blurRadius", "b", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: o26  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46042o26 {
    /* renamed from: a */
    public static final GN5 m21958a(C6816Qd c6816Qd, GN5 style, Function4<? super AbstractC44199kw1, ? super C33918Jw1, ? super C32748Ew1, ? super C32982Fw1, ? extends Typeface> resolveTypeface, InterfaceC41273g01 density, boolean z) {
        boolean z2;
        int m108201b;
        int m106232a;
        Intrinsics.checkNotNullParameter(c6816Qd, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        Intrinsics.checkNotNullParameter(density, "density");
        long m95973g = M26.m95973g(style.m105164k());
        O26.C5817a c5817a = O26.f25571b;
        if (O26.m92975g(m95973g, c5817a.m92970b())) {
            c6816Qd.setTextSize(density.mo3415I0(style.m105164k()));
        } else if (O26.m92975g(m95973g, c5817a.m92971a())) {
            c6816Qd.setTextSize(c6816Qd.getTextSize() * M26.m95972h(style.m105164k()));
        }
        if (m21955d(style)) {
            AbstractC44199kw1 m105166i = style.m105166i();
            C33918Jw1 m105161n = style.m105161n();
            if (m105161n == null) {
                m105161n = C33918Jw1.f18784c.m99540d();
            }
            C32748Ew1 m105163l = style.m105163l();
            if (m105163l != null) {
                m108201b = m105163l.m108203i();
            } else {
                m108201b = C32748Ew1.f8309b.m108201b();
            }
            C32748Ew1 m108209c = C32748Ew1.m108209c(m108201b);
            C32982Fw1 m105162m = style.m105162m();
            if (m105162m != null) {
                m106232a = m105162m.m106233m();
            } else {
                m106232a = C32982Fw1.f10526b.m106232a();
            }
            c6816Qd.setTypeface(resolveTypeface.invoke(m105166i, m105161n, m108209c, C32982Fw1.m106241e(m106232a)));
        }
        if (style.m105159p() != null && !Intrinsics.areEqual(style.m105159p(), C50119uv2.f113196d.m9492a())) {
            C51304wv2.f116826a.m6102b(c6816Qd, style.m105159p());
        }
        if (style.m105165j() != null && !Intrinsics.areEqual(style.m105165j(), "")) {
            c6816Qd.setFontFeatureSettings(style.m105165j());
        }
        if (style.m105154u() != null && !Intrinsics.areEqual(style.m105154u(), L16.f20613c.m97918a())) {
            c6816Qd.setTextScaleX(c6816Qd.getTextScaleX() * style.m105154u().m97920b());
            c6816Qd.setTextSkewX(c6816Qd.getTextSkewX() + style.m105154u().m97919c());
        }
        c6816Qd.m88310d(style.m105168g());
        c6816Qd.m88311c(style.m105169f(), C51465xB5.f117175b.m5724a(), style.m105172c());
        c6816Qd.m88308f(style.m105157r());
        c6816Qd.m88307g(style.m105156s());
        c6816Qd.m88309e(style.m105167h());
        if (O26.m92975g(M26.m95973g(style.m105160o()), c5817a.m92970b())) {
            boolean z3 = true;
            if (M26.m95972h(style.m105160o()) == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                float textSize = c6816Qd.getTextSize() * c6816Qd.getTextScaleX();
                float mo3415I0 = density.mo3415I0(style.m105160o());
                if (textSize != 0.0f) {
                    z3 = false;
                }
                if (!z3) {
                    c6816Qd.setLetterSpacing(mo3415I0 / textSize);
                }
                return m21956c(style.m105160o(), z, style.m105171d(), style.m105170e());
            }
        }
        if (O26.m92975g(M26.m95973g(style.m105160o()), c5817a.m92971a())) {
            c6816Qd.setLetterSpacing(M26.m95972h(style.m105160o()));
        }
        return m21956c(style.m105160o(), z, style.m105171d(), style.m105170e());
    }

    /* renamed from: b */
    public static final float m21957b(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (p000.C3091HE.m104158e(r35.m104155h(), p000.C3091HE.f13105b.m104154a()) == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final GN5 m21956c(long j, boolean z, long j2, C3091HE c3091he) {
        boolean z2;
        C47063pm0.C27386a c27386a;
        boolean z3;
        long m95968a;
        C3091HE c3091he2;
        boolean z4;
        long j3 = j2;
        boolean z5 = true;
        if (z && O26.m92975g(M26.m95973g(j), O26.f25571b.m92970b())) {
            if (M26.m95972h(j) == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                z2 = true;
                c27386a = C47063pm0.f104050b;
                if (C47063pm0.m18741o(j3, c27386a.m18726g()) && !C47063pm0.m18741o(j3, c27386a.m18727f())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c3091he != null) {
                }
                z5 = false;
                if (z2 && !z3 && !z5) {
                    return null;
                }
                if (!z2) {
                    m95968a = j;
                } else {
                    m95968a = M26.f22473b.m95968a();
                }
                if (!z3) {
                    j3 = c27386a.m18726g();
                }
                long j4 = j3;
                if (!z5) {
                    c3091he2 = c3091he;
                } else {
                    c3091he2 = null;
                }
                return new GN5(0L, 0L, (C33918Jw1) null, (C32748Ew1) null, (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, m95968a, c3091he2, (L16) null, (C50119uv2) null, j4, (R06) null, (C35335Px5) null, 13951, (DefaultConstructorMarker) null);
            }
        }
        z2 = false;
        c27386a = C47063pm0.f104050b;
        if (C47063pm0.m18741o(j3, c27386a.m18726g())) {
        }
        z3 = false;
        if (c3091he != null) {
        }
        z5 = false;
        if (z2) {
        }
        if (!z2) {
        }
        if (!z3) {
        }
        long j42 = j3;
        if (!z5) {
        }
        return new GN5(0L, 0L, (C33918Jw1) null, (C32748Ew1) null, (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, m95968a, c3091he2, (L16) null, (C50119uv2) null, j42, (R06) null, (C35335Px5) null, 13951, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static final boolean m21955d(GN5 gn5) {
        Intrinsics.checkNotNullParameter(gn5, "<this>");
        if (gn5.m105166i() == null && gn5.m105163l() == null && gn5.m105161n() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final void m21954e(C6816Qd c6816Qd, C44263l26 c44263l26) {
        int flags;
        Intrinsics.checkNotNullParameter(c6816Qd, "<this>");
        if (c44263l26 == null) {
            c44263l26 = C44263l26.f95382c.m28005a();
        }
        if (c44263l26.m28006c()) {
            flags = c6816Qd.getFlags() | 128;
        } else {
            flags = c6816Qd.getFlags() & (-129);
        }
        c6816Qd.setFlags(flags);
        int m28007b = c44263l26.m28007b();
        C44263l26.C25590b.C25591a c25591a = C44263l26.C25590b.f95387a;
        if (C44263l26.C25590b.m28000e(m28007b, c25591a.m27997b())) {
            c6816Qd.setFlags(c6816Qd.getFlags() | 64);
            c6816Qd.setHinting(0);
        } else if (C44263l26.C25590b.m28000e(m28007b, c25591a.m27998a())) {
            c6816Qd.getFlags();
            c6816Qd.setHinting(1);
        } else if (C44263l26.C25590b.m28000e(m28007b, c25591a.m27996c())) {
            c6816Qd.getFlags();
            c6816Qd.setHinting(0);
        } else {
            c6816Qd.getFlags();
        }
    }
}
