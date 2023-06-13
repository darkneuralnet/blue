package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC34649Mz3;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aQ\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aQ\u0010\u0012\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0016\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0016\u0010\u0019\u001a\u00020\u0018*\u00020\u0014H\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u0016\u0010\u001b\u001a\u00020\u0015*\u00020\u001aH\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0016\u0010\u001d\u001a\u00020\u0018*\u00020\u001aH\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001c\u001a\f\u0010\u001f\u001a\u00020\u001e*\u00020\u001aH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"LI61;", "LMz3;", "outline", "Lpm0;", "color", "", "alpha", "LJ61;", "style", "Lsm0;", "colorFilter", "LLW;", "blendMode", "", DateTokenConverter.CONVERTER_KEY, "(LI61;LMz3;JFLJ61;Lsm0;I)V", "La30;", "brush", "b", "(LI61;LMz3;La30;FLJ61;Lsm0;I)V", "LOs4;", "LCe3;", "i", "(LOs4;)J", "LxB5;", "g", "LWb5;", "j", "(LWb5;)J", "h", "", "f", "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,307:1\n245#1,16:308\n245#1,16:324\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n155#1:308,16\n195#1:324,16\n*E\n"})
/* renamed from: Nz3 */
/* loaded from: classes.dex */
public final class C34883Nz3 {
    /* renamed from: b */
    public static final void m93035b(I61 drawOutline, AbstractC34649Mz3 outline, AbstractC37727a30 brush, float f, J61 style, C48841sm0 c48841sm0, int i) {
        InterfaceC39067cJ3 m94528a;
        Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        if (outline instanceof AbstractC34649Mz3.C5446b) {
            C35055Os4 m94527a = ((AbstractC34649Mz3.C5446b) outline).m94527a();
            drawOutline.mo20743m0(brush, m93028i(m94527a), m93030g(m94527a), f, style, c48841sm0, i);
            return;
        }
        if (outline instanceof AbstractC34649Mz3.C5447c) {
            AbstractC34649Mz3.C5447c c5447c = (AbstractC34649Mz3.C5447c) outline;
            m94528a = c5447c.m94525b();
            if (m94528a == null) {
                C36775Wb5 m94526a = c5447c.m94526a();
                drawOutline.mo20755R(brush, m93027j(m94526a), m93029h(m94526a), MC0.m95598b(LC0.m97601d(m94526a.m78158b()), 0.0f, 2, null), f, style, c48841sm0, i);
                return;
            }
        } else if (outline instanceof AbstractC34649Mz3.C5445a) {
            m94528a = ((AbstractC34649Mz3.C5445a) outline).m94528a();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        drawOutline.mo20745j0(m94528a, brush, f, style, c48841sm0, i);
    }

    /* renamed from: c */
    public static /* synthetic */ void m93034c(I61 i61, AbstractC34649Mz3 abstractC34649Mz3, AbstractC37727a30 abstractC37727a30, float f, J61 j61, C48841sm0 c48841sm0, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            j61 = C52982zl1.f122162a;
        }
        J61 j612 = j61;
        if ((i2 & 16) != 0) {
            c48841sm0 = null;
        }
        C48841sm0 c48841sm02 = c48841sm0;
        if ((i2 & 32) != 0) {
            i = I61.f14524O.m102944a();
        }
        m93035b(i61, abstractC34649Mz3, abstractC37727a30, f2, j612, c48841sm02, i);
    }

    /* renamed from: d */
    public static final void m93033d(I61 drawOutline, AbstractC34649Mz3 outline, long j, float f, J61 style, C48841sm0 c48841sm0, int i) {
        InterfaceC39067cJ3 m94528a;
        Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(style, "style");
        if (outline instanceof AbstractC34649Mz3.C5446b) {
            C35055Os4 m94527a = ((AbstractC34649Mz3.C5446b) outline).m94527a();
            drawOutline.mo20744k0(j, m93028i(m94527a), m93030g(m94527a), f, style, c48841sm0, i);
            return;
        }
        if (outline instanceof AbstractC34649Mz3.C5447c) {
            AbstractC34649Mz3.C5447c c5447c = (AbstractC34649Mz3.C5447c) outline;
            m94528a = c5447c.m94525b();
            if (m94528a == null) {
                C36775Wb5 m94526a = c5447c.m94526a();
                drawOutline.mo20754W0(j, m93027j(m94526a), m93029h(m94526a), MC0.m95598b(LC0.m97601d(m94526a.m78158b()), 0.0f, 2, null), style, f, c48841sm0, i);
                return;
            }
        } else if (outline instanceof AbstractC34649Mz3.C5445a) {
            m94528a = ((AbstractC34649Mz3.C5445a) outline).m94528a();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        drawOutline.mo20753Z(m94528a, j, f, style, c48841sm0, i);
    }

    /* renamed from: e */
    public static /* synthetic */ void m93032e(I61 i61, AbstractC34649Mz3 abstractC34649Mz3, long j, float f, J61 j61, C48841sm0 c48841sm0, int i, int i2, Object obj) {
        float f2;
        C52982zl1 c52982zl1;
        C48841sm0 c48841sm02;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            c52982zl1 = C52982zl1.f122162a;
        } else {
            c52982zl1 = j61;
        }
        if ((i2 & 16) != 0) {
            c48841sm02 = null;
        } else {
            c48841sm02 = c48841sm0;
        }
        if ((i2 & 32) != 0) {
            i3 = I61.f14524O.m102944a();
        } else {
            i3 = i;
        }
        m93033d(i61, abstractC34649Mz3, j, f2, c52982zl1, c48841sm02, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a0 A[ADDED_TO_REGION] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m93031f(C36775Wb5 c36775Wb5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (LC0.m97601d(c36775Wb5.m78158b()) == LC0.m97601d(c36775Wb5.m78157c())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (LC0.m97601d(c36775Wb5.m78157c()) == LC0.m97601d(c36775Wb5.m78151i())) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                if (LC0.m97601d(c36775Wb5.m78151i()) == LC0.m97601d(c36775Wb5.m78152h())) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    z2 = true;
                    if (LC0.m97600e(c36775Wb5.m78158b()) != LC0.m97600e(c36775Wb5.m78157c())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (LC0.m97600e(c36775Wb5.m78157c()) == LC0.m97600e(c36775Wb5.m78151i())) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (LC0.m97600e(c36775Wb5.m78151i()) == LC0.m97600e(c36775Wb5.m78152h())) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                z4 = true;
                                if (!z2 && z4) {
                                    return true;
                                }
                                return false;
                            }
                        }
                    }
                    z4 = false;
                    if (!z2) {
                    }
                    return false;
                }
            }
        }
        z2 = false;
        if (LC0.m97600e(c36775Wb5.m78158b()) != LC0.m97600e(c36775Wb5.m78157c())) {
        }
        if (z3) {
        }
        z4 = false;
        if (!z2) {
        }
        return false;
    }

    /* renamed from: g */
    public static final long m93030g(C35055Os4 c35055Os4) {
        return CB5.m112663a(c35055Os4.m91252o(), c35055Os4.m91259h());
    }

    /* renamed from: h */
    public static final long m93029h(C36775Wb5 c36775Wb5) {
        return CB5.m112663a(c36775Wb5.m78150j(), c36775Wb5.m78156d());
    }

    /* renamed from: i */
    public static final long m93028i(C35055Os4 c35055Os4) {
        return C33056Ge3.m104938a(c35055Os4.m91258i(), c35055Os4.m91255l());
    }

    /* renamed from: j */
    public static final long m93027j(C36775Wb5 c36775Wb5) {
        return C33056Ge3.m104938a(c36775Wb5.m78155e(), c36775Wb5.m78153g());
    }
}
